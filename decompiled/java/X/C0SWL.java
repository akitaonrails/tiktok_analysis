package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;

/* JADX INFO: renamed from: X.0SWL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SWL extends C0SQC {
    public final int LL;
    public final int LLILLJJLI;
    public final DataCenter LLILLL;

    @Override // X.C0SQC, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C0SWL) && ((C0SWL) interfaceC1891350zJl).LL == this.LL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C0SWL;
    }

    public C0SWL(int i, int i2, DataCenter dataCenter) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = dataCenter;
    }
}
