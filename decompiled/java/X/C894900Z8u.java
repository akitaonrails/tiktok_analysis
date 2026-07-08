package X;

import com.ss.android.ugc.aweme.im.service.IAuthorSupporterHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.BaseRelationModel$recentLoader$2$1", f = "BaseRelationModel.kt", l = {}, m = "invokeSuspend")
public final class C894900Z8u extends C09AX implements Function2<C0Y8T, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1382100m4O LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C894900Z8u(C1382100m4O c1382100m4O, InterfaceC1364105Vn<? super C894900Z8u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1382100m4O;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C894900Z8u c894900Z8u = new C894900Z8u(this.LLILLJJLI, interfaceC1364105Vn);
        c894900Z8u.LL = obj;
        return c894900Z8u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Z6T c0z6t;
        C1C7U.LIZ("BaseRelationModel@f20a.recentLoader$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y8T c0y8t = (C0Y8T) this.LL;
        C1382100m4O c1382100m4O = this.LLILLJJLI;
        c1382100m4O.getClass();
        boolean z = false;
        if ((c0y8t.getInboxType() != 5 || !c0y8t.getConversationTags().contains("_remix_")) && ((!c0y8t.isGroupChat() || (!c1382100m4O.LIZ.LJIIL && (c0z6t = (C0Z6T) c1382100m4O.LIZIZ.getValue()) != null && c0z6t.LJIIIZ(c0y8t) && !C1336205Ku.LIZ(false).getBulletinBoardService().f0(c0y8t.getConversationId()))) && !((IAuthorSupporterHelper) c1382100m4O.LIZJ.getValue()).LJ(c0y8t) && c0y8t.getLastShowMessage() != null)) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("BaseRelationModel@f20a.recentLoader$2$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0Y8T c0y8t, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c0y8t, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
