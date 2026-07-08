package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08YN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08YN extends C09AY implements Function2<List<? extends String>, String, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08YN(String str) {
        super(2);
        this.LL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.util.List<? extends java.lang.String> r7, java.lang.String r8) {
        /*
            r6 = this;
            java.util.List r7 = (java.util.List) r7
            java.lang.String r1 = r6.LL
            java.lang.String r0 = "vertical_search_product_cover"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L16
            r4 = 0
            r2 = 1
            if (r7 == 0) goto L19
            boolean r0 = r7.isEmpty()
            if (r0 != r2) goto L19
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            java.lang.String r0 = "second_chunk"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = "chunk_product_2"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = "chunk_product_1_pre_images"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L34
            X.C08YO.LIZIZ = r7
            goto L16
        L34:
            java.util.ArrayList<java.lang.String> r0 = X.C08YO.LIZJ
            if (r0 != 0) goto L3f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.C08YO.LIZJ = r0
        L3f:
            java.util.ArrayList<java.lang.Integer> r0 = X.C08YO.LIZLLL
            if (r0 != 0) goto L4a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.C08YO.LIZLLL = r0
        L4a:
            java.lang.String r0 = "chunk_product_1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto Lae
            java.lang.String r0 = "first_chunk"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto Lae
            if (r7 == 0) goto L16
        L5c:
            java.util.Iterator r5 = r7.iterator()
        L60:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "?"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r4, r0)
            java.lang.Object r3 = X.C13LP.LJJJLZIJ(r4, r0)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List<java.lang.String> r0 = X.C08YO.LIZIZ
            if (r0 == 0) goto La7
            java.util.Iterator r2 = r0.iterator()
        L85:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r3 == 0) goto L85
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r0, r3, r4)
            if (r0 == 0) goto L85
            java.util.ArrayList<java.lang.Integer> r1 = X.C08YO.LIZLLL
            if (r1 == 0) goto L85
            int r0 = X.C08YO.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            goto L85
        La7:
            int r0 = X.C08YO.LIZ
            int r0 = r0 + 1
            X.C08YO.LIZ = r0
            goto L60
        Lae:
            if (r7 == 0) goto L16
            java.util.ArrayList<java.lang.String> r0 = X.C08YO.LIZJ
            if (r0 == 0) goto L5c
            r0.addAll(r7)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08YN.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
