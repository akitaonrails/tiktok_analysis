package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853040XdG extends C09AY implements Function0<Bundle> {
    public final /* synthetic */ BindOrModifyPhoneActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C853040XdG(BindOrModifyPhoneActivity bindOrModifyPhoneActivity) {
        super(0);
        this.LL = bindOrModifyPhoneActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bundle invoke() {
        Bundle extras;
        Bundle bundle;
        Bundle extras2 = null;
        try {
            extras = this.LL.getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        if (extras != null) {
            try {
                extras2 = this.LL.getIntent().getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            bundle = new Bundle(extras2);
        } else {
            bundle = new Bundle();
        }
        bundle.remove("next_page");
        bundle.remove("current_scene");
        return bundle;
    }
}
