package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ROe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.model.CollectUnlimitedMusicDataRepo$refreshCollectUnlimitedMusic$1$2", f = "CollectUnlimitedMusicDataRepo.kt", l = {}, m = "invokeSuspend")
public final class C695060ROe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DataCenter>, Object> {
    public final /* synthetic */ DataCenter LL;
    public final /* synthetic */ C20449014zw<String, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695060ROe(DataCenter dataCenter, C20449014zw<String, Object> c20449014zw, InterfaceC1364105Vn<? super C695060ROe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dataCenter;
        this.LLILLJJLI = c20449014zw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C695060ROe(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DataCenter dataCenterZQ2 = this.LL.zQ2(this.LLILLJJLI, "user_collected_unlimited_music_list");
        C1C7U.LIZIZ("CollectUnlimitedMusicDataRepo@2cb4.refreshCollectUnlimitedMusic$1$2");
        return dataCenterZQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DataCenter> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
