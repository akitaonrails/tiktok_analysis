package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0M7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.airemix.AIRemixFcpButtonConfigProvider$createClickTask$1", f = "AIRemixFcpButtonConfigProvider.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invoke")
public final class C563250M7f extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C563240M7e LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563250M7f(C563240M7e c563240M7e, InterfaceC1364105Vn<? super C563250M7f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c563240M7e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIRemixFcpButtonConfigProvider@7f65.createClickTask$1$invoke$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.invoke(null, null, this);
        C1C7U.LIZIZ("AIRemixFcpButtonConfigProvider@7f65.createClickTask$1$invoke$1");
        return objLIZ;
    }
}
