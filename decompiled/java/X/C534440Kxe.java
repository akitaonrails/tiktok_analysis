package X;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534440Kxe implements InterfaceC345200Dg6 {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public InterfaceC534560Kxq LIZJ;

    @Override // X.InterfaceC345200Dg6
    public final void LIZIZ(C1DRG c1drg) {
    }

    @Override // X.InterfaceC345200Dg6
    public final String getName() {
        return "download_all_online_video_task";
    }

    public C534440Kxe(Context context, LifecycleOwner lifecycleOwner) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0214 A[Catch: all -> 0x0233, TryCatch #1 {all -> 0x0233, blocks: (B:102:0x020c, B:104:0x0214, B:105:0x021c), top: B:125:0x020c }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0221 A[PHI: r0 r1
      0x0221: PHI (r0v23 ??) = (r0v34 ??), (r0v35 ??) binds: [B:107:0x021f, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r1v4 X.0Kxq) = (r1v3 X.0Kxq), (r1v6 X.0Kxq) binds: [B:107:0x021f, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0235 A[Catch: all -> 0x0244, TRY_ENTER, TryCatch #2 {all -> 0x0244, blocks: (B:97:0x01f8, B:99:0x01fc, B:113:0x0235, B:114:0x0243), top: B:127:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4 A[PHI: r7
      0x00e4: PHI (r7v10 java.lang.String) = (r7v8 java.lang.String), (r7v9 java.lang.String) binds: [B:38:0x00a4, B:50:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fc A[Catch: all -> 0x0244, TryCatch #2 {all -> 0x0244, blocks: (B:97:0x01f8, B:99:0x01fc, B:113:0x0235, B:114:0x0243), top: B:127:0x01f8 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    @Override // X.InterfaceC345200Dg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Intent r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C534440Kxe.LIZ(android.content.Intent, X.05Vn):java.lang.Object");
    }

    public static void LIZLLL(C534490Kxj c534490Kxj, boolean z, DownloadInfo downloadInfo) {
        String str;
        int errorCode;
        Long lValueOf;
        String str2;
        String uid;
        BaseException failedException;
        if (c534490Kxj == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        linkedHashMap.put("loading_status", str);
        linkedHashMap.put("event_page", "upload_page");
        linkedHashMap.put("fragment_id", String.valueOf(c534490Kxj.LIZ));
        if (downloadInfo != null && (failedException = downloadInfo.getFailedException()) != null) {
            errorCode = failedException.getErrorCode();
        } else {
            errorCode = 0;
        }
        linkedHashMap.put("error_code", String.valueOf(errorCode));
        if (downloadInfo != null) {
            lValueOf = Long.valueOf(downloadInfo.getDownloadTime());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("duration", String.valueOf(lValueOf));
        Map<String, String> map = c534490Kxj.LJI;
        if (map == null || (str2 = map.get("fragment_type")) == null) {
            str2 = "";
        }
        linkedHashMap.put("fragment_type", str2);
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || (uid = currentUser.getUid()) == null) {
            uid = "null_user";
        }
        linkedHashMap.put("anchor_id", uid);
        C20684815ws.LJIILLIIL("livesdk_highlight_loading_result", linkedHashMap);
    }

    @Override // X.InterfaceC345200Dg6
    public final Object LIZJ(C1DRG c1drg, Intent intent, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C345230Dg9.LIZIZ(this, intent, interfaceC1364105Vn);
    }
}
