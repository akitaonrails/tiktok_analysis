package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment$tryLoadBgm$2$1$1$1", f = "ConnectNowFragment.kt", l = {}, m = "invokeSuspend")
public final class C1687620u1A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ConnectNowFragment LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MusicModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687620u1A(ConnectNowFragment connectNowFragment, boolean z, MusicModel musicModel, InterfaceC1364105Vn<? super C1687620u1A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = connectNowFragment;
        this.LLILLJJLI = z;
        this.LLILLL = musicModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687620u1A(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ConnectNowFragment connectNowFragment;
        C1485060okS c1485060okS;
        C1C7U.LIZ("ConnectNowFragment@7e4a.tryLoadBgm$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ConnectNowFragment connectNowFragment2 = this.LL;
        C1485060okS c1485060okS2 = new C1485060okS();
        MusicModel musicModel = this.LLILLL;
        c1485060okS2.LJI = true;
        c1485060okS2.LIZIZ = musicModel.getUrl().getUrlList();
        connectNowFragment2.LLJIJIL = c1485060okS2;
        if (this.LLILLJJLI && (c1485060okS = (connectNowFragment = this.LL).LLJIJIL) != null) {
            ((C20498815Ja) connectNowFragment.LLIZLLLIL.getValue()).LIZIZ(c1485060okS);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConnectNowFragment@7e4a.tryLoadBgm$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
