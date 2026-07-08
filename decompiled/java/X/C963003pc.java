package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C963003pc implements InterfaceC1725110uzd {
    public final /* synthetic */ Function2<C03XW, JSONObject, Unit> LIZ;

    @Override // X.InterfaceC1725110uzd
    public final void LIZIZ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C963003pc(Function2<? super C03XW, ? super JSONObject, Unit> function2) {
        this.LIZ = function2;
    }

    @Override // X.InterfaceC1725110uzd
    public final void LIZ(C03XW c03xw, JSONObject jSONObject) {
        Function2<C03XW, JSONObject, Unit> function2 = this.LIZ;
        if (function2 != null) {
            function2.invoke(c03xw, jSONObject);
        }
    }
}
