package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166360gSQ implements C0POE<ShopChunkResponse> {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ StoreMixViewModel LIZIZ;
    public final /* synthetic */ C1166240gSE LIZJ;

    @Override // X.C0POE
    public final void onComplete() {
        StoreMixViewModel storeMixViewModel = this.LIZIZ;
        storeMixViewModel.getClass();
        storeMixViewModel.withState(new AwS597S0100000_18(storeMixViewModel, 786));
        C1163430gNh c1163430gNh = C1163360gNa.LIZ;
    }

    @Override // X.C0POE
    public final void onFailed(Throwable th) {
        StoreMixViewModel storeMixViewModel = this.LIZIZ;
        storeMixViewModel.getClass();
        storeMixViewModel.withState(new AwS597S0100000_18(storeMixViewModel, 786));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021a A[EDGE_INSN: B:147:0x021a->B:90:0x021a BREAK  A[LOOP:4: B:79:0x01b3->B:151:0x01b3]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024b  */
    @Override // X.C0POE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNext(com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse r21) {
        /*
            Method dump skipped, instruction units count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1166360gSQ.onNext(java.lang.Object):void");
    }

    public C1166360gSQ(boolean z, StoreMixViewModel storeMixViewModel, C1166240gSE c1166240gSE) {
        this.LIZ = z;
        this.LIZIZ = storeMixViewModel;
        this.LIZJ = c1166240gSE;
    }
}
