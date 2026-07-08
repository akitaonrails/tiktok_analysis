package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12vA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19909812vA {
    public static final C19909812vA LIZLLL = new C19909812vA(0);
    public final C19910712vJ LIZ = new C19910112vD() { // from class: X.12vJ
        @Override // X.C19910112vD
        public final void LIZ() {
            if (!this.LLILZ) {
                for (int i = 0; i < this.LLILLJJLI; i++) {
                    C19910812vK c19910812vKLIZLLL = LIZLLL(i);
                    if (((InterfaceC19911512vR) c19910812vKLIZLLL.LL).LJ()) {
                        c19910812vKLIZLLL.setValue(Collections.unmodifiableList((List) c19910812vKLIZLLL.LLILLJJLI));
                    }
                }
                for (Map.Entry entry : LIZIZ()) {
                    if (((InterfaceC19911512vR) entry.getKey()).LJ()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.LIZ();
        }
    };
    public boolean LIZIZ;
    public boolean LIZJ;

    public final Iterator LIZLLL() {
        C19910712vJ c19910712vJ = this.LIZ;
        if (c19910712vJ.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (!this.LIZJ) {
            return ((C19911012vM) c19910712vJ.entrySet()).iterator();
        }
        final Iterator it2 = ((C19911012vM) c19910712vJ.entrySet()).iterator();
        return new Iterator(it2) { // from class: X.12vP
            public final Iterator LL;

            {
                this.LL = it2;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL.hasNext();
            }

            @Override // java.util.Iterator
            public final /* bridge */ /* synthetic */ Object next() {
                Map.Entry entry = (Map.Entry) this.LL.next();
                return entry.getValue() instanceof C19912912vf ? new C19911212vO(entry) : entry;
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.LL.remove();
            }
        };
    }

    public final void LJ() {
        if (this.LIZIZ) {
            return;
        }
        C19910712vJ c19910712vJ = this.LIZ;
        int i = c19910712vJ.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c19910712vJ.LIZLLL(i2).LLILLJJLI;
            if (obj instanceof AbstractC19907912ur) {
                ((AbstractC19907912ur) obj).LJ();
            }
        }
        Iterator it2 = c19910712vJ.LIZIZ().iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            if (value instanceof AbstractC19907912ur) {
                ((AbstractC19907912ur) value).LJ();
            }
        }
        c19910712vJ.LIZ();
        this.LIZIZ = true;
    }

    public final boolean LJII() {
        C19910712vJ c19910712vJ = this.LIZ;
        int i = c19910712vJ.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            if (!LJIIIIZZ(c19910712vJ.LIZLLL(i2))) {
                return false;
            }
        }
        Iterator it2 = c19910712vJ.LIZIZ().iterator();
        while (it2.hasNext()) {
            if (!LJIIIIZZ((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        C19909812vA c19909812vA = new C19909812vA();
        C19910712vJ c19910712vJ = this.LIZ;
        int i = c19910712vJ.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            C19910812vK c19910812vKLIZLLL = c19910712vJ.LIZLLL(i2);
            c19909812vA.LJFF((InterfaceC19911512vR) c19910812vKLIZLLL.LL, c19910812vKLIZLLL.LLILLJJLI);
        }
        for (Map.Entry entry : c19910712vJ.LIZIZ()) {
            c19909812vA.LJFF((InterfaceC19911512vR) entry.getKey(), entry.getValue());
        }
        c19909812vA.LIZJ = this.LIZJ;
        return c19909812vA;
    }

    public final int hashCode() {
        return hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12vJ] */
    public C19909812vA() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12vJ] */
    public C19909812vA(int i) {
        LJ();
        LJ();
    }

    public static boolean LJIIIIZZ(Map.Entry entry) {
        InterfaceC19911512vR interfaceC19911512vR = (InterfaceC19911512vR) entry.getKey();
        if (interfaceC19911512vR.LIZIZ() == EnumC19938112zj.MESSAGE) {
            if (interfaceC19911512vR.LJ()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = ListProtector.get(list, i);
                    if (obj instanceof InterfaceC19900612tg) {
                        if (!((InterfaceC19900612tg) obj).LJIILLIIL()) {
                            return false;
                        }
                    } else if (!(obj instanceof C19912912vf)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC19900612tg) {
                    return ((InterfaceC19900612tg) value).LJIILLIIL();
                }
                if (value instanceof C19912912vf) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public static final int LJIIIZ(Map.Entry entry) {
        int i;
        int iLJJ;
        int iLJJ2;
        int iLJIILL;
        int iLJJ3;
        InterfaceC19911512vR interfaceC19911512vR = (InterfaceC19911512vR) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC19911512vR.LIZIZ() == EnumC19938112zj.MESSAGE && !interfaceC19911512vR.LJ() && !interfaceC19911512vR.LIZLLL()) {
            if (value instanceof C19912912vf) {
                int iZza = ((InterfaceC19911512vR) entry.getKey()).zza();
                int iLJJ4 = AbstractC19910412vG.LJJ(8);
                i = iLJJ4 + iLJJ4;
                iLJJ = AbstractC19910412vG.LJJ(16) + AbstractC19910412vG.LJJ(iZza);
                iLJJ2 = AbstractC19910412vG.LJJ(24);
                iLJIILL = ((C19911112vN) value).LIZ();
                iLJJ3 = AbstractC19910412vG.LJJ(iLJIILL);
            } else {
                int iZza2 = ((InterfaceC19911512vR) entry.getKey()).zza();
                int iLJJ5 = AbstractC19910412vG.LJJ(8);
                i = iLJJ5 + iLJJ5;
                iLJJ = AbstractC19910412vG.LJJ(16) + AbstractC19910412vG.LJJ(iZza2);
                iLJJ2 = AbstractC19910412vG.LJJ(24);
                iLJIILL = ((InterfaceC19911612vS) value).LJIILL();
                iLJJ3 = AbstractC19910412vG.LJJ(iLJIILL);
            }
            return i + iLJJ + iLJJ2 + iLJJ3 + iLJIILL;
        }
        return LIZJ(interfaceC19911512vR, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19909812vA)) {
            return false;
        }
        return equals(((C19909812vA) obj).LIZ);
    }

    public static int LIZIZ(EnumC19938012zi enumC19938012zi, Object obj) throws Exception {
        int length;
        int iLJJ;
        EnumC19938012zi enumC19938012zi2 = EnumC19938012zi.zza;
        EnumC19938112zj enumC19938112zj = EnumC19938112zj.INT;
        switch (enumC19938012zi.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                boolean z = AbstractC19910412vG.LIZIZ;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                boolean z2 = AbstractC19910412vG.LIZIZ;
                return 4;
            case 2:
                return AbstractC19910412vG.LJJI(((Long) obj).longValue());
            case 3:
                return AbstractC19910412vG.LJJI(((Long) obj).longValue());
            case 4:
                return AbstractC19910412vG.LJJI(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                boolean z3 = AbstractC19910412vG.LIZIZ;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                boolean z4 = AbstractC19910412vG.LIZIZ;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                boolean z5 = AbstractC19910412vG.LIZIZ;
                return 1;
            case 8:
                if (obj instanceof AbstractC19855612mQ) {
                    boolean z6 = AbstractC19910412vG.LIZIZ;
                    length = ((AbstractC19855612mQ) obj).zze();
                    iLJJ = AbstractC19910412vG.LJJ(length);
                } else {
                    boolean z7 = AbstractC19910412vG.LIZIZ;
                    length = C19910612vI.LIZIZ((String) obj);
                    iLJJ = AbstractC19910412vG.LJJ(length);
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                return ((InterfaceC19911612vS) obj).LJIILL();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (obj instanceof C19912912vf) {
                    length = ((C19911112vN) obj).LIZ();
                    iLJJ = AbstractC19910412vG.LJJ(length);
                } else {
                    boolean z8 = AbstractC19910412vG.LIZIZ;
                    int iLJIILL = ((InterfaceC19911612vS) obj).LJIILL();
                    return AbstractC19910412vG.LJJ(iLJIILL) + iLJIILL;
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (obj instanceof AbstractC19855612mQ) {
                    boolean z9 = AbstractC19910412vG.LIZIZ;
                    length = ((AbstractC19855612mQ) obj).zze();
                    iLJJ = AbstractC19910412vG.LJJ(length);
                } else {
                    boolean z10 = AbstractC19910412vG.LIZIZ;
                    length = ((byte[]) obj).length;
                    iLJJ = AbstractC19910412vG.LJJ(length);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return AbstractC19910412vG.LJJ(((Integer) obj).intValue());
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                if (obj instanceof InterfaceC19912512vb) {
                    return AbstractC19910412vG.LJJI(((InterfaceC19912512vb) obj).zza());
                }
                return AbstractC19910412vG.LJJI(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                boolean z11 = AbstractC19910412vG.LIZIZ;
                return 4;
            case 15:
                ((Long) obj).longValue();
                boolean z12 = AbstractC19910412vG.LIZIZ;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC19910412vG.LJJ((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC19910412vG.LJJI((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iLJJ + length;
    }

    public static int LIZJ(InterfaceC19911512vR interfaceC19911512vR, Object obj) {
        EnumC19938012zi enumC19938012ziLIZ = interfaceC19911512vR.LIZ();
        int iZza = interfaceC19911512vR.zza();
        if (interfaceC19911512vR.LJ()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (interfaceC19911512vR.LIZLLL()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iLIZIZ = 0;
                while (i < size) {
                    iLIZIZ += LIZIZ(enumC19938012ziLIZ, ListProtector.get(list, i));
                    i++;
                }
                return AbstractC19910412vG.LJJ(iZza << 3) + iLIZIZ + AbstractC19910412vG.LJJ(iLIZIZ);
            }
            int iLIZ = 0;
            while (i < size) {
                iLIZ += LIZ(enumC19938012ziLIZ, iZza, ListProtector.get(list, i));
                i++;
            }
            return iLIZ;
        }
        return LIZ(enumC19938012ziLIZ, iZza, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void LJIIJ(InterfaceC19911512vR interfaceC19911512vR, Object obj) {
        boolean z;
        interfaceC19911512vR.LIZ();
        Charset charset = C19856312mX.LIZ;
        obj.getClass();
        EnumC19938012zi enumC19938012zi = EnumC19938012zi.zza;
        EnumC19938112zj enumC19938112zj = EnumC19938112zj.INT;
        switch (r1.zzb()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if ((obj instanceof AbstractC19855612mQ) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC19911512vR.zza()), interfaceC19911512vR.LIZ().zzb(), obj.getClass().getName()}));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC19912512vb)) {
                    return;
                }
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC19911512vR.zza()), interfaceC19911512vR.LIZ().zzb(), obj.getClass().getName()}));
            case MESSAGE:
                if ((obj instanceof InterfaceC19911612vS) || (obj instanceof C19912912vf)) {
                    return;
                }
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC19911512vR.zza()), interfaceC19911512vR.LIZ().zzb(), obj.getClass().getName()}));
            default:
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC19911512vR.zza()), interfaceC19911512vR.LIZ().zzb(), obj.getClass().getName()}));
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC19911512vR.zza()), interfaceC19911512vR.LIZ().zzb(), obj.getClass().getName()}));
    }

    public final void LJFF(InterfaceC19911512vR interfaceC19911512vR, Object obj) {
        if (interfaceC19911512vR.LJ()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = ListProtector.get(list, i);
                    LJIIJ(interfaceC19911512vR, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            LJIIJ(interfaceC19911512vR, obj);
        }
        if (obj instanceof C19912912vf) {
            this.LIZJ = true;
        }
        put(interfaceC19911512vR, obj);
    }

    public static int LIZ(EnumC19938012zi enumC19938012zi, int i, Object obj) {
        int iLJJ = AbstractC19910412vG.LJJ(i << 3);
        if (enumC19938012zi == EnumC19938012zi.zzj) {
            iLJJ += iLJJ;
        }
        return iLJJ + LIZIZ(enumC19938012zi, obj);
    }

    public static void LJI(AbstractC19910412vG abstractC19910412vG, EnumC19938012zi enumC19938012zi, int i, Object obj) {
        if (enumC19938012zi != EnumC19938012zi.zzj) {
            abstractC19910412vG.LJIJ(i, enumC19938012zi.zza());
            EnumC19938112zj enumC19938112zj = EnumC19938112zj.INT;
            switch (enumC19938012zi.ordinal()) {
                case 0:
                    abstractC19910412vG.LJIIJ(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    break;
                case 1:
                    abstractC19910412vG.LJIIIIZZ(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    break;
                case 2:
                    abstractC19910412vG.LJIL(((Long) obj).longValue());
                    break;
                case 3:
                    abstractC19910412vG.LJIL(((Long) obj).longValue());
                    break;
                case 4:
                    abstractC19910412vG.LJIIL(((Integer) obj).intValue());
                    break;
                case 5:
                    abstractC19910412vG.LJIIJ(((Long) obj).longValue());
                    break;
                case 6:
                    abstractC19910412vG.LJIIIIZZ(((Integer) obj).intValue());
                    break;
                case 7:
                    abstractC19910412vG.LIZJ(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    break;
                case 8:
                    if (obj instanceof AbstractC19855612mQ) {
                        abstractC19910412vG.LJI((AbstractC19855612mQ) obj);
                    } else {
                        abstractC19910412vG.LJIIZILJ((String) obj);
                    }
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    ((InterfaceC19911612vS) obj).LIZ(abstractC19910412vG);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    abstractC19910412vG.LJIILIIL((InterfaceC19911612vS) obj);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    if (obj instanceof AbstractC19855612mQ) {
                        abstractC19910412vG.LJI((AbstractC19855612mQ) obj);
                    } else {
                        byte[] bArr = (byte[]) obj;
                        abstractC19910412vG.LJ(bArr, bArr.length);
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    abstractC19910412vG.LJIJJ(((Integer) obj).intValue());
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    if (obj instanceof InterfaceC19912512vb) {
                        abstractC19910412vG.LJIIL(((InterfaceC19912512vb) obj).zza());
                    } else {
                        abstractC19910412vG.LJIIL(((Integer) obj).intValue());
                    }
                    break;
                case 14:
                    abstractC19910412vG.LJIIIIZZ(((Integer) obj).intValue());
                    break;
                case 15:
                    abstractC19910412vG.LJIIJ(((Long) obj).longValue());
                    break;
                case 16:
                    int iIntValue = ((Integer) obj).intValue();
                    abstractC19910412vG.LJIJJ((iIntValue >> 31) ^ (iIntValue + iIntValue));
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    long jLongValue = ((Long) obj).longValue();
                    abstractC19910412vG.LJIL((jLongValue >> 63) ^ (jLongValue + jLongValue));
                    break;
            }
            return;
        }
        abstractC19910412vG.LJIJ(i, 3);
        ((InterfaceC19911612vS) obj).LIZ(abstractC19910412vG);
        abstractC19910412vG.LJIJ(i, 4);
    }
}
