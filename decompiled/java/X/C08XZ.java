package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.08XZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08XZ {
    public static boolean LIZ;

    static {
        new ArrayList<String>() { // from class: X.08m9
            {
                add("os_sdk_int");
                add("external_storage");
                add("screen_height");
                add("screen_width");
                add("storage");
                add("memory");
                add("cpu_core");
                add("cpu_freq");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x006c: MOVE (r6 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:16777324), block:B:30:0x006c */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01a1: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:16777633), block:B:103:0x01a1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd A[Catch: IOException -> 0x011c, all -> 0x01a0, LOOP:1: B:59:0x00fb->B:60:0x00fd, LOOP_END, TryCatch #0 {all -> 0x01a0, blocks: (B:58:0x00ef, B:60:0x00fd, B:61:0x0100, B:78:0x012a), top: B:128:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0165 A[LOOP:2: B:96:0x0165->B:98:0x0168, LOOP_START, PHI: r5
      0x0165: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:95:0x0163, B:98:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.0VSF, java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.InputStreamReader] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:120:0x01c3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08XZ.LIZ(android.content.Context):void");
    }
}
