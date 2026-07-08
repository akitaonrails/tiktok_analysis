package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.19JI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19JI {
    public float LIZ = -2.0f;
    public float LIZIZ = -2.0f;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final C1049820dQS LJIILIIL;

    public ViewGroup.LayoutParams LIZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.LIZ, (int) this.LIZIZ);
        if (C1015570cXD.LIZ().LJ) {
            marginLayoutParams.setMarginStart((int) (this.LJIIIZ ? this.LJFF : this.LJ));
            marginLayoutParams.setMarginEnd((int) (this.LJIIJ ? this.LJI : this.LJ));
        } else {
            marginLayoutParams.leftMargin = (int) (this.LJIIIZ ? this.LJFF : this.LJ);
            marginLayoutParams.rightMargin = (int) (this.LJIIJ ? this.LJI : this.LJ);
        }
        marginLayoutParams.topMargin = (int) (this.LJIIJJI ? this.LJII : this.LJ);
        marginLayoutParams.bottomMargin = (int) (this.LJIIL ? this.LJIIIIZZ : this.LJ);
        return marginLayoutParams;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutParams{mWidth=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mMargin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mMarginLeft=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mMarginRight=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mMarginTop=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mMarginBottom=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mParams=");
        sbLIZ.append((Object) null);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19JI(C1049820dQS c1049820dQS) {
        this.LJIILIIL = c1049820dQS;
    }

    public void LIZIZ(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        str.getClass();
        switch (str) {
            case "paddingLeft":
                C1100060ejU.LIZIZ(context, str2);
                break;
            case "minWidth":
                this.LIZJ = C1100060ejU.LIZIZ(context, str2);
                break;
            case "height":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.LIZIZ = -1.0f;
                    break;
                } else {
                    if (TextUtils.equals(str2, "wrap_content")) {
                        this.LIZIZ = -2.0f;
                    } else {
                        this.LIZIZ = C1100060ejU.LIZIZ(context, str2);
                    }
                    break;
                }
                break;
            case "margin":
                this.LJ = C1100060ejU.LIZIZ(context, str2);
                break;
            case "marginTop":
                this.LJII = C1100060ejU.LIZIZ(context, str2);
                this.LJIIJJI = true;
                break;
            case "padding":
                C1100060ejU.LIZIZ(context, str2);
                break;
            case "marginBottom":
                this.LJIIIIZZ = C1100060ejU.LIZIZ(context, str2);
                this.LJIIL = true;
                break;
            case "minHeight":
                this.LIZLLL = C1100060ejU.LIZIZ(context, str2);
                break;
            case "paddingTop":
                C1100060ejU.LIZIZ(context, str2);
                break;
            case "width":
                if (TextUtils.equals(str2, "match_parent")) {
                    this.LIZ = -1.0f;
                    break;
                } else {
                    if (TextUtils.equals(str2, "wrap_content")) {
                        this.LIZ = -2.0f;
                    } else {
                        this.LIZ = C1100060ejU.LIZIZ(context, str2);
                    }
                    break;
                }
                break;
            case "paddingBottom":
                C1100060ejU.LIZIZ(context, str2);
                break;
            case "paddingRight":
                C1100060ejU.LIZIZ(context, str2);
                break;
            case "marginRight":
                this.LJI = C1100060ejU.LIZIZ(context, str2);
                this.LJIIJ = true;
                break;
            case "marginLeft":
                this.LJFF = C1100060ejU.LIZIZ(context, str2);
                this.LJIIIZ = true;
                break;
        }
    }
}
