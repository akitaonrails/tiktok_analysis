package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770370UJv {
    public final List<C770410UJz> LIZ = new ArrayList();

    public final void LIZ(C0UK7 c0uk7, Function1<? super C770400UJy, Unit> function1) {
        C770400UJy c770400UJy = new C770400UJy();
        function1.invoke(c770400UJy);
        List listLLIIII = C13LP.LLIIII(c770400UJy.LIZ);
        if (listLLIIII.isEmpty()) {
            return;
        }
        ((ArrayList) this.LIZ).add(new C770410UJz(c0uk7, listLLIIII));
    }
}
