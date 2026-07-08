package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DY6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.lynxwithvideo.protocol.SearchLynxWithVideoCardProtocol$config$1$streamConfig$1$loadMore$1", f = "SearchLynxWithVideoCardProtocol.kt", l = {164, 165}, m = "invokeSuspend")
public final class C0DY6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0DYB LLILLL;
    public final /* synthetic */ C0PHX LLILZ;
    public final /* synthetic */ Function1<Object, Unit> LLILZIL;
    public final /* synthetic */ Function1<Exception, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0DY6(C0DYB c0dyb, C0PHX c0phx, Function1<Object, Unit> function1, Function1<? super Exception, Unit> function12, InterfaceC1364105Vn<? super C0DY6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0dyb;
        this.LLILZ = c0phx;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DY6(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("SearchLynxWithVideoCardProtocol@c40d.config$1$streamConfig$1$loadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZLL.invoke(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LL;
                    C155000ia.LIZIZ(obj);
                    this.LLILZIL.invoke(obj2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchLynxWithVideoCardProtocol@c40d.config$1$streamConfig$1$loadMore$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0DYB c0dyb = this.LLILLL;
            this.LLILLJJLI = 1;
            obj = c0dyb.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchLynxWithVideoCardProtocol@c40d.config$1$streamConfig$1$loadMore$1");
                return objLJFF;
            }
        }
        List<? extends Aweme> list = (List) obj;
        C640980PCe c640980PCe = C640980PCe.LIZIZ;
        C0PHX c0phx = this.LLILZ;
        this.LL = list;
        this.LLILLJJLI = 2;
        if (c640980PCe.LIZ(c0phx, list, this) == objLJFF) {
            C1C7U.LIZIZ("SearchLynxWithVideoCardProtocol@c40d.config$1$streamConfig$1$loadMore$1");
            return objLJFF;
        }
        obj2 = list;
        this.LLILZIL.invoke(obj2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchLynxWithVideoCardProtocol@c40d.config$1$streamConfig$1$loadMore$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
