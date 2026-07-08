package X;

import android.text.Editable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0FKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388380FKq extends C0FKX implements C0FLA {
    public final C388200FJy LIZIZ;
    public final C01GW LIZJ;
    public C0FLM LIZLLL;
    public View LJ;
    public C0FL4 LJFF;
    public boolean LJI;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        this.LJFF = null;
    }

    @Override // X.C0FLA
    public final void LJFF() {
        Editable editableLLJJIII;
        this.LJI = true;
        C21410318qb c21410318qb = this.LJFF;
        if ((c21410318qb != null || (c21410318qb = (C21410318qb) this.LIZJ.getValue()) != null) && (editableLLJJIII = C2204961BRm.LLJJIII(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zeC0wG5p0xguY6CdN4BU06lTdRZg==", null))) != null) {
            editableLLJJIII.insert(c21410318qb.getSelectionStart(), e3.g);
        }
        C0FKH c0fkh = this.LIZIZ.LJJ;
        if (c0fkh != null) {
            c0fkh.LJFF();
        }
    }

    @Override // X.C0FKX
    public final void LJIIIZ() {
        this.LJI = false;
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        C0FKH c0fkh;
        C0FLM c0flm = this.LIZLLL;
        if (c0flm != null) {
            int visibility = c0flm.getVisibility();
            c0flm.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0flm);
        }
        View view = this.LJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C388200FJy c388200FJy = this.LIZIZ;
        if (c388200FJy.LJIL || c388200FJy.LJIJJLI || (c0fkh = c388200FJy.LJJ) == null) {
            return;
        }
        c0fkh.LJIIIIZZ();
    }

    @Override // X.C0FLA
    public final Integer LIZ() {
        return Integer.valueOf(R.raw.icon_at);
    }

    @Override // X.C0FLA
    public final Integer LIZJ() {
        return 2131829855;
    }

    @Override // X.C0FKX
    public final boolean LJIIIIZZ() {
        return this.LJI;
    }

    public C388380FKq(C388200FJy c388200FJy) {
        super(c388200FJy);
        this.LIZIZ = c388200FJy;
        this.LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1598));
    }

    @Override // X.C0FLA
    public final void LIZLLL(C0FLM c0flm) {
        this.LIZLLL = c0flm;
    }

    @Override // X.C0FLA
    public final void LJ(View view) {
        this.LJ = view;
    }

    @Override // X.C0FKX
    public final void LJIIJ(C0FL4 c0fl4) {
        this.LJFF = c0fl4;
    }
}
