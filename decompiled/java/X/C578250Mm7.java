package X;

import Y.AObserverS173S0200000_8;
import Y.ARunnableS77S0200000_8;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.creative.model.edit.VideoImageSeparateSwitchModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578250Mm7 extends AbstractC2255721DQs<InterfaceC578500MmW> implements InterfaceC379610EuV, InterfaceC578500MmW {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C1DRG LL;
    public final Function1<Function0<Unit>, Unit> LLILLJJLI;
    public C578340MmG LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJJ;
    public Runnable LLJJI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C1439810nZT.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0LGI.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453410nvP.class, null);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 141));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 142));

    public InterfaceC578500MmW o2() {
        return this;
    }

    @Override // X.InterfaceC578500MmW
    public void zC1() {
        this.LLJILJILJ = true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C578250Mm7.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C578250Mm7.class, "imageEditPageData", "getImageEditPageData()Lcom/ss/android/ugc/aweme/image/switchmode/ImageEditPageData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C578250Mm7.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C578250Mm7.class, "switchUIApi", "getSwitchUIApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageVideoSeparateModeSwitchedTipsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C578250Mm7.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C578250Mm7.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C578250Mm7.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C578250Mm7.class, "imageProgressApi", "getImageProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJJIJI = 8;
    }

    private final InterfaceC1451520nsM G2() {
        return (InterfaceC1451520nsM) this.LLJ.getValue(this, LLJJIII[6]);
    }

    private final InterfaceC1453410nvP W2() {
        return (InterfaceC1453410nvP) this.LLJI.getValue(this, LLJJIII[7]);
    }

    private final void X1() {
        E3(new AwS552S0100000_8(this, 140));
    }

    private final C578340MmG Z1() {
        return new C578340MmG(C1BNE.LIZ(EnumC578300MmC.START));
    }

    private final AbstractC214814194y i3() {
        return (AbstractC214814194y) this.LLILZIL.getValue(this, LLJJIII[2]);
    }

    private final InterfaceC1453420nvQ w2() {
        return (InterfaceC1453420nvQ) this.LLIZ.getValue(this, LLJJIII[4]);
    }

    public final InterfaceC1455860nzM H2() {
        return (InterfaceC1455860nzM) this.LLIZLLLIL.getValue(this, LLJJIII[5]);
    }

    public final C1439810nZT T2() {
        return (C1439810nZT) this.LLILZ.getValue(this, LLJJIII[1]);
    }

    public final InterfaceC578210Mm3 c3() {
        return (InterfaceC578210Mm3) this.LLJILLL.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJJIII[0]);
    }

    public final C0LGI m3() {
        return (C0LGI) this.LLILZLL.getValue(this, LLJJIII[3]);
    }

    public final boolean q3() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        c3().init();
        VideoImageSeparateSwitchModel videoImageSeparateSwitchModel = getEditModel().creativeModel.videoImageSeparateSwitchModel;
        boolean z = false;
        if (videoImageSeparateSwitchModel != null && videoImageSeparateSwitchModel.hasUserCanceledMusic) {
            z = true;
        }
        this.LLJILJILJ = z;
        X1();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final void E3(Function0<Unit> function0) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C578260Mm8(function0, this, null), 3);
    }

    public final void B3(C578340MmG c578340MmG) {
        String str;
        InterfaceC332260D0u<EnumC578300MmC> interfaceC332260D0u = c578340MmG.LIZ;
        C578160Mly c578160Mly = new C578160Mly(System.currentTimeMillis(), this.LLJILJILJ);
        boolean zYV0 = w2().yV0();
        C578350MmH c578350MmH = C578350MmH.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        boolean zQ3 = q3();
        c578350MmH.getClass();
        Pair<Integer, Integer> pairLJJIIZ = C1416310mxZ.LJJIIZ(editModel);
        C0LAB c0lab = new C0LAB();
        if (zQ3) {
            str = "video";
        } else {
            str = "photo";
        }
        c0lab.LJ("to_type", str);
        c0lab.LIZ(zYV0 ? 1 : 0, "is_edited");
        c0lab.LIZ(pairLJJIIZ.getFirst().intValue(), "original_video_cnt");
        c0lab.LIZ(pairLJJIIZ.getSecond().intValue(), "original_pic_cnt");
        c0lab.LJ("shoot_way", editModel.mShootWay);
        c0lab.LJ("creation_id", editModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(editModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(editModel));
        c0lab.LIZ(editModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        C20684815ws.LJIILLIIL("switch_edit_page_type", c0lab.LIZ);
        C578350MmH.LIZIZ = false;
        if (C298220BmW.LIZ()) {
            C141Q c141q = C141Q.LIZ;
            String mMusicPath = getEditModel().getMMusicPath();
            c141q.getClass();
            if (C141Q.LJII(mMusicPath)) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C578240Mm6(this, c578160Mly, interfaceC332260D0u, null), 3);
                return;
            }
        }
        this.LLILLJJLI.invoke(new AwS252S0300000_8(this, (C578250Mm7) c578160Mly, (C578160Mly) interfaceC332260D0u, (InterfaceC332260D0u<EnumC578300MmC>) 6));
    }

    @Override // X.InterfaceC578500MmW
    public void BH0(Function1<? super InterfaceC346201Wa<? extends EnumC578300MmC>, Unit> function1) {
        C578340MmG c578340MmGZ1 = this.LLJILJIL;
        if (c578340MmGZ1 == null) {
            c578340MmGZ1 = Z1();
        }
        if (function1 != null) {
            function1.invoke(c578340MmGZ1.LIZ);
        }
        if (Intrinsics.LJFF(c578340MmGZ1, this.LLJILJIL)) {
            return;
        }
        this.LLJILJIL = c578340MmGZ1;
        W1(c578340MmGZ1.LIZ, i3().mView, this);
        InterfaceC1451520nsM interfaceC1451520nsMG2 = G2();
        if (interfaceC1451520nsMG2 != null) {
            interfaceC1451520nsMG2.m7("convert to another edit mode");
        }
        InterfaceC1453410nvP interfaceC1453410nvPW2 = W2();
        if (interfaceC1453410nvPW2 != null) {
            interfaceC1453410nvPW2.Qf0();
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJILLIZJL(getEditModel().creativeModel.editSaveLocalModel.flowId);
        if (this.LLJJ) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C578280MmA(this, c578340MmGZ1, null), 3);
        } else {
            this.LLJJI = new ARunnableS77S0200000_8(this, c578340MmGZ1, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C578250Mm7(C1DRG c1drg, Function1<? super Function0<Unit>, Unit> function1) {
        this.LL = c1drg;
        this.LLILLJJLI = function1;
    }

    private final void W1(InterfaceC346201Wa<? extends EnumC578300MmC> interfaceC346201Wa, View view, LifecycleOwner lifecycleOwner) {
        FrameLayout frameLayout = new FrameLayout(C1664590tQ1.LJIIIZ(this));
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: X.0MmF
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, -1, -1, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C578270Mm9(interfaceC346201Wa, popupWindow, view, null), 3);
    }

    public final <T> void v3(LiveData<T> liveData, LifecycleOwner lifecycleOwner, Observer<T> observer) {
        liveData.observe(lifecycleOwner, new AObserverS173S0200000_8(liveData, observer, 3));
    }
}
