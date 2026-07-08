package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateCompressMediaTask$compressVideo$1", f = "TemplateCompressMediaTask.kt", l = {}, m = "invokeSuspend")
public final class C538030L8f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C538050L8h LL;
    public final /* synthetic */ C0FQS LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ List<C537990L8b> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538030L8f(C538050L8h c538050L8h, C0FQS c0fqs, CreativeInfo creativeInfo, List<C537990L8b> list, InterfaceC1364105Vn<? super C538030L8f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c538050L8h;
        this.LLILLJJLI = c0fqs;
        this.LLILLL = creativeInfo;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C538030L8f(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TemplateCompressMediaTask@348a.compressVideo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIJIIJIL(this.LLILLJJLI, this.LLILLL, this.LLILZ, 0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateCompressMediaTask@348a.compressVideo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
