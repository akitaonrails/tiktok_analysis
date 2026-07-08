package X;

import com.bytedance.android.livesdk.model.message.ext.GImage;

/* JADX INFO: renamed from: X.03Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C812103Ff {
    public final Integer LIZ;
    public final String LIZIZ;
    public final GImage LIZJ;
    public final C03CK LIZLLL;

    public C812103Ff(Integer num, String str, GImage gImage, C03CK c03ck, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        gImage = (i & 4) != 0 ? null : gImage;
        c03ck = (i & 8) != 0 ? null : c03ck;
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = gImage;
        this.LIZLLL = c03ck;
    }
}
