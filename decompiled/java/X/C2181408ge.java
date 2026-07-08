package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.UUID;

/* JADX INFO: renamed from: X.08ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2181408ge {
    public static final /* synthetic */ int LIZ = 0;

    public static C0VSJ LIZ(Context context, EnumC2181608gg enumC2181608gg) {
        File fileW2;
        StringBuilder sb = new StringBuilder();
        C0VSJ c0vsj = null;
        if (context != null) {
            fileW2 = C786410Ut5.w2(context);
        } else {
            fileW2 = null;
        }
        sb.append(fileW2);
        sb.append(File.separator);
        sb.append(UUID.randomUUID());
        int i = C2181508gf.LIZ[enumC2181608gg.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    sb.append(".mp4");
                } else {
                    throw new C1954807lC();
                }
            } else {
                sb.append(".webp");
            }
        } else {
            sb.append(".png");
        }
        try {
            C0VSJ c0vsj2 = new C0VSJ(sb.toString());
            try {
                c0vsj2.createNewFile();
                return c0vsj2;
            } catch (Exception e) {
                e = e;
                c0vsj = c0vsj2;
                TryCatchGuardChecker.doCheck(e);
                return c0vsj;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static C0VSJ LIZIZ(Context context, Bitmap bitmap) {
        C0VSJ c0vsjLIZ = null;
        try {
            c0vsjLIZ = LIZ(context, EnumC2181608gg.WEBP);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            bitmap.compress(Bitmap.CompressFormat.WEBP, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C0VSV c0vsv = new C0VSV(c0vsjLIZ);
            c0vsv.write(byteArray);
            c0vsv.flush();
            c0vsv.close();
            return c0vsjLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c0vsjLIZ;
        }
    }
}
