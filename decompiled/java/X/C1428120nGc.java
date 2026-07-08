package X;

import Y.ARunnableS55S0300000_22;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428120nGc extends AbstractC1664490tPr<C1428140nGe, Unit> {
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C1428150nGf.LIZ(sceneContext);
        }
        View view = this.mView;
        View viewFindViewById = view.findViewById(R.id.xdn);
        if (viewFindViewById != null) {
            int i = C1428150nGf.LIZ;
            C1428140nGe c1428140nGe = LLLLILI().LIZ;
            RectF rectFLIZJ = C1428150nGf.LIZJ();
            Rect rect = new Rect((int) rectFLIZJ.left, (int) rectFLIZJ.top, (int) rectFLIZJ.right, (int) rectFLIZJ.bottom);
            int iCenterY = 0;
            if (rect.height() > 0 && rect.width() > 0) {
                z = true;
            } else {
                z = false;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = null;
            if (!(layoutParams instanceof ViewGroup.LayoutParams)) {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                C786410Ut5.W5(view, layoutParams);
            }
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                layoutParams2 = (FrameLayout.LayoutParams) layoutParams3;
            }
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams2.width = -1;
            layoutParams2.height = -2;
            layoutParams2.gravity = 49;
            if (z) {
                iCenterY = rect.centerY();
            }
            layoutParams2.topMargin = iCenterY;
            C786410Ut5.W5(viewFindViewById, layoutParams2);
            HandlerHook.viewPost(viewFindViewById, new ARunnableS55S0300000_22(this, view, viewFindViewById, 0));
        }
        if (C0CHZ.LIZ(LLLLILI().LIZ.LIZ)) {
            C786410Ut5.T4(this.mView, 0.0f);
            this.mView.animate().cancel();
            this.mView.animate().alpha(1.0f).setDuration(300L).start();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.dux, viewGroup, false);
    }
}
