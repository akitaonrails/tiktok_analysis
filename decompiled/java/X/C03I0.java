package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoCollectionStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.AwS1S3500000_1;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.03I0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03I0 {
    public static final C03I0 LIZ = new C03I0();

    public static C03I2 LIZ(IdentityInfo identityInfo) {
        IdentityInfoCollectionStyle identityInfoCollectionStyle;
        IdentityInfoOption identityInfoOption;
        Integer type;
        if (identityInfo != null && (identityInfoOption = identityInfo.getIdentityInfoOption()) != null && (type = identityInfoOption.getType()) != null && type.intValue() == 3) {
            return C03I2.BR_CPF;
        }
        if (identityInfo != null) {
            identityInfoCollectionStyle = identityInfo.getIdentityInfoCollectionStyle();
        } else {
            identityInfoCollectionStyle = null;
        }
        if (identityInfoCollectionStyle == IdentityInfoCollectionStyle.STYLE0) {
            return C03I2.MX_RFC_CURP;
        }
        if (identityInfo == null || identityInfo.getRecipientIdentityInfo() == null || identityInfo.getIdentityInfoCollectionStyle() != IdentityInfoCollectionStyle.STYLE1) {
            return null;
        }
        return C03I2.COMPLIANCE_COLLECTION;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[PHI: r7
      0x0078: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String), (r7v4 java.lang.String) binds: [B:34:0x0075, B:22:0x0037, B:24:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel r14, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo r15, android.view.View r16, android.view.View r17, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r18, java.lang.String r19, java.lang.String r20) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel r5 = r15.getIdentityInfoPanel()
            if (r5 == 0) goto L73
            r9 = 0
            r3 = r16
            if (r3 == 0) goto L7f
            android.content.Context r13 = r3.getContext()
        Lf:
            com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEnterParams r4 = new com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEnterParams
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption r0 = r15.getIdentityInfoOption()
            if (r0 == 0) goto L7c
            java.lang.String r0 = r0.getValue()
            if (r0 == 0) goto L7c
            int r0 = r0.length()
            if (r0 == 0) goto L7c
            java.lang.String r6 = "edit"
        L25:
            r2 = r18
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r1 = r2.LLJJI
            if (r1 == 0) goto L74
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling r0 = r1.starlingTexts
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.cpfNumberInvalidHint
            if (r0 == 0) goto L74
            java.lang.String r7 = r0.text
        L35:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling r0 = r1.starlingTexts
            if (r0 == 0) goto L78
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.cpfCertificationFailedHint
            if (r0 == 0) goto L78
            java.lang.String r8 = r0.text
        L3f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling r0 = r1.starlingTexts
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.cpfCertificationNetworkErrHint
            if (r0 == 0) goto L49
            java.lang.String r9 = r0.text
        L49:
            boolean r0 = r2.iS2()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r12 = r20
            r10 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.jvm.internal.AwS367S0200000_1 r1 = new kotlin.jvm.internal.AwS367S0200000_1
            r0 = 188(0xbc, float:2.63E-43)
            r1.<init>(r2, r3, r0)
            r15 = r14
            r15.getClass()
            kotlin.jvm.internal.AwS37S0500000_1 r12 = new kotlin.jvm.internal.AwS37S0500000_1
            r18 = 0
            r14 = r17
            r16 = r4
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r15.withState(r12)
        L73:
            return
        L74:
            r7 = r9
            if (r1 == 0) goto L78
            goto L35
        L78:
            r8 = r9
            if (r1 == 0) goto L49
            goto L3f
        L7c:
            java.lang.String r6 = "add"
            goto L25
        L7f:
            r13 = r9
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03I0.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo, android.view.View, android.view.View, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, java.lang.String, java.lang.String):void");
    }

    public static void LIZLLL(OspAddressViewModel ospAddressViewModel, IdentityInfo identityInfo, View view, View view2, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, String str2) {
        Context context;
        BillStarling billStarling;
        BillStarlingText billStarlingText;
        if (identityInfo.getIdentityInfoPanel() != null) {
            String str3 = null;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
            if (billInfoData != null && (billStarling = billInfoData.starlingTexts) != null && (billStarlingText = billStarling.mxTaxLayerError) != null) {
                str3 = billStarlingText.text;
            }
            Boolean boolValueOf = Boolean.valueOf(orderSubmitAssemViewModel.iS2());
            AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(orderSubmitAssemViewModel, view, 189);
            ospAddressViewModel.getClass();
            ospAddressViewModel.withState(new AwS1S3500000_1(context, ospAddressViewModel, view2, str3, str, boolValueOf, str2, awS367S0200000_1, 0));
        }
    }
}
