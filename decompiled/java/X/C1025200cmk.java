package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025200cmk implements InterfaceC19421610yc {
    @Override // X.InterfaceC19421610yc
    public final void LIZJ() {
    }

    @Override // X.InterfaceC19421610yc
    public final void LJ(C19EG c19eg) {
        C1025090cmZ c1025090cmZ = new C1025090cmZ();
        c1025090cmZ.LIZ = c19eg;
        c1025090cmZ.LIZJ = 2;
        c1025090cmZ.LIZLLL = 0;
        C1025100cma c1025100cmaLIZIZ = c1025090cmZ.LIZIZ();
        Context context = c1025100cmaLIZIZ.LIZ;
        if (context != null && C1388190mED.LIZ(context) != null) {
            FrameLayout frameLayoutLIZ = C989390bqz.LIZ(c19eg);
            C1035340d36 c1035340d36 = null;
            if (frameLayoutLIZ != null) {
                c1035340d36 = (C1035340d36) frameLayoutLIZ.findViewById(R.id.dn6);
            }
            if ((c1035340d36 instanceof C1035340d36) && c1035340d36 != null && !c1035340d36.LJIIJJI()) {
                FrameLayout frameLayoutLIZ2 = C989390bqz.LIZ(c19eg);
                if (frameLayoutLIZ2 != null) {
                    C786410Ut5.LJZ(0, frameLayoutLIZ2);
                }
                c1035340d36.getActionMode().LJIIIIZZ = c1025100cmaLIZIZ.LIZLLL;
                c1035340d36.LJJIFFI(c1025100cmaLIZIZ);
            }
        }
    }

    @Override // X.InterfaceC19421610yc
    public final boolean LIZLLL(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1024900cmG.LJI(context, UriProtector.parse(str));
    }

    @Override // X.InterfaceC19421610yc
    public final void LJFF(C19EG c19eg, String str) {
        View viewFindViewById;
        if (c19eg == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromChallenge", true);
        C1025210cml c1025210cml = new C1025210cml();
        c1025210cml.LIZJ = bundle;
        c1025210cml.LJ = c19eg;
        c1025210cml.LIZ = str;
        c1025210cml.LIZIZ = C497820Jfg.LIZJ(c19eg);
        c1025210cml.LJI = true;
        C1025930cnv c1025930cnvLIZ = c1025210cml.LIZ();
        FrameLayout frameLayoutLIZ = C989390bqz.LIZ(c19eg);
        if (frameLayoutLIZ != null) {
            viewFindViewById = frameLayoutLIZ.findViewById(R.id.dn6);
        } else {
            viewFindViewById = null;
        }
        if (!(viewFindViewById instanceof C1035340d36) || viewFindViewById == null) {
            C1035340d36 c1035340d36 = new C1035340d36(c19eg);
            c1035340d36.setId(R.id.dn6);
            c1035340d36.setParams(c1025930cnvLIZ);
            c1035340d36.setMBehaviorCallback(null);
            c1035340d36.setKeyDownCallBack(null);
            FrameLayout frameLayoutLIZ2 = C989390bqz.LIZ(c19eg);
            if (frameLayoutLIZ2 != null) {
                frameLayoutLIZ2.addView(c1035340d36);
            }
        }
    }

    @Override // X.InterfaceC19421610yc
    public final boolean openAdOpenUrl(Context context, String str, boolean z) {
        C1029590ctp.LIZIZ().getClass();
        return AbstractC1025070cmX.LJIILJJIL(context, str, z);
    }

    @Override // X.InterfaceC19421610yc
    public final boolean openAdWebUrl(Context context, String str, String str2) {
        C1029590ctp.LIZIZ().getClass();
        return AbstractC1025070cmX.LJIILL(context, str, str2);
    }
}
