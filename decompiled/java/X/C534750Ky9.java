package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ky9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.util.ImageUtils$getMediaFrame$2", f = "ImageUtils.kt", l = {}, m = "invokeSuspend")
public final class C534750Ky9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AutoCutMediaModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C534750Ky9(AutoCutMediaModel autoCutMediaModel, String str, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C534750Ky9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = autoCutMediaModel;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534750Ky9(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageUtils@13b5.getMediaFrame$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2286708xd.LJFF(this.LL.filePath, this.LLILLJJLI);
        this.LLILLL.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageUtils@13b5.getMediaFrame$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
