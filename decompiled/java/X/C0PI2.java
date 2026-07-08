package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0PI2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PI2 extends Aweme implements InterfaceC1858000yRy {
    public static final int $stable = 8;
    public int LL = C1919107fR.LIZ();

    @Override // X.InterfaceC1858000yRy
    public String retrieveIncrementalId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tako_out_");
        sbLIZ.append(getAid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public int getMessageTopMargin() {
        return this.LL;
    }

    @Override // X.InterfaceC1858000yRy
    public void setMessageTopMargin(int i) {
        this.LL = i;
    }
}
