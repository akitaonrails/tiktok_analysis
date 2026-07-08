package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00d3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C120700d3 {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(long j, Context context) {
        List listLJJLIIIJILLIZJL;
        if (context == null) {
            return new Pair(999L, 999L);
        }
        IHybridStorageService iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("custom_text_gift_params_");
        sbLIZ.append(j);
        String str = (String) iHybridStorageService.Pp2(context, C2188811AlT.LIZIZ(sbLIZ), null);
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
                if (lLJIILIIL != null) {
                    arrayList.add(lLJIILIIL);
                }
            }
            if (arrayList.size() == 2) {
                return new Pair(ListProtector.get(arrayList, 0), ListProtector.get(arrayList, 1));
            }
        }
        return new Pair(999L, 999L);
    }
}
