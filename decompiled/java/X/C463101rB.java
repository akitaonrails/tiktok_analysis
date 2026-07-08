package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.PlaySubtitleConfigController$computeAsync$1", f = "PlaySubtitleConfigController.kt", l = {97, 98}, m = "invokeSuspend")
public final class C463101rB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C463101rB(Aweme aweme, InterfaceC1364105Vn<? super C463101rB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C463101rB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaySubtitleConfigController@5709.computeAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C20702615zk c20702615zk = C20702615zk.LIZ;
                    Aweme aweme = this.LLILLJJLI;
                    c20702615zk.getClass();
                    C20702615zk.LIZ(aweme);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PlaySubtitleConfigController@5709.computeAsync$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<Boolean> c05ydUg = C162B.LIZIZ.Ug();
            C463001rA c463001rA = new C463001rA(null);
            this.LL = 1;
            if (C09IC.LJIJ(c05ydUg, this, c463001rA) == objLJFF) {
                C1C7U.LIZIZ("PlaySubtitleConfigController@5709.computeAsync$1");
                return objLJFF;
            }
        }
        this.LL = 2;
        if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
            C1C7U.LIZIZ("PlaySubtitleConfigController@5709.computeAsync$1");
            return objLJFF;
        }
        C20702615zk c20702615zk2 = C20702615zk.LIZ;
        Aweme aweme2 = this.LLILLJJLI;
        c20702615zk2.getClass();
        C20702615zk.LIZ(aweme2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PlaySubtitleConfigController@5709.computeAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
