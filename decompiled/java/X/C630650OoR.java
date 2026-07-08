package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630650OoR {
    public final String LIZ;
    public EnumC630660OoS LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C630650OoR)) {
            return false;
        }
        C630650OoR c630650OoR = (C630650OoR) obj;
        return Intrinsics.LJFF(this.LIZ, c630650OoR.LIZ) && this.LIZIZ == c630650OoR.LIZIZ;
    }

    public C630650OoR() {
        this("", EnumC630660OoS.UNLOADING);
    }

    public C630650OoR(String str, EnumC630660OoS enumC630660OoS) {
        this.LIZ = str;
        this.LIZIZ = enumC630660OoS;
    }
}
