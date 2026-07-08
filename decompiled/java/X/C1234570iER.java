package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.GetAndInsertAwemeOperator$invoke$3", f = "GetAndInsertAwemeOperator.kt", l = {}, m = "invokeSuspend")
public final class C1234570iER extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1234590iET LL;
    public final /* synthetic */ User LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234570iER(C1234590iET c1234590iET, User user, InterfaceC1364105Vn<? super C1234570iER> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1234590iET;
        this.LLILLJJLI = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234570iER(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetAndInsertAwemeOperator@8e7d.invoke$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objLIZ = new C2195908iz(this.LL.LIZIZ).LIZ();
        C1234590iET c1234590iET = this.LL;
        User user = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(objLIZ)) {
            Aweme aweme = (Aweme) objLIZ;
            c1234590iET.LJ = aweme;
            if (user != null) {
                AwemeBizExtKt.setSharer(aweme, user);
            }
            new C1234490iEJ(c1234590iET.LIZ, aweme, null).LIZ();
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GetAndInsert insert ");
            sbLIZ.append(c1234590iET.LIZIZ);
            sbLIZ.append('!');
            c2276471E8n.LIZIZ("recommend_feed", "@LinkRelation_Video", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1234590iET c1234590iET2 = this.LL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZ);
        if (thM5exceptionOrNullimpl != null) {
            C2276471E8n.LIZIZ.LIZJ("recommend_feed", thM5exceptionOrNullimpl, "@LinkRelation_Video", "GetAndInsert get aweme fail");
            Context context = c1234590iET2.LIZJ.get();
            if (context != null) {
                C2196008j0.LIZIZ(context, thM5exceptionOrNullimpl);
            }
        }
        this.LL.LIZLLL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GetAndInsertAwemeOperator@8e7d.invoke$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
