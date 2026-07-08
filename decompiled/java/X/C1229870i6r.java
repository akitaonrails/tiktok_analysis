package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0i6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229870i6r {
    public static final C1229870i6r LIZ = new C1229870i6r();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(825));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(826));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC911440ZpG r10, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta>> r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1229870i6r.LIZ(X.0ZpG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.EnumC911440ZpG r6, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1229890i6t
            if (r0 == 0) goto L20
            r4 = r7
            X.0i6t r4 = (X.C1229890i6t) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L59
        L20:
            X.0i6t r4 = new X.0i6t
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            java.lang.String r0 = X.C461720I8s.LIZIZ()     // Catch: java.lang.Exception -> L75
            java.util.List r0 = LIZIZ(r0, r0, r6)     // Catch: java.lang.Exception -> L75
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L75
            r0 = r0 ^ 1
            if (r0 == 0) goto L50
            kotlin.Pair r2 = new kotlin.Pair     // Catch: java.lang.Exception -> L75
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L75
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L75
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L75
            return r2
        L50:
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L75
            java.lang.Object r2 = r5.LIZ(r6, r4)     // Catch: java.lang.Exception -> L75
            if (r2 != r1) goto L5c
            return r1
        L59:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L75
        L5c:
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Exception -> L75
            boolean r0 = X.C866950Xzh.LIZIZ(r2)     // Catch: java.lang.Exception -> L75
            kotlin.Pair r2 = new kotlin.Pair     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L68
            r0 = 1
            goto L69
        L68:
            r0 = 0
        L69:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L75
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L75
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L75
            return r2
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            kotlin.Pair r2 = new kotlin.Pair
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1229870i6r.LIZLLL(X.0ZpG, X.05Vn):java.lang.Object");
    }

    public static final List<GroupPreviewDisplayMeta> LIZIZ(String str, String str2, EnumC911440ZpG enumC911440ZpG) {
        Keva keva;
        List<GroupPreviewDisplayMeta> list;
        try {
            if (enumC911440ZpG == EnumC911440ZpG.ALL_PUBLIC_GROUP) {
                keva = (Keva) LIZJ.getValue();
            } else {
                keva = (Keva) LIZIZ.getValue();
            }
            if (keva == null) {
                return C13BV.INSTANCE;
            }
            Object objLIZJ = C051M.LIZJ(keva.getString(LIZJ(str, str2, enumC911440ZpG), ""), new TypeToken<List<? extends GroupPreviewDisplayMeta>>() { // from class: X.0i6u
            }.getType());
            if (objLIZJ instanceof List) {
                list = (List) objLIZJ;
            } else {
                list = null;
            }
            if (list == null) {
                return C13BV.INSTANCE;
            }
            return list;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public static String LIZJ(String str, String str2, EnumC911440ZpG enumC911440ZpG) {
        if (enumC911440ZpG == EnumC911440ZpG.ALL_PUBLIC_GROUP) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("public_group_list_");
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fan_group_list_");
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
