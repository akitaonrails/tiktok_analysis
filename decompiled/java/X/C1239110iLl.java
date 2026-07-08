package X;

import android.os.Build;
import android.view.autofill.AutofillManager;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetNicknameFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239110iLl extends C09AY implements Function0<AutofillManager> {
    public final /* synthetic */ SetNicknameFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1239110iLl(SetNicknameFragment setNicknameFragment) {
        super(0);
        this.LL = setNicknameFragment;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.autofill.AutofillManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AutofillManager invoke() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.LL.requireContext().getSystemService(AutofillManager.class);
        }
        return null;
    }
}
