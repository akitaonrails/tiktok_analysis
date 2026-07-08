package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.12Yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775612Yw extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(8);
    public final int $t;

    public static C19775612Yw get$arr$(int i) {
        C19775612Yw c19775612Yw = (C19775612Yw) arr$.get(i);
        if (c19775612Yw != null) {
            return c19775612Yw;
        }
        arr$.compareAndSet(i, null, new C19775612Yw(i));
        return (C19775612Yw) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19775612Yw(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C19775612Yw c19775612Yw, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        boolean z = true;
        if (!C1697810uHb.LJIIJJI(1, 3).contains(Integer.valueOf(iIntValue)) || iIntValue2 != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(C19775612Yw c19775612Yw, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        if (iIntValue == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(C19775612Yw c19775612Yw, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        if (iIntValue == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(C19775612Yw c19775612Yw, Object obj, Object obj2, Object obj3, Object obj4) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$4(C19775612Yw c19775612Yw, Object obj, Object obj2, Object obj3, Object obj4) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$5(C19775612Yw c19775612Yw, Object obj, Object obj2, Object obj3, Object obj4) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$6(C19775612Yw c19775612Yw, Object obj, Object obj2, Object obj3, Object obj4) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$7(C19775612Yw c19775612Yw, Object obj, Object obj2, Object obj3, Object obj4) {
        return null;
    }
}
