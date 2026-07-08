package X;

import Y.ARunnableS74S0200000_5;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FLL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FLL extends AbstractC388220FKa implements C0FLA {
    public final C388200FJy LIZIZ;
    public final C01GW LIZJ;
    public C0FLM LIZLLL;
    public View LJ;
    public final C01GW LJFF;

    @Override // X.AbstractC388220FKa
    public final void LJIIIIZZ(C0FL4 c0fl4) {
    }

    @Override // X.C0FLA
    public final Integer LIZ() {
        return Integer.valueOf(((Boolean) C282940B7c.LIZ.getValue()).booleanValue() ? R.raw.icon_ai_text : R.raw.icon_ai_stars);
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        C0FLM c0flm = this.LIZLLL;
        if (c0flm != null) {
            c0flm.LLILLL.LLJI = false;
        }
    }

    @Override // X.C0FLA
    public final Integer LIZJ() {
        C0FKH c0fkh = this.LIZIZ.LJJ;
        return (c0fkh == null || c0fkh.LJIILIIL() == 0) ? Integer.valueOf(C0FLN.LIZIZ()) : Integer.valueOf(C0FLN.LIZ());
    }

    @Override // X.C0FLA
    public final void LJFF() {
        C0FKH c0fkh = this.LIZIZ.LJJ;
        if (c0fkh != null) {
            c0fkh.LJII();
        }
        this.LIZIZ.LJIIL.LIZJ.invoke(EnumC1409650mmp.TEXT_STICKER);
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        Integer numLIZJ = LIZJ();
        C0FLM c0flm = this.LIZLLL;
        if (c0flm != null) {
            c0flm.setText(numLIZJ);
        }
        C0FLM c0flm2 = this.LIZLLL;
        if (c0flm2 != null) {
            int visibility = c0flm2.getVisibility();
            c0flm2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0flm2);
        }
        C0FLM c0flm3 = this.LIZLLL;
        if (c0flm3 != null) {
            boolean z = ((Boolean) C282940B7c.LIZ.getValue()).booleanValue() && !((Keva) this.LJFF.getValue()).getBoolean("inspiration_shimmer_shown", false);
            c0flm3.LLILLL.LLJI = z;
            if (z) {
                HandlerHook.viewPostDelay(c0flm3, new ARunnableS74S0200000_5(c0flm3, this, 56), 1000L);
            }
            View view = this.LJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        C0FKH c0fkh = this.LIZIZ.LJJ;
        if (c0fkh != null) {
            c0fkh.LJIIL();
        }
    }

    public C0FLL(C388200FJy c388200FJy) {
        super(c388200FJy);
        this.LIZIZ = c388200FJy;
        this.LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1597));
        this.LJFF = C452501pT.LIZ(EnumC452301pR.NONE, AFwS191S0000000_5.get$arr$(402));
    }

    @Override // X.C0FLA
    public final void LIZLLL(C0FLM c0flm) {
        this.LIZLLL = c0flm;
    }

    @Override // X.C0FLA
    public final void LJ(View view) {
        this.LJ = view;
    }
}
