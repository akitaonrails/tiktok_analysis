package X;

import com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata.RavenData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1161780gL2 {
    public final String LIZ;
    public final String LIZIZ;

    public void LIZ(RavenData<Object> ravenData) {
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1161780gL2)) {
            return false;
        }
        C1161780gL2 c1161780gL2 = (C1161780gL2) obj;
        if (!Intrinsics.LJFF(c1161780gL2.LIZ, this.LIZ) || !Intrinsics.LJFF(c1161780gL2.LIZIZ, this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C1161780gL2(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
