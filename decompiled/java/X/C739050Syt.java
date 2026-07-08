package X;

import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ability.IPhotoFloatGuideAbility;
import com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryViewerListAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.ability.IStoryGuideUploadPanelAbility;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosFloatComponent;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS11S0100002_11;
import kotlin.jvm.internal.AwS242S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0Syt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C739050Syt extends C21648719nx {
    public final int $t;
    public Object l0;

    public static final boolean onDown$1(C739050Syt c739050Syt, MotionEvent motionEvent) {
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.$t) {
            case 1:
                return onDoubleTap$0(this, motionEvent);
            case 2:
            default:
                return super.onDoubleTap(motionEvent);
            case 3:
                return onDoubleTap$1(this, motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.$t) {
            case 1:
                return onDown$0(this, motionEvent);
            case 2:
            default:
                return super.onDown(motionEvent);
            case 3:
                return onDown$1(this, motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.$t) {
            case 0:
                return onFling$0(this, motionEvent, motionEvent2, f, f2);
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
            case 2:
                return onFling$1(this, motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.$t) {
            case 1:
                onLongPress$0(this, motionEvent);
                break;
            case 2:
            default:
                super.onLongPress(motionEvent);
                break;
            case 3:
                onLongPress$1(this, motionEvent);
                break;
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.$t) {
            case 1:
                return onSingleTapConfirmed$0(this, motionEvent);
            case 2:
            default:
                return super.onSingleTapConfirmed(motionEvent);
            case 3:
                return onSingleTapConfirmed$1(this, motionEvent);
        }
    }

    public C739050Syt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDoubleTap$0(C739050Syt c739050Syt, MotionEvent motionEvent) {
        if (((PostModePhotosComponent) c739050Syt.l0).LJJ()) {
            return false;
        }
        ((PostModePhotosComponent) c739050Syt.l0).LL.LJIIIIZZ.LLLIIII.postValue(new Pair<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY())));
        return false;
    }

    public static final boolean onDoubleTap$1(C739050Syt c739050Syt, MotionEvent motionEvent) {
        if (((C721130SQl) c739050Syt.l0).LLILLJJLI.LLILZLL.LJIIL()) {
            return super.onDoubleTap(motionEvent);
        }
        C721130SQl c721130SQl = (C721130SQl) c739050Syt.l0;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY() - ((Number) ((C721130SQl) c739050Syt.l0).LLILLL.getValue()).intValue();
        PostModeFullPageViewModel postModeFullPageViewModel = c721130SQl.LL.LJIIIZ;
        if (postModeFullPageViewModel != null) {
            postModeFullPageViewModel.withState(new AwS590S0100000_11(new AwS11S0100002_11(c721130SQl, rawX, rawY, 1), 593));
        }
        return super.onDoubleTap(motionEvent);
    }

    public static final boolean onDown$0(C739050Syt c739050Syt, MotionEvent motionEvent) {
        PostModePhotosComponent postModePhotosComponent = (PostModePhotosComponent) c739050Syt.l0;
        postModePhotosComponent.getClass();
        if (postModePhotosComponent instanceof PostModePhotosFloatComponent) {
            return true;
        }
        return super.onDown(motionEvent);
    }

    public static final void onLongPress$0(C739050Syt c739050Syt, MotionEvent motionEvent) {
        String str;
        if (((PostModePhotosComponent) c739050Syt.l0).LJJI()) {
            return;
        }
        ((PostModePhotosComponent) c739050Syt.l0).LL.LJIIIIZZ.LLLIIIL.setValue(Unit.LIZ);
        PostModePhotosComponent postModePhotosComponent = (PostModePhotosComponent) c739050Syt.l0;
        C0SRL c0srl = postModePhotosComponent.LL;
        C0SSI c0ssi = c0srl.LJIIIIZZ.LLLILZJ;
        if (c0ssi != null) {
            C19EG c19eg = c0srl.LIZIZ;
            Fragment fragment = c0srl.LIZ;
            Aweme aweme = postModePhotosComponent.LLILLJJLI.getAweme();
            PostModePhotosComponent postModePhotosComponent2 = (PostModePhotosComponent) c739050Syt.l0;
            PostModeDetailParams postModeDetailParams = postModePhotosComponent2.LL.LJII;
            if (postModeDetailParams != null) {
                str = postModeDetailParams.exploreFromGroupId;
            } else {
                str = null;
            }
            int i = postModePhotosComponent2.LLILLJJLI.isEnterGraphicDetail;
            final PostModePhotosComponent postModePhotosComponent3 = (PostModePhotosComponent) c739050Syt.l0;
            c0ssi.LIZ(c19eg, fragment, aweme, motionEvent, str, i, new C0HTT<C737030Svd>(postModePhotosComponent3) { // from class: X.0SO3
                public final WeakReference<PostModePhotosComponent> LL;

                {
                    this.LL = new WeakReference<>(postModePhotosComponent3);
                }

                @Override // X.C0HTT
                public final void LLIIL(C737030Svd c737030Svd) {
                    this.LL.get();
                }
            });
        }
    }

    public static final void onLongPress$1(C739050Syt c739050Syt, MotionEvent motionEvent) {
        String str;
        IPhotoNestHeaderAbility iPhotoNestHeaderAbility;
        IPhotoFloatGuideAbility iPhotoFloatGuideAbility = (IPhotoFloatGuideAbility) ((C721130SQl) c739050Syt.l0).LLILZIL.getValue();
        if (iPhotoFloatGuideAbility != null) {
            iPhotoFloatGuideAbility.LJJJJLL(false);
        }
        if (!((C721130SQl) c739050Syt.l0).LL.LJIIIIZZ.yQ2()) {
            C721130SQl c721130SQl = (C721130SQl) c739050Syt.l0;
            if (c721130SQl.LL.LJIIZILJ && (iPhotoNestHeaderAbility = (IPhotoNestHeaderAbility) c721130SQl.LLILZ.getValue()) != null && iPhotoNestHeaderAbility.c7()) {
                return;
            }
            C0SRL c0srl = ((C721130SQl) c739050Syt.l0).LL;
            if (c0srl.LJIIZILJ && c0srl.LJIIIIZZ.LLILZLL.getValue() != 0) {
                return;
            }
            ((C721130SQl) c739050Syt.l0).LL.LJIIIIZZ.LLLIIIL.setValue(Unit.LIZ);
            C0SRL c0srl2 = ((C721130SQl) c739050Syt.l0).LL;
            C0SSI c0ssi = c0srl2.LJIIIIZZ.LLLILZJ;
            if (c0ssi != null) {
                C19EG c19eg = c0srl2.LIZIZ;
                Fragment fragment = c0srl2.LIZ;
                Aweme aweme = c0srl2.LIZJ;
                PostModeDetailParams postModeDetailParams = c0srl2.LJII;
                if (postModeDetailParams != null) {
                    str = postModeDetailParams.exploreFromGroupId;
                } else {
                    str = null;
                }
                c0ssi.LIZ(c19eg, fragment, aweme, motionEvent, str, c0srl2.LJIIL.NR(), null);
            }
            super.onLongPress(motionEvent);
        }
    }

    public static final boolean onSingleTapConfirmed$0(C739050Syt c739050Syt, MotionEvent motionEvent) {
        PostModeFullPageViewModel postModeFullPageViewModel;
        if (C298560Bn4.LIZ() && ((PostModePhotosComponent) c739050Syt.l0).UH1()) {
            return true;
        }
        ((PostModePhotosComponent) c739050Syt.l0).LL.LJIIIIZZ.LLLIIIIL.postValue(new Pair<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY())));
        if (((PostModePhotosComponent) c739050Syt.l0).LJJIFFI()) {
            return true;
        }
        PostModePhotosComponent postModePhotosComponent = (PostModePhotosComponent) c739050Syt.l0;
        PostModeDetailParams postModeDetailParams = postModePhotosComponent.LL.LJII;
        if ((postModeDetailParams == null || postModeDetailParams.enableSingleClick) && (postModeFullPageViewModel = postModePhotosComponent.LLJI) != null) {
            postModeFullPageViewModel.withState(new AwS590S0100000_11(postModeFullPageViewModel, 594));
        }
        return true;
    }

    public static final boolean onSingleTapConfirmed$1(C739050Syt c739050Syt, MotionEvent motionEvent) {
        ((C721130SQl) c739050Syt.l0).LL.LJIIIIZZ.LLLIIIIL.postValue(new Pair<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY())));
        return super.onSingleTapConfirmed(motionEvent);
    }

    public static final boolean onFling$0(C739050Syt c739050Syt, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IStoryGuideUploadPanelAbility iStoryGuideUploadPanelAbility;
        if (motionEvent == null) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        if (motionEvent2.getRawY() - motionEvent.getRawY() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150))) {
            StoryGalleryActivity storyGalleryActivity = (StoryGalleryActivity) c739050Syt.l0;
            int rawX = (int) motionEvent2.getRawX();
            int rawY = (int) motionEvent2.getRawY();
            StoryViewerListAbility storyViewerListAbility = (StoryViewerListAbility) storyGalleryActivity.LLILLL.getValue();
            if (storyViewerListAbility == null || !storyViewerListAbility.isVisible() || !storyViewerListAbility.HH1(rawX, rawY) || storyViewerListAbility.FF() || ((iStoryGuideUploadPanelAbility = (IStoryGuideUploadPanelAbility) storyGalleryActivity.LLILZ.getValue()) != null && iStoryGuideUploadPanelAbility.sD0())) {
                AssemVMLazy assemVMLazy = ((StoryGalleryActivity) c739050Syt.l0).LLILLJJLI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StoryGalleryActivity.LLJILJIL;
                assemVMLazy.getValue().setState(new AwS242S0000000_11("slide_down", 3));
            }
            return true;
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public static final boolean onFling$1(C739050Syt c739050Syt, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float y;
        float y2;
        float x;
        float x2;
        Function1<? super Float, Boolean> function1;
        if (motionEvent != null && motionEvent2 != null) {
            if (((C0SU0) c739050Syt.l0).getEnableFlingCheckPosRaw()) {
                y = motionEvent2.getRawY();
                y2 = motionEvent.getRawY();
            } else {
                y = motionEvent2.getY();
                y2 = motionEvent.getY();
            }
            float f3 = y - y2;
            if (((C0SU0) c739050Syt.l0).getEnableFlingCheckPosRaw()) {
                x = motionEvent2.getRawX();
                x2 = motionEvent.getRawX();
            } else {
                x = motionEvent2.getX();
                x2 = motionEvent.getX();
            }
            float f4 = x - x2;
            if (f3 > ((C0SU0) c739050Syt.l0).getFlingSlideDeltaY() && Math.abs(f4) / f3 < 1.0f && !((C0SU0) c739050Syt.l0).canScrollVertically(-1) && (function1 = ((C0SU0) c739050Syt.l0).LLLII) != null) {
                function1.invoke(Float.valueOf(f2));
            }
        }
        return false;
    }
}
