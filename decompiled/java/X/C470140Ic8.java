package X;

import Y.ARunnableS76S0200000_7;
import android.graphics.Color;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: renamed from: X.0Ic8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470140Ic8 extends AbstractC470040Iby {
    public final String LLJJJJJIL = "load";
    public final String LLJJJJLIIL = "user_wait";
    public final String LLJJL = "block";
    public final String LLJJLIIIJLLLLLLLZ = "video_play";
    public InterfaceC470090Ic3 LLJL;
    public C1324720kZq LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public long LLJLLIL;
    public long LLJLLL;
    public long LLJZ;
    public long LLJZIJLIL;

    @Override // X.AbstractC470040Iby
    public final int LJIIZILJ() {
        return R.layout.hjy;
    }

    public final Map<String, String> LJJIIJ() {
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LLILZIL;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("card_id", encourageGoLiveCard.cardId);
        linkedHashMap.put("card_type", String.valueOf(encourageGoLiveCard.cardType));
        linkedHashMap.put("video_url", encourageGoLiveCard.videoUrl);
        linkedHashMap.put("video_duration", String.valueOf(encourageGoLiveCard.videoLength));
        linkedHashMap.put("network_type", C804420Vh2.LJ(this.LL).toString());
        linkedHashMap.put("network_speed", String.valueOf(C1479130oat.LJII()));
        return linkedHashMap;
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy: releasing video player, playDuration=");
        sbLIZ.append(this.LLJZ);
        C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        super.LIZIZ();
        InterfaceC470090Ic3 interfaceC470090Ic3 = this.LLJL;
        if (interfaceC470090Ic3 != null) {
            interfaceC470090Ic3.release();
        }
        if (this.LLJZIJLIL <= 0) {
            C20441214yg.LIZIZ("PromoteVideoVariantCard", "onDestroy: video never started playing");
            LJJIIJZLJL(LJJIII(this.LLJJJJLIIL), LJJIII(this.LLJJJJJIL), "widget_destroy", "widget_destroy");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJZIJLIL;
        this.LLJZ += jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onDestroy: total playDuration=");
        sbLIZ2.append(this.LLJZ);
        C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ2));
        long jLJJIII = LJJIII(this.LLJJLIIIJLLLLLLLZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_video_play_duration_event");
        c474500IjALIZ.LJJIIZI(LJJIIJ());
        c474500IjALIZ.LJJII(Long.valueOf(jLJJIII), "play_duration");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LIZJ() {
        super.LIZJ();
        C20441214yg.LIZIZ("PromoteVideoVariantCard", "onFragmentSelected: starting video player");
        this.LLJLLL = System.currentTimeMillis();
        InterfaceC470090Ic3 interfaceC470090Ic3 = this.LLJL;
        if (interfaceC470090Ic3 != null) {
            interfaceC470090Ic3.start();
        }
    }

    @Override // X.AbstractC470040Iby
    public final void LJJ(View view) {
        Object c098200Yq;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            return;
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(encourageGoLiveCard.videoBgColor));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r3 > 0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJJIII(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.LLJJJJJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            r5 = 0
            if (r0 == 0) goto L1f
            long r1 = r7.LLJLL
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L1c
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.LLJLILLLLZIIL
        L16:
            long r1 = r1 - r3
        L17:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6c
            return r5
        L1c:
            long r3 = r7.LLJLILLLLZIIL
            goto L16
        L1f:
            java.lang.String r0 = r7.LLJJJJLIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L50
            long r1 = r7.LLJLL
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L45
            boolean r0 = r7.LLJI
            if (r0 == 0) goto L3e
            long r1 = r7.LLJLLL
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3e
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.LLJLLL
            goto L16
        L3e:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.LLJLILLLLZIIL
            goto L16
        L45:
            boolean r0 = r7.LLJI
            if (r0 == 0) goto L6a
            long r3 = r7.LLJLLL
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6a
            goto L16
        L50:
            java.lang.String r0 = r7.LLJJL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L5f
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.LLJLLIL
            goto L16
        L5f:
            java.lang.String r0 = r7.LLJJLIIIJLLLLLLLZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L6a
            long r1 = r7.LLJZ
            goto L17
        L6a:
            r1 = 0
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C470140Ic8.LJJIII(java.lang.String):long");
    }

    @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
    public final void LJII(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.LJII(view, bundle);
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZ;
        if (encourageGoLiveCard == null) {
            C20441214yg.LJ("PromoteVideoVariantCard", "onViewCreated: cardData is null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated: cardId=");
        sbLIZ.append(encourageGoLiveCard.cardId);
        sbLIZ.append(", videoUrl=");
        sbLIZ.append(encourageGoLiveCard.videoUrl);
        C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        if (textView != null) {
            textView.setText(encourageGoLiveCard.title);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tv_sub_title);
        if (textView2 != null) {
            textView2.setText(encourageGoLiveCard.subTitle);
        }
        this.LLJLIL = (C1324720kZq) view.findViewById(R.id.video_first_frame);
        TextureView textureView = (TextureView) view.findViewById(R.id.video_big_photo);
        if (textureView == null) {
            C20441214yg.LJ("PromoteVideoVariantCard", "onViewCreated: videoView not found");
            return;
        }
        HandlerHook.viewPost(textureView, new ARunnableS76S0200000_7(textureView, encourageGoLiveCard, 87));
        boolean z = true;
        if (encourageGoLiveCard.videoCover.length() > 0) {
            C1324720kZq c1324720kZq = this.LLJLIL;
            if (c1324720kZq != null) {
                C500260Jjc.LLFFF(c1324720kZq);
            }
            C1324720kZq c1324720kZq2 = this.LLJLIL;
            if (c1324720kZq2 != null && (layoutParams = c1324720kZq2.getLayoutParams()) != null) {
                layoutParams.height = (int) (textureView.getWidth() * encourageGoLiveCard.videoRatio);
                C1324720kZq c1324720kZq3 = this.LLJLIL;
                if (c1324720kZq3 != null) {
                    C786410Ut5.u6(c1324720kZq3, layoutParams);
                }
            }
            LJIJJ(encourageGoLiveCard.videoCover, this.LLJLIL, ImageView.ScaleType.FIT_XY);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onViewCreated: loading first frame image, url=");
            sbLIZ2.append(encourageGoLiveCard.videoCover);
            C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C470070Ic1 c470070Ic1 = this.LLJ;
        InterfaceC470090Ic3 interfaceC470090Ic3 = null;
        if (c470070Ic1 != null) {
            String str = encourageGoLiveCard.videoUrl;
            long j = encourageGoLiveCard.videoLength;
            InterfaceC588410N5z interfaceC588410N5z = new InterfaceC588410N5z() { // from class: X.0IcA
                @Override // X.InterfaceC588410N5z
                public final void onBufferedPercent(String str2, long j2, int i) {
                }

                @Override // X.InterfaceC588410N5z
                public final void onPlayProgressChange(float f) {
                }

                @Override // X.InterfaceC588410N5z
                public final void LJII() {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onRenderFirstFrame: loadDuration=");
                    sbLIZ3.append(System.currentTimeMillis() - this.LL.LLJLILLLLZIIL);
                    sbLIZ3.append("ms");
                    C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
                    this.LL.LLJLL = System.currentTimeMillis();
                    C1324720kZq c1324720kZq4 = this.LL.LLJLIL;
                    if (c1324720kZq4 != null) {
                        C500260Jjc.LJIILIIL(c1324720kZq4);
                    }
                    this.LL.LLJZIJLIL = System.currentTimeMillis();
                    C470140Ic8 c470140Ic8 = this.LL;
                    long jLJJIII = c470140Ic8.LJJIII(c470140Ic8.LLJJJJLIIL);
                    C470140Ic8 c470140Ic82 = this.LL;
                    c470140Ic8.LJJIIJZLJL(jLJJIII, c470140Ic82.LJJIII(c470140Ic82.LLJJJJJIL), CardStruct.IStatusCode.DEFAULT, "success");
                }

                @Override // X.InterfaceC588410N5z
                public final void LJLLI(String str2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onPlayFailed: error=");
                    sbLIZ3.append(str2);
                    C20441214yg.LJ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
                    this.LL.LLJLL = System.currentTimeMillis();
                    C470140Ic8 c470140Ic8 = this.LL;
                    long jLJJIII = c470140Ic8.LJJIII(c470140Ic8.LLJJJJLIIL);
                    C470140Ic8 c470140Ic82 = this.LL;
                    c470140Ic8.LJJIIJZLJL(jLJJIII, c470140Ic82.LJJIII(c470140Ic82.LLJJJJJIL), str2, "fail");
                }

                @Override // X.InterfaceC588410N5z
                public final void LL(String str2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onRetryOnError: error=");
                    sbLIZ3.append(str2);
                    C20441214yg.LJIIL("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
                    C470140Ic8 c470140Ic8 = this.LL;
                    long jLJJIII = c470140Ic8.LJJIII(c470140Ic8.LLJJJJLIIL);
                    C470140Ic8 c470140Ic82 = this.LL;
                    c470140Ic8.LJJIIJZLJL(jLJJIII, c470140Ic82.LJJIII(c470140Ic82.LLJJJJJIL), str2, "retry_error");
                }

                @Override // X.InterfaceC588410N5z
                public final void onBuffering(boolean z2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onBuffering: start=");
                    sbLIZ3.append(z2);
                    C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
                    if (z2) {
                        this.LL.LLJLLIL = System.currentTimeMillis();
                        return;
                    }
                    C470140Ic8 c470140Ic8 = this.LL;
                    long jLJJIII = c470140Ic8.LJJIII(c470140Ic8.LLJJL);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_video_block_duration_event");
                    c474500IjALIZ.LJJIIZI(c470140Ic8.LJJIIJ());
                    c474500IjALIZ.LJJII(Long.valueOf(jLJJIII), "block_duration");
                    c474500IjALIZ.LIZ();
                    this.LL.LLJLLIL = 0L;
                }

                @Override // X.InterfaceC588410N5z
                public final void onPausePlay(String str2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onPausePlay: sourceId=");
                    sbLIZ3.append(str2);
                    C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C470140Ic8 c470140Ic8 = this.LL;
                    long j2 = jCurrentTimeMillis - c470140Ic8.LLJZIJLIL;
                    long j3 = c470140Ic8.LLJZ;
                    if (j2 < 0) {
                        j2 = 0;
                    }
                    c470140Ic8.LLJZ = j3 + j2;
                }

                @Override // X.InterfaceC588410N5z
                public final void onPlayCompleted(String str2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onPlayCompleted: sourceId=");
                    sbLIZ3.append(str2);
                    C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
                }

                @Override // X.InterfaceC588410N5z
                public final void onPreparePlay(String str2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onPreparePlay: sourceId=");
                    sbLIZ3.append(str2);
                    C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
                }

                @Override // X.InterfaceC588410N5z
                public final void onResumePlay(String str2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onResumePlay: sourceId=");
                    sbLIZ3.append(str2);
                    C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ3));
                    this.LL.LLJZIJLIL = System.currentTimeMillis();
                }
            };
            if (str.length() != 0) {
                z = false;
            }
            if (z) {
                C20441214yg.LIZIZ("PromoteCardPlayerHelper", "Video URL empty, skipping player creation");
            } else {
                try {
                    InterfaceC470090Ic3 videoCleanPlayerController = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getVideoCleanPlayerController(textureView, str, (int) j, null, "inner_promote_live", interfaceC588410N5z);
                    c470070Ic1.LIZIZ = videoCleanPlayerController;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Video player created successfully, tag=");
                    sbLIZ3.append("inner_promote_live");
                    C20441214yg.LIZIZ("PromoteCardPlayerHelper", C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC470090Ic3 = videoCleanPlayerController;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("PromoteCardPlayerHelper", "Failed to create video player", e);
                }
            }
        }
        this.LLJL = interfaceC470090Ic3;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onViewCreated: video player created, videoLength=");
        sbLIZ4.append(encourageGoLiveCard.videoLength);
        C20441214yg.LIZIZ("PromoteVideoVariantCard", C2188811AlT.LIZIZ(sbLIZ4));
        this.LLJLILLLLZIIL = System.currentTimeMillis();
    }

    public final void LJJIIJZLJL(long j, long j2, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_video_play_event");
        c474500IjALIZ.LJJIIZI(LJJIIJ());
        c474500IjALIZ.LJJII(Long.valueOf(j), "user_wait_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "load_duration");
        c474500IjALIZ.LJJII(str, "error_code");
        c474500IjALIZ.LJJII(str2, "result");
        c474500IjALIZ.LIZ();
    }
}
