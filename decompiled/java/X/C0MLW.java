package X;

import Y.AfS144S0200000_8;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MLW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$calculateSingleImageBackgroundColor$1", f = "ForwardOnThisDayEnvironment.kt", l = {896}, m = "invokeSuspend")
public final class C0MLW extends C09AX implements Function2<C094D<? super Pair<? extends C0MMG, ? extends CanvasVideoData>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C0MMG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MLW(CreativeInfo creativeInfo, boolean z, C0MMG c0mmg, InterfaceC1364105Vn<? super C0MLW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creativeInfo;
        this.LLILZ = z;
        this.LLILZIL = c0mmg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MLW c0mlw = new C0MLW(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0mlw.LLILLJJLI = obj;
        return c0mlw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.calculateSingleImageBackgroundColor$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            C0MP1.LIZ(new C0MP1(this.LLILLL, new C0MOJ(this.LLILZ, false, 2)), this.LLILZIL.LIZ, false, null, false, 60).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS144S0200000_8(c094d, this.LLILZIL, 0), new C09JN() { // from class: X.0MLV
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.calculateSingleImageBackgroundColor$1$disposable$2");
                    C0MKJ.LIZLLL.LJ();
                    C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.calculateSingleImageBackgroundColor$1$disposable$2");
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(14);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.calculateSingleImageBackgroundColor$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.calculateSingleImageBackgroundColor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends C0MMG, ? extends CanvasVideoData>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
