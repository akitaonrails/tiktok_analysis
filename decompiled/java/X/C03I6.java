package X;

import Y.ARunnableS1S2100000_1;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoCollectionStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RecipientIdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VerificationMode;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03I6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03I6 implements C03LX {
    public final OrderSubmitAssemViewModel LIZ;
    public final View LIZIZ;
    public final OspAddressViewModel LIZJ;
    public final OspBottomViewModel LIZLLL;

    @Override // X.C03LX
    public final C03LS LIZIZ(String str, String str2) {
        IdentityInfoCollectionStyle identityInfoCollectionStyle;
        VerificationMode identityInfoVerificationMode;
        IdentityInfo identityInfo;
        RecipientIdentityInfo recipientIdentityInfo;
        String identityInfoHashId;
        RecipientIdentityInfo recipientIdentityInfo2;
        C03JV state = this.LIZ.getState();
        if (this.LIZ.jS2() && this.LIZIZ != null) {
            IdentityInfo identityInfo2 = this.LIZ.LLZLI;
            if (identityInfo2 != null) {
                C03I0 c03i0 = C03I0.LIZ;
                c03i0.getClass();
                C03I2 c03i2LIZ = C03I0.LIZ(identityInfo2);
                if (c03i2LIZ != null) {
                    int i = C03I3.LIZ[c03i2LIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            OspAddressViewModel ospAddressViewModel = this.LIZJ;
                            View view = this.LIZIZ;
                            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
                            String value = EnumC818803Hu.PLACE_ORDER.getValue();
                            c03i0.getClass();
                            C03I0.LIZLLL(ospAddressViewModel, identityInfo2, view, view, orderSubmitAssemViewModel, value, null);
                        }
                    } else {
                        OspAddressViewModel ospAddressViewModel2 = this.LIZJ;
                        View view2 = this.LIZIZ;
                        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
                        String value2 = EnumC818803Hu.PLACE_ORDER.getValue();
                        c03i0.getClass();
                        C03I0.LIZIZ(ospAddressViewModel2, identityInfo2, view2, view2, orderSubmitAssemViewModel2, value2, null);
                    }
                }
            }
            C03O0 c03o0 = C03O0.LIZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LIZ;
            OspBottomViewModel ospBottomViewModel = this.LIZLLL;
            c03o0.getClass();
            C03O0.LLFZ(str, orderSubmitAssemViewModel3, str2, ospBottomViewModel, null, false);
            return C03LS.IDENTITY;
        }
        IdentityInfo identityInfo3 = this.LIZ.LLZLI;
        if (identityInfo3 != null) {
            identityInfoCollectionStyle = identityInfo3.getIdentityInfoCollectionStyle();
        } else {
            identityInfoCollectionStyle = null;
        }
        if (identityInfoCollectionStyle == IdentityInfoCollectionStyle.STYLE1) {
            IdentityInfo identityInfo4 = this.LIZ.LLZLI;
            if (identityInfo4 != null && (recipientIdentityInfo2 = identityInfo4.getRecipientIdentityInfo()) != null) {
                identityInfoVerificationMode = recipientIdentityInfo2.getIdentityInfoVerificationMode();
            } else {
                identityInfoVerificationMode = null;
            }
            if (identityInfoVerificationMode == VerificationMode.STRICT && ((identityInfo = this.LIZ.LLZLI) == null || (recipientIdentityInfo = identityInfo.getRecipientIdentityInfo()) == null || (identityInfoHashId = recipientIdentityInfo.getIdentityInfoHashId()) == null || a0.LJJJIL(identityInfoHashId))) {
                OspAddressViewModel ospAddressViewModel3 = this.LIZJ;
                ospAddressViewModel3.getClass();
                ospAddressViewModel3.withState(new AwS89S0110000_1(ospAddressViewModel3, true, 0));
                OrderSubmitAssemViewModel.oT2(this.LIZ, "shipping_address", true);
                return C03LS.IDENTITY;
            }
        }
        if (!state.LLLLILI || state.LLLLIL != null) {
            return null;
        }
        OrderSubmitAssemViewModel.YS2(this.LIZ, "cpf", null, null, 14);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LIZ;
        orderSubmitAssemViewModel4.getClass();
        orderSubmitAssemViewModel4.setState(new AwS16S0010000_1(true, 24));
        C03O0 c03o02 = C03O0.LIZ;
        HashMap<String, Object> mapHi1 = this.LIZ.hi1(false);
        c03o02.getClass();
        C03O0.LJJLIIIJLJLI(mapHi1);
        C1091940eWO.LIZIZ(1000L, new ARunnableS1S2100000_1(this, str, str2, 1));
        return C03LS.IDENTITY;
    }

    public C03I6(View view, OspBottomViewModel ospBottomViewModel, OspAddressViewModel ospAddressViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = view;
        this.LIZJ = ospAddressViewModel;
        this.LIZLLL = ospBottomViewModel;
    }
}
