package X;

import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssemV2;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1A1U, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxAssemV2$tryToDisplayComponent$1", f = "MUFQuickDMBoxAssemV2.kt", l = {403}, m = "invokeSuspend")
public final class C1A1U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MUFQuickDMBoxAssemV2 LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;
    public final /* synthetic */ C1A1K LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A1U(boolean z, MUFQuickDMBoxAssemV2 mUFQuickDMBoxAssemV2, VideoItemParams videoItemParams, C1A1K c1a1k, InterfaceC1364105Vn<? super C1A1U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = mUFQuickDMBoxAssemV2;
        this.LLILZ = videoItemParams;
        this.LLILZIL = c1a1k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1A1U(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A1U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
