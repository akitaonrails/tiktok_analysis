package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.linkmic.LiveLinkMicGiftAnimationChannel;
import com.bytedance.android.live.linkmic.SmallFlyMicGiftAnimaEndEvent;
import com.bytedance.android.live.linkmic.StopFlyMicGiftAnimationEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.jvm.internal.AwS181S0400000_33;
import kotlin.jvm.internal.AwS187S0400000_33;
import kotlin.jvm.internal.AwS310S0300000_33;
import kotlin.jvm.internal.AwS322S0300000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Abc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182701Abc {
    public final Context LIZ;
    public final InterfaceC937840aVq LIZIZ;
    public final DataChannel LIZJ;
    public Future<?> LIZLLL;
    public C1118760fDe LJ;
    public C1085630eMD<FrameLayout> LJFF;
    public C1085630eMD<C1126540fQC> LJI;
    public C1085630eMD<C1126540fQC> LJII;
    public AnimatedDrawable2 LJIIIIZZ;
    public AnimatedDrawable2 LJIIIZ;
    public boolean LJIIJ;
    public final C1AZJ LJIIJJI = new InterfaceC958970b3v() { // from class: X.1AZJ
        @Override // X.InterfaceC958970b3v
        public final void LIZJ(int i, List list) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJIJL(C2180891AWx c2180891AWx) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJJI() {
        }

        @Override // X.InterfaceC958970b3v
        public final boolean LJJJIL() {
            return true;
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIIIL(Map map) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJJJ() {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLLL(List list, boolean z) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLJ(LinkUser linkUser) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
            C1118760fDe c1118760fDe = this.LL.LJ;
            if (c1118760fDe != null) {
                c1118760fDe.LLILZ = true;
                c1118760fDe.LIZJ();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1118760fDe, null);
                c1118760fDe.removeAllViews();
            }
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            C2182701Abc c2182701Abc = this.LL;
            c2182701Abc.LIZIZ(c2182701Abc.LIZIZ);
        }
    };

    public final void LIZJ() {
        DataChannelGlobal.LLILZ.zQ2(this);
        C915980Zwa.LJIIIIZZ().vq0(this.LJIIJJI);
        Future<?> future = this.LIZLLL;
        if (future != null) {
            future.cancel(false);
        }
        AnimatedDrawable2 animatedDrawable2 = this.LJIIIIZZ;
        if (animatedDrawable2 != null) {
            animatedDrawable2.stop();
        }
        AnimatedDrawable2 animatedDrawable22 = this.LJIIIZ;
        if (animatedDrawable22 != null) {
            animatedDrawable22.stop();
        }
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = false;
        this.LJI = null;
        this.LJII = null;
    }

    public static boolean LJFF() {
        return C915980Zwa.LIZLLL().ib2() || (C915980Zwa.LIZLLL().Ya1() && C915980Zwa.LIZLLL().LJII() >= 1);
    }

    public static boolean LJ(C1137690fiB c1137690fiB) {
        int i = c1137690fiB.LIZ.LIZIZ;
        if (i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    public final void LIZ(View view) {
        this.LJ = (C1118760fDe) view.findViewById(R.id.ix1);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.CQ2(LiveLinkMicGiftAnimationChannel.class, this, new C2182711Abd(this));
        dataChannelGlobal.CQ2(SmallFlyMicGiftAnimaEndEvent.class, this, new AwS612S0100000_33(this, 4));
        dataChannelGlobal.CQ2(ScreenClearEvent.class, this, new C2182801Abm(this));
        dataChannelGlobal.CQ2(StopFlyMicGiftAnimationEvent.class, this, new C2182751Abh(this));
        C915980Zwa.LJIIIIZZ().VE2(this.LJIIJJI);
        LIZIZ(this.LIZIZ);
    }

    public final void LIZIZ(InterfaceC937840aVq interfaceC937840aVq) {
        float fWidth = interfaceC937840aVq.LJFF().width();
        int i = (int) (0.03f * fWidth);
        int i2 = (int) (fWidth * 0.18f);
        C1118760fDe c1118760fDe = this.LJ;
        if (c1118760fDe != null) {
            c1118760fDe.LIZ(i2, i);
        }
    }

    public final void LIZLLL(C1118840fDm c1118840fDm) {
        int iLJIILL;
        FrameLayout frameLayout;
        C1126540fQC c1126540fQC;
        Map map;
        Integer num;
        C1118830fDl c1118830fDl = c1118840fDm.LIZ;
        long j = c1118830fDl.LJ;
        long j2 = c1118830fDl.LIZLLL;
        if (this.LIZIZ.state().compareTo(EnumC918810a19.StateJoined) < 0) {
            return;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Long lValueOf = Long.valueOf(j);
        c930480aJy.getClass();
        if (!Intrinsics.LJFF(C930480aJy.LJJIJL(lValueOf), this.LIZIZ.LJ())) {
            return;
        }
        if (j2 != 0 && j != 0) {
            if (!LJFF()) {
                C1118780fDg.LIZIZ(new C1118840fDm(c1118840fDm.LIZ, new Pair(new Point(0, 0), new Point(0, 0)), 2, 0L, 8), 5, c1118840fDm.LIZJ, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
                C20441214yg.LIZIZ("GiftExpressionHelper", "layout condition is invalid, so return");
                return;
            }
            DataChannel dataChannel = this.LIZJ;
            if (dataChannel != null && (map = (Map) dataChannel.gg0(C750330Tbz.class)) != null && (num = (Integer) map.get(Long.valueOf(j))) != null) {
                iLJIILL = num.intValue();
            } else {
                iLJIILL = C930480aJy.LJIILL(this.LIZIZ);
            }
            if (this.LJFF == null) {
                this.LJFF = new C1085630eMD<>();
            }
            C1085630eMD<FrameLayout> c1085630eMD = this.LJFF;
            if (c1085630eMD == null || (frameLayout = c1085630eMD.LIZIZ()) == null) {
                frameLayout = new FrameLayout(this.LIZ);
                frameLayout.setId(R.id.c0m);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                C786410Ut5.a6(frameLayout, layoutParams);
            }
            float f = iLJIILL;
            int i = (int) (2.3f * f);
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = i;
            layoutParams2.width = i;
            C786410Ut5.a6(frameLayout, layoutParams2);
            this.LIZIZ.LJJIIJ().addView(frameLayout);
            if (this.LJI == null) {
                this.LJI = new C1085630eMD<>();
            }
            C1085630eMD<C1126540fQC> c1085630eMD2 = this.LJI;
            if (c1085630eMD2 == null || (c1126540fQC = c1085630eMD2.LIZIZ()) == null) {
                c1126540fQC = new C1126540fQC(this.LIZ);
                c1126540fQC.setId(R.id.vlx);
                int i2 = (int) (f * 1.5f);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i2, i2);
                layoutParams3.gravity = 8388659;
                C786410Ut5.t6(c1126540fQC, layoutParams3);
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) c1126540fQC.getLayoutParams();
            double d = 0.8f;
            double d2 = iLJIILL;
            layoutParams4.setMarginStart((int) (Math.random() * d * d2));
            layoutParams4.topMargin = (int) (d * Math.random() * d2);
            C786410Ut5.t6(c1126540fQC, layoutParams4);
            frameLayout.addView(c1126540fQC);
            C1118780fDg.LIZ(c1126540fQC, this.LIZ, c1118840fDm.LIZ.LJIIJJI, new AwS187S0400000_33(this, frameLayout, c1126540fQC, c1118840fDm, 0), new AwS181S0400000_33(this, frameLayout, c1126540fQC, c1118840fDm, 0));
            return;
        }
        C1118780fDg.LIZIZ(c1118840fDm, 1, c1118840fDm.LIZJ, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_GiftExpressionHelper_");
        sbLIZ.append(166);
        C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "sendUid or receiverUid is invalid so return", null, null);
    }

    public final void LJI(C1137690fiB c1137690fiB, ImageModel imageModel) {
        int i;
        C1126540fQC c1126540fQC;
        int iLJIILL;
        Map map;
        Integer num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showBigFlyGift event = ");
        sbLIZ.append(c1137690fiB);
        C20441214yg.LJIIIZ("GiftExpressionHelper", C2188811AlT.LIZIZ(sbLIZ));
        C1118830fDl c1118830fDl = c1137690fiB.LIZ;
        Pair pair = new Pair(new Point(0, 0), new Point(0, 0));
        if (c1137690fiB.LIZ.LJIILIIL == 0) {
            i = 1;
        } else {
            i = 0;
        }
        C1118840fDm c1118840fDm = new C1118840fDm(c1118830fDl, pair, i, System.currentTimeMillis());
        if (this.LJII == null) {
            this.LJII = new C1085630eMD<>();
        }
        C1085630eMD<C1126540fQC> c1085630eMD = this.LJII;
        if (c1085630eMD == null || (c1126540fQC = c1085630eMD.LIZIZ()) == null) {
            c1126540fQC = new C1126540fQC(this.LIZ);
            c1126540fQC.setId(R.id.c0l);
            DataChannel dataChannel = this.LIZJ;
            if (dataChannel != null && (map = (Map) dataChannel.gg0(C750330Tbz.class)) != null && (num = (Integer) map.get(Long.valueOf(c1137690fiB.LIZ.LJ))) != null) {
                iLJIILL = num.intValue();
            } else {
                C930480aJy c930480aJy = C930480aJy.LIZ;
                InterfaceC937840aVq interfaceC937840aVq = this.LIZIZ;
                c930480aJy.getClass();
                iLJIILL = C930480aJy.LJIILL(interfaceC937840aVq);
            }
            int i2 = (int) (iLJIILL * 2.2f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.gravity = 17;
            C786410Ut5.t6(c1126540fQC, layoutParams);
        }
        this.LIZIZ.LJJIIJ().addView(c1126540fQC);
        C1118780fDg.LIZ(c1126540fQC, this.LIZ, imageModel, new AwS322S0300000_33(c1126540fQC, c1118840fDm, this, 0), new AwS310S0300000_33(c1126540fQC, c1118840fDm, this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1AZJ] */
    public C2182701Abc(Context context, InterfaceC937840aVq interfaceC937840aVq, DataChannel dataChannel) {
        this.LIZ = context;
        this.LIZIZ = interfaceC937840aVq;
        this.LIZJ = dataChannel;
    }
}
