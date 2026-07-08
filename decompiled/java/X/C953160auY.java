package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0auY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953160auY extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ Function2<String, String, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C953160auY(long j, String str, Function2 function2) {
        super(1);
        this.LL = function2;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.invoke("", this.LLILLJJLI);
        C946850akN.LIZ(System.currentTimeMillis() - this.LLILLL, "fetchUploadAuth error", str);
        return Unit.LIZ;
    }
}
