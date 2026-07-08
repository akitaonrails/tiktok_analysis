package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ylm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C883800Ylm extends C2217421BqW implements Function1<C13IQ<? extends InterfaceC878540YdI>, InterfaceC878540YdI> {
    public C883800Ylm(C881500Yi4 c881500Yi4) {
        super(1, c881500Yi4, C881500Yi4.class, "customDataSourceObserverFactory", "customDataSourceObserverFactory$im_chatlist_impl_release(Lkotlin/reflect/KClass;)Lcom/ss/android/ugc/aweme/im/core/chatlist/api/datasource/IDataSourceObserver;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC878540YdI invoke(C13IQ<? extends InterfaceC878540YdI> c13iq) {
        this.receiver.getClass();
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C885050Ynn.class))) {
            return new C885050Ynn();
        }
        return null;
    }
}
