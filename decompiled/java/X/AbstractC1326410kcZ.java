package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0kcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1326410kcZ {
    public static final C1326420kca LIZ;
    public static final C1326400kcY LIZIZ;
    public static AbstractC1326410kcZ LIZJ;

    public abstract Bitmap.Config LIZ(String str, int i, int i2, int i3, int i4, boolean z, C1330000kiM c1330000kiM);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0kcY] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kcZ, X.0kca] */
    static {
        ?? r1 = new AbstractC1326410kcZ() { // from class: X.0kca
            @Override // X.AbstractC1326410kcZ
            public final Bitmap.Config LIZ(String str, int i, int i2, int i3, int i4, boolean z, C1330000kiM c1330000kiM) {
                return Bitmap.Config.ARGB_8888;
            }
        };
        LIZ = r1;
        LIZIZ = new AbstractC1326410kcZ() { // from class: X.0kcY
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
            
                if (android.os.Build.VERSION.SDK_INT == 25) goto L13;
             */
            @Override // X.AbstractC1326410kcZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.graphics.Bitmap.Config LIZ(java.lang.String r3, int r4, int r5, int r6, int r7, boolean r8, X.C1330000kiM r9) {
                /*
                    r2 = this;
                    if (r8 != 0) goto L2b
                    java.lang.String r1 = android.os.Build.BRAND
                    if (r1 == 0) goto L2e
                    java.util.Locale r0 = java.util.Locale.ENGLISH
                    java.lang.String r1 = r1.toLowerCase(r0)
                    java.lang.String r0 = "meizu"
                    int r1 = r1.indexOf(r0)
                    r0 = -1
                    if (r1 <= r0) goto L2e
                    java.lang.String r1 = android.os.Build.DEVICE
                    boolean r0 = android.text.TextUtils.isEmpty(r1)
                    if (r0 != 0) goto L2e
                    java.lang.String r0 = "15"
                    boolean r0 = r1.contains(r0)
                    if (r0 == 0) goto L2e
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r0 = 25
                    if (r1 != r0) goto L2e
                L2b:
                    android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                    return r0
                L2e:
                    android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1326400kcY.LIZ(java.lang.String, int, int, int, int, boolean, X.0kiM):android.graphics.Bitmap$Config");
            }
        };
        LIZJ = r1;
    }
}
