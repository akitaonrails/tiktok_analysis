package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569640MVu extends AbstractC1664490tPr<C569470MVd, C569540MVk> {
    public List<C569570MVn> LLJJJIL;
    public View LLJJJJ;
    public RecyclerView LLJJJJJIL;
    public int LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 126));
    public final C362540EJg LLJJL = new C0DXR() { // from class: X.0EJg
        public final int LL = C390810FTz.LIZ(0);

        @Override // X.C0DXR
        public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
            int itemCount;
            super.LIZIZ(rect, view, recyclerView, c21673919s1);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = 0;
                rect.right = this.LL / 2;
                return;
            }
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter != null) {
                itemCount = adapter.getItemCount();
            } else {
                itemCount = 0;
            }
            if (childAdapterPosition == itemCount - 1) {
                rect.left = this.LL / 2;
                rect.right = 0;
            } else {
                int i = this.LL / 2;
                rect.left = i;
                rect.right = i;
            }
        }
    };
    public final C569650MVv LLJL = new DisplayManager.DisplayListener() { // from class: X.0MVv
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            Context sceneContext = this.LL.getSceneContext();
            if (sceneContext == null) {
                return;
            }
            int iLIZJ = C390810FTz.LIZJ(sceneContext);
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDisplayChanged: Screen width ");
            sbLIZ.append(iLIZJ);
            C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
            C569640MVu c569640MVu = this.LL;
            if (c569640MVu.LLJJLIIIJLLLLLLLZ == iLIZJ) {
                return;
            }
            c569640MVu.LLJJLIIIJLLLLLLLZ = iLIZJ;
            AbstractC569690MVz abstractC569690MVz = (AbstractC569690MVz) c569640MVu.LLJJJJLIIL.getValue();
            abstractC569690MVz.LLILLL = AbstractC569690MVz.LLLFZ();
            abstractC569690MVz.notifyDataSetChanged();
        }
    };

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        DisplayManager displayManager;
        super.onDestroyView();
        this.LLJJJIL = null;
        Context sceneContext = getSceneContext();
        Object objH2 = sceneContext != null ? C786410Ut5.H2(sceneContext, "display") : null;
        if (!(objH2 instanceof DisplayManager) || (displayManager = (DisplayManager) objH2) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.LLJL);
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        List<C569570MVn> list = this.LLJJJIL;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        ((C569680MVy) this.LLJJJJLIIL.getValue()).LLLIILIL(list);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        Object objH2;
        int iIntValue;
        GradientDrawable.Orientation orientation;
        Integer numLIZJ;
        DisplayManager displayManager;
        super.onViewCreated(view, bundle);
        this.LLJJJJJIL = (RecyclerView) view.findViewById(R.id.gul);
        this.LLJJJJ = view.findViewById(R.id.u2y);
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            this.LLJJLIIIJLLLLLLLZ = C390810FTz.LIZJ(sceneContext);
        }
        Context sceneContext2 = getSceneContext();
        if (sceneContext2 != null) {
            objH2 = C786410Ut5.H2(sceneContext2, "display");
        } else {
            objH2 = null;
        }
        if ((objH2 instanceof DisplayManager) && (displayManager = (DisplayManager) objH2) != null) {
            displayManager.registerDisplayListener(this.LLJL, null);
        }
        View view2 = this.LLJJJJ;
        if (view2 != null) {
            boolean zLIZLLL = C426750GoL.LIZLLL(view.getContext());
            C1361400lX0 c1361400lX0LJFF = C1425580nCW.LIZIZ.LJFF(view.getContext());
            if (c1361400lX0LJFF != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0o, c1361400lX0LJFF)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (zLIZLLL) {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            } else {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable.setOrientation(orientation);
            gradientDrawable.setColors(new int[]{0, iIntValue});
            view2.setBackground(gradientDrawable);
        }
        RecyclerView recyclerView = this.LLJJJJJIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        }
        RecyclerView recyclerView2 = this.LLJJJJJIL;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(this.LLJJL);
        }
        RecyclerView recyclerView3 = this.LLJJJJJIL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((AbstractC21673619ry) this.LLJJJJLIIL.getValue());
        }
        C354270Duj.LIZ(0L, new AwS552S0100000_8(this, 127));
        if (((Boolean) C285970BIt.LIZ.getValue()).booleanValue()) {
            view.setMinimumHeight(0);
        } else {
            view.setMinimumHeight(LLLLIL().LIZLLL.invoke().intValue());
        }
        ((AbstractC569690MVz) this.LLJJJJLIIL.getValue()).LLILLJJLI = new C569660MVw(this);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MVl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C569470MVd) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS374S0200000_8(view, this, 30));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.epp, viewGroup, false);
    }
}
