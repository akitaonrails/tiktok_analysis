package X;

import Y.ARunnableS132S0100000_32;
import android.util.Base64;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.worker.JsWorker;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.18fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21344518fz implements InterfaceC21344718g1 {
    public static volatile C21345018g4 LJII;
    public volatile InterfaceC21345918gD LIZ;
    public final String LIZIZ;
    public final JsWorker LIZJ;
    public final String LIZLLL;
    public final C21344918g3 LJ;
    public final C21346618gK LJFF;
    public final List<InterfaceC21344718g1> LJI;

    public final int hashCode() {
        return Objects.hash(this.LIZIZ, this.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.18g9, X.18gK] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C21344518fz(JsWorker jsWorker) {
        String str;
        if (LJII == null) {
            LJII = new C21345018g4();
            C21345018g4 c21345018g4 = LJII;
            c21345018g4.getClass();
            new BPEAThread(new ARunnableS132S0100000_32(c21345018g4, 61)).start();
        }
        this.LJI = new LinkedList();
        if (jsWorker.EngineType() == JsWorker.EngineType.V8) {
            str = "V8";
        } else {
            str = "QuickJS";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VMSDK_JSWorker_");
        sbLIZ.append(str);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("/inspector/");
        sbLIZ2.append(jsWorker.getNativePtr());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LIZLLL = strLIZIZ;
        this.LIZJ = jsWorker;
        C21344918g3 c21344918g3 = new C21344918g3(strLIZIZ);
        this.LJ = c21344918g3;
        final C21344818g2 c21344818g2 = new C21344818g2(this);
        ?? r4 = new InterfaceC21345518g9(c21344818g2) { // from class: X.18gK
            public final InterfaceC21345818gC LIZ;

            {
                this.LIZ = c21344818g2;
            }

            public static String LIZIZ(C21347518gT c21347518gT, String str2) {
                int size = c21347518gT.LIZ.size();
                for (int i = 0; i < size; i++) {
                    if (str2.equals(ListProtector.get(c21347518gT.LIZ, i))) {
                        return (String) ListProtector.get(c21347518gT.LIZIZ, i);
                    }
                }
                return null;
            }

            @Override // X.InterfaceC21345518g9
            public final boolean LIZ(C21345418g8 c21345418g8, C21347318gR c21347318gR, C21347218gQ c21347218gQ) throws IOException {
                if ("websocket".equalsIgnoreCase(LIZIZ(c21347318gR, "Upgrade")) && "Upgrade".equals(LIZIZ(c21347318gR, "Connection")) && "13".equals(LIZIZ(c21347318gR, "Sec-WebSocket-Version"))) {
                    c21347218gQ.LIZJ = 101;
                    c21347218gQ.LIZLLL = "Switching Protocols";
                    c21347218gQ.LIZ("Upgrade", "websocket");
                    c21347218gQ.LIZ("Connection", "Upgrade");
                    c21347218gQ.LJ = null;
                    String strLIZIZ2 = LIZIZ(c21347318gR, "Sec-WebSocket-Key");
                    if (strLIZIZ2 != null) {
                        try {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ2);
                            sbLIZ3.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                            messageDigest.update(C08GQ.LIZ(strLIZIZ3));
                            c21347218gQ.LIZ("Sec-WebSocket-Accept", Base64.encodeToString(messageDigest.digest(), 2));
                        } catch (NoSuchAlgorithmException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new RuntimeException(e);
                        }
                    }
                    C2479109nZ c2479109nZLIZ = c21345418g8.LIZIZ.LIZ();
                    OutputStream outputStream = c21345418g8.LIZ.getOutputStream();
                    C21346718gL.LIZIZ(c21347218gQ, new C21347618gU(new BufferedOutputStream(outputStream)));
                    C21346818gM c21346818gM = new C21346818gM(c2479109nZLIZ, outputStream, this.LIZ);
                    if (!c21346818gM.LIZLLL.getAndSet(true)) {
                        ((C21344818g2) c21346818gM.LIZJ).LIZ.LIZ(c21346818gM);
                    }
                    try {
                        c21346818gM.LIZ.LIZ(c21346818gM.LJFF);
                        return false;
                    } catch (EOFException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        c21346818gM.LIZIZ();
                        return false;
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        c21346818gM.LIZIZ();
                        throw e3;
                    }
                }
                c21347218gQ.LIZJ = 501;
                c21347218gQ.LIZLLL = "Not Implemented";
                c21347218gQ.LJ = AbstractC21348018gY.LIZ("Not a supported WebSocket upgrade request\n", "text/plain");
                return true;
            }
        };
        this.LJFF = r4;
        C21345018g4 c21345018g42 = LJII;
        C21345218g6 c21345218g6 = c21345018g42.LIZLLL;
        synchronized (c21345218g6.LIZIZ) {
            try {
                if (!((ArrayList) c21345218g6.LIZIZ).contains(this)) {
                    ((ArrayList) c21345218g6.LIZIZ).add(this);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c21345018g42.LJ.LIZ(c21344918g3, r4);
    }

    @Override // X.InterfaceC21344718g1
    public final void LIZ(C21346818gM c21346818gM) {
        this.LIZ = c21346818gM;
        Iterator<InterfaceC21344718g1> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c21346818gM);
        }
        this.LIZJ.onOpenInspectorSession();
    }

    @Override // X.InterfaceC21344718g1
    public final void LIZIZ(InterfaceC21345918gD interfaceC21345918gD) {
        this.LIZ = null;
        this.LIZJ.onCloseInspectorSession();
        Iterator<InterfaceC21344718g1> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(interfaceC21345918gD);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21344518fz.class != obj.getClass()) {
            return false;
        }
        C21344518fz c21344518fz = (C21344518fz) obj;
        if (Objects.equals(this.LIZIZ, c21344518fz.LIZIZ) && Objects.equals(this.LIZLLL, c21344518fz.LIZLLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC21344718g1
    public final boolean LIZJ(C21346818gM c21346818gM, String str) {
        Iterator<InterfaceC21344718g1> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZJ(c21346818gM, str)) {
                return true;
            }
        }
        this.LIZJ.onInspectorMessage(str);
        return false;
    }
}
