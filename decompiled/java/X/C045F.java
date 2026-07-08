package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import kotlin.Unit;

/* JADX INFO: renamed from: X.045F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C045F extends C09AY implements InterfaceC1631630sYr<Boolean, String, Object, ExceptionUX, Unit> {
    public final /* synthetic */ C259800zU<ExceptionUX> LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C259800zU<Object> LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C045F(C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, C23260099m c23260099m) {
        super(4);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = c259800zU3;
        this.LLILZ = c23260099m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, String str, Object obj, ExceptionUX exceptionUX) {
        boolean zBooleanValue = bool.booleanValue();
        this.LL.element = exceptionUX;
        this.LLILLJJLI.element = str;
        this.LLILLL.element = obj;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = this.LLILZ;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC1364105Vn.resumeWith(boolValueOf);
        return Unit.LIZ;
    }
}
