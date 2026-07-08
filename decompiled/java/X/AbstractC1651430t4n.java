package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import iyl.i3;

/* JADX INFO: renamed from: X.0t4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1651430t4n extends AbstractC1651450t4p<i3, InterfaceC1651550t4z> implements InterfaceC1651550t4z {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1651430t4n.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC1651430t4n.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC1651450t4p
    public final AbstractC1651430t4n LJ() {
        return this;
    }

    public void LJIILLIIL(View view) {
    }

    public void LJIJI(C1654400t9a c1654400t9a) {
    }

    public final ShortVideoContext LJIIL() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    public final InterfaceC1651080t4E LJIILIIL() {
        return (InterfaceC1651080t4E) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC1651450t4p
    public final InterfaceC1651490t4t LJIIIIZZ() {
        return LJIILIIL().KY1();
    }

    public String LJIJJ() {
        return LJIIIZ().getKey();
    }

    public AbstractC1651430t4n(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1651080t4E.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
    }

    public static int LJIILJJIL(int i) {
        if (i <= 0) {
            C1657820tF6.LIZ.getClass();
            if (C1657820tF6.LIZIZ()) {
                return 0;
            }
            return R.attr.ee;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    @Override // X.InterfaceC1659130tHD
    /* JADX INFO: renamed from: LJIIZILJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZIZ(iyl.i3 r5) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1651430t4n.LIZIZ(iyl.i3):void");
    }

    @Override // X.InterfaceC1659130tHD
    public final void LIZJ(C1654400t9a c1654400t9a, i3 i3Var) {
        i3 i3Var2 = i3Var;
        LJIILIIL().Bw1();
        LJIILIIL().Pj2(LJIIIZ());
        if (!i3Var2.LLIZLLLIL) {
            LIZLLL(c1654400t9a, i3Var2);
        } else {
            LJIILLIIL(c1654400t9a.LIZIZ);
        }
    }

    public /* bridge */ /* synthetic */ void LIZLLL(C1654400t9a c1654400t9a, Object obj) {
        LJIJI(c1654400t9a);
    }

    @Override // X.InterfaceC1659130tHD
    /* JADX INFO: renamed from: LJIJ, reason: merged with bridge method [inline-methods] */
    public void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        LJIILIIL().Bw1();
        C0CHQ.LIZ().LJI().LJIIIZ(LJIIL(), LJIIIZ().getKey());
        LJIILLIIL(c1654400t9a.LIZIZ);
        C1638140sjM.LIZ(EnumC1647590syb.TOOL_BAR);
    }
}
