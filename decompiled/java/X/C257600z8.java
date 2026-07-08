package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00z8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C257600z8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C259800zU<List<Function0<Unit>>> LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C259800zU<List<Function0<Unit>>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C257600z8(Function0 function0, C259800zU c259800zU, C259800zU c259800zU2) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = function0;
        this.LLILLL = c259800zU2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C259800zU<List<Function0<Unit>>> c259800zU = this.LL;
        C259800zU<List<Function0<Unit>>> c259800zU2 = this.LLILLL;
        List<Function0<Unit>> list = c259800zU.element;
        List<Function0<Unit>> list2 = c259800zU2.element;
        if (list == list2) {
            c259800zU.element = new ArrayList(list2);
        }
        int iIndexOf = this.LL.element.indexOf(this.LLILLJJLI);
        if (iIndexOf != -1) {
            ListProtector.remove(this.LL.element, iIndexOf);
        }
        return Unit.LIZ;
    }
}
