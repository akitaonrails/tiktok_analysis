package X;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: renamed from: X.04Jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1077504Jh extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(2);
    public final int $t;

    public static C1077504Jh get$arr$(int i) {
        C1077504Jh c1077504Jh = (C1077504Jh) arr$.get(i);
        if (c1077504Jh != null) {
            return c1077504Jh;
        }
        arr$.compareAndSet(i, null, new C1077504Jh(i));
        return (C1077504Jh) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
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
    public C1077504Jh(int i) {
        super(4);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(C1077504Jh c1077504Jh, Object obj, Object obj2, Object obj3, Object obj4) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(C1077504Jh c1077504Jh, Object obj, Object obj2, Object obj3, Object obj4) {
        return Unit.LIZ;
    }
}
