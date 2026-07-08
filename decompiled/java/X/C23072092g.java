package X;

import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.092g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.control.FullHorizontalCarrouselRecordDockBarScene$loadUploadIconAnimation$1$1$1", f = "FullHorizontalCarrouselRecordDockBarScene.kt", l = {}, m = "invokeSuspend")
public final class C23072092g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ h LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23072092g(String str, h hVar, InterfaceC1364105Vn<? super C23072092g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = hVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23072092g c23072092g = new C23072092g(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c23072092g.LL = obj;
        return c23072092g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullHorizontalCarrouselRecordDockBarScene@605b.loadUploadIconAnimation$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        if (str != null) {
            h hVar = this.LLILLL;
            C1292030jj7<C1294720jnS> c1292030jj7 = hVar.LLLIZZ;
            if (c1292030jj7 != null) {
                c1292030jj7.LJII(hVar.LLLJ);
            }
            C1292030jj7<C1294720jnS> c1292030jj7LJII = C1294250jmh.LJII(str, null);
            hVar.LLLIZZ = c1292030jj7LJII;
            c1292030jj7LJII.LIZIZ(hVar.LLLJ);
        } else {
            h hVar2 = this.LLILLL;
            if (hVar2.mView != null) {
                hVar2.LLLLLLIL(true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.loadUploadIconAnimation$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
