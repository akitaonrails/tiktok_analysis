package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.FilteredAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k5a.j;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423350n8v extends j<TemplateCategoryData, C1419590n2r, C1422880n8A, C1422890n8B, Object> {
    public final Map<String, FilteredAsset> LJFF = new LinkedHashMap();
    public final List<Pair<C1419590n2r, Boolean>> LJI = new ArrayList();
    public boolean LJII;

    @Override // k5a.j, X.InterfaceC1423310n8r
    public final void Pv(Object obj, List list) {
        String str;
        if (C289620BWu.LIZ()) {
            if (list == null) {
                this.LJII = true;
            } else if (this.LJII) {
                TemplateCategoryData templateCategoryDataY8 = Y8();
                if (templateCategoryDataY8 != null) {
                    str = templateCategoryDataY8.key;
                } else {
                    str = null;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((TemplateCategoryData) it2.next()).key, str)) {
                        return;
                    }
                }
            }
        }
        super.Pv(obj, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    @Override // k5a.j, X.InterfaceC1423310n8r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nv(java.lang.Object r2, java.lang.Object r3, java.util.List r4) {
        /*
            r1 = this;
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r2 = (com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData) r2
            boolean r0 = X.C1423570n9H.LIZJ(r2)
            if (r0 == 0) goto L17
            boolean r0 = X.C19719512Dh.LJI(r4)
            if (r0 == 0) goto L11
            r0 = r4
            if (r4 != 0) goto L16
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
        L16:
            r4 = r0
        L17:
            super.Nv(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423350n8v.Nv(java.lang.Object, java.lang.Object, java.util.List):void");
    }
}
