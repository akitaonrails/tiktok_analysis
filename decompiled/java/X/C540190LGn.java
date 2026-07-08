package X;

import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540190LGn {
    public static boolean LIZ;

    public static void LIZ(C19EG c19eg, EnumC540140LGi enumC540140LGi, Function1 function1) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
            if (c19egLIZIZ != null) {
                TokenCert tokenCert = new TokenCert("bpea-tako_image_uplad_request_permission_photo_album_read");
                AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(function1, 736);
                if (i >= 34 && C540120LGg.LJ()) {
                    List listLJIILJJIL = C1697810uHb.LJIILJJIL("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                    int i2 = C540150LGj.LIZ[enumC540140LGi.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                listLJIILJJIL.add("android.permission.READ_MEDIA_VIDEO");
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            listLJIILJJIL.add("android.permission.READ_MEDIA_IMAGES");
                        }
                    } else {
                        listLJIILJJIL.add("android.permission.READ_MEDIA_VIDEO");
                        listLJIILJJIL.add("android.permission.READ_MEDIA_IMAGES");
                    }
                    String[] strArr = (String[]) listLJIILJJIL.toArray(new String[0]);
                    C19514711Wn.LIZIZ.LIZIZ(c19egLIZIZ, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C581140Mqm(awS587S0100000_8, 6));
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
