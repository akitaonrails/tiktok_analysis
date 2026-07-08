package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.037e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7912037e implements InterfaceC1631620sYq<View, String, ECRichTextExtraInfo, Unit> {
    public final /* synthetic */ LogisticExpressionArea LL;
    public final /* synthetic */ C723002s0 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ OspShopViewModel LLILZ;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ TuxTextView LLIZ;

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(View view, String str, ECRichTextExtraInfo eCRichTextExtraInfo) {
        Integer num;
        Uri uri;
        View view2 = view;
        String str2 = str;
        C03CQ c03cq = C03CT.Companion;
        LogisticExpressionArea logisticExpressionArea = this.LL;
        Integer num2 = null;
        if (logisticExpressionArea != null) {
            num = logisticExpressionArea.shippingType;
        } else {
            num = null;
        }
        c03cq.getClass();
        C03CT c03ctLIZ = C03CQ.LIZ(num);
        MainOrderSetting mainOrderSetting = this.LLILLJJLI.LLJJJIL;
        if (mainOrderSetting != null) {
            num2 = mainOrderSetting.selfCollectionOpt;
        }
        EnumC804103Cd enumC804103CdLJJI = C7806033c.LJJI(c03ctLIZ, num2);
        if (str2 != null && !a0.LJJJIL(str2)) {
            try {
                uri = UriProtector.parse(str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (Intrinsics.LJFF(uri.getScheme(), "ec_action") && Intrinsics.LJFF(uri.getHost(), "ec") && Intrinsics.LJFF(uri.getPath(), "/delivery")) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "selection_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) == EnumC804103Cd.PICKUP.getValue()) {
                    enumC804103CdLJJI = EnumC804103Cd.PICKUP;
                }
                OspShopViewModel.wQ2(this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILZLL, this.LLILLL, this.LL, C03CY.PICKUP_POINT_LOCATION, enumC804103CdLJJI, this.LLIZ, null, 256).onClick(view2);
            } else {
                C919503ib.LIZIZ(this.LLILLL, str2, new LinkedHashMap(), false).open();
            }
        } else {
            OspShopViewModel.wQ2(this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILZLL, this.LLILLL, this.LL, C03CY.PICKUP_POINT_LOCATION, enumC804103CdLJJI, this.LLIZ, null, 256).onClick(view2);
        }
        return Unit.LIZ;
    }

    public C7912037e(LogisticExpressionArea logisticExpressionArea, C723002s0 c723002s0, Context context, OspShopViewModel ospShopViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i, TuxTextView tuxTextView) {
        this.LL = logisticExpressionArea;
        this.LLILLJJLI = c723002s0;
        this.LLILLL = context;
        this.LLILZ = ospShopViewModel;
        this.LLILZIL = orderSubmitAssemViewModel;
        this.LLILZLL = i;
        this.LLIZ = tuxTextView;
    }
}
