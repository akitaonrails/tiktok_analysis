package X;

import com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model.RefSource;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.QuoteBlock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649520Pdm {
    public final LinkedHashMap<String, RefSource> LIZ;
    public final LinkedHashMap<String, QuoteBlock> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C649520Pdm)) {
            return false;
        }
        C649520Pdm c649520Pdm = (C649520Pdm) obj;
        return Intrinsics.LJFF(this.LIZ, c649520Pdm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c649520Pdm.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefSourceInfo(flattenRefSourceMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", flattenQuoteBlockMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C649520Pdm(LinkedHashMap<String, RefSource> linkedHashMap, LinkedHashMap<String, QuoteBlock> linkedHashMap2) {
        this.LIZ = linkedHashMap;
        this.LIZIZ = linkedHashMap2;
    }

    public final List LIZ(String str, List list) {
        LinkedHashMap<String, RefSource> linkedHashMap;
        LinkedHashMap<String, QuoteBlock> linkedHashMap2;
        QuoteBlock quoteBlock;
        List<String> list2;
        int iIndexOf;
        String strValueOf;
        if (list == null || (linkedHashMap = this.LIZ) == null || linkedHashMap.isEmpty() || (linkedHashMap2 = this.LIZIZ) == null || linkedHashMap2.isEmpty() || !C654380Plc.LIZ().optPovReferenceGet || (quoteBlock = (QuoteBlock) C444200HbO.LIZIZ(str, this.LIZIZ)) == null || (list2 = quoteBlock.refList) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            Object objLIZIZ = C444200HbO.LIZIZ(it2.next(), this.LIZ);
            if (objLIZIZ != null && (iIndexOf = list.indexOf(objLIZIZ)) >= 0 && iIndexOf < list.size() && (strValueOf = String.valueOf(iIndexOf + 1)) != null) {
                arrayList.add(strValueOf);
            }
        }
        return arrayList;
    }
}
