package X;

import android.view.ViewStub;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15N0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15N0 {
    public final C15N2 LIZ;

    public C15N0(ViewStub viewStub, boolean z, boolean z2) {
        if (viewStub.getParent() != null) {
            viewStub.setLayoutResource(R.layout.abz);
            viewStub.setInflatedId(R.id.buk);
            this.LIZ = (C15N2) C786410Ut5.LJLLLL(viewStub);
        } else {
            this.LIZ = (C15N2) viewStub.findViewById(R.id.buk);
        }
        C15N2 c15n2 = this.LIZ;
        if (c15n2 != null) {
            c15n2.setCommerceMusic(z);
        }
        C15N2 c15n22 = this.LIZ;
        if (c15n22 != null) {
            c15n22.setMusicUsageOrigin(z2);
        }
        C15N2 c15n23 = this.LIZ;
        if (c15n23 != null) {
            c15n23.setChangeOrGetVisibility(0);
        }
    }
}
