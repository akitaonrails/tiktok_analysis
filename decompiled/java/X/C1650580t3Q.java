package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import iyl.i3;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650580t3Q extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final EnumC1651770t5L LLIZLLLIL;
    public final AwS569S0100000_25 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650580t3Q.class, "countDownApi", "getCountDownApi()Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650580t3Q.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLIZLLLIL;
    }

    public C1650580t3Q(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC578600Mmg.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLIZLLLIL = EnumC1651770t5L.COUNT_DOWN;
        this.LLJ = new AwS569S0100000_25(this, 800);
    }

    public final String LJIJJLI(int i) {
        if (i > 0) {
            return C1356620lPI.LIZ(((Context) this.LLIZ.getValue(this, LLJI[1])).getString(2131823333), C2097908Jt.LIZJ(new Pair("number", String.valueOf(i))));
        }
        return null;
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        super.LIZ(c1654400t9a, i3Var);
        C1653260t7k.LIZ("click_timer_entrance");
        C1403450mcp c1403450mcp = C1403450mcp.LIZ;
        ShortVideoContext shortVideoContextLJIIL = LJIIL();
        c1403450mcp.getClass();
        C1403450mcp.LIZ(shortVideoContextLJIIL);
        ((InterfaceC578600Mmg) this.LLILZLL.getValue(this, LLJI[0])).m8(true);
    }
}
