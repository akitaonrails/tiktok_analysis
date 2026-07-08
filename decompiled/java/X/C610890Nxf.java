package X;

import com.ss.android.ugc.aweme.dc.core.ListIndexSnapshot;
import com.ss.android.ugc.aweme.dc.core.SnapshotEntry;
import com.ss.android.ugc.aweme.dc.core.SnapshotMeta;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [VO] */
/* JADX INFO: renamed from: X.0Nxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610890Nxf<VO> implements InterfaceC1455405mq<VO> {
    public int LIZ;
    public final /* synthetic */ List<SnapshotEntry> LIZIZ;
    public final /* synthetic */ ListIndexSnapshot LIZJ;
    public final /* synthetic */ C610900Nxg LIZLLL;

    @Override // X.InterfaceC1455405mq
    public final int LIZJ() {
        return this.LIZIZ.size();
    }

    @Override // X.InterfaceC1455405mq
    public final SnapshotMeta getMeta() {
        return this.LIZJ.meta;
    }

    @Override // X.InterfaceC1455405mq
    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Unit unitOnStop = this.LIZLLL.LIZ.LIZIZ().onStop();
        if (unitOnStop == C099R.LJFF()) {
            return unitOnStop;
        }
        return Unit.LIZ;
    }

    public C610890Nxf(List<SnapshotEntry> list, ListIndexSnapshot listIndexSnapshot, C610900Nxg c610900Nxg) {
        this.LIZIZ = list;
        this.LIZJ = listIndexSnapshot;
        this.LIZLLL = c610900Nxg;
    }

    /* JADX WARN: Path cross not found for [B:172:0x01f8, B:178:0x0176], limit reached: 204 */
    /* JADX WARN: Path cross not found for [B:178:0x0176, B:172:0x01f8], limit reached: 204 */
    /* JADX WARN: Path cross not found for [B:182:0x0331, B:198:0x0289], limit reached: 204 */
    /* JADX WARN: Path cross not found for [B:198:0x0289, B:182:0x0331], limit reached: 204 */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x045b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0331 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0344 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0164 A[EXC_TOP_SPLITTER, PHI: r2 r3 r6 r8 r9 r13 r14 r15 r17 r18 r19 r21 r22
      0x0164: PHI (r2v3 X.00w2) = (r2v1 X.00w2), (r2v4 X.00w2) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r3v4 long) = (r3v2 long), (r3v5 long) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r6v3 long) = (r6v1 long), (r6v4 long) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r8v2 X.00cf) = (r8v0 X.00cf), (r8v3 X.00cf) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r9v2 X.0Nxg) = (r9v0 X.0Nxg), (r9v3 X.0Nxg) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r13v2 java.util.LinkedHashMap) = (r13v0 java.util.LinkedHashMap), (r13v3 java.util.LinkedHashMap) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r14v2 java.util.HashMap) = (r14v0 java.util.HashMap), (r14v3 java.util.HashMap) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r15v2 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>) = 
      (r15v0 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>)
      (r15v3 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>)
     binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r17v2 X.00cf) = (r17v0 X.00cf), (r17v3 X.00cf) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r18v2 X.013C) = (r18v0 X.013C), (r18v3 X.013C) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r19v2 java.util.List<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>) = 
      (r19v0 java.util.List<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>)
      (r19v3 java.util.List<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>)
     binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r21v2 X.00w2) = (r21v0 X.00w2), (r21v3 X.00w2) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r22v2 int) = (r22v0 int), (r22v3 int) binds: [B:33:0x0150, B:38:0x017a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0197 A[EXC_TOP_SPLITTER, PHI: r2 r3 r6 r8 r9 r10 r13 r14 r15 r16 r17 r18 r19 r20 r21 r22
      0x0197: PHI (r2v2 X.00w2) = (r2v4 X.00w2), (r2v7 X.00w2) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r3v3 long) = (r3v5 long), (r3v8 long) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r6v2 long) = (r6v4 long), (r6v7 long) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r8v1 X.00cf) = (r8v3 X.00cf), (r8v6 X.00cf) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r9v1 X.0Nxg) = (r9v3 X.0Nxg), (r9v6 X.0Nxg) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r10v0 com.ss.android.ugc.aweme.dc.core.PORef) = (r10v3 com.ss.android.ugc.aweme.dc.core.PORef), (r10v6 com.ss.android.ugc.aweme.dc.core.PORef) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r13v1 java.util.LinkedHashMap) = (r13v3 java.util.LinkedHashMap), (r13v6 java.util.LinkedHashMap) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r14v1 java.util.HashMap) = (r14v3 java.util.HashMap), (r14v6 java.util.HashMap) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r15v1 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>) = 
      (r15v3 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>)
      (r15v6 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>)
     binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r16v0 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.PORef>) = 
      (r16v2 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.PORef>)
      (r16v5 java.util.Iterator<com.ss.android.ugc.aweme.dc.core.PORef>)
     binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r17v1 X.00cf) = (r17v3 X.00cf), (r17v6 X.00cf) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r18v1 X.013C) = (r18v3 X.013C), (r18v6 X.013C) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r19v1 java.util.List<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>) = 
      (r19v3 java.util.List<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>)
      (r19v6 java.util.List<com.ss.android.ugc.aweme.dc.core.SnapshotEntry>)
     binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r20v0 java.util.Iterator<? extends X.0NxF<?>>) = (r20v1 java.util.Iterator<? extends X.0NxF<?>>), (r20v2 java.util.Iterator<? extends X.0NxF<?>>) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r21v1 X.00w2) = (r21v3 X.00w2), (r21v6 X.00w2) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r22v1 int) = (r22v3 int), (r22v6 int) binds: [B:46:0x0193, B:57:0x01e7] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016a A[Catch: all -> 0x0352, TRY_LEAVE, TryCatch #19 {all -> 0x0352, blocks: (B:34:0x0164, B:36:0x016a, B:91:0x022e), top: B:208:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c A[Catch: all -> 0x022b, TRY_LEAVE, TryCatch #4 {all -> 0x022b, blocks: (B:37:0x0176, B:39:0x017c), top: B:178:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019d A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #26 {all -> 0x021f, blocks: (B:47:0x0197, B:49:0x019d), top: B:222:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022e A[Catch: all -> 0x0352, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x0352, blocks: (B:34:0x0164, B:36:0x016a, B:91:0x022e), top: B:208:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028f A[Catch: all -> 0x034c, TRY_LEAVE, TryCatch #14 {all -> 0x034c, blocks: (B:96:0x0289, B:98:0x028f), top: B:198:0x0289 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x031f -> B:184:0x0323). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x032e -> B:118:0x032f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x016a -> B:178:0x0176). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x018a -> B:64:0x01f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01dd -> B:200:0x01e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ea -> B:220:0x01eb). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC1455405mq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r45, int r46, X.InterfaceC1364105Vn<? super java.util.List<? extends VO>> r47) {
        /*
            Method dump skipped, instruction units count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610890Nxf.LIZ(int, int, X.05Vn):java.lang.Object");
    }
}
