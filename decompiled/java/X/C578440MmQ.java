package X;

import Y.AObjectS241S0100000_8;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578440MmQ extends AbstractC2255721DQs<InterfaceC578430MmP> implements InterfaceC379610EuV, InterfaceC578430MmP {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 137));
    public final C560530Lyd<Boolean> LLILZLL;
    public final LiveEvent<Boolean> LLIZ;
    public final C560530Lyd<SwitchModePayload> LLIZLLLIL;
    public final C560530Lyd<Boolean> LLJ;
    public final LiveEvent<SwitchModePayload> LLJI;
    public final LiveEvent<Boolean> LLJIJIL;
    public final C560530Lyd<Unit> LLJILJIL;
    public final LiveEvent<Unit> LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public Bundle LLJJ;
    public final MutableLiveData<Boolean> LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C578440MmQ.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = 8;
    }

    public InterfaceC578430MmP W1() {
        return this;
    }

    private final AbstractC214814194y X1() {
        return (AbstractC214814194y) this.LLJILLL.getValue(this, LLJJIII[0]);
    }

    public final C578370MmJ Z1() {
        return (C578370MmJ) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC578430MmP
    public void e80() {
        this.LLJILJIL.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC578430MmP
    public void hide() {
        this.LLILZLL.LJIIJ(Boolean.FALSE);
    }

    @Override // X.InterfaceC578430MmP
    public void show() {
        this.LLILZLL.LJIIJ(Boolean.TRUE);
    }

    @Override // X.InterfaceC578430MmP
    public void K11() {
        Z1().LLLILZ();
    }

    @Override // X.InterfaceC578430MmP
    public void Ov1() {
        List<Scene> sceneList;
        NavigationScene navigationSceneLIZ;
        NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(Z1());
        if (navigationSceneLIZ2 == null || (sceneList = navigationSceneLIZ2.getSceneList()) == null) {
            return;
        }
        for (Scene scene : sceneList) {
            if ((scene instanceof ImageEditRootScene) && (navigationSceneLIZ = C1447800nmM.LIZ(scene)) != null) {
                navigationSceneLIZ.remove(scene);
            }
        }
    }

    @Override // X.InterfaceC578430MmP
    public ViewGroup.MarginLayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = Z1().mView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJJ = C571310Mav.LIZ(X1().mArguments);
        this.LLILLJJLI.add(this.LLILLL, Z1(), "ImageSwitchModeScene");
        SM2().LJII(this, Lifecycle.State.CREATED, new AObjectS241S0100000_8(this, 9));
        if (!this.LLILZ) {
            this.LLILLJJLI.hide(Z1());
        }
        if (C1462920oAk.LIZLLL()) {
            Z1().LLLILZ();
        }
    }

    @Override // X.InterfaceC578430MmP
    public Bundle BJ2() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC578430MmP
    public MutableLiveData<Boolean> Gc0() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC578430MmP
    public LiveEvent<Boolean> Nw() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC578430MmP
    public LiveEvent<Boolean> SM2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC578430MmP
    public LiveEvent<SwitchModePayload> Vh() {
        return this.LLJI;
    }

    @Override // X.InterfaceC578430MmP
    public LiveEvent<Unit> Yv0() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC578430MmP
    public void Ng0(Bundle bundle, Function1<? super Bundle, Unit> function1) {
        function1.invoke(bundle);
        X1().mArguments = bundle;
        Bundle bundle2 = this.LLJJ;
        if (bundle2 != null) {
            function1.invoke(bundle2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    @Override // X.InterfaceC578430MmP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void xL2(com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload r6, android.os.Bundle r7) {
        /*
            r5 = this;
            X.0Lyd<java.lang.Boolean> r1 = r5.LLJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LJIIJ(r0)
            X.0MmJ r4 = r5.Z1()
            r4.getClass()
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0M6F r2 = r0.LJI()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r4.getEditModel()
            java.lang.String r0 = "video_photo_switch"
            r2.LJFF(r1, r0)
            boolean r0 = X.C0BXS.LIZ()
            if (r0 == 0) goto L5c
            boolean r0 = X.C298220BmW.LIZ()
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.getEditModel()
            boolean r0 = X.C1428470nHB.LJJZZI(r0)
            if (r0 == 0) goto L5c
            X.141Q r1 = X.C141Q.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.getEditModel()
            java.lang.String r0 = r0.getMMusicPath()
            r1.getClass()
            boolean r0 = X.C141Q.LJII(r0)
            if (r0 == 0) goto L5c
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            X.0MmR r2 = new X.0MmR
            r1 = 0
            r2.<init>(r4, r7, r6, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
        L56:
            X.0Lyd<com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload> r0 = r5.LLIZLLLIL
            r0.LJIIJ(r6)
            return
        L5c:
            kotlin.jvm.internal.AwS374S0200000_8 r1 = new kotlin.jvm.internal.AwS374S0200000_8
            r0 = 36
            r1.<init>(r4, r6, r0)
            r4.LLLII(r7, r1)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578440MmQ.xL2(com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload, android.os.Bundle):void");
    }

    public C578440MmQ(C1DRG c1drg, C19A3 c19a3, int i, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        this.LLILZ = z;
        C560530Lyd<Boolean> c560530Lyd = new C560530Lyd<>();
        this.LLILZLL = c560530Lyd;
        this.LLIZ = c560530Lyd;
        C560530Lyd<SwitchModePayload> c560530Lyd2 = new C560530Lyd<>();
        this.LLIZLLLIL = c560530Lyd2;
        C560530Lyd<Boolean> c560530Lyd3 = new C560530Lyd<>();
        this.LLJ = c560530Lyd3;
        this.LLJI = c560530Lyd2;
        this.LLJIJIL = c560530Lyd3;
        C560530Lyd<Unit> c560530Lyd4 = new C560530Lyd<>();
        this.LLJILJIL = c560530Lyd4;
        this.LLJILJILJ = c560530Lyd4;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJJI = new MutableLiveData<>();
    }
}
