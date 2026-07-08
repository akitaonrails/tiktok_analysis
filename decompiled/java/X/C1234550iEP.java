package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iEP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.ShowInviteDialogOperator$invoke$1", f = "ShowInviteDialogOperator.kt", l = {61, 70}, m = "invokeSuspend")
public final class C1234550iEP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C1234530iEN LLILLJJLI;
    public Aweme LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1234530iEN LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234550iEP(C1234530iEN c1234530iEN, InterfaceC1364105Vn<? super C1234550iEP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1234530iEN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234550iEP(this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objM10unboximpl;
        C1234530iEN c1234530iEN;
        Aweme aweme;
        C1C7U.LIZ("ShowInviteDialogOperator@11e1.invoke$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    aweme = this.LLILLL;
                    c1234530iEN = this.LLILLJJLI;
                    objM10unboximpl = this.LL;
                    C155000ia.LIZIZ(obj);
                    c1234530iEN.LJII = aweme;
                    C189200o6.m1boximpl(objM10unboximpl);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ShowInviteDialogOperator@11e1.invoke$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<? extends C189200o6<? extends Aweme>> anonymousClass0957 = this.LLILZIL.LJIIIIZZ;
            if (anonymousClass0957 != null) {
                this.LLILZ = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShowInviteDialogOperator@11e1.invoke$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ShowInviteDialogOperator@11e1.invoke$1");
            return unit2;
        }
        objM10unboximpl = ((C189200o6) obj).m10unboximpl();
        C1234530iEN c1234530iEN2 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objM10unboximpl);
        if (thM5exceptionOrNullimpl != null) {
            C2276471E8n.LIZIZ.LIZJ("recommend_feed", thM5exceptionOrNullimpl, "@LinkRelation_Video", "dialog get aweme fail");
            Context context = c1234530iEN2.LIZ.getContext();
            if (context != null) {
                C2196008j0.LIZIZ(context, thM5exceptionOrNullimpl);
            }
        }
        c1234530iEN = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            aweme = (Aweme) objM10unboximpl;
            AwemeBizExtKt.setSharer(aweme, c1234530iEN.LIZLLL);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1234610iEV c1234610iEV = new C1234610iEV(aweme, c1234530iEN, null);
            this.LL = objM10unboximpl;
            this.LLILLJJLI = c1234530iEN;
            this.LLILLL = aweme;
            this.LLILZ = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1234610iEV) == objLJFF) {
                C1C7U.LIZIZ("ShowInviteDialogOperator@11e1.invoke$1");
                return objLJFF;
            }
            c1234530iEN.LJII = aweme;
        }
        C189200o6.m1boximpl(objM10unboximpl);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("ShowInviteDialogOperator@11e1.invoke$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
