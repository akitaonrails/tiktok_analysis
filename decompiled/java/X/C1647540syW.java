package X;

import Y.AObjectS246S0100000_25;
import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import zoo.b;

/* JADX INFO: renamed from: X.0syW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647540syW extends AbstractC2255721DQs<InterfaceC1647000sxe> implements InterfaceC1647000sxe, InterfaceC379610EuV {
    public static final C1647560syY LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final int LLILLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C0MGL.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public boolean LLJ = true;
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final HashSet<String> LLJIJIL = new HashSet<>();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(159));
    public final q LLJILJILJ = (q) getDiContainer().LJIIL(null, q.class);

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0syY] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647540syW.class, "gestureLogicComponent", "getGestureLogicComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1647540syW.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0), new C2217381BqS(C1647540syW.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1647540syW.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};
        LLJILLL = new Object() { // from class: X.0syY
        };
        LLJJI = 8;
    }

    public InterfaceC1647000sxe X1() {
        return this;
    }

    private final InterfaceC1648020szI G2() {
        return (InterfaceC1648020szI) this.LLJI.getValue(this, LLJJ[3]);
    }

    private final InterfaceC1648510t05 o2() {
        return (InterfaceC1648510t05) this.LLILZ.getValue(this, LLJJ[0]);
    }

    public final C0MGL Z1() {
        return (C0MGL) this.LLILZIL.getValue(this, LLJJ[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZLL.getValue(this, LLJJ[2]);
    }

    public final float w2() {
        return ((Number) this.LLJILJIL.getValue()).floatValue();
    }

    public final boolean W1() {
        q qVar;
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        Iterator<TimeSpeedModelExtension> it2 = getShortVideoContext().LIZJ().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            z = !TextUtils.isEmpty(it2.next().getStickerId());
        }
        return Boolean.valueOf(z).booleanValue() || !((qVar = this.LLJILJILJ) == null || (liveEventMa2 = qVar.Ma2()) == null || liveEventMa2.LJI() == null || !(this.LLJILJILJ.Ma2().LJI() instanceof C1627370sRz));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Iterator it2 = C1697810uHb.LJIIJJI(EnumC1647570syZ.PHOTO_SHORT.getTag(), EnumC1647570syZ.RECORD_COMBINE.getTag(), EnumC1647570syZ.RECORD_COMBINE_15.getTag(), EnumC1647570syZ.RECORD_COMBINE_60.getTag(), EnumC1647570syZ.RECORD_COMBINE_180.getTag(), EnumC1647570syZ.RECORD_SPLIT_3MIN.getTag(), EnumC1647570syZ.RECORD_SPLIT_LIGHTENING.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_QUICK.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_PHOTO_AND_VIDEO.getTag(), EnumC1647570syZ.NEW_BOTTOM_STORY.getTag(), EnumC1647570syZ.NEW_BOTTOM_DM_CAMERA.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_DM_PHOTO.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_DM_VIDEO.getTag(), EnumC1647570syZ.RECORD_NOW.getTag()).iterator();
        while (it2.hasNext()) {
            this.LLJIJIL.add((String) it2.next());
        }
        this.LL.requireViewById(this.LLILLL);
        o2().AL1(new AbstractC21664519qV() { // from class: X.0syX
            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final void LJFF(b bVar) {
                this.LL.LLIZLLLIL = false;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LJJLIIIJLJLI(float f) {
                this.LL.LLIZLLLIL = false;
                return false;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LLLZLZ(b bVar) {
                C1647540syW c1647540syW = this.LL;
                if (!c1647540syW.LLJ || bVar == null || c1647540syW.W1()) {
                    return false;
                }
                Activity activityLJII = C1664590tQ1.LJII(this.LL);
                if (C20622515mp.LIZJ(activityLJII) == null && (activityLJII instanceof C08B7)) {
                    return false;
                }
                C1647540syW c1647540syW2 = this.LL;
                if (c1647540syW2.LLIZLLLIL) {
                    boolean enableSwipeUpExitGesture = c1647540syW2.getShortVideoContext().creativeModel.storyModel.getEnableSwipeUpExitGesture();
                    float fLJII = bVar.LJII();
                    C1647540syW c1647540syW3 = this.LL;
                    String str = "swipe_down";
                    if (fLJII - c1647540syW3.LLIZ < c1647540syW3.w2()) {
                        if (enableSwipeUpExitGesture && this.LL.LLIZ - bVar.LJII() >= this.LL.w2()) {
                            str = "swipe_up";
                        }
                    }
                    if (this.LL.getShortVideoContext().LJII() > 0) {
                        return false;
                    }
                    C1647540syW c1647540syW4 = this.LL;
                    c1647540syW4.LLIZ = 0.0f;
                    c1647540syW4.Z1().BB2(str);
                    this.LL.LLIZLLLIL = false;
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                this.LL.LLIZLLLIL = false;
                return false;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onUp(MotionEvent motionEvent) {
                this.LL.LLIZLLLIL = false;
                return false;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                C1647540syW c1647540syW = this.LL;
                if (!c1647540syW.LLJ) {
                    return false;
                }
                c1647540syW.LLIZLLLIL = true;
                if (bVar != null) {
                    f2 = bVar.LJII();
                }
                c1647540syW.LLIZ = f2;
                return false;
            }
        }, 18, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        G2().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 193));
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        boolean z = false;
        if (((Boolean) C0B9N.LIZ.getValue()).booleanValue()) {
            NK1(false);
            return;
        }
        if (!getShortVideoContext().LJJJJLL() && !getShortVideoContext().mIsFromDraft && !C1443960ngA.LJII(getShortVideoContext()) && !getShortVideoContext().cameraComponentModel.isRetakeMode && !getShortVideoContext().LJJJJZ() && !getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
            C1653330t7r currentBottomTabItem = G2().getCurrentBottomTabItem();
            if (!Intrinsics.LJFF(currentBottomTabItem != null ? currentBottomTabItem.LIZIZ : null, "record_mode_editor_tab")) {
                C1653330t7r currentBottomTabItem2 = G2().getCurrentBottomTabItem();
                if (!Intrinsics.LJFF(currentBottomTabItem2 != null ? currentBottomTabItem2.LIZIZ : null, "record_mode_mv")) {
                    z = true;
                }
            }
        }
        NK1(z);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1647000sxe
    public void NK1(boolean z) {
        this.LLJ = z;
    }

    public C1647540syW(C19A3 c19a3, C1DRG c1drg, int i) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
    }
}
