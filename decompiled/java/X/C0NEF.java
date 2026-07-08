package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS52S2100000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0NEF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEF implements C0NEE {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ C013C LIZIZ;

    @Override // X.C0NEE
    public final String getScene() {
        return "";
    }

    @Override // X.C0NEE
    public final void LIZJ() {
        C593360NPa.LIZIZ(new AwS553S0100000_9(this.LIZ, 1823));
    }

    @Override // X.C0NEE
    public final String getKey() {
        return this.LIZ.getAid();
    }

    @Override // X.C0NEE
    public final void LJIIJ(String str) {
        C593360NPa.LIZIZ(new AwS553S0100000_9(this.LIZ, 1824));
    }

    @Override // X.C0NEE
    public final void onSuccess(String str) {
        this.LIZIZ.element = true;
        C593360NPa.LIZIZ(new AwS553S0100000_9(this.LIZ, 1825));
    }

    public C0NEF(Aweme aweme, C013C c013c) {
        this.LIZ = aweme;
        this.LIZIZ = c013c;
    }

    @Override // X.C0NEE
    public final void LIZ(String str, String str2) {
        C593360NPa.LIZIZ(new AwS52S2100000_9(str, str2, this.LIZ, 2));
    }

    @Override // X.C0NEE
    public final void LIZIZ(String str, String str2) {
        C593360NPa.LIZIZ(new AwS52S2100000_9(str, str2, this.LIZ, 3));
    }
}
