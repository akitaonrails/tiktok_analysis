package Y;

import X.C0FUK;
import X.C1402840mbq;
import X.C20684815ws;
import X.C2344009Gk;
import X.C390390FSj;
import X.C785410UrT;
import X.InterfaceC1461390o8H;
import X.ProgressDialogC1397800mTi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zoo.b;

/* JADX INFO: loaded from: classes23.dex */
public class AObjectS316S0200000_22 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS316S0200000_22 aObjectS316S0200000_22, Object obj) {
        C0FUK c0fuk;
        final VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aObjectS316S0200000_22.l0;
        InterfaceC1461390o8H interfaceC1461390o8H = (InterfaceC1461390o8H) aObjectS316S0200000_22.l1;
        vEVideoPublishPreviewScene.LLLLZLL(vEVideoPublishPreviewScene.findViewById(R.id.view_frame_cover));
        vEVideoPublishPreviewScene.LLLLLLLLL();
        C390390FSj c390390FSj = vEVideoPublishPreviewScene.LLLLLZ.LJFF;
        if (c390390FSj != null) {
            c0fuk = c390390FSj.LJIIIIZZ;
        } else {
            c0fuk = null;
        }
        GestureInteractItem gestureInteractItem = new GestureInteractItem(100, null, c0fuk, false);
        GestureInteractItem gestureInteractItem2 = new GestureInteractItem(50, null, new GestureLayout$OnGestureListener() { // from class: X.0o9M
            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean E2(C21645419nQ c21645419nQ) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZIZ(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZLLL() {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJ() {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJFF(b bVar) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJIIIZ(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJIJJ(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJJIJIIJIL(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJJLIIIJLJLI(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLJI(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void onTouchEvent(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                vEVideoPublishPreviewScene.LLLLZ();
                return true;
            }
        }, false);
        interfaceC1461390o8H.LIZIZ(gestureInteractItem);
        interfaceC1461390o8H.LIZIZ(gestureInteractItem2);
        return null;
    }

    public static final Object invoke$1(AObjectS316S0200000_22 aObjectS316S0200000_22, Object obj) {
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) aObjectS316S0200000_22.l0;
        Bitmap bitmap = (Bitmap) aObjectS316S0200000_22.l1;
        Bitmap bitmap2 = (Bitmap) obj;
        if (bitmap2 != null) {
            chooseCoverActivity.LLIZ.setImageBitmap(bitmap2);
            return null;
        }
        chooseCoverActivity.LLIZ.setImageBitmap(bitmap);
        return null;
    }

    public static final Object invoke$2(AObjectS316S0200000_22 aObjectS316S0200000_22, Object obj) {
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) aObjectS316S0200000_22.l0;
        Bitmap bitmap = (Bitmap) aObjectS316S0200000_22.l1;
        Bitmap bitmap2 = (Bitmap) obj;
        if (bitmap2 != null) {
            chooseCoverActivity.LLILZIL.setImageBitmap(bitmap2);
            return null;
        }
        chooseCoverActivity.LLILZIL.setImageBitmap(bitmap);
        return null;
    }

    public static final Object invoke$3(AObjectS316S0200000_22 aObjectS316S0200000_22, Object obj) {
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) aObjectS316S0200000_22.l0;
        Function1 function1 = (Function1) aObjectS316S0200000_22.l1;
        Boolean bool = (Boolean) obj;
        vEChooseVideoCoverFragment.getClass();
        if (bool != null && bool.booleanValue() && vEChooseVideoCoverFragment.LLJLL != null) {
            ProgressDialogC1397800mTi progressDialogC1397800mTi = vEChooseVideoCoverFragment.LLL;
            if (progressDialogC1397800mTi != null) {
                progressDialogC1397800mTi.dismiss();
                C785410UrT.LIZ(progressDialogC1397800mTi);
                vEChooseVideoCoverFragment.VR(false);
            }
            vEChooseVideoCoverFragment.LLJLIL.removeCallbacksAndMessages(null);
            if (vEChooseVideoCoverFragment.getFragmentManager() == null) {
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
            } else {
                vEChooseVideoCoverFragment.LLJLL.LLIIIZ(false);
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS316S0200000_22 aObjectS316S0200000_22, Object obj) {
        Activity activity = (Activity) aObjectS316S0200000_22.l0;
        C1402840mbq c1402840mbq = (C1402840mbq) aObjectS316S0200000_22.l1;
        ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).finishCurrentPage(activity);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("channel", c1402840mbq.mClientKey);
        c2344009Gk.LJIIIIZZ("sdk_name", c1402840mbq.getSdkNameForServer());
        c2344009Gk.LJIIIIZZ("sdk_version", c1402840mbq.mSdkVersion);
        c2344009Gk.LJIIIIZZ("launch_method", "share_to_dm");
        C20684815ws.LJIILLIIL("stay_in_tt", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public AObjectS316S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
