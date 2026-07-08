package X;

import Y.AAListenerS76S0201000_31;
import Y.ARunnableS131S0100000_31;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLowEndOptimizationSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchResultAnimationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.15DG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DG implements InterfaceC977420bXg {
    public View LL;
    public C1295960jpS LLILLJJLI;
    public TextureViewSurfaceTextureListenerC1288630jdd LLILLL;
    public MatchBaseWidget LLILZ;
    public C1324720kZq LLILZIL;
    public ViewGroup LLILZLL;
    public DataChannel LLIZ;
    public ARunnableS131S0100000_31 LLJ;
    public Runnable LLJI;
    public boolean LLJIJIL;
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
    public String LLJILJIL = "";
    public final C15DH LLJILJILJ = new C1288120jco() { // from class: X.15DH
        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LIZ(C1288070jcj c1288070jcj) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LIZIZ(C1288070jcj c1288070jcj) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LIZJ(C1288070jcj c1288070jcj) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LIZLLL(C1288070jcj c1288070jcj) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LJFF(C1288090jcl c1288090jcl) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LJII(C1288100jcm c1288100jcm) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LJIIIIZZ(C1288060jci c1288060jci) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LJIIJ(C1288070jcj c1288070jcj) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LJIIJJI(C1288070jcj c1288070jcj) {
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LJ(C1288070jcj c1288070jcj) {
            boolean zLJFF;
            long ownerUserId;
            Room roomLJJLIIIIJ;
            MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
            List<C976480bWA> value;
            C976480bWA next;
            DataChannel dataChannel;
            MatchBaseWidget matchBaseWidget = this.LIZ.LLILZ;
            if (matchBaseWidget != null && (dataChannel = matchBaseWidget.dataChannel) != null) {
                zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            this.LIZ.LJIIIIZZ();
            if (interfaceC973730bRjYf2 != null) {
                ownerUserId = interfaceC973730bRjYf2.LJJJJJ();
            } else {
                DataChannel dataChannel2 = this.LIZ.LLIZ;
                if (dataChannel2 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null) {
                    ownerUserId = roomLJJLIIIIJ.getOwnerUserId();
                } else {
                    ownerUserId = 1;
                }
            }
            Integer numValueOf = null;
            if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
                Iterator<C976480bWA> it2 = value.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LIZ == ownerUserId) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C976480bWA c976480bWA = next;
                if (c976480bWA != null) {
                    numValueOf = Integer.valueOf(c976480bWA.LJII);
                }
            }
            C978500bZQ.LIZIZ("match_punish_prepare");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show result , result = ");
            sbLIZ.append(numValueOf);
            C20441214yg.LIZIZ("MatchLottieExtension", C2188811AlT.LIZIZ(sbLIZ));
            if (!zLJFF && LiveMatchLowEndOptimizationSettings.INSTANCE.isEnabled() && !C20483515Dd.LIZJ()) {
                if (numValueOf != null) {
                    this.LIZ.LJIIL(numValueOf.intValue());
                }
            } else {
                if (numValueOf == null) {
                    return;
                }
                this.LIZ.LJIIJJI(numValueOf.intValue());
            }
        }

        @Override // X.C1288120jco, X.InterfaceC1288110jcn
        public final void LJIIIZ(C1288070jcj c1288070jcj) {
            if (!this.LIZ.LLJIJIL) {
                C973660bRc.LJJJLL(0L, "match_final_score", false);
                this.LIZ.LLJIJIL = true;
            }
        }
    };
    public final ARunnableS131S0100000_31 LLJILLL = new ARunnableS131S0100000_31(this, 104);

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
    }

    public final void LJIIIIZZ() {
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2;
        C20441214yg.LIZIZ("MatchResultComponent", "clear animation");
        C1324720kZq c1324720kZq = this.LLILZIL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        C1295960jpS c1295960jpS = this.LLILLJJLI;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = this.LLILLJJLI;
        if (c1295960jpS2 != null) {
            c1295960jpS2.clearAnimation();
        }
        C1295960jpS c1295960jpS3 = this.LLILLJJLI;
        if (c1295960jpS3 != null) {
            c1295960jpS3.setFrame(0);
        }
        C1295960jpS c1295960jpS4 = this.LLILLJJLI;
        if (c1295960jpS4 != null) {
            c1295960jpS4.removeAllAnimatorListeners();
        }
        Runnable runnable = this.LLJI;
        if (runnable != null) {
            C783270Uo1.LJFF(runnable);
        }
        this.LLJI = null;
        LiveMatchResultAnimationSetting liveMatchResultAnimationSetting = LiveMatchResultAnimationSetting.INSTANCE;
        if (liveMatchResultAnimationSetting.getValue() && (textureViewSurfaceTextureListenerC1288630jdd2 = this.LLILLL) != null) {
            textureViewSurfaceTextureListenerC1288630jdd2.stop();
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd3 = this.LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd3 != null) {
            C786410Ut5.b(textureViewSurfaceTextureListenerC1288630jdd3, 8);
        }
        if (!liveMatchResultAnimationSetting.getValue() && (textureViewSurfaceTextureListenerC1288630jdd = this.LLILLL) != null) {
            textureViewSurfaceTextureListenerC1288630jdd.clearAnimation();
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd4 = this.LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd4 != null) {
            textureViewSurfaceTextureListenerC1288630jdd4.LIZLLL(this.LLJILJILJ);
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            C786410Ut5.bd(0.0f, viewGroup);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1288630jdd);
            textureViewSurfaceTextureListenerC1288630jdd.setTranslationY(0.0f);
        }
        ViewGroup viewGroup2 = this.LLILZLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        C1324720kZq c1324720kZq = this.LLILZIL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        LJIIIIZZ();
    }

    public final void LJI() {
        float f = (C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6()) ? -((int) C497740JfY.LIZIZ(100.0f)) : 0.0f;
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            C786410Ut5.bd(f, viewGroup);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1288630jdd);
            textureViewSurfaceTextureListenerC1288630jdd.setTranslationY(-f);
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        dismiss();
        LJIIIIZZ();
    }

    public static String LJIIJ(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJ("MatchResultComponent", "BufferedReader failed to close");
                        }
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    try {
                        bufferedReader.close();
                        return null;
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C20441214yg.LJ("MatchResultComponent", "BufferedReader failed to close");
                        return null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    bufferedReader.close();
                    throw th;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C20441214yg.LJ("MatchResultComponent", "BufferedReader failed to close");
                    throw th;
                }
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        LJI();
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        C1295960jpS c1295960jpS;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd;
        C1324720kZq c1324720kZq;
        C1295960jpS c1295960jpS2;
        this.LLILZ = matchBaseWidget;
        this.LLIZ = matchBaseWidget.dataChannel;
        ViewGroup viewGroup = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(matchBaseWidget.context), R.layout.gp2, null, false);
        this.LL = viewTd;
        if (viewTd != null) {
            c1295960jpS = (C1295960jpS) viewTd.findViewById(R.id.ntq);
        } else {
            c1295960jpS = null;
        }
        this.LLILLJJLI = c1295960jpS;
        View view = this.LL;
        if (view != null) {
            textureViewSurfaceTextureListenerC1288630jdd = (TextureViewSurfaceTextureListenerC1288630jdd) view.findViewById(R.id.h6n);
        } else {
            textureViewSurfaceTextureListenerC1288630jdd = null;
        }
        this.LLILLL = textureViewSurfaceTextureListenerC1288630jdd;
        View view2 = this.LL;
        if (view2 != null) {
            c1324720kZq = (C1324720kZq) view2.findViewById(R.id.lvr);
        } else {
            c1324720kZq = null;
        }
        this.LLILZIL = c1324720kZq;
        LJIIIIZZ();
        ViewGroup viewGroup2 = this.LLILZLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJJJJI(viewGroup2);
        }
        View view3 = matchBaseWidget.contentView;
        if (view3 != null) {
            viewGroup = (ViewGroup) view3.findViewById(R.id.kld);
        }
        this.LLILZLL = viewGroup;
        if (viewGroup != null) {
            viewGroup.addView(this.LL);
        }
        LJI();
        C1295960jpS c1295960jpS3 = this.LLILLJJLI;
        if (c1295960jpS3 != null) {
            C786410Ut5.LLD(8, c1295960jpS3);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = this.LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd2 != null) {
            C786410Ut5.b(textureViewSurfaceTextureListenerC1288630jdd2, 8);
        }
        C1324720kZq c1324720kZq2 = this.LLILZIL;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 8);
        }
        if (Build.VERSION.SDK_INT > 26 && (c1295960jpS2 = this.LLILLJJLI) != null) {
            c1295960jpS2.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd3 = this.LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd3 != null) {
            textureViewSurfaceTextureListenerC1288630jdd3.LIZLLL(this.LLJILJILJ);
        }
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd4 = this.LLILLL;
        if (textureViewSurfaceTextureListenerC1288630jdd4 != null) {
            C20441214yg.LIZIZ("MatchResultComponent", "Setting up enigma reveal animation");
            textureViewSurfaceTextureListenerC1288630jdd4.clearAnimation();
            textureViewSurfaceTextureListenerC1288630jdd4.setStartFrame(0);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1288630jdd4);
            textureViewSurfaceTextureListenerC1288630jdd4.setScaleX(1.1f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1288630jdd4);
            textureViewSurfaceTextureListenerC1288630jdd4.setScaleY(1.1f);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enigma_reveal");
            sbLIZ.append(File.separator);
            sbLIZ.append("data.json");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            File fileLJII = C1143780fs0.LJII("tiktok_live_match_enigma_reveal_resource", strLIZIZ);
            String strLJIIJ = "LiveMatchBasicScoreComponent";
            if (fileLJII != null && fileLJII.exists()) {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Json file ");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" read successfully");
                    C20441214yg.LJIIIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ2));
                    strLJIIJ = LJIIJ(new InputStreamReader(new C0VSP(fileLJII)));
                    if (strLJIIJ == null) {
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF(strLJIIJ, "Failed to read gecko file", e);
                }
                this.LLJILJIL = strLJIIJ;
                this.LLJILJIL = u.LJJIFFI(u.LJJIFFI(strLJIIJ, "{enigma_points_label}", C497740JfY.LJIJI(2131853723), false), "{local_path}", C1143780fs0.LJIIJ("tiktok_live_match_enigma_reveal_resource", "enigma_reveal"), false);
                C20441214yg.LIZIZ("MatchResultComponent", "Loaded Enigma Result Animation");
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Gecko file not exist: ");
            sbLIZ3.append(fileLJII);
            C20441214yg.LJ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ3));
            strLJIIJ = "";
            this.LLJILJIL = strLJIIJ;
            this.LLJILJIL = u.LJJIFFI(u.LJJIFFI(strLJIIJ, "{enigma_points_label}", C497740JfY.LJIJI(2131853723), false), "{local_path}", C1143780fs0.LJIIJ("tiktok_live_match_enigma_reveal_resource", "enigma_reveal"), false);
            C20441214yg.LIZIZ("MatchResultComponent", "Loaded Enigma Result Animation");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0246 A[PHI: r0
      0x0246: PHI (r0v4 long) = (r0v3 long), (r0v32 long), (r0v32 long), (r0v32 long) binds: [B:126:0x0242, B:36:0x0085, B:38:0x008d, B:45:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[PHI: r0
      0x0083: PHI (r0v32 long) = (r0v3 long), (r0v37 long) binds: [B:126:0x0242, B:34:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC977420bXg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C975960bVK r17) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15DG.LJFF(X.0bVK):void");
    }

    public final void LJIIJJI(int i) {
        String str;
        DataChannel dataChannel;
        if (!C975390bUP.LJI) {
            C975390bUP.LJI = true;
            C975390bUP.LJII = false;
            C975390bUP.LJ = C963140bAe.LIZJ();
            C975390bUP.LJFF = SystemClock.elapsedRealtime();
        }
        C970290bMB c970290bMB = C970290bMB.LIZ;
        C970290bMB.LJJIJ(EnumC970300bMC.RESULT_ANIMATION, true);
        if (LJIILIIL(i, "Lottie")) {
            return;
        }
        LJI();
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        if (this.LLILLJJLI == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show Lottie anim, result = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MatchResultComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 2) {
            C786410Ut5.LJLIIL(4000L, this.LLIZLLLIL, this.LLJILLL);
        }
        C1295960jpS c1295960jpS = this.LLILLJJLI;
        if (c1295960jpS != null) {
            if (i != 0) {
                if (i != 1) {
                    str = "ttlive_match_result_draw_opt.zip";
                } else {
                    str = "ttlive_match_result_ani_lose_opt.zip";
                }
            } else {
                str = "ttlive_match_result_ani_win_opt.zip";
            }
            c1295960jpS.removeAllAnimatorListeners();
            c1295960jpS.clearAnimation();
            c1295960jpS.addAnimatorListener(new AAListenerS76S0201000_31(this, c1295960jpS, i, 1));
            HandlerHook.viewPost(c1295960jpS, new ARunnableS131S0100000_31(c1295960jpS, 106));
            if (i == 2 && (dataChannel = this.LLIZ) != null) {
                dataChannel.zW(BattleDrawTimeLeftChannel.class, 0L);
            }
            C1143680frq.LJIIL(c1295960jpS, "tiktok_live_match_redesign_resource_2", str, "images", true, null, Boolean.FALSE, null);
        }
    }

    public final void LJIIL(int i) {
        BPEAHandler bPEAHandler;
        String str;
        if (!C975390bUP.LJI) {
            C975390bUP.LJI = true;
            C975390bUP.LJII = true;
            C975390bUP.LJ = C963140bAe.LIZJ();
            C975390bUP.LJFF = SystemClock.elapsedRealtime();
        }
        if (LJIILIIL(i, "Static")) {
            return;
        }
        LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start show static image, result = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MatchResultComponent", C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        if (this.LLILZIL == null) {
            return;
        }
        C1324720kZq c1324720kZq = this.LLILZIL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
            if (i != 0) {
                if (i != 1) {
                    str = "live_battle_new_result_draw.png";
                } else {
                    str = "live_battle_new_result_lose.png";
                }
            } else {
                str = "live_battle_new_result_win.png";
            }
            C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_match_redesign_resource_2", str);
        }
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LLJ;
        if (aRunnableS131S0100000_31 != null && (bPEAHandler = this.LLIZLLLIL) != null) {
            bPEAHandler.removeCallbacks(aRunnableS131S0100000_31);
        }
        ARunnableS131S0100000_31 aRunnableS131S0100000_312 = new ARunnableS131S0100000_31(this, 107);
        this.LLJ = aRunnableS131S0100000_312;
        C786410Ut5.LJLIIL(4000L, this.LLIZLLLIL, aRunnableS131S0100000_312);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r0 != r2.getOwnerUserId()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r5.contains(java.lang.Long.valueOf(r0)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        X.C20441214yg.LJIIIZ("MatchEnlargeRival", "[Enlarge] isEnlargeRival=true enlargedUid=" + r0 + " isTeamMatch=" + X.C970370bMJ.LJIIIIZZ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
    
        if (r15 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        if (r15 == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        r2 = 2131853728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        r2 = 2131853726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("[Enlarge] ");
        r1.append(r16);
        r1.append(" suppressed (rival) result=");
        r1.append(r15);
        X.C20441214yg.LJIIIZ("MatchResultComponent", X.C2188811AlT.LIZIZ(r1));
        r1 = r14.LLILZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
    
        r0 = r1.widgetCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0114, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
    
        r4 = r0.getFragment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        if (r4 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        r4 = X.C946803n0.LIZ(r1.getView());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
    
        X.C766270U4b.LIZ(r4, X.C497740JfY.LJIJI(r2));
        r1 = r14.LLIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012d, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012f, code lost:
    
        r1.FQ2(com.bytedance.android.live.liveinteract.match.business.event.BattleResultAnimationEndEvent.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
    
        if (r15 != 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        r2 = new Y.ARunnableS131S0100000_31(r14, 108);
        r14.LLJI = r2;
        X.C473410IhP.LIZJ(r2, 4000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(int r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15DG.LJIILIIL(int, java.lang.String):boolean");
    }
}
