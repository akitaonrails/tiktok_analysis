package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import njp.a;

/* JADX INFO: renamed from: X.0e6S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM$delayDisappearAssem$1", f = "VideoUserCardVM.kt", l = {205}, m = "invokeSuspend")
public final class C1075860e6S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoUserCardVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1075860e6S(VideoUserCardVM videoUserCardVM, InterfaceC1364105Vn<? super C1075860e6S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoUserCardVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1075860e6S(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoUserCardVM@11f6.delayDisappearAssem$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("VideoUserCardVM@11f6.delayDisappearAssem$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setStateImmediate(AFwS252S0000000_16.get$arr$(440));
        this.LLILLJJLI.wQ2(false, EnumC1073720e30.AUTO);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoUserCardVM@11f6.delayDisappearAssem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
