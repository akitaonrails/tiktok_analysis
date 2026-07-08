package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.subpage.OcpPolicyFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.OneClickPaySheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeeMore;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03uT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.tts.sku.us.ISkuBottomCommon$updateButtonUI$4$1$1", f = "ISkuBottomCommon.kt", l = {214}, m = "invokeSuspend")
public final class C993103uT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC954103oB LLILLJJLI;
    public final /* synthetic */ PdpBottomAreaElem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C993103uT(InterfaceC954103oB interfaceC954103oB, PdpBottomAreaElem pdpBottomAreaElem, InterfaceC1364105Vn<? super C993103uT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC954103oB;
        this.LLILLL = pdpBottomAreaElem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C993103uT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objLIZ;
        C1C7U.LIZ("ISkuBottomCommon@2a5f.updateButtonUI$4$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            BaseSkuFragment<?> baseSkuFragmentIp = ((SkuPanelBaseAssem) this.LLILLJJLI).ip();
            SeeMore seeMore = this.LLILLL.seeMore;
            String str2 = null;
            if (seeMore != null) {
                str = seeMore.title;
                str2 = seeMore.desc;
            } else {
                str = null;
            }
            OneClickPaySheet oneClickPaySheet = new OneClickPaySheet(str, str2);
            this.LL = 1;
            if (baseSkuFragmentIp.getFragmentManager() == null) {
                objLIZ = Unit.LIZ;
            } else {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                OcpPolicyFragment.LLILZIL = c23260099m;
                FragmentManager fragmentManager = baseSkuFragmentIp.getFragmentManager();
                if (fragmentManager != null) {
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LJIIIIZZ(1);
                    C958103op.LIZ.getClass();
                    c1390920mIc.LIZ.LLJJL = C958103op.LJIIZILJ;
                    OcpPolicyFragment ocpPolicyFragment = new OcpPolicyFragment();
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("title", oneClickPaySheet.title, bundle);
                    C960603pE.LJI(bundle, baseSkuFragmentIp, new AwS580S0100000_1(oneClickPaySheet, 81));
                    ocpPolicyFragment.setArguments(bundle);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = ocpPolicyFragment;
                    tuxSheet.LLJLL = true;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.show(fragmentManager, "OcpPolicyFragment");
                }
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ != C099R.LJFF()) {
                    objLIZ = Unit.LIZ;
                }
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("ISkuBottomCommon@2a5f.updateButtonUI$4$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ISkuBottomCommon@2a5f.updateButtonUI$4$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
