package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0SR6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SR6 {
    public final ArrayList<Aweme> LIZ = new ArrayList<>();

    public void LIZ() {
        this.LIZ.clear();
    }

    public int LIZJ() {
        return this.LIZ.size();
    }

    public List<Aweme> LJ() {
        return this.LIZ;
    }

    public Aweme LIZIZ(int i) {
        if (i >= 0 && i < LIZJ()) {
            return (Aweme) ListProtector.remove(this.LIZ, i);
        }
        return null;
    }

    public Aweme LIZLLL(int i) {
        if (i >= 0) {
            try {
                if (i < LIZJ()) {
                    return this.LIZ.get(i);
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public void LJI(List<? extends Aweme> list) {
        List listLJJJJLI;
        this.LIZ.clear();
        if (list != null) {
            listLJJJJLI = C13LP.LJJJJLI(list);
        } else {
            listLJJJJLI = null;
        }
        AnonymousClass0885.LIZ(this.LIZ, listLJJJJLI);
    }

    public void LJFF(int i, Aweme aweme) {
        ListProtector.add(this.LIZ, i, aweme);
    }

    public void LJII(int i, Aweme aweme) {
        ListProtector.set(this.LIZ, i, aweme);
    }
}
