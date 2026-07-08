package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DDM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DDM {
    public static final int LJIILL = ColorProtector.parseColor("#000000");
    public static final int LJIILLIIL = ColorProtector.parseColor("#CCCCCC");
    public final C19EG LIZ;
    public final C0DD8 LIZIZ;
    public final PdpViewModel LIZJ;
    public C0D3I LIZLLL;
    public final C335660DDw LJ;
    public final C0DE7 LJFF;
    public final C0DE8 LJI;
    public final C0DD5 LJII;
    public final C0DDQ LJIIIIZZ;
    public final C0DDN LJIIIZ;
    public final C0DEW LJIIJ;
    public final C0DE3 LJIIJJI;
    public final C0DEV LJIIL;
    public final C0DGE LJIILIIL;
    public final C0DDO LJIILJJIL;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r15) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DDM.LIZ(int):void");
    }

    public C0DDM(C19EG c19eg, Fragment fragment, C0DD8 c0dd8, PdpViewModel pdpViewModel, C0DGD c0dgd, C0DH8 c0dh8, C0DGC c0dgc) {
        this.LIZ = c19eg;
        this.LIZIZ = c0dd8;
        this.LIZJ = pdpViewModel;
        this.LJ = new C335660DDw(c0dd8, c0dgd, new C0DDP(this));
        this.LJFF = new C0DE7(c0dd8);
        this.LJI = new C0DE8(c0dd8);
        this.LJII = new C0DD5(c19eg, c0dd8.LL, pdpViewModel);
        this.LJIIIIZZ = new C0DDQ(c19eg, c0dd8, pdpViewModel);
        this.LJIIIZ = new C0DDN(c0dd8);
        this.LJIIJ = new C0DEW(fragment, c0dd8, pdpViewModel);
        this.LJIIJJI = new C0DE3(c19eg, c0dd8, pdpViewModel);
        this.LJIIL = new C0DEV(c0dd8, c0dh8, pdpViewModel);
        this.LJIILIIL = new C0DGE(c0dd8, c0dgc, new AwS548S0100000_4(this, 464));
        this.LJIILJJIL = new C0DDO(c19eg, c0dd8);
    }
}
