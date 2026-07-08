package X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yAF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1847010yAF extends AbstractC1846670y9h<C1119420fEi> {
    public final RankTypeV2 LIZLLL;
    public final C1846630y9d LJ;
    public final LinearLayout LJFF;
    public final ImageView LJI;
    public C1847020yAG LJII;

    @Override // X.InterfaceC1846720y9m
    public Pair<Integer, Integer> LIZ() {
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZJ;
        C1846630y9d c1846630y9d = this.LJ;
        Text text = new Text();
        text.defaultPattern = C497740JfY.LJIJI(2131855533);
        TextPiece textPiece = new TextPiece();
        EnumC1133850fbz enumC1133850fbz = EnumC1133850fbz.STRING;
        textPiece.type = enumC1133850fbz.ordinal();
        textPiece.stringValue = "99.99K";
        TextPiece textPiece2 = new TextPiece();
        textPiece2.type = enumC1133850fbz.ordinal();
        textPiece2.stringValue = "99";
        text.pieces = C1697810uHb.LJIIJJI(textPiece, textPiece2);
        c1846630y9d.setText(C1133830fbx.LJIILIIL(text, "").toString());
        C1846800y9u.LJIIJJI(this.LJFF);
        this.LJ.setText("");
        int measuredWidth = this.LJFF.getMeasuredWidth();
        C1846630y9d c1846630y9d2 = this.LJ;
        Text text2 = new Text();
        text2.defaultPattern = C497740JfY.LJIJI(2131855530);
        TextPiece textPiece3 = new TextPiece();
        textPiece3.type = enumC1133850fbz.ordinal();
        textPiece3.stringValue = "99.99K";
        text2.pieces = Collections.singletonList(textPiece3);
        c1846630y9d2.setText(C1133830fbx.LJIILIIL(text2, "").toString());
        C1846800y9u.LJIIJJI(this.LJFF);
        this.LJ.setText("");
        int measuredWidth2 = this.LJFF.getMeasuredWidth();
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.axs);
        if (measuredWidth < measuredWidth2) {
            measuredWidth = measuredWidth2;
        }
        if (measuredWidth >= iLJIIIZ) {
            iLJIIIZ = measuredWidth;
        }
        return new Pair<>(Integer.valueOf(iLJIIIZ + i), Integer.valueOf(this.LJFF.getMeasuredHeight()));
    }

    public void LJI() {
        this.LJ.setText(C497740JfY.LJIJI(2131855522));
    }

    public void LJII() {
        C786410Ut5.LJZI(0, this.LJI);
        this.LJI.setImageResource(R.drawable.dpd);
        if (C497740JfY.LJJ()) {
            ImageView imageView = this.LJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
            imageView.setRotationY(180.0f);
        }
    }

    @Override // X.AbstractC1846670y9h, X.InterfaceC1846720y9m
    public final void onDestroy() {
        C1847020yAG c1847020yAG = this.LJII;
        if (c1847020yAG != null) {
            c1847020yAG.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1846670y9h
    public void LIZLLL(C1119420fEi c1119420fEi) {
        this.LJ.setText(c1119420fEi.LJIILIIL);
        this.LIZIZ = c1119420fEi;
        LJII();
        LJFF(c1119420fEi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1846670y9h
    public void LJ(C1119420fEi c1119420fEi) {
        int i;
        int i2;
        String str;
        C1846810y9v c1846810y9v;
        T t = this.LIZIZ;
        if (t != 0 && (c1846810y9v = t.LJIIIIZZ) != null) {
            i = c1846810y9v.LIZ;
        } else {
            i = 0;
        }
        C1846810y9v c1846810y9v2 = c1119420fEi.LJIIIIZZ;
        if (c1846810y9v2 != null) {
            i2 = c1846810y9v2.LIZ;
        } else {
            i2 = 0;
        }
        String str2 = null;
        if (i == i2 && t != 0 && c1119420fEi.LIZIZ == t.LIZIZ) {
            String str3 = c1119420fEi.LJIILIIL;
            if (t != 0) {
                str = t.LJIILIIL;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str3, str)) {
                return;
            }
        }
        T t2 = this.LIZIZ;
        if (t2 != 0) {
            str2 = t2.LJIILIIL;
        }
        String str4 = c1119420fEi.LJIILIIL;
        this.LIZIZ = c1119420fEi;
        if (LJFF(c1119420fEi)) {
            return;
        }
        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
        C1847020yAG c1847020yAG = this.LJII;
        c1119210fEN.getClass();
        C1119210fEN.LJFF(c1119420fEi, c1847020yAG);
        if ((!TextUtils.isEmpty(str4) && Intrinsics.LJFF(str2, str4)) || TextUtils.isEmpty(str4)) {
            return;
        }
        C1847020yAG c1847020yAG2 = this.LJII;
        if (c1847020yAG2 != null) {
            c1847020yAG2.LIZ();
        }
        LIZJ(true);
        this.LJ.setText(c1119420fEi.LJIILIIL);
        LIZJ(false);
    }

    public final boolean LJFF(C1119420fEi c1119420fEi) {
        String string;
        CharSequence text;
        C1846810y9v c1846810y9v = c1119420fEi.LJIIIIZZ;
        if (c1846810y9v != null) {
            Integer numValueOf = Integer.valueOf(c1846810y9v.LIZ);
            if (numValueOf.intValue() == 1) {
                numValueOf.intValue();
                LJI();
                if (this.LJII == null) {
                    C1119210fEN c1119210fEN = C1119210fEN.LIZ;
                    RankTypeV2 rankTypeV2 = this.LIZLLL;
                    c1119210fEN.getClass();
                    this.LJII = new C1847020yAG(this.LJ, C1119210fEN.LIZJ(rankTypeV2) * 1000, AFwS264S0000000_24.get$arr$(728));
                }
                C1847020yAG c1847020yAG = this.LJII;
                if (c1847020yAG != null) {
                    C1846630y9d c1846630y9d = this.LJ;
                    if (c1846630y9d == null || (text = c1846630y9d.getText()) == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    if (!c1847020yAG.LJFF) {
                        c1847020yAG.LIZLLL = string;
                        c1847020yAG.LJ = 0;
                        C786410Ut5.LJLJJI(2, c1847020yAG.LIZIZ, c1847020yAG.LJI);
                        C786410Ut5.LJLJJI(1, 500L, c1847020yAG.LJI);
                        c1847020yAG.LJFF = true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C1847010yAF(C1091250eVH c1091250eVH, RankTypeV2 rankTypeV2) {
        super(c1091250eVH);
        this.LIZLLL = rankTypeV2;
        C1846630y9d c1846630y9d = (C1846630y9d) c1091250eVH.findViewById(R.id.isl);
        this.LJ = c1846630y9d;
        this.LJFF = (LinearLayout) c1091250eVH.findViewById(R.id.ism);
        this.LJI = (ImageView) c1091250eVH.findViewById(R.id.lib);
        c1846630y9d.LJJJJIZL();
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZIZ;
        c1846630y9d.LLJJIJIIJIL = true;
        c1846630y9d.LLJJIJI = i;
    }
}
