package X;

import Y.AObserverS230S0100000_28;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import com.ss.android.ugc.aweme.ILoginServiceAppDiff;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10PW, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10PW implements C10PV, C10P9 {
    public final C19EG LL;
    public final SAFTikTokFragment LLILLJJLI;
    public final C10PZ LLILLL;
    public final Function2<Fragment, Boolean, Unit> LLILZ;
    public Intent LLILZIL;
    public boolean LLILZLL;
    public final AwS572S0100000_28 LLIZ = new AwS572S0100000_28(this, 839);

    @Override // X.C10P9
    public final void S62() {
    }

    @Override // X.C10P9
    public final void VT1(C10P7<?> c10p7) {
    }

    @Override // X.C10PV
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.C10P9
    public final void onComplete() {
    }

    @Override // X.C10PV
    public void onEvent(IEvent iEvent) {
    }

    @Override // X.C10P9
    public final void onStart() {
    }

    @Override // X.C10PV
    public final void LIZLLL() {
        new Object() { // from class: X.10Pc
        };
        C0CAR.LIZ.observe(this.LL, new AObserverS230S0100000_28(this, 73));
        ILoginServiceAppDiff iLoginServiceAppDiff = (ILoginServiceAppDiff) PluggableExtentionKt.pluggableSpi$default(ILoginServiceAppDiff.class, false, false, false, 14, null);
        if (iLoginServiceAppDiff != null) {
            iLoginServiceAppDiff.attachActivity(this.LL);
        }
    }

    @Override // X.C10PV
    public final void LIZ(Intent intent) {
        Intent intent2;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen")) != null) {
            this.LLILZIL = intent2;
        }
    }

    @Override // X.C10P9
    public final void Is1(C10P7<?> c10p7, C19240810Pe c19240810Pe) {
        if (c19240810Pe != null && c19240810Pe.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c10p7.type());
            sbLIZ.append(" affect Feed Content");
            C1911410zq7.LIZJ("NUJFlowAbility", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZLL = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10PW(C19EG c19eg, SAFTikTokFragment sAFTikTokFragment, C10PZ c10pz, Function2<? super Fragment, ? super Boolean, Unit> function2) {
        this.LL = c19eg;
        this.LLILLJJLI = sAFTikTokFragment;
        this.LLILLL = c10pz;
        this.LLILZ = function2;
    }
}
