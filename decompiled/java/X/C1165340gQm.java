package X;

import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment$buildSparkMultiViewManager$1$8", f = "RavenMusicCollectionFragment.kt", l = {523}, m = "invokeSuspend")
public final class C1165340gQm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1540620qC4 LLILLJJLI;
    public final /* synthetic */ RavenMusicCollectionFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165340gQm(C1540620qC4 c1540620qC4, RavenMusicCollectionFragment ravenMusicCollectionFragment, InterfaceC1364105Vn<? super C1165340gQm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1540620qC4;
        this.LLILLL = ravenMusicCollectionFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165340gQm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RavenMusicCollectionFragment@cb52.buildSparkMultiViewManager$1$8");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C1165350gQn c1165350gQn = new C1165350gQn(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c1165350gQn) == objLJFF) {
                C1C7U.LIZIZ("RavenMusicCollectionFragment@cb52.buildSparkMultiViewManager$1$8");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RavenMusicCollectionFragment@cb52.buildSparkMultiViewManager$1$8");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
