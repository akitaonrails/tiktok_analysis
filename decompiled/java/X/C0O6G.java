package X;

import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O6G, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM$clickPlaylist$3", f = "PlaylistCollectionVM.kt", l = {107, 107}, m = "invokeSuspend")
public final class C0O6G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PlaylistCollectionVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O6G(PlaylistCollectionVM playlistCollectionVM, String str, InterfaceC1364105Vn<? super C0O6G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = playlistCollectionVM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O6G(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistCollectionVM@b453.clickPlaylist$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PlaylistCollectionVM@b453.clickPlaylist$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0O6I c0o6i = this.LLILLJJLI.LL.LL;
            String str = this.LLILLL;
            this.LL = 1;
            c0o6i.getClass();
            obj = C613940O6e.LIZ().LIZ(new C0O6D(str)).LIZIZ();
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PlaylistCollectionVM@b453.clickPlaylist$3");
                return objLJFF;
            }
        }
        this.LL = 2;
        if (C09IC.LJJIJ((InterfaceC346201Wa) obj, this) == objLJFF) {
            C1C7U.LIZIZ("PlaylistCollectionVM@b453.clickPlaylist$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PlaylistCollectionVM@b453.clickPlaylist$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
