package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS125S1200000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606480NqY implements InterfaceC606850Nr9 {
    public static final C0S4J LIZIZ = new C0S4J("datalayer");
    public final String LIZ;

    @Override // X.InterfaceC606850Nr9
    public final void LIZ(List<? extends Aweme> list) {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJFF() {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJIIJ(List<? extends Aweme> list) {
    }

    public C606480NqY(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJII(Map map) {
        ArrayList arrayList = new ArrayList(((HashMap) map).values());
        LJ(1, 0, null, arrayList);
        LIZIZ.LJIIJJI(new C020Q(arrayList, 10));
    }

    @Override // X.InterfaceC606850Nr9
    public final void LIZIZ(int i, String str, List list) {
        LJ(0, i, str, list);
        LIZIZ.LJIIJJI(new C020O(i, (int) str, (String) list, (List<? extends Aweme>) 0));
    }

    @Override // X.InterfaceC606850Nr9
    public final void LIZLLL(int i, Aweme aweme, String str) {
        LJ(1, i, str, Collections.singletonList(aweme));
        LIZIZ.LJIIJJI(new C207300r1(i, str, aweme));
    }

    public final void LJI(String str, C606500Nqa c606500Nqa, C606550Nqf c606550Nqf) {
        C20684815ws.LJFF().execute(new RunnableC166600kS("feed_data_change_error", C591500NHw.LIZ(new Pair("enter_from", this.LIZ), new Pair("rule", str), new Pair("diff_type", c606500Nqa.LIZ), new Pair("error_type", Integer.valueOf(c606550Nqf.LIZ)), new Pair("error_msg", c606550Nqf.LIZIZ))));
        LIZIZ.LJII(new AwS125S1200000_9(str, c606500Nqa, c606550Nqf, 19));
    }

    public final void LIZJ(int i, int i2, C606500Nqa c606500Nqa, List list) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "unknown";
                } else {
                    str = "replace";
                }
            } else {
                str = "delete";
            }
        } else {
            str = "insert";
        }
        JSONObject jSONObjectLIZ = C591500NHw.LIZ(new Pair("enter_from", this.LIZ), new Pair("rule", str), new Pair("start_index", Integer.valueOf(i2)), new Pair("count", Integer.valueOf(list.size())), new Pair("diff_type", c606500Nqa.LIZ), new Pair("version", 1));
        Map<String, String> map = c606500Nqa.LIZJ;
        if (map != null) {
            HashMap map2 = (HashMap) map;
            for (String str2 : map2.keySet()) {
                jSONObjectLIZ.putOpt(str2, map2.get(str2));
            }
        }
        C20684815ws.LJFF().execute(new RunnableC166600kS("feed_data_change", jSONObjectLIZ));
    }

    public final void LJ(int i, int i2, String str, List list) {
        String str2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str2 = "unknown";
                } else {
                    str2 = "replace";
                }
            } else {
                str2 = "delete";
            }
        } else {
            str2 = "insert";
        }
        C20684815ws.LJFF().execute(new RunnableC166600kS("feed_data_change", C591500NHw.LIZ(new Pair("enter_from", this.LIZ), new Pair("rule", str2), new Pair("start_index", Integer.valueOf(i2)), new Pair("count", Integer.valueOf(list.size())), new Pair("diff_type", str), new Pair("version", 0))));
        if ((str != null && str.length() == 0) || Intrinsics.LJFF(str, "unknown")) {
            C1AF0.LIZJ("datalayer");
        }
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJIIJJI(int i, int i2, String str, List list, List list2) {
        LJ(2, i, str, list);
        LIZIZ.LJIIJJI(new C207100qz(i, i2, str, list));
    }
}
