package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Wire;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m14.e;
import m14.l;
import m14.m;
import okhttp3.Request;
import okio.ByteString;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498150p5Z implements WeakHandler.IHandler {
    public final Context LL;
    public final C1498170p5b LLILLJJLI;
    public C1471740oOy LLILLL;
    public C1495520p1K LLILZ;
    public Request LLILZLL;
    public boolean LLIZ;
    public final WeakHandler LLJ;
    public final C1497580p4e LLJI;
    public C0WKP LLJIJIL;
    public C1497410p4N LLJILJIL;
    public boolean LLJILJILJ;
    public final AbstractC1498210p5f LLJILLL;
    public final C1498190p5d LLJJ;
    public final JSONObject LLJJI;
    public int LLILZIL = 3;
    public final Map<String, Object> LLIZLLLIL = new ConcurrentHashMap();

    public final boolean LIZ() {
        int i;
        synchronized (this) {
            i = this.LLILZIL;
        }
        if (i == 3 || i == 2 || i == 5) {
            return true;
        }
        ((C1498160p5a) this.LLJILLL).LIZIZ();
        C1497410p4N c1497410p4N = this.LLJILJIL;
        if (c1497410p4N == null) {
            return true;
        }
        C786410Ut5.LJLJLJ(this.LLJ, this.LLJ.obtainMessage(6, c1497410p4N), 1000L);
        if (i == 4) {
            this.LLJILJIL.LIZIZ(LSPassThroughRecordSizeConfig.DEFAULT, "normal close");
            LJIIJ(6);
            return false;
        }
        this.LLJILJIL.LJIIIIZZ.LIZ(-1);
        LJIIJ(3);
        return i != 1;
    }

    public final boolean LIZLLL() {
        int i;
        synchronized (this) {
            i = this.LLILZIL;
        }
        return i == 4;
    }

    public final void LJFF() {
        C0WKP c0wkp;
        Request request = this.LLILZLL;
        if (request != null && (c0wkp = this.LLJIJIL) != null) {
            c0wkp.LIZ(request.url().LJIIIIZZ, this.LLJJI, "heatbeat timeout", 3);
        }
        Pair<String, Long> pairLIZIZ = this.LLILLL.LIZIZ(null);
        LJIIJJI();
        C1497410p4N c1497410p4N = this.LLJILJIL;
        if (c1497410p4N != null) {
            c1497410p4N.LIZ = null;
            try {
                c1497410p4N.LIZIZ(LSPassThroughRecordSizeConfig.DEFAULT, "normal close");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LJIILIIL(0L, (String) pairLIZIZ.first, true);
    }

    public final void LJIIJJI() {
        this.LLJ.removeMessages(2);
        this.LLJ.removeMessages(1);
        this.LLJ.removeMessages(3);
        this.LLJ.removeMessages(5);
        C1471740oOy c1471740oOy = this.LLILLL;
        if (c1471740oOy != null) {
            c1471740oOy.LIZLLL();
        }
        this.LLJ.removeMessages(1);
        LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0p5k] */
    public C1498150p5Z(C1498170p5b c1498170p5b) {
        WeakHandler weakHandler = new WeakHandler(Looper.myLooper(), this);
        this.LLJ = weakHandler;
        this.LLJI = new C1497580p4e(this);
        this.LLILLJJLI = c1498170p5b;
        this.LL = c1498170p5b.LIZ;
        this.LLILZ = null;
        AbstractC1498210p5f abstractC1498210p5f = c1498170p5b.LIZLLL;
        this.LLJILLL = abstractC1498210p5f;
        if (abstractC1498210p5f == null) {
            new C1498230p5h();
            this.LLJILLL = new C1498160p5a(new C1498230p5h() { // from class: X.0p5k
            });
        }
        this.LLJILLL.LIZ(new C1498240p5i(this), weakHandler);
        this.LLJJ = new C1498190p5d(new C1498250p5j(this), weakHandler);
        this.LLJJI = new JSONObject();
    }

    public final String LIZIZ(String str) throws Exception {
        if (!((ArrayList) l.LJ().LIZLLL).isEmpty()) {
            e eVarLIZ = l.LJ().LIZ(new m(str, "GET"));
            if (eVarLIZ != null && !str.equals(eVarLIZ.LIZ)) {
                if (eVarLIZ.LIZ.isEmpty() && !((ArrayList) eVarLIZ.LIZIZ).isEmpty()) {
                    throw new Exception("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555 ");
                }
                if (C2088908Gh.LIZ(eVarLIZ.LIZ)) {
                    LJI(str, eVarLIZ.LIZ);
                    return eVarLIZ.LIZ;
                }
            }
        } else {
            String strLIZLLL = l.LJ().LIZLLL(str);
            if (!str.equals(strLIZLLL) && C2088908Gh.LIZ(strLIZLLL)) {
                LJI(str, strLIZLLL);
                return strLIZLLL;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r16) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1498150p5Z.LIZJ(java.lang.String):void");
    }

    public final void LJII(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LLJ, runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final boolean LJIIIIZZ(byte[] bArr) {
        int i;
        ByteString byteStringOf = ByteString.of(bArr);
        if (this.LLJILJIL == null) {
            return false;
        }
        synchronized (this) {
            i = this.LLILZIL;
        }
        if (i != 4) {
            return false;
        }
        if (byteStringOf instanceof String) {
            return this.LLJILJIL.LIZ((String) byteStringOf);
        }
        if (!(byteStringOf instanceof ByteString)) {
            return false;
        }
        C1497410p4N c1497410p4N = this.LLJILJIL;
        if (byteStringOf != 0) {
            return c1497410p4N.LJIIIZ(byteStringOf, 2);
        }
        c1497410p4N.getClass();
        throw new NullPointerException("bytes == null");
    }

    public final void LJIIIZ(byte[] bArr) {
        Frame frameDecode = Frame.ADAPTER.decode(bArr);
        List list = (List) Wire.get(frameDecode.headers, Collections.emptyList());
        if (list != null && list.size() > 0) {
            Iterator it2 = list.iterator();
            boolean z = false;
            String str = null;
            while (true) {
                if (it2.hasNext()) {
                    C1516580pZI c1516580pZI = (C1516580pZI) it2.next();
                    if (c1516580pZI.key.equals("need_ack") && c1516580pZI.value.equals("1")) {
                        z = true;
                    } else {
                        if (c1516580pZI.key.equals("x_frontier_msgid") && !TextUtils.isEmpty(c1516580pZI.value)) {
                            str = c1516580pZI.value;
                        }
                        if (z && !TextUtils.isEmpty(str)) {
                            break;
                        }
                    }
                } else if (!z) {
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            C1516560pZG c1516560pZG = new C1516560pZG();
            c1516560pZG.LIZLLL = "is_ack";
            c1516560pZG.LJ = "1";
            arrayList.add(c1516560pZG.build());
            C1516560pZG c1516560pZG2 = new C1516560pZG();
            c1516560pZG2.LIZLLL = "ack_id";
            c1516560pZG2.LJ = (String) Wire.get(frameDecode.logidnew, "");
            arrayList.add(c1516560pZG2.build());
            C1516560pZG c1516560pZG3 = new C1516560pZG();
            c1516560pZG3.LIZLLL = "ack_code";
            c1516560pZG3.LJ = CardStruct.IStatusCode.DEFAULT;
            arrayList.add(c1516560pZG3.build());
            if (!TextUtils.isEmpty(str)) {
                C1516560pZG c1516560pZG4 = new C1516560pZG();
                c1516560pZG4.LIZLLL = "x_frontier_msgid";
                c1516560pZG4.LJ = str;
                arrayList.add(c1516560pZG4.build());
            }
            C1516550pZF c1516550pZF = new C1516550pZF();
            c1516550pZF.LIZLLL = (Long) Wire.get(frameDecode.seqid, Frame.DEFAULT_SEQID);
            c1516550pZF.LJ = (Long) Wire.get(frameDecode.logid, Frame.DEFAULT_LOGID);
            c1516550pZF.LJFF = (Integer) Wire.get(frameDecode.service, Frame.DEFAULT_SERVICE);
            c1516550pZF.LJI = (Integer) Wire.get(frameDecode.method, Frame.DEFAULT_METHOD);
            c1516550pZF.LJIIJJI = (String) Wire.get(frameDecode.logidnew, "");
            C1516540pZE.LIZ(arrayList);
            c1516550pZF.LJII = arrayList;
            LJIIIIZZ(Frame.ADAPTER.encode(c1516550pZF.build()));
        }
    }

    public final synchronized void LJIIJ(int i) {
        this.LLILZIL = i;
        if (i == 1 || i == 2 || i == 3 || i != 4) {
        }
    }

    public final void LJIIL(String str) {
        int i;
        if (!C806890Vl1.LIZJ(this.LL)) {
            LJ(1, str, "network error", true);
            return;
        }
        synchronized (this) {
            i = this.LLILZIL;
        }
        if (i != 4 && i != 1) {
            try {
                LIZJ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (this.LLJIJIL != null) {
                    this.LLJIJIL.LIZ(str, this.LLJJI, Log.getStackTraceString(th), 4);
                }
                if ("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555 ".equals(th.getMessage())) {
                    String strLIZ = this.LLILLL.LIZ();
                    if (!TextUtils.isEmpty(strLIZ)) {
                        LJIILIIL(0L, strLIZ, true);
                    } else {
                        this.LLILLL.LIZLLL();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        EnumC587400N2c enumC587400N2c;
        int i;
        if (message == null) {
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            synchronized (this) {
                i = this.LLILZIL;
            }
            if (i == 4) {
                return;
            }
            this.LLJ.removeMessages(1);
            this.LLJ.removeMessages(2);
            LJIIL((String) HandlerHook.getMessageObj(message.obj));
            return;
        }
        if (i2 == 2) {
            try {
                this.LLJ.removeMessages(2);
                this.LLJ.removeMessages(1);
                this.LLILLJJLI.LIZIZ = (List) HandlerHook.getMessageObj(message.obj);
                this.LLIZ = false;
                C1498170p5b c1498170p5b = this.LLILLJJLI;
                C1471740oOy c1471740oOy = new C1471740oOy(c1498170p5b.LIZIZ, c1498170p5b.LIZJ);
                this.LLILLL = c1471740oOy;
                c1471740oOy.LIZLLL();
                this.LLJ.removeMessages(1);
                LJIIL(this.LLILLL.LIZJ());
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (i2 == 3) {
            this.LLJ.removeMessages(2);
            this.LLJ.removeMessages(1);
            if (LIZLLL()) {
                return;
            }
            C1471740oOy c1471740oOy2 = this.LLILLL;
            if (c1471740oOy2 != null) {
                c1471740oOy2.LIZLLL();
            }
            this.LLJ.removeMessages(1);
            if (C806890Vl1.LIZJ(this.LL)) {
                if (LIZ()) {
                    C1471740oOy c1471740oOy3 = this.LLILLL;
                    if (c1471740oOy3 == null) {
                        return;
                    }
                    LJIIL(c1471740oOy3.LIZJ());
                    return;
                }
                this.LLJILJILJ = true;
                return;
            }
            return;
        }
        if (i2 == 5) {
            if (((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue()) {
                enumC587400N2c = EnumC587400N2c.STATE_FOREGROUND;
            } else {
                enumC587400N2c = EnumC587400N2c.STATE_BACKGROUND;
            }
            C1498190p5d c1498190p5d = this.LLJJ;
            if (!c1498190p5d.LIZIZ.get() && c1498190p5d.LIZ == EnumC587400N2c.STATE_BACKGROUND && enumC587400N2c == EnumC587400N2c.STATE_FOREGROUND) {
                try {
                    C1497410p4N c1497410p4N = c1498190p5d.LIZJ;
                    if (c1497410p4N != null) {
                        C822660WOy c822660WOy = c1497410p4N.LJIIJJI;
                        if (c822660WOy != null) {
                            c822660WOy.execute(new RunnableC1497470p4T(c1497410p4N));
                        }
                        c1498190p5d.LIZIZ.set(true);
                        c1498190p5d.LJ.removeCallbacks(c1498190p5d.LJFF);
                        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, c1498190p5d.LJ, c1498190p5d.LJFF);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c1498190p5d.LIZ = enumC587400N2c;
            this.LLJILLL.getClass();
            return;
        }
        if (i2 == 7) {
            try {
                this.LLJ.removeMessages(2);
                this.LLJ.removeMessages(1);
                this.LLILLJJLI.LIZIZ = (List) HandlerHook.getMessageObj(message.obj);
                this.LLIZ = false;
                C1498170p5b c1498170p5b2 = this.LLILLJJLI;
                C1471740oOy c1471740oOy4 = new C1471740oOy(c1498170p5b2.LIZIZ, c1498170p5b2.LIZJ);
                this.LLILLL = c1471740oOy4;
                c1471740oOy4.LIZLLL();
                this.LLJ.removeMessages(1);
                if (LIZ()) {
                    LJIIL(this.LLILLL.LIZJ());
                } else {
                    this.LLJILJILJ = true;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final void LJI(String str, String str2) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        try {
            this.LLJJI.put("origin_host", C2088908Gh.LJ(str).getHost());
            this.LLJJI.put("final_host", C2088908Gh.LJ(str2).getHost());
            this.LLJJI.put("lib", "okhttp");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIILIIL(long j, String str, boolean z) {
        this.LLJ.removeMessages(1);
        if (!C806890Vl1.LIZJ(this.LL)) {
            LJ(1, str, "network error", z);
            return;
        }
        if (this.LLIZ) {
            return;
        }
        if (j != -1 && !C2093608Ic.LJ(str)) {
            LJIIJ(5);
        } else {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("method", "tryReconnect", bundle);
            bundle.putLong("interval", j);
            LJ(2, str, "retry failed", z);
            str = this.LLILLL.LIZJ();
        }
        Message message = new Message();
        message.what = 1;
        message.obj = str;
        C786410Ut5.LJLJLJ(this.LLJ, message, j);
    }

    public final void LJ(int i, String str, String str2, boolean z) {
        LJIIJ(2);
        C1471740oOy c1471740oOy = this.LLILLL;
        if (c1471740oOy != null) {
            c1471740oOy.LIZLLL();
        }
        C0WKP c0wkp = this.LLJIJIL;
        if (c0wkp != null && z) {
            c0wkp.LIZ(str, this.LLJJI, str2, i);
        }
    }
}
