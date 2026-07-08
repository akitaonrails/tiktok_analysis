package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ylh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C883750Ylh extends C2217421BqW implements Function1<C13IQ<? extends InterfaceC879790YfJ>, InterfaceC879790YfJ> {
    public C883750Ylh(C881500Yi4 c881500Yi4) {
        super(1, c881500Yi4, C881500Yi4.class, "filterFactory", "filterFactory$im_chatlist_impl_release(Lkotlin/reflect/KClass;)Lcom/ss/android/ugc/aweme/im/core/chatlist/api/filter/IChatListFilter;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC879790YfJ invoke(C13IQ<? extends InterfaceC879790YfJ> c13iq) {
        this.receiver.getClass();
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879780YfI.class))) {
            return new C879780YfI();
        }
        return null;
    }
}
