package X;

import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0jxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300910jxR extends AbstractC2255721DQs<InterfaceC558220Luu> implements InterfaceC558220Luu, InterfaceC379610EuV {
    public static final C1300920jxS LLJILLL = new Object() { // from class: X.0jxS
    };
    public static final int LLJJ = 8;
    public final C1DRG LL;
    public final InterfaceC558220Luu LLILLJJLI = this;
    public RadiusLayout LLILLL;
    public TextureViewSurfaceTextureListenerC1288630jdd LLILZ;
    public C1295960jpS LLILZIL;
    public TextSwitcher LLILZLL;
    public SmartImageView LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public int LLJI;
    public String[] LLJIJIL;
    public Runnable LLJILJIL;
    public Runnable LLJILJILJ;

    @Override // X.InterfaceC558220Luu
    public void Uz() {
        InterfaceC1288650jdf player;
        this.LLJ = null;
        RadiusLayout radiusLayout = this.LLILLL;
        if (radiusLayout != null) {
            C337180DJs.LIZ(radiusLayout);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILZ;
        if (textureViewSurfaceTextureListenerC1288630jdd != null && (player = textureViewSurfaceTextureListenerC1288630jdd.getPlayer()) != null) {
            player.pause();
        }
        C1295960jpS c1295960jpS = this.LLILZIL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        TextSwitcher textSwitcher = this.LLILZLL;
        if (textSwitcher != null) {
            HandlerHook.viewRemoveCallbacks(textSwitcher, this.LLJILJIL);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = this.LLILZ;
        if (textureViewSurfaceTextureListenerC1288630jdd2 != null) {
            HandlerHook.viewRemoveCallbacks(textureViewSurfaceTextureListenerC1288630jdd2, this.LLJILJILJ);
        }
        this.LLJILJILJ = null;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        TextSwitcher textSwitcher = this.LLILZLL;
        if (textSwitcher != null) {
            HandlerHook.viewRemoveCallbacks(textSwitcher, this.LLJILJIL);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILZ;
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            HandlerHook.viewRemoveCallbacks(textureViewSurfaceTextureListenerC1288630jdd, this.LLJILJILJ);
        }
        this.LLJILJILJ = null;
        this.LLJILJIL = null;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = this.LLILZ;
        if (textureViewSurfaceTextureListenerC1288630jdd2 != null) {
            textureViewSurfaceTextureListenerC1288630jdd2.release();
        }
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLILLL = null;
    }

    public InterfaceC558220Luu Z1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1300910jxR(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        r2 = r2.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("file:///");
        r1.append(r2);
        r7 = X.C2188811AlT.LIZIZ(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G2(android.view.View r11) {
        /*
            r10 = this;
            r0 = 2131363489(0x7f0a06a1, float:1.8346788E38)
            android.view.View r4 = r11.findViewById(r0)
            X.0jdd r4 = (X.TextureViewSurfaceTextureListenerC1288630jdd) r4
            r10.LLILZ = r4
            if (r4 == 0) goto Lc7
            r0 = 1
            r4.setIgnoreAttachStatus(r0)
            X.0kFB r0 = X.EnumC1311910kFB.FILL
            r4.setObjectFit(r0)
            X.0jdf r0 = r4.getPlayer()
            com.lynx.animax.ui.AnimaXContext r0 = r0.getAnimaXContext()
            com.lynx.animax.ability.BaseAbility r0 = r0.getAbility()
            X.0jYr r2 = r0.LIZLLL
            r0 = 32
            r2.LIZJ = r0
            X.0jdf r2 = r4.getPlayer()
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            r2.setMaxFrameRate(r0)
            X.0jdf r8 = r4.getPlayer()
            X.0Mcu r0 = X.C572540Mcu.LIZ
            r0.getClass()
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r7 = 0
            java.lang.String r0 = X.C572540Mcu.LIZJ(r7)
            r2.append(r0)
            java.lang.String r1 = java.io.File.separator
            r2.append(r1)
            java.lang.String r0 = "animex"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r1)
            java.io.File[] r9 = r0.listFiles()
            r3 = 0
            if (r9 == 0) goto La1
            int r6 = r9.length     // Catch: java.lang.Throwable -> L8f
            r5 = 0
        L65:
            if (r5 >= r6) goto La1
            r2 = r9[r5]     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "phototext_aitext_animax_2x.json"
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r3)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L8c
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto La1
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "file:///"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            r1.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r7 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8f
            goto La1
        L8c:
            int r5 = r5 + 1
            goto L65
        L8f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.C189200o6.m5exceptionOrNullimpl(r0)
            X.C189200o6.m1boximpl(r0)
        La1:
            r8.setSrc(r7)
            X.0jdf r1 = r4.getPlayer()
            X.0jcq r0 = new X.0jcq
            r0.<init>()
            r1.LJIIIIZZ(r0)
            X.0jdf r0 = r4.getPlayer()
            r0.setAutoPlay(r3)
            X.0jdf r0 = r4.getPlayer()
            r0.setLoop(r3)
            X.0jdf r1 = r4.getPlayer()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setSpeed(r0)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1300910jxR.G2(android.view.View):void");
    }

    private final void H2(View view) {
        File[] fileArrListFiles;
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.g3i);
        this.LLILZIL = c1295960jpS;
        if (c1295960jpS != null) {
            C572540Mcu.LIZ.getClass();
            if (!C277600AuM.LIZ() && (fileArrListFiles = new C0VSJ(C572540Mcu.LIZJ(null)).listFiles()) != null) {
                try {
                    for (File file : fileArrListFiles) {
                        if (a0.LJJIIZI(file.getAbsolutePath(), "phototext_ai_dot.json", false)) {
                            C1294250jmh.LJ(new C0VSP(file), "phototext_ai_dot.json").LIZIZ(new C1339380kxU(c1295960jpS, 0));
                            c1295960jpS.setRepeatCount(-1);
                            return;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    C189200o6.m1boximpl(c098200Yq);
                }
            }
        }
    }

    private final String[] W1(Context context) {
        String[] strArr = this.LLJIJIL;
        if (strArr == null) {
            strArr = new String[]{context.getString(2131821526), context.getString(2131821523), context.getString(2131821525), context.getString(2131821524), context.getString(2131821522)};
        }
        this.LLJIJIL = strArr;
        return strArr;
    }

    private final void o2(final TextSwitcher textSwitcher) {
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: X.0tO4
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                TuxTextView tuxTextView = new TuxTextView(textSwitcher.getContext(), null, 6, 0);
                tuxTextView.setTuxFont(23);
                tuxTextView.setTextColorRes(R.attr.zk);
                tuxTextView.setGravity(17);
                tuxTextView.setTextAlignment(4);
                C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-1, -2));
                return tuxTextView;
            }
        });
        if (!C277600AuM.LIZ()) {
            PathInterpolator pathInterpolator = new PathInterpolator(0.84f, 0.0f, 0.16f, 1.0f);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setInterpolator(pathInterpolator);
            translateAnimation.setDuration(1000L);
            textSwitcher.setInAnimation(translateAnimation);
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation2.setInterpolator(pathInterpolator);
            translateAnimation2.setDuration(1000L);
            textSwitcher.setOutAnimation(translateAnimation2);
        }
        textSwitcher.setCurrentText(textSwitcher.getContext().getString(2131821526));
    }

    @Override // X.InterfaceC558220Luu
    public void Ys(View view) {
        RadiusLayout radiusLayout = (RadiusLayout) view.findViewById(R.id.asz);
        this.LLILLL = radiusLayout;
        if (radiusLayout != null) {
            radiusLayout.setRadius(C1300930jxT.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0.0f));
        }
        TextSwitcher textSwitcher = (TextSwitcher) view.findViewById(R.id.as0);
        this.LLILZLL = textSwitcher;
        if (textSwitcher != null) {
            o2(textSwitcher);
        }
        if (!C277600AuM.LIZ()) {
            G2(view);
            H2(view);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2210908lP(this, view, null), 3);
        }
    }

    @Override // X.InterfaceC558220Luu
    public void j3(int i) {
        this.LLIZLLLIL = i;
    }

    private final void w2(TextSwitcher textSwitcher, int i) {
        HandlerHook.viewRemoveCallbacks(textSwitcher, this.LLJILJIL);
        this.LLJI = i / 20;
        textSwitcher.setCurrentText(X1(textSwitcher.getContext(), this.LLJI));
        if (this.LLJI > 4) {
            return;
        }
        ARunnableS89S0200000_20 aRunnableS89S0200000_20 = new ARunnableS89S0200000_20(textSwitcher, this, 59);
        this.LLJILJIL = aRunnableS89S0200000_20;
        HandlerHook.viewRemoveCallbacks(textSwitcher, aRunnableS89S0200000_20);
        HandlerHook.viewPostDelay(textSwitcher, this.LLJILJIL, 8000L);
    }

    public final String X1(Context context, int i) {
        String[] strArrW1 = W1(context);
        if (i > 0) {
            if (i > 4) {
                i = 4;
            }
        } else {
            i = 0;
        }
        return strArrW1[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // X.InterfaceC558220Luu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qS1(java.lang.String r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
        /*
            r5 = this;
            java.lang.String r0 = r5.LLJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L9
            return
        L9:
            r5.LLJ = r6
            com.bytedance.lighten.loader.SmartImageView r0 = r5.LLIZ
            if (r0 == 0) goto L12
            X.C337180DJs.LIZJ(r0)
        L12:
            com.bytedance.tux.widget.RadiusLayout r0 = r5.LLILLL
            if (r0 == 0) goto L19
            X.C337180DJs.LIZJ(r0)
        L19:
            X.0jdd r4 = r5.LLILZ
            if (r4 == 0) goto L45
            java.lang.Runnable r0 = r5.LLJILJILJ
            com.bytedance.bpea.transmit.hook.HandlerHook.viewRemoveCallbacks(r4, r0)
            X.0jdf r3 = r4.getPlayer()
            boolean r2 = r3.oi()
            int r0 = r5.LLIZLLLIL
            float r1 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r3.setProgress(r1)
            r3.play()
            if (r2 == 0) goto L5b
            Y.ARunnableS53S0300000_20 r1 = new Y.ARunnableS53S0300000_20
            r0 = 15
            r1.<init>(r4, r7, r5, r0)
            r5.LLJILJILJ = r1
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L43:
            if (r0 != 0) goto L4a
        L45:
            if (r7 == 0) goto L4a
            r7.invoke()
        L4a:
            X.0jpS r0 = r5.LLILZIL
            if (r0 == 0) goto L51
            r0.playAnimation()
        L51:
            android.widget.TextSwitcher r1 = r5.LLILZLL
            if (r1 == 0) goto L5a
            int r0 = r5.LLIZLLLIL
            r5.w2(r1, r0)
        L5a:
            return
        L5b:
            if (r7 == 0) goto L4a
            r7.invoke()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1300910jxR.qS1(java.lang.String, kotlin.jvm.functions.Function0):void");
    }
}
