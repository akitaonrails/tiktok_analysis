package X;

import Y.AObjectS246S0100000_25;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650910t3x extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final LifecycleOwner LLILZLL;
    public final C1664740tQG LLIZ;
    public int LLIZLLLIL;
    public final EnumC1651770t5L LLJ;
    public final AwS569S0100000_25 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650910t3x.class, "svcBottomAndPanelApiComponent", "getSvcBottomAndPanelApiComponent()Lcom/ss/android/ugc/gamora/recorder/voicechange/slideslip/SVCBottomAndPanelApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1651450t4p
    public final void LJIIJ() {
        C1DRG c1drg = this.LL;
        if (C343070Dcf.LIZ()) {
            ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1650930t3z.class, new AwS604S0100000_25(this, 570));
            return;
        }
        C05YF c05yf = (C05YF) c1drg.LJIIL(null, InterfaceC1650930t3z.class);
        if (c05yf != null) {
            InterfaceC1650930t3z interfaceC1650930t3z = (InterfaceC1650930t3z) c05yf;
            if (d4.LJJIJIIJI(LJIIL())) {
                String musicPath = LJIIL().getMusicPath();
                if (musicPath != null && musicPath.length() > 0) {
                    this.LLIZLLLIL = 4;
                    LJIIJJI(new AwS604S0100000_25(this, 571));
                }
                if (LJIIL().LIZJ() != null && (!r0.isEmpty())) {
                    this.LLIZLLLIL = 5;
                    LJIIJJI(AFwS266S0000000_25.get$arr$(429));
                }
            }
            interfaceC1650930t3z.x60().LIZ(this.LLILZLL, new AObjectS246S0100000_25(this, 692));
        }
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJI;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLJ;
    }

    public C1650910t3x(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = c19a3;
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1650930t3z.class, null);
        this.LLIZLLLIL = 1;
        this.LLJ = EnumC1651770t5L.VOICE_CHANGE;
        this.LLJI = new AwS569S0100000_25(this, 813);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        String musicPath;
        InterfaceC1650930t3z interfaceC1650930t3z;
        super.LIZ(c1654400t9a, i3Var);
        int i = this.LLIZLLLIL;
        if (i != 1 && i != 2) {
            if (i == 4 && (musicPath = LJIIL().getMusicPath()) != null && musicPath.length() > 0 && (interfaceC1650930t3z = (InterfaceC1650930t3z) this.LLIZ.getValue(this, LLJIJIL[0])) != null) {
                interfaceC1650930t3z.O81();
                return;
            }
            return;
        }
        InterfaceC1650930t3z interfaceC1650930t3z2 = (InterfaceC1650930t3z) this.LLIZ.getValue(this, LLJIJIL[0]);
        if (interfaceC1650930t3z2 == null) {
            return;
        }
        if (!interfaceC1650930t3z2.Fh()) {
            C1653260t7k.LIZ("click_voice_filter_shown");
            interfaceC1650930t3z2.yo("", "");
            C1663660tOW c1663660tOW = C1663660tOW.LIZ;
            ShortVideoContext shortVideoContextLJIIL = LJIIL();
            c1663660tOW.getClass();
            C20684815ws.LJIILLIIL("click_voice_effect_entrance", C1663660tOW.LJII(shortVideoContextLJIIL).LIZ);
            return;
        }
        interfaceC1650930t3z2.Ub("");
        C1663660tOW c1663660tOW2 = C1663660tOW.LIZ;
        ShortVideoContext shortVideoContextLJIIL2 = LJIIL();
        Effect effectRT1 = interfaceC1650930t3z2.RT1();
        c1663660tOW2.getClass();
        C1663660tOW.LIZIZ(shortVideoContextLJIIL2, "click_voice_effect_entrance", effectRT1);
    }
}
