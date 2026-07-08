package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671470QVl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EcSearchFragment LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ EnumC674310Qcf LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C671470QVl(EcSearchFragment ecSearchFragment, int i, boolean z, EnumC674310Qcf enumC674310Qcf) {
        super(0);
        this.LL = ecSearchFragment;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = enumC674310Qcf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Fragment fragmentLLLILZLLLI;
        C128Y c128yLLLILZLLLI;
        InterfaceC671770QWp interfaceC671770QWp;
        EcSearchFragment ecSearchFragment = this.LL;
        C671480QVm c671480QVm = ecSearchFragment.LLJILJILJ;
        if (c671480QVm != null) {
            FragmentManager fragmentManagerLIZ = C0QVQ.LIZ(ecSearchFragment);
            int i = this.LLILLJJLI;
            boolean z = this.LLILLL;
            EnumC674310Qcf enumC674310Qcf = this.LLILZ;
            C671870QWz.LIZ.getClass();
            EnumC671670QWf enumC671670QWfLIZ = C671870QWz.LIZ(i);
            if (enumC671670QWfLIZ != null && (fragmentLLLILZLLLI = C671480QVm.LLLILZLLLI(fragmentManagerLIZ, c671480QVm.LLJIJIL)) != null && (c128yLLLILZLLLI = C671480QVm.LLLILZLLLI(fragmentManagerLIZ, i)) != null) {
                String strCreateJumpSourceBtmToken = null;
                if ((c128yLLLILZLLLI instanceof InterfaceC671770QWp) && (interfaceC671770QWp = (InterfaceC671770QWp) c128yLLLILZLLLI) != null) {
                    if (enumC674310Qcf == EnumC674310Qcf.SWITCH_TAB) {
                        int i2 = C671490QVn.LIZ[enumC671670QWfLIZ.ordinal()];
                        if (i2 == 1) {
                            strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c61956.d90888", PageFinder.via(fragmentLLLILZLLLI), null);
                        } else {
                            if (i2 != 2) {
                                throw new C1954807lC();
                            }
                            strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c61956.d74728", PageFinder.via(fragmentLLLILZLLLI), null);
                        }
                    }
                    interfaceC671770QWp.ov(strCreateJumpSourceBtmToken, z);
                }
                c671480QVm.LLJIJIL = i;
            }
        }
        return Unit.LIZ;
    }
}
