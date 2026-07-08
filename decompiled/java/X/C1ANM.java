package X;

import Y.ARunnableS11S0202000_31;
import Y.ARunnableS12S0102000_31;
import Y.ARunnableS37S1100000_33;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import fyo.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS69S1300000_33;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ANM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ANM extends AbstractC1664490tPr<C1ANT, C1ANV> {
    public C1ANW LLJJJJJIL;
    public InterfaceC1484830ok5 LLJJJJLIIL;
    public TextureView LLJJL;
    public Surface LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public DialogC1389620mGW LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public final C547220LdA LLJJJIL = C547160Ld4.LIZLLL(C547160Ld4.LIZIZ(), C547300LdI.LIZJ, C548010LeR.LJII);
    public final C01GW<TTVideoEngine> LLJJJJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(297));
    public final C1ANR LLL = new InterfaceC1482530ogN() { // from class: X.1ANR
        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void Au(Surface surface) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void VK() {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void W1(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onLoopPlay(String str, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPause(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPrepare(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPrepared(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayRelease(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
        public final /* synthetic */ void onPreRenderReady(String str) {
            C490850JMt.LIZ(this, str);
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onSpeedChanged(String str, float f) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onStopPlay(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onVideoSecondFrame(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void uv(JSONObject jSONObject) {
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayCompleted(String str, int i) {
            this.LL.LLLLIL().LIZ.invoke();
        }

        @Override // X.InterfaceC1482530ogN
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            ConstraintLayout constraintLayout;
            C1ANM c1anm = this.LL;
            C1ANW c1anw = c1anm.LLJJJJJIL;
            if (c1anw != null && (constraintLayout = c1anw.LL) != null) {
                HandlerHook.viewPost(constraintLayout, new ARunnableS37S1100000_33(c1anm, str, 1));
            }
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            int i;
            String string;
            C1ANM c1anm = this.LL;
            C547220LdA.LIZJ(c1anm.LLJJJIL, new AwS69S1300000_33(c1481290oeN, str, c1anm, c1480430ocz, 1));
            C1ANM c1anm2 = this.LL;
            if (c1481290oeN != null) {
                i = c1481290oeN.LJ;
                string = c1481290oeN.toString();
                if (string == null) {
                }
                c1anm2.LLLLLLJ(i, string);
            }
            i = 0;
            if (c1480430ocz != null) {
                string = c1480430ocz.toString();
            } else {
                string = null;
            }
            c1anm2.LLLLLLJ(i, string);
        }

        @Override // X.InterfaceC1482530ogN
        public final void onVideoSizeChanged(String str, int i, int i2) {
            FrameLayout frameLayout;
            C1ANM c1anm = this.LL;
            c1anm.LLJZ = i;
            c1anm.LLJZIJLIL = i2;
            C1ANW c1anw = c1anm.LLJJJJJIL;
            if (c1anw != null && (frameLayout = c1anw.LLILZIL) != null) {
                HandlerHook.viewPost(frameLayout, new ARunnableS12S0102000_31(c1anm, i, i2, 2));
            }
        }
    };
    public final C1ANN LLLF = new InterfaceC1469360oL8() { // from class: X.1ANN
        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJJ(int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIJJLI(int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJII(int i, int i2) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJIIJ(int i, int i2) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJIJ(Map map) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJL(e eVar, String str) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJLIIIIJ(int i) {
        }

        @Override // X.InterfaceC1469360oL8
        public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJ(TTVideoEngine tTVideoEngine) {
            boolean z;
            int iIntValue;
            int iIntValue2;
            Integer numValueOf;
            DialogC1389620mGW dialogC1389620mGW = this.LL.LLJLILLLLZIIL;
            if (dialogC1389620mGW != null) {
                C0FNV.LIZ(dialogC1389620mGW);
            }
            long jCurrentTimeMillis = 0;
            if (this.LL.LLJLL > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.LL.LLJLL;
            }
            C547220LdA.LIZIZ(this.LL.LLJJJIL, new C20325714g3(jCurrentTimeMillis));
            C1ANM c1anm = this.LL;
            Integer numValueOf2 = Integer.valueOf(c1anm.LLJZ);
            if (numValueOf2.intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (tTVideoEngine != null && (numValueOf2 = Integer.valueOf(tTVideoEngine.LJJLJ())) != null)) {
                iIntValue = numValueOf2.intValue();
            } else {
                iIntValue = this.LL.LLLLILI().LIZ.LJI;
            }
            Integer numValueOf3 = Integer.valueOf(this.LL.LLJZIJLIL);
            if (numValueOf3.intValue() > 0) {
                iIntValue2 = numValueOf3.intValue();
            } else if (tTVideoEngine != null && (numValueOf = Integer.valueOf(tTVideoEngine.LJJLIIIJLLLLLLLZ())) != null) {
                iIntValue2 = numValueOf.intValue();
            } else {
                iIntValue2 = this.LL.LLLLILI().LIZ.LJII;
            }
            this.LL.LLLLLLLLL(c1anm.LLLLLJIL(iIntValue, iIntValue2));
            this.LL.LLLLIL().LIZLLL.invoke(Long.valueOf(jCurrentTimeMillis), this.LL.LLLLLLIL());
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJI(e eVar) {
            C1ANM c1anm = this.LL;
            C547220LdA.LIZJ(c1anm.LLJJJIL, new AwS399S0200000_33(eVar, c1anm, 52));
            this.LL.LLLLLLJ(eVar.LIZ, eVar.toString());
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIILL(TTVideoEngine tTVideoEngine) {
            this.LL.LLLLIL().LIZ.invoke();
        }

        @Override // X.InterfaceC1469360oL8
        public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
            FrameLayout frameLayout;
            C1ANM c1anm = this.LL;
            c1anm.LLJZ = i;
            c1anm.LLJZIJLIL = i2;
            C1ANW c1anw = c1anm.LLJJJJJIL;
            if (c1anw != null && (frameLayout = c1anw.LLILZIL) != null) {
                HandlerHook.viewPost(frameLayout, new ARunnableS12S0102000_31(c1anm, i, i2, 1));
            }
        }
    };

    public final String LLLLLLIL() {
        String str = this.LLJLIL;
        return (str == null || !C2286708xd.LIZJ(str)) ? "remote_url" : "local_file";
    }

    public final TTVideoEngine LLLLLLL() {
        return this.LLJJJJ.getValue();
    }

    public final void LLLLLLZ() {
        DialogC1389620mGW dialogC1389620mGW = this.LLJLILLLLZIIL;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        this.LLJLILLLLZIIL = null;
        this.LLJL = false;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJJJJLIIL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJJIIZ(this.LLL);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLJJJJLIIL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.stop();
        }
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LLJJJJLIIL;
        if (interfaceC1484830ok53 != null) {
            interfaceC1484830ok53.release();
        }
        this.LLJJJJLIIL = null;
        if (this.LLJJJJ.isInitialized() && !this.LLJLLL) {
            LLLLLLL().LLJILLL(null);
            LLLLLLL().release();
            this.LLJLLL = true;
        }
        Surface surface = this.LLJJLIIIJLLLLLLLZ;
        if (surface != null) {
            surface.release();
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJJL = null;
    }

    public final List<String> LLLLLLZZ() {
        List<String> listSingletonList;
        String str = this.LLJLIL;
        if (str != null && new C0VSJ(str).exists()) {
            return Collections.singletonList(str);
        }
        List<String> list = LLLLILI().LIZ.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (str2.length() > 0) {
                arrayList.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        String str3 = LLLLILI().LIZ.LIZJ;
        return (str3.length() <= 0 || (listSingletonList = Collections.singletonList(str3)) == null) ? C13BV.INSTANCE : listSingletonList;
    }

    public final String LLLLLL() {
        String strValueOf = LLLLILI().LIZ.LIZIZ;
        if (strValueOf.length() == 0) {
            strValueOf = LLLLILI().LIZ.LJ;
        }
        if (strValueOf.length() == 0) {
            strValueOf = String.valueOf(LLLLILI().LIZ.LIZJ.hashCode());
        }
        return new Regex("[^A-Za-z0-9_.-]").replace(strValueOf, "_");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJJIL.LIZ();
        LLLLLLZ();
    }

    public final void LLLLLLLLL(boolean z) {
        SmartImageView smartImageView;
        C1ANW c1anw = this.LLJJJJJIL;
        if (c1anw != null && (smartImageView = c1anw.LLILLL) != null) {
            FrameLayout frameLayout = c1anw.LLILZ;
            if (z && frameLayout != null) {
                C786410Ut5.y3(frameLayout.getViewTreeObserver(), new C16HK(frameLayout, smartImageView, 3));
            } else {
                C786410Ut5.LLFF(8, smartImageView);
            }
        }
    }

    public final void LLLLLLLLLL(String str) {
        FrameLayout frameLayout;
        SmartImageView smartImageView;
        final FrameLayout frameLayout2;
        SmartImageView smartImageView2;
        this.LLJLIL = str;
        if (C0BJ6.LIZ()) {
            C1ANW c1anw = this.LLJJJJJIL;
            if (c1anw != null && (frameLayout2 = c1anw.LLILZ) != null && this.LLJJJJLIIL == null) {
                C1088230eQP.LIZ(frameLayout2, 20.0f);
                LLLLLJIL(LLLLILI().LIZ.LJI, LLLLILI().LIZ.LJII);
                C1478410oZj c1478410oZj = new C1478410oZj();
                c1478410oZj.LIZIZ = true;
                InterfaceC1483820oiS interfaceC1483820oiS = new InterfaceC1483820oiS() { // from class: X.0olk
                    @Override // X.InterfaceC1483820oiS
                    public final boolean bn() {
                        return true;
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                        return null;
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ Surface getSurface() {
                        return null;
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ void hj() {
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final /* synthetic */ void pe() {
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final HashMap getParams() {
                        return new HashMap();
                    }

                    @Override // X.InterfaceC1483820oiS
                    public final FrameLayout getPlayViewContainer() {
                        return frameLayout2;
                    }
                };
                InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
                if (interfaceC1484830ok5LIZJ != null) {
                    interfaceC1484830ok5LIZJ.LIZJ(interfaceC1483820oiS);
                    interfaceC1484830ok5LIZJ.LJIIZILJ(this.LLL);
                    interfaceC1484830ok5LIZJ.setLoop(true);
                } else {
                    interfaceC1484830ok5LIZJ = null;
                }
                this.LLJJJJLIIL = interfaceC1484830ok5LIZJ;
                C1ANW c1anw2 = this.LLJJJJJIL;
                if (c1anw2 != null && (smartImageView2 = c1anw2.LLILLL) != null) {
                    smartImageView2.bringToFront();
                }
                if (this.LLJL) {
                    this.LLJL = false;
                    int i = C2178361ANe.LIZ[LLLLILI().LIZ.LIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            LLLLLLLZIL(false);
                            return;
                        }
                        return;
                    }
                    LLLLLLLZIL(true);
                    return;
                }
                return;
            }
            return;
        }
        C1ANW c1anw3 = this.LLJJJJJIL;
        if (c1anw3 == null || (frameLayout = c1anw3.LLILZ) == null || this.LLJJL != null) {
            return;
        }
        this.LLJLLL = false;
        C1088230eQP.LIZ(frameLayout, 20.0f);
        LLLLLJIL(LLLLILI().LIZ.LJI, LLLLILI().LIZ.LJII);
        TextureView textureView = new TextureView(frameLayout.getContext());
        C786410Ut5.V5(textureView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(textureView, 0);
        C1ANW c1anw4 = this.LLJJJJJIL;
        if (c1anw4 != null && (smartImageView = c1anw4.LLILLL) != null) {
            smartImageView.bringToFront();
        }
        this.LLJJL = textureView;
        final AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(this, 260);
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (surfaceTexture != null) {
            awS612S0100000_33.invoke(new Surface(surfaceTexture));
        } else {
            textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.1ANU
                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture2, int i2, int i3) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture2) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture2) {
                    Surface surface = this.LLJJLIIIJLLLLLLLZ;
                    if (surface != null) {
                        surface.release();
                    }
                    this.LLJJLIIIJLLLLLLLZ = null;
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture2, int i2, int i3) {
                    awS612S0100000_33.invoke(new Surface(surfaceTexture2));
                }
            });
        }
        LLLLLLL().LLJILLL(this.LLLF);
    }

    public final void LLLLLLLZIL(boolean z) {
        boolean z2;
        if (C0BJ6.LIZ()) {
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLJJJJLIIL;
            if (interfaceC1484830ok5 == null) {
                this.LLJL = true;
                return;
            }
            if (z) {
                List<String> listLLLLLLZZ = LLLLLLZZ();
                if (listLLLLLLZZ.isEmpty()) {
                    C547130Ld1.LIZIZ(null, C547300LdI.LIZ, "CameoPlayerScene", "MediaBox play skipped: empty playUrls", null);
                    return;
                }
                String strLLLLLL = LLLLLL();
                List<String> listLLLLLLZZ2 = LLLLLLZZ();
                String str = this.LLJLIL;
                if (str != null && new C0VSJ(str).exists()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String strLLLLLL2 = LLLLLL();
                C1482580ogS c1482580ogS = new C1482580ogS();
                c1482580ogS.LIZ = strLLLLLL2;
                C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                if (z2) {
                    c1058540deW.LIZJ = 0;
                }
                if (listLLLLLLZZ2.size() > 1) {
                    c1058540deW.LIZLLL = listLLLLLLZZ2;
                } else {
                    String str2 = (String) C13LP.LJJJLL(listLLLLLLZZ2);
                    if (str2 == null) {
                        str2 = "";
                    }
                    c1058540deW.LIZIZ(str2);
                }
                C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
                c1482570ogRLIZ.LIZ(EnumC1046760dLW.VIDEO);
                C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
                c1479570obb.LIZIZ = true;
                if (z2) {
                    c1479570obb.LJJIIZ = "mp4";
                }
                C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
                c1482580ogS2.LJ = c1482570ogRLIZ;
                C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogS2).LIZ();
                C547200Ld8 c547200Ld8 = C547300LdI.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MediaBox play: sourceId=");
                sbLIZ.append(strLLLLLL);
                sbLIZ.append(", url=");
                sbLIZ.append((String) C13LP.LJJJLL(listLLLLLLZZ));
                C547130Ld1.LIZ(null, c547200Ld8, "CameoPlayerScene", C2188811AlT.LIZIZ(sbLIZ));
                interfaceC1484830ok5.LJ(c1482560ogQLIZ);
                return;
            }
            interfaceC1484830ok5.resume();
            return;
        }
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            this.LLJL = true;
            return;
        }
        if (z) {
            String str3 = LLLLILI().LIZ.LIZJ;
            String str4 = this.LLJLIL;
            if (str4 != null && C2286708xd.LIZJ(str4)) {
                C547200Ld8 c547200Ld82 = C547300LdI.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setLocalURL: ");
                sbLIZ2.append(str4);
                C547130Ld1.LIZ(null, c547200Ld82, "CameoPlayerScene", C2188811AlT.LIZIZ(sbLIZ2));
                LLLLLLL().LJIJ(str4);
            } else {
                C547200Ld8 c547200Ld83 = C547300LdI.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setDirectURL: ");
                sbLIZ3.append(str3);
                C547130Ld1.LIZ(null, c547200Ld83, "CameoPlayerScene", C2188811AlT.LIZIZ(sbLIZ3));
                LLLLLLL().LJIJI(str3);
            }
        }
        LLLLLLL().play();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ANM.onActivityCreated(android.os.Bundle):void");
    }

    public final boolean LLLLLJIL(int i, int i2) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        int i3 = i2;
        int i4 = i;
        C1ANW c1anw = this.LLJJJJJIL;
        if (c1anw == null || (frameLayout = c1anw.LLILZIL) == null || (frameLayout2 = c1anw.LLILZ) == null) {
            return false;
        }
        if (i4 <= 0 || i3 <= 0) {
            i4 = 9;
            i3 = 16;
        }
        if (frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0) {
            return LLLLLJLJLL(frameLayout, i4, i3, frameLayout2);
        }
        HandlerHook.viewPost(frameLayout, new ARunnableS11S0202000_31(frameLayout, frameLayout2, i4, i3, 3));
        return false;
    }

    public final void LLLLLLJ(int i, String str) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "aikit_cameo_playback_error_fallback", true, true) && !this.LLJLLIL) {
            C546820LcW.LIZIZ.LIZ("CameoPlayerScene", "fallback download and playback");
            this.LLJLLIL = true;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1ANO(this, i, str, null), 3);
        } else {
            LLLLIL().LJ.invoke(Integer.valueOf(i), str, LLLLLLIL());
            DialogC1389620mGW dialogC1389620mGW = this.LLJLILLLLZIIL;
            if (dialogC1389620mGW == null) {
                return;
            }
            C0FNV.LIZ(dialogC1389620mGW);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ((C19EG) requireActivity());
        tuxImmersionBarLJ.LIZ(true);
        tuxImmersionBarLJ.LJIIIZ(0);
        tuxImmersionBarLJ.LIZIZ.LJIIJ(true);
        tuxImmersionBarLJ.LIZIZ.LJII(true);
        tuxImmersionBarLJ.LJ(R.attr.e1);
        tuxImmersionBarLJ.LIZLLL();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.nu, viewGroup, false);
        int i = R.id.bhx;
        C427660Gpo c427660Gpo = (C427660Gpo) C1616006Uk.LIZ(R.id.bhx, viewTd);
        if (c427660Gpo != null) {
            i = R.id.d9i;
            if (C1616006Uk.LIZ(R.id.d9i, viewTd) != null) {
                i = R.id.d9j;
                SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.d9j, viewTd);
                if (smartImageView != null) {
                    i = R.id.d9k;
                    FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.d9k, viewTd);
                    if (frameLayout != null) {
                        i = R.id.d9l;
                        FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.d9l, viewTd);
                        if (frameLayout2 != null) {
                            i = R.id.zbl;
                            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.zbl, viewTd);
                            if (tuxTextView != null) {
                                i = R.id.zbm;
                                TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.zbm, viewTd);
                                if (tuxTextView2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
                                    final C1ANW c1anw = new C1ANW(constraintLayout, c427660Gpo, smartImageView, frameLayout, frameLayout2, tuxTextView, tuxTextView2);
                                    this.LLJJJJJIL = c1anw;
                                    C1088230eQP.LIZ(frameLayout, 20.0f);
                                    C1331070kk5 hierarchy = smartImageView.getHierarchy();
                                    if (hierarchy != null) {
                                        hierarchy.LJIJI(0);
                                    }
                                    C786410Ut5.y3(frameLayout2.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.1ANS
                                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                        public final boolean onPreDraw() {
                                            FrameLayout frameLayout3 = c1anw.LLILZIL;
                                            if (frameLayout3.getWidth() > 0 && frameLayout3.getHeight() > 0) {
                                                C786410Ut5.D3(frameLayout3.getViewTreeObserver(), this);
                                                C1ANM c1anm = this;
                                                Integer numValueOf = Integer.valueOf(c1anm.LLLLILI().LIZ.LJI);
                                                int iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : 9;
                                                Integer numValueOf2 = Integer.valueOf(this.LLLLILI().LIZ.LJII);
                                                c1anm.LLLLLJIL(iIntValue, numValueOf2.intValue() > 0 ? numValueOf2.intValue() : 16);
                                            }
                                            return true;
                                        }
                                    });
                                    return constraintLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public static final boolean LLLLLJLJLL(FrameLayout frameLayout, int i, int i2, FrameLayout frameLayout2) {
        FrameLayout.LayoutParams layoutParams;
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight();
        if (width <= 0 || height <= 0) {
            return false;
        }
        float f = width;
        float f2 = height;
        float f3 = i / i2;
        if (f / f2 > f3) {
            width = (int) (f2 * f3);
        } else {
            height = (int) (f / f3);
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
            layoutParams = new FrameLayout.LayoutParams(width, height);
        }
        if (layoutParams.width == width && layoutParams.height == height && layoutParams.gravity == 17) {
            return false;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout2, layoutParams);
        return true;
    }
}
