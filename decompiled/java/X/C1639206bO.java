package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06bO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1639206bO extends C2217421BqW implements Function0<Unit> {
    public C1639206bO(C1638806bK c1638806bK) {
        super(0, c1638806bK, C1638806bK.class, "onDeleteConversationClick", "onDeleteConversationClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1638806bK c1638806bK = (C1638806bK) this.receiver;
        InterfaceC1639706bT value = c1638806bK.LLIZ.LJ.getValue();
        if (value != null) {
            value.nY0();
        }
        c1638806bK.LLILZLL.invoke();
        return Unit.LIZ;
    }
}
