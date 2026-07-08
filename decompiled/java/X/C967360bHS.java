package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967360bHS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C967140bH6 LL;
    public final /* synthetic */ List<LinkUser> LLILLJJLI;
    public final /* synthetic */ List<LinkUser> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967360bHS(C967140bH6 c967140bH6, List<LinkUser> list, List<LinkUser> list2) {
        super(0);
        this.LL = c967140bH6;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CopyOnWriteArrayList<InterfaceC967450bHb> copyOnWriteArrayList = this.LL.LJIILL;
        List<LinkUser> list = this.LLILLJJLI;
        List<LinkUser> list2 = this.LLILLL;
        Iterator<InterfaceC967450bHb> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIJ(list, list2);
        }
        return Unit.LIZ;
    }
}
