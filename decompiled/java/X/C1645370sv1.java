package X;

import com.ss.android.ugc.aweme.commerce.tools.common.record.CommerceToolsRecordApiComponent;
import com.ss.android.ugc.aweme.commerce.tools.common.record.ICommerceToolsRecordApiComponent;

/* JADX INFO: renamed from: X.0sv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645370sv1 extends AbstractC2255721DQs<ICommerceToolsRecordApiComponent> implements InterfaceC379610EuV {
    public final C1DRG LL;
    public final ICommerceToolsRecordApiComponent LLILLJJLI = CommerceToolsRecordApiComponent.LIZIZ(false);

    @Override // X.AbstractC2255721DQs
    public final void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI.vZ0();
    }

    @Override // X.AbstractC2255721DQs
    public final /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1645370sv1(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
