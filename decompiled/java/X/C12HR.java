package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12HR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HR {
    public static final Keva LJ = Keva.getRepo("ulike_repo");
    public final BeautyFilterConfig LIZ;
    public final Gson LIZIZ;
    public final C12HU<C787110UuD> LIZJ = new C12HU<>();
    public EnumC19731112Ht LIZLLL = EnumC19731112Ht.FEMALE;

    public final synchronized void LIZJ() {
        this.LIZJ.clear();
        List<C787110UuD> listLIZIZ = LIZIZ();
        if (listLIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init sequence: ");
            sbLIZ.append(listLIZIZ);
            C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.addAll(C13LP.LJJJJLI(listLIZIZ));
        }
    }

    public final List<C787110UuD> LIZIZ() {
        String string = LJ.getString(LIZ(), null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get sequence: ");
        sbLIZ.append(string);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        try {
            return (List) this.LIZIZ.LJIIIIZZ(string, new TypeToken<List<C787110UuD>>() { // from class: X.12HX
            }.getType());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void LIZLLL() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                arrayList.addAll(this.LIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        String json = GsonProtectorUtils.toJson(this.LIZIZ, arrayList);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save sequence:");
        sbLIZ.append(json);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJ.storeString(LIZ(), json);
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.sequenceKey);
        sbLIZ.append(this.LIZLLL.getFlag());
        sbLIZ.append("_key_beauty_sequence");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12HR(BeautyFilterConfig beautyFilterConfig, Gson gson) {
        this.LIZ = beautyFilterConfig;
        this.LIZIZ = gson;
        LIZJ();
    }
}
