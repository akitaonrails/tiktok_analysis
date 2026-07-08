package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uB2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693740uB2 implements InterfaceC1693850uBD<Object, Object> {
    public final /* synthetic */ Function2<InterfaceC1567440qtK, Object, Object> LIZ;
    public final /* synthetic */ Function1<Object, Object> LIZIZ;

    public final Object LIZIZ(Object obj) {
        return this.LIZIZ.invoke(obj);
    }

    public C1693740uB2(Function1 function1, Function2 function2) {
        this.LIZ = function2;
        this.LIZIZ = function1;
    }

    @Override // X.InterfaceC1693840uBC
    public final Object LIZ(InterfaceC1567440qtK interfaceC1567440qtK, Object obj) {
        return this.LIZ.invoke(interfaceC1567440qtK, obj);
    }
}
