package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0KhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524290KhH {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.scene.Scene r10, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C524290KhH.LIZ(com.bytedance.scene.Scene, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String, boolean):void");
    }

    public static void LIZIZ(final C19A3 c19a3, final ShortVideoContext shortVideoContext, final String str, final boolean z) {
        if (C0CIU.LIZJ()) {
            LIZ(c19a3, shortVideoContext, str, z);
            return;
        }
        C523800KgU c523800KgU = new C523800KgU();
        c523800KgU.LIZ = "bpea-tools_request_storage_permission_manual_click_upload_target34";
        c523800KgU.LIZIZ = "bpea-tools_request_storage_permission_manual_click_upload_target33";
        c523800KgU.LIZJ = "bpea-tools_request_storage_permission_manual_click_upload";
        C540290LGx.LJ(C540290LGx.LIZ, (C19EG) c19a3.requireActivity(), shortVideoContext, new C0LH5() { // from class: X.0KhI
            @Override // X.C0LH5
            public final void LIZ(int[] iArr, String[] strArr) {
                Integer numValueOf;
                RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
                if (recordPageOptionalConfig != null) {
                    numValueOf = Integer.valueOf(recordPageOptionalConfig.exteriorRecordPageType);
                } else {
                    numValueOf = null;
                }
                C539630LEj.LIZIZ(numValueOf, C0L9X.SUCCESS);
                C524290KhH.LIZ(c19a3, shortVideoContext, str, z);
            }
        }, null, new AwS552S0100000_8(shortVideoContext, 1102), new AwS552S0100000_8(shortVideoContext, 1103), null, null, false, false, false, false, false, null, null, c523800KgU.LIZ().LIZ(), false, 94152);
    }
}
