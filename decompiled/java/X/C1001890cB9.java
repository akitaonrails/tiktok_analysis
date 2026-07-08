package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cB9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem$handleRepost$1", f = "QuickShareButtonAssem.kt", l = {448}, m = "invokeSuspend")
public final class C1001890cB9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ QuickShareButtonAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001890cB9(QuickShareButtonAssem quickShareButtonAssem, InterfaceC1364105Vn<? super C1001890cB9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = quickShareButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001890cB9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickShareButtonAssem@fab9.handleRepost$1");
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
            C1004140cEm.LIZ.getClass();
            long j = C1004140cEm.LIZ().repostTriggerDelay;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("QuickShareButtonAssem@fab9.handleRepost$1");
                return objLJFF;
            }
        }
        QuickShareButtonAssem quickShareButtonAssem = this.LLILLJJLI;
        quickShareButtonAssem.Vp((VideoItemParams) C631370Opb.LIZ(quickShareButtonAssem), "repost", null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickShareButtonAssem@fab9.handleRepost$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
