package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YGC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YGC extends C09AY implements Function2<String, Map<String, ? extends String>, Unit> {
    public final /* synthetic */ C0YEM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGC(C0YEM c0yem) {
        super(2);
        this.LL = c0yem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Map<String, ? extends String> map) {
        C0YJ9 c0yj9 = new C0YJ9(this.LL);
        c0yj9.LIZJ(str);
        c0yj9.LIZIZ(map);
        c0yj9.LIZLLL();
        return Unit.LIZ;
    }
}
