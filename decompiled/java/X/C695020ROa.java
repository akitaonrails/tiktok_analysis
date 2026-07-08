package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ROa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.model.CollectUnlimitedMusicDataRepo$loadMoreCollectUnlimitedMusic$1$4", f = "CollectUnlimitedMusicDataRepo.kt", l = {}, m = "invokeSuspend")
public final class C695020ROa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DataCenter>, Object> {
    public final /* synthetic */ DataCenter LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695020ROa(DataCenter dataCenter, InterfaceC1364105Vn<? super C695020ROa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dataCenter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C695020ROa(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DataCenter dataCenterZQ2 = this.LL.zQ2(C2286608xc.LJ(1), "refresh_status_user_collected_music");
        C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.loadMoreCollectUnlimitedMusic$1$4");
        return dataCenterZQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DataCenter> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
