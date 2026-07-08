package Y;

import X.C118300cf;
import X.C123100dR;
import X.C12WG;
import X.C13BV;
import X.C13LP;
import X.C1443960ngA;
import X.C1459900o5s;
import X.C15O7;
import X.C1629100sUm;
import X.C1629340sVA;
import X.C1637110shh;
import X.C1641640sp0;
import X.C1650560t3O;
import X.C1650630t3V;
import X.C1650710t3d;
import X.C1650750t3h;
import X.C1650780t3k;
import X.C1650800t3m;
import X.C1650810t3n;
import X.C1650820t3o;
import X.C1650830t3p;
import X.C1650900t3w;
import X.C1650960t42;
import X.C1650980t44;
import X.C1650990t45;
import X.C1651010t47;
import X.C1651030t49;
import X.C1659630tI1;
import X.C1954807lC;
import X.C19A3;
import X.C1DRG;
import X.C201955140j;
import X.C21356918hz;
import X.C2188811AlT;
import X.C280660AzI;
import X.C533930Kwp;
import X.C540180LGm;
import X.C577500Mku;
import X.EnumC1651770t5L;
import X.InterfaceC1441305kZ;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625000sOA;
import X.InterfaceC1625880sPa;
import X.InterfaceC1627350sRx;
import X.InterfaceC1648570t0B;
import X.InterfaceC1649530t1j;
import X.InterfaceC1650230t2r;
import X.InterfaceC1650670t3Z;
import X.InterfaceC1650770t3j;
import X.InterfaceC1651080t4E;
import X.InterfaceC1651180t4O;
import X.InterfaceC1651490t4t;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.sticker.ab.FixFirstCollectEffectPreloadConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.Intrinsics;
import pyl.q;
import pyl.s;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS82S0400000_25 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.13BV] */
    public static final void onChanged$0(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        ?? arrayList;
        InterfaceC1625000sOA interfaceC1625000sOAG2;
        Object objLJJJLL;
        Object objLJJJLZIJ;
        Object objLJJJLZIJ2;
        CategoryEffectModel categoryEffectModel = (CategoryEffectModel) ((C1641640sp0) obj).LIZ;
        if (categoryEffectModel != null) {
            InterfaceC1625880sPa interfaceC1625880sPa = (InterfaceC1625880sPa) aObjectS82S0400000_25.l0;
            C1637110shh c1637110shh = (C1637110shh) aObjectS82S0400000_25.l1;
            InterfaceC1624480sNK interfaceC1624480sNK = (InterfaceC1624480sNK) aObjectS82S0400000_25.l2;
            InterfaceC1627350sRx interfaceC1627350sRx = (InterfaceC1627350sRx) aObjectS82S0400000_25.l3;
            interfaceC1625880sPa.LJIJJLI("sticker_category:favorite", null, true, false).removeObserver(aObjectS82S0400000_25);
            if (FixFirstCollectEffectPreloadConfig.isEnabled()) {
                List<Effect> effects = categoryEffectModel.getEffects();
                if (effects.isEmpty()) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Effect effect = C1629100sUm.LIZ;
                    int iIndexOf = effects.indexOf(effect);
                    if (iIndexOf >= 0 && iIndexOf < effects.size() - 1 && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(iIndexOf + 1, effects)) != null && !Intrinsics.LJFF(objLJJJLZIJ2, effect) && !Intrinsics.LJFF(objLJJJLZIJ2, C1629100sUm.LIZIZ)) {
                        arrayList2.add(objLJJJLZIJ2);
                    }
                    Effect effect2 = C1629100sUm.LIZIZ;
                    int iIndexOf2 = effects.indexOf(effect2);
                    if (iIndexOf2 >= 0 && iIndexOf2 < effects.size() - 1 && (objLJJJLZIJ = C13LP.LJJJLZIJ(iIndexOf2 + 1, effects)) != null && !Intrinsics.LJFF(objLJJJLZIJ, effect2) && !Intrinsics.LJFF(objLJJJLZIJ, effect)) {
                        arrayList2.add(objLJJJLZIJ);
                    }
                    if (arrayList2.isEmpty() && (objLJJJLL = C13LP.LJJJLL(effects)) != null) {
                        arrayList2.add(objLJJJLL);
                    }
                    arrayList = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        Effect effect3 = (Effect) obj2;
                        if (effect3.getEffect_id().length() > 0 && C123100dR.LIZ(EffectKt.expectedMd5(effect3))) {
                            arrayList.add(obj2);
                        }
                    }
                }
            } else {
                arrayList = new ArrayList();
                Object objLJJJLL2 = C13LP.LJJJLL(categoryEffectModel.getEffects());
                if (objLJJJLL2 != null) {
                    arrayList.add(objLJJJLL2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                interfaceC1624480sNK.LJJLIIIIJ(new C1629340sVA((Effect) it2.next(), true, null, 4), null);
            }
            if (!((Boolean) C280660AzI.LIZ.getValue()).booleanValue() && (interfaceC1625000sOAG2 = c1637110shh.G2()) != null && interfaceC1625000sOAG2.U() != null) {
                C15O7.LIZJ(new ACallableS253S0200000_25(categoryEffectModel, ((StickerStatesStoreViewModel) C1659630tI1.LJIIIIZZ(c1637110shh.LLIZLLLIL, null, null, 6).get(StickerStatesStoreViewModel.class)).vQ2(interfaceC1627350sRx.LJI(), categoryEffectModel.getCategory_key(), null), 2));
            }
        }
    }

    public static final void onChanged$1(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        int i;
        C1650900t3w c1650900t3w = (C1650900t3w) obj;
        ShortVideoContext shortVideoContext = ((C1651010t47) aObjectS82S0400000_25.l0).LJ;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        if (d4.LJJIJIIJI(shortVideoContext)) {
            ((C118300cf) aObjectS82S0400000_25.l1).element = c1650900t3w.LIZ;
            ((C1DRG) aObjectS82S0400000_25.l2).LJII(InterfaceC1651080t4E.class, null);
            C1650980t44 c1650980t44LJIILL = ((C1650560t3O) aObjectS82S0400000_25.l3).LJIILL();
            C118300cf c118300cf = (C118300cf) aObjectS82S0400000_25.l1;
            int i2 = c118300cf.element;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 4) {
                        c1650980t44LJIILL.LLILLL = C577500Mku.LJII(i2);
                        c1650980t44LJIILL.LLILZ = R.attr.zs;
                        c1650980t44LJIILL.LLJ = false;
                    }
                } else {
                    C540180LGm.LIZ.getClass();
                    if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
                        i = R.raw.icon_color_right_bottom_checkbox;
                    } else {
                        i = R.raw.icon_color_right_bottom_none;
                    }
                    c1650980t44LJIILL.LLJI = i;
                    c1650980t44LJIILL.LLJ = true;
                    c1650980t44LJIILL.LLILZ = 0;
                    c1650980t44LJIILL.LLILLL = C577500Mku.LJII(c118300cf.element);
                }
            } else {
                c1650980t44LJIILL.LLJ = false;
                c1650980t44LJIILL.LLILZ = 0;
                c1650980t44LJIILL.LLILLL = C577500Mku.LJII(i2);
            }
            C1651010t47 c1651010t47 = (C1651010t47) aObjectS82S0400000_25.l0;
            C1DRG c1drg = (C1DRG) aObjectS82S0400000_25.l2;
            c1651010t47.getClass();
            C1651010t47.LIZLLL(c1drg, c1650980t44LJIILL, true);
        }
    }

    public static final void onChanged$10(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        long j;
        s sVar = (s) obj;
        int i = C1650710t3d.LIZ[((InterfaceC1650670t3Z) aObjectS82S0400000_25.l0).F8().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            j = 0;
        } else {
            j = 200;
        }
        AwS426S0200000_25 awS426S0200000_25 = new AwS426S0200000_25((C1650630t3V) aObjectS82S0400000_25.l2, sVar, 167);
        SafeHandler safeHandler = ((C1650750t3h) aObjectS82S0400000_25.l1).LJFF;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.postDelayed(new ARunnableS58S0300000_25(awS426S0200000_25, (C1DRG) aObjectS82S0400000_25.l3, (C1650630t3V) aObjectS82S0400000_25.l2, 13), j);
    }

    public static final void onChanged$11(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        q qVar = (q) obj;
        C1650750t3h c1650750t3h = (C1650750t3h) aObjectS82S0400000_25.l0;
        C1650780t3k c1650780t3k = c1650750t3h.LIZ;
        boolean z = qVar.LIZ;
        c1650780t3k.LIZ = z;
        InterfaceC1650230t2r interfaceC1650230t2r = c1650750t3h.LIZIZ;
        if (interfaceC1650230t2r == null) {
            interfaceC1650230t2r = null;
        }
        interfaceC1650230t2r.WE1(z, false);
        C1650980t44 c1650980t44 = (C1650980t44) ((C1650630t3V) aObjectS82S0400000_25.l1).LJIIIZ.getValue();
        c1650980t44.LLILLL = R.raw.icon_camera_flash_slash_fill;
        ((InterfaceC1650770t3j) ((C1DRG) aObjectS82S0400000_25.l2).LJII(InterfaceC1650770t3j.class, null)).m2(c1650980t44);
        C1650980t44 c1650980t442 = (C1650980t44) ((C1650630t3V) aObjectS82S0400000_25.l1).LIZIZ.getValue();
        c1650980t442.LLJILLL = qVar.LIZIZ;
        C12WG.LIZJ((C19A3) aObjectS82S0400000_25.l3, new ARunnableS94S0200000_25((C1DRG) aObjectS82S0400000_25.l2, c1650980t442, 29));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ((List) new AwS390S0200000_24(arrayList, (List<C1650980t44>) arrayList2, (List<C1650980t44>) 98).invoke(Boolean.valueOf(!((C1650750t3h) aObjectS82S0400000_25.l0).LIZ.LIZ))).add(((C1650630t3V) aObjectS82S0400000_25.l1).LJIIIZ.getValue());
        ((InterfaceC1650770t3j) ((C1DRG) aObjectS82S0400000_25.l2).LJII(InterfaceC1650770t3j.class, null)).LLLZ(arrayList);
        ((InterfaceC1650770t3j) ((C1DRG) aObjectS82S0400000_25.l2).LJII(InterfaceC1650770t3j.class, null)).Cl(arrayList2);
        ((InterfaceC1650770t3j) ((C1DRG) aObjectS82S0400000_25.l2).LJII(InterfaceC1650770t3j.class, null)).jc(C1650750t3h.LIZ());
    }

    public static final void onChanged$2(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        Integer num = (Integer) obj;
        C1650980t44 c1650980t44LJI = ((C1650560t3O) aObjectS82S0400000_25.l0).LJI();
        if (num != null) {
            if (num.intValue() == 1) {
                c1650980t44LJI.LLILLL = C577500Mku.LIZIZ();
                ((SafeHandler) aObjectS82S0400000_25.l1).post(new ARunnableS58S0300000_25((C1651010t47) aObjectS82S0400000_25.l3, (C1DRG) aObjectS82S0400000_25.l2, c1650980t44LJI, 3));
                return;
            } else if (num.intValue() == 2) {
                c1650980t44LJI.LLILLL = R.raw.icon_arrow_up_arrow_down_fill;
                c1650980t44LJI.LLILZ = R.attr.ee;
                ((SafeHandler) aObjectS82S0400000_25.l1).post(new ARunnableS58S0300000_25((C1651010t47) aObjectS82S0400000_25.l3, (C1DRG) aObjectS82S0400000_25.l2, c1650980t44LJI, 4));
                return;
            }
        }
        ((InterfaceC1651080t4E) ((C1DRG) aObjectS82S0400000_25.l2).LJII(InterfaceC1651080t4E.class, null)).XI0().LJFF(c1650980t44LJI, true);
    }

    public static final void onChanged$3(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        long j;
        s sVar = (s) obj;
        int i = C1650800t3m.LIZ[((InterfaceC1649530t1j) aObjectS82S0400000_25.l0).F8().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            j = 0;
        } else {
            j = 200;
        }
        AwS426S0200000_25 awS426S0200000_25 = new AwS426S0200000_25((C1650560t3O) aObjectS82S0400000_25.l1, sVar, 85);
        C1651010t47 c1651010t47 = (C1651010t47) aObjectS82S0400000_25.l2;
        C1DRG c1drg = (C1DRG) aObjectS82S0400000_25.l3;
        C1650560t3O c1650560t3O = (C1650560t3O) aObjectS82S0400000_25.l1;
        SafeHandler safeHandler = c1651010t47.LJI;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.postDelayed(new ARunnableS33S0400000_25(c1651010t47, c1650560t3O, c1drg, awS426S0200000_25, 0), j);
    }

    public static final void onChanged$4(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        long j;
        Boolean bool = (Boolean) obj;
        int i = C1650810t3n.LIZ[((InterfaceC1649530t1j) aObjectS82S0400000_25.l0).F8().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            j = 0;
        } else {
            j = 200;
        }
        AwS153S0400000_25 awS153S0400000_25 = new AwS153S0400000_25((C1650560t3O) aObjectS82S0400000_25.l1, (InterfaceC1649530t1j) aObjectS82S0400000_25.l0, (C1651010t47) aObjectS82S0400000_25.l2, bool, 4);
        C1651010t47 c1651010t47 = (C1651010t47) aObjectS82S0400000_25.l2;
        C1DRG c1drg = (C1DRG) aObjectS82S0400000_25.l3;
        C1650560t3O c1650560t3O = (C1650560t3O) aObjectS82S0400000_25.l1;
        SafeHandler safeHandler = c1651010t47.LJI;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.postDelayed(new ARunnableS33S0400000_25(c1651010t47, c1650560t3O, c1drg, awS153S0400000_25, 0), j);
    }

    public static final void onChanged$5(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && ((Boolean) pair.getSecond()).booleanValue()) {
            ((l0) aObjectS82S0400000_25.l0).getCameraApiComponent().Q30().LIZIZ(aObjectS82S0400000_25);
            ((l0) aObjectS82S0400000_25.l0).a9((List) aObjectS82S0400000_25.l1, (List) aObjectS82S0400000_25.l2, (C21356918hz) aObjectS82S0400000_25.l3);
        }
    }

    public static final void onChanged$6(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        q qVar = (q) obj;
        if (!C1443960ngA.LJIIL((ShortVideoContext) aObjectS82S0400000_25.l0)) {
            if (qVar.LIZ) {
                ((InterfaceC1650230t2r) aObjectS82S0400000_25.l1).QK(false);
                ((ShortVideoContext) aObjectS82S0400000_25.l0).isAIEnhanceOn = false;
            }
            C1650960t42 c1650960t42 = (C1650960t42) aObjectS82S0400000_25.l2;
            C1650990t45 c1650990t45 = c1650960t42.LIZ;
            c1650990t45.LIZIZ = qVar.LIZ;
            if (c1650960t42.LIZJ) {
                c1650990t45.LIZ = false;
            }
            ((InterfaceC1651490t4t) aObjectS82S0400000_25.l3).LIZ(new AwS391S0200000_25(c1650960t42, (InterfaceC1650230t2r) aObjectS82S0400000_25.l1, 210));
            C1459900o5s c1459900o5s = C1459900o5s.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ToolbarCreatorV2, updateFlash onFrontRearChange.isFrontCamera:");
            sbLIZ.append(((C1650960t42) aObjectS82S0400000_25.l2).LIZ.LIZIZ);
            sbLIZ.append(",torchSupport:");
            sbLIZ.append(((C1650960t42) aObjectS82S0400000_25.l2).LIZ.LIZJ);
            C201955140j.LIZJ(c1459900o5s, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void onChanged$7(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        long j;
        s sVar = (s) obj;
        int i = C1650820t3o.LIZ[((InterfaceC1649530t1j) aObjectS82S0400000_25.l0).F8().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            j = 0;
        } else {
            j = 200;
        }
        ((SafeHandler) aObjectS82S0400000_25.l1).postDelayed(new ARunnableS58S0300000_25((InterfaceC1651490t4t) aObjectS82S0400000_25.l2, sVar, (C1650960t42) aObjectS82S0400000_25.l3, 10), j);
    }

    public static final void onChanged$8(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        long j;
        Boolean bool = (Boolean) obj;
        int i = C1650830t3p.LIZ[((InterfaceC1649530t1j) aObjectS82S0400000_25.l0).F8().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            j = 0;
        } else {
            j = 200;
        }
        SafeHandler safeHandler = (SafeHandler) aObjectS82S0400000_25.l1;
        InterfaceC1651490t4t interfaceC1651490t4t = (InterfaceC1651490t4t) aObjectS82S0400000_25.l2;
        safeHandler.postDelayed(new ARunnableS33S0400000_25((InterfaceC1650230t2r) aObjectS82S0400000_25.l3, bool, (InterfaceC1649530t1j) aObjectS82S0400000_25.l0, interfaceC1651490t4t, 2), j);
    }

    public static final void onChanged$9(AObjectS82S0400000_25 aObjectS82S0400000_25, Object obj) {
        Boolean bool = (Boolean) obj;
        ((C1650960t42) aObjectS82S0400000_25.l0).LIZIZ = !bool.booleanValue();
        if (bool.booleanValue()) {
            C1651030t49.LIZIZ((InterfaceC1651490t4t) aObjectS82S0400000_25.l1, EnumC1651770t5L.DUET_LAYOUT, false);
        } else {
            ((InterfaceC1651180t4O) aObjectS82S0400000_25.l2).Kd1().LIZ((LifecycleOwner) aObjectS82S0400000_25.l3, new AObjectS306S0200000_25(aObjectS82S0400000_25.l2, aObjectS82S0400000_25.l1, (InterfaceC1648570t0B) 27));
        }
    }

    public AObjectS82S0400000_25(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
