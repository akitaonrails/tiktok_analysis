package X;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O29, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.BaseRelationModel$recentLoader$1$2", f = "BaseRelationModel.kt", l = {53}, m = "invokeSuspend")
public final class C0O29 extends C09AX implements Function2<List<? extends Object>, InterfaceC1364105Vn<? super List<? extends Object>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0O2F LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O29(C0O2F c0o2f, InterfaceC1364105Vn<? super C0O29> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0o2f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0O29 c0o29 = new C0O29(this.LLILLL, interfaceC1364105Vn);
        c0o29.LLILLJJLI = obj;
        return c0o29;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseRelationModel@f20a.recentLoader$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Iterable iterable = (Iterable) this.LLILLJJLI;
            C0O2F c0o2f = this.LLILLL;
            this.LL = 1;
            c0o2f.getClass();
            obj = C13LP.LJLLLL(new Comparator() { // from class: X.0YlV
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    InterfaceC887210YrH interfaceC887210YrH;
                    long lastMsgCreatedAt;
                    InterfaceC887210YrH interfaceC887210YrH2;
                    InterfaceC888420YtE interfaceC888420YtE;
                    InterfaceC888420YtE interfaceC888420YtE2;
                    if (obj2 instanceof InterfaceC887210YrH) {
                        interfaceC887210YrH = (InterfaceC887210YrH) obj2;
                    } else {
                        interfaceC887210YrH = null;
                    }
                    long lastMsgCreatedAt2 = 0;
                    if (interfaceC887210YrH != null && (interfaceC888420YtE2 = (InterfaceC888420YtE) interfaceC887210YrH.getExtra()) != null) {
                        lastMsgCreatedAt = interfaceC888420YtE2.getLastMsgCreatedAt();
                    } else {
                        lastMsgCreatedAt = 0;
                    }
                    if ((obj3 instanceof InterfaceC887210YrH) && (interfaceC887210YrH2 = (InterfaceC887210YrH) obj3) != null && (interfaceC888420YtE = (InterfaceC888420YtE) interfaceC887210YrH2.getExtra()) != null) {
                        lastMsgCreatedAt2 = interfaceC888420YtE.getLastMsgCreatedAt();
                    }
                    return C20085613iQ.LIZIZ(Long.valueOf(lastMsgCreatedAt2), Long.valueOf(lastMsgCreatedAt));
                }
            }, iterable);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseRelationModel@f20a.recentLoader$1$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BaseRelationModel@f20a.recentLoader$1$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends Object> list, InterfaceC1364105Vn<? super List<? extends Object>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
