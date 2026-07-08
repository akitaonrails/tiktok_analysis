package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.tuc.TUCMaskData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.101M, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101M extends C101H<C101Y> {
    public final String LIZIZ;
    public final TUCMaskData LIZJ;
    public final C101G LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    @Override // X.InterfaceC722470SVp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C07XH LIZ() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101M.LIZ():X.07XH");
    }

    @Override // X.C101H
    public final /* bridge */ /* synthetic */ C101D LIZIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // X.C101H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(java.lang.String r4) {
        /*
            r3 = this;
            android.content.Context r2 = r3.LIZ
            int r0 = r4.hashCode()
            r1 = -1
            switch(r0) {
                case -1975138748: goto L16;
                case 808748596: goto L22;
                case 808748597: goto L2e;
                default: goto La;
            }
        La:
            r0 = -1
        Lb:
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r2)
            if (r0 == 0) goto L15
            int r1 = r0.intValue()
        L15:
            return r1
        L16:
            java.lang.String r0 = "BGCreation"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131099665(0x7f060011, float:1.781169E38)
            goto Lb
        L22:
            java.lang.String r0 = "ConstTextInverse4"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131099771(0x7f06007b, float:1.7811905E38)
            goto Lb
        L2e:
            java.lang.String r0 = "ConstTextInverse5"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto La
            r0 = 2131099772(0x7f06007c, float:1.7811907E38)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101M.LIZJ(java.lang.String):int");
    }

    @Override // X.C101H
    public final int LIZLLL(String str) {
        if (Intrinsics.LJFF(str, "icon_large_protection")) {
            return R.raw.icon_large_protection;
        }
        if (Intrinsics.LJFF(str, "icon_chevron_up_double_fill")) {
            return R.raw.icon_chevron_up_double_fill;
        }
        return -1;
    }

    @Override // X.C101H
    public final int LJ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1580343813) {
            if (iHashCode != -947361030) {
                if (iHashCode == -763351276 && str.equals("tuc_biz_ic_report_success")) {
                    return R.drawable.ffu;
                }
                return -1;
            }
            if (str.equals("tuc_biz_ic_photosensitive_content")) {
                return R.drawable.fft;
            }
            return -1;
        }
        if (str.equals("tuc_ic_not_suit_content")) {
            return R.drawable.ffw;
        }
        return -1;
    }

    public C101M(Context context, String str, TUCMaskData tUCMaskData) {
        super(context);
        this.LIZIZ = str;
        this.LIZJ = tUCMaskData;
        this.LIZLLL = new C101G();
    }
}
