package X;

import android.app.ApplicationExitInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802650VeB {
    public static boolean LIZ;
    public static final List<ApplicationExitInfo> LIZIZ = new ArrayList();

    public static void LIZ() {
        String[] list;
        C0VSJ c0vsj = new C0VSJ(C802510Vdx.LJFF, "exit_info");
        if (c0vsj.exists() && (list = c0vsj.list()) != null) {
            if (list.length > 50) {
                Arrays.sort(list);
                for (int i = 50; i < list.length; i++) {
                    C08SE.LIZIZ(new C0VSJ(c0vsj, list[i]));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x00ef, TryCatch #9 {all -> 0x00ef, blocks: (B:9:0x0014, B:13:0x001e, B:15:0x002b, B:22:0x0043, B:23:0x0047, B:25:0x004d, B:27:0x005b, B:36:0x007e, B:37:0x0082, B:39:0x008c, B:44:0x00b4, B:54:0x00d6, B:57:0x00eb, B:53:0x00d3, B:18:0x0039, B:20:0x003e, B:45:0x00b7, B:46:0x00bd, B:48:0x00c3, B:51:0x00ce, B:49:0x00c9, B:40:0x0096, B:42:0x00a0, B:55:0x00dd, B:28:0x0062, B:29:0x0068, B:31:0x006e, B:34:0x0079, B:32:0x0074), top: B:86:0x0014, inners: #0, #1, #5, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #9 {all -> 0x00ef, blocks: (B:9:0x0014, B:13:0x001e, B:15:0x002b, B:22:0x0043, B:23:0x0047, B:25:0x004d, B:27:0x005b, B:36:0x007e, B:37:0x0082, B:39:0x008c, B:44:0x00b4, B:54:0x00d6, B:57:0x00eb, B:53:0x00d3, B:18:0x0039, B:20:0x003e, B:45:0x00b7, B:46:0x00bd, B:48:0x00c3, B:51:0x00ce, B:49:0x00c9, B:40:0x0096, B:42:0x00a0, B:55:0x00dd, B:28:0x0062, B:29:0x0068, B:31:0x006e, B:34:0x0079, B:32:0x0074), top: B:86:0x0014, inners: #0, #1, #5, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:45:0x00b7, B:46:0x00bd, B:48:0x00c3, B:51:0x00ce, B:49:0x00c9), top: B:68:0x00b7, outer: #9, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<android.app.ApplicationExitInfo> LIZIZ() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802650VeB.LIZIZ():java.util.List");
    }
}
