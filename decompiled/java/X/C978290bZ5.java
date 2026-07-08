package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multimatch.ui.audience.v2.views.MatchWidgetTitleLayout;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.0bZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978290bZ5 {
    public MatchBaseWidget LIZ;

    public final void LIZ() {
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragmentLIZ;
        C20441214yg.LIZIZ("MatchWidgetTitleView", " on destroy called ");
        MatchBaseWidget matchBaseWidget = this.LIZ;
        FrameLayout frameLayout = matchBaseWidget != null ? (FrameLayout) matchBaseWidget.findViewById(R.id.mck) : null;
        C500260Jjc.LJIILIIL(frameLayout);
        MatchBaseWidget matchBaseWidget2 = this.LIZ;
        if (matchBaseWidget2 != null && (((interfaceC1097170eep = matchBaseWidget2.widgetCallback) != null && (fragmentLIZ = interfaceC1097170eep.getFragment()) != null) || (fragmentLIZ = C946803n0.LIZ(matchBaseWidget2.getView())) != null)) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(MatchWidgetTitleLayout.class);
            AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(fragmentLIZ);
            boolean zLJIIIZ = assemSupervisorLIZJ != null ? assemSupervisorLIZJ.LJIIIZ(null, c19719912DlLIZ) : false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" unloadSuccess = ");
            sbLIZ.append(zLJIIIZ);
            C20441214yg.LIZIZ("MatchWidgetTitleView", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
    }

    public final void LIZIZ(MatchBaseWidget matchBaseWidget, EnumC919170a1j enumC919170a1j) {
        View viewFindViewById;
        Fragment fragmentLIZ;
        Fragment fragmentLIZ2;
        C20441214yg.LIZIZ("MatchWidgetTitleView", "onLoad, show match title view");
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            viewFindViewById = matchBaseWidget.findViewById(R.id.mck);
            if (viewFindViewById != null) {
                C500260Jjc.LLFFF(viewFindViewById);
            }
        } else {
            viewFindViewById = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matchType = ");
        sbLIZ.append(enumC919170a1j);
        sbLIZ.append(", widget = ");
        sbLIZ.append(matchBaseWidget);
        sbLIZ.append(", container = ");
        sbLIZ.append(viewFindViewById);
        sbLIZ.append(", fragment = ");
        if (matchBaseWidget != null) {
            InterfaceC1097170eep interfaceC1097170eep = matchBaseWidget.widgetCallback;
            if (interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) {
                fragmentLIZ = C946803n0.LIZ(matchBaseWidget.getView());
            }
        } else {
            fragmentLIZ = null;
        }
        sbLIZ.append(fragmentLIZ);
        C20441214yg.LIZIZ("MatchWidgetTitleView", C2188811AlT.LIZIZ(sbLIZ));
        if (matchBaseWidget != null) {
            InterfaceC1097170eep interfaceC1097170eep2 = matchBaseWidget.widgetCallback;
            if ((interfaceC1097170eep2 != null && (fragmentLIZ2 = interfaceC1097170eep2.getFragment()) != null) || (fragmentLIZ2 = C946803n0.LIZ(matchBaseWidget.getView())) != null) {
                C723850SaN.LIZ(fragmentLIZ2, false, null, new AwS368S0200000_2(fragmentLIZ2, matchBaseWidget, 94), 3);
            }
        }
    }
}
