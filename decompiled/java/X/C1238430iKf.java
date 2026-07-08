package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238430iKf extends C09AY implements Function0<C1245440iVy> {
    public final /* synthetic */ PhoneEmailSignUpFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238430iKf(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
        super(0);
        this.LL = phoneEmailSignUpFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1245440iVy invoke() {
        PhoneSignUpFragment phoneSignUpFragment = new PhoneSignUpFragment();
        Bundle bundle = new Bundle(this.LL.getArguments());
        bundle.putInt("current_page", EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue());
        bundle.remove("next_page");
        phoneSignUpFragment.setArguments(bundle);
        return new C1245440iVy(phoneSignUpFragment, this.LL.getString(2131837663));
    }
}
