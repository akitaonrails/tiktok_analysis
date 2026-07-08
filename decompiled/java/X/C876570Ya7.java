package X;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ya7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushManager$onGetModifyPropertyMsg$1$onSuccess$1", f = "IMInnerPushManager.kt", l = {}, m = "invokeSuspend")
public final class C876570Ya7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C0YT8> LL;
    public final /* synthetic */ C876680YaI LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ C0Y8T LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876570Ya7(List<C0YT8> list, C876680YaI c876680YaI, C869590Y9l c869590Y9l, C0Y8T c0y8t, InterfaceC1364105Vn<? super C876570Ya7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c876680YaI;
        this.LLILLL = c869590Y9l;
        this.LLILZ = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876570Ya7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInnerPushManager@1506.onGetModifyPropertyMsg$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C013C c013c = new C013C();
        List<C0YT8> list = this.LL;
        if (list != null) {
            C869590Y9l c869590Y9l = this.LLILLL;
            C0Y8T c0y8t = this.LLILZ;
            C876680YaI c876680YaI = this.LLILLJJLI;
            for (C0YT8 c0yt8 : list) {
                C876550Ya5.LJI.getClass();
                C876550Ya5 c876550Ya5 = new C876550Ya5(EnumC876650YaF.PROPERTY, null, c869590Y9l, c0y8t, c0y8t.getConversationId(), c0yt8, 66);
                if (C876630YaD.LIZJ(c876550Ya5)) {
                    C879090YeB c879090YeBLIZIZ = c876680YaI.LIZIZ();
                    ((LinkedBlockingDeque) c879090YeBLIZIZ.LIZJ).offer(c876550Ya5);
                    C876800YaU c876800YaU = c879090YeBLIZIZ.LIZ;
                    if (c876800YaU != null) {
                        C876800YaU.LIZ(c876800YaU, "enqueue_unit", C1906580ziK.LJI());
                    }
                    c013c.element = true;
                }
            }
        }
        if (c013c.element) {
            this.LLILLJJLI.LIZIZ().LIZJ(EnumC1989807qq.SINGLE_UNIT_ENQUEUE);
            this.LLILLJJLI.LJ(1000L);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInnerPushManager@1506.onGetModifyPropertyMsg$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
