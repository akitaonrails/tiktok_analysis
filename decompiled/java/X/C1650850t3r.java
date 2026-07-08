package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.common.MobClick;
import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import mn3.e0;

/* JADX INFO: renamed from: X.0t3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650850t3r extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final LifecycleOwner LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;
    public final C1650660t3Y LLJI;
    public final EnumC1651770t5L LLJIJIL;
    public final AwS569S0100000_25 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650850t3r.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650850t3r.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1650850t3r.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final InterfaceC1649530t1j LJIJJLI() {
        return (InterfaceC1649530t1j) this.LLIZ.getValue(this, LLJILJILJ[0]);
    }

    @Override // X.AbstractC1651450t4p
    public final void LJIIJ() {
        LJIILIIL().o30(this.LLJI);
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0t3Y] */
    public C1650850t3r(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = c19a3;
        this.LLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1649530t1j.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, e0.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLJI = new InterfaceC1657650tEp() { // from class: X.0t3Y
            @Override // X.InterfaceC1657650tEp
            public final void LIZ() {
                if (this.LIZ.LLILZLL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return;
                }
                InterfaceC1649530t1j interfaceC1649530t1jLJIJJLI = this.LIZ.LJIJJLI();
                interfaceC1649530t1jLJIJJLI.p7(true);
                interfaceC1649530t1jLJIJJLI.fo(EnumC1650720t3e.ENTER_FROM_LONG_PRESS);
                C1448850no3.LIZIZ(this.LIZ.LJIIL());
            }

            @Override // X.InterfaceC1657650tEp
            public final void LIZJ(int i, int i2) {
                this.LIZ.LJIJJLI().Gs(i, i2);
            }

            @Override // X.InterfaceC1657650tEp
            public final void LIZIZ(int i, int i2, int i3, int i4) {
                this.LIZ.LJIJJLI().aj(i, i2, i3, i4);
            }
        };
        this.LLJIJIL = EnumC1651770t5L.SPEED;
        this.LLJILJIL = new AwS569S0100000_25(this, 812);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        super.LIZ(c1654400t9a, i3Var);
        LJIJJLI().p7(!C0CHQ.LIZ().LJJIIZI().LJJLI(false));
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("speed_edit");
        mobClickObtain.setLabelName("shoot_page");
        mobClickObtain.setJsonObject(C1650880t3u.LIZ(this.LL));
        C20684815ws.onEvent(mobClickObtain);
    }
}
