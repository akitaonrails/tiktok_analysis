package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146010fvb {
    public final List<C050G> LIZ;
    public final EnumC1145990fvZ LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146010fvb)) {
            return false;
        }
        C1146010fvb c1146010fvb = (C1146010fvb) obj;
        return Intrinsics.LJFF(this.LIZ, c1146010fvb.LIZ) && this.LIZIZ == c1146010fvb.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1146010fvb(List<? extends C050G> list, EnumC1145990fvZ enumC1145990fvZ) {
        this.LIZ = list;
        this.LIZIZ = enumC1145990fvZ;
    }
}
