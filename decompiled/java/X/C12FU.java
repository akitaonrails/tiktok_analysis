package X;

import com.ss.android.ugc.aweme.tako.model.AIBotInfo;

/* JADX INFO: renamed from: X.12FU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.botshare.drawer.BotSharedDrawer", f = "BotSharedDrawer.kt", l = {73, 75}, m = "drawCover")
public final class C12FU extends AbstractC23140094w {
    public AIBotInfo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C12FV LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12FU(C12FV c12fv, InterfaceC1364105Vn<? super C12FU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c12fv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BotSharedDrawer@74f5.drawCover$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("BotSharedDrawer@74f5.drawCover$1");
        return objLIZ;
    }
}
