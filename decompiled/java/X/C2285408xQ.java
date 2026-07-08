package X;

import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08xQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieLogicExt$compressMetaList$2", f = "SmartMovieLogicExt.kt", l = {206, 220}, m = "invokeSuspend")
public final class C2285408xQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C118300cf LL;
    public Object LLILLJJLI;
    public Function1 LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ List<MetaExt> LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Function1<Float, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2285408xQ(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLJ = list;
        this.LLJI = str;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2285408xQ c2285408xQ = new C2285408xQ(this.LLJI, this.LLJ, interfaceC1364105Vn, this.LLJIJIL);
        c2285408xQ.LLIZLLLIL = obj;
        return c2285408xQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01e8 -> B:7:0x0037). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2285408xQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
