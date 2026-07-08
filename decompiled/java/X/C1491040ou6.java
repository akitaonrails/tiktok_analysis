package X;

import android.content.Context;
import android.util.SparseIntArray;
import com.ss.videoarch.liveplayer.VideoLiveManager;

/* JADX INFO: renamed from: X.0ou6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491040ou6 {
    public static final C1491050ou7 LJIIIZ = new Object() { // from class: X.0ou7
    };
    public final Context LIZ;
    public InterfaceC1491060ou8 LIZIZ;
    public VideoLiveManager LIZJ;
    public InterfaceC1484830ok5 LIZLLL;
    public C1700440uLq LJ;
    public C1700450uLr LJFF;
    public InterfaceC1491020ou4 LJI;
    public String LJII;
    public boolean LJIIIIZZ;

    public C1491040ou6(Context context) {
        this.LIZ = context;
        new SparseIntArray();
    }

    public final InterfaceC1484830ok5 LIZ(String str, boolean z) {
        this.LJFF = new C1700450uLr(this.LIZIZ);
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZ = 2;
        c1478410oZj.LIZIZ = true;
        c1478410oZj.LIZJ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createLivePlayer3:");
        sbLIZ.append(z);
        C827750WdZ.LIZJ("TTLivePlayerBuilder", C2188811AlT.LIZIZ(sbLIZ));
        c1478410oZj.LJII = z;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
        this.LIZLLL = interfaceC1484830ok5LIZJ;
        interfaceC1484830ok5LIZJ.LJIIZILJ(this.LJFF);
        this.LIZLLL.LJIILIIL().LJJIFFI(new C1491030ou5(this));
        C1BZJ.LJII(this.LIZLLL);
        return this.LIZLLL;
    }
}
