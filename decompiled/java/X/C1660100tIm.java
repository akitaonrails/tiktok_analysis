package X;

import X.InterfaceC1660190tIv;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660100tIm<T extends InterfaceC1660190tIv> {
    public final List<C1661930tLj<T, ? extends InterfaceC1461640o8g<? extends T>>> LIZ;
    public final EnumC1083770eJD LIZIZ;
    public final Function2<InterfaceC1660190tIv, InterfaceC1660090tIl, Unit> LIZJ;

    public C1660100tIm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1660100tIm)) {
            return false;
        }
        C1660100tIm c1660100tIm = (C1660100tIm) obj;
        return Intrinsics.LJFF(this.LIZ, c1660100tIm.LIZ) && this.LIZIZ == c1660100tIm.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1660100tIm.LIZJ);
    }

    public C1660100tIm(int i) {
        this(C13BV.INSTANCE, EnumC1083770eJD.TOP, AFwS311S0000000_25.get$arr$(40));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1660100tIm(List<? extends C1661930tLj<T, ? extends InterfaceC1461640o8g<? extends T>>> list, EnumC1083770eJD enumC1083770eJD, Function2<? super InterfaceC1660190tIv, ? super InterfaceC1660090tIl, Unit> function2) {
        this.LIZ = list;
        this.LIZIZ = enumC1083770eJD;
        this.LIZJ = function2;
    }
}
