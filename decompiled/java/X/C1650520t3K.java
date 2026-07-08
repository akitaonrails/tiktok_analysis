package X;

import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import ln3.a;

/* JADX INFO: renamed from: X.0t3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650520t3K extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final EnumC1651770t5L LLIZLLLIL;
    public final AwS569S0100000_25 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650520t3K.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650520t3K.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC1651430t4n
    public final String LJIJJ() {
        return "m_beauty";
    }

    public final C19EG LJIJJLI() {
        return (C19EG) this.LLILZLL.getValue(this, LLJI[0]);
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLIZLLLIL;
    }

    public C1650520t3K(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, a.class, null);
        this.LLIZLLLIL = EnumC1651770t5L.BEAUTY;
        this.LLJ = new AwS569S0100000_25(this, 807);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        boolean z;
        super.LIZ(c1654400t9a, i3Var);
        boolean z2 = !i3Var.LLIZ;
        a aVar = (a) this.LLIZ.getValue(this, LLJI[1]);
        if (C19317910ht.LIZJ() == 2131849207) {
            z = true;
        } else {
            z = false;
        }
        aVar.KS1(z2, z, true);
        LJIIJJI(new AwS111S0110000_25(z2, this, 17));
    }
}
