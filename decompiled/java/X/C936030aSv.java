package X;

import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936030aSv {
    public final C936170aT9 LIZ;
    public final EnumC935940aSm LIZIZ;
    public final int LIZJ;
    public final Avatar LIZLLL;
    public final String LJ;

    public C936030aSv(C936170aT9 c936170aT9, EnumC935940aSm enumC935940aSm, int i, Avatar avatar, String str) {
        this.LIZ = c936170aT9;
        this.LIZIZ = enumC935940aSm;
        this.LIZJ = i;
        this.LIZLLL = avatar;
        this.LJ = str;
    }

    public /* synthetic */ C936030aSv(C936170aT9 c936170aT9, EnumC935940aSm enumC935940aSm, int i, Avatar avatar, String str, int i2) {
        this(c936170aT9, enumC935940aSm, i, (i2 & 8) != 0 ? null : avatar, (i2 & 16) == 0 ? str : null);
    }
}
