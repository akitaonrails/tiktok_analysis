package X;

import Y.ACallableS245S0200000_13;
import Y.ACallableS29S0100100_13;
import android.os.CancellationSignal;
import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VLZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VLZ implements InterfaceC611050Nxv {
    public final AbstractC796540VMm LIZ;
    public final C0P49 LIZIZ;
    public final C796160VLa LIZJ = new Object() { // from class: X.0VLa
    };
    public final C854550Xfh LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VLa] */
    public C0VLZ(SkylightUnifiedDB skylightUnifiedDB) {
        this.LIZ = skylightUnifiedDB;
        this.LIZIZ = new C0P49(this, skylightUnifiedDB, 2);
        this.LIZLLL = new C854550Xfh(skylightUnifiedDB, 37);
        new C854550Xfh(skylightUnifiedDB, 38);
    }

    @Override // X.InterfaceC611050Nxv
    public final Object LIZ(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS29S0100100_13(this, j, 1), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC611050Nxv
    public final Object LIZIZ(List<String> list, InterfaceC1364105Vn<? super List<C611170Ny7>> interfaceC1364105Vn) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM skylight_live WHERE uid IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 23), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC611050Nxv
    public final Object LIZJ(List<C611170Ny7> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, list, 22), interfaceC1364105Vn);
    }
}
