package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WXD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXD {
    public static C830090WhL LIZ(String str) {
        String str2;
        if (Intrinsics.LJFF(str, "/game/scripts/ttmg-core.js")) {
            try {
                str2 = (String) C23250099c.LJ(C23271099x.INSTANCE, new C09ZX(null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                System.out.println(Unit.LIZ);
                str2 = "";
            }
            if (str2 != null) {
                if (str2.length() != 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str2.getBytes(StandardCharsets.UTF_8));
                    EnumC2273771DzD enumC2273771DzD = EnumC2273771DzD.OK;
                    long length = str2.getBytes(StandardCharsets.UTF_8).length;
                    Pattern pattern = AbstractC830080WhK.LJII;
                    C830090WhL c830090WhL = new C830090WhL(enumC2273771DzD, "application/javascript", byteArrayInputStream, length);
                    c830090WhL.LIZ("Access-Control-Allow-Origin", "*");
                    c830090WhL.LIZ("Access-Control-Allow-Methods", "*");
                    c830090WhL.LIZ("Access-Control-Allow-Headers", "*");
                    c830090WhL.LIZ("Access-Control-Max-Age", "86400");
                    c830090WhL.LIZ("Cache-Control", "no-cache, no-store, must-revalidate");
                    c830090WhL.LIZ("Pragma", "no-cache");
                    c830090WhL.LIZ("Expires", CardStruct.IStatusCode.DEFAULT);
                    return c830090WhL;
                }
            }
        }
        return C0WXC.LIZ(EnumC2273771DzD.NOT_FOUND, "text/plain", "Resource not found");
    }
}
