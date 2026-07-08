package X;

import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.ARunnableS77S0200000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MR9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MR9 extends AbstractC568240MQk {
    public boolean LLJL;
    public String LLJLILLLLZIIL;
    public SmartImageView LLJLL;
    public int LLJLIL = -1;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 678));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 676));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 677));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        this.LLJLIL = -1;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        super.onDestroyView();
    }

    public final void LLLLILI() {
        int measuredHeight;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        SmartImageView smartImageView = this.LLJLL;
        if (smartImageView == null) {
            return;
        }
        View viewRequireViewById = requireViewById(R.id.deb);
        if (viewRequireViewById.getParent() == null || smartImageView.getParent() == null) {
            return;
        }
        int width = viewRequireViewById.getWidth();
        if (width <= 0) {
            HandlerHook.viewPost(viewRequireViewById, new ARunnableS77S0200000_8(viewRequireViewById, this, 22));
            return;
        }
        Context contextRequireSceneContext = requireSceneContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0MRC.LIZJ(contextRequireSceneContext));
        sbLIZ.append('_');
        sbLIZ.append(contextRequireSceneContext.getResources().getConfiguration().orientation == 2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(strLIZIZ, this.LLJLILLLLZIIL)) {
            this.LLJLILLLLZIIL = strLIZIZ;
            TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.tv_title);
            TuxTextView tuxTextView2 = (TuxTextView) requireViewById(R.id.zf0);
            boolean zLIZLLL = C0MRC.LIZLLL(contextRequireSceneContext);
            C1305840k5O.LIZ.getClass();
            boolean z = C1697630uHJ.LIZ > 1 && C0MRC.LIZJ(contextRequireSceneContext);
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(z ? 16 : 24));
                marginLayoutParams4.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(z ? 16 : 24));
            }
            ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams3.leftMargin = z ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) : zLIZLLL ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                marginLayoutParams3.rightMargin = z ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) : zLIZLLL ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                marginLayoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(z ? 8 : 16));
            }
            tuxTextView.setTuxFont(C0MRC.LIZIZ(contextRequireSceneContext));
            tuxTextView2.setTuxFont(C0MRC.LIZ(contextRequireSceneContext));
            C0MRA.LIZ(tuxTextView2, this, (VideoPublishEditModel) this.LLJLLIL.getValue(), false, (ArrayList) this.LLJLLL.getValue());
        }
        TuxTextView tuxTextView3 = (TuxTextView) requireViewById(R.id.zf0);
        View viewRequireViewById2 = requireViewById(R.id.z9c);
        ViewGroup.LayoutParams layoutParams3 = viewRequireViewById2.getLayoutParams();
        int iLIZIZ = (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) : marginLayoutParams2.bottomMargin;
        if (viewRequireViewById2.getHeight() > 0) {
            measuredHeight = viewRequireViewById2.getHeight();
        } else {
            viewRequireViewById2.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = viewRequireViewById2.getMeasuredHeight();
        }
        int iLIZIZ2 = measuredHeight + iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        ViewGroup.LayoutParams layoutParams4 = tuxTextView3.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null && marginLayoutParams.bottomMargin != iLIZIZ2) {
            marginLayoutParams.bottomMargin = iLIZIZ2;
            C786410Ut5.R6(tuxTextView3, marginLayoutParams);
        }
        if (width == this.LLJLIL) {
            return;
        }
        this.LLJLIL = width;
        C0F3P.LIZ(smartImageView);
    }

    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        if (z && !this.LLJL) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJLLIL.getValue();
            c0ml7.getClass();
            C0ML7.LJIILJJIL(videoPublishEditModel, "card", "show", C0ML7.LIZIZ, (ArrayList) this.LLJLLL.getValue());
            this.LLJL = true;
        }
    }

    @Override // X.AbstractC568240MQk
    public final void LLLLIL(int i) {
        super.LLLLIL(i);
        this.LLJLIL = -1;
        this.LLJLILLLLZIIL = null;
        View view = this.mView;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS108S0100000_8(this, 87));
        }
    }

    @Override // X.AbstractC568240MQk, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i;
        super.onActivityCreated(bundle);
        Context contextRequireSceneContext = requireSceneContext();
        C1305840k5O c1305840k5O = C1305840k5O.LIZ;
        c1305840k5O.getClass();
        boolean z = true;
        if (C1697630uHJ.LIZ <= 1 || !C0MRC.LIZJ(contextRequireSceneContext)) {
            z = false;
        }
        TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.z9c);
        C1378990lzN.LIZIZ(tuxTextView, Float.valueOf(C418440Gaw.LIZIZ(25)), null, null, null, null, 30);
        C786410Ut5.h9(tuxTextView, new ACListenerS143S0100000_8(this, 106));
        if (!C0MQO.LIZ()) {
            c1305840k5O.getClass();
            int i2 = C1697630uHJ.LIZ;
            if (i2 != 2) {
                if (i2 != 3) {
                    i = 23;
                } else {
                    i = 43;
                }
            } else {
                i = 33;
            }
            tuxTextView.setTuxFont(i);
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            tuxTextView.setMinWidth(90);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                C786410Ut5.R6(tuxTextView, marginLayoutParams2);
            }
        }
        SmartImageView smartImageView = (SmartImageView) requireViewById(R.id.lqq);
        this.LLJLL = smartImageView;
        if (smartImageView != null) {
            layoutParams = smartImageView.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        View view = this.mView;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS108S0100000_8(this, 86));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C0MQO.LIZ()) {
            i = R.layout.ekp;
        } else {
            i = R.layout.eko;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}
