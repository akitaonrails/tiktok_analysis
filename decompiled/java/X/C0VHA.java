package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: renamed from: X.0VHA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VHA {
    public final Context LIZ;
    public final C0VHB LIZIZ;
    public final InterfaceC787600Uv0 LIZJ;
    public final C0VHM LIZLLL;
    public final WorkDatabase LJ;
    public final String LJFF;
    public List<C0VHP> LJI;
    public C0VHE LJII = new C0VHE();

    public C0VHA(Context context, C0VHM c0vhm, InterfaceC787600Uv0 interfaceC787600Uv0, C0VHB c0vhb, WorkDatabase workDatabase, String str) {
        this.LIZ = C786410Ut5.N3(context);
        this.LIZJ = interfaceC787600Uv0;
        this.LIZIZ = c0vhb;
        this.LIZLLL = c0vhm;
        this.LJ = workDatabase;
        this.LJFF = str;
    }
}
