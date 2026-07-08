package X;

import com.bytedance.im.core.proto.MessageKey;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$batchGetMsgById$1", f = "DefaultIMUseCaseCenter.kt", l = {744}, m = "invokeSuspend")
public final class C862470XsT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ List<MessageKey> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC863600XuI<Boolean> LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862470XsT(C863650XuN c863650XuN, List<MessageKey> list, int i, InterfaceC863600XuI<Boolean> interfaceC863600XuI, Long l, String str, InterfaceC1364105Vn<? super C862470XsT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = list;
        this.LLILZ = i;
        this.LLILZIL = interfaceC863600XuI;
        this.LLILZLL = l;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862470XsT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.batchGetMsgById$1");
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
            C0YD1 c0yd1LJJI = this.LLILLJJLI.LLILZIL.LJJI();
            List<MessageKey> list = this.LLILLL;
            int i2 = this.LLILZ;
            InterfaceC863600XuI<Boolean> interfaceC863600XuI = this.LLILZIL;
            Long l = this.LLILZLL;
            String str = this.LLIZ;
            this.LL = 1;
            if (c0yd1LJJI.LIZ(list, i2, interfaceC863600XuI, l, str, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.batchGetMsgById$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.batchGetMsgById$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
