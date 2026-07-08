package X;

import Y.ARunnableS108S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0MqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ViewOnLayoutChangeListenerC580890MqN implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC580890MqN(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        OnThisDayCardPreviewScene onThisDayCardPreviewScene;
        ViewPager viewPager;
        if (((OnThisDayCardPreviewScene) viewOnLayoutChangeListenerC580890MqN.l0).mViewDestroyed) {
            ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN2 = ((OnThisDayCardPreviewScene) viewOnLayoutChangeListenerC580890MqN.l0).LLLFZ;
            if (viewOnLayoutChangeListenerC580890MqN2 != null) {
                ((ViewPager) viewOnLayoutChangeListenerC580890MqN.l1).removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580890MqN2);
                return;
            }
            return;
        }
        int i9 = i7 - i5;
        int i10 = i3 - i;
        if ((i8 - i6 != i4 - i2 || i9 != i10) && (viewPager = (onThisDayCardPreviewScene = (OnThisDayCardPreviewScene) viewOnLayoutChangeListenerC580890MqN.l0).LLJJIJIL) != null) {
            ARunnableS108S0100000_8 aRunnableS108S0100000_8 = onThisDayCardPreviewScene.LLLI;
            if (aRunnableS108S0100000_8 != null) {
                HandlerHook.viewRemoveCallbacks(viewPager, aRunnableS108S0100000_8);
            }
            ARunnableS108S0100000_8 aRunnableS108S0100000_82 = new ARunnableS108S0100000_8(onThisDayCardPreviewScene, 2);
            onThisDayCardPreviewScene.LLLI = aRunnableS108S0100000_82;
            HandlerHook.viewPostDelay(viewPager, aRunnableS108S0100000_82, 150L);
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580890MqN);
        int height = view.getHeight();
        C118300cf c118300cf = (C118300cf) viewOnLayoutChangeListenerC580890MqN.l0;
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) viewOnLayoutChangeListenerC580890MqN.l1;
        int i9 = height - (((100 - mvChoosePhotoScene.peekHeight) * height) / 100);
        c118300cf.element = i9;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = mvChoosePhotoScene.behavior;
        if (viewPagerBottomSheetBehavior != null) {
            viewPagerBottomSheetBehavior.setPeekHeight(i9);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Integer numValueOf;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (((CelebrationVideoTemplatePreviewScene) viewOnLayoutChangeListenerC580890MqN.l0).mViewDestroyed) {
            ViewPager viewPager = ((CelebrationVideoTemplatePreviewScene) viewOnLayoutChangeListenerC580890MqN.l0).LLJJIJIL;
            if (viewPager != null) {
                viewPager.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580890MqN);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutChange: ");
        View view2 = ((CelebrationVideoTemplatePreviewScene) viewOnLayoutChangeListenerC580890MqN.l0).mView;
        if (view2 != null) {
            numValueOf = Integer.valueOf(view2.getWidth());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene = (CelebrationVideoTemplatePreviewScene) viewOnLayoutChangeListenerC580890MqN.l0;
        ViewPager viewPager2 = celebrationVideoTemplatePreviewScene.LLJJIJIL;
        if (viewPager2 != null) {
            ViewPager viewPager3 = (ViewPager) viewOnLayoutChangeListenerC580890MqN.l1;
            View view3 = celebrationVideoTemplatePreviewScene.mView;
            if (view3 != null) {
                int width = view3.getWidth();
                viewPager2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580890MqN);
                int height = (viewPager3.getHeight() * 9) / 16;
                int i9 = (width - height) / 2;
                ViewGroup.LayoutParams layoutParams = viewPager3.getLayoutParams();
                if ((layoutParams instanceof RelativeLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(i9);
                    marginLayoutParams.setMarginEnd(i9);
                } else {
                    marginLayoutParams = null;
                }
                C786410Ut5.q6(viewPager3, marginLayoutParams);
                celebrationVideoTemplatePreviewScene.LLJJJIL.setVideoCanvasWidth(width);
                celebrationVideoTemplatePreviewScene.LLJJJIL.setVideoCanvasHeight((width / 9) * 16);
                C0MQS c0mqs = celebrationVideoTemplatePreviewScene.LLL;
                if (c0mqs != null) {
                    C568710MSf c568710MSfLJJIL = c0mqs.LJJIL();
                    c568710MSfLJJIL.LLJJIJIL = height;
                    RadiusLayout radiusLayout = c568710MSfLJJIL.LLJJJIL;
                    if (radiusLayout != null) {
                        radiusLayout.setOutlineProvider(new C0MRE(C11VU.LIZJ(12.0d, c568710MSfLJJIL.requireSceneContext())));
                        radiusLayout.setClipToOutline(true);
                        radiusLayout.requestLayout();
                    }
                    C554890LpX c554890LpX = C554890LpX.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setWidth: itemWidth = ");
                    sbLIZ2.append(height);
                    C201955140j.LIZLLL(c554890LpX, "CeleTempPreview", C2188811AlT.LIZIZ(sbLIZ2));
                    c568710MSfLJJIL.LLJJIJIIJIL = (height * 16) / 9;
                    NLEModel nLEModel = c568710MSfLJJIL.LLJLL;
                    if (nLEModel != null) {
                        c568710MSfLJJIL.LLLLIL(nLEModel, true, null);
                    }
                }
            }
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((C565430MFp) viewOnLayoutChangeListenerC580890MqN.l0).isShown() && ((C565430MFp) viewOnLayoutChangeListenerC580890MqN.l0).isLaidOut()) {
            ((C565400MFm) viewOnLayoutChangeListenerC580890MqN.l1).LLLLLLLLLL((C565430MFp) viewOnLayoutChangeListenerC580890MqN.l0);
        }
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC580890MqN viewOnLayoutChangeListenerC580890MqN, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        DraftBoxFragment draftBoxFragment;
        RecyclerView recyclerViewLLII;
        C561820M1s c561820M1s;
        if (((RecyclerView) viewOnLayoutChangeListenerC580890MqN.l0).getRight() - ((RecyclerView) viewOnLayoutChangeListenerC580890MqN.l0).getLeft() != i7 - i5) {
            z = true;
        } else {
            z = false;
        }
        if (((RecyclerView) viewOnLayoutChangeListenerC580890MqN.l0).getBottom() - ((RecyclerView) viewOnLayoutChangeListenerC580890MqN.l0).getTop() != i8 - i6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z || z2) && (recyclerViewLLII = (draftBoxFragment = (DraftBoxFragment) viewOnLayoutChangeListenerC580890MqN.l1).LLII()) != null) {
            ArrayList arrayList = (ArrayList) draftBoxFragment.VR().LLILLJJLI;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                if (((C561950M2f) listIterator.previous()).LIZ() == 121) {
                    int iNextIndex = listIterator.nextIndex();
                    if (iNextIndex >= 0) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerViewLLII.findViewHolderForAdapterPosition(iNextIndex);
                        if ((viewHolderFindViewHolderForAdapterPosition instanceof C561820M1s) && (c561820M1s = (C561820M1s) viewHolderFindViewHolderForAdapterPosition) != null) {
                            HandlerHook.viewRemoveCallbacks(c561820M1s.itemView, c561820M1s.LLILLL);
                            HandlerHook.viewPost(c561820M1s.itemView, c561820M1s.LLILLL);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
