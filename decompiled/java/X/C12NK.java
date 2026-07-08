package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12NK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.tab.hot.HotMusicRegionPage$loadMusic$1$res$1", f = "HotMusicRegionPage.kt", l = {250}, m = "invokeSuspend")
public final class C12NK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C12NM>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C12NP LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12NK(C12NP c12np, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c12np;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12NK(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("HotMusicRegionPage@ee3e.loadMusic$1$res$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                i = 0;
            } else {
                i = this.LLILLL.LLJI;
            }
            C12NG c12ng = (C12NG) this.LLILLL.LLJILJILJ.getValue();
            String str = this.LLILLL.LL;
            this.LL = 1;
            obj = c12ng.LIZ(str, i, 30, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HotMusicRegionPage@ee3e.loadMusic$1$res$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("HotMusicRegionPage@ee3e.loadMusic$1$res$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C12NM> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
