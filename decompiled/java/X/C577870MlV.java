package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$10", f = "OptimizeTakePhotoProcessor.kt", l = {}, m = "invokeSuspend")
public final class C577870MlV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;
    public final /* synthetic */ C577830MlR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C577870MlV(Function0<Unit> function0, String str, ShortVideoContext shortVideoContext, C577830MlR c577830MlR, InterfaceC1364105Vn<? super C577870MlV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = str;
        this.LLILLL = shortVideoContext;
        this.LLILZ = c577830MlR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C577870MlV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$10");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke();
        C1458370o3P c1458370o3P = C1458370o3P.LIZ;
        String str = this.LLILLJJLI;
        ShortVideoContext shortVideoContext = this.LLILLL;
        c1458370o3P.getClass();
        C1458370o3P.LJJIIZI(str, shortVideoContext, true, false);
        C577670MlB c577670MlB = C577670MlB.LIZ;
        C577830MlR c577830MlR = this.LLILZ;
        c577670MlB.getClass();
        C577670MlB.LIZ(c577830MlR);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$10");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
