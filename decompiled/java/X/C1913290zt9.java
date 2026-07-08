package X;

import Y.ARunnableS2S2110000_28;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.main.AccountMainActivityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913290zt9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AccountMainActivityAssem LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1913290zt9(AccountMainActivityAssem accountMainActivityAssem, String str, String str2, C19EG c19eg, boolean z, String str3, String str4, String str5, boolean z2, boolean z3) {
        super(0);
        this.LL = accountMainActivityAssem;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c19eg;
        this.LLILZIL = z;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = z2;
        this.LLJI = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("switch_account_tooltip_rollback_to_dismiss_listener_android", false)) {
            BPEAHandler bPEAHandler = new BPEAHandler();
            final AccountMainActivityAssem accountMainActivityAssem = this.LL;
            final String str = this.LLILLJJLI;
            final String str2 = this.LLILLL;
            final C19EG c19eg = this.LLILZ;
            final boolean z = this.LLILZIL;
            final String str3 = this.LLILZLL;
            final String str4 = this.LLIZ;
            final String str5 = this.LLIZLLLIL;
            final boolean z2 = this.LLJ;
            final boolean z3 = this.LLJI;
            C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0ztA
                public final void LIZ() {
                    C1913320ztC c1913320ztC = new C1913320ztC(accountMainActivityAssem, c19eg, z, str3, str4);
                    accountMainActivityAssem.getClass();
                    C1389890mGx c1389890mGxM155do = AccountMainActivityAssem.m155do(c19eg, str5, z2, z3);
                    c1389890mGxM155do.LIZJ(c1913320ztC);
                    c1389890mGxM155do.LJIIJJI();
                    C757860To8.LIZ.getClass();
                    C757860To8.LIZLLL = true;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("enter_method", str2);
                    C20684815ws.LJIILLIIL("switch_account_success_toast_show", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AccountMainActivityAssem@7d4.handleSwitchAccount$2$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AccountMainActivityAssem@7d4.handleSwitchAccount$2$1");
                }
            });
        } else {
            BPEAHandler bPEAHandler2 = new BPEAHandler(Looper.getMainLooper());
            final String str6 = this.LLILLJJLI;
            final String str7 = this.LLILLL;
            final C19EG c19eg2 = this.LLILZ;
            final String str8 = this.LLIZLLLIL;
            final boolean z4 = this.LLJ;
            final boolean z5 = this.LLJI;
            C786410Ut5.LJJZZIII(bPEAHandler2, new Runnable() { // from class: X.0ztB
                public final void LIZ() {
                    AccountMainActivityAssem.m155do(c19eg2, str8, z4, z5).LJIIJJI();
                    C757860To8.LIZ.getClass();
                    C757860To8.LIZLLL = true;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str6);
                    c2344009Gk.LJIIIIZZ("enter_method", str7);
                    C20684815ws.LJIILLIIL("switch_account_success_toast_show", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AccountMainActivityAssem@7d4.handleSwitchAccount$2$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AccountMainActivityAssem@7d4.handleSwitchAccount$2$2");
                }
            });
            C786410Ut5.LJLIIL(3000L, bPEAHandler2, new ARunnableS2S2110000_28(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, 0));
        }
        return Unit.LIZ;
    }
}
