package X;

import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment$buildSparkMultiViewManager$1$8$1", f = "RavenMusicCollectionFragment.kt", l = {}, m = "invokeSuspend")
public final class C1165350gQn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1540620qC4 LL;
    public final /* synthetic */ RavenMusicCollectionFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165350gQn(C1540620qC4 c1540620qC4, RavenMusicCollectionFragment ravenMusicCollectionFragment, InterfaceC1364105Vn<? super C1165350gQn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1540620qC4;
        this.LLILLJJLI = ravenMusicCollectionFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165350gQn(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RavenMusicCollectionFragment@cb52.buildSparkMultiViewManager$1$8$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIJ((List) this.LLILLJJLI.LLLZIIL.getValue(), new InterfaceC1168240gVS() { // from class: X.0gQo
            @Override // X.InterfaceC1168240gVS
            public final void LIZ() {
                new C1043010dFT();
                C1043010dFT.LIZIZ("MusicRavenFragment", AFwS206S0000000_18.get$arr$(147));
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RavenMusicCollectionFragment@cb52.buildSparkMultiViewManager$1$8$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
