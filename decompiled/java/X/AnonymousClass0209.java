package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.0209, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0209 extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(2);
    public final int $t;

    public static AnonymousClass0209 get$arr$(int i) {
        AnonymousClass0209 anonymousClass0209 = (AnonymousClass0209) arr$.get(i);
        if (anonymousClass0209 != null) {
            return anonymousClass0209;
        }
        arr$.compareAndSet(i, null, new AnonymousClass0209(i));
        return (AnonymousClass0209) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0209(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(AnonymousClass0209 anonymousClass0209, Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass0208 anonymousClass0208;
        int i;
        double dDoubleValue = ((Number) obj).doubleValue();
        double dDoubleValue2 = ((Number) obj2).doubleValue();
        double dDoubleValue3 = ((Number) obj3).doubleValue();
        if (((Boolean) obj4).booleanValue()) {
            anonymousClass0208 = AnonymousClass0208.get$arr$(31);
        } else {
            anonymousClass0208 = AnonymousClass0208.get$arr$(32);
        }
        if (((Boolean) anonymousClass0208.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue3))).booleanValue()) {
            i = 2;
        } else if (((Boolean) anonymousClass0208.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2))).booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$1(AnonymousClass0209 anonymousClass0209, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Boolean) obj4).booleanValue();
        return Boolean.FALSE;
    }
}
