package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0d42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035920d42 implements Serializable {
    public boolean hasFirstPageBackgroundLoadFinish;
    public EnumC1036690d5H webReuseMode;

    public final C1035920d42 copy(EnumC1036690d5H enumC1036690d5H, boolean z) {
        return new C1035920d42(enumC1036690d5H, z);
    }

    public int hashCode() {
        return (this.webReuseMode.hashCode() * 31) + C786410Ut5.Z2(this.hasFirstPageBackgroundLoadFinish);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdWebReuseDataModel(webReuseMode=");
        sbLIZ.append(this.webReuseMode);
        sbLIZ.append(", hasFirstPageBackgroundLoadFinish=");
        sbLIZ.append(this.hasFirstPageBackgroundLoadFinish);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1035920d42() {
        this(EnumC1036690d5H.NORMAL, false);
    }

    public final void setHasFirstPageBackgroundLoadFinish(boolean z) {
        this.hasFirstPageBackgroundLoadFinish = z;
    }

    public final void setWebReuseMode(EnumC1036690d5H enumC1036690d5H) {
        this.webReuseMode = enumC1036690d5H;
    }

    public C1035920d42(EnumC1036690d5H enumC1036690d5H, boolean z) {
        this.webReuseMode = enumC1036690d5H;
        this.hasFirstPageBackgroundLoadFinish = z;
    }
}
