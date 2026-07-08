package X;

import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0NUR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NUR {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0NUQ] */
    public static final C0NUM LIZ(Context context) {
        final int iLIZ;
        C0O2Q c0o2q = new C0O2Q(context);
        if (Build.VERSION.SDK_INT >= 31) {
            iLIZ = C594790NUn.LIZ(context);
        } else {
            iLIZ = 0;
        }
        return new C0NUM(c0o2q, new C0NUP(iLIZ) { // from class: X.0NUQ
            public final int LIZ;

            @Override // X.C0NUP
            public final int LIZ(int i) {
                return i;
            }

            @Override // X.C0NUP
            public final int LIZIZ(int i) {
                return i;
            }

            @Override // X.C0NUP
            public final AbstractC1696400uFK LIZLLL(AbstractC1696400uFK abstractC1696400uFK) {
                return abstractC1696400uFK;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0NUQ) && this.LIZ == ((C0NUQ) obj).LIZ;
            }

            public final int hashCode() {
                return this.LIZ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AndroidFontResolveInterceptor(fontWeightAdjustment=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = iLIZ;
            }

            @Override // X.C0NUP
            public final C1680190tpB LIZJ(C1680190tpB c1680190tpB) {
                int i = this.LIZ;
                if (i != 0 && i != Integer.MAX_VALUE) {
                    return new C1680190tpB(C13LZ.LJ(c1680190tpB.LL + i, 1, LSPassThroughRecordSizeConfig.DEFAULT));
                }
                return c1680190tpB;
            }
        });
    }
}
