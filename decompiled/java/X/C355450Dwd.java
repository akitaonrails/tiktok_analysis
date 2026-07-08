package X;

import com.ss.android.vesdk.algorithm.s;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Dwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355450Dwd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C259800zU<List<s>> LL;
    public final /* synthetic */ InterfaceC355460Dwe LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355450Dwd(C259800zU<List<s>> c259800zU, InterfaceC355460Dwe interfaceC355460Dwe, long j, boolean z, int i) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = interfaceC355460Dwe;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL.element == null) {
            InterfaceC355460Dwe interfaceC355460Dwe = this.LLILLJJLI;
            if (interfaceC355460Dwe != null) {
                interfaceC355460Dwe.LIZ(-10002, "detect_null_result", new C355480Dwg(this.LLILLL, this.LLILZ));
            }
        } else {
            InterfaceC355460Dwe interfaceC355460Dwe2 = this.LLILLJJLI;
            if (interfaceC355460Dwe2 != null) {
                interfaceC355460Dwe2.LIZIZ(this.LLILZIL, null, new C355480Dwg(this.LLILLL, this.LLILZ));
            }
        }
        return Unit.LIZ;
    }
}
