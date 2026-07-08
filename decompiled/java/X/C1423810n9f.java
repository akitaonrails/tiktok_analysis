package X;

import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.FetchTemplateFavoriteListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0n9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423810n9f {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(514));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(512));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(513));

    public static final C1423630n9N LIZJ(Function2<? super Integer, ? super Asset, C1419590n2r> function2, FetchTemplateFavoriteListResponse.ResponseData responseData) {
        if (responseData == null) {
            return null;
        }
        List list = responseData.asset_list;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        List list2 = responseData.filtered_asset_list;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(function2.invoke(Integer.valueOf(i), obj));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List listLJJJJLI = C13LP.LJJJJLI(arrayList);
        C1422890n8B c1422890n8B = new C1422890n8B(responseData.has_more, (String) null, false, false, false, list2, (Integer) null, 156);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchTemplateTabFavoriteListInternal: success! templateListSize = ");
        sbLIZ.append(((ArrayList) listLJJJJLI).size());
        sbLIZ.append(", filteredSize = ");
        sbLIZ.append(list2.size());
        sbLIZ.append(", hasMore = ");
        sbLIZ.append(responseData.has_more);
        sbLIZ.append(", nextCursor = ");
        sbLIZ.append(responseData.cursor);
        C201955140j.LIZLLL(c1398350mUb, "TemplateFavoriteService", C2188811AlT.LIZIZ(sbLIZ));
        return new C1423630n9N(EnumC1423670n9R.SUCCESS, listLJJJJLI, c1422890n8B, (int) responseData.cursor, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r11, boolean r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423810n9f.LIZ(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r20, int r21, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.ss.android.ugc.effectmanager.effect.model.Asset, X.C1419590n2r> r22, X.InterfaceC1364105Vn<? super X.C1423630n9N> r23) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423810n9f.LIZIZ(int, int, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
