package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0LEI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LEI {
    public static final boolean LIZJ(AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct == null) {
            return false;
        }
        List<String> listLIZ = LIZ(anchorCommonStruct, "tt_template_type", "dispatch_type");
        if (listLIZ.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                return true;
            }
        }
        return false;
    }

    public static final List<String> LIZ(AnchorCommonStruct anchorCommonStruct, String... strArr) {
        String extra;
        if (anchorCommonStruct != null) {
            extra = anchorCommonStruct.getExtra();
        } else {
            extra = null;
        }
        return LIZIZ(extra, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> LIZIZ(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = 0
            if (r7 == 0) goto L1b
            int r0 = r7.length()
            if (r0 == 0) goto L1b
            r0 = 0
        La:
            r5 = 0
            if (r0 == 0) goto L1e
            int r1 = r8.length
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
        L13:
            if (r6 >= r1) goto L1d
            r0.add(r5)
            int r6 = r6 + 1
            goto L13
        L1b:
            r0 = 1
            goto La
        L1d:
            return r0
        L1e:
            com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Exception -> L56
            r0.<init>()     // Catch: java.lang.Exception -> L56
            com.google.gson.k r0 = com.google.gson.p.LIZJ(r7)     // Catch: java.lang.Exception -> L56
            com.google.gson.n r7 = r0.LJIILIIL()     // Catch: java.lang.Exception -> L56
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L56
            int r0 = r8.length     // Catch: java.lang.Exception -> L56
            r4.<init>(r0)     // Catch: java.lang.Exception -> L56
            int r3 = r8.length     // Catch: java.lang.Exception -> L56
            r2 = 0
        L33:
            if (r2 >= r3) goto L68
            r0 = r8[r2]     // Catch: java.lang.Exception -> L56
            com.google.gson.k r1 = r7.LJJIIZ(r0)     // Catch: java.lang.Exception -> L4b
            if (r1 == 0) goto L4f
            boolean r0 = r1 instanceof com.google.gson.m     // Catch: java.lang.Exception -> L4b
            r0 = r0 ^ 1
            if (r0 != 0) goto L44
            r1 = r5
        L44:
            if (r1 == 0) goto L4f
            java.lang.String r0 = r1.LJIL()     // Catch: java.lang.Exception -> L4b
            goto L50
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L56
        L4f:
            r0 = r5
        L50:
            r4.add(r0)     // Catch: java.lang.Exception -> L56
            int r2 = r2 + 1
            goto L33
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int r0 = r8.length
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L60:
            if (r6 >= r0) goto L68
            r4.add(r5)
            int r6 = r6 + 1
            goto L60
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LEI.LIZIZ(java.lang.String, java.lang.String[]):java.util.List");
    }
}
