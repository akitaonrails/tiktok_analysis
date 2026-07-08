package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.dsl.AlsVMContainer;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0o7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460720o7C extends AbstractC1463010oAt {
    public static final int LLLL = 8;
    public final C19A3 LLLIIIL;
    public final int LLLIIL;
    public final InterfaceC1419190n2D LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final LiveData<Boolean> LLLIZZ;
    public final LiveEvent<Boolean> LLLJ;
    public final LiveData<Boolean> LLLJIL;
    public final LiveData<Unit> LLLJL;

    @Override // X.InterfaceC1419190n2D
    public void G61(boolean z) {
    }

    @Override // X.InterfaceC1419190n2D
    public void II1() {
    }

    @Override // X.C12VU
    public void Lu2(boolean z) {
    }

    @Override // X.AbstractC1463010oAt
    public void R5() {
        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(0);
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1664620tQ4.LIZ(this).get(AlsVMContainer.class);
        C1647230sy1 c1647230sy1 = new C1647230sy1(0);
        aFwS261S0000000_22.invoke(c1647230sy1);
        alsVMContainer.LL = c1647230sy1;
        C1664590tQ1.LIZJ(this, new AwS601S0100000_22(this, 0));
        C1664600tQ2.LIZJ(this, AFwS261S0000000_22.get$arr$(1));
    }

    @Override // X.InterfaceC1419190n2D
    public void UZ1() {
    }

    @Override // X.InterfaceC1419190n2D
    public void Uu2() {
    }

    @Override // X.InterfaceC1419190n2D
    public void ar2() {
    }

    @Override // X.InterfaceC1419190n2D
    public void fN() {
    }

    @Override // X.InterfaceC1419190n2D
    public void fb2() {
    }

    @Override // X.InterfaceC1419190n2D
    public void gy() {
    }

    @Override // X.InterfaceC1419190n2D
    public void tG1(boolean z, Function1<? super Boolean, Unit> function1) {
    }

    @Override // X.C12VU
    public void tH0(boolean z, Function1<? super Boolean, Unit> function1) {
    }

    @Override // X.C12VU
    public boolean uV0() {
        return false;
    }

    @Override // X.C12VU
    public void yD1() {
    }

    private final InterfaceC1455040ny2 d8() {
        return (InterfaceC1455040ny2) this.LLLILZLLLI.getValue();
    }

    private final InterfaceC1454940nxs h8() {
        return (InterfaceC1454940nxs) this.LLLILZJ.getValue();
    }

    private final InterfaceC1455100ny8 o8() {
        return (InterfaceC1455100ny8) this.LLLIL.getValue();
    }

    private final InterfaceC1455150nyD p8() {
        return (InterfaceC1455150nyD) this.LLLILZ.getValue();
    }

    @Override // X.AbstractC1463010oAt
    public boolean C1() {
        return p8().C1();
    }

    @Override // X.AbstractC1463010oAt
    public void LLJJJJ() {
        InterfaceC1455040ny2 interfaceC1455040ny2D8 = d8();
        if (interfaceC1455040ny2D8 != null) {
            interfaceC1455040ny2D8.LLJJJJ();
        }
    }

    @Override // X.AbstractC1463010oAt
    public void P5() {
        o8().P5();
    }

    @Override // X.AbstractC1463010oAt
    public void Qh() {
        o8().Qh();
    }

    @Override // X.AbstractC1463010oAt
    public void u1() {
        p8().u1();
    }

    @Override // X.InterfaceC1419190n2D
    public LiveEvent<Boolean> N50() {
        return this.LLLJ;
    }

    public InterfaceC1419190n2D Z7() {
        return this.LLLIILIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1419190n2D
    public LiveData<Boolean> nz2() {
        return this.LLLJIL;
    }

    @Override // X.InterfaceC1419190n2D
    public LiveData<Boolean> rJ0() {
        return this.LLLIZZ;
    }

    @Override // X.InterfaceC1419190n2D
    public LiveData<Unit> xO() {
        return this.LLLJL;
    }

    @Override // X.AbstractC1463010oAt
    public void LLLLZI(boolean z) {
        float musicVolume;
        InterfaceC1455860nzM interfaceC1455860nzMB3 = B3();
        if (z) {
            musicVolume = getEditModel().getMusicVolume();
        } else {
            musicVolume = 0.0f;
        }
        interfaceC1455860nzMB3.EY0(VEVolumeChangeOp.ofMusic(musicVolume));
    }

    @Override // X.AbstractC1463010oAt
    public void P6(int i) {
        h8().LLLL(i);
    }

    @Override // X.AbstractC1463010oAt
    public void Tj(int i) {
        o8().Tj(i);
    }

    @Override // X.AbstractC1463010oAt
    public void W6(int i) {
        o8().LLLL(i);
    }

    @Override // X.C12VU
    public void Z10(boolean z) {
        this.LLJ = z;
    }

    @Override // X.AbstractC1463010oAt
    public void a92(boolean z) {
        p8().a92(z);
    }

    @Override // X.AbstractC1463010oAt
    public void l0(Pair<Integer, Integer> pair) {
        p8().l0(pair);
    }

    @Override // X.AbstractC1463010oAt
    public void v1(int i, boolean z) {
        p8().v1(i, z);
    }

    public C1460720o7C(C1DRG c1drg, C19A3 c19a3, int i) {
        super(c1drg, c19a3, i);
        this.LLLIIIL = c19a3;
        this.LLLIIL = i;
        this.LLLIILIL = this;
        this.LLLIL = C1449630npJ.LIZ(this, InterfaceC1455100ny8.class);
        this.LLLILZ = C1449630npJ.LIZ(this, InterfaceC1455150nyD.class);
        this.LLLILZJ = C1449630npJ.LIZ(this, InterfaceC1454940nxs.class);
        this.LLLILZLLLI = C1449630npJ.LIZIZ(this, InterfaceC1455040ny2.class);
        this.LLLIZZ = new MutableLiveData();
        this.LLLJ = new LiveEvent<>();
        this.LLLJIL = new MutableLiveData();
        this.LLLJL = new MutableLiveData();
    }

    @Override // X.InterfaceC1419190n2D
    public void M9(AVMusic aVMusic, boolean z, Function1<? super Boolean, Unit> function1) {
        function1.invoke(Boolean.TRUE);
    }
}
