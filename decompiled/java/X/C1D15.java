package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.share.linkshare.OpenLinkShareMainActivity;

/* JADX INFO: renamed from: X.1D15, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D15 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
        }
    }

    public C1D15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(C1D15 c1d15, DialogInterface dialogInterface) {
        OpenLinkShareMainActivity openLinkShareMainActivity = (OpenLinkShareMainActivity) c1d15.l0;
        openLinkShareMainActivity.LLILLJJLI = null;
        openLinkShareMainActivity.close();
    }

    public static final void onDismiss$1(C1D15 c1d15, DialogInterface dialogInterface) {
        C1B0R c1b0r;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDismissListener, selectResultCallback");
        sbLIZ.append(((C1B0K) c1d15.l0).LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = TuxSheet._pnsPageId;
        if (!(C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343950De5) && (c1b0r = ((C1B0K) c1d15.l0).LIZIZ) != null) {
            c1b0r.LIZ();
        }
        C1B0K c1b0k = (C1B0K) c1d15.l0;
        c1b0k.LIZ = null;
        c1b0k.LIZIZ = null;
    }

    public static final void onDismiss$2(C1D15 c1d15, DialogInterface dialogInterface) {
        C1B0S c1b0s;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDismissListener, selectResultCallback");
        sbLIZ.append(((C1B0L) c1d15.l0).LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = TuxSheet._pnsPageId;
        if (!(C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343950De5) && (c1b0s = ((C1B0L) c1d15.l0).LIZIZ) != null) {
            c1b0s.LIZ();
        }
        C1B0L c1b0l = (C1B0L) c1d15.l0;
        c1b0l.LIZ = null;
        c1b0l.LIZIZ = null;
    }

    public static final void onDismiss$3(C1D15 c1d15, DialogInterface dialogInterface) {
        C1B0H c1b0h;
        String str = TuxSheet._pnsPageId;
        if (!(C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343950De5) && (c1b0h = ((C1B0J) c1d15.l0).LIZIZ) != null) {
            c1b0h.LIZ();
        }
        C1B0J c1b0j = (C1B0J) c1d15.l0;
        c1b0j.LIZ = null;
        c1b0j.LIZIZ = null;
    }

    public static final void onDismiss$4(C1D15 c1d15, DialogInterface dialogInterface) {
        C1B3Q c1b3q = C1B3Q.LIZ;
        BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) c1d15.l0;
        String str = baseI18nAuthorizedFragment.LLJILJILJ;
        String strUR = baseI18nAuthorizedFragment.UR();
        BaseI18nAuthorizedFragment baseI18nAuthorizedFragment2 = (BaseI18nAuthorizedFragment) c1d15.l0;
        boolean z = baseI18nAuthorizedFragment2.LLJJI;
        String str2 = baseI18nAuthorizedFragment2.LLJ;
        String str3 = null;
        if (str2 == null) {
            str2 = null;
        }
        String str4 = baseI18nAuthorizedFragment2.LLJI;
        if (str4 != null) {
            str3 = str4;
        }
        c1b3q.getClass();
        C1B3Q.LIZ(str, strUR, str2, str3, null, null, null, z);
    }
}
