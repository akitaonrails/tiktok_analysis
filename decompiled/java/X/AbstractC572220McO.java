package X;

import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0McO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC572220McO extends AbstractC2255721DQs<InterfaceC1453200nv4> implements InterfaceC1453200nv4, InterfaceC379610EuV {
    public final C1DRG LL;
    public final h0<Boolean> LLILLJJLI;
    public final C385670FAf<Boolean> LLILLL;
    public final C560530Lyd<Integer> LLILZ;
    public final LiveEvent<Integer> LLILZIL;
    public final h0<AVMusic> LLILZLL;
    public final C385670FAf<AVMusic> LLIZ;
    public final C560530Lyd<AVMusic> LLIZLLLIL;
    public final LiveEvent<AVMusic> LLJ;
    public final C560530Lyd<Unit> LLJI;
    public final LiveEvent<Unit> LLJIJIL;
    public final C560530Lyd<Unit> LLJILJIL;
    public final LiveEvent<Unit> LLJILJILJ;
    public final h0<Boolean> LLJILLL;
    public final C385670FAf<Boolean> LLJJ;
    public final C560530Lyd<Unit> LLJJI;
    public final LiveEvent<Unit> LLJJIII;
    public final C560530Lyd<Float> LLJJIJI;
    public final LiveEvent<Float> LLJJIJIIJIL;
    public final C560530Lyd<Boolean> LLJJIJIL;
    public final LiveEvent<Boolean> LLJJJ;
    public final C560530Lyd<Unit> LLJJJIL;
    public final LiveEvent<Unit> LLJJJJ;
    public final C560530Lyd<Unit> LLJJJJJIL;
    public final LiveEvent<Unit> LLJJJJLIIL;
    public final C560530Lyd<Unit> LLJJL;
    public final LiveEvent<Unit> LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;

    @Override // X.InterfaceC1453200nv4
    public void Ex1(String str) {
    }

    @Override // X.InterfaceC1453200nv4
    public void U1() {
    }

    public InterfaceC1453200nv4 W1() {
        return this;
    }

    @Override // X.InterfaceC1453200nv4
    public void hide() {
        this.LLJL = false;
    }

    @Override // X.InterfaceC1453200nv4
    public void mi() {
    }

    @Override // X.InterfaceC1453200nv4
    public void Rg0() {
        this.LLJI.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1453200nv4
    public void ao1() {
        this.LLJILJIL.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1453200nv4
    public void cb1() {
        this.LLJJI.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1453200nv4
    public void ll1() {
        this.LLJJJIL.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1453200nv4
    public C385670FAf<Boolean> PK2() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Unit> Pq() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Unit> Q9() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Boolean> Rl0() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Unit> W60() {
        return this.LLJJJJ;
    }

    public final C560530Lyd<Unit> X1() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Unit> X42() {
        return this.LLJJIII;
    }

    public final C560530Lyd<Unit> Z1() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<AVMusic> b7() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Unit> bM() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1453200nv4
    public C385670FAf<AVMusic> bq2() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1453200nv4
    public List<MusicModel> getMusicList() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1453200nv4
    public C385670FAf<Boolean> ha0() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1453200nv4
    public boolean hn0() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1453200nv4
    public boolean isShowing() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Unit> ng0() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Integer> vV() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1453200nv4
    public LiveEvent<Float> zh2() {
        return this.LLJJIJIIJIL;
    }

    public AbstractC572220McO(C1DRG c1drg) {
        this.LL = c1drg;
        h0<Boolean> h0Var = new h0<>(null);
        this.LLILLJJLI = h0Var;
        this.LLILLL = h0Var;
        C560530Lyd<Integer> c560530Lyd = new C560530Lyd<>();
        this.LLILZ = c560530Lyd;
        this.LLILZIL = c560530Lyd;
        h0<AVMusic> h0Var2 = new h0<>(null);
        this.LLILZLL = h0Var2;
        this.LLIZ = h0Var2;
        C560530Lyd<AVMusic> c560530Lyd2 = new C560530Lyd<>();
        this.LLIZLLLIL = c560530Lyd2;
        this.LLJ = c560530Lyd2;
        C560530Lyd<Unit> c560530Lyd3 = new C560530Lyd<>();
        this.LLJI = c560530Lyd3;
        this.LLJIJIL = c560530Lyd3;
        C560530Lyd<Unit> c560530Lyd4 = new C560530Lyd<>();
        this.LLJILJIL = c560530Lyd4;
        this.LLJILJILJ = c560530Lyd4;
        h0<Boolean> h0Var3 = new h0<>(Boolean.FALSE);
        this.LLJILLL = h0Var3;
        this.LLJJ = h0Var3;
        C560530Lyd<Unit> c560530Lyd5 = new C560530Lyd<>();
        this.LLJJI = c560530Lyd5;
        this.LLJJIII = c560530Lyd5;
        C560530Lyd<Float> c560530Lyd6 = new C560530Lyd<>();
        this.LLJJIJI = c560530Lyd6;
        this.LLJJIJIIJIL = c560530Lyd6;
        C560530Lyd<Boolean> c560530Lyd7 = new C560530Lyd<>();
        this.LLJJIJIL = c560530Lyd7;
        this.LLJJJ = c560530Lyd7;
        C560530Lyd<Unit> c560530Lyd8 = new C560530Lyd<>();
        this.LLJJJIL = c560530Lyd8;
        this.LLJJJJ = c560530Lyd8;
        C560530Lyd<Unit> c560530Lyd9 = new C560530Lyd<>();
        this.LLJJJJJIL = c560530Lyd9;
        this.LLJJJJLIIL = c560530Lyd9;
        C560530Lyd<Unit> c560530Lyd10 = new C560530Lyd<>();
        this.LLJJL = c560530Lyd10;
        this.LLJJLIIIJLLLLLLLZ = c560530Lyd10;
    }

    @Override // X.InterfaceC1453200nv4
    public void C60(AVMusic aVMusic) {
        this.LLILZLL.LJII(aVMusic);
    }

    @Override // X.InterfaceC1453200nv4
    public void Do0(AVMusic aVMusic) {
        this.LLIZLLLIL.LJIIJ(aVMusic);
    }

    @Override // X.InterfaceC1453200nv4
    public void Jr1(float f) {
        this.LLJJIJI.LJIIJ(Float.valueOf(f));
    }

    @Override // X.InterfaceC1453200nv4
    public void LJJ(boolean z) {
        this.LLJLIL = true;
        this.LLJJJJJIL.LJIIJ(Unit.LIZ);
        this.LLJILLL.LJII(Boolean.valueOf(z));
        this.LLJL = true;
    }

    @Override // X.InterfaceC1453200nv4
    public void Mp2(int i) {
        this.LLILZ.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1453200nv4
    public void UM(boolean z) {
        this.LLJJIJIL.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1453200nv4
    public void eg(boolean z) {
        this.LLILLJJLI.LJII(Boolean.valueOf(z));
    }
}
