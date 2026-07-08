package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.broadcast.PreviewMoreYData;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewMoreWidget;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.programmedlive.ui.InteractiveTopBarWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Kd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ViewOnLayoutChangeListenerC521690Kd5 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC521690Kd5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC521690Kd5 viewOnLayoutChangeListenerC521690Kd5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewParent parent;
        ViewParent parent2;
        ViewGroup viewGroup;
        PreviewMoreWidget previewMoreWidget = (PreviewMoreWidget) viewOnLayoutChangeListenerC521690Kd5.l0;
        if (!previewMoreWidget.LLILZLL) {
            previewMoreWidget.dataChannel.zW(PreviewMoreYData.class, Integer.valueOf(i2));
        }
        if (((PreviewMoreWidget) viewOnLayoutChangeListenerC521690Kd5.l0).isShowing()) {
            View view2 = ((PreviewMoreWidget) viewOnLayoutChangeListenerC521690Kd5.l0).getView();
            if (view2 != null) {
                parent = view2.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                int i9 = 0;
                if (viewGroup2 != null) {
                    Iterator<View> it2 = new C09RD(viewGroup2).iterator();
                    int i10 = 0;
                    while (true) {
                        C09RE c09re = (C09RE) it2;
                        if (!c09re.hasNext()) {
                            break;
                        }
                        View view3 = (View) c09re.next();
                        if (!(view3 instanceof C20516015Pq) && C500260Jjc.LJJJJIZL(view3)) {
                            i10++;
                        }
                    }
                    if (i10 >= 5 && PreviewToolBaseWidget.G1(((PreviewMoreWidget) viewOnLayoutChangeListenerC521690Kd5.l0).getView()) != 4) {
                        View view4 = ((PreviewMoreWidget) viewOnLayoutChangeListenerC521690Kd5.l0).getView();
                        if (view4 != null) {
                            parent2 = view4.getParent();
                        } else {
                            parent2 = null;
                        }
                        if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                            PreviewMoreWidget previewMoreWidget2 = (PreviewMoreWidget) viewOnLayoutChangeListenerC521690Kd5.l0;
                            int iIndexOfChild = viewGroup.indexOfChild(previewMoreWidget2.getView());
                            C786410Ut5.LJJJLZIJ(previewMoreWidget2.getView(), viewGroup);
                            Iterator<View> it3 = new C09RD(viewGroup).iterator();
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                C09RE c09re2 = (C09RE) it3;
                                if (c09re2.hasNext()) {
                                    Object next = c09re2.next();
                                    int i13 = i11 + 1;
                                    if (i11 >= 0) {
                                        View view5 = (View) next;
                                        if (!(view5 instanceof C20516015Pq) && C500260Jjc.LJJJJIZL(view5)) {
                                            i12++;
                                        }
                                        if (i12 == 4) {
                                            i9 = i13;
                                        }
                                        i11 = i13;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                } else {
                                    if (i9 != 0) {
                                        iIndexOfChild = i9;
                                    }
                                    if (iIndexOfChild > 0) {
                                        viewGroup.addView(previewMoreWidget2.getView(), iIndexOfChild);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC521690Kd5 viewOnLayoutChangeListenerC521690Kd5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) viewOnLayoutChangeListenerC521690Kd5.l0;
        ViewGroup.LayoutParams layoutParams = livePlayFragment.LLLLLZ.getLayoutParams();
        if (layoutParams != null) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (layoutParams.width == i9 && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = i9;
            layoutParams.height = i10;
            livePlayFragment.LLLLLZ.requestLayout();
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC521690Kd5 viewOnLayoutChangeListenerC521690Kd5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC521690Kd5);
        ((InteractiveTopBarWidget) viewOnLayoutChangeListenerC521690Kd5.l0).E1(true);
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC521690Kd5 viewOnLayoutChangeListenerC521690Kd5, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (i9 != i10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindFullScreenContentView: resize newHeight=");
            sbLIZ.append(i9);
            sbLIZ.append(", oldHeight=");
            sbLIZ.append(i10);
            C20441214yg.LIZIZ("LiveSurveyWidgetV2", C2188811AlT.LIZIZ(sbLIZ));
            ((LiveSurveyWidgetV2) viewOnLayoutChangeListenerC521690Kd5.l0).N1();
        }
    }
}
