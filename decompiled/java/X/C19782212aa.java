package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.12aa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19782212aa {
    public final EnumC19782112aZ LIZ;

    public C19782212aa(EnumC19782112aZ enumC19782112aZ) {
        this.LIZ = enumC19782112aZ;
    }

    public static C19782212aa LIZ(String str) {
        EnumC19782112aZ enumC19782112aZLJFF;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            enumC19782112aZLJFF = C19781912aX.LJFF(str.charAt(0));
        } else {
            enumC19782112aZLJFF = EnumC19782112aZ.UNINITIALIZED;
        }
        return new C19782212aa(enumC19782112aZLJFF);
    }
}
