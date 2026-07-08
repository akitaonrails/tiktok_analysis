package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C865330Xx5 extends C09AY implements Function1<InterfaceC863600XuI<C0Y8T>, Unit> {
    public final /* synthetic */ C865340Xx6 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865330Xx5(C865340Xx6 c865340Xx6, String str, boolean z, Map<String, String> map) {
        super(1);
        this.LL = c865340Xx6;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        this.LL.LIZIZ.invoke(this.LLILLJJLI).LLIFFJFJJ(this.LLILLL, this.LLILZ, interfaceC863600XuI);
        return Unit.LIZ;
    }
}
