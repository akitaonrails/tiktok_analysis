package Y;

import X.AbstractC1627380sS0;
import X.AbstractC1653130t7X;
import X.AbstractC1662050tLv;
import X.AbstractC19875512pd;
import X.C0FI2;
import X.C0P0T;
import X.C1361400lX0;
import X.C1391600mJi;
import X.C1420250n3v;
import X.C1425580nCW;
import X.C1628610sTz;
import X.C1629570sVX;
import X.C1650630t3V;
import X.C1650960t42;
import X.C1650980t44;
import X.C1651010t47;
import X.C1653070t7R;
import X.C1653090t7T;
import X.C1653110t7V;
import X.C1653120t7W;
import X.C1653370t7v;
import X.C1653530t8B;
import X.C1655760tBm;
import X.C1662030tLt;
import X.C1662100tM0;
import X.C1684090tvT;
import X.C19A3;
import X.C1C7U;
import X.C1DRG;
import X.C298130BmN;
import X.C418440Gaw;
import X.C430610GuZ;
import X.C450720Hlu;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC1366460lfA;
import X.EnumC1651770t5L;
import X.EnumC1653380t7w;
import X.InterfaceC1340660kzY;
import X.InterfaceC1622070sJR;
import X.InterfaceC1625550sP3;
import X.InterfaceC1650740t3g;
import X.InterfaceC1650770t3j;
import X.InterfaceC1651080t4E;
import X.InterfaceC1651490t4t;
import X.InterfaceC1656000tCA;
import X.InterfaceC1658260tFo;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.bottom.f0;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;
import pyl.s;

/* JADX INFO: loaded from: classes26.dex */
public class ARunnableS58S0300000_25 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1361400lX0 c1361400lX0LJFF;
        C0P0T second;
        if (((View) this.l0).getParent() == null || (c1361400lX0LJFF = C1425580nCW.LIZIZ.LJFF(((View) this.l0).getContext())) == null) {
            return;
        }
        View view = (View) this.l0;
        final C1653370t7v c1653370t7v = (C1653370t7v) this.l1;
        Lifecycle lifecycle = ((C1653530t8B) this.l2).LJ().getLifecycle();
        if (C1420250n3v.LIZIZ().getBoolean("has_shown_landing_create_guide", false)) {
            return;
        }
        EnumC1653380t7w enumC1653380t7w = EnumC1653380t7w.LANDING_CREATE;
        if (c1653370t7v.LIZ(enumC1653380t7w) && lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            Pair<Integer, Integer> pairLIZ = C430610GuZ.LIZ(view);
            int iIntValue = pairLIZ.getFirst().intValue();
            int iIntValue2 = pairLIZ.getSecond().intValue();
            C450720Hlu c450720Hlu = new C450720Hlu(c1361400lX0LJFF);
            c450720Hlu.LJIIJ(2131829657);
            c450720Hlu.LIZ(iIntValue, iIntValue2);
            EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZLLL = enumC1235690iGF;
            c1391600mJi.LJII = 3000L;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
            c1391600mJi2.LJIIIIZZ = iLIZIZ;
            c1391600mJi2.LJIJJ = true;
            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
            Pair<? extends EnumC1653380t7w, ? extends C0P0T> pair = c1653370t7v.LIZIZ;
            if (pair != null && (second = pair.getSecond()) != null) {
                second.dismiss();
            }
            c1653370t7v.LIZIZ = new Pair<>(enumC1653380t7w, c0p0tLIZIZ);
            c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0t8F
                @Override // X.InterfaceC1340660kzY
                public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                    C1653370t7v c1653370t7v2 = c1653370t7v;
                    EnumC1653380t7w enumC1653380t7w2 = EnumC1653380t7w.LANDING_CREATE;
                    Pair<? extends EnumC1653380t7w, ? extends C0P0T> pair2 = c1653370t7v2.LIZIZ;
                    if (pair2 != null && pair2.getFirst() == enumC1653380t7w2) {
                        c1653370t7v2.LIZIZ = null;
                    }
                }
            });
            c0p0tLIZIZ.show();
            C1420250n3v.LIZIZ().storeBoolean("has_shown_landing_create_guide", true);
        }
    }

    public static final void run$0(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        C1655760tBm c1655760tBm = (C1655760tBm) aRunnableS58S0300000_25.l0;
        InterfaceC1656000tCA interfaceC1656000tCA = (InterfaceC1656000tCA) aRunnableS58S0300000_25.l1;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) aRunnableS58S0300000_25.l2;
        c1655760tBm.getClass();
        interfaceC1656000tCA.LIZ(recorderConcatResult.ret, recorderConcatResult.videoPath, recorderConcatResult.audioPath, c1655760tBm.LIZJ);
    }

    public static final void run$1(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("FTCRecordBottomTabComponent@8364.addBottomTab$1$3$2");
        try {
            C1653110t7V.changeToDefaultTab((C1653110t7V) aRunnableS58S0300000_25.l0, (C19A3) aRunnableS58S0300000_25.l1, (C1653090t7T) aRunnableS58S0300000_25.l2, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FTCRecordBottomTabComponent@8364.addBottomTab$1$3$2");
    }

    public static final void run$10(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("RecordToolbarCreator@8b2d.onCreate$callback$1$1$1");
        try {
            ((InterfaceC1651490t4t) aRunnableS58S0300000_25.l0).LJ(EnumC1651770t5L.SPEED, new AwS391S0200000_25((s) aRunnableS58S0300000_25.l1, (C1650960t42) aRunnableS58S0300000_25.l2, 211));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordToolbarCreator@8b2d.onCreate$callback$1$1$1");
    }

    public static final void run$11(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("ToolbarPromoteManager@af2b.showPromote$1$1$1");
        try {
            ((View) aRunnableS58S0300000_25.l0).performClick();
            C1662030tLt.LJFF((C1662030tLt) aRunnableS58S0300000_25.l1, ((C1662100tM0) aRunnableS58S0300000_25.l2).LIZ, false, 28);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolbarPromoteManager@af2b.showPromote$1$1$1");
    }

    public static final void run$12(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("ToolbarPromoteManager@af2b.showPromote$1$2");
        try {
            if (((AbstractC1662050tLv) aRunnableS58S0300000_25.l0).getParent() != null) {
                C1662030tLt.LJFF((C1662030tLt) aRunnableS58S0300000_25.l1, ((C1662100tM0) aRunnableS58S0300000_25.l2).LIZ, true, 28);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolbarPromoteManager@af2b.showPromote$1$2");
    }

    public static final void run$13(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        InterfaceC1650740t3g interfaceC1650740t3g;
        C1C7U.LIZ("FTCToolbarCreator@87cb.onCreate$3$1$1");
        try {
            ((Function0) aRunnableS58S0300000_25.l0).invoke();
            Object objLJII = ((C1DRG) aRunnableS58S0300000_25.l1).LJII(InterfaceC1650770t3j.class, null);
            C1650630t3V c1650630t3V = (C1650630t3V) aRunnableS58S0300000_25.l2;
            InterfaceC1650770t3j interfaceC1650770t3j = (InterfaceC1650770t3j) objLJII;
            C1650980t44 c1650980t44Ss = interfaceC1650770t3j.ss(1);
            if (c1650980t44Ss != null && (interfaceC1650740t3g = c1650980t44Ss.LLJILJILJ) != null) {
                interfaceC1650740t3g.LIZ();
            }
            interfaceC1650770t3j.m2((C1650980t44) c1650630t3V.LIZJ.getValue());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FTCToolbarCreator@87cb.onCreate$3$1$1");
    }

    public static final void run$14(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("ScreenShotFloatingViewProvider@87d9.configFloatingView$4");
        try {
            C786410Ut5.LJJJLZIJ((ViewGroup) aRunnableS58S0300000_25.l1, (ViewGroup) aRunnableS58S0300000_25.l0);
            Iterator it2 = ((AbstractC19875512pd) aRunnableS58S0300000_25.l2).iterator();
            while (it2.hasNext()) {
                Function1<EnumC1366460lfA, Unit> function1 = ((C1684090tvT) it2.next()).LJ;
                if (function1 != null) {
                    function1.invoke(EnumC1366460lfA.AUTO_DISMISS);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScreenShotFloatingViewProvider@87d9.configFloatingView$4");
    }

    public static final void run$15(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("EditorTabModule@a6e1.tryShowLandingCreateTooltip$1");
        try {
            aRunnableS58S0300000_25.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorTabModule@a6e1.tryShowLandingCreateTooltip$1");
    }

    public static final void run$2(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("StickerNoticeHandler@eb24.oldWarning$1$1");
        try {
            ((C1628610sTz) aRunnableS58S0300000_25.l0).LLILLL.hideNotice();
            ((InterfaceC1622070sJR) aRunnableS58S0300000_25.l1).LIZ((AbstractC1627380sS0) aRunnableS58S0300000_25.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerNoticeHandler@eb24.oldWarning$1$1");
    }

    public static final void run$3(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("ToolbarCreator@23f7.onCreate$5$1$1");
        try {
            C1651010t47 c1651010t47 = (C1651010t47) aRunnableS58S0300000_25.l0;
            C1DRG c1drg = (C1DRG) aRunnableS58S0300000_25.l1;
            C1650980t44 c1650980t44 = (C1650980t44) aRunnableS58S0300000_25.l2;
            c1651010t47.getClass();
            C1651010t47.LIZLLL(c1drg, c1650980t44, true);
            if (((C1651010t47) aRunnableS58S0300000_25.l0).LJFF) {
                ((InterfaceC1651080t4E) ((C1DRG) aRunnableS58S0300000_25.l1).LJII(InterfaceC1651080t4E.class, null)).XI0().LJII((C1650980t44) aRunnableS58S0300000_25.l2, true);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolbarCreator@23f7.onCreate$5$1$1");
    }

    public static final void run$4(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("ToolbarCreator@23f7.onCreate$5$1$2");
        try {
            C1651010t47 c1651010t47 = (C1651010t47) aRunnableS58S0300000_25.l0;
            C1DRG c1drg = (C1DRG) aRunnableS58S0300000_25.l1;
            C1650980t44 c1650980t44 = (C1650980t44) aRunnableS58S0300000_25.l2;
            c1651010t47.getClass();
            C1651010t47.LIZLLL(c1drg, c1650980t44, true);
            if (((C1651010t47) aRunnableS58S0300000_25.l0).LJFF) {
                ((InterfaceC1651080t4E) ((C1DRG) aRunnableS58S0300000_25.l1).LJII(InterfaceC1651080t4E.class, null)).XI0().LJII((C1650980t44) aRunnableS58S0300000_25.l2, true);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolbarCreator@23f7.onCreate$5$1$2");
    }

    public static final void run$5(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("LighteningBottomTabComponent@a454.internalAddLiveBottomTab$1$3$2");
        try {
            AbstractC1653130t7X.W1((f0) aRunnableS58S0300000_25.l0, (C19A3) aRunnableS58S0300000_25.l1, (C1653090t7T) aRunnableS58S0300000_25.l2, false, 2, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LighteningBottomTabComponent@a454.internalAddLiveBottomTab$1$3$2");
    }

    public static final void run$6(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("LighteningBottomTabComponentLegacy@2b9d.internalAddLiveBottomTab$1$3$2");
        try {
            C1653120t7W.changeToDefaultTab((C1653120t7W) aRunnableS58S0300000_25.l0, (C19A3) aRunnableS58S0300000_25.l1, (C1653090t7T) aRunnableS58S0300000_25.l2, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LighteningBottomTabComponentLegacy@2b9d.internalAddLiveBottomTab$1$3$2");
    }

    public static final void run$7(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("RecordBottomTabComponent@ae2c.addLiveBottomTab$1$3$2");
        try {
            C1653070t7R.changeToDefaultTab$default((C1653070t7R) aRunnableS58S0300000_25.l0, (C19A3) aRunnableS58S0300000_25.l1, (C1653090t7T) aRunnableS58S0300000_25.l2, false, 2, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordBottomTabComponent@ae2c.addLiveBottomTab$1$3$2");
    }

    public static final void run$8(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.download$runnable$1");
        try {
            ((C1629570sVX) aRunnableS58S0300000_25.l0).LIZIZ((Effect) aRunnableS58S0300000_25.l1, (InterfaceC1625550sP3) aRunnableS58S0300000_25.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.download$runnable$1");
    }

    public static final void run$9(ARunnableS58S0300000_25 aRunnableS58S0300000_25) {
        C0FI2 c0fi2 = (C0FI2) aRunnableS58S0300000_25.l0;
        Context context = (Context) aRunnableS58S0300000_25.l1;
        InterfaceC1658260tFo interfaceC1658260tFo = (InterfaceC1658260tFo) aRunnableS58S0300000_25.l2;
        c0fi2.getClass();
        C1C7U.LIZ("EditStickerFontStyleManager@4190.prefetchAsync$1L");
        c0fi2.LJJIL(context, Boolean.valueOf(!C298130BmN.LIZ()));
        if (interfaceC1658260tFo != null) {
            interfaceC1658260tFo.onComplete();
        }
        C1C7U.LIZIZ("EditStickerFontStyleManager@4190.prefetchAsync$1L");
    }

    public ARunnableS58S0300000_25(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
