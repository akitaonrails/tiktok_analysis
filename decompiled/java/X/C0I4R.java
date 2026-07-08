package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I4R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0I4R extends C2217421BqW implements Function1<C869590Y9l, C0I4Y<? extends InterfaceC460300I3g>> {
    public C0I4R(Object obj) {
        super(1, obj, C0I4Q.class, "getQuotedTagFromMsg", "getQuotedTagFromMsg(Lcom/bytedance/im/core/message/core/model/Message;)Lcom/ss/android/ugc/aweme/im/common/ui/state/UIState;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.0I4Y<? extends X.0I3g>] */
    @Override // kotlin.jvm.functions.Function1
    public final C0I4Y<? extends InterfaceC460300I3g> invoke(C869590Y9l c869590Y9l) {
        C869590Y9l c869590Y9l2 = c869590Y9l;
        Iterator it2 = ((List) ((C0I4Q) this.receiver).LIZLLL.getValue()).iterator();
        while (it2.hasNext()) {
            C0I3K c0i3kLIZ = ((C0I4V) it2.next()).LIZ(c869590Y9l2);
            if (c0i3kLIZ instanceof C0I3O) {
                return ((C0I3O) c0i3kLIZ).LIZ;
            }
        }
        return C460510I4b.LIZ;
    }
}
