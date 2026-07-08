package X;

import Y.ARunnableS114S0100000_14;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.image.desc.DescIdeasModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS98S1200000_14;

/* JADX INFO: renamed from: X.19Lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class ViewOnFocusChangeListenerC21523319Lb implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
            case 4:
                onFocusChange$4(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC21523319Lb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC21523319Lb viewOnFocusChangeListenerC21523319Lb, View view, boolean z) {
        if (z) {
            ((FavoriteVideoTabRootFragment) viewOnFocusChangeListenerC21523319Lb.l0).bS();
        }
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC21523319Lb viewOnFocusChangeListenerC21523319Lb, View view, boolean z) {
        boolean z2;
        String str;
        VideoPublishContainerScene videoPublishContainerScene;
        if (z) {
            C214848196g c214848196g = (C214848196g) viewOnFocusChangeListenerC21523319Lb.l0;
            if (c214848196g.LJIIJJI != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(c214848196g, 640);
            if (c214848196g.LIZIZ instanceof C1445410niV) {
                str = "edit_post_page";
            } else {
                str = "video_post_page";
            }
            C0L5F.LIZIZ(c214848196g.LIZ, "enter_description_text", z2, str, new AwS98S1200000_14((Function1) awS601S0100000_22, (Function1<? super C0LAB, ? extends C0LAB>) c214848196g, (C214848196g) str, (String) 9));
            Scene scene = c214848196g.LIZIZ;
            if ((scene instanceof VideoPublishContainerScene) && (videoPublishContainerScene = (VideoPublishContainerScene) scene) != null && videoPublishContainerScene.LLLLIILL != null && C855130Xgd.LIZ() != 0 && videoPublishContainerScene.LLLII) {
                videoPublishContainerScene.LLLII = false;
                C0ZI0 c0zi0 = videoPublishContainerScene.LLLILZJ;
                HandlerHook.viewPost(c0zi0, new ARunnableS114S0100000_14((Object) c0zi0, 32));
            }
        }
        ExpandTextViewModel expandTextViewModel = ((C214848196g) viewOnFocusChangeListenerC21523319Lb.l0).LJJIIZ;
        if (expandTextViewModel != null) {
            expandTextViewModel.LLJI.setValue(Boolean.valueOf(z));
        }
        ExpandedTitleModule expandedTitleModule = ((C214848196g) viewOnFocusChangeListenerC21523319Lb.l0).LJIILIIL;
        if (expandedTitleModule != null) {
            expandedTitleModule.LLIZLLLIL.setForbidAutoScrollToShowChild(!z);
            if (!expandedTitleModule.LLLZIL.LIZIZ) {
                int i = expandedTitleModule.LLLZIIL;
                if (i == 1) {
                    expandedTitleModule.LJJJIL(false);
                    return;
                }
                if (i != 1) {
                    expandedTitleModule.LJJJIL(z);
                    expandedTitleModule.LJJIZ();
                }
                if (z) {
                    return;
                }
                expandedTitleModule.LLLLIILLL.LLLFFI = false;
            }
        }
    }

    public static final void onFocusChange$2(ViewOnFocusChangeListenerC21523319Lb viewOnFocusChangeListenerC21523319Lb, View view, boolean z) {
        float f;
        if (z) {
            C214848196g c214848196g = (C214848196g) viewOnFocusChangeListenerC21523319Lb.l0;
            c214848196g.getClass();
            C0M2U c0m2u = C0M2U.LIZ;
            VideoPublishEditModel videoPublishEditModel = c214848196g.LIZ;
            c0m2u.getClass();
            C0M2U.LIZ(videoPublishEditModel, "title", null);
            C214848196g.LJIIIZ(c214848196g, "enter_title_text", new AwS601S0100000_22(c214848196g, 641), 2);
        }
        ExpandedTitleModule expandedTitleModule = ((C214848196g) viewOnFocusChangeListenerC21523319Lb.l0).LJIILIIL;
        if (expandedTitleModule != null) {
            expandedTitleModule.LLLLLLLLL = !z;
            if (z) {
                f = 0.34f;
            } else {
                f = 1.0f;
            }
            Iterator it2 = C1697810uHb.LJIIJJI(expandedTitleModule.LLLIZZ, expandedTitleModule.LLLJ, expandedTitleModule.LLLJIL, expandedTitleModule.LLLLII).iterator();
            while (it2.hasNext()) {
                C786410Ut5.B5((TuxTextView) it2.next(), f);
            }
            View view2 = expandedTitleModule.LLLLIIL;
            if (view2 != null) {
                C786410Ut5.T4(view2, f);
            }
            if (z) {
                C786410Ut5.LJLZ(8, expandedTitleModule.LLLIL);
                ViewGroup viewGroup = expandedTitleModule.LLLILZ;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
                C786410Ut5.LJLZ(0, expandedTitleModule.LLLILZLLLI);
                expandedTitleModule.LLLLIILLL.LJIIJ(false, true);
                DescIdeasModule.LJIIIZ(expandedTitleModule.LLLLIILLL, false, false, 6);
                expandedTitleModule.LJJIJIL(new C890640Ywo(EnumC890650Ywp.NONE, false));
            }
        }
        TextView textView = ((C214848196g) viewOnFocusChangeListenerC21523319Lb.l0).LJIIZILJ;
        if (textView != null) {
            if (z) {
                C786410Ut5.LJLLLLLL(0, textView);
            } else {
                C786410Ut5.LJLLLLLL(4, textView);
            }
        }
    }

    public static final void onFocusChange$3(ViewOnFocusChangeListenerC21523319Lb viewOnFocusChangeListenerC21523319Lb, View view, boolean z) {
        Editable editableLLLLJI;
        C21405318pn c21405318pn = (C21405318pn) viewOnFocusChangeListenerC21523319Lb.l0;
        boolean z2 = false;
        if (z && (editableLLLLJI = C2204961BRm.LLLLJI(c21405318pn.getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkjtr7urAAM9s8m4YhAOwpn4CaunvmGKYnQ==", null))) != null && editableLLLLJI.length() > 0) {
            z2 = true;
        }
        c21405318pn.setIndicatorVisible(z2);
    }

    public static final void onFocusChange$4(ViewOnFocusChangeListenerC21523319Lb viewOnFocusChangeListenerC21523319Lb, View view, boolean z) {
        ((C21296918Vz) viewOnFocusChangeListenerC21523319Lb.l0).LLLLIL().LJFF.invoke(Boolean.valueOf(z));
    }
}
