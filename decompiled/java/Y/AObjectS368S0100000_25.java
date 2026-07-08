package Y;

import X.AbstractC1683310tuD;
import X.AbstractC1685970tyV;
import X.AbstractC1686530tzP;
import X.C05P0;
import X.C05P1;
import X.C1296530jqN;
import X.C1324630kZh;
import X.C1325700kbQ;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C13LP;
import X.C1627000sRO;
import X.C1629980sWC;
import X.C1642110spl;
import X.C1668650tWZ;
import X.C1670570tZf;
import X.C1672790tdF;
import X.C1673360teA;
import X.C1676820tjk;
import X.C1680770tq7;
import X.C1683260tu8;
import X.C1692150u8T;
import X.C1695230uDR;
import X.C1696880uG6;
import X.C1697810uHb;
import X.C259800zU;
import X.C522630Keb;
import X.C524780Ki4;
import X.C814420VxA;
import X.InterfaceC1644770su3;
import X.InterfaceC1669010tX9;
import X.InterfaceC1675870tiD;
import X.InterfaceC1679550to9;
import X.InterfaceC1686290tz1;
import X.InterfaceC1690500u5o;
import a6n.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.recorder.configs.UpdateAlbumUploadButtonPlaceholderImage;
import com.tts.oecverify.BdTuring;
import dtj.u7;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS368S0100000_25 implements Function1 {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    public AObjectS368S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        C1627000sRO.LIZIZ(((C1629980sWC) aObjectS368S0100000_25.l0).LIZJ, true);
        return null;
    }

    public static final Object invoke$1(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        final C1642110spl c1642110spl = (C1642110spl) aObjectS368S0100000_25.l0;
        Function1<? super Bitmap, Unit> function1 = c1642110spl.LLJI;
        if (function1 != null) {
            function1.invoke(obj);
        }
        if (obj != null) {
            if (UpdateAlbumUploadButtonPlaceholderImage.isEnabled() && C522630Keb.LIZ() == 0) {
                final AObjectS66S0000000_13 aObjectS66S0000000_13 = new AObjectS66S0000000_13(0);
                HandlerHook.viewPost(c1642110spl.LL, new Runnable() { // from class: X.0Uts
                    public final /* synthetic */ float LLILLJJLI = 1.0f;

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1642110spl c1642110spl2 = c1642110spl;
                        float f = this.LLILLJJLI;
                        Function0 function0 = aObjectS66S0000000_13;
                        c1642110spl2.getClass();
                        C1C7U.LIZ("UploadButton@5577.updateScale$1L");
                        C1325000kaI c1325000kaI = c1642110spl2.LL;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1325000kaI);
                        c1325000kaI.setScaleX(f);
                        C1325000kaI c1325000kaI2 = c1642110spl2.LL;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1325000kaI2);
                        c1325000kaI2.setScaleY(f);
                        function0.invoke();
                        C1C7U.LIZIZ("UploadButton@5577.updateScale$1L");
                    }
                });
            }
            if (!c1642110spl.LLJ) {
                c1642110spl.LLJ = true;
                if (u7.LJ() || u7.LIZIZ()) {
                    C524780Ki4.LIZ.end("tool_performance_show_album_icon", "image loaded");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        int i = 0;
        for (AbstractC1686530tzP abstractC1686530tzP : (List) aObjectS368S0100000_25.l0) {
            AbstractC1683310tuD.LJFF(abstractC1683310tuD, abstractC1686530tzP, 0, i);
            i += abstractC1686530tzP.LLILLJJLI;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        float fFloatValue = ((Number) ((C05P1) aObjectS368S0100000_25.l0).getValue()).floatValue();
        long jLJIJI = interfaceC1669010tX9.LJIJI();
        C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
        c1695230uDRLJLJI.LIZ().save();
        try {
            c1695230uDRLJLJI.LIZ.LJFF(fFloatValue, jLJIJI);
            interfaceC1669010tX9.LLIIJLIL();
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
            throw th;
        }
    }

    public static final Object invoke$12(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        List list = (List) aObjectS368S0100000_25.l0;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) obj2;
                Iterator it2 = C13LP.LL(list, i).iterator();
                int iLJJL = 0;
                while (it2.hasNext()) {
                    iLJJL += ((AbstractC1686530tzP) it2.next()).LJJL();
                }
                AbstractC1683310tuD.LJFF(abstractC1683310tuD, abstractC1686530tzP, 0, iLJJL);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        float fFloatValue = ((Number) ((C05P1) aObjectS368S0100000_25.l0).getValue()).floatValue();
        long jLJIJI = interfaceC1669010tX9.LJIJI();
        C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
        c1695230uDRLJLJI.LIZ().save();
        try {
            c1695230uDRLJLJI.LIZ.LJFF(fFloatValue, jLJIJI);
            interfaceC1669010tX9.LLIIJLIL();
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
            throw th;
        }
    }

    public static final Object invoke$14(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        Function0 function0 = (Function0) aObjectS368S0100000_25.l0;
        ((Boolean) obj).booleanValue();
        function0.invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) throws Throwable {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        C1692150u8T c1692150u8T = (C1692150u8T) ((C259800zU) aObjectS368S0100000_25.l0).element;
        if (c1692150u8T != null) {
            float f = 2;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) - ((int) (c1692150u8T.LIZJ >> 32))) / f;
            C1683260tu8.LIZ(interfaceC1675870tiD, c1692150u8T, 0L, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) - ((int) (c1692150u8T.LIZJ & 4294967295L))) / f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), 250);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        AbstractC1685970tyV abstractC1685970tyV = (AbstractC1685970tyV) obj;
        if (((Boolean) ((C05P0) aObjectS368S0100000_25.l0).getValue()).booleanValue()) {
            abstractC1685970tyV.LIZIZ = 0;
            abstractC1685970tyV.LIZ = 0;
        } else {
            abstractC1685970tyV.LIZ = ViewConfiguration.getScrollBarFadeDuration();
            abstractC1685970tyV.LIZIZ = ViewConfiguration.getScrollDefaultDelay();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        ((AbstractC1683310tuD) obj).LIZLLL((AbstractC1686530tzP) aObjectS368S0100000_25.l0, 0, 0, 0.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        ((InterfaceC1679550to9) obj).setAlpha(((Number) ((C05P1) aObjectS368S0100000_25.l0).getValue()).floatValue());
        return Unit.LIZ;
    }

    public static final Object invoke$19(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        return new C1676820tjk((((long) 0) << 32) | (((long) ((InterfaceC1690500u5o) obj).LJLLJ(((C1668650tWZ) ((C05P1) aObjectS368S0100000_25.l0).getValue()).LL)) & 4294967295L));
    }

    public static final Object invoke$2(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        ((a) aObjectS368S0100000_25.l0).LJIIJJI = (InterfaceC1644770su3) obj;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        ((C1673360teA) aObjectS368S0100000_25.l0).LIZ = ((C1692150u8T) obj).LIZIZ.LJFF;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        ((Function0) aObjectS368S0100000_25.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) aObjectS368S0100000_25.l0;
        ((Float) obj).floatValue();
        return Float.valueOf(interfaceC1690500u5o.LJJJJLL(C1672790tdF.LIZIZ));
    }

    public static final Object invoke$6(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        C1670570tZf c1670570tZf = (C1670570tZf) aObjectS368S0100000_25.l0;
        C1325700kbQ c1325700kbQ = (C1325700kbQ) obj;
        if (!C1680770tq7.LIZ(c1670570tZf.LIZ, 9205357640488583168L)) {
            c1325700kbQ.LIZJ = new C1324630kZh(C814420VxA.LIZIZ(Float.intBitsToFloat((int) (c1670570tZf.LIZ >> 32))), C814420VxA.LIZIZ(Float.intBitsToFloat((int) (c1670570tZf.LIZ & 4294967295L))));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        C1331070kk5 c1331070kk5 = (C1331070kk5) obj;
        if (((C1670570tZf) aObjectS368S0100000_25.l0).LIZIZ) {
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            c1331100kk8.LIZIZ = true;
            c1331070kk5.LJJIII(c1331100kk8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        Drawable drawable = (Drawable) aObjectS368S0100000_25.l0;
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L)));
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1669010tX9.LJLJI().LIZ();
        Canvas canvas = C1296530jqN.LIZ;
        drawable.draw(((C1696880uG6) interfaceC1686290tz1LIZ).LIZ);
        interfaceC1669010tX9.LLIIJLIL();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS368S0100000_25 aObjectS368S0100000_25, Object obj) {
        InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) aObjectS368S0100000_25.l0;
        ((Float) obj).floatValue();
        return Float.valueOf(interfaceC1690500u5o.LJJJJLL(C1672790tdF.LIZIZ));
    }
}
