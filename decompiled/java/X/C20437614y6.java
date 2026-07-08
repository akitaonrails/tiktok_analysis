package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14y6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.model.UnlimitedMusicDataRepo$loadMoreUnlimitedMusic$1$3", f = "UnlimitedMusicDataRepo.kt", l = {}, m = "invokeSuspend")
public final class C20437614y6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DataCenter>, Object> {
    public final /* synthetic */ C20320214fA LL;
    public final /* synthetic */ C20449014zw<String, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20437614y6(C20320214fA c20320214fA, C20449014zw<String, Object> c20449014zw, InterfaceC1364105Vn<? super C20437614y6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20320214fA;
        this.LLILLJJLI = c20449014zw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20437614y6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DataCenter dataCenterZQ2 = this.LL.LIZ.zQ2(this.LLILLJJLI, "unlimited_music_tab_list_data");
        C1C7U.LIZIZ("UnlimitedMusicDataRepo@eb87.loadMoreUnlimitedMusic$1$3");
        return dataCenterZQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DataCenter> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
