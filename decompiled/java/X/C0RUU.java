package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0RUU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUU<T> extends C09AY implements Function0<List<? extends T>> {
    public final /* synthetic */ C0RUT<T> LL;
    public final /* synthetic */ Map<AbstractC1155604fa<?>, C0RTG<?>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0RUU(C0RUT<T> c0rut, Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        super(0);
        this.LL = c0rut;
        this.LLILLJJLI = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return super/*X.0RUV*/.LIZJ(this.LLILLJJLI);
    }
}
