package X;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: X.0SID, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SID {
    public static final C0SID LIZ = new C0SID();

    public static C718840SHq LIZ(Context context, String str, List list) {
        if (str != null && str.length() != 0 && list != null && !list.isEmpty()) {
            return new C718840SHq(LIZJ(context, str, list));
        }
        C0SIR[] c0sirArr = new C0SIR[1];
        if (str == null) {
            str = "";
        }
        c0sirArr[0] = C0SIJ.LIZIZ(str);
        return new C718840SHq(C13LQ.LJJLL(c0sirArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C718840SHq LIZIZ(android.content.Context r12, java.lang.String r13, java.util.List r14) {
        /*
            r2 = 0
            r6 = 1
            if (r13 == 0) goto La1
            int r0 = r13.length()
            if (r0 == 0) goto La1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L25
            r3.<init>(r13)     // Catch: org.json.JSONException -> L25
            int r2 = r3.length()     // Catch: org.json.JSONException -> L25
            r1 = 0
        L19:
            if (r1 >= r2) goto L29
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r3, r1)     // Catch: org.json.JSONException -> L25
            r5.add(r0)     // Catch: org.json.JSONException -> L25
            int r1 = r1 + 1
            goto L19
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L29:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r11 = r5.iterator()
            r2 = 0
        L33:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r9 = r11.next()
            int r10 = r2 + 1
            r7 = 0
            if (r2 < 0) goto L97
            java.lang.String r9 = (java.lang.String) r9
            if (r14 == 0) goto L79
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r3 = r14.iterator()
        L4f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.ss.android.ugc.aweme.model.TextExtraStruct r0 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r0
            int r0 = r0.getLineIndex()
            if (r0 != r2) goto L4f
            r8.add(r1)
            goto L4f
        L66:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L79
            X.0SID r0 = X.C0SID.LIZ
            r0.getClass()
            java.util.List r0 = LIZJ(r12, r9, r8)
            r4.addAll(r0)
            goto L80
        L79:
            X.0SIR r0 = X.C0SIJ.LIZIZ(r9)
            r4.add(r0)
        L80:
            int r0 = r5.size()
            int r0 = r0 - r6
            if (r2 >= r0) goto L95
            X.0SIR r3 = new X.0SIR
            X.0SIK r2 = X.C0SIK.WRAP
            r1 = 10
            java.lang.String r0 = "\n"
            r3.<init>(r0, r7, r2, r1)
            r4.add(r3)
        L95:
            r2 = r10
            goto L33
        L97:
            X.C1697810uHb.LJIJI()
            throw r7
        L9b:
            X.0SHq r0 = new X.0SHq
            r0.<init>(r4)
            return r0
        La1:
            X.0SIR[] r1 = new X.C0SIR[r6]
            if (r13 != 0) goto La7
            java.lang.String r13 = ""
        La7:
            X.0SIR r0 = X.C0SIJ.LIZIZ(r13)
            r1[r2] = r0
            java.util.List r1 = X.C13LQ.LJJLL(r1)
            X.0SHq r0 = new X.0SHq
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SID.LIZIZ(android.content.Context, java.lang.String, java.util.List):X.0SHq");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(android.content.Context r19, java.lang.String r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SID.LIZJ(android.content.Context, java.lang.String, java.util.List):java.util.List");
    }
}
