package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.linkmic.LiveLinkMicGiftAnimationChannel;
import com.bytedance.android.live.linkmic.SmallFlyMicGiftAnimaEndEvent;
import com.bytedance.android.live.linkmic.StopFlyMicGiftAnimationEvent;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.jvm.internal.AwS181S0400000_33;
import kotlin.jvm.internal.AwS187S0400000_33;
import kotlin.jvm.internal.AwS310S0300000_33;
import kotlin.jvm.internal.AwS322S0300000_33;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1Abb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182691Abb {
    public static final /* synthetic */ int LJIJI = 0;
    public final Context LIZ;
    public C957020b0m LIZIZ;
    public final DataChannel LIZJ;
    public final C939730aYt LIZLLL;
    public Future<?> LJ;
    public C1118760fDe LJFF;
    public ViewTreeObserverOnGlobalLayoutListenerC21523819Lg LJI;
    public C19MW LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public C1085630eMD<FrameLayout> LJIIJ;
    public C1085630eMD<C1126540fQC> LJIIJJI;
    public C1085630eMD<C1126540fQC> LJIIL;
    public AnimatedDrawable2 LJIILIIL;
    public AnimatedDrawable2 LJIILJJIL;
    public boolean LJIILL;
    public Integer LJIILLIIL;
    public C2182851Abr LJIIZILJ;
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 295));

    public final void LIZJ() {
        C1118760fDe c1118760fDe;
        ViewTreeObserver viewTreeObserver;
        DataChannelGlobal.LLILZ.zQ2(this);
        C940770aaZ.LIZ().LJJ((C952210at1) this.LJIJ.getValue());
        Future<?> future = this.LJ;
        if (future != null) {
            future.cancel(false);
        }
        AnimatedDrawable2 animatedDrawable2 = this.LJIILIIL;
        if (animatedDrawable2 != null) {
            animatedDrawable2.stop();
        }
        AnimatedDrawable2 animatedDrawable22 = this.LJIILJJIL;
        if (animatedDrawable22 != null) {
            animatedDrawable22.stop();
        }
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = false;
        this.LJIIJJI = null;
        this.LJIIL = null;
        try {
            C1118760fDe c1118760fDe2 = this.LJFF;
            if (c1118760fDe2 != null) {
                C500260Jjc.LJJJLL(c1118760fDe2);
            }
            C19MW c19mw = this.LJII;
            if (c19mw != null) {
                C500260Jjc.LJJJLL(c19mw);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove giftExpressionToLinkerAnimationView failed e=");
            sbLIZ.append(e.getMessage());
            C937310aUz.LJFF("GiftExpressionHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        }
        ViewTreeObserverOnGlobalLayoutListenerC21523819Lg viewTreeObserverOnGlobalLayoutListenerC21523819Lg = this.LJI;
        if (viewTreeObserverOnGlobalLayoutListenerC21523819Lg != null && (c1118760fDe = this.LJFF) != null && (viewTreeObserver = c1118760fDe.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC21523819Lg);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC21523819Lg, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LJFF = null;
        this.LJII = null;
        this.LJI = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final C1118760fDe LIZLLL() {
        C1118760fDe c1118760fDe = this.LJFF;
        if (c1118760fDe != null) {
            return c1118760fDe;
        }
        C1118760fDe c1118760fDe2 = new C1118760fDe(this.LIZ, null, 6);
        C19ME c19me = new C19ME(-1, -2);
        Resources resources = c1118760fDe2.getContext().getResources();
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) resources.getDimension(R.dimen.abl);
        if (this.LIZIZ.LLJIJIL) {
            c19me.setMarginEnd((int) resources.getDimension(R.dimen.t8));
        }
        Integer num = this.LJIILLIIL;
        if (num != null) {
            c19me.topToTop = num.intValue();
        }
        c19me.endToEnd = 0;
        C2182851Abr c2182851Abr = new AbstractC2182831Abp() { // from class: X.1Abr
        };
        this.LJIIZILJ = c2182851Abr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIIZ());
        sbLIZ.append(",needLayoutModificationType = ");
        sbLIZ.append(c2182851Abr);
        C20441214yg.LIZIZ("GiftExpressionHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        C2182861Abs c2182861Abs = new AbstractC2182831Abp() { // from class: X.1Abs
        };
        if (!Intrinsics.LJFF(c2182851Abr, c2182861Abs)) {
            C2182841Abq c2182841Abq = new AbstractC2182831Abp() { // from class: X.1Abq
            };
            if (!Intrinsics.LJFF(c2182851Abr, c2182841Abq)) {
                C2182871Abt c2182871Abt = new AbstractC2182831Abp() { // from class: X.1Abt
                };
                if (Intrinsics.LJFF(c2182851Abr, c2182871Abt)) {
                    if (!Intrinsics.LJFF(this.LJIIZILJ, c2182871Abt)) {
                        C20441214yg.LIZIZ("GiftExpressionHelperV2", "modifyForTopEndSytle");
                        c19me.topToTop = 0;
                        c19me.startToEnd = -1;
                        c19me.bottomToBottom = -1;
                        c19me.endToEnd = 0;
                        c19me.setMarginEnd((int) C497740JfY.LIZIZ(4.0f));
                        c19me.setMarginStart((int) C497740JfY.LIZIZ(4.0f));
                    }
                } else if (!Intrinsics.LJFF(c2182851Abr, c2182851Abr)) {
                    throw new C1954807lC();
                }
            } else if (!Intrinsics.LJFF(this.LJIIZILJ, c2182841Abq)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LJIIIZ());
                sbLIZ2.append(", modifyForBottonEndSytle");
                C20441214yg.LIZIZ("GiftExpressionHelperV2", C2188811AlT.LIZIZ(sbLIZ2));
                c19me.topToTop = -1;
                c19me.startToEnd = -1;
                c19me.bottomToBottom = 0;
                c19me.endToEnd = 0;
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C497740JfY.LIZIZ(4.0f);
                c19me.setMarginEnd((int) C497740JfY.LIZIZ(4.0f));
            }
        } else if (!Intrinsics.LJFF(this.LJIIZILJ, c2182861Abs)) {
            C20441214yg.LIZIZ("GiftExpressionHelperV2", "modifyForTopStartStyle");
            C19MW c19mw = this.LJII;
            if (c19mw == null) {
                c19mw = new C19MW(this.LIZLLL.getContext());
                c19mw.setId(View.generateViewId());
                c19mw.setType(6);
                c19mw.setReferencedIds(LJI() ? C13LP.LLII(C13LP.LJJJJLI(C1697810uHb.LJIIJJI(this.LIZLLL.getLinearLayoutMap().get(EnumC939920aZC.TOP_UNDER_BANNER), this.LIZLLL.getLinearLayoutMap().get(EnumC939920aZC.TOP_UNDER_BANNER_SECOND)))) : C13LP.LLII(C13LP.LJJJJLI(C1697810uHb.LJIIJJI(this.LIZLLL.getLinearLayoutMap().get(EnumC939920aZC.TOP_START), this.LIZLLL.getLinearLayoutMap().get(EnumC939920aZC.TOP_START_SECOND), this.LIZLLL.getLinearLayoutMap().get(EnumC939920aZC.TOP_START_THIRD)))));
                C786410Ut5.l6(c19mw, new C19ME(-2, -2));
            }
            if (c19mw.getParent() == null) {
                this.LIZLLL.addView(c19mw);
            }
            this.LJII = c19mw;
            c19me.startToEnd = c19mw.getId();
            c19me.topToTop = 0;
            c19me.bottomToBottom = -1;
            c19me.endToEnd = 0;
            c19me.constrainedWidth = true;
            c19me.horizontalBias = 0.0f;
            c19me.setMarginStart((int) C497740JfY.LIZIZ(4.0f));
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = LJI() ? C916800Zxu.LIZJ() : (int) C497740JfY.LIZIZ(4.0f);
        }
        this.LJIIZILJ = c2182851Abr;
        c1118760fDe2.setGravity(8388629);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1118760fDe2);
        c1118760fDe2.setLayoutParams(c19me);
        ViewTreeObserverOnGlobalLayoutListenerC21523819Lg viewTreeObserverOnGlobalLayoutListenerC21523819Lg = new ViewTreeObserverOnGlobalLayoutListenerC21523819Lg(c1118760fDe2, 0);
        C786410Ut5.x3(c1118760fDe2.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC21523819Lg);
        if (this.LJI != null) {
            C786410Ut5.C3(c1118760fDe2.getViewTreeObserver(), this.LJI);
        }
        this.LJI = viewTreeObserverOnGlobalLayoutListenerC21523819Lg;
        this.LIZLLL.addView(c1118760fDe2);
        this.LJFF = c1118760fDe2;
        return c1118760fDe2;
    }

    public final String LJIIIZ() {
        PosIdentity posIdentity;
        PosIdentity posIdentity2;
        if (this.LIZIZ.getPosIdentity() == null || (posIdentity = this.LIZIZ.getPosIdentity()) == null || posIdentity.type != 1 || (posIdentity2 = this.LIZIZ.getPosIdentity()) == null) {
            return null;
        }
        return posIdentity2.value;
    }

    public static boolean LJII() {
        return C915980Zwa.LIZLLL().ib2() || (C915980Zwa.LIZLLL().Ya1() && C915980Zwa.LIZLLL().LJII() >= 1);
    }

    public final boolean LJI() {
        if (C940770aaZ.LIZ().getDataSource().LJII() != 1) {
            return false;
        }
        C957020b0m c957020b0m = this.LIZIZ;
        if (c957020b0m.LLJIJIL) {
            return false;
        }
        MultiGuestSpotExtra multiGuestExtra = c957020b0m.getMultiGuestExtra();
        return C500260Jjc.LJJJI(multiGuestExtra != null ? Boolean.valueOf(multiGuestExtra.isEnlarged) : null);
    }

    public static boolean LJFF(C1137690fiB c1137690fiB) {
        int i = c1137690fiB.LIZ.LIZIZ;
        if (i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    public final void LIZ(Integer num) {
        this.LJIILLIIL = num;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.CQ2(LiveLinkMicGiftAnimationChannel.class, this, new C2182721Abe(this));
        dataChannelGlobal.CQ2(SmallFlyMicGiftAnimaEndEvent.class, this, new AwS612S0100000_33(this, 5));
        dataChannelGlobal.CQ2(ScreenClearEvent.class, this, new C2182791Abl(this));
        dataChannelGlobal.CQ2(StopFlyMicGiftAnimationEvent.class, this, new C2182781Abk(this));
        C940770aaZ.LIZ().LJIIZILJ((C952210at1) this.LJIJ.getValue());
        LIZIZ(this.LIZIZ);
    }

    public final void LIZIZ(C957020b0m c957020b0m) {
        float fWidth = c957020b0m.getShapeDescriptor().LIZ.width();
        this.LJIIIZ = (int) (0.03f * fWidth);
        this.LJIIIIZZ = (int) (fWidth * 0.18f);
        LIZLLL().LIZ(this.LJIIIIZZ, this.LJIIIZ);
    }

    public final void LJ(C1118840fDm c1118840fDm) {
        int iLJIILJJIL;
        FrameLayout frameLayout;
        C1126540fQC c1126540fQC;
        Map map;
        Integer num;
        C1118830fDl c1118830fDl = c1118840fDm.LIZ;
        long j = c1118830fDl.LJ;
        long j2 = c1118830fDl.LIZLLL;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Long lValueOf = Long.valueOf(j);
        c930480aJy.getClass();
        if (!Intrinsics.LJFF(C930480aJy.LJJIJL(lValueOf), LJIIIZ())) {
            return;
        }
        if (j2 != 0 && j != 0) {
            if (!LJII()) {
                C1118780fDg.LIZIZ(new C1118840fDm(c1118840fDm.LIZ, new Pair(new Point(0, 0), new Point(0, 0)), 2, 0L, 8), 5, c1118840fDm.LIZJ, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
                C20441214yg.LIZIZ("GiftExpressionHelperV2", "layout condition is invalid, so return");
                return;
            }
            DataChannel dataChannel = this.LIZJ;
            if (dataChannel != null && (map = (Map) dataChannel.gg0(C750330Tbz.class)) != null && (num = (Integer) map.get(Long.valueOf(j))) != null) {
                iLJIILJJIL = num.intValue();
            } else {
                iLJIILJJIL = C930480aJy.LJIILJJIL(this.LIZIZ);
            }
            if (this.LJIIJ == null) {
                this.LJIIJ = new C1085630eMD<>();
            }
            C1085630eMD<FrameLayout> c1085630eMD = this.LJIIJ;
            if (c1085630eMD == null || (frameLayout = c1085630eMD.LIZIZ()) == null) {
                frameLayout = new FrameLayout(this.LIZ);
                frameLayout.setId(R.id.c0m);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                C786410Ut5.a6(frameLayout, layoutParams);
            }
            float f = iLJIILJJIL;
            int i = (int) (2.3f * f);
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = i;
            layoutParams2.width = i;
            C786410Ut5.a6(frameLayout, layoutParams2);
            this.LIZIZ.addView(frameLayout);
            if (this.LJIIJJI == null) {
                this.LJIIJJI = new C1085630eMD<>();
            }
            C1085630eMD<C1126540fQC> c1085630eMD2 = this.LJIIJJI;
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
            double d2 = iLJIILJJIL;
            layoutParams4.setMarginStart((int) (Math.random() * d * d2));
            layoutParams4.topMargin = (int) (d * Math.random() * d2);
            C786410Ut5.t6(c1126540fQC, layoutParams4);
            frameLayout.addView(c1126540fQC);
            C1118780fDg.LIZ(c1126540fQC, this.LIZ, c1118840fDm.LIZ.LJIIJJI, new AwS187S0400000_33(this, frameLayout, c1126540fQC, c1118840fDm, 1), new AwS181S0400000_33(this, frameLayout, c1126540fQC, c1118840fDm, 1));
            return;
        }
        C1118780fDg.LIZIZ(c1118840fDm, 1, c1118840fDm.LIZJ, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_GiftExpressionHelperV2_");
        sbLIZ.append(166);
        C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "sendUid or receiverUid is invalid so return", null, null);
    }

    public final void LJIIIIZZ(C1137690fiB c1137690fiB, ImageModel imageModel) {
        int i;
        C1126540fQC c1126540fQC;
        int iLJIILJJIL;
        Map map;
        Integer num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showBigFlyGift event = ");
        sbLIZ.append(c1137690fiB);
        C20441214yg.LJIIIZ("GiftExpressionHelperV2", C2188811AlT.LIZIZ(sbLIZ));
        C1118830fDl c1118830fDl = c1137690fiB.LIZ;
        Pair pair = new Pair(new Point(0, 0), new Point(0, 0));
        if (c1137690fiB.LIZ.LJIILIIL == 0) {
            i = 1;
        } else {
            i = 0;
        }
        C1118840fDm c1118840fDm = new C1118840fDm(c1118830fDl, pair, i, System.currentTimeMillis());
        if (this.LJIIL == null) {
            this.LJIIL = new C1085630eMD<>();
        }
        C1085630eMD<C1126540fQC> c1085630eMD = this.LJIIL;
        if (c1085630eMD == null || (c1126540fQC = c1085630eMD.LIZIZ()) == null) {
            c1126540fQC = new C1126540fQC(this.LIZ);
            c1126540fQC.setId(R.id.c0l);
            DataChannel dataChannel = this.LIZJ;
            if (dataChannel != null && (map = (Map) dataChannel.gg0(C750330Tbz.class)) != null && (num = (Integer) map.get(Long.valueOf(c1137690fiB.LIZ.LJ))) != null) {
                iLJIILJJIL = num.intValue();
            } else {
                C930480aJy c930480aJy = C930480aJy.LIZ;
                C957020b0m c957020b0m = this.LIZIZ;
                c930480aJy.getClass();
                iLJIILJJIL = C930480aJy.LJIILJJIL(c957020b0m);
            }
            int i2 = (int) (iLJIILJJIL * 2.2f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.gravity = 17;
            C786410Ut5.t6(c1126540fQC, layoutParams);
        }
        this.LIZIZ.addView(c1126540fQC);
        C1118780fDg.LIZ(c1126540fQC, this.LIZ, imageModel, new AwS322S0300000_33(c1126540fQC, c1118840fDm, this, 1), new AwS310S0300000_33(c1126540fQC, c1118840fDm, this, 2));
    }

    public C2182691Abb(Context context, C957020b0m c957020b0m, DataChannel dataChannel, C939730aYt c939730aYt) {
        this.LIZ = context;
        this.LIZIZ = c957020b0m;
        this.LIZJ = dataChannel;
        this.LIZLLL = c939730aYt;
    }
}
