package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0WhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC830080WhK {
    public static final Pattern LJII = PatternProtector.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    public static final Pattern LJIIIIZZ = PatternProtector.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    public static final Pattern LJIIIZ = PatternProtector.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    public static final Logger LJIIJ = Logger.getLogger(AbstractC830080WhK.class.getName());
    public final int LIZIZ;
    public volatile ServerSocket LIZJ;
    public BPEAThread LJ;
    public final C830170WhT LIZLLL = new Object() { // from class: X.0WhT
    };
    public final String LIZ = null;
    public final C830180WhU LJI = new Object() { // from class: X.0WhU
    };
    public final C0WYI LJFF = new C0WYI();

    public final void LJ() throws IOException {
        getClass();
        this.LIZJ = new ServerSocket();
        this.LIZJ.setReuseAddress(true);
        RunnableC830120WhO runnableC830120WhO = new RunnableC830120WhO(this);
        BPEAThread bPEAThread = new BPEAThread(runnableC830120WhO);
        this.LJ = bPEAThread;
        bPEAThread.setDaemon(true);
        ThreadMethodProxy.setName(this.LJ, "NanoHttpd Main Listener");
        this.LJ.start();
        while (!runnableC830120WhO.LLILLL && runnableC830120WhO.LLILLJJLI == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        IOException iOException = runnableC830120WhO.LLILLJJLI;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void LJFF() {
        try {
            LIZJ(this.LIZJ);
            C0WYI c0wyi = this.LJFF;
            c0wyi.getClass();
            for (RunnableC830100WhM runnableC830100WhM : new ArrayList(c0wyi.LIZIZ)) {
                LIZJ(runnableC830100WhM.LL);
                LIZJ(runnableC830100WhM.LLILLJJLI);
            }
            BPEAThread bPEAThread = this.LJ;
            if (bPEAThread != null) {
                ThreadMethodProxy.join(bPEAThread);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIJ.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0WhT] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0WhU] */
    public AbstractC830080WhK(int i) {
        this.LIZIZ = i;
    }

    public static String LIZ(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIJ.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static final void LIZJ(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (obj instanceof ServerSocket) {
                        ((ServerSocket) obj).close();
                        return;
                    }
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                LJIIJ.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public static boolean LJI(C830090WhL c830090WhL) {
        String str = c830090WhL.LLILLJJLI;
        if (str != null) {
            if (str.toLowerCase().contains("text/") || c830090WhL.LLILLJJLI.toLowerCase().contains("/json")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C830090WhL LIZLLL(InterfaceC824480WVy interfaceC824480WVy) {
        HashMap map = new HashMap();
        C830070WhJ c830070WhJ = (C830070WhJ) interfaceC824480WVy;
        EnumC830230WhZ enumC830230WhZ = c830070WhJ.LJI;
        if (EnumC830230WhZ.PUT.equals(enumC830230WhZ) || EnumC830230WhZ.POST.equals(enumC830230WhZ)) {
            try {
                ((C830070WhJ) interfaceC824480WVy).LJII(map);
            } catch (C830160WhS e) {
                TryCatchGuardChecker.doCheck(e);
                return LIZIZ(e.getStatus(), "text/plain", e.getMessage());
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                EnumC2273771DzD enumC2273771DzD = EnumC2273771DzD.INTERNAL_ERROR;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SERVER INTERNAL ERROR: IOException: ");
                sbLIZ.append(e2.getMessage());
                return LIZIZ(enumC2273771DzD, "text/plain", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        ((HashMap) c830070WhJ.LJI()).put("NanoHttpd.QUERY_STRING", c830070WhJ.LJIIJ);
        return LIZIZ(EnumC2273771DzD.NOT_FOUND, "text/plain", "Not Found");
    }

    public static C830090WhL LIZIZ(C0WXS c0wxs, String str, String str2) {
        byte[] bytes;
        C830140WhQ c830140WhQ = new C830140WhQ(str);
        if (str2 == null) {
            return new C830090WhL(c0wxs, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(c830140WhQ.LIZ()).newEncoder().canEncode(str2) && c830140WhQ.LIZJ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("; charset=UTF-8");
                c830140WhQ = new C830140WhQ(C2188811AlT.LIZIZ(sbLIZ));
            }
            bytes = str2.getBytes(c830140WhQ.LIZ());
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIJ.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return new C830090WhL(c0wxs, c830140WhQ.LIZ, new ByteArrayInputStream(bytes), bytes.length);
    }
}
