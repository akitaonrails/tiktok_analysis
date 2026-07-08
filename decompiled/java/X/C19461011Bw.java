package X;

import Y.ACListenerS163S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19461011Bw {
    public final View LIZ;
    public final LifecycleOwner LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC2257101DWa LIZLLL;
    public final Function1<AbstractC1702680uPS, Unit> LJ;
    public C1441840nck LJI;
    public boolean LJIIIIZZ;
    public ValueAnimator LJIIIZ;
    public long LJIIJ;
    public final C1291180jhk LJIIJJI;
    public final C422820Gi0 LJIIL;
    public final ImageView LJIILIIL;
    public final C427310GpF LJIILJJIL;
    public final C427870Gq9 LJIILL;
    public final FrameLayout LJIILLIIL;
    public final C19665811wu LJIIZILJ;
    public final TuxTextView LJIJ;
    public final TuxTextView LJIJI;
    public final FrameLayout LJIJJ;
    public boolean LJFF = true;
    public final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());

    public final C1441840nck LIZ() {
        C1441840nck c1441840nck = this.LJI;
        if (c1441840nck != null) {
            return c1441840nck;
        }
        return null;
    }

    public final void LIZLLL() {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        ValueAnimator valueAnimator = this.LJIIIZ;
        if (valueAnimator != null) {
            valueAnimator.end();
        } else {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            valueAnimatorOfFloat.setDuration(8000L);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 25));
            this.LJIIIZ = valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimator2 = this.LJIIIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        final C19665811wu c19665811wu = this.LJIIZILJ;
        c19665811wu.getClass();
        C20595415iS.LIZ(new InterfaceC20595515iT() { // from class: X.11Bz
            public final /* synthetic */ int LIZ = LivePreCreateNextRoomPlayer.ENABLE;
            public final /* synthetic */ int LIZIZ = 800;

            @Override // X.InterfaceC20595515iT
            public final void LIZ() {
            }

            @Override // X.InterfaceC20595515iT
            public final void LIZIZ() {
                C19665811wu c19665811wu2 = c19665811wu;
                c19665811wu2.LLJI = this.LIZ;
                c19665811wu2.LLJ = this.LIZIZ;
                c19665811wu2.LLJIJIL.removeCallbacksAndMessages(null);
                C786410Ut5.LJLIIL(c19665811wu2.LLILZIL.nextInt(4) * 100, c19665811wu2.LLJIJIL, c19665811wu2.LLJILJIL);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[PHI: r2
      0x0050: PHI (r2v7 java.lang.String) = (r2v5 java.lang.String), (r2v8 java.lang.String) binds: [B:9:0x004e, B:7:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[PHI: r1
      0x006c: PHI (r1v10 java.lang.String) = (r1v7 java.lang.String), (r1v11 java.lang.String) binds: [B:16:0x006a, B:14:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto L84
            X.0nck r0 = r7.LIZ()
            r0.LJ()
            r7.LIZLLL()
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = r7.LJII
            Y.ARunnableS129S0100000_29 r1 = new Y.ARunnableS129S0100000_29
            r0 = 159(0x9f, float:2.23E-43)
            r1.<init>(r7, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
            X.08qG r5 = new X.08qG
            r5.<init>()
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r5.LIZ
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "personal_homepage"
            r2.put(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r7.LIZJ
            java.lang.String r2 = r0.getCreationId()
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r5.LIZ
            java.lang.String r0 = "group_id"
            r1.put(r0, r2)
            X.1DWa r0 = r7.LIZLLL
            java.lang.String r2 = r0.getUid()
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r5.LIZ
            java.lang.String r0 = "author_id"
            r1.put(r0, r2)
            X.1D0F r4 = X.C1D0F.LIZ
            java.lang.String r3 = ""
            if (r4 == 0) goto L4d
            java.lang.String r2 = r4.LIZ()
            if (r2 != 0) goto L50
        L4d:
            r2 = r3
            if (r4 == 0) goto L58
        L50:
            boolean r0 = r4.isConnected()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L58:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.LIZ
            r0.put(r2, r1)
            if (r4 == 0) goto L69
            java.lang.String r1 = r4.LIZIZ()
            if (r1 != 0) goto L6c
        L69:
            r1 = r3
            if (r4 == 0) goto L73
        L6c:
            java.lang.String r0 = r4.LIZJ()
            if (r0 == 0) goto L73
            r3 = r0
        L73:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.LIZ
            r0.put(r1, r3)
            org.json.JSONObject r1 = r5.LJ()
            java.lang.String r0 = "video_play"
            X.C20684815ws.LJIJ(r0, r1)
        L81:
            r7.LJFF = r8
            return
        L84:
            boolean r0 = r7.LJIIIIZZ
            if (r0 == 0) goto Lb0
            r3 = 0
            r7.LJIIIIZZ = r3
            android.animation.ValueAnimator r0 = r7.LJIIIZ
            if (r0 == 0) goto L92
            r0.end()
        L92:
            X.11wu r2 = r7.LJIIZILJ
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r2.LLJIJIL
            r0.removeCallbacksAndMessages(r6)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r2.LLJIJIL
            Y.ARunnableS129S0100000_29 r0 = r2.LLJILJIL
            r1.removeCallbacks(r0)
            int r1 = r2.getChildCount()
        La4:
            if (r3 >= r1) goto Lb0
            android.view.View r0 = r2.getChildAt(r3)
            r2.LIZ(r0)
            int r3 = r3 + 1
            goto La4
        Lb0:
            X.0nck r0 = r7.LIZ()
            r0.LIZLLL()
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19461011Bw.LIZJ(boolean):void");
    }

    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        C1441830ncj c1441830ncj = new C1441830ncj(videoPublishEditModel.getVideoEditorType(), C1428520nHG.LJJZZIII(videoPublishEditModel).getValue(), C1428520nHG.LJJZZI(videoPublishEditModel).getValue(), "KidsDraft", C338630DPh.LIZ());
        if (nLEModel != null) {
            c1441830ncj.LJIJI = nLEModel;
        }
        c1441830ncj.LJIJJ = videoPublishEditModel.getNleData();
        this.LJI = c1441830ncj;
        C1447450nln c1447450nln = C1447450nln.LIZ;
        Context context = this.LIZ.getContext();
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        C1291180jhk c1291180jhk = this.LJIIJJI;
        C1441840nck c1441840nckLIZ = LIZ();
        c1447450nln.getClass();
        C1447450nln.LIZ(context, lifecycleOwner, c1291180jhk, c1441840nckLIZ, videoPublishEditModel, "");
        C1291180jhk c1291180jhk2 = this.LJIIJJI;
        int iIntValue = ((Number) C1447450nln.LIZIZ(this.LIZJ).getFirst()).intValue();
        int iIntValue2 = ((Number) C1447450nln.LIZIZ(this.LIZJ).getSecond()).intValue();
        if (c1291180jhk2 != null) {
            Context context2 = c1291180jhk2.getContext();
            int fullScreenHeight = ScreenUtils.getFullScreenHeight(context2);
            int screenWidth = ScreenUtils.getScreenWidth(context2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context2);
            C1660610tJb c1660610tJb = C1660610tJb.LIZ;
            if (iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight != c1660610tJb.o2()) {
                c1660610tJb.s2(iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight);
            }
            if (fullScreenHeight * 9 > screenWidth * 16) {
                fullScreenHeight = c1660610tJb.LIZ();
            }
            if (C537820L7k.LIZ(iIntValue, iIntValue2)) {
                int i = (iIntValue * fullScreenHeight) / iIntValue2;
                layoutParams.width = i;
                layoutParams.height = fullScreenHeight;
                layoutParams.topMargin = 0;
                layoutParams.leftMargin = (screenWidth - i) / 2;
            } else {
                layoutParams.width = screenWidth;
                int i2 = (iIntValue2 * screenWidth) / iIntValue;
                layoutParams.height = i2;
                layoutParams.topMargin = (fullScreenHeight - i2) / 2;
                layoutParams.leftMargin = 0;
            }
            layoutParams.setMarginStart(layoutParams.leftMargin);
            C786410Ut5.W5(c1291180jhk2, layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19461011Bw(View view, LifecycleOwner lifecycleOwner, VideoPublishEditModel videoPublishEditModel, InterfaceC2257101DWa interfaceC2257101DWa, Function1<? super AbstractC1702680uPS, Unit> function1) {
        this.LIZ = view;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = interfaceC2257101DWa;
        this.LJ = function1;
        this.LJIIJJI = (C1291180jhk) view.findViewById(R.id.ron);
        this.LJIIL = (C422820Gi0) view.findViewById(R.id.htj);
        this.LJIILIIL = (ImageView) view.findViewById(R.id.htk);
        this.LJIILJJIL = (C427310GpF) view.findViewById(R.id.zy8);
        this.LJIILL = (C427870Gq9) view.findViewById(R.id.htl);
        this.LJIILLIIL = (FrameLayout) view.findViewById(R.id.ou2);
        this.LJIIZILJ = (C19665811wu) view.findViewById(R.id.pce);
        this.LJIJ = (TuxTextView) view.findViewById(R.id.tv_username);
        this.LJIJI = (TuxTextView) view.findViewById(R.id.zhs);
        this.LJIJJ = (FrameLayout) view.findViewById(R.id.hti);
        if (!(C1452830nuT.LIZ != null)) {
            C0M7M.LIZIZ("KidsDraft, ASEditor.context is not initialized, skip NLE initialization for draft preview");
            LIZIZ(videoPublishEditModel, null);
        } else if (TextUtils.isEmpty(videoPublishEditModel.getNleData())) {
            NLEEditor nLEEditor = C1449720npS.LIZLLL(videoPublishEditModel, null, 6).LIZLLL().LIZ;
            nLEEditor.done();
            videoPublishEditModel.setNleData(nLEEditor.store());
            LIZIZ(videoPublishEditModel, nLEEditor.getModel());
        } else {
            LIZIZ(videoPublishEditModel, null);
        }
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 219), view);
    }
}
