package X;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451440nsE extends C0FUM implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final Scene LL;
    public final C1DRG LLILLJJLI;
    public final C1664740tQG LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1462760oAU LLIZ;
    public final C1466810oH1 LLILLL = new C1466810oH1(this, 12);
    public boolean LLIZLLLIL = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1451440nsE.class, "editStickerScene", "getEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerScene;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1451440nsE.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1451440nsE.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1451440nsE.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final VideoPublishEditModel LJJIJIL() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLJ[3]);
    }

    public final C1462070o9N LJJIJL() {
        return (C1462070o9N) this.LLILLL.getValue(this, LLJ[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        boolean z;
        InterfaceC1453420nvQ interfaceC1453420nvQ = (InterfaceC1453420nvQ) this.LLILZIL.getValue(this, LLJ[2]);
        if (interfaceC1453420nvQ != null && !interfaceC1453420nvQ.A8()) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C1462070o9N c1462070o9NLJJIJL;
        C1462070o9N c1462070o9NLJJIJL2;
        InterfaceC1455610nyx interfaceC1455610nyx;
        RectF rectFLIZLLL;
        LiveData<Pair<Boolean, Boolean>> liveDataX8;
        Pair<Boolean, Boolean> value;
        if (motionEvent != null && motionEvent.getEventTime() - motionEvent.getDownTime() < 500 && C306630C0f.LIZ() && C1428470nHB.LJJZZI(LJJIJIL()) && !LJJIJIL().creativeModel.storyModel.isStoryEntrance() && !C1416310mxZ.LJJJJZ(LJJIJIL()) && LJJIJL() != null && (c1462070o9NLJJIJL = LJJIJL()) != null && !c1462070o9NLJJIJL.LLLLLZ() && (c1462070o9NLJJIJL2 = LJJIJL()) != null && !c1462070o9NLJJIJL2.LLLLZLL() && (((interfaceC1455610nyx = (InterfaceC1455610nyx) this.LLILZ.getValue(this, LLJ[1])) == null || (liveDataX8 = interfaceC1455610nyx.x8()) == null || (value = liveDataX8.getValue()) == null || value.getFirst().booleanValue()) && this.LLIZLLLIL && !C1441080nbW.LIZIZ(LJJIJIL()))) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "photo_toolbar_collapse_mode", true, false) && C0C64.LJIILLIIL().LJIIIZ(31744, "photo_toolbar_collapse_optimize", true, false)) {
                C1664740tQG c1664740tQG = this.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
                InterfaceC1460000o62 interfaceC1460000o62 = (InterfaceC1460000o62) c1664740tQG.getValue(this, interfaceC2217461BqaArr[1]);
                if (interfaceC1460000o62 != null && interfaceC1460000o62.fi1()) {
                    InterfaceC1455610nyx interfaceC1455610nyx2 = (InterfaceC1455610nyx) this.LLILZ.getValue(this, interfaceC2217461BqaArr[1]);
                    if (interfaceC1455610nyx2 != null) {
                        interfaceC1455610nyx2.bo();
                    }
                    return true;
                }
            }
            if (motionEvent != null) {
                View view = this.LL.mView;
                if (view != null) {
                    rectFLIZLLL = C1428310nGv.LIZLLL(view);
                    rectFLIZLLL.top += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                    rectFLIZLLL.bottom -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                    if (C444960Hcc.LIZIZ()) {
                        rectFLIZLLL.left += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
                    } else {
                        rectFLIZLLL.right -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
                    }
                } else {
                    rectFLIZLLL = null;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (rectFLIZLLL != null && rectFLIZLLL.contains(rawX, rawY)) {
                    C1952807ks.LIZ.getClass();
                    C1952807ks.LIZIZ.storeBoolean(C1952807ks.LIZ("show_tap_to_add_text_guide"), false);
                    C1462070o9N c1462070o9NLJJIJL3 = LJJIJL();
                    if (c1462070o9NLJJIJL3 != null) {
                        C1462070o9N.LLLZLL(c1462070o9NLJJIJL3, null, null, 3);
                    }
                    u4.LJJLIIIIJ(LJJIJIL(), "tap_anywhere", 0, null, null, null, null, Boolean.FALSE, null, null, 888);
                    return true;
                }
            }
        }
        return this instanceof C1417630mzh;
    }

    public C1451440nsE(Scene scene, C1DRG c1drg) {
        this.LL = scene;
        this.LLILLJJLI = c1drg;
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453420nvQ.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLIZ = ((C1455080ny6) c1drg.LJII(C1455080ny6.class, null)).LL;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.LLIZ.setCanScroll(true);
        return this instanceof C1417630mzh;
    }
}
