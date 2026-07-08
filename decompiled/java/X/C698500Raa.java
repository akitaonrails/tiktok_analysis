package X;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Raa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C698500Raa extends C2217421BqW implements Function1<C698680Ras, C698680Ras> {
    public final /* synthetic */ List<Function1<C698680Ras, C698680Ras>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698500Raa(List<Function1<C698680Ras, C698680Ras>> list) {
        super(1, C1449605lu.class, "dispatchSignal", "createFcpSignalService$dispatchSignal(Ljava/util/List;Lcom/ss/android/ugc/feed/platform/componentmanager/maker/next/PolicySignal;)Lcom/ss/android/ugc/feed/platform/componentmanager/maker/next/PolicySignal;", 0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C698680Ras invoke(C698680Ras c698680Ras) {
        C698680Ras c698680RasInvoke = c698680Ras;
        List<Function1<C698680Ras, C698680Ras>> list = this.LL;
        c698680RasInvoke.LIZ();
        if (!list.isEmpty()) {
            ListIterator<Function1<C698680Ras, C698680Ras>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c698680RasInvoke = listIterator.previous().invoke(c698680RasInvoke);
            }
        }
        return c698680RasInvoke;
    }
}
