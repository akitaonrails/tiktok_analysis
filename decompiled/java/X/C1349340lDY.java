package X;

import java.util.List;
import kotlin.jvm.internal.AwS136S1200000_21;

/* JADX INFO: renamed from: X.0lDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349340lDY implements InterfaceC611520Nyg {
    public final /* synthetic */ C1349350lDZ LIZ;
    public final /* synthetic */ ViewOnClickListenerC1349290lDT LIZIZ;

    @Override // X.InterfaceC611520Nyg
    public final void onError(String str) {
        C01TT.LIZLLL(new AwS136S1200000_21(this.LIZIZ, str, this.LIZ, 1));
    }

    public C1349340lDY(C1349350lDZ c1349350lDZ, ViewOnClickListenerC1349290lDT viewOnClickListenerC1349290lDT) {
        this.LIZ = c1349350lDZ;
        this.LIZIZ = viewOnClickListenerC1349290lDT;
    }

    @Override // X.InterfaceC611520Nyg
    public final void LIZ(String str, List<String> list) {
        C1349350lDZ c1349350lDZ = this.LIZ;
        c1349350lDZ.LIZLLL = list;
        c1349350lDZ.LIZJ = (String) C13LP.LJJJLL(list);
        this.LIZ.LIZIZ = (String) C13LP.LJJJLL(list);
        C01TT.LIZLLL(new AwS136S1200000_21(this.LIZIZ, str, this.LIZ, 0));
    }
}
