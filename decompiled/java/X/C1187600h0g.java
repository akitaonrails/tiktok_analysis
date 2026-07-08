package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187600h0g implements C14NM {
    public final String LL;
    public final Aweme LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187600h0g)) {
            return false;
        }
        C1187600h0g c1187600h0g = (C1187600h0g) obj;
        return Intrinsics.LJFF(this.LL, c1187600h0g.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1187600h0g.LLILLJJLI) && this.LLILLL == c1187600h0g.LLILLL && this.LLILZ == c1187600h0g.LLILZ && this.LLILZIL == c1187600h0g.LLILZIL;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiVideoListItemItem(poiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", userDigChanged=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", postBottomBarStyle=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // X.InterfaceC1891350zJl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areContentsTheSame(X.InterfaceC1891350zJl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C1187600h0g
            r3 = 0
            if (r0 == 0) goto L34
            X.0h0g r5 = (X.C1187600h0g) r5
            if (r5 == 0) goto L35
            java.lang.String r1 = r5.LL
        Lb:
            java.lang.String r0 = r4.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 0
            if (r0 == 0) goto L33
            if (r5 == 0) goto L1e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LLILLJJLI
            if (r0 == 0) goto L1e
            java.lang.String r3 = r0.getAid()
        L1e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILLJJLI
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L33
            if (r5 == 0) goto L33
            int r1 = r5.LLILZ
            int r0 = r4.LLILZ
            if (r1 != r0) goto L33
            r2 = 1
        L33:
            return r2
        L34:
            r5 = r3
        L35:
            r1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187600h0g.areContentsTheSame(X.0zJl):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // X.InterfaceC1891350zJl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areItemTheSame(X.InterfaceC1891350zJl r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C1187600h0g
            r2 = 0
            if (r0 == 0) goto L2b
            X.0h0g r4 = (X.C1187600h0g) r4
            if (r4 == 0) goto L2c
            java.lang.String r1 = r4.LL
        Lb:
            java.lang.String r0 = r3.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2e
            if (r4 == 0) goto L1d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILLJJLI
            if (r0 == 0) goto L1d
            java.lang.String r2 = r0.getAid()
        L1d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLILLJJLI
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L2e
            r0 = 1
            return r0
        L2b:
            r4 = r2
        L2c:
            r1 = r2
            goto Lb
        L2e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187600h0g.areItemTheSame(X.0zJl):boolean");
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1187600h0g) && ((C1187600h0g) interfaceC1891350zJl).LLILZ != this.LLILZ) {
            return new Object() { // from class: X.0h0f
            };
        }
        return null;
    }

    public static C1187600h0g LIZ(C1187600h0g c1187600h0g, int i) {
        return new C1187600h0g(c1187600h0g.LLILLJJLI, c1187600h0g.LLILLL, c1187600h0g.LL, i, c1187600h0g.LLILZIL);
    }

    public /* synthetic */ C1187600h0g(String str, Aweme aweme, int i, int i2, int i3) {
        this(aweme, (i3 & 4) != 0 ? 50003 : i, str, 0, (i3 & 16) != 0 ? 0 : i2);
    }

    public C1187600h0g(Aweme aweme, int i, String str, int i2, int i3) {
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
    }
}
