package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewHolder$bindUiState$1", f = "CommerceMusicSubstituteMusicListViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1006000cHm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CommerceMusicSubstituteMusicListViewModel LLILLJJLI;
    public final /* synthetic */ C1839130xxX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006000cHm(CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel, C1839130xxX c1839130xxX, InterfaceC1364105Vn<? super C1006000cHm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceMusicSubstituteMusicListViewModel;
        this.LLILLL = c1839130xxX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1006000cHm c1006000cHm = new C1006000cHm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1006000cHm.LL = obj;
        return c1006000cHm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceMusicSubstituteMusicListViewHolder@a057.bindUiState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C05RH(new C414301jJ(C09IC.LIZIZ(this.LLILLJJLI.LLILZLL), this.LLILLL.LLJILLL, new C1005990cHl(null))));
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1005940cHg(interfaceC346201WaLJIILL, this.LLILLL, this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1005920cHe(interfaceC346201WaLJIILL, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceMusicSubstituteMusicListViewHolder@a057.bindUiState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
