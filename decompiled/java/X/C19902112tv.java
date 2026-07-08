package X;

import X.InterfaceC19902712u1;
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

/* JADX INFO: renamed from: X.12tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19902112tv<T extends InterfaceC19902712u1<T>> {
    public static final C19902112tv LIZLLL = new C19902112tv(null);
    public final C19906512ud<T, Object> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final boolean LJIIJJI() {
        for (int i = 0; i < this.LIZ.LIZLLL(); i++) {
            if (!LJIIIIZZ(this.LIZ.LJ(i))) {
                return false;
            }
        }
        Iterator it2 = this.LIZ.LJFF().iterator();
        while (it2.hasNext()) {
            if (!LJIIIIZZ((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> LJIIIZ() {
        if (!this.LIZJ) {
            return this.LIZ.entrySet().iterator();
        }
        final Iterator it2 = this.LIZ.entrySet().iterator();
        return (Iterator<Map.Entry<T, Object>>) new Iterator<Map.Entry<K, Object>>(it2) { // from class: X.12tG
            public final Iterator<Map.Entry<K, Object>> LL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL.hasNext();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ Object next() {
                Map.Entry<K, Object> next = this.LL.next();
                return next.getValue() instanceof C19901212tm ? new C19900912tj(next) : next;
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.LL.remove();
            }

            {
                this.LL = it2;
            }
        };
    }

    public final void LJIIJ() {
        if (this.LIZIZ) {
            return;
        }
        for (int i = 0; i < this.LIZ.LIZLLL(); i++) {
            Map.Entry<K, Object> entryLJ = this.LIZ.LJ(i);
            if (entryLJ.getValue() instanceof AbstractC19899612tW) {
                ((AbstractC19899612tW) entryLJ.getValue()).LJIJJLI();
            }
        }
        this.LIZ.LIZJ();
        this.LIZIZ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        C19902112tv c19902112tv = new C19902112tv();
        for (int i = 0; i < this.LIZ.LIZLLL(); i++) {
            Map.Entry<K, Object> entryLJ = this.LIZ.LJ(i);
            c19902112tv.LJFF((InterfaceC19902712u1) entryLJ.getKey(), entryLJ.getValue());
        }
        Iterator it2 = this.LIZ.LJFF().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            c19902112tv.LJFF((InterfaceC19902712u1) entry.getKey(), entry.getValue());
        }
        c19902112tv.LIZJ = this.LIZJ;
        return c19902112tv;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C19902112tv() {
        final int i = 16;
        this.LIZ = new C19906512ud(i) { // from class: X.12u0
            @Override // X.C19906512ud
            public final void LIZJ() {
                if (!this.LLILZ) {
                    for (int i2 = 0; i2 < LIZLLL(); i2++) {
                        Map.Entry entryLJ = LJ(i2);
                        if (((InterfaceC19902712u1) entryLJ.getKey()).LJ()) {
                            entryLJ.setValue(Collections.unmodifiableList((List) entryLJ.getValue()));
                        }
                    }
                    for (Map.Entry entry : LJFF()) {
                        if (((InterfaceC19902712u1) entry.getKey()).LJ()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.LIZJ();
            }
        };
    }

    public C19902112tv(Object obj) {
        final int i = 0;
        this.LIZ = new C19906512ud(i) { // from class: X.12u0
            @Override // X.C19906512ud
            public final void LIZJ() {
                if (!this.LLILZ) {
                    for (int i2 = 0; i2 < LIZLLL(); i2++) {
                        Map.Entry entryLJ = LJ(i2);
                        if (((InterfaceC19902712u1) entryLJ.getKey()).LJ()) {
                            entryLJ.setValue(Collections.unmodifiableList((List) entryLJ.getValue()));
                        }
                    }
                    for (Map.Entry entry : LJFF()) {
                        if (((InterfaceC19902712u1) entry.getKey()).LJ()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.LIZJ();
            }
        };
        LJIIJ();
        LJIIJ();
    }

    public static int LIZLLL(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.LIZIZ() == C133D.MESSAGE && !key.LJ() && !key.LIZLLL()) {
            if (value instanceof C19901212tm) {
                int iLJIILLIIL = (AbstractC19901712tr.LJIILLIIL(8) << 1) + AbstractC19901712tr.LJIILIIL(2, entry.getKey().zza());
                int iLJIILLIIL2 = AbstractC19901712tr.LJIILLIIL(24);
                int iLIZ = ((C19901012tk) value).LIZ();
                return iLJIILLIIL + iLJIILLIIL2 + AbstractC19901712tr.LJIILLIIL(iLIZ) + iLIZ;
            }
            int iLJIILLIIL3 = (AbstractC19901712tr.LJIILLIIL(8) << 1) + AbstractC19901712tr.LJIILIIL(2, entry.getKey().zza());
            int iLJIILLIIL4 = AbstractC19901712tr.LJIILLIIL(24);
            int iLIZIZ = ((InterfaceC19901112tl) value).LIZIZ();
            return iLJIILLIIL3 + iLJIILLIIL4 + AbstractC19901712tr.LJIILLIIL(iLIZIZ) + iLIZIZ;
        }
        return LIZ(key, value);
    }

    public static Object LJ(Object obj) {
        if (obj instanceof InterfaceC19904412uI) {
            return ((InterfaceC19904412uI) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static <T extends InterfaceC19902712u1<T>> boolean LJIIIIZZ(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.LIZIZ() == C133D.MESSAGE) {
            if (key.LJ()) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof InterfaceC19900412te) {
                        if (!((InterfaceC19900412te) obj).LJIIIIZZ()) {
                            return false;
                        }
                    } else if (!(obj instanceof C19901212tm)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC19900412te) {
                    return ((InterfaceC19900412te) value).LJIIIIZZ();
                }
                if (value instanceof C19901212tm) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public final void LJI(Map.Entry<T, Object> entry) {
        Object objLJI;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C19901212tm;
        if (key.LJ()) {
            if (!z) {
                Object arrayList = this.LIZ.get(key);
                if (!(arrayList instanceof C19901212tm)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Iterator it2 = ((List) value).iterator();
                    while (it2.hasNext()) {
                        ((List) arrayList).add(LJ(it2.next()));
                    }
                    this.LIZ.put(key, arrayList);
                    return;
                }
                throw new NoSuchMethodError();
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (key.LIZIZ() == C133D.MESSAGE) {
            Object obj = this.LIZ.get(key);
            if (!(obj instanceof C19901212tm)) {
                if (obj == null) {
                    this.LIZ.put(key, LJ(value));
                    if (z) {
                        this.LIZJ = true;
                        return;
                    }
                    return;
                }
                if (!z) {
                    if (obj instanceof InterfaceC19904412uI) {
                        objLJI = key.mo77zza();
                    } else {
                        ((InterfaceC19901112tl) obj).LIZLLL();
                        objLJI = ((AbstractC19899712tX) key.mo76zza()).LJI();
                    }
                    this.LIZ.put(key, objLJI);
                    return;
                }
                throw new NoSuchMethodError();
            }
            throw new NoSuchMethodError();
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
        if (!(obj instanceof C19902112tv)) {
            return false;
        }
        return this.LIZ.equals(((C19902112tv) obj).LIZ);
    }

    public static int LIZ(InterfaceC19902712u1<?> interfaceC19902712u1, Object obj) {
        C133E c133eLIZ = interfaceC19902712u1.LIZ();
        int iZza = interfaceC19902712u1.zza();
        if (interfaceC19902712u1.LJ()) {
            List list = (List) obj;
            int iLIZIZ = 0;
            if (interfaceC19902712u1.LIZLLL()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    iLIZIZ += LIZJ(c133eLIZ, it2.next());
                }
                return AbstractC19901712tr.LJIIL(iZza) + iLIZIZ + AbstractC19901712tr.LJIILLIIL(iLIZIZ);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                iLIZIZ += LIZIZ(c133eLIZ, iZza, it3.next());
            }
            return iLIZIZ;
        }
        return LIZIZ(c133eLIZ, iZza, obj);
    }

    public static int LIZJ(C133E c133e, Object obj) {
        switch (C133F.LIZIZ[c133e.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = AbstractC19901712tr.LIZIZ;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = AbstractC19901712tr.LIZIZ;
                return 4;
            case 3:
                return AbstractC19901712tr.LJIIJJI(((Long) obj).longValue());
            case 4:
                return AbstractC19901712tr.LJIIJJI(((Long) obj).longValue());
            case 5:
                return AbstractC19901712tr.LJIIJJI(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = AbstractC19901712tr.LIZIZ;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = AbstractC19901712tr.LIZIZ;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = AbstractC19901712tr.LIZIZ;
                return 1;
            case BdTuring.TYPE_ECAF /* 9 */:
                Logger logger6 = AbstractC19901712tr.LIZIZ;
                return ((InterfaceC19901112tl) obj).LIZIZ();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (obj instanceof C19901212tm) {
                    return AbstractC19901712tr.LIZJ((C19901012tk) obj);
                }
                Logger logger7 = AbstractC19901712tr.LIZIZ;
                int iLIZIZ = ((InterfaceC19901112tl) obj).LIZIZ();
                return AbstractC19901712tr.LJIILLIIL(iLIZIZ) + iLIZIZ;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (obj instanceof AbstractC19854812mI) {
                    Logger logger8 = AbstractC19901712tr.LIZIZ;
                    int iZzb = ((AbstractC19854812mI) obj).zzb();
                    return AbstractC19901712tr.LJIILLIIL(iZzb) + iZzb;
                }
                return AbstractC19901712tr.LIZLLL((String) obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (obj instanceof AbstractC19854812mI) {
                    Logger logger9 = AbstractC19901712tr.LIZIZ;
                    int iZzb2 = ((AbstractC19854812mI) obj).zzb();
                    return AbstractC19901712tr.LJIILLIIL(iZzb2) + iZzb2;
                }
                Logger logger10 = AbstractC19901712tr.LIZIZ;
                int length = ((byte[]) obj).length;
                return AbstractC19901712tr.LJIILLIIL(length) + length;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return AbstractC19901712tr.LJIILLIIL(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = AbstractC19901712tr.LIZIZ;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = AbstractC19901712tr.LIZIZ;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC19901712tr.LJIILLIIL((iIntValue >> 31) ^ (iIntValue << 1));
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC19901712tr.LJIIJJI((jLongValue >> 63) ^ (jLongValue << 1));
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (obj instanceof InterfaceC19793112cL) {
                    return AbstractC19901712tr.LJIIJJI(((InterfaceC19793112cL) obj).zza());
                }
                return AbstractC19901712tr.LJIIJJI(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void LJII(T t, Object obj) {
        boolean z;
        C133E c133eLIZ = t.LIZ();
        Charset charset = C19856912md.LIZ;
        obj.getClass();
        switch (C133F.LIZ[c133eLIZ.zzb().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof AbstractC19854812mI) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zzb(), obj.getClass().getName()}));
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC19793112cL)) {
                    return;
                }
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zzb(), obj.getClass().getName()}));
            case BdTuring.TYPE_ECAF /* 9 */:
                if ((obj instanceof InterfaceC19901112tl) || (obj instanceof C19901212tm)) {
                    return;
                }
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zzb(), obj.getClass().getName()}));
            default:
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zzb(), obj.getClass().getName()}));
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.LIZ().zzb(), obj.getClass().getName()}));
    }

    public final void LJFF(T t, Object obj) {
        if (t.LJ()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = ListProtector.get(arrayList, i);
                    i++;
                    LJII(t, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            LJII(t, obj);
        }
        if (obj instanceof C19901212tm) {
            this.LIZJ = true;
        }
        this.LIZ.put(t, obj);
    }

    public static int LIZIZ(C133E c133e, int i, Object obj) {
        int iLJIIL = AbstractC19901712tr.LJIIL(i);
        if (c133e == C133E.zzj) {
            boolean z = ((InterfaceC19901112tl) obj) instanceof AbstractC19904512uJ;
            iLJIIL <<= 1;
        }
        return iLJIIL + LIZJ(c133e, obj);
    }
}
