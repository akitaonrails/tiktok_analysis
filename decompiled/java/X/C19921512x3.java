package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12x3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19921512x3 {
    public static final C19928412yA LIZ = new AbstractC19929512yL<C19926412xq>() { // from class: X.12yA
        @Override // X.AbstractC19929512yL
        public final int LIZ(Map.Entry<?, ?> entry) {
            return ((C19926412xq) entry.getKey()).LLILLJJLI;
        }

        @Override // X.AbstractC19929512yL
        public final C19928612yC<C19926412xq> LIZJ(Object obj) {
            return ((AbstractC19925012xc) obj).LL;
        }

        @Override // X.AbstractC19929512yL
        public final C19928612yC<C19926412xq> LIZLLL(Object obj) {
            AbstractC19925012xc abstractC19925012xc = (AbstractC19925012xc) obj;
            C19928612yC<C19926412xq> c19928612yC = abstractC19925012xc.LL;
            if (c19928612yC.LIZIZ) {
                abstractC19925012xc.LL = c19928612yC.clone();
            }
            return abstractC19925012xc.LL;
        }

        @Override // X.AbstractC19929512yL
        public final boolean LJ(InterfaceC19925612xi interfaceC19925612xi) {
            return interfaceC19925612xi instanceof AbstractC19925012xc;
        }

        @Override // X.AbstractC19929512yL
        public final void LJFF(Object obj) {
            ((AbstractC19925012xc) obj).LL.LJIJJ();
        }

        @Override // X.AbstractC19929512yL
        public final void LJIIIZ(InterfaceC19361110or interfaceC19361110or, Map.Entry<?, ?> entry) {
            C19926412xq c19926412xq = (C19926412xq) entry.getKey();
            if (c19926412xq.LLILZ) {
                switch (AnonymousClass1337.LIZ[c19926412xq.LLILLL.ordinal()]) {
                    case 1:
                        C19928512yB.LJIILLIIL(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 2:
                        C19928512yB.LJIJJ(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 3:
                        C19928512yB.LJJ(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 4:
                        C19928512yB.LJJIIZI(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 5:
                        C19928512yB.LJIL(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 6:
                        C19928512yB.LJIJI(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 7:
                        C19928512yB.LJIJ(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 8:
                        C19928512yB.LJIILJJIL(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        C19928512yB.LJJIIZ(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        C19928512yB.LJJIFFI(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        C19928512yB.LJJII(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        C19928512yB.LJJIII(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        C19928512yB.LJJIIJ(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 14:
                        C19928512yB.LJIL(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, c19926412xq.LLILZIL);
                        break;
                    case 15:
                        C19928512yB.LJIILL(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or);
                        break;
                    case 16:
                        C19928512yB.LJJIIJZLJL(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        List list = (List) entry.getValue();
                        if (list != null && !list.isEmpty()) {
                            C19928512yB.LJIJJLI(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, C19921412x2.LIZJ.LIZ(ListProtector.get(list, 0).getClass()));
                            break;
                        }
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        List list2 = (List) entry.getValue();
                        if (list2 != null && !list2.isEmpty()) {
                            C19928512yB.LJJI(c19926412xq.LLILLJJLI, (List) entry.getValue(), interfaceC19361110or, C19921412x2.LIZJ.LIZ(ListProtector.get(list2, 0).getClass()));
                            break;
                        }
                        break;
                }
            }
            switch (AnonymousClass1337.LIZ[c19926412xq.LLILLL.ordinal()]) {
                case 1:
                    C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
                    c19929012yG.LIZJ(((Double) entry.getValue()).doubleValue(), c19926412xq.LLILLJJLI);
                    break;
                case 2:
                    C19929012yG c19929012yG2 = (C19929012yG) interfaceC19361110or;
                    c19929012yG2.LJIIIIZZ(((Float) entry.getValue()).floatValue(), c19926412xq.LLILLJJLI);
                    break;
                case 3:
                    ((C19929012yG) interfaceC19361110or).LJIIJJI(c19926412xq.LLILLJJLI, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    ((C19929012yG) interfaceC19361110or).LJIJJLI(c19926412xq.LLILLJJLI, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    ((C19929012yG) interfaceC19361110or).LJIIJ(c19926412xq.LLILLJJLI, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    ((C19929012yG) interfaceC19361110or).LJI(c19926412xq.LLILLJJLI, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    ((C19929012yG) interfaceC19361110or).LJ(c19926412xq.LLILLJJLI, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    ((C19929012yG) interfaceC19361110or).LIZ(c19926412xq.LLILLJJLI, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    ((C19929012yG) interfaceC19361110or).LJIJJ(c19926412xq.LLILLJJLI, ((Integer) entry.getValue()).intValue());
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    ((C19929012yG) interfaceC19361110or).LJIILL(c19926412xq.LLILLJJLI, ((Integer) entry.getValue()).intValue());
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    ((C19929012yG) interfaceC19361110or).LJIILLIIL(c19926412xq.LLILLJJLI, ((Long) entry.getValue()).longValue());
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    ((C19929012yG) interfaceC19361110or).LJIIZILJ(c19926412xq.LLILLJJLI, ((Integer) entry.getValue()).intValue());
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    ((C19929012yG) interfaceC19361110or).LJIJ(c19926412xq.LLILLJJLI, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    ((C19929012yG) interfaceC19361110or).LJIIJ(c19926412xq.LLILLJJLI, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    ((C19929012yG) interfaceC19361110or).LIZIZ(c19926412xq.LLILLJJLI, (AbstractC19922812xG) entry.getValue());
                    break;
                case 16:
                    ((C19929012yG) interfaceC19361110or).LIZ.LJJIJ(c19926412xq.LLILLJJLI, (String) entry.getValue());
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    C19929012yG c19929012yG3 = (C19929012yG) interfaceC19361110or;
                    c19929012yG3.LJIIIZ(c19926412xq.LLILLJJLI, C19921412x2.LIZJ.LIZ(entry.getValue().getClass()), entry.getValue());
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    C19929012yG c19929012yG4 = (C19929012yG) interfaceC19361110or;
                    c19929012yG4.LJIILIIL(c19926412xq.LLILLJJLI, C19921412x2.LIZJ.LIZ(entry.getValue().getClass()), entry.getValue());
                    break;
            }
        }

        @Override // X.AbstractC19929512yL
        public final Object LIZIZ(C19926312xp c19926312xp, InterfaceC19925612xi interfaceC19925612xi, int i) {
            return c19926312xp.LIZ.get(new C19930712yX(i, interfaceC19925612xi));
        }

        @Override // X.AbstractC19929512yL
        public final void LJII(InterfaceC19929112yH interfaceC19929112yH, Object obj, C19926312xp c19926312xp, C19928612yC<C19926412xq> c19928612yC) {
            C19925512xh c19925512xh = (C19925512xh) obj;
            c19928612yC.LJIL(c19925512xh.LIZLLL, interfaceC19929112yH.LJIIJ(c19925512xh.LIZJ.getClass(), c19926312xp));
        }

        @Override // X.AbstractC19929512yL
        public final void LJIIIIZZ(AbstractC19922812xG abstractC19922812xG, Object obj, C19926312xp c19926312xp, C19928612yC<C19926412xq> c19928612yC) {
            C19925512xh c19925512xh = (C19925512xh) obj;
            InterfaceC19928112y7 interfaceC19928112y7NewBuilderForType = c19925512xh.LIZJ.newBuilderForType();
            AbstractC19927312xz abstractC19927312xzNewCodedInput = abstractC19922812xG.newCodedInput();
            interfaceC19928112y7NewBuilderForType.mergeFrom(abstractC19927312xzNewCodedInput, c19926312xp);
            c19928612yC.LJIL(c19925512xh.LIZLLL, interfaceC19928112y7NewBuilderForType.buildPartial());
            abstractC19927312xzNewCodedInput.LIZ(0);
        }

        @Override // X.AbstractC19929512yL
        public final <UT, UB> UB LJI(Object obj, InterfaceC19929112yH interfaceC19929112yH, Object obj2, C19926312xp c19926312xp, C19928612yC<C19926412xq> c19928612yC, UB ub, AbstractC19929412yK<UT, UB> abstractC19929412yK) {
            Object objLJIIJ;
            Object objLJIIIIZZ;
            ArrayList arrayList;
            UB ub2 = ub;
            C19925512xh c19925512xh = (C19925512xh) obj2;
            C19926412xq c19926412xq = c19925512xh.LIZLLL;
            int i = c19926412xq.LLILLJJLI;
            if (c19926412xq.LLILZ && c19926412xq.LLILZIL) {
                switch (AnonymousClass1337.LIZ[c19926412xq.LLILLL.ordinal()]) {
                    case 1:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJJIJLIJ(arrayList);
                        break;
                    case 2:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJIJI(arrayList);
                        break;
                    case 3:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJJI(arrayList);
                        break;
                    case 4:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJJIIZ(arrayList);
                        break;
                    case 5:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LIZLLL(arrayList);
                        break;
                    case 6:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJJIJIIJI(arrayList);
                        break;
                    case 7:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJJIJIL(arrayList);
                        break;
                    case 8:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJJIIJ(arrayList);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJJJ(arrayList);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJIL(arrayList);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LIZJ(arrayList);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LIZIZ(arrayList);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJIILIIL(arrayList);
                        break;
                    case 14:
                        arrayList = new ArrayList();
                        interfaceC19929112yH.LJJIZ(arrayList);
                        ub2 = (UB) C19928512yB.LJIIIZ(obj, i, arrayList, c19925512xh.LIZLLL.LL, ub2, abstractC19929412yK);
                        break;
                    default:
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Type cannot be packed: ");
                        sbLIZ.append(c19925512xh.LIZLLL.LLILLL);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                c19928612yC.LJIL(c19925512xh.LIZLLL, arrayList);
                return ub2;
            }
            AnonymousClass1334 anonymousClass1334 = c19926412xq.LLILLL;
            if (anonymousClass1334 == AnonymousClass1334.ENUM) {
                int iLJJIJ = interfaceC19929112yH.LJJIJ();
                if (c19925512xh.LIZLLL.LL.LIZJ(iLJJIJ) == null) {
                    return (UB) C19928512yB.LJIILIIL(obj, i, iLJJIJ, ub2, abstractC19929412yK);
                }
                objLJIIJ = Integer.valueOf(iLJJIJ);
            } else {
                switch (AnonymousClass1337.LIZ[anonymousClass1334.ordinal()]) {
                    case 1:
                        objLJIIJ = Double.valueOf(interfaceC19929112yH.readDouble());
                        break;
                    case 2:
                        objLJIIJ = Float.valueOf(interfaceC19929112yH.readFloat());
                        break;
                    case 3:
                        objLJIIJ = Long.valueOf(interfaceC19929112yH.LJII());
                        break;
                    case 4:
                        objLJIIJ = Long.valueOf(interfaceC19929112yH.LJIILLIIL());
                        break;
                    case 5:
                        objLJIIJ = Integer.valueOf(interfaceC19929112yH.LJJIJ());
                        break;
                    case 6:
                        objLJIIJ = Long.valueOf(interfaceC19929112yH.LJIJJLI());
                        break;
                    case 7:
                        objLJIIJ = Integer.valueOf(interfaceC19929112yH.LJIIJJI());
                        break;
                    case 8:
                        objLJIIJ = Boolean.valueOf(interfaceC19929112yH.LJIIIIZZ());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        objLJIIJ = Integer.valueOf(interfaceC19929112yH.LIZ());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        objLJIIJ = Integer.valueOf(interfaceC19929112yH.LJJIFFI());
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        objLJIIJ = Long.valueOf(interfaceC19929112yH.LJJIJIIJIL());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        objLJIIJ = Integer.valueOf(interfaceC19929112yH.LJIILJJIL());
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        objLJIIJ = Long.valueOf(interfaceC19929112yH.LJJJI());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objLJIIJ = interfaceC19929112yH.LJIILL();
                        break;
                    case 16:
                        objLJIIJ = interfaceC19929112yH.LJIIL();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        C19926412xq c19926412xq2 = c19925512xh.LIZLLL;
                        if (!c19926412xq2.LLILZ) {
                            Object objLJIIIIZZ2 = c19928612yC.LJIIIIZZ(c19926412xq2);
                            if (objLJIIIIZZ2 instanceof AbstractC19924712xZ) {
                                InterfaceC19924912xb interfaceC19924912xbLIZIZ = C19921412x2.LIZJ.LIZIZ(objLJIIIIZZ2);
                                if (!((AbstractC19924712xZ) objLJIIIIZZ2).isMutable()) {
                                    Object objNewInstance = interfaceC19924912xbLIZIZ.newInstance();
                                    interfaceC19924912xbLIZIZ.LIZ(objNewInstance, objLJIIIIZZ2);
                                    c19928612yC.LJIL(c19925512xh.LIZLLL, objNewInstance);
                                    objLJIIIIZZ2 = objNewInstance;
                                }
                                interfaceC19929112yH.LJIIZILJ(objLJIIIIZZ2, interfaceC19924912xbLIZIZ, c19926312xp);
                                return ub2;
                            }
                        }
                        objLJIIJ = interfaceC19929112yH.LJJIIZI(c19925512xh.LIZJ.getClass(), c19926312xp);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        C19926412xq c19926412xq3 = c19925512xh.LIZLLL;
                        if (!c19926412xq3.LLILZ) {
                            Object objLJIIIIZZ3 = c19928612yC.LJIIIIZZ(c19926412xq3);
                            if (objLJIIIIZZ3 instanceof AbstractC19924712xZ) {
                                InterfaceC19924912xb interfaceC19924912xbLIZIZ2 = C19921412x2.LIZJ.LIZIZ(objLJIIIIZZ3);
                                if (!((AbstractC19924712xZ) objLJIIIIZZ3).isMutable()) {
                                    Object objNewInstance2 = interfaceC19924912xbLIZIZ2.newInstance();
                                    interfaceC19924912xbLIZIZ2.LIZ(objNewInstance2, objLJIIIIZZ3);
                                    c19928612yC.LJIL(c19925512xh.LIZLLL, objNewInstance2);
                                    objLJIIIIZZ3 = objNewInstance2;
                                }
                                interfaceC19929112yH.LJ(objLJIIIIZZ3, interfaceC19924912xbLIZIZ2, c19926312xp);
                                return ub2;
                            }
                        }
                        objLJIIJ = interfaceC19929112yH.LJIIJ(c19925512xh.LIZJ.getClass(), c19926312xp);
                        break;
                    default:
                        objLJIIJ = null;
                        break;
                }
            }
            C19926412xq c19926412xq4 = c19925512xh.LIZLLL;
            if (c19926412xq4.LLILZ) {
                c19928612yC.LIZ(c19926412xq4, objLJIIJ);
                return ub2;
            }
            int i2 = AnonymousClass1337.LIZ[c19926412xq4.LLILLL.ordinal()];
            if ((i2 == 17 || i2 == 18) && (objLJIIIIZZ = c19928612yC.LJIIIIZZ(c19925512xh.LIZLLL)) != null) {
                InterfaceC19928112y7 builder = ((InterfaceC19925612xi) objLJIIIIZZ).toBuilder();
                builder.mergeFrom((InterfaceC19925612xi) objLJIIJ);
                objLJIIJ = builder.buildPartial();
            }
            c19928612yC.LJIL(c19925512xh.LIZLLL, objLJIIJ);
            return ub2;
        }
    };
    public static final AbstractC19929512yL<?> LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12yA] */
    static {
        AbstractC19929512yL<?> abstractC19929512yL;
        Class<?> cls = C19915512w5.LIZ;
        try {
            abstractC19929512yL = (AbstractC19929512yL) Class.forName("com.google.protobuf.c0").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            abstractC19929512yL = null;
        }
        LIZIZ = abstractC19929512yL;
    }
}
