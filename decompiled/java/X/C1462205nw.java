package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialgame.impl.jsb.GetConversationUserInfoMethodIDL$handle$2$list$1$1", f = "GetConversationUserInfoMethodIDL.kt", l = {55}, m = "invokeSuspend")
public final class C1462205nw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IMUser>, Object> {
    public int LL;
    public final /* synthetic */ C1462605o0 LLILLJJLI;
    public final /* synthetic */ Long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1462205nw(C1462605o0 c1462605o0, Long l, InterfaceC1364105Vn<? super C1462205nw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1462605o0;
        this.LLILLL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1462205nw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetConversationUserInfoMethodIDL@995f.handle$2$list$1$1");
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
            C1462605o0 c1462605o0 = this.LLILLJJLI;
            String string = this.LLILLL.toString();
            this.LL = 1;
            c1462605o0.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            IMContactApi.LIZ.getClass();
            C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.05nv
                @Override // X.InterfaceC1480505qt
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZ(Throwable th) {
                    InterfaceC1364105Vn<IMUser> interfaceC1364105Vn = c23260099m;
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZIZ(IMUser iMUser) {
                    InterfaceC1364105Vn<IMUser> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(iMUser);
                    interfaceC1364105Vn.resumeWith(iMUser);
                }
            }, string, null, "im_share", false);
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GetConversationUserInfoMethodIDL@995f.handle$2$list$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GetConversationUserInfoMethodIDL@995f.handle$2$list$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
