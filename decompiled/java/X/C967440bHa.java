package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967440bHa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C967140bH6 LL;
    public final /* synthetic */ LinkUser LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967440bHa(C967140bH6 c967140bH6, LinkUser linkUser) {
        super(0);
        this.LL = c967140bH6;
        this.LLILLJJLI = linkUser;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CopyOnWriteArrayList<InterfaceC967450bHb> copyOnWriteArrayList = this.LL.LJIILL;
        LinkUser linkUser = this.LLILLJJLI;
        Iterator<InterfaceC967450bHb> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJLZIJ(linkUser);
        }
        return Unit.LIZ;
    }
}
