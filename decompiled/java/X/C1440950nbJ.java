package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0nbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440950nbJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        String creationId = videoPublishEditModel.getCreationId();
        byte[] bArr = new byte[2];
        new SecureRandom().nextBytes(bArr);
        Pair pairLIZIZ = LIZIZ(str, creationId, Base64.encodeToString(bArr, 2));
        videoPublishEditModel.creativeModel.publishSecureModel.coverSecureSalt = (String) pairLIZIZ.getSecond();
        videoPublishEditModel.creativeModel.publishSecureModel.coverMD5 = (String) pairLIZIZ.getFirst();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saved, md5:");
        sbLIZ.append((String) pairLIZIZ.getFirst());
        sbLIZ.append(", salt: ");
        sbLIZ.append((String) pairLIZIZ.getSecond());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Pair LIZIZ(String str, String str2, String str3) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_protect_text_cover", true, true) && str != null) {
            try {
                byte[] bArrLIZIZ = C2106208My.LIZIZ(new C0VSP(new C0VSJ(str)));
                Charset charset = Charsets.UTF_8;
                return new Pair(C08F1.LIZJ(C13DL.LJII(C13DL.LJII(C13DL.LJII(bArrLIZIZ, str3.getBytes(charset)), str2.getBytes(charset)), "k3lAS8dMIhP:2FdQ#T".getBytes(charset))), str3);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return new Pair("", "");
            }
        }
        return new Pair("", "");
    }

    public static boolean LIZ(String str, String str2, String str3, String str4) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_protect_text_cover", true, true) || ((str.length() == 0 && str2.length() == 0) || Intrinsics.LJFF(LIZIZ(str4, str3, str2).getFirst(), str))) {
            return true;
        }
        return false;
    }
}
