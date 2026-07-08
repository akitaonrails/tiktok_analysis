package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21149417pc extends C09AY implements Function0<String> {
    public final /* synthetic */ AbstractC21154817qU LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21149417pc(ViewTreeObserverOnScrollChangedListenerC21156017qg viewTreeObserverOnScrollChangedListenerC21156017qg, int i, C259800zU c259800zU) {
        super(0);
        this.LL = viewTreeObserverOnScrollChangedListenerC21156017qg;
        this.LLILLJJLI = i;
        this.LLILLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTagFromAnchorView[");
        sbLIZ.append(this.LL.LLJIJIL);
        sbLIZ.append("]: (key: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("), (tag: ");
        sbLIZ.append(this.LLILLL.element);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
