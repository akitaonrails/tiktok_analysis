package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.zhiliaoapp.musically.R;
import irm.AkS29S0300000_21;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS670S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lAV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347450lAV implements InterfaceC1347460lAW {
    public TuxIconView LIZ;
    public TuxIconView LIZIZ;
    public TuxIconView LIZJ;
    public LinearLayout LIZLLL;

    @Override // X.InterfaceC1347460lAW
    public final String LIZ() {
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout == null) {
            return "";
        }
        Iterator it2 = new C1077420e8y(linearLayout, 44).iterator();
        String strLIZIZ = "";
        int i = 0;
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (!c1077410e8x.hasNext()) {
                return strLIZIZ;
            }
            Object next = c1077410e8x.next();
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            View view = (View) next;
            if (view.getVisibility() == 0) {
                String str = Intrinsics.LJFF(strLIZIZ, "") ? "" : ",";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(str);
                sbLIZ.append(LIZLLL(view.getId()));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            i = i2;
        }
    }

    public static String LIZLLL(int i) {
        if (i == R.id.ll7) {
            return "photo";
        }
        if (i == R.id.lfo) {
            if (CommentWithStickerExp.LIZIZ()) {
                return "sticker";
            }
            return "emoji";
        }
        if (i == R.id.l99) {
            return "mention";
        }
        return "";
    }

    public final View LIZJ(Context context) {
        View viewSd = C786410Ut5.Sd(R.layout.a4e, C786410Ut5.ne(context), null);
        this.LIZLLL = (LinearLayout) viewSd.findViewById(R.id.k0y);
        this.LIZ = (TuxIconView) viewSd.findViewById(R.id.ll7);
        this.LIZIZ = (TuxIconView) viewSd.findViewById(R.id.lfo);
        this.LIZJ = (TuxIconView) viewSd.findViewById(R.id.l99);
        return viewSd;
    }

    @Override // X.InterfaceC1347460lAW
    public final void LIZIZ(Aweme aweme, int i, AFwS209S0000000_21 aFwS209S0000000_21, AwS670S0100000_21 awS670S0100000_21) {
        boolean z;
        TuxIconView tuxIconView;
        String region;
        Boolean boolValueOf;
        int i2;
        AwemeControl awemeControl;
        if (aweme != null && (awemeControl = aweme.getAwemeControl()) != null && awemeControl.canComment() && C1348690lCV.LIZ(aweme) && !C1348690lCV.LIZJ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LinearLayout linearLayout = this.LIZLLL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
                return;
            }
            return;
        }
        C1346820l9U.LIZ(C1347860lBA.LIZIZ, this.LIZLLL, this.LIZJ, this.LIZIZ, this.LIZ, null);
        C1351950lHl.LJIJJLI(this.LIZLLL);
        C1351950lHl.LJIJJLI(this.LIZ);
        C1351950lHl.LJIJJLI(this.LIZIZ);
        C1351950lHl.LJIJJLI(this.LIZJ);
        TuxIconView tuxIconView2 = this.LIZ;
        if (tuxIconView2 != null) {
            if (aweme == null || (region = aweme.getRegion()) == null) {
                region = "";
            }
            boolean zLJIILLIIL = C13LQ.LJIILLIIL(region, (Object[]) C1380700m28.LIZIZ.getValue());
            if (aweme != null) {
                boolValueOf = Boolean.valueOf(C1347740lAy.LIZ(aweme, false));
            } else {
                boolValueOf = null;
            }
            if (C1346420l8q.LIZ(boolValueOf) && !zLJIILLIIL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
        }
        if (CommentWithStickerExp.LIZIZ() && (tuxIconView = this.LIZIZ) != null) {
            tuxIconView.setIconRes(R.raw.icon_sticker_round);
        }
        if (((Number) C275990Arl.LIZ.getValue()).intValue() == 1) {
            C1351950lHl.LJIJJ(this.LIZJ);
        }
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout2 = this.LIZLLL;
        if (linearLayout2 != null) {
            Iterator it2 = new C1077420e8y(linearLayout2, 43).iterator();
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (!c1077410e8x.hasNext()) {
                    break;
                }
                View view = (View) c1077410e8x.next();
                if (view.getVisibility() == 0) {
                    arrayList.add(LIZLLL(view.getId()));
                }
                if (arrayList.size() > i) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
            }
        }
        aFwS209S0000000_21.getClass();
        for (TuxIconView tuxIconView3 : C1697810uHb.LJIIJJI(this.LIZ, this.LIZIZ, this.LIZJ)) {
            if (tuxIconView3 != null) {
                C786410Ut5.I7(new AkS29S0300000_21(awS670S0100000_21, tuxIconView3, this, 2), tuxIconView3);
            }
        }
    }
}
