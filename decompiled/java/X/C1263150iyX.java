package X;

/* JADX INFO: renamed from: X.0iyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263150iyX extends AbstractC1263470iz3 {
    public static final C1263150iyX LIZ = new C1263150iyX();

    public final String toString() {
        return "Append";
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    @Override // X.AbstractC1263470iz3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1263310iyn LIZ(X.C1263310iyn r8, X.C1263310iyn r9) {
        /*
            r7 = this;
            if (r8 == 0) goto L3c
            X.0j02<X.0iwS> r0 = r8.LIZIZ
            if (r0 == 0) goto L3c
            java.util.List r0 = X.C1263100iyS.LIZ(r0)
            if (r0 == 0) goto L3c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L11:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lb6
            X.0j02<X.0iwS> r5 = r9.LIZIZ
            boolean r0 = r5 instanceof X.C1264100j04
            if (r0 != 0) goto Lb5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r4.iterator()
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L26
            r2.add(r0)
            goto L26
        L3c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r8 == 0) goto Lb6
            goto L11
        L44:
            java.util.Set r6 = X.C13LP.LLIIJI(r2)
            java.util.List r0 = X.C1263100iyS.LIZ(r5)
            if (r0 != 0) goto L50
            X.13BV r0 = X.C13BV.INSTANCE
        L50:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L59:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r0 = r0.getUid()
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L59
            r3.add(r1)
            goto L59
        L74:
            java.util.Iterator r2 = r3.iterator()
        L78:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r1 = r0.getMatchedFriendStruct()
            if (r1 == 0) goto L78
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setNewMaF(r0)
            goto L78
        L90:
            r4.addAll(r3)
            boolean r0 = r5 instanceof X.C1265700j2e
            r3 = 0
            if (r0 == 0) goto Laf
            X.0j2e r5 = (X.C1265700j2e) r5
            P r2 = r5.LIZJ
            boolean r0 = r2 instanceof X.C1263190iyb
            if (r0 == 0) goto Laf
            if (r2 == 0) goto Laf
            X.0j2e r1 = new X.0j2e
            r1.<init>(r3, r2, r4)
        La7:
            X.0iyp r0 = r9.LIZ
            X.0iyn r8 = new X.0iyn
            r8.<init>(r0, r1)
            return r8
        Laf:
            X.0j06 r1 = new X.0j06
            r1.<init>(r4)
            goto La7
        Lb5:
            return r8
        Lb6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1263150iyX.LIZ(X.0iyn, X.0iyn):X.0iyn");
    }
}
