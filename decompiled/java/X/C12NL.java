package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import njp.a;

/* JADX INFO: renamed from: X.12NL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.tab.hot.HotMusicRegionPage$loadMusic$1", f = "HotMusicRegionPage.kt", l = {244}, m = "invokeSuspend")
public final class C12NL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C12NP LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12NL(C12NP c12np, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12np;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12NL(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List data;
        C1C7U.LIZ("HotMusicRegionPage@ee3e.loadMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C12NP c12np = this.LLILLJJLI;
            c12np.LLJILJIL = true;
            C1DFB c1dfb = C0PEM.LIZJ;
            C12NK c12nk = new C12NK(c12np, null, this.LLILLL);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c12nk);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HotMusicRegionPage@ee3e.loadMusic$1");
                return objLJFF;
            }
        }
        C12NM c12nm = (C12NM) obj;
        if (c12nm.LIZ == 0) {
            C12NP c12np2 = this.LLILLJJLI;
            c12np2.LLJI = c12nm.LIZLLL;
            c12np2.LLJIJIL = c12nm.LJ;
            if (this.LLILLL) {
                C197085129b.LIZ(C13BV.INSTANCE, c12nm.LIZJ);
                C129G c129g = this.LLILLJJLI.LLIZLLLIL;
                if (c129g != null) {
                    c129g.setData(c12nm.LIZJ);
                }
                AwS575S0100000_31 awS575S0100000_31 = this.LLILLJJLI.LLJ;
                if (awS575S0100000_31 != null) {
                    awS575S0100000_31.invoke();
                }
                C12NP c12np3 = this.LLILLJJLI;
                if (c12np3.LLJILLL) {
                    c12np3.LIZ();
                }
            } else {
                C129G c129g2 = c12np2.LLIZLLLIL;
                if (c129g2 == null || (data = c129g2.getData()) == null) {
                    data = C13BV.INSTANCE;
                }
                C197085129b.LIZ(data, c12nm.LIZJ);
                C129G c129g3 = this.LLILLJJLI.LLIZLLLIL;
                if (c129g3 != null) {
                    c129g3.addData(c12nm.LIZJ);
                }
                AwS575S0100000_31 awS575S0100000_312 = this.LLILLJJLI.LLJ;
                if (awS575S0100000_312 != null) {
                    awS575S0100000_312.invoke();
                }
                C129G c129g4 = this.LLILLJJLI.LLIZLLLIL;
                if (c129g4 != null) {
                    c129g4.setShowFooter(false);
                }
            }
        } else {
            C201962140q c201962140q = C201962140q.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get hot music list failed, status: ");
            sbLIZ.append(c12nm.LIZ);
            sbLIZ.append(", msg: ");
            sbLIZ.append(c12nm.LIZIZ);
            C201955140j.LJIJI(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLILLL) {
            C03BJ c03bj = this.LLILLJJLI.LLILZLL;
            if (c03bj != null) {
                C786410Ut5.h1(c03bj, 8);
            }
            List<MusicModel> list = c12nm.LIZJ;
            if (list == null || list.isEmpty()) {
                this.LLILLJJLI.LJ(true);
            }
        }
        this.LLILLJJLI.LLJILJIL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HotMusicRegionPage@ee3e.loadMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
