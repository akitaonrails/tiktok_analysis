package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238410iKd extends C09AY implements Function0<C1245440iVy> {
    public final /* synthetic */ PhoneEmailLoginFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238410iKd(PhoneEmailLoginFragment phoneEmailLoginFragment) {
        super(0);
        this.LL = phoneEmailLoginFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1245440iVy invoke() {
        PhoneLoginFragment phoneLoginFragment = new PhoneLoginFragment();
        phoneLoginFragment.setArguments(new Bundle(this.LL.getArguments()));
        phoneLoginFragment.getArguments().putInt("current_page", EnumC852910Xd3.INPUT_PHONE_LOGIN.getValue());
        phoneLoginFragment.getArguments().putInt("current_scene", phoneLoginFragment.SR().getValue());
        phoneLoginFragment.getArguments().remove("next_page");
        return new C1245440iVy(phoneLoginFragment, this.LL.getString(2131837663));
    }
}
