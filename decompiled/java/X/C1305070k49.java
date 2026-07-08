package X;

import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.interact.digg.VibeDiggOperatorImpl$startPlayAnimation$2$1", f = "VibeDiggOperatorImpl.kt", l = {105}, m = "invokeSuspend")
public final class C1305070k49 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1305090k4B LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1305090k4B LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305070k49(C1305090k4B c1305090k4B, InterfaceC1364105Vn<? super C1305070k49> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1305090k4B;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1305070k49(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1305090k4B c1305090k4B;
        C1C7U.LIZ("VibeDiggOperatorImpl@9bb0.startPlayAnimation$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c1305090k4B = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1305090k4B = this.LLILLL;
            this.LL = c1305090k4B;
            this.LLILLJJLI = 1;
            C1389510mGL c1389510mGL = c1305090k4B.LIZ;
            c1389510mGL.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C19469311Fb(c1389510mGL, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VibeDiggOperatorImpl@9bb0.startPlayAnimation$2$1");
                return objLJFF;
            }
        }
        c1305090k4B.LJI = (DataSource) obj;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VibeDiggOperatorImpl@9bb0.startPlayAnimation$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
