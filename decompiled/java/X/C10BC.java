package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptFragmentForExistingUsers;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptProcessFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10BC, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10BC extends C2217421BqW implements Function0<Unit> {
    public C10BC(PaPromptFragmentForExistingUsers paPromptFragmentForExistingUsers) {
        super(0, paPromptFragmentForExistingUsers, PaPromptFragmentForExistingUsers.class, "onNext", "onNext()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PaPromptProcessFragment paPromptProcessFragment;
        Fragment parentFragment = ((Fragment) this.receiver).getParentFragment();
        if ((parentFragment instanceof PaPromptProcessFragment) && (paPromptProcessFragment = (PaPromptProcessFragment) parentFragment) != null) {
            paPromptProcessFragment.OR();
        }
        return Unit.LIZ;
    }
}
