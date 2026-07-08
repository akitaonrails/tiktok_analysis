package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O5V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0O5V<S> extends C0O5X<S> {
    public final C054G LIZJ;

    public abstract Object LJ(Object obj);

    public C0O5V(C19719912Dl c19719912Dl) {
        super(c19719912Dl);
        this.LIZJ = C2296808zG.LIZ(C0PEM.LIZJ);
    }

    public final <D extends C0O3E, M extends InterfaceC613720O5i<D>> void LIZJ(String str, M m, D d, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super String, ? super Throwable, Unit> function22, Function2<? super String, ? super Boolean, Unit> function23, Function1<? super C613670O5d<D>, C613670O5d<D>> function1, C613690O5f c613690O5f, InterfaceC1631620sYq<? super String, ? super C0O3E, ? super Boolean, ? extends List<? extends IMotaCache>> interfaceC1631620sYq) {
        if (str.length() == 0) {
            C0O5Y.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("id: ");
            sbLIZ.append("id is empty");
            sbLIZ.append(", request denied, reason: ");
            sbLIZ.append("id is empty");
            C0O5Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C23250099c.LIZLLL(this.LIZJ, null, null, new C0O5T(m, str, c613690O5f, d, function1, interfaceC1631620sYq, function22, this, function2, function23, null), 3);
    }
}
