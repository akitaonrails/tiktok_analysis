package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS3S3300000_1;

/* JADX INFO: renamed from: X.049T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C049T extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1054104Ah LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C049T(C1054104Ah c1054104Ah, String str, String str2, Integer num, String str3, Map<String, ? extends Object> map) {
        super(0);
        this.LL = c1054104Ah;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num;
        this.LLILZIL = str3;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = this.LL.LJJIZ();
        if (interfaceC1748810vbrLJJIZ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C049S(), new AwS3S3300000_1(this.LL, (C1054104Ah) this.LLILLJJLI, this.LLILLL, (String) this.LLILZ, (Integer) this.LLILZIL, (String) this.LLILZLL, (Map<String, ? extends Object>) 0));
        }
        return Unit.LIZ;
    }
}
