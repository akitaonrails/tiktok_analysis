package X;

import com.bytedance.ies.nle.editor_jni.NLEPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Dk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347660Dk4 extends C347650Dk3 {
    public String LJIJI;
    public String LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public EnumC356060Dxc LJJIFFI;

    public C347660Dk4() {
        super(EnumC355960DxS.BGM);
    }

    public final C347660Dk4 LIZ() {
        C347660Dk4 c347660Dk4 = new C347660Dk4();
        c347660Dk4.LJIJI = this.LJIJI;
        c347660Dk4.LJIJJ = this.LJIJJ;
        c347660Dk4.LJIJJLI = this.LJIJJLI;
        c347660Dk4.LJIL = this.LJIL;
        c347660Dk4.LJJ = this.LJJ;
        c347660Dk4.LJJI = this.LJJI;
        c347660Dk4.LJJIFFI = this.LJJIFFI;
        c347660Dk4.LIZIZ = this.LIZIZ;
        c347660Dk4.LIZJ = this.LIZJ;
        c347660Dk4.LIZLLL = this.LIZLLL;
        c347660Dk4.LJ = this.LJ;
        c347660Dk4.LJFF = this.LJFF;
        c347660Dk4.LJI = this.LJI;
        c347660Dk4.LJII = this.LJII;
        c347660Dk4.LJIIIIZZ = this.LJIIIIZZ;
        c347660Dk4.LJIIIZ = this.LJIIIZ;
        c347660Dk4.LJIIJ = this.LJIIJ;
        c347660Dk4.LJIIJJI = this.LJIIJJI;
        c347660Dk4.LJIIL = this.LJIIL;
        c347660Dk4.LJIILIIL = this.LJIILIIL;
        c347660Dk4.LJIILJJIL = this.LJIILJJIL;
        c347660Dk4.LJIILL = this.LJIILL;
        List<NLEPoint> list = this.LJIILLIIL;
        ArrayList arrayList = null;
        c347660Dk4.LJIILLIIL = list != null ? new ArrayList(list) : null;
        c347660Dk4.LJIIZILJ = this.LJIIZILJ;
        List<C347630Dk1> list2 = this.LJIJ;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C347630Dk1 c347630Dk1 : list2) {
                c347630Dk1.getClass();
                C347630Dk1 c347630Dk12 = new C347630Dk1(c347630Dk1.LIZ);
                c347630Dk12.LIZIZ = c347630Dk1.LIZIZ;
                c347630Dk12.LIZJ = c347630Dk1.LIZJ;
                c347630Dk12.LIZLLL = c347630Dk1.LIZLLL;
                c347630Dk12.LJ = c347630Dk1.LJ;
                c347630Dk12.LJFF = c347630Dk1.LJFF;
                c347630Dk12.LJI = c347630Dk1.LJI;
                arrayList2.add(c347630Dk12);
            }
            arrayList = new ArrayList(arrayList2);
        }
        c347660Dk4.LJIJ = arrayList;
        return c347660Dk4;
    }

    @Override // X.C347650Dk3
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicBgmParams(musicId=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", musicName=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", isLoop=");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append(", mvType=");
        sbLIZ.append(this.LJJIFFI);
        sbLIZ.append(") ");
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
