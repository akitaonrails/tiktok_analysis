package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WR8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WR8 extends C0WR6 {
    public final Function0<Object> LIZJ;
    public Object LIZLLL;

    @Override // X.C0WR6
    public final Object LIZIZ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = this.LIZJ.invoke();
        }
        return this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LazyValue{type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WR8(EnumC823400WRu enumC823400WRu, Function0<? extends Object> function0) {
        super(enumC823400WRu);
        this.LIZJ = function0;
    }
}
