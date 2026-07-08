package X;

import androidx.lifecycle.LifecycleOwner;
import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import ln3.a;

/* JADX INFO: renamed from: X.0svT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645650svT extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final LifecycleOwner LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final EnumC1651770t5L LLJI;
    public final AwS569S0100000_25 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645650svT.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1645650svT.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1645650svT.class, "beautyPanelApiComponent", "getBeautyPanelApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1645650svT.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.AbstractC1651450t4p
    public final void LJIIJ() {
        C579830Mof.LIZIZ(this.LL, a.class, new AwS604S0100000_25(this, 575));
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLJI;
    }

    public C1645650svT(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = c19a3;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        C1664770tQJ.LIZ(c1drg, a.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1644760su2.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1647420syK.class, null);
        this.LLJI = EnumC1651770t5L.BEAUTY;
        this.LLJIJIL = new AwS569S0100000_25(this, 798);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        InterfaceC1647420syK interfaceC1647420syK;
        C385670FAf<InterfaceC1644760su2> c385670FAfNn0;
        super.LIZ(c1654400t9a, i3Var);
        C1653260t7k.LIZ("click_beauty_entrance");
        C1664740tQG c1664740tQG = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        InterfaceC1644760su2 interfaceC1644760su2LIZJ = (InterfaceC1644760su2) c1664740tQG.getValue(this, interfaceC2217461BqaArr[2]);
        if (interfaceC1644760su2LIZJ != null || ((interfaceC1647420syK = (InterfaceC1647420syK) this.LLJ.getValue(this, interfaceC2217461BqaArr[3])) != null && (c385670FAfNn0 = interfaceC1647420syK.nn0()) != null && (interfaceC1644760su2LIZJ = c385670FAfNn0.LIZJ()) != null)) {
            interfaceC1644760su2LIZJ.FT1(!interfaceC1644760su2LIZJ.Xx1());
        }
    }
}
