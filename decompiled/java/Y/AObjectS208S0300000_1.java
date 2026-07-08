package Y;

import X.AnonymousClass0311;
import X.C03JP;
import X.C03O0;
import X.C04FA;
import X.C10516049i;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C919503ib;
import X.C960603pE;
import X.C974903rX;
import X.InterfaceC1631620sYq;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.USOspPudoAddressCell;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemVH;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AObjectS208S0300000_1 implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS208S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
    }

    public static final Object invoke$0(AObjectS208S0300000_1 aObjectS208S0300000_1, Object obj, Object obj2, Object obj3) {
        String str = ((USOspPudoAddressCell) aObjectS208S0300000_1.l0).LLJJIII;
        if (str != null) {
            C03O0.LJJJJLL(C03O0.LIZ, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2, 8388607);
        }
        if (obj2 != null) {
            ((C03JP) ((USOspPudoAddressCell) aObjectS208S0300000_1.l0).LLJI.getValue()).h0(((AnonymousClass0311) aObjectS208S0300000_1.l1).LL, ((USOspPudoAddressCell) aObjectS208S0300000_1.l0).N5(), "edit", Boolean.valueOf(((C03JP) ((USOspPudoAddressCell) aObjectS208S0300000_1.l0).LLJI.getValue()).LLJILLL));
            String strLIZLLL = C960603pE.LIZLLL((View) ((USOspPudoAddressCell) aObjectS208S0300000_1.l0).LLJI.getValue());
            AssemVMLazy assemVMLazy = ((USOspPudoAddressCell) aObjectS208S0300000_1.l0).LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USOspPudoAddressCell.LLJJIJI;
            OspAddressViewModel.xQ2((OspAddressViewModel) assemVMLazy.getValue(), ((View) aObjectS208S0300000_1.l2).getContext(), strLIZLLL, null, "c48002.d1226", ((USOspPudoAddressCell) aObjectS208S0300000_1.l0).N5(), null, null, 100);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS208S0300000_1 aObjectS208S0300000_1, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        String str = (String) obj2;
        if (str != null) {
            InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) aObjectS208S0300000_1.l0;
            Context context = (Context) aObjectS208S0300000_1.l1;
            ECRichText eCRichText = (ECRichText) aObjectS208S0300000_1.l2;
            if (interfaceC1748810vbr != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbr, new C10516049i(), new AwS580S0100000_1(eCRichText, 273));
            }
            SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, str, new HashMap(), false);
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            if (interfaceC1748810vbrLIZ != null) {
                C960603pE.LJIIIIZZ(smartRouteLIZIZ, interfaceC1748810vbrLIZ);
            }
            smartRouteLIZIZ.open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS208S0300000_1 aObjectS208S0300000_1, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        String str = (String) obj2;
        if (str != null) {
            InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) aObjectS208S0300000_1.l0;
            C04FA c04fa = (C04FA) aObjectS208S0300000_1.l1;
            C1748720vbi.LIZIZ(interfaceC1748810vbr, new C10516049i(), new AwS580S0100000_1((ECRichText) aObjectS208S0300000_1.l2, 737));
            SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(c04fa.getContext(), str, new HashMap(), false);
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            if (interfaceC1748810vbrLIZ != null) {
                C960603pE.LJIIIIZZ(smartRouteLIZIZ, interfaceC1748810vbrLIZ);
            }
            smartRouteLIZIZ.open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS208S0300000_1 aObjectS208S0300000_1, Object obj, Object obj2, Object obj3) {
        String str = (String) obj2;
        if (str != null) {
            Uri uri = UriProtector.parse(str);
            if (Intrinsics.LJFF(uri.getScheme(), "ec_action") && Intrinsics.LJFF(uri.getHost(), "ec") && Intrinsics.LJFF(uri.getPath(), "/popup") && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type"), "ec_delivery_instruction")) {
                C1748720vbi.LIZLLL(((UsAddressItemVH) aObjectS208S0300000_1.l0).itemView, new C10516049i(), new AwS210S0300000_1((Address) aObjectS208S0300000_1.l1, (UsAddressItemVH) aObjectS208S0300000_1.l0, (C974903rX) aObjectS208S0300000_1.l2, 111));
                ((UsAddressItemVH) aObjectS208S0300000_1.l0).b6().mC2(((UsAddressItemVH) aObjectS208S0300000_1.l0).itemView, (Address) aObjectS208S0300000_1.l1);
            }
        }
        return Unit.LIZ;
    }
}
