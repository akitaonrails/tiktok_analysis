package X;

import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847000yAE extends C1847010yAF {
    public final C1324720kZq LJIIIIZZ;
    public final C1846630y9d LJIIIZ;

    @Override // X.C1847010yAF, X.InterfaceC1846720y9m
    public final Pair<Integer, Integer> LIZ() {
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZJ;
        C500260Jjc.LJIILIIL(this.LJIIIIZZ);
        C1846630y9d c1846630y9d = this.LJ;
        Text text = new Text();
        text.defaultPattern = u.LJJIFFI(C497740JfY.LJIJI(2131855535), "[fragment_icon]", "", false);
        TextPiece textPiece = new TextPiece();
        EnumC1133850fbz enumC1133850fbz = EnumC1133850fbz.STRING;
        textPiece.type = enumC1133850fbz.ordinal();
        textPiece.stringValue = "9";
        text.pieces = Collections.singletonList(textPiece);
        c1846630y9d.setText(C1133830fbx.LJIILIIL(text, "").toString());
        C1846800y9u.LJIIJJI(this.LJFF);
        this.LJ.setText("");
        int measuredWidth = this.LJFF.getMeasuredWidth();
        C1846630y9d c1846630y9d2 = this.LJ;
        Text text2 = new Text();
        text2.defaultPattern = u.LJJIFFI(C497740JfY.LJIJI(2131855531), "[fragment_icon]", "", false);
        TextPiece textPiece2 = new TextPiece();
        textPiece2.type = enumC1133850fbz.ordinal();
        textPiece2.stringValue = "99.99K";
        TextPiece textPiece3 = new TextPiece();
        textPiece3.type = enumC1133850fbz.ordinal();
        textPiece3.stringValue = "9";
        text2.pieces = C1697810uHb.LJIIJJI(textPiece2, textPiece3);
        c1846630y9d2.setText(C1133830fbx.LJIILIIL(text2, "").toString());
        C1846800y9u.LJIIJJI(this.LJFF);
        this.LJ.setText("");
        int measuredWidth2 = this.LJFF.getMeasuredWidth();
        C1846630y9d c1846630y9d3 = this.LJ;
        Text text3 = new Text();
        text3.defaultPattern = u.LJJIFFI(C497740JfY.LJIJI(2131855532), "[fragment_icon]", "", false);
        TextPiece textPiece4 = new TextPiece();
        textPiece4.type = enumC1133850fbz.ordinal();
        textPiece4.stringValue = "99.99K";
        text3.pieces = Collections.singletonList(textPiece4);
        c1846630y9d3.setText(C1133830fbx.LJIILIIL(text3, "").toString());
        C1846800y9u.LJIIJJI(this.LJFF);
        this.LJ.setText("");
        int measuredWidth3 = this.LJFF.getMeasuredWidth();
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.axx) + (C497740JfY.LJIIIZ(R.dimen.axw) * 2);
        int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.axs);
        if (measuredWidth < measuredWidth2) {
            measuredWidth = measuredWidth2;
        }
        if (measuredWidth >= measuredWidth3) {
            measuredWidth3 = measuredWidth;
        }
        if (measuredWidth3 >= iLJIIIZ2) {
            iLJIIIZ2 = measuredWidth3;
        }
        return new Pair<>(Integer.valueOf(iLJIIIZ2 + iLJIIIZ + i), Integer.valueOf(this.LJFF.getMeasuredHeight()));
    }

    @Override // X.C1847010yAF
    public final void LJII() {
        int i;
        C1846930yA7 c1846930yA7LJIIIIZZ = C1846800y9u.LJIIIIZZ(this.LIZIZ);
        int i2 = c1846930yA7LJIIIIZZ != null ? c1846930yA7LJIIIIZZ.LIZ : 0;
        C786410Ut5.LJZI(0, this.LJI);
        ImageView imageView = this.LJI;
        switch (i2) {
            case 100:
            case 200:
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
            case 400:
            case 500:
                i = R.drawable.dni;
                break;
            case 600:
            case OppoPermissionPopupMaskDelayExp.DEFAULT /* 700 */:
            case 800:
            case 900:
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                i = R.drawable.dng;
                break;
            case 1100:
            case 1200:
            case 1300:
            case 1400:
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                i = R.drawable.dne;
                break;
            default:
                i = R.drawable.dnc;
                break;
        }
        imageView.setImageResource(i);
        C786410Ut5.LLJJIII(this.LJIIIIZZ, 0);
        this.LJIIIIZZ.setImageResource(C1847160yAU.LIZIZ(i2));
        this.LJ.LJJJJL(C1847160yAU.LIZLLL(i2));
        this.LJIIIZ.LJJJJL(C1847160yAU.LIZLLL(i2));
        if (C497740JfY.LJJ()) {
            ImageView imageView2 = this.LJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView2);
            imageView2.setRotationY(180.0f);
        }
    }

    @Override // X.C1847010yAF
    public final void LJI() {
        super.LJI();
        C786410Ut5.LLJJIII(this.LJIIIIZZ, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1847010yAF, X.AbstractC1846670y9h
    public final void LIZLLL(C1119420fEi c1119420fEi) {
        String str = c1119420fEi.LJIILIIL;
        C1847040yAI c1847040yAILIZLLL = C1846800y9u.LIZLLL(str);
        this.LIZIZ = c1119420fEi;
        LJII();
        if (c1847040yAILIZLLL == null) {
            C500260Jjc.LJIILIIL(this.LJIIIIZZ);
            this.LJ.setText(str);
        } else {
            this.LJ.setText(c1847040yAILIZLLL.LIZ);
            this.LJIIIZ.setText(c1847040yAILIZLLL.LIZIZ);
        }
        LJFF(c1119420fEi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1847010yAF, X.AbstractC1846670y9h
    public final void LJ(C1119420fEi c1119420fEi) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        C1846930yA7 c1846930yA7;
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
        if (t != 0) {
            str = t.LJIILIIL;
        } else {
            str = null;
        }
        String str2 = c1119420fEi.LJIILIIL;
        if (i == i2 && t != 0 && c1119420fEi.LIZIZ == t.LIZIZ && Intrinsics.LJFF(str, str2)) {
            return;
        }
        C1846930yA7 c1846930yA7LJIIIIZZ = C1846800y9u.LJIIIIZZ(c1119420fEi);
        T t2 = this.LIZIZ;
        if (t2 != 0 && (c1846930yA7 = t2.LJIIIZ) != null) {
            i3 = c1846930yA7.LIZ;
        } else {
            i3 = 0;
        }
        if (c1846930yA7LJIIIIZZ != null) {
            i4 = c1846930yA7LJIIIIZZ.LIZ;
        } else {
            i4 = 0;
        }
        LIZJ(true);
        this.LIZIZ = c1119420fEi;
        if (i3 != i4 || this.LJIIIIZZ.getVisibility() == 8) {
            LJII();
        }
        if (LJFF(c1119420fEi)) {
            C500260Jjc.LJIILIIL(this.LJIIIIZZ);
            LIZJ(false);
            return;
        }
        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
        C1847020yAG c1847020yAG = this.LJII;
        c1119210fEN.getClass();
        C1119210fEN.LJFF(c1119420fEi, c1847020yAG);
        if (!Intrinsics.LJFF(str, str2) && !TextUtils.isEmpty(str2)) {
            C1847020yAG c1847020yAG2 = this.LJII;
            if (c1847020yAG2 != null) {
                c1847020yAG2.LIZ();
            }
            C1847040yAI c1847040yAILIZLLL = C1846800y9u.LIZLLL(str2);
            if (c1847040yAILIZLLL == null) {
                C500260Jjc.LJIILIIL(this.LJIIIIZZ);
                this.LJ.setText(str2);
            } else {
                this.LJ.setText(c1847040yAILIZLLL.LIZ);
                this.LJIIIZ.setText(c1847040yAILIZLLL.LIZIZ);
            }
            LIZJ(false);
            return;
        }
        LIZJ(false);
    }

    public C1847000yAE(C1091250eVH c1091250eVH, RankTypeV2 rankTypeV2) {
        super(c1091250eVH, rankTypeV2);
        this.LJIIIIZZ = (C1324720kZq) c1091250eVH.findViewById(R.id.ltv);
        C1846630y9d c1846630y9d = (C1846630y9d) c1091250eVH.findViewById(R.id.isn);
        this.LJIIIZ = c1846630y9d;
        this.LJ.LJJJJIZL();
        C1846630y9d c1846630y9d2 = this.LJ;
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZIZ;
        c1846630y9d2.LLJJIJIIJIL = true;
        c1846630y9d2.LLJJIJI = i;
        c1846630y9d.LJJJJIZL();
        c1846630y9d.LLJJIJIIJIL = true;
        c1846630y9d.LLJJIJI = i;
    }
}
