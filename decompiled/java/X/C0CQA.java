package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.journey.intention.IntentionStruct;
import com.ss.android.ugc.aweme.journey.intention.NUIntentionRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0CQA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQA {
    public static final List<IntentionStruct> LIZ = new ArrayList(C13BV.INSTANCE);
    public static C0CQB LIZIZ;

    public static List LIZ() {
        return C13LQ.LJJLL(Keva.getRepo("new_user_intention").getStringArray("intention_list", new String[0]));
    }

    public static void LIZJ() {
        if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
            return;
        }
        ArrayList arrayList = (ArrayList) LIZ;
        if (!arrayList.isEmpty()) {
            List listLLIIII = C13LP.LLIIII(arrayList);
            C0CQ9.LIZ.getClass();
            C0CQ8.LIZIZ.LIZ(new NUIntentionRequest(listLLIIII)).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLJ();
            arrayList.clear();
            LIZIZ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0CQB, X.1Bg8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CQA.LIZIZ(java.lang.String, java.lang.String):void");
    }
}
