package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: renamed from: X.0IBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462560IBy {
    public final C0I7C LIZ;

    public C462560IBy(final ClipData clipData, final int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.LIZ = new C0I7C(clipData, i) { // from class: X.13kW
                public final ContentInfo.Builder LIZ;

                @Override // X.C0I7C
                public final C20098713kX build() {
                    return new C20098713kX(new C20098513kV(this.LIZ.build()));
                }

                @Override // X.C0I7C
                public final void LIZ(Uri uri) {
                    this.LIZ.setLinkUri(uri);
                }

                @Override // X.C0I7C
                public final void LIZIZ(int i2) {
                    this.LIZ.setFlags(i2);
                }

                @Override // X.C0I7C
                public final void setExtras(Bundle bundle) {
                    this.LIZ.setExtras(bundle);
                }

                {
                    this.LIZ = new ContentInfo.Builder(clipData, i);
                }
            };
        } else {
            this.LIZ = new C20098813kY(clipData, i);
        }
    }
}
