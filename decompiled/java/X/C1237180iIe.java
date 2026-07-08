package X;

import Y.AfS112S0300000_19;
import Y.AfS155S0200000_19;
import Y.AfS188S0100000_19;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237180iIe extends AbstractC854320XfK implements InterfaceC853800XeU {
    public final InterfaceC851850XbL LIZ;
    public final VerificationMethodType LIZIZ = VerificationMethodType.MOBILE;

    @Override // X.InterfaceC1237470iJ7
    public final String getId() {
        return "verify_phone_for_change";
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZLLL() {
        this.LIZ.getData().putInt("current_page", EnumC852910Xd3.PHONE_SMS_VERIFY.getValue());
    }

    @Override // X.InterfaceC1237070iIT
    public final C1237010iIN LJFF() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Bundle data = this.LIZ.getData();
        boolean z = Intrinsics.LJFF(data.getString("page"), "twosv_setup") && !data.getBoolean("show_skip", false);
        String bindPhone = C0XQ5.LIZJ().getBindPhone();
        boolean z2 = data.getInt("progress", -1) >= 0;
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LIZ = z2 ? contextLIZ.getString(2131857337) : " ";
        c1237010iIN.LJIIIIZZ = contextLIZ.getString(2131829360);
        c1237010iIN.LJIIIZ = z ? C786410Ut5.k4(Locale.US, contextLIZ.getString(2131857323), Arrays.copyOf(new Object[]{bindPhone}, 1)) : C1236880iIA.LIZIZ(C1236880iIA.LIZLLL(C786410Ut5.k4(Locale.US, contextLIZ.getString(2131858480), Arrays.copyOf(new Object[]{bindPhone}, 1)), new String[]{bindPhone}, 52), contextLIZ, R.attr.a1j, bindPhone);
        c1237010iIN.LJIIJJI = "";
        c1237010iIN.LJIIL = false;
        return c1237010iIN;
    }

    @Override // X.InterfaceC1237070iIT
    public final Fragment getFragment() {
        return new InputCodeFragment();
    }

    @Override // X.InterfaceC1237470iJ7
    public final InterfaceC851850XbL LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC853800XeU
    public final VerificationMethodType LIZJ() {
        return this.LIZIZ;
    }

    public C1237180iIe(InterfaceC851850XbL interfaceC851850XbL) {
        this.LIZ = interfaceC851850XbL;
    }

    @Override // X.AbstractC854320XfK, X.InterfaceC1237470iJ7
    public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
        if (interfaceC853790XeT instanceof InputCodeFragment.InputCodeActions.ClickResendPhoneCodeActionV1) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            InputCodeFragment.InputCodeActions.ClickResendPhoneCodeActionV1 clickResendPhoneCodeActionV1 = (InputCodeFragment.InputCodeActions.ClickResendPhoneCodeActionV1) interfaceC853790XeT;
            InputCodeFragment fragment = clickResendPhoneCodeActionV1.getFragment();
            InputCodeFragment fragment2 = clickResendPhoneCodeActionV1.getFragment();
            String str = clickResendPhoneCodeActionV1.mo152getParams().LIZ;
            EnumC852660Xce enumC852660XceSR = clickResendPhoneCodeActionV1.getFragment().SR();
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_VERIFY;
            String string = this.LIZ.getData().getString("page");
            C854460XfY c854460XfY = C854460XfY.LIZ;
            InputCodeFragment fragment3 = clickResendPhoneCodeActionV1.getFragment();
            c854460XfY.getClass();
            C0XZ4.LJJ(c0xz4, fragment, fragment2, str, enumC852660XceSR, enumC852910Xd3, "", "", "resend", null, string, null, C854460XfY.LJIIJJI(fragment3), 2816).LJIIIIZZ(new AfS155S0200000_19(interfaceC853790XeT, c1237330iIt, 9)).LJII(new AfS188S0100000_19(c1237330iIt, 54)).LJIILL();
            return;
        }
        if (interfaceC853790XeT instanceof InputCodeFragment.InputCodeActions.VerifyPhoneCodeActionV1) {
            Bundle data = this.LIZ.getData();
            C0XZ4 c0xz42 = C0XZ4.LIZ;
            InputCodeFragment.InputCodeActions.VerifyPhoneCodeActionV1 verifyPhoneCodeActionV1 = (InputCodeFragment.InputCodeActions.VerifyPhoneCodeActionV1) interfaceC853790XeT;
            InputCodeFragment fragment4 = verifyPhoneCodeActionV1.getFragment();
            InputCodeFragment fragment5 = verifyPhoneCodeActionV1.getFragment();
            EnumC852660Xce enumC852660XceSR2 = verifyPhoneCodeActionV1.getFragment().SR();
            EnumC852910Xd3 enumC852910Xd32 = EnumC852910Xd3.PHONE_SMS_VERIFY;
            String str2 = verifyPhoneCodeActionV1.mo152getParams().LIZ;
            C854460XfY c854460XfY2 = C854460XfY.LIZ;
            InputCodeFragment fragment6 = verifyPhoneCodeActionV1.getFragment();
            c854460XfY2.getClass();
            Map mapLJIIJJI = C854460XfY.LJIIJJI(fragment6);
            c0xz42.getClass();
            C0XZ4.LJIL(fragment4, enumC852660XceSR2, enumC852910Xd32, fragment5, str2, mapLJIIJJI).LJIIIIZZ(new AfS112S0300000_19(interfaceC853790XeT, data, c1237330iIt, 1)).LJII(new AfS188S0100000_19(c1237330iIt, 55)).LJIILL();
            return;
        }
        super.LIZIZ(interfaceC853790XeT, c1237330iIt);
    }
}
