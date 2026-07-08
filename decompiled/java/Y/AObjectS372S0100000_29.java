package Y;

import X.C117U;
import X.C124Q;
import X.C124S;
import X.C124T;
import X.C19557511fR;
import X.C19557811fU;
import X.C19574811iE;
import X.C196874120y;
import X.C196959124f;
import X.C196964124k;
import X.C348100Dkm;
import X.C348440DlK;
import X.EnumC390580FTc;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AObjectS372S0100000_29 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public AObjectS372S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        C19557811fU c19557811fU = (C19557811fU) aObjectS372S0100000_29.l0;
        c19557811fU.LJJJIL = 1;
        c19557811fU.LJIIJJI();
        c19557811fU.LJIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        String key;
        C19557811fU c19557811fU = (C19557811fU) aObjectS372S0100000_29.l0;
        EffectPointModel effectPointModel = c19557811fU.LJJIJIL;
        long jLongValue = ((Float) obj).longValue();
        long jMo51if = c19557811fU.LJJI.mo51if();
        String key2 = null;
        if (effectPointModel != null) {
            key = effectPointModel.getKey();
        } else {
            key = null;
        }
        if (Intrinsics.LJFF(key, "2")) {
            jMo51if += jLongValue * ((long) 2);
        } else {
            if (effectPointModel != null) {
                key2 = effectPointModel.getKey();
            }
            if (Intrinsics.LJFF(key2, "3")) {
                jMo51if = (jMo51if - jLongValue) + ((long) (jLongValue / 0.5f));
            }
        }
        return Long.valueOf(jMo51if);
    }

    public static final Object invoke$10(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        C348440DlK c348440DlKLJJIIJZLJL = c348100Dkm.LJIIIZ().LJJIIJZLJL(((C196874120y) aObjectS372S0100000_29.l0).LLILLL.uuid);
        if (c348440DlKLJJIIJZLJL != null) {
            c348100Dkm.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            return null;
        }
        return null;
    }

    public static final Object invoke$11(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        IAVEffectService iAVEffectService = (IAVEffectService) aObjectS372S0100000_29.l0;
        if (iAVEffectService.getEffectPlatformDefaultRegionCallback() != null) {
            iAVEffectService.getEffectPlatformDefaultRegionCallback().invoke(obj);
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        C124Q c124q = (C124Q) aObjectS372S0100000_29.l0;
        Integer num = (Integer) obj;
        c124q.getClass();
        c124q.setFontSize(num.intValue());
        C124S c124s = c124q.LLJJL;
        if (c124s != null) {
            num.intValue();
            C124T c124t = ((C196959124f) c124s).LIZ;
            c124t.LLLJL = true;
            C196964124k c196964124k = c124t.LLLJ;
            c196964124k.LLIZLLLIL.LIZIZ(c196964124k.LLJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        String key;
        C19557511fR c19557511fR = (C19557511fR) aObjectS372S0100000_29.l0;
        EffectPointModel effectPointModel = c19557511fR.LJJJ;
        long jLongValue = ((Float) obj).longValue();
        long jLJFF = c19557511fR.LJFF();
        String key2 = null;
        if (effectPointModel != null) {
            key = effectPointModel.getKey();
        } else {
            key = null;
        }
        if (Intrinsics.LJFF(key, "2")) {
            jLJFF += jLongValue * ((long) 2);
        } else {
            if (effectPointModel != null) {
                key2 = effectPointModel.getKey();
            }
            if (Intrinsics.LJFF(key2, "3")) {
                jLJFF = (jLJFF - jLongValue) + ((long) (jLongValue / 0.5f));
            }
        }
        return Long.valueOf(jLJFF);
    }

    public static final Object invoke$4(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        C19557511fR c19557511fR = (C19557511fR) aObjectS372S0100000_29.l0;
        c19557511fR.LJJJJJL = 1;
        c19557511fR.LJIIL();
        c19557511fR.LJIJI();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        C19557511fR c19557511fR = (C19557511fR) aObjectS372S0100000_29.l0;
        c19557511fR.LJJJJJL = 1;
        c19557511fR.LJIIL();
        c19557511fR.LJIJI();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        ((C117U) aObjectS372S0100000_29.l0).LJIIJ();
        return null;
    }

    public static final Object invoke$7(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        ((C117U) aObjectS372S0100000_29.l0).LJIIJ();
        return null;
    }

    public static final Object invoke$8(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        C19574811iE c19574811iE = (C19574811iE) aObjectS372S0100000_29.l0;
        c19574811iE.LJJLIIIJILLIZJL = true;
        c19574811iE.LJII.dismiss();
        c19574811iE.LJII = null;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS372S0100000_29 aObjectS372S0100000_29, Object obj) {
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        C348440DlK c348440DlKLJJIIJZLJL = c348100Dkm.LJIIIZ().LJJIIJZLJL(((C196874120y) aObjectS372S0100000_29.l0).LLILLL.uuid);
        if (c348440DlKLJJIIJZLJL != null) {
            c348440DlKLJJIIJZLJL.LJIIIZ = EnumC390580FTc.EMPHASIZED.ordinal();
            c348100Dkm.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            return null;
        }
        return null;
    }
}
