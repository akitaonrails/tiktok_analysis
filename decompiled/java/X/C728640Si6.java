package X;

import com.ss.android.ugc.aweme.setting.model.RestrictInfo;

/* JADX INFO: renamed from: X.0Si6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728640Si6 extends C728670Si9<C0R6K, InterfaceC728650Si7> implements InterfaceC1526205yG {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1526205yG
    public final void onSuccess() {
        V v = this.LLILLJJLI;
        if (v != 0) {
            ((InterfaceC728650Si7) v).LJJIJLIJ((RestrictInfo) ((AbstractC728630Si5) this.LL).LLILLJJLI);
        }
    }

    @Override // X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        V v = this.LLILLJJLI;
        if (v != 0) {
            ((InterfaceC728650Si7) v).LJJIIZ();
        }
    }

    public C728640Si6(C0R6K c0r6k, InterfaceC728650Si7 interfaceC728650Si7) {
        super(c0r6k, interfaceC728650Si7);
        ((AbstractC728630Si5) this.LL).LIZ(this);
    }
}
