package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.amberalert.v2.manager.AmberAlertMusicManager$initMusic$1$1$1$2", f = "AmberAlertMusicManager.kt", l = {}, m = "invokeSuspend")
public final class C1523805xs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<MusicModel, Unit> LL;
    public final /* synthetic */ MusicModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1523805xs(Function1<? super MusicModel, Unit> function1, MusicModel musicModel, InterfaceC1364105Vn<? super C1523805xs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = musicModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523805xs(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmberAlertMusicManager@7d2b.initMusic$1$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmberAlertMusicManager@7d2b.initMusic$1$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
