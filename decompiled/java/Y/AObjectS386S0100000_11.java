package Y;

import X.AbstractC714940S2q;
import X.C0RF0;
import X.C0S32;
import X.C0S33;
import X.C0S3B;
import X.C0S3D;
import X.C0S3F;
import X.C0S3L;
import X.C13LP;
import X.C1449705lv;
import X.C1558420qem;
import X.C1608030rwn;
import X.C2188811AlT;
import X.C700070Rd7;
import X.C700390Rdd;
import X.C700400Rde;
import X.C702990Rhp;
import X.C703290RiJ;
import X.C714930S2p;
import X.InterfaceC1483820oiS;
import X.InterfaceC715010S2x;
import android.graphics.drawable.GradientDrawable;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.ability.AbilityExtKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.mediabox.playerui.viewmodel.GestureViewModel;
import com.ss.android.ugc.mediabox.playerui.viewmodel.SeekbarVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS386S0100000_11 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(Y.AObjectS386S0100000_11 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoAssem r4 = (com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoAssem) r4
            X.0QSJ r1 = r4.LLJZ
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLLL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJLLL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope> r0 = com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJZ = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel r0 = new com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0tsU> r0 = X.InterfaceC1682240tsU.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0tsU r1 = (X.InterfaceC1682240tsU) r1
            java.lang.Class<X.0tsU> r0 = X.InterfaceC1682240tsU.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS386S0100000_11.invoke$0(Y.AObjectS386S0100000_11):java.lang.Object");
    }

    public static final Object invoke$1(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C0S3B c0s3b = (C0S3B) aObjectS386S0100000_11.l0;
        c0s3b.getClass();
        return c0s3b.LJFF().findViewById(R.id.qmw);
    }

    public static final Object invoke$10(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        VideoViewCell videoViewCell = (VideoViewCell) aObjectS386S0100000_11.l0;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        if (!((Boolean) C1608030rwn.LIZIZ.getValue()).booleanValue() && !C1608030rwn.LIZIZ()) {
            return Boolean.valueOf(!videoViewCell.C);
        }
        return Boolean.valueOf(!videoViewCell.D);
    }

    public static final Object invoke$11(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return Boolean.valueOf(((VideoViewCell) aObjectS386S0100000_11.l0).LLLLLLZZ);
    }

    public static final Object invoke$12(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return Boolean.valueOf(((VideoViewCell) aObjectS386S0100000_11.l0).w0);
    }

    public static final Object invoke$13(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        VideoViewCell videoViewCell = (VideoViewCell) aObjectS386S0100000_11.l0;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        return AbilityExtKt.LIZ(C1558420qem.LIZIZ(videoViewCell));
    }

    public static final Object invoke$14(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return ((VideoViewCell) aObjectS386S0100000_11.l0).LLLLIL;
    }

    public static final Object invoke$15(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return ((VideoViewCell) aObjectS386S0100000_11.l0).LLLLLL;
    }

    public static final Object invoke$16(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return ((VideoViewCell) aObjectS386S0100000_11.l0).LLJZIJLIL;
    }

    public static final Object invoke$17(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C0RF0 c0rf0 = (C0RF0) aObjectS386S0100000_11.l0;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        return c0rf0.LJ.param.getAid();
    }

    public static final Object invoke$18(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C0RF0 c0rf0 = (C0RF0) aObjectS386S0100000_11.l0;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        return c0rf0.LJ.param.getAid();
    }

    public static final Object invoke$19(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return ((VideoViewCell) aObjectS386S0100000_11.l0).LLLLZ;
    }

    public static final Object invoke$2(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        InterfaceC715010S2x interfaceC715010S2x = ((C0S3B) aObjectS386S0100000_11.l0).LIZ;
        if (interfaceC715010S2x != null) {
            return interfaceC715010S2x.LLILLJJLI(GestureViewModel.class);
        }
        return null;
    }

    public static final Object invoke$20(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        VideoViewCell videoViewCell = (VideoViewCell) aObjectS386S0100000_11.l0;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        return AbilityExtKt.LIZ(C1558420qem.LIZIZ(videoViewCell));
    }

    public static final Object invoke$21(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return ((VideoViewCell) aObjectS386S0100000_11.l0).LLLLIL;
    }

    public static final Object invoke$22(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        VideoViewCell videoViewCell = (VideoViewCell) aObjectS386S0100000_11.l0;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        return Long.valueOf(System.currentTimeMillis() - videoViewCell.LLLLLLL);
    }

    public static final Object invoke$23(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return ((VideoViewCell) aObjectS386S0100000_11.l0).LLLLLL;
    }

    public static final Object invoke$24(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return ((VideoViewCell) aObjectS386S0100000_11.l0).LLJZIJLIL;
    }

    public static final Object invoke$25(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        FollowLiveVideoViewHolder followLiveVideoViewHolder = (FollowLiveVideoViewHolder) aObjectS386S0100000_11.l0;
        int i = FollowLiveVideoViewHolder.j1;
        followLiveVideoViewHolder.getClass();
        return Long.valueOf(System.currentTimeMillis() - followLiveVideoViewHolder.LLLLLLL);
    }

    public static final Object invoke$26(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        InterfaceC715010S2x interfaceC715010S2x = ((C0S32) aObjectS386S0100000_11.l0).LIZ;
        if (interfaceC715010S2x != null) {
            return interfaceC715010S2x.LLILLJJLI(GestureViewModel.class);
        }
        return null;
    }

    public static final Object invoke$27(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        final C0S33 c0s33 = (C0S33) aObjectS386S0100000_11.l0;
        return new InterfaceC1483820oiS() { // from class: X.0S31
            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ Surface getSurface() {
                return null;
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
                return (FrameLayout) LJFF();
            }

            @Override // X.InterfaceC1483820oiS
            public final boolean bn() {
                return true;
            }

            @Override // X.InterfaceC1483820oiS
            public final void hj() {
            }
        };
    }

    public static final Object invoke$28(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C714930S2p c714930S2p = (C714930S2p) aObjectS386S0100000_11.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c714930S2p.getClass().getSimpleName());
        sbLIZ.append('_');
        AbstractC714940S2q abstractC714940S2q = c714930S2p.LIZJ;
        if (abstractC714940S2q == null) {
            abstractC714940S2q = null;
        }
        sbLIZ.append(abstractC714940S2q.getClass().getSimpleName());
        sbLIZ.append('_');
        sbLIZ.append(c714930S2p.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        return C1449705lv.LIZ(new C702990Rhp(2045), null, ((C703290RiJ) aObjectS386S0100000_11.l0).LJII.LIZ);
    }

    public static final Object invoke$4(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        InterfaceC715010S2x interfaceC715010S2x = ((C0S3F) aObjectS386S0100000_11.l0).LIZ;
        if (interfaceC715010S2x != null) {
            return interfaceC715010S2x.LLILLJJLI(SeekbarVM.class);
        }
        return null;
    }

    public static final Object invoke$5(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C0S3D c0s3d = ((C0S3L) aObjectS386S0100000_11.l0).LIZIZ;
        if (c0s3d == null) {
            c0s3d = null;
        }
        View view = c0s3d.LIZ(R.id.pu8).LIZ;
        if (!(view instanceof View)) {
            return null;
        }
        return view;
    }

    public static final Object invoke$6(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C0S3D c0s3d = ((C0S3L) aObjectS386S0100000_11.l0).LIZIZ;
        if (c0s3d == null) {
            c0s3d = null;
        }
        View view = c0s3d.LIZ(R.id.pua).LIZ;
        if (!(view instanceof View)) {
            return null;
        }
        return view;
    }

    public static final Object invoke$7(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C0S3D c0s3d = ((C0S3L) aObjectS386S0100000_11.l0).LIZIZ;
        if (c0s3d == null) {
            c0s3d = null;
        }
        View view = c0s3d.LIZ(R.id.pu_).LIZ;
        if (!(view instanceof View)) {
            view = null;
        }
        if (!(view instanceof ImageView)) {
            return null;
        }
        return view;
    }

    public static final Object invoke$8(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C700390Rdd c700390Rdd = (C700390Rdd) aObjectS386S0100000_11.l0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C700400Rde c700400Rde = c700390Rdd.LIZ;
        linkedHashMap.put(c700400Rde.LIZ, c700400Rde);
        c700400Rde.LIZIZ(new C700070Rd7(linkedHashMap));
        return linkedHashMap;
    }

    public static final Object invoke$9(AObjectS386S0100000_11 aObjectS386S0100000_11) {
        C700390Rdd c700390Rdd = (C700390Rdd) aObjectS386S0100000_11.l0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C700400Rde c700400Rde = c700390Rdd.LIZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(c700400Rde.LIZ);
        c700400Rde.LIZIZ(new AObjectS311S0200000_11(linkedHashSet, linkedHashMap, 3));
        linkedHashMap.put(c700400Rde.LIZ, C13LP.LLIIJI(linkedHashSet));
        return linkedHashMap;
    }

    public AObjectS386S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
