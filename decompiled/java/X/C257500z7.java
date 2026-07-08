package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00z7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C257500z7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C259800zU<List<Function0<Unit>>> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C259800zU<List<Function0<Unit>>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C257500z7(Function0 function0, C013C c013c, C259800zU c259800zU, C259800zU c259800zU2) {
        super(0);
        this.LL = c013c;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = function0;
        this.LLILZ = c259800zU2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!(!this.LL.element)) {
            throw new IllegalStateException("Check failed.");
        }
        C259800zU<List<Function0<Unit>>> c259800zU = this.LLILLJJLI;
        C259800zU<List<Function0<Unit>>> c259800zU2 = this.LLILZ;
        List<Function0<Unit>> list = c259800zU.element;
        List<Function0<Unit>> list2 = c259800zU2.element;
        if (list == list2) {
            c259800zU.element = new ArrayList(list2);
        }
        ListProtector.remove(this.LLILLJJLI.element, this.LLILLJJLI.element.indexOf(this.LLILLL));
        return Unit.LIZ;
    }
}
