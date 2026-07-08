package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupMemberSearchContentSyncEngine$onInsertOrUpdate$1", f = "GroupMemberSearchContentSyncEngine.kt", l = {159}, m = "invokeSuspend")
public final class C907370Zih extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C0YAE> LLILLJJLI;
    public final /* synthetic */ C907410Zil LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907370Zih(List<C0YAE> list, C907410Zil c907410Zil, InterfaceC1364105Vn<? super C907370Zih> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c907410Zil;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907370Zih(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YAE c0yae;
        C1C7U.LIZ("GroupMemberSearchContentSyncEngine@4955.onInsertOrUpdate$1");
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
            List<C0YAE> list = this.LLILLJJLI;
            if (list != null && (c0yae = (C0YAE) C13LP.LJJJLL(list)) != null) {
                if (C0YNP.LJII(c0yae.getConversationId()) == -1) {
                    C1231704rr c1231704rr = this.LLILLL.LJI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onInsertOrUpdate conversation id ");
                    sbLIZ.append(c0yae.getConversationId());
                    sbLIZ.append(" size ");
                    sbLIZ.append(this.LLILLJJLI.size());
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1231704rr.LIZIZ();
                    C907410Zil c907410Zil = this.LLILLL;
                    List<C0YAE> list2 = this.LLILLJJLI;
                    this.LL = 1;
                    obj = c907410Zil.LIZIZ(list2, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("GroupMemberSearchContentSyncEngine@4955.onInsertOrUpdate$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GroupMemberSearchContentSyncEngine@4955.onInsertOrUpdate$1");
                    return unit;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("GroupMemberSearchContentSyncEngine@4955.onInsertOrUpdate$1");
                return unit2;
            }
        }
        this.LLILLL.LIZIZ.LJFF((List) obj, true);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("GroupMemberSearchContentSyncEngine@4955.onInsertOrUpdate$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
