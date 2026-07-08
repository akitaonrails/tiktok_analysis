package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.GetAndInsertAwemeForNewUserOperator$invoke$1$1", f = "GetAndInsertAwemeForNewUserOperator.kt", l = {38}, m = "invokeSuspend")
public final class C1234620iEW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<C189200o6<Aweme>> LLILLJJLI;
    public final /* synthetic */ C1234630iEX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1234620iEW(AnonymousClass0957<? extends C189200o6<? extends Aweme>> anonymousClass0957, C1234630iEX c1234630iEX, InterfaceC1364105Vn<? super C1234620iEW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c1234630iEX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234620iEW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetAndInsertAwemeForNewUserOperator@264e.invoke$1$1");
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
            AnonymousClass0957<C189200o6<Aweme>> anonymousClass0957 = this.LLILLJJLI;
            if (anonymousClass0957 != null) {
                this.LL = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GetAndInsertAwemeForNewUserOperator@264e.invoke$1$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GetAndInsertAwemeForNewUserOperator@264e.invoke$1$1");
            return unit;
        }
        Object objM10unboximpl = ((C189200o6) obj).m10unboximpl();
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objM10unboximpl);
        if (thM5exceptionOrNullimpl != null) {
            C2276471E8n.LIZIZ.LIZJ("recommend_feed", thM5exceptionOrNullimpl, "@LinkRelation_Video", "GetAndInsert get aweme fail");
        }
        C1234630iEX c1234630iEX = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            Aweme aweme = (Aweme) objM10unboximpl;
            c1234630iEX.LIZJ = aweme;
            new C1234490iEJ(c1234630iEX.LIZ, aweme, null).LIZ();
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GetAndInsert insert ");
            sbLIZ.append(c1234630iEX.LIZIZ);
            sbLIZ.append('!');
            c2276471E8n.LIZIZ("recommend_feed", "@LinkRelation_Video", C2188811AlT.LIZIZ(sbLIZ));
        }
        C189200o6.m1boximpl(objM10unboximpl);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GetAndInsertAwemeForNewUserOperator@264e.invoke$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
