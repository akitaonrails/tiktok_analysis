package X;

import Y.AgS292S0100000_11;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SO0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent$16", f = "PostModePhotosComponent.kt", l = {517}, m = "invokeSuspend")
public final class C0SO0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PostModePhotosComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SO0(PostModePhotosComponent postModePhotosComponent, InterfaceC1364105Vn<? super C0SO0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = postModePhotosComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SO0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<C0S5N> c05ydLJIIIZ;
        C1C7U.LIZ("PostModePhotosComponent@3b97.<init>$16");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0SBA c0sba = this.LLILLJJLI.LLJIJIL;
            if (c0sba != null && (c05ydLJIIIZ = c0sba.LJIIIZ()) != null) {
                AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(this.LLILLJJLI, 33);
                this.LL = 1;
                if (c05ydLJIIIZ.collect(agS292S0100000_11, this) == objLJFF) {
                    C1C7U.LIZIZ("PostModePhotosComponent@3b97.<init>$16");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PostModePhotosComponent@3b97.<init>$16");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
