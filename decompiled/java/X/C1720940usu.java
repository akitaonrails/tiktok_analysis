package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.pipo.stellar.base.adapter.internal.GuideDO;
import com.bytedance.pipo.stellar.base.card.MynaViewData;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.ButtonDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.CarouselBannerDO;
import com.bytedance.pipo.stellar.base.model.CarouselDO;
import com.bytedance.pipo.stellar.base.model.CarouselV2DO;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import com.bytedance.pipo.stellar.base.model.ErrorStatusDO;
import com.bytedance.pipo.stellar.base.model.HorizonLeftRightDO;
import com.bytedance.pipo.stellar.base.model.IconTextCardDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.LottieDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.NavBarDO;
import com.bytedance.pipo.stellar.base.model.StellarEmptyDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS333S0300000_26;

/* JADX INFO: renamed from: X.0usu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720940usu {
    public static final Map<String, WeakReference<C1721420utg>> LIZ;
    public static final ThreadLocal<Integer> LIZIZ;
    public static final Map<String, C1555670qaL> LIZJ;

    static {
        new LinkedHashMap();
        LIZ = new LinkedHashMap();
        LIZIZ = new ThreadLocal<>();
        String str = null;
        int i = 12;
        int i2 = 4;
        String str2 = "pipo_card_show";
        LIZJ = C2097608Jq.LJIIIIZZ(new Pair(EnumC1720960usw.CONTAINER_LINE.getValue(), new C1555670qaL(ContainerCardDO.class, AFwS215S0000000_26.get$arr$(398), str, i)), new Pair(EnumC1720960usw.CONTAINER_GRID.getValue(), new C1555670qaL(ContainerCardDO.class, AFwS215S0000000_26.get$arr$(399), str, i)), new Pair(EnumC1720960usw.CONTAINER_LIST.getValue(), new C1555670qaL(ContainerCardDO.class, AFwS215S0000000_26.get$arr$(400), str, i)), new Pair(EnumC1720960usw.CONTAINER_STACK.getValue(), new C1555670qaL(ContainerCardDO.class, AFwS215S0000000_26.get$arr$(401), str, i)), new Pair(EnumC1720960usw.CARD_CAROUSEL.getValue(), new C1555670qaL(CarouselDO.class, AFwS215S0000000_26.get$arr$(402), str, i)), new Pair(EnumC1720960usw.CARD_CAROUSEL_V2.getValue(), new C1555670qaL(CarouselV2DO.class, AFwS215S0000000_26.get$arr$(403), str, i)), new Pair(EnumC1720960usw.CARD_NAV.getValue(), new C1555670qaL(NavBarDO.class, AFwS215S0000000_26.get$arr$(404), str, i)), new Pair(EnumC1720960usw.CARD_TYPE_TEXT.getValue(), new C1555670qaL(TextDO.class, AFwS215S0000000_26.get$arr$(405), str, i)), new Pair(EnumC1720960usw.CARD_IMAGE.getValue(), new C1555670qaL(ImageDO.class, AFwS215S0000000_26.get$arr$(406), str, i)), new Pair(EnumC1720960usw.CARD_LOTTIE.getValue(), new C1555670qaL(LottieDO.class, AFwS215S0000000_26.get$arr$(388), str, i)), new Pair(EnumC1720960usw.CARD_GUIDE.getValue(), new C1555670qaL(GuideDO.class, AFwS215S0000000_26.get$arr$(389), str, i)), new Pair(EnumC1720960usw.CARD_EMPTY.getValue(), new C1555670qaL(StellarEmptyDO.class, AFwS215S0000000_26.get$arr$(390), str, i)), new Pair(EnumC1720960usw.CONTAINER_COLUMN.getValue(), new C1555670qaL(ContainerCardDO.class, AFwS215S0000000_26.get$arr$(391), str2, i2)), new Pair(EnumC1720960usw.CAROUSEL_CARD_BANNER.getValue(), new C1555670qaL(CarouselBannerDO.class, AFwS215S0000000_26.get$arr$(392), str, i)), new Pair(EnumC1720960usw.CARD_HORIZON_LEFT_RIGHT.getValue(), new C1555670qaL((Class<?>) HorizonLeftRightDO.class, (Function0<? extends AbstractC1720840usk<?>>) AFwS215S0000000_26.get$arr$(393), true, "pipo_card_show")), new Pair(EnumC1720960usw.CARD_BUTTON.getValue(), new C1555670qaL(ButtonDO.class, AFwS215S0000000_26.get$arr$(394), "pipo_button_show", i2)), new Pair(EnumC1720960usw.CARD_MYNA.getValue(), new C1555670qaL(MynaViewData.class, AFwS215S0000000_26.get$arr$(395), str2, i2)), new Pair(EnumC1720960usw.CARD_TYPE_ICON_WITH_TEXT.getValue(), new C1555670qaL(IconTextCardDO.class, AFwS215S0000000_26.get$arr$(396), str2, i2)), new Pair(EnumC1720960usw.CARD_ERROR.getValue(), new C1555670qaL(ErrorStatusDO.class, AFwS215S0000000_26.get$arr$(397), str, i)));
    }

    public static AbstractC1720840usk LIZ(Context context, C1720760usc c1720760usc, CardDO cardDO, Fragment fragment) {
        AbstractC1720840usk abstractC1720840uskLIZIZ;
        Object c098200Yq;
        View view;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Integer numValueOf7;
        Integer numLJIIJJI5;
        Integer numLJIIJJI6;
        Integer numLJIIJJI7;
        Integer numLJIIJJI8;
        C1555670qaL c1555670qaL;
        Integer numValueOf8 = null;
        try {
            if (Intrinsics.LJFF(cardDO.getCardShow(), "1") && (c1555670qaL = LIZJ.get(cardDO.getType())) != null) {
                abstractC1720840uskLIZIZ = LIZIZ(context, c1720760usc, cardDO, fragment, c1555670qaL);
            } else {
                abstractC1720840uskLIZIZ = null;
            }
            try {
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th2) {
            th = th2;
            abstractC1720840uskLIZIZ = null;
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (abstractC1720840uskLIZIZ != null && (view = abstractC1720840uskLIZIZ.LLILLJJLI) != null) {
            if (view.getLayoutParams() == null) {
                C1721300utU c1721300utU = C1721300utU.LIZ;
                String width = cardDO.getWidth();
                c1721300utU.getClass();
                C786410Ut5.W5(view, new ViewGroup.MarginLayoutParams(C1721300utU.LJJIII(context, width), C1721300utU.LJIILLIIL(context, cardDO.getHeight())));
            }
            MarginDO cardPadding = cardDO.getCardPadding();
            if (cardPadding != null) {
                String str = cardPadding.start;
                if (str != null && (numLJIIJJI8 = C2095008Iq.LJIIJJI(str)) != null) {
                    numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI8)));
                } else {
                    numValueOf4 = null;
                }
                String str2 = cardPadding.top;
                if (str2 != null && (numLJIIJJI7 = C2095008Iq.LJIIJJI(str2)) != null) {
                    numValueOf5 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI7)));
                } else {
                    numValueOf5 = null;
                }
                String str3 = cardPadding.end;
                if (str3 != null && (numLJIIJJI6 = C2095008Iq.LJIIJJI(str3)) != null) {
                    numValueOf6 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI6)));
                } else {
                    numValueOf6 = null;
                }
                String str4 = cardPadding.bottom;
                if (str4 != null && (numLJIIJJI5 = C2095008Iq.LJIIJJI(str4)) != null) {
                    numValueOf7 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI5)));
                } else {
                    numValueOf7 = null;
                }
                C426750GoL.LJIIL(view, numValueOf4, numValueOf5, numValueOf6, numValueOf7, 16);
            }
            String theme = cardDO.getTheme();
            if (theme != null) {
                Intrinsics.LJFF(theme, "force_light");
            }
            MarginDO margin = cardDO.getMargin();
            if (margin != null) {
                String str5 = margin.start;
                if (str5 != null && (numLJIIJJI4 = C2095008Iq.LJIIJJI(str5)) != null) {
                    numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI4)));
                } else {
                    numValueOf = null;
                }
                String str6 = margin.top;
                if (str6 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str6)) != null) {
                    numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI3)));
                } else {
                    numValueOf2 = null;
                }
                String str7 = margin.end;
                if (str7 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str7)) != null) {
                    numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI2)));
                } else {
                    numValueOf3 = null;
                }
                String str8 = margin.bottom;
                if (str8 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str8)) != null) {
                    numValueOf8 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJIIJJI)));
                }
                C426750GoL.LJIIIZ(view, numValueOf, numValueOf2, numValueOf3, numValueOf8, false, 16);
            }
            BackgroundDO background = cardDO.getBackground();
            if (background != null) {
                C1721300utU.LIZ.getClass();
                C1721300utU.LIZ(view, background, null);
            }
            if (!view.hasOnClickListeners()) {
                C786410Ut5.I7(new AbS333S0300000_26(cardDO, view, c1720760usc, 0), view);
            }
        }
        return abstractC1720840uskLIZIZ;
    }

    public static AbstractC1720840usk LIZIZ(Context context, C1720760usc c1720760usc, CardDO cardDO, Fragment fragment, C1555670qaL c1555670qaL) {
        Class<?> cls = c1555670qaL.LIZ;
        if (!(cls instanceof Class) || cls == null) {
            return null;
        }
        Function0<AbstractC1720840usk<?>> function0 = c1555670qaL.LIZIZ;
        if (!C19719512Dh.LJFF(0, function0) || function0 == null) {
            return null;
        }
        String theme = cardDO.getTheme();
        C1720950usv c1720950usv = new C1720950usv(cardDO, c1555670qaL, c1720760usc, fragment);
        C1227904rF c1227904rF = C1227904rF.LIZ;
        String cardData = cardDO.getCardData();
        c1227904rF.getClass();
        Object objLIZIZ = C1227904rF.LIZIZ(cardData, cls);
        AbstractC1720840usk<?> abstractC1720840uskInvoke = function0.invoke();
        abstractC1720840uskInvoke.LL = c1720760usc;
        if (theme != null) {
            EnumC1720670usT.Companion.getClass();
            abstractC1720840uskInvoke.LJFF(C786410Ut5.Td(C786410Ut5.ne(C1720680usU.LIZIZ(context, theme)), abstractC1720840uskInvoke.LJ(), null, false), objLIZIZ, C1720680usU.LIZ(theme));
        } else {
            abstractC1720840uskInvoke.LJFF(C786410Ut5.Sd(abstractC1720840uskInvoke.LJ(), C786410Ut5.ne(context), null), objLIZIZ, null);
        }
        c1720950usv.invoke(objLIZIZ, abstractC1720840uskInvoke);
        return abstractC1720840uskInvoke;
    }
}
