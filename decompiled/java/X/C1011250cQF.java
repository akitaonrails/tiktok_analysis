package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cQF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011250cQF implements InterfaceC1003440cDe {
    public final /* synthetic */ InterfaceC1011430cQX LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ C1004580cFU LIZJ;

    @Override // X.InterfaceC1003440cDe
    public final View LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1003440cDe
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1003440cDe
    public final void LJ(View view) {
    }

    @Override // X.InterfaceC1003440cDe
    public final void LJFF(String str) {
    }

    @Override // X.InterfaceC1003440cDe
    public final void LJI(View view) {
    }

    @Override // X.InterfaceC1003440cDe
    public final Function0<Unit> LJII() {
        return new AwS560S0100000_16(this.LIZ, 644);
    }

    public C1011250cQF(C1004580cFU c1004580cFU, C1011580cQm c1011580cQm, Aweme aweme) {
        this.LIZ = c1011580cQm;
        this.LIZIZ = aweme;
        this.LIZJ = c1004580cFU;
    }

    @Override // X.InterfaceC1003440cDe
    public final void LIZJ(View view, Integer num, Integer num2) {
        C423340Giq.LIZIZ(view, num, num2);
        C0R12.LIZIZ.LJIIIIZZ().LIZLLL(3, this.LIZIZ);
        C1004580cFU c1004580cFU = this.LIZJ;
        if (c1004580cFU != null) {
            c1004580cFU.LIZ = 3;
        }
    }
}
