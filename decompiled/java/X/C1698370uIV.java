package X;

import android.view.View;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;

/* JADX INFO: renamed from: X.0uIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698370uIV implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            case 2:
                return onApplyWindowInsets$2(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C1698370uIV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C1698370uIV c1698370uIV, View view, C20246014Ju c20246014Ju) {
        C1679620toG c1679620toG = C1679630toH.LIZ;
        int i = c20246014Ju.LIZ(8).LIZLLL - c20246014Ju.LIZ(2).LIZLLL;
        if (i < 0) {
            i = 0;
        }
        if (((InterfaceC1676320tiw) c1698370uIV.l0).LIZLLL() != i) {
            ((InterfaceC1676320tiw) c1698370uIV.l0).LJIIJ(i);
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C1698370uIV c1698370uIV, View view, C20246014Ju c20246014Ju) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) c1698370uIV.l0;
        String str = FTCVideoRecordNewActivity._pnsPageId;
        fTCVideoRecordNewActivity.getClass();
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        fTCVideoRecordNewActivity.LLJJ.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$2(C1698370uIV c1698370uIV, View view, C20246014Ju c20246014Ju) {
        int i = c20246014Ju.LIZ(2).LIZLLL;
        if (((InterfaceC1676320tiw) c1698370uIV.l0).LIZLLL() != i) {
            ((InterfaceC1676320tiw) c1698370uIV.l0).LJIIJ(i);
        }
        return c20246014Ju;
    }
}
