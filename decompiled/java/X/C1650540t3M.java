package X;

import iyl.i3;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650540t3M extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1664750tQH LLILZLL;
    public final EnumC1651770t5L LLIZ;
    public final AwS569S0100000_25 LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650540t3M.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C19EG LJIJJLI() {
        return (C19EG) this.LLILZLL.getValue(this, LLJ[0]);
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLIZ;
    }

    public C1650540t3M(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLIZ = EnumC1651770t5L.AI_CAPTION;
        this.LLIZLLLIL = new AwS569S0100000_25(this, 797);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        Object obj;
        super.LIZ(c1654400t9a, i3Var);
        boolean zLJJJLIIL = C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false);
        boolean z = !zLJJJLIIL;
        LJIIJJI(new AwS111S0110000_25(z, this, 15));
        LJIILIIL().Et(z);
        C0CHQ.LIZ().LJJIIZI().LJJJJI(z);
        C0LAB c0lab = new C0LAB();
        C0MJO.LIZIZ(LJIIL().creativeModel, c0lab);
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("creation_id", LJIIL().creativeInfo.getCreationId());
        pairArr[1] = new Pair("shoot_way", LJIIL().shootWay);
        pairArr[2] = new Pair("enter_from", "video_shoot_page");
        pairArr[3] = new Pair("content_source", "shoot");
        pairArr[4] = new Pair("content_type", "now");
        String str = "on";
        if (zLJJJLIIL) {
            obj = "on";
        } else {
            obj = "off";
        }
        pairArr[5] = new Pair("from_mode", obj);
        if (!z) {
            str = "off";
        }
        pairArr[6] = new Pair("to_mode", str);
        c0lab.LJI(C2097608Jq.LJIIJ(pairArr));
        C20684815ws.LJIILLIIL("click_auto_meme_mode_entrance", c0lab.LIZ);
    }
}
