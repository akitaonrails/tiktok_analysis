package X;

/* JADX INFO: renamed from: X.00o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C188600o0 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void LIZ(X.C926820aE4<T> r5, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r6, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8) {
        /*
            r1 = 1
            if (r6 != 0) goto L7c
            r0 = 1
        L4:
            r4 = 0
            if (r0 != 0) goto L1d
            if (r5 == 0) goto L7a
            T r0 = r5.data
            if (r0 == 0) goto L7a
            if (r6 == 0) goto L7a
            T r0 = r5.data
            java.lang.Object r0 = r6.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L7a
        L1d:
            r3 = 1
        L1e:
            if (r5 == 0) goto L48
            int r0 = r5.statusCode
            if (r0 != 0) goto L3a
            T r0 = r5.data
            if (r0 == 0) goto L3a
            if (r3 == 0) goto L38
            if (r5 == 0) goto L48
            T r0 = r5.data
            if (r0 == 0) goto L38
            if (r7 == 0) goto L37
            T r0 = r5.data
            r7.invoke(r0)
        L37:
            return
        L38:
            if (r5 == 0) goto L48
        L3a:
            com.bytedance.android.live.network.response.RequestError r0 = r5.LJ
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.message
            if (r0 == 0) goto L48
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            goto L71
        L48:
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "change state failed: "
            r1.append(r0)
            if (r5 == 0) goto L5b
            int r0 = r5.statusCode
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L5b:
            r1.append(r4)
            r0 = 32
            r1.append(r0)
            if (r3 != 0) goto L77
            java.lang.String r0 = ", condition not match"
        L67:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
        L71:
            if (r8 == 0) goto L37
            r8.invoke(r2)
            return
        L77:
            java.lang.String r0 = ""
            goto L67
        L7a:
            r3 = 0
            goto L1e
        L7c:
            r0 = 0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188600o0.LIZ(X.0aE4, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }
}
