package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptFragmentForExistingUsers;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptProcessFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10Ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19203810Ay extends C2217421BqW implements Function1<Throwable, Unit> {
    public C19203810Ay(PaPromptFragmentForExistingUsers paPromptFragmentForExistingUsers) {
        super(1, paPromptFragmentForExistingUsers, PaPromptFragmentForExistingUsers.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        String string;
        PaPromptProcessFragment paPromptProcessFragment;
        Throwable th2 = th;
        Fragment fragment = (Fragment) this.receiver;
        fragment.getClass();
        if (th2 instanceof C632200Oqw) {
            string = ((C632200Oqw) th2).getErrorMsg();
        } else {
            string = "";
        }
        if (string.length() == 0) {
            string = fragment.getString(2131848736);
        }
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        if (C1207604ny.LIZ()) {
            C191880104w.LJFF(C191880104w.LIZ, "existing_pa_prompt_page");
        } else {
            C191880104w c191880104w = C191880104w.LIZ;
            c191880104w.getClass();
            C191880104w.LIZIZ("existing_pa_prompt_page", null);
            c191880104w.getClass();
            C191880104w.LIZLLL("existing_pa_prompt_page", null, true);
        }
        Fragment parentFragment = fragment.getParentFragment();
        if ((parentFragment instanceof PaPromptProcessFragment) && (paPromptProcessFragment = (PaPromptProcessFragment) parentFragment) != null) {
            paPromptProcessFragment.OR();
        }
        return Unit.LIZ;
    }
}
