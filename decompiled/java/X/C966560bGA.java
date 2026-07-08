package X;

import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966560bGA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LinkCoreService LL;
    public final /* synthetic */ C965710bEn LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966560bGA(LinkCoreService linkCoreService, C965710bEn c965710bEn) {
        super(0);
        this.LL = linkCoreService;
        this.LLILLJJLI = c965710bEn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CopyOnWriteArrayList<InterfaceC968120bIg> copyOnWriteArrayList = this.LL.LLILZLL;
        C965710bEn c965710bEn = this.LLILLJJLI;
        Iterator<InterfaceC968120bIg> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(c965710bEn);
        }
        return Unit.LIZ;
    }
}
