package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238420iKe extends C09AY implements Function0<C1245440iVy> {
    public final /* synthetic */ PhoneEmailLoginFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238420iKe(PhoneEmailLoginFragment phoneEmailLoginFragment) {
        super(0);
        this.LL = phoneEmailLoginFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1245440iVy invoke() {
        EmailLoginFragment emailLoginFragment = new EmailLoginFragment();
        emailLoginFragment.setArguments(new Bundle(this.LL.getArguments()));
        emailLoginFragment.getArguments().putInt("current_page", EnumC852910Xd3.INPUT_EMAIL_LOGIN.getValue());
        emailLoginFragment.getArguments().remove("next_page");
        return new C1245440iVy(emailLoginFragment, this.LL.getString(2131829302));
    }
}
