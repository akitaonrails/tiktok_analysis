package X;

import Y.AgS289S0100000_8;

/* JADX INFO: renamed from: X.0LnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.minimal.MinimalAPIStateKt$asMinimalAPIStates$$inlined$mapNotNull$1$2", f = "MinimalAPIState.kt", l = {224, 225}, m = "emit")
public final class C553470LnF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS289S0100000_8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553470LnF(AgS289S0100000_8 agS289S0100000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS289S0100000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinimalAPIStateKt@c86e.asMinimalAPIStates$$inlined$mapNotNull$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("MinimalAPIStateKt@c86e.asMinimalAPIStates$$inlined$mapNotNull$1$2$1");
        return objEmit;
    }
}
