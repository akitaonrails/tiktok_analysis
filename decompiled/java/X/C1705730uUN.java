package X;

/* JADX INFO: renamed from: X.0uUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.batch.BoardItemRenderHandle", f = "BoardItemRenderHandle.kt", l = {82}, m = "await")
public final class C1705730uUN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1705720uUM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705730uUN(C1705720uUM c1705720uUM, InterfaceC1364105Vn<? super C1705730uUN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1705720uUM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardItemRenderHandle@6d61.await$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0L, this);
        C1C7U.LIZIZ("BoardItemRenderHandle@6d61.await$1");
        return objLIZ;
    }
}
