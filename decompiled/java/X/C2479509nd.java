package X;

import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.09nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2479509nd {
    public static final /* synthetic */ int LIZ = 0;

    public static C2479609ne LIZIZ(String str) {
        int iLJIIIIZZ;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str2 = options.outMimeType;
        if (str2 == null) {
            str2 = "";
        }
        int i3 = 0;
        try {
            iLJIIIIZZ = new C2259261Dbo(str).LJIIIIZZ();
            try {
            } catch (IOException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (iLJIIIIZZ != 3) {
            if (iLJIIIIZZ != 6) {
                if (iLJIIIIZZ == 8) {
                    i3 = 270;
                    i2 = options.outWidth;
                    i = options.outHeight;
                }
                return new C2479609ne(i3, i, i2, str2);
            }
            i3 = 90;
            i2 = options.outWidth;
            i = options.outHeight;
        } else {
            i3 = 180;
            i2 = options.outHeight;
            i = options.outWidth;
        }
        return new C2479609ne(i3, i, i2, str2);
    }

    public static String LIZ(String str, String str2, float f, int i, EnumC2479809ng enumC2479809ng, int i2) {
        boolean z;
        EnumC2479809ng enumC2479809ng2 = enumC2479809ng;
        int i3 = i;
        float f2 = f;
        if ((i2 & 4) != 0) {
            f2 = 600.0f;
        }
        if ((i2 & 8) != 0) {
            i3 = 100;
        }
        if ((i2 & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 32) != 0) {
            enumC2479809ng2 = EnumC2479809ng.AUTO;
        }
        try {
            return LIZJ(f2, i3, enumC2479809ng2, str, str2, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:79:0x0233
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZJ(float r20, int r21, X.EnumC2479809ng r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2479509nd.LIZJ(float, int, X.09ng, java.lang.String, java.lang.String, boolean):java.lang.String");
    }
}
