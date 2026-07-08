package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.share.improve.model.ShareH5Channel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0lwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377200lwU {
    public static final /* synthetic */ int LIZ = 0;

    public static ArrayList LIZIZ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        return (ArrayList) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), jSONArray.toString(), new TypeToken<ArrayList<ShareH5Channel>>() { // from class: X.0lwW
        }.getType());
    }

    public static void LIZ(JSONArray jSONArray, C1371600lnS c1371600lnS) {
        Unit unit;
        new C259800zU();
        new ArrayList();
        if (jSONArray != null) {
            ArrayList arrayListLIZIZ = LIZIZ(jSONArray);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLIZIZ, 10));
            Iterator it2 = arrayListLIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ShareH5Channel) it2.next()).platformId);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                InterfaceC1369790lkX interfaceC1369790lkX = C621180OYa.LIZIZ.LJJLIIIJ().get(it3.next());
                if (interfaceC1369790lkX != null) {
                    C621180OYa.LIZIZ.LJJLIIIJILLIZJL(interfaceC1369790lkX, c1371600lnS);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                arrayList2.add(unit);
            }
        }
    }

    public static void LIZLLL(JSONArray jSONArray, C1371600lnS c1371600lnS) {
        final ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            arrayList = LIZIZ(jSONArray);
        }
        if (!arrayList.isEmpty()) {
            c1371600lnS.LJFF(new Comparator<InterfaceC1369790lkX>(arrayList) { // from class: X.0lwV
                public final C01GW LL;

                {
                    this.LL = C452501pT.LIZIZ(new AwS565S0100000_21(arrayList, (List<ShareH5Channel>) 39));
                }

                public static int LIZ(InterfaceC1369790lkX interfaceC1369790lkX, List list) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ShareH5Channel shareH5Channel = (ShareH5Channel) it2.next();
                        if (Intrinsics.LJFF(shareH5Channel.platformId, interfaceC1369790lkX.key())) {
                            return list.indexOf(shareH5Channel);
                        }
                    }
                    return Integer.MAX_VALUE;
                }

                @Override // java.util.Comparator
                public final int compare(InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1369790lkX interfaceC1369790lkX2) {
                    return LIZ(interfaceC1369790lkX, (List) this.LL.getValue()) - LIZ(interfaceC1369790lkX2, (List) this.LL.getValue());
                }
            });
        }
    }

    public static String LIZJ(boolean z, InterfaceC1369790lkX interfaceC1369790lkX, String str) {
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "copy") && !z) {
            return "";
        }
        return str;
    }
}
