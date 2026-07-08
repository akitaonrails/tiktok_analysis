package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0txi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem$loadMagicMusic$2$1$1$1", f = "UserMatchedAssem.kt", l = {}, m = "invokeSuspend")
public final class C1685480txi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UserMatchedAssem LL;
    public final /* synthetic */ MusicModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1685480txi(UserMatchedAssem userMatchedAssem, MusicModel musicModel, boolean z, InterfaceC1364105Vn<? super C1685480txi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = userMatchedAssem;
        this.LLILLJJLI = musicModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1685480txi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserMatchedAssem@efc1.loadMagicMusic$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        UserMatchedAssem userMatchedAssem = this.LL;
        C1485060okS c1485060okS = new C1485060okS();
        c1485060okS.LIZIZ = this.LLILLJJLI.getUrl().getUrlList();
        c1485060okS.LJI = false;
        boolean z = this.LLILLL;
        UserMatchedAssem userMatchedAssem2 = this.LL;
        if (z) {
            ((C20498815Ja) userMatchedAssem2.LLJILLL.getValue()).LIZIZ(c1485060okS);
        }
        userMatchedAssem.LLJILJILJ = c1485060okS;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserMatchedAssem@efc1.loadMagicMusic$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
