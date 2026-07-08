package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.1B3I, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3I {
    public static final C1B3I LIZ = new C1B3I();
    public static final C1B39 LIZIZ = (C1B39) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ).build().retrofit.LIZ(C1B39.class);
    public static final C1B39 LIZJ;

    static {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LJIIIZ = 1;
        LIZJ = (C1B39) c1499850p8JCreateBuilder.build().retrofit.LIZ(C1B39.class);
    }

    public static String LIZIZ(String str) {
        String strLIZIZ = "";
        for (byte b : MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:30:0x0095, B:32:0x009b, B:37:0x00a6, B:39:0x00aa, B:44:0x00b5, B:46:0x00b9, B:47:0x00bd, B:55:0x00d8, B:50:0x00cc, B:52:0x00d0, B:27:0x0084, B:64:0x0107, B:79:0x0137), top: B:138:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017c A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:86:0x016b, B:88:0x0171, B:93:0x017c, B:95:0x0180, B:100:0x018b, B:102:0x018f, B:103:0x0193, B:111:0x01ae, B:106:0x01a2, B:108:0x01a6), top: B:132:0x016b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r36, X.C1B3S r37, X.C1B3J r38, boolean r39, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse> r40) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B3I.LIZ(android.content.Context, X.1B3S, X.1B3J, boolean, X.05Vn):java.lang.Object");
    }
}
