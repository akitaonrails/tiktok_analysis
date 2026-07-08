package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.gsonopt.GsonOptTypeAdapterFactory;

/* JADX INFO: renamed from: X.09Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2333909Cn {
    public static Gson LIZ(Gson gson) {
        C2334009Co c2334009Co = new C2334009Co(gson);
        gson.getClass();
        e eVar = new e(gson);
        eVar.LIZLLL(new GsonOptTypeAdapterFactory(c2334009Co));
        Gson gsonLIZ = eVar.LIZ();
        c2334009Co.LIZ = gsonLIZ;
        return gsonLIZ;
    }
}
