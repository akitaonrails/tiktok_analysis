package X;

import com.bytedance.android.livesdkapi.host.IHostSubscription;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0eof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1103270eof {
    public final /* synthetic */ C1103290eoh LIZ;
    public final /* synthetic */ C1103290eoh LIZIZ;
    public boolean LIZJ;

    public final void LIZLLL(int i, String str) {
        this.LIZ.LIZ(i, str);
    }

    public abstract Map<String, List<String>> LJ();

    public final void LJI(String str, Object obj) {
        C1103290eoh.LIZJ(str, obj);
    }

    public AbstractC1103270eof() {
        C1103290eoh c1103290eoh = C1103290eoh.LIZ;
        this.LIZ = c1103290eoh;
        this.LIZIZ = c1103290eoh;
    }

    public final void LJFF() {
        if (!(!LJ().isEmpty()) || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).yj0(new C1103260eoe(this));
    }
}
