package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FLP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FLP extends C0FLQ implements C0FLA {
    public final C388200FJy LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public C0FLM LJ;
    public View LJFF;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        this.LIZIZ.LJIIJ.LIZLLL(new AwS584S0100000_5(C0FHM.GONE, 1118), true);
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        C0FLM c0flm = this.LJ;
        if (c0flm != null) {
            int visibility = c0flm.getVisibility();
            c0flm.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0flm);
        }
        View view = this.LJFF;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.C0FLA
    public final Integer LIZ() {
        return Integer.valueOf(R.raw.icon_camera_plus);
    }

    @Override // X.C0FLA
    public final Integer LIZJ() {
        return 2131825072;
    }

    @Override // X.C0FLA
    public final void LJFF() {
        C0FGR c0fgrLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextEditBottomAddyoursAbility onClickButton, addYoursListItem : ");
        sbLIZ.append(LJII(C13LE.LIZ(C0FKW.class)));
        C388320FKk.LIZ.d(C2188811AlT.LIZIZ(sbLIZ));
        List list = (List) this.LIZJ.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C0FTJ) it2.next()).getStickerType() == EnumC1466150oFx.ADD_YOURS) {
                    this.LIZIZ.LJIIL.LJIIJ.invoke();
                    return;
                }
            }
        }
        this.LIZIZ.LJIIL.LJIILIIL.invoke();
        C0FKW c0fkw = (C0FKW) LJII(C13LE.LIZ(C0FKW.class));
        if (c0fkw != null) {
            c0fkw.LJIIJJI();
        }
        this.LIZIZ.LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(528), true);
        C0FF8 c0ff8 = (C0FF8) this.LIZLLL.getValue();
        if (c0ff8 == null || (c0fgrLIZJ = c0ff8.LIZJ()) == null) {
            return;
        }
        c0fgrLIZJ.LJJII();
    }

    public C0FLP(final C388200FJy c388200FJy) {
        new C388270FKf(c388200FJy) { // from class: X.0FLQ
        };
        this.LIZIZ = c388200FJy;
        this.LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1574));
        this.LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1575));
    }

    @Override // X.C0FLA
    public final void LIZLLL(C0FLM c0flm) {
        this.LJ = c0flm;
    }

    @Override // X.C0FLA
    public final void LJ(View view) {
        this.LJFF = view;
    }
}
