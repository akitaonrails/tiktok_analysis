package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1091904Ov {
    public final EnumC12937054l LIZ;
    public final List<InterfaceC776130UcV> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1091904Ov)) {
            return false;
        }
        C1091904Ov c1091904Ov = (C1091904Ov) obj;
        return this.LIZ == c1091904Ov.LIZ && Intrinsics.LJFF(this.LIZIZ, c1091904Ov.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1091904Ov(EnumC12937054l enumC12937054l, List<? extends InterfaceC776130UcV> list) {
        this.LIZ = enumC12937054l;
        this.LIZIZ = list;
    }
}
