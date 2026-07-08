package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.tux.sheet.intro.TuxPanel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824490xZv extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ C259800zU<TuxPanel> LL;
    public final /* synthetic */ PcsOnboardingStepFragment<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824490xZv(PcsOnboardingStatefulStepFragment pcsOnboardingStatefulStepFragment, C259800zU c259800zU) {
        super(2);
        this.LL = c259800zU;
        this.LLILLJJLI = pcsOnboardingStatefulStepFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        View view2;
        C197039127h c197039127h;
        String str;
        ViewGroup viewGroup;
        TuxPanel tuxPanel = this.LL.element;
        if (tuxPanel != null) {
            view2 = tuxPanel.getView();
        } else {
            view2 = null;
        }
        if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
            ArrayList arrayList = new ArrayList();
            C1824670xaD.LIZ(viewGroup, C197039127h.class, arrayList);
            c197039127h = (C197039127h) C13LP.LJJJLL(arrayList);
            if (c197039127h != null) {
                c197039127h.setLoading(true);
            }
        } else {
            c197039127h = null;
        }
        PcsOnboardingStepFragment<T> pcsOnboardingStepFragment = this.LLILLJJLI;
        pcsOnboardingStepFragment.LLLFF = c197039127h;
        PcsOnboardingVM pcsOnboardingVMJS = pcsOnboardingStepFragment.JS();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsOnboardingVMJS), null, null, new C1410650moR(pcsOnboardingVMJS, null), 3);
        String showEntrance = this.LLILLJJLI.JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(this.LLILLJJLI.JS().EQ2())));
        String strLQ2 = this.LLILLJJLI.JS().LQ2();
        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(this.LLILLJJLI.JS().EQ2())));
        if (Intrinsics.LJFF(this.LLILLJJLI.JS().LLJJIJIIJIL, "recommended")) {
            str = "showcase_selection_page";
        } else {
            str = "multisku_selection_page";
        }
        C1824200xZS.LIZLLL(zLJJJI ? 1 : 0, showEntrance, zLJJJI2 ? 1 : 0, strLQ2, str, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(this.LLILLJJLI.JS().EQ2()))) ? 1 : 0, "got_it");
        return Unit.LIZ;
    }
}
