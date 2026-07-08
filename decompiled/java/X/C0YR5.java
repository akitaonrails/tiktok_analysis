package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YR5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadReactionHandler$getData$oldestMessageIndexWithUnreadMessageProperty$1", f = "UnreadHandler.kt", l = {149}, m = "invokeSuspend")
public final class C0YR5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YR5(long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YR5(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnreadReactionHandler@cf7c.getData$oldestMessageIndexWithUnreadMessageProperty$1");
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
            InterfaceC873120YNa interfaceC873120YNaLIZ = C0YNZ.LIZ(InterfaceC873120YNa.LIZ);
            String str = this.LLILLJJLI;
            long j = this.LLILLL;
            this.LL = 1;
            obj = interfaceC873120YNaLIZ.LIZ(j, str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UnreadReactionHandler@cf7c.getData$oldestMessageIndexWithUnreadMessageProperty$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UnreadReactionHandler@cf7c.getData$oldestMessageIndexWithUnreadMessageProperty$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
