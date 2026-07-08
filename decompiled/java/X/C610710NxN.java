package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.dc.core.ListIndexSnapshot;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610710NxN implements InterfaceC610970Nxn {
    public final String LIZ;
    public final Gson LIZIZ;

    public C610710NxN(int i) {
        C1227904rF.LIZ.getClass();
        Gson gsonLIZLLL = C1227904rF.LIZLLL();
        this.LIZ = "vo_list_index";
        this.LIZIZ = gsonLIZLLL;
    }

    @Override // X.InterfaceC610970Nxn
    public final ListIndexSnapshot LIZ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            return null;
        }
        return LIZJ(C786410Ut5.j4("%s_%s", Arrays.copyOf(new Object[]{str, curUserId}, 2)));
    }

    public final ListIndexSnapshot LIZJ(String str) {
        Object c098200Yq;
        Object obj = null;
        String string = Keva.getRepo(this.LIZ).getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            c098200Yq = (ListIndexSnapshot) this.LIZIZ.LJIIIIZZ(string, new TypeToken<ListIndexSnapshot>() { // from class: X.0NxO
            }.getType());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("KevaListIndexStore", "Failed to deserialize ListIndexSnapshot", thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (ListIndexSnapshot) obj;
    }

    @Override // X.InterfaceC610970Nxn
    public final Unit LIZIZ(String str, ListIndexSnapshot listIndexSnapshot) {
        Keva.getRepo(this.LIZ).storeString(C786410Ut5.j4("%s_%s", Arrays.copyOf(new Object[]{str, listIndexSnapshot.meta.userId}, 2)), GsonProtectorUtils.toJson(this.LIZIZ, listIndexSnapshot));
        return Unit.LIZ;
    }
}
