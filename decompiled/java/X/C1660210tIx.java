package X;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660210tIx {
    public final List<C1660120tIo<AbstractC1678220tm0>> LIZ;

    public C1660210tIx(List list) {
        this.LIZ = list;
    }

    public final <T extends AbstractC1678220tm0> void LIZ(T t, Function0<? extends InterfaceC1664980tQe<T, ? extends InterfaceC1461640o8g<? extends T>>> function0, Function1<? super C1DRG, ? extends InterfaceC1660130tIp<T>> function1, boolean z) {
        EnumC992910bwf enumC992910bwf;
        List<C1660120tIo<AbstractC1678220tm0>> list = this.LIZ;
        if (z) {
            enumC992910bwf = EnumC992910bwf.ALWAYS_TOP;
        } else {
            enumC992910bwf = EnumC992910bwf.SCROLLABLE_CONTAINER;
        }
        list.add(new C1660120tIo<>(t, function0, function1, enumC992910bwf));
    }
}
