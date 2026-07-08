package X;

import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844720XBu implements Handler.Callback {
    public static final C844820XCe LLJILLL = new AbstractC824140WUq<C588280N5m>() { // from class: X.0XCe
        @Override // X.AbstractC824140WUq
        public final C588280N5m LIZ(Object[] objArr) {
            return new C588280N5m((Context) objArr[0]);
        }
    };
    public final C844770XBz LL;
    public final C0XBM LLILLJJLI;
    public final BPEAHandler LLILLL;
    public final C0XD7 LLILZ;
    public C844630XBl LLILZIL;
    public final AtomicBoolean LLILZLL;
    public C844730XBv LLIZ;
    public C844740XBw LLIZLLLIL;
    public C0XC0 LLJ;
    public long LLJI;
    public C0XCK LLJIJIL;
    public int LLJILJIL;
    public C0XC8 LLJILJILJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0XCs] */
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
    public final void LJ() {
        InterfaceC844860XCi interfaceC844860XCi;
        C0XCI c0xci = C0XCJ.LIZIZ;
        InterfaceC844780XCa interfaceC844780XCa = c0xci.LJIIIZ;
        if (interfaceC844780XCa == null || !interfaceC844780XCa.LIZJ("enable_zti").booleanValue() || (interfaceC844860XCi = c0xci.LJIIJ) == 0) {
            return;
        }
        interfaceC844860XCi.LIZLLL(new Function0() { // from class: X.0XCs
            public final /* synthetic */ String LLILLJJLI = "normal";
            public final /* synthetic */ String LLILLL = "";

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.LL.LIZJ(this.LLILLJJLI, this.LLILLL);
                return Unit.LIZ;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0XCT] */
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
    public final void LIZ(final C844740XBw c844740XBw) {
        Boolean boolLIZJ;
        C0XCI c0xci = C0XCJ.LIZIZ;
        InterfaceC844780XCa interfaceC844780XCa = c0xci.LJIIIZ;
        if (interfaceC844780XCa == null) {
            boolLIZJ = Boolean.FALSE;
        } else {
            boolLIZJ = interfaceC844780XCa.LIZJ("enable_use_new_thread_for_active");
        }
        if (boolLIZJ.booleanValue()) {
            InterfaceC844860XCi interfaceC844860XCi = c0xci.LJIIJ;
            if (interfaceC844860XCi != 0) {
                interfaceC844860XCi.LIZIZ(new Function0() { // from class: X.0XCT
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C844720XBu c844720XBu = this.LL;
                        C844740XBw c844740XBw2 = c844740XBw;
                        c844720XBu.getClass();
                        C844830XCf.LIZ("dispatcher#activeImmediately");
                        c844720XBu.LLILZLL.set(true);
                        C824170WUt.LJ(new ARunnableS82S0200000_13(c844740XBw2, c844720XBu, 91), c844720XBu.LL.LIZ());
                        return Unit.LIZ;
                    }
                });
                return;
            }
            return;
        }
        C844830XCf.LIZ("dispatcher#activeImmediately");
        this.LLILZLL.set(true);
        C844740XBw c844740XBw2 = this.LLIZLLLIL;
        if (c844740XBw2 != null) {
            c844740XBw2.LJFF = true;
            this.LLILLL.removeMessages(1235, c844740XBw2);
        }
        this.LLIZLLLIL = c844740XBw;
        LJIIIIZZ(c844740XBw, false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1234) {
            if (i == 1235) {
                C0XC4 c0xc4 = (C0XC4) HandlerHook.getMessageObj(message.obj);
                boolean zLJI = MethodIDManager.LJI(71880);
                if (this.LL.LJJIFFI && !((C0XCO) this.LLILZ).LLILLJJLI) {
                    BPEAHandler bPEAHandler = this.LLILLL;
                    Message messageObtainMessage = bPEAHandler.obtainMessage(1235, c0xc4);
                    c0xc4.getClass();
                    C786410Ut5.LJLJLJ(bPEAHandler, messageObtainMessage, 60000L);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                } else {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    if (!c0xc4.LJFF) {
                        C824170WUt.LJFF(new C0XC6(this, c0xc4), String.valueOf(this.LL.LIZ));
                        return false;
                    }
                }
            }
            return false;
        }
        LJII(this.LLILZIL, ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue(), false);
        return false;
    }

    public static void LIZLLL(C844890XCl c844890XCl, C0XC4 c0xc4) {
        if (c0xc4 != null) {
            if (c844890XCl.LIZ) {
                c0xc4.LJIIIIZZ(c844890XCl.LIZLLL);
                c0xc4.LJII(c844890XCl.LIZ);
                c0xc4.LIZ();
            } else {
                if (c844890XCl.LIZIZ != 4) {
                    return;
                }
                c0xc4.LJIIIIZZ(c844890XCl.LIZLLL);
                c0xc4.LJII(c844890XCl.LIZ);
                c0xc4.LIZ();
            }
        }
    }

    public static void LJFF(C844720XBu c844720XBu, String str) {
        int i;
        c844720XBu.getClass();
        InterfaceC844780XCa interfaceC844780XCa = C0XCJ.LIZIZ.LJIIIZ;
        if (interfaceC844780XCa != null && interfaceC844780XCa.LIZJ("enable_zti").booleanValue() && interfaceC844780XCa.LIZJ("enable_reset_did").booleanValue() && TextUtils.equals(str, "device_error") && (i = c844720XBu.LLJILJIL) < 1) {
            c844720XBu.LLJILJIL = i + 1;
            c844720XBu.LJI(c844720XBu.LLILZIL, true, false, true);
        }
    }

    public final boolean LIZIZ(C844630XBl c844630XBl, boolean z) {
        if (this.LLILZIL.equals(c844630XBl)) {
            return false;
        }
        this.LLILZIL = c844630XBl;
        C0XBM c0xbm = this.LLILLJJLI;
        c0xbm.LIZLLL = c844630XBl;
        c0xbm.LJIIIZ = c0xbm.LIZ(c0xbm.LJ, c844630XBl);
        C0XBF.LIZ(c0xbm.LJ, c844630XBl, c0xbm.LJFF);
        synchronized (c0xbm.LIZ) {
            try {
                c0xbm.LIZ.put(C0XBJ.class, new C0XBJ(c0xbm.LJFF, c844630XBl));
                c0xbm.LIZ.put(C0XBG.class, new C0XBG(c844630XBl, c0xbm.LJFF));
                c0xbm.LIZ.put(C844750XBx.class, new C844750XBx(c0xbm.LJ, c844630XBl, c0xbm.LJFF));
                c0xbm.LIZ.put(C0XB7.class, new C0XB7(c0xbm.LJFF));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        SharedPreferences sharedPreferencesLIZ = c844630XBl.LIZ(c0xbm.LJFF);
        if (sharedPreferencesLIZ != null) {
            sharedPreferencesLIZ.edit().putLong("register_time", 0L).apply();
        }
        if (z) {
            c0xbm.LJ();
            C0XCK c0xck = c0xbm.LJIILIIL;
            if (c0xck != null) {
                c0xck.LIZ(new C844690XBr(c0xbm.LJIIIIZZ));
            }
            c0xbm.LJI();
            return true;
        }
        return true;
    }

    public final void LIZJ(String str, String str2) {
        if (C0XCJ.LIZIZ.LJIIIZ.LIZJ("enable_use_new_thread").booleanValue()) {
            if (this.LLJILJILJ == null) {
                this.LLJILJILJ = new C0XC8(this.LL, this.LLILZ, this.LLILZIL);
            }
            C0XC8 c0xc8 = this.LLJILJILJ;
            C0XDG c0xdg = new C0XDG() { // from class: X.0XCu
                @Override // X.C0XDG
                public final void LIZ(String str3) {
                    C844720XBu.LJFF(this.LIZ, str3);
                }
            };
            c0xc8.getClass();
            C844830XCf.LIZ("InternalDispatcher#desigh");
            C0XC0 c0xc0 = c0xc8.LLILZIL;
            if (c0xc0 != null) {
                c0xc0.LJFF = true;
                c0xc8.LLILLJJLI.removeMessages(1236, c0xc0);
            }
            C0XC0 c0xc02 = new C0XC0(c0xc8.LL, c0xc8.LLILZ, c0xdg);
            c0xc8.LLILZIL = c0xc02;
            c0xc02.LJIIJJI = str;
            c0xc02.LJIIJ = str2;
            BPEAHandler bPEAHandler = c0xc8.LLILLJJLI;
            if (bPEAHandler != null) {
                bPEAHandler.removeMessages(1236, c0xc02);
                BPEAHandler bPEAHandler2 = c0xc8.LLILLJJLI;
                c0xc02.LIZLLL = 0L;
                C786410Ut5.LJLJJL(c0xc8.LLILLJJLI, bPEAHandler2.obtainMessage(1236, c0xc02));
                return;
            }
            return;
        }
        C844830XCf.LIZ("dispatcher#desigh");
        C0XC0 c0xc03 = this.LLJ;
        if (c0xc03 != null) {
            c0xc03.LJFF = true;
            this.LLILLL.removeMessages(1235, c0xc03);
        }
        C0XC0 c0xc04 = new C0XC0(this.LL, this.LLILZIL, new C0XDG() { // from class: X.0XCu
            @Override // X.C0XDG
            public final void LIZ(String str3) {
                C844720XBu.LJFF(this.LIZ, str3);
            }
        });
        this.LLJ = c0xc04;
        c0xc04.LJIIJJI = str;
        c0xc04.LJIIJ = str2;
        LJIIIIZZ(c0xc04, false);
    }

    public final void LJIIIIZZ(C0XC4 c0xc4, boolean z) {
        BPEAHandler bPEAHandler = this.LLILLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeMessages(1235, c0xc4);
            BPEAHandler bPEAHandler2 = this.LLILLL;
            c0xc4.LIZLLL = 0L;
            Message messageObtainMessage = bPEAHandler2.obtainMessage(1235, c0xc4);
            if (z && Looper.myLooper() == this.LLILLL.getLooper()) {
                handleMessage(messageObtainMessage);
            } else {
                C786410Ut5.LJLJJL(this.LLILLL, messageObtainMessage);
            }
        }
    }

    public C844720XBu(C844770XBz c844770XBz, C0XBM c0xbm, C844630XBl c844630XBl) {
        C0XCO c0xco = C0XCJ.LIZ;
        this.LLILZLL = new AtomicBoolean(false);
        this.LLJILJIL = 0;
        this.LL = c844770XBz;
        this.LLILLJJLI = c0xbm;
        this.LLILZ = c0xco;
        this.LLILLL = new BPEAHandler(C824170WUt.LIZLLL(c844770XBz.LIZ()), this);
        this.LLILZIL = c844630XBl;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C844630XBl r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C844720XBu.LJII(X.0XBl, boolean, boolean):void");
    }

    public final boolean LJI(C844630XBl c844630XBl, boolean z, boolean z2, final boolean z3) {
        if (!LIZIZ(c844630XBl, z2) && !z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("the env is the same with before,ignore.");
            sbLIZ.append(c844630XBl);
            C844830XCf.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        this.LLILLL.removeMessages(1235);
        if (this.LLILLL.hasMessages(1234)) {
            this.LLILLL.removeMessages(1234);
            BPEAHandler bPEAHandler = this.LLILLL;
            C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(1234, Boolean.TRUE));
            return true;
        }
        final String string = this.LL.LIZJ().getString("device_id", "");
        final String string2 = this.LL.LIZJ().getString("install_id", "");
        C844730XBv c844730XBv = new C844730XBv(this.LL, this.LLILLJJLI, c844630XBl, Boolean.valueOf(z3), this.LLILZ, new C0XDH() { // from class: X.0XCC
            @Override // X.C0XDH
            public final void LIZ(boolean z4) {
                int i;
                C844720XBu c844720XBu = this.LIZ;
                boolean z5 = z3;
                String str = string;
                String str2 = string2;
                if (z4) {
                    c844720XBu.LJ();
                }
                if (!z5) {
                    c844720XBu.getClass();
                    return;
                }
                String string3 = c844720XBu.LL.LIZJ().getString("device_id", "");
                String string4 = c844720XBu.LL.LIZJ().getString("install_id", "");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trigger_from", "dsign");
                    boolean zEquals = TextUtils.equals(string3, str);
                    int i2 = 1;
                    if (zEquals) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("did_change", i);
                    if (!TextUtils.equals(string4, str2)) {
                        i2 = 0;
                    }
                    jSONObject.put("iid_change", i2);
                    ((C2210711Bfh) c844720XBu.LL.LJJII).LIZ("device_recreate_did", jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
        LJIIIIZZ(c844730XBv, false);
        this.LLIZ = c844730XBv;
        if (!this.LL.LJIILL || !this.LLILZLL.get()) {
            return true;
        }
        LIZ(new C844740XBw(this.LL, c844630XBl));
        return true;
    }
}
