package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;
import com.ss.android.ugc.aweme.favorites.business.playlist.ability.IPlaylistCollectionStateNotifier;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O6J, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM$onPrepared$1", f = "PlaylistCollectionVM.kt", l = {77}, m = "invokeSuspend")
public final class C0O6J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PlaylistCollectionVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O6J(PlaylistCollectionVM playlistCollectionVM, InterfaceC1364105Vn<? super C0O6J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = playlistCollectionVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O6J(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistCollectionVM@b453.onPrepared$1");
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
            C638950P4j c638950P4j = new C638950P4j(((IStateNotifier) ServiceManager.get().getService(IPlaylistCollectionStateNotifier.class)).subscribe(), 0);
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 7);
            this.LL = 1;
            if (c638950P4j.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("PlaylistCollectionVM@b453.onPrepared$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlaylistCollectionVM@b453.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
