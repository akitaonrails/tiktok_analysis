package X;

import android.util.Size;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;

/* JADX INFO: renamed from: X.09nI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2477409nI {
    public static final /* synthetic */ int LIZ = 0;

    static {
        int iMax;
        int iMax2;
        Size size;
        if (C2477509nJ.LIZ()) {
            int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize();
            if (recordVideoSize != null) {
                iMax = Math.max(720, recordVideoSize[0]);
                iMax2 = Math.max(1280, recordVideoSize[1]);
            } else {
                iMax = 720;
                iMax2 = 1280;
            }
            size = new Size(iMax, iMax2);
        } else {
            size = new Size(720, 1280);
        }
        if (C2477509nJ.LIZ()) {
            size.getWidth();
        } else if (AVSettingsWrapper.getRecordVideoSize() != null) {
            Math.max(720, AVSettingsWrapper.getRecordVideoSize()[0]);
        }
        if (C2477509nJ.LIZ()) {
            size.getHeight();
        } else if (AVSettingsWrapper.getRecordVideoSize() != null) {
            Math.max(1280, AVSettingsWrapper.getRecordVideoSize()[1]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r0 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.photo.PhotoContext LIZ(java.lang.String r11, X.C0LFI r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2477409nI.LIZ(java.lang.String, X.0LFI, int, int):com.ss.android.ugc.aweme.photo.PhotoContext");
    }
}
