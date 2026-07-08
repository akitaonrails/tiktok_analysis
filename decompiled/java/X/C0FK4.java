package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FK4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0FK4 implements TextWatcher {
    public final /* synthetic */ C0FK3 LL;

    public C0FK4(C0FK3 c0fk3) {
        this.LL = c0fk3;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        C0FKM c0fkmLJIILL;
        C0FHM c0fhm;
        C0FKM c0fkmLJIILL2;
        C0FF8 c0ff8;
        C0FGR c0fgrLIZJ;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        String strValueOf = String.valueOf(editable);
        int length = strValueOf.length() - 1;
        int i2 = 0;
        boolean z4 = false;
        while (i2 <= length) {
            if (!z4) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.LJI(strValueOf.charAt(i), 32) <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z4) {
                if (!z3) {
                    z4 = true;
                } else {
                    i2++;
                }
            } else if (!z3) {
                break;
            } else {
                length--;
            }
        }
        if (TextUtils.isEmpty(strValueOf.subSequence(i2, length + 1).toString())) {
            C0FK3 c0fk3 = this.LL;
            c0fk3.getClass();
            AbstractC388140FJs abstractC388140FJs = (AbstractC388140FJs) c0fk3.LJII(C13LE.LIZ(AbstractC388140FJs.class));
            if (abstractC388140FJs != null) {
                abstractC388140FJs.LJIIIZ();
            }
            C0FK3 c0fk32 = this.LL;
            c0fk32.getClass();
            AbstractC388260FKe abstractC388260FKe = (AbstractC388260FKe) c0fk32.LJII(C13LE.LIZ(AbstractC388260FKe.class));
            if (abstractC388260FKe != null) {
                abstractC388260FKe.LJIIIZ();
            }
        } else {
            C0FK3 c0fk33 = this.LL;
            c0fk33.getClass();
            AbstractC388140FJs abstractC388140FJs2 = (AbstractC388140FJs) c0fk33.LJII(C13LE.LIZ(AbstractC388140FJs.class));
            if (abstractC388140FJs2 != null) {
                abstractC388140FJs2.LJIILIIL();
                abstractC388140FJs2.LJIIJ();
            }
            C0FK3 c0fk34 = this.LL;
            c0fk34.getClass();
            AbstractC388260FKe abstractC388260FKe2 = (AbstractC388260FKe) c0fk34.LJII(C13LE.LIZ(AbstractC388260FKe.class));
            if (abstractC388260FKe2 != null) {
                abstractC388260FKe2.LJIIIZ();
            }
        }
        if (editable != null && editable.length() == 0) {
            TextStickerCompatModel compatModel = this.LL.LIZJ.LJ.LIZ.getCompatModel();
            if (compatModel.getHintColor() != null) {
                z = true;
            } else {
                z = false;
            }
            String textHint = compatModel.getTextHint();
            if (textHint != null && textHint.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z5 = !z2;
            if (z && z5 && this.LL.LIZJ.LJ.LIZ.getAlign() == 2) {
                this.LL.LJFF.setGravity(8388627);
            }
        }
        C0FK3 c0fk35 = this.LL;
        c0fk35.getClass();
        AbstractC388260FKe abstractC388260FKe3 = (AbstractC388260FKe) c0fk35.LJII(C13LE.LIZ(AbstractC388260FKe.class));
        if (abstractC388260FKe3 != null) {
            boolean z6 = this.LL.LIZIZ.getParent() instanceof View;
            abstractC388260FKe3.LJIIIIZZ();
        }
        C0FK3 c0fk36 = this.LL;
        c0fk36.getClass();
        C0FKN c0fkn = (C0FKN) c0fk36.LJII(C13LE.LIZ(C0FKN.class));
        if (c0fkn != null) {
            c0fkn.LJIIJJI(this.LL.LJFF.getSelectionStart(), editable);
        }
        C0FKM c0fkmLJIILL3 = this.LL.LJIILL();
        if (c0fkmLJIILL3 != null) {
            c0fkmLJIILL3.LJIIJ(this.LL.LJFF.getSelectionStart(), editable);
        }
        if (!Intrinsics.LJFF(this.LL.LIZJ.LJ.LIZ.getTextStr(), String.valueOf(C2204961BRm.G(this.LL.LJFF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zIAUAG2oQVhOMrEv10LUP+HGg=", null)))) && (c0ff8 = (C0FF8) this.LL.LJII.getValue()) != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
            c0fgrLIZJ.LJIIJ(this.LL.LIZJ.LJ.LIZ);
        }
        this.LL.LJIJ();
        C0FK3 c0fk37 = this.LL;
        c0fk37.getClass();
        C0FKN c0fkn2 = (C0FKN) c0fk37.LJII(C13LE.LIZ(C0FKN.class));
        if (((c0fkn2 != null && c0fkn2.LJIIJ()) || (((c0fkmLJIILL = c0fk37.LJIILL()) != null && c0fkmLJIILL.LJIIIZ()) || ((C0FK0) c0fk37.LJIIIIZZ.getValue()).LJJ.LJ)) && (!((C0FK0) c0fk37.LJIIIIZZ.getValue()).LJJ.LJ || ((c0fkmLJIILL2 = c0fk37.LJIILL()) != null && c0fkmLJIILL2.LJIIIZ()))) {
            c0fhm = C0FHM.GONE;
        } else {
            c0fhm = C0FHM.VISIBLE;
        }
        C0FK3 c0fk38 = this.LL;
        C1664680tQA<C387990FJd> c1664680tQA = c0fk38.LIZJ.LJIIJ;
        if (c0fhm == c1664680tQA.LIZ.LIZ) {
            if (c0fhm == C0FHM.VISIBLE) {
                C0FKW c0fkw = (C0FKW) c0fk38.LJII(C13LE.LIZ(C0FKW.class));
                if (c0fkw != null) {
                    c0fkw.LJIIL();
                    return;
                }
                return;
            }
            C0FKW c0fkw2 = (C0FKW) c0fk38.LJII(C13LE.LIZ(C0FKW.class));
            if (c0fkw2 == null) {
                return;
            }
            c0fkw2.LJIIIZ();
            return;
        }
        c1664680tQA.LIZLLL(new AwS584S0100000_5(c0fhm, 1110), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FK4.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
