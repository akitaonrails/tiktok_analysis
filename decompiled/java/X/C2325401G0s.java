package X;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1G0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2325401G0s extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(3);
    public final int $t;

    public static C2325401G0s get$arr$(int i) {
        C2325401G0s c2325401G0s = (C2325401G0s) arr$.get(i);
        if (c2325401G0s != null) {
            return c2325401G0s;
        }
        arr$.compareAndSet(i, null, new C2325401G0s(i));
        return (C2325401G0s) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2325401G0s(int i) {
        super(4);
        this.$t = i;
    }

    public static void LIZ$0(C1D82 c1d82, Set set, boolean z, Function1 function1) {
        if (!set.contains(c1d82)) {
            if (z || c1d82.LIZJ().LIZIZ) {
                set.add(c1d82);
                function1.invoke(c1d82);
                if (z || (c1d82.LIZJ() instanceof C1D8N)) {
                    Iterator<C1D82> it2 = c1d82.LIZ.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        LIZ$0(it2.next(), set, z, function1);
                    }
                }
            }
        }
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(C2325401G0s c2325401G0s, Object obj, Object obj2, Object obj3, Object obj4) {
        LIZ$0((C1D82) obj, (Set) obj2, ((Boolean) obj3).booleanValue(), (Function1) obj4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C2325401G0s c2325401G0s, Object obj, Object obj2, Object obj3, Object obj4) {
        C0YMW c0ymw = (C0YMW) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send video error: ");
        sbLIZ.append(c0ymw);
        C0YS1.LIZJ("VideoMsgSender", C2188811AlT.LIZIZ(sbLIZ));
        C2256641DUg.LIZIZ(false, (C2256701DUm) obj, (C869590Y9l) obj3, c0ymw, (String) obj4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C2325401G0s c2325401G0s, Object obj, Object obj2, Object obj3, Object obj4) {
        C0YMW c0ymw = (C0YMW) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send photo error: ");
        sbLIZ.append(c0ymw);
        C0YS1.LIZJ("PhotoMsgSender", C2188811AlT.LIZIZ(sbLIZ));
        C2256641DUg.LIZIZ(false, (C2256701DUm) obj, (C869590Y9l) obj3, c0ymw, (String) obj4);
        return Unit.LIZ;
    }
}
