package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423570n9H {
    public static final boolean LIZJ(TemplateCategoryData templateCategoryData) {
        String str;
        if (templateCategoryData != null) {
            str = templateCategoryData.key;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "my_favorite");
    }

    public static final void LIZIZ(C1423440n94 c1423440n94, int i, int i2, TemplateCategoryData templateCategoryData, C1423690n9T c1423690n9T, Object obj) {
        EnumC1423060n8S enumC1423060n8S;
        if (obj == null) {
            if (c1423690n9T.LIZJ) {
                enumC1423060n8S = EnumC1423060n8S.LOAD_MORE_TEMPLATES_ERROR;
            } else if (c1423690n9T.LIZIZ) {
                enumC1423060n8S = EnumC1423060n8S.REFRESH_TEMPLATES_ERROR;
            } else {
                enumC1423060n8S = EnumC1423060n8S.FETCH_TEMPLATE_ERROR;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchTemplateTabFavoriteDataList error, cursor = ");
            sbLIZ.append(i);
            sbLIZ.append(", count = ");
            sbLIZ.append(i2);
            c1423440n94.LIZ(new C1422880n8A(enumC1423060n8S, 10002, C2188811AlT.LIZIZ(sbLIZ), templateCategoryData, c1423690n9T.LIZ, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C1423810n9f r12, com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r13, X.C1423690n9T r14, int r15, int r16, X.C1423440n94 r17, X.C1423680n9S r18, X.InterfaceC1364105Vn r19) {
        /*
            r3 = r19
            r9 = r13
            r7 = r14
            r8 = r17
            r10 = r15
            r11 = r16
            boolean r0 = r3 instanceof X.C1423620n9M
            if (r0 == 0) goto L71
            r4 = r3
            X.0n9M r4 = (X.C1423620n9M) r4
            int r2 = r4.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r4.LLIZ = r2
        L1b:
            java.lang.Object r6 = r4.LLILZLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLIZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L31
            if (r2 == r0) goto L49
            if (r2 != r1) goto L77
            X.C155000ia.LIZIZ(r6)
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r6)
            r4.LL = r9
            r4.LLILLJJLI = r7
            r4.LLILLL = r8
            r4.LLILZ = r10
            r4.LLILZIL = r11
            r4.LLIZ = r0
            r0 = r18
            java.lang.Object r6 = r12.LIZIZ(r10, r11, r0, r4)
            if (r6 != r3) goto L56
            return r3
        L49:
            int r11 = r4.LLILZIL
            int r10 = r4.LLILZ
            X.0n94 r8 = r4.LLILLL
            X.0n9T r7 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r9 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L56:
            X.0n9N r6 = (X.C1423630n9N) r6
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0n9E r5 = new X.0n9E
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.LL = r12
            r4.LLILLJJLI = r12
            r4.LLILLL = r12
            r4.LLIZ = r1
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)
            if (r0 != r3) goto L2e
            return r3
        L71:
            X.0n9M r4 = new X.0n9M
            r4.<init>(r3)
            goto L1b
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423570n9H.LIZ(X.0n9f, com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData, X.0n9T, int, int, X.0n94, X.0n9S, X.05Vn):java.lang.Object");
    }
}
