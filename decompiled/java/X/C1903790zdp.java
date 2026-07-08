package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation.AgeGraduationBannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1903790zdp extends C2217421BqW implements Function0<Unit> {
    public C1903790zdp(AgeGraduationBannerAssem ageGraduationBannerAssem) {
        super(0, ageGraduationBannerAssem, AgeGraduationBannerAssem.class, "onViewMoreClicked", "onViewMoreClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Fragment fragmentLJI;
        FragmentManager parentFragmentManager;
        InterfaceC20660615sy interfaceC20660615sy;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) this.receiver;
        abstractC738140SxQ.getClass();
        C1734106qh.LIZ.LIZIZ();
        Context context = abstractC738140SxQ.getContext();
        if (context != null && (fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ)) != null && (parentFragmentManager = fragmentLJI.getParentFragmentManager()) != null) {
            C128Y c128yLJI = C724240Sb0.LJI(abstractC738140SxQ);
            if ((c128yLJI instanceof InterfaceC20660615sy) && (interfaceC20660615sy = (InterfaceC20660615sy) c128yLJI) != null) {
                C342440Dbe.LIZ.getClass();
                PopupManager.LJIJI(new C1733906qf(context, parentFragmentManager, interfaceC20660615sy), true);
            }
        }
        return Unit.LIZ;
    }
}
