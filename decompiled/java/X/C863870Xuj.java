package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.DefaultIMUseCaseCenter$getMsgInConvAroundIndex$1", f = "DefaultIMUseCaseCenter.kt", l = {816}, m = "invokeSuspend")
public final class C863870Xuj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C863650XuN LLILLJJLI;
    public final /* synthetic */ C0Y8T LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ InterfaceC863600XuI<List<C869590Y9l>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863870Xuj(C863650XuN c863650XuN, C0Y8T c0y8t, long j, InterfaceC863600XuI<List<C869590Y9l>> interfaceC863600XuI, InterfaceC1364105Vn<? super C863870Xuj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c863650XuN;
        this.LLILLL = c0y8t;
        this.LLILZ = j;
        this.LLILZIL = interfaceC863600XuI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863870Xuj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultIMUseCaseCenter@568c.getMsgInConvAroundIndex$1");
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
            C869090Y7n c869090Y7nLJII = this.LLILLJJLI.LLILZIL.LJII();
            int inboxType = this.LLILLL.getInboxType();
            String conversationId = this.LLILLL.getConversationId();
            long conversationShortId = this.LLILLL.getConversationShortId();
            int conversationType = this.LLILLL.getConversationType();
            long j = this.LLILZ;
            this.LL = 1;
            obj = c869090Y7nLJII.LIZJ(inboxType, conversationType, conversationId, conversationShortId, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.getMsgInConvAroundIndex$1");
                return objLJFF;
            }
        }
        C863880Xuk c863880Xuk = (C863880Xuk) obj;
        InterfaceC863600XuI<List<C869590Y9l>> interfaceC863600XuI = this.LLILZIL;
        if (interfaceC863600XuI != null) {
            if (c863880Xuk.LIZIZ) {
                interfaceC863600XuI.onSuccess(c863880Xuk.LIZJ);
            } else {
                C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
                int i2 = c863880Xuk.LIZ.LIZIZ;
                C0YMW c0ymw = c0ymxNewBuilder.LIZ;
                c0ymw.code = i2;
                interfaceC863600XuI.LIZIZ(c0ymw);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultIMUseCaseCenter@568c.getMsgInConvAroundIndex$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
