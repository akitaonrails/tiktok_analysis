package X;

import android.content.Context;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0l6V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344970l6V {
    public static final List<C1344980l6W> LIZ;
    public static final List<C1344980l6W> LIZIZ;
    public static volatile boolean LIZJ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        arrayList.add(new C1344980l6W(R.layout.a26));
        arrayList.add(new C1344980l6W(R.layout.a25));
        arrayList.add(new C1344980l6W(R.layout.a1m));
        arrayList.add(new C1344980l6W(R.layout.a1t));
        ArrayList arrayList2 = new ArrayList();
        LIZIZ = arrayList2;
        arrayList2.add(new C1344980l6W(R.layout.a4o));
    }

    public static void LIZ(C19EG c19eg) {
        if (LIZJ) {
            return;
        }
        Context contextLIZIZ = C1354730lMF.LIZIZ(c19eg);
        List<C1344980l6W> list = LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((C1344980l6W) it2.next()).LIZ));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
        List listLIZIZ = C1356320lOo.LIZIZ(contextLIZIZ, arrayList);
        LIZJ = true;
        C0CNO.LIZ(C15O7.LJI, new AwS551S0100000_7(listLIZIZ, (List<? extends FollowFeed>) 826));
    }
}
