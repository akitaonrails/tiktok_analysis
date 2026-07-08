package X;

import com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.MusicListComposableAssem$MusicListComposable$1$1", f = "MusicListComposableAssem.kt", l = {}, m = "invokeSuspend")
public final class C632340OrA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ MusicListComposableAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632340OrA(boolean z, MusicListComposableAssem musicListComposableAssem, InterfaceC1364105Vn<? super C632340OrA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = musicListComposableAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C632340OrA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String secUid;
        C1C7U.LIZ("MusicListComposableAssem@c9b0.MusicListComposable$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL && this.LLILLJJLI.op()) {
            C632210Oqx.LIZ.getClass();
            User userLIZJ = C632210Oqx.LIZJ();
            if (userLIZJ != null) {
                secUid = userLIZJ.getSecUid();
            } else {
                secUid = null;
            }
            C632070Oqj.LIZLLL(secUid);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicListComposableAssem@c9b0.MusicListComposable$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
