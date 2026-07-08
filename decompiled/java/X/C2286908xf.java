package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$cleanDirIfNeed$1", f = "BaseAIMusicUploadFrameTask.kt", l = {}, m = "invokeSuspend")
public final class C2286908xf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC2289508y5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2286908xf(AbstractC2289508y5 abstractC2289508y5, InterfaceC1364105Vn<? super C2286908xf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC2289508y5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2286908xf(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseAIMusicUploadFrameTask@c042.cleanDirIfNeed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2286708xd.LJIJJ(this.LL.LJ(), new InterfaceC2287108xh() { // from class: X.08xg
            @Override // X.InterfaceC2287108xh
            public final Object apply(Object obj2) {
                return Boolean.TRUE;
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseAIMusicUploadFrameTask@c042.cleanDirIfNeed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
