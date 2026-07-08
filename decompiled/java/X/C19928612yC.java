package X;

import X.C19928812yE;
import X.InterfaceC19930212yS;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12yC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19928612yC<T extends InterfaceC19930212yS<T>> {
    public static final C19928612yC<?> LIZLLL;
    public final C19928812yE<T, Object> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    static {
        C19928612yC<?> c19928612yC = new C19928612yC<>(new C19929712yN());
        c19928612yC.LJIJJ();
        LIZLLL = c19928612yC;
    }

    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C19928612yC<T> clone() {
        C19928612yC<T> c19928612yC = new C19928612yC<>();
        int i = this.LIZ.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            C19928812yE.c cVarLIZJ = this.LIZ.LIZJ(i2);
            c19928612yC.LJIL((InterfaceC19930212yS) cVarLIZJ.LL, cVarLIZJ.LLILLJJLI);
        }
        Iterator it2 = this.LIZ.LIZLLL().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            c19928612yC.LJIL((InterfaceC19930212yS) entry.getKey(), entry.getValue());
        }
        c19928612yC.LIZJ = this.LIZJ;
        return c19928612yC;
    }

    public final Map<T, Object> LJII() {
        if (!this.LIZJ) {
            C19928812yE<T, Object> c19928812yE = this.LIZ;
            return !c19928812yE.LLILZ ? Collections.unmodifiableMap(c19928812yE) : c19928812yE;
        }
        C19929712yN c19929712yNLIZJ = LIZJ(this.LIZ, false, true);
        if (this.LIZ.LLILZ) {
            c19929712yNLIZJ.LJFF();
        }
        return c19929712yNLIZJ;
    }

    public final int LJIIIZ() {
        int i = this.LIZ.LLILLJJLI;
        int iLJIIJ = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iLJIIJ += LJIIJ(this.LIZ.LIZJ(i2));
        }
        Iterator it2 = this.LIZ.LIZLLL().iterator();
        while (it2.hasNext()) {
            iLJIIJ += LJIIJ((Map.Entry) it2.next());
        }
        return iLJIIJ;
    }

    public final int LJIILIIL() {
        int i = this.LIZ.LLILLJJLI;
        int iLJI = 0;
        for (int i2 = 0; i2 < i; i2++) {
            C19928812yE.c cVarLIZJ = this.LIZ.LIZJ(i2);
            iLJI += LJI((InterfaceC19930212yS) cVarLIZJ.LL, cVarLIZJ.LLILLJJLI);
        }
        Iterator it2 = this.LIZ.LIZLLL().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            iLJI += LJI((InterfaceC19930212yS) entry.getKey(), entry.getValue());
        }
        return iLJI;
    }

    public final boolean LJIILL() {
        return this.LIZ.isEmpty();
    }

    public final boolean LJIILLIIL() {
        int i = this.LIZ.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            if (!LJIIZILJ(this.LIZ.LIZJ(i2))) {
                return false;
            }
        }
        Iterator it2 = this.LIZ.LIZLLL().iterator();
        while (it2.hasNext()) {
            if (!LJIIZILJ((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJ() {
        if (this.LIZIZ) {
            return;
        }
        int i = this.LIZ.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            V v = this.LIZ.LIZJ(i2).LLILLJJLI;
            if (v instanceof AbstractC19924712xZ) {
                ((AbstractC19924712xZ) v).makeImmutable();
            }
        }
        Iterator it2 = this.LIZ.LIZLLL().iterator();
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            if (value instanceof AbstractC19924712xZ) {
                ((AbstractC19924712xZ) value).makeImmutable();
            }
        }
        this.LIZ.LJFF();
        this.LIZIZ = true;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C19928612yC() {
        this.LIZ = new C19929712yN();
    }

    public final Iterator<Map.Entry<T, Object>> LJIJI() {
        return LJIILL() ? Collections.emptyIterator() : this.LIZJ ? new C19926212xo(this.LIZ.entrySet().iterator()) : this.LIZ.entrySet().iterator();
    }

    public C19928612yC(C19928812yE<T, Object> c19928812yE) {
        this.LIZ = c19928812yE;
        LJIJJ();
    }

    public static Object LJ(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int LJIIJ(Map.Entry entry) {
        InterfaceC19930212yS interfaceC19930212yS = (InterfaceC19930212yS) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC19930212yS.LJJJIL() == AnonymousClass1332.MESSAGE && !interfaceC19930212yS.LJJLJ() && !interfaceC19930212yS.isPacked()) {
            if (value instanceof C19926112xn) {
                C19925912xl c19925912xl = (C19925912xl) value;
                int number = ((InterfaceC19930212yS) entry.getKey()).getNumber();
                c19925912xl.getClass();
                return (AbstractC19928912yF.LJIIL(1) * 2) + AbstractC19928912yF.LJIIL(2) + AbstractC19928912yF.LJIILIIL(number) + AbstractC19928912yF.LJIIL(3) + c19925912xl.LIZ();
            }
            return AbstractC19928912yF.LJI(((InterfaceC19930212yS) entry.getKey()).getNumber(), (InterfaceC19925612xi) value);
        }
        return LJI(interfaceC19930212yS, value);
    }

    public static <T extends InterfaceC19930212yS<T>> boolean LJIIZILJ(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.LJJJIL() == AnonymousClass1332.MESSAGE) {
            if (key.LJJLJ()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = ListProtector.get(list, i);
                    if (obj instanceof InterfaceC19916512wF) {
                        if (!((InterfaceC19916512wF) obj).isInitialized()) {
                            return false;
                        }
                    } else if (!(obj instanceof C19926112xn)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC19916512wF) {
                    return ((InterfaceC19916512wF) value).isInitialized();
                }
                if (value instanceof C19926112xn) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public final Object LJIIIIZZ(T t) {
        Object obj = this.LIZ.get(t);
        if (obj instanceof C19926112xn) {
            return ((C19926112xn) obj).LIZLLL();
        }
        return obj;
    }

    public final int LJIIL(T t) {
        if (t.LJJLJ()) {
            Object objLJIIIIZZ = LJIIIIZZ(t);
            if (objLJIIIIZZ == null) {
                return 0;
            }
            return ((List) objLJIIIIZZ).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public final boolean LJIILJJIL(T t) {
        if (!t.LJJLJ()) {
            if (this.LIZ.get(t) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public final void LJIJJLI(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C19926112xn;
        if (key.LJJLJ()) {
            if (!z) {
                Object objLJIIIIZZ = LJIIIIZZ(key);
                List list = (List) value;
                int size = list.size();
                if (objLJIIIIZZ == null) {
                    objLJIIIIZZ = new ArrayList(size);
                }
                List list2 = (List) objLJIIIIZZ;
                for (int i = 0; i < size; i++) {
                    list2.add(LJ(ListProtector.get(list, i)));
                }
                this.LIZ.put(key, objLJIIIIZZ);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (key.LJJJIL() == AnonymousClass1332.MESSAGE) {
            Object objLJIIIIZZ2 = LJIIIIZZ(key);
            if (objLJIIIIZZ2 == null) {
                this.LIZ.put(key, LJ(value));
                if (z) {
                    this.LIZJ = true;
                    return;
                }
                return;
            }
            if (z) {
                value = ((C19926112xn) value).LIZLLL();
            }
            if (key.LJJJJLI(objLJIIIIZZ2)) {
                InterfaceC19928112y7 builder = ((InterfaceC19925612xi) objLJIIIIZZ2).toBuilder();
                key.LJJIFFI(builder, value);
                this.LIZ.put(key, builder.build());
                return;
            }
            key.LJJIFFI(objLJIIIIZZ2, value);
            return;
        }
        if (!z) {
            this.LIZ.put(key, LJ(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19928612yC)) {
            return false;
        }
        return this.LIZ.equals(((C19928612yC) obj).LIZ);
    }

    public static int LJFF(AnonymousClass1334 anonymousClass1334, Object obj) {
        switch (AnonymousClass1333.LIZIZ[anonymousClass1334.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = AbstractC19928912yF.LIZIZ;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = AbstractC19928912yF.LIZIZ;
                return 4;
            case 3:
                return AbstractC19928912yF.LJIILJJIL(((Long) obj).longValue());
            case 4:
                return AbstractC19928912yF.LJIILJJIL(((Long) obj).longValue());
            case 5:
                return AbstractC19928912yF.LJIILJJIL(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = AbstractC19928912yF.LIZIZ;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = AbstractC19928912yF.LIZIZ;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = AbstractC19928912yF.LIZIZ;
                return 1;
            case BdTuring.TYPE_ECAF /* 9 */:
                return ((InterfaceC19925612xi) obj).getSerializedSize();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (obj instanceof C19926112xn) {
                    return ((C19925912xl) obj).LIZ();
                }
                return AbstractC19928912yF.LJIIIIZZ((InterfaceC19925612xi) obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (obj instanceof AbstractC19922812xG) {
                    return AbstractC19928912yF.LIZLLL((AbstractC19922812xG) obj);
                }
                return AbstractC19928912yF.LJIIJJI((String) obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (obj instanceof AbstractC19922812xG) {
                    return AbstractC19928912yF.LIZLLL((AbstractC19922812xG) obj);
                }
                Logger logger6 = AbstractC19928912yF.LIZIZ;
                int length = ((byte[]) obj).length;
                return AbstractC19928912yF.LJIILIIL(length) + length;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return AbstractC19928912yF.LJIILIIL(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger7 = AbstractC19928912yF.LIZIZ;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger8 = AbstractC19928912yF.LIZIZ;
                return 8;
            case 16:
                return AbstractC19928912yF.LJIIIZ(((Integer) obj).intValue());
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return AbstractC19928912yF.LJIIJ(((Long) obj).longValue());
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (obj instanceof InterfaceC19931112yb) {
                    return AbstractC19928912yF.LJIILJJIL(((InterfaceC19931112yb) obj).getNumber());
                }
                return AbstractC19928912yF.LJIILJJIL(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int LJI(InterfaceC19930212yS<?> interfaceC19930212yS, Object obj) {
        AnonymousClass1334 anonymousClass1334LJJIJL = interfaceC19930212yS.LJJIJL();
        int number = interfaceC19930212yS.getNumber();
        if (interfaceC19930212yS.LJJLJ()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (interfaceC19930212yS.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                int iLJFF = 0;
                while (i < size) {
                    iLJFF += LJFF(anonymousClass1334LJJIJL, ListProtector.get(list, i));
                    i++;
                }
                return AbstractC19928912yF.LJIIL(number) + iLJFF + AbstractC19928912yF.LJIILIIL(iLJFF);
            }
            int iLJFF2 = 0;
            while (i < size) {
                Object obj2 = ListProtector.get(list, i);
                int iLJIIL = AbstractC19928912yF.LJIIL(number);
                if (anonymousClass1334LJJIJL == AnonymousClass1334.GROUP) {
                    iLJIIL *= 2;
                }
                iLJFF2 += iLJIIL + LJFF(anonymousClass1334LJJIJL, obj2);
                i++;
            }
            return iLJFF2;
        }
        int iLJIIL2 = AbstractC19928912yF.LJIIL(number);
        if (anonymousClass1334LJJIJL == AnonymousClass1334.GROUP) {
            iLJIIL2 *= 2;
        }
        return iLJIIL2 + LJFF(anonymousClass1334LJJIJL, obj);
    }

    public static boolean LJIJ(AnonymousClass1334 anonymousClass1334, Object obj) {
        Charset charset = C19922012x8.LIZ;
        obj.getClass();
        switch (AnonymousClass1333.LIZ[anonymousClass1334.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof AbstractC19922812xG) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC19931112yb)) {
                    return true;
                }
                return false;
            case BdTuring.TYPE_ECAF /* 9 */:
                if ((obj instanceof InterfaceC19925612xi) || (obj instanceof C19926112xn)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static void LJJ(InterfaceC19930212yS interfaceC19930212yS, Object obj) {
        if (LJIJ(interfaceC19930212yS.LJJIJL(), obj)) {
        } else {
            throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC19930212yS.getNumber()), interfaceC19930212yS.LJJIJL().getJavaType(), obj.getClass().getName()}));
        }
    }

    public static void LJJIII(Map.Entry entry, AbstractC19928912yF abstractC19928912yF) {
        InterfaceC19930212yS interfaceC19930212yS = (InterfaceC19930212yS) entry.getKey();
        if (interfaceC19930212yS.LJJJIL() == AnonymousClass1332.MESSAGE && !interfaceC19930212yS.LJJLJ() && !interfaceC19930212yS.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof C19926112xn) {
                abstractC19928912yF.LJJIIZI(((InterfaceC19930212yS) entry.getKey()).getNumber(), ((C19925912xl) value).LIZJ());
                return;
            } else {
                abstractC19928912yF.LJJIIZ(((InterfaceC19930212yS) entry.getKey()).getNumber(), (InterfaceC19925612xi) value);
                return;
            }
        }
        LJJII(interfaceC19930212yS, entry.getValue(), abstractC19928912yF);
    }

    public final void LIZ(T t, Object obj) {
        List arrayList;
        if (t.LJJLJ()) {
            LJJ(t, obj);
            Object objLJIIIIZZ = LJIIIIZZ(t);
            if (objLJIIIIZZ == null) {
                arrayList = new ArrayList();
                this.LIZ.put(t, arrayList);
            } else {
                arrayList = (List) objLJIIIIZZ;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final Object LJIIJJI(T t, int i) {
        if (t.LJJLJ()) {
            Object objLJIIIIZZ = LJIIIIZZ(t);
            if (objLJIIIIZZ != null) {
                return ListProtector.get((List) objLJIIIIZZ, i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public final void LJIL(T t, Object obj) {
        if (t.LJJLJ()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = ListProtector.get(list, i);
                    LJJ(t, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            LJJ(t, obj);
        }
        if (obj instanceof C19926112xn) {
            this.LIZJ = true;
        }
        this.LIZ.put(t, obj);
    }

    public static C19929712yN LIZJ(C19928812yE c19928812yE, boolean z, boolean z2) {
        C19929712yN c19929712yN = new C19929712yN();
        int i = c19928812yE.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            LIZLLL(c19929712yN, c19928812yE.LIZJ(i2), z, z2);
        }
        Iterator it2 = c19928812yE.LIZLLL().iterator();
        while (it2.hasNext()) {
            LIZLLL(c19929712yN, (Map.Entry) it2.next(), z, z2);
        }
        return c19929712yN;
    }

    public static void LJJIFFI(AbstractC19928912yF abstractC19928912yF, AnonymousClass1334 anonymousClass1334, Object obj) {
        switch (AnonymousClass1333.LIZIZ[anonymousClass1334.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                abstractC19928912yF.getClass();
                abstractC19928912yF.LJJI(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                abstractC19928912yF.getClass();
                abstractC19928912yF.LJIL(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                abstractC19928912yF.LJJIL(((Long) obj).longValue());
                break;
            case 4:
                abstractC19928912yF.LJJIL(((Long) obj).longValue());
                break;
            case 5:
                abstractC19928912yF.LJJIII(((Integer) obj).intValue());
                break;
            case 6:
                abstractC19928912yF.LJJI(((Long) obj).longValue());
                break;
            case 7:
                abstractC19928912yF.LJIL(((Integer) obj).intValue());
                break;
            case 8:
                abstractC19928912yF.LJIILLIIL(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                abstractC19928912yF.getClass();
                ((InterfaceC19925612xi) obj).writeTo(abstractC19928912yF);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                abstractC19928912yF.LJJIIJZLJL((InterfaceC19925612xi) obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (obj instanceof AbstractC19922812xG) {
                    abstractC19928912yF.LJIJJ((AbstractC19922812xG) obj);
                } else {
                    abstractC19928912yF.LJJIJIIJI((String) obj);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (obj instanceof AbstractC19922812xG) {
                    abstractC19928912yF.LJIJJ((AbstractC19922812xG) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    abstractC19928912yF.getClass();
                    abstractC19928912yF.LJIJ(bArr, bArr.length);
                }
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                abstractC19928912yF.LJJIJL(((Integer) obj).intValue());
                break;
            case 14:
                abstractC19928912yF.LJIL(((Integer) obj).intValue());
                break;
            case 15:
                abstractC19928912yF.LJJI(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC19928912yF.LJJIJL((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                abstractC19928912yF.LJJIL((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (obj instanceof InterfaceC19931112yb) {
                    abstractC19928912yF.LJJIII(((InterfaceC19931112yb) obj).getNumber());
                } else {
                    abstractC19928912yF.LJJIII(((Integer) obj).intValue());
                }
                break;
        }
    }

    public static void LJJII(InterfaceC19930212yS<?> interfaceC19930212yS, Object obj, AbstractC19928912yF abstractC19928912yF) {
        AnonymousClass1334 anonymousClass1334LJJIJL = interfaceC19930212yS.LJJIJL();
        int number = interfaceC19930212yS.getNumber();
        if (interfaceC19930212yS.LJJLJ()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (interfaceC19930212yS.isPacked()) {
                if (list.isEmpty()) {
                    return;
                }
                abstractC19928912yF.LJJIJIIJIL(number, 2);
                int iLJFF = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    iLJFF += LJFF(anonymousClass1334LJJIJL, ListProtector.get(list, i2));
                }
                abstractC19928912yF.LJJIJL(iLJFF);
                while (i < size) {
                    LJJIFFI(abstractC19928912yF, anonymousClass1334LJJIJL, ListProtector.get(list, i));
                    i++;
                }
                return;
            }
            while (i < size) {
                LJJI(abstractC19928912yF, anonymousClass1334LJJIJL, number, ListProtector.get(list, i));
                i++;
            }
            return;
        }
        if (obj instanceof C19926112xn) {
            LJJI(abstractC19928912yF, anonymousClass1334LJJIJL, number, ((C19926112xn) obj).LIZLLL());
        } else {
            LJJI(abstractC19928912yF, anonymousClass1334LJJIJL, number, obj);
        }
    }

    public static void LIZLLL(C19929712yN c19929712yN, Map.Entry entry, boolean z, boolean z2) {
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C19926112xn)) {
            c19929712yN.put(key, ((C19926112xn) value).LIZLLL());
        } else if (z && (value instanceof List)) {
            c19929712yN.put(key, new ArrayList((Collection) value));
        } else {
            c19929712yN.put(key, value);
        }
    }

    public static void LJJI(AbstractC19928912yF abstractC19928912yF, AnonymousClass1334 anonymousClass1334, int i, Object obj) {
        if (anonymousClass1334 == AnonymousClass1334.GROUP) {
            abstractC19928912yF.LJJIFFI(i, (InterfaceC19925612xi) obj);
        } else {
            abstractC19928912yF.LJJIJIIJIL(i, anonymousClass1334.getWireType());
            LJJIFFI(abstractC19928912yF, anonymousClass1334, obj);
        }
    }
}
