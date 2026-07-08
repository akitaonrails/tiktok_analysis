package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinPublishManager$publishForward$1", f = "BulletinPublishManager.kt", l = {651}, m = "invokeSuspend")
public final class C0OKQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0OOO LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C0OP0 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OKQ(String str, C0OOO c0ooo, Map<String, String> map, C0OP0 c0op0, InterfaceC1364105Vn<? super C0OKQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c0ooo;
        this.LLILZ = map;
        this.LLILZIL = c0op0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OKQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPublishManager@9c10.publishForward$1");
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
            C0OOY c0ooy = C0OOY.LIZ;
            String str = this.LLILLJJLI;
            C0OOO c0ooo = this.LLILLL;
            Map<String, String> map = this.LLILZ;
            C0OP0 c0op0 = this.LLILZIL;
            this.LL = 1;
            if (c0ooy.LJIILLIIL(str, c0ooo, false, map, c0op0, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinPublishManager@9c10.publishForward$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPublishManager@9c10.publishForward$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
