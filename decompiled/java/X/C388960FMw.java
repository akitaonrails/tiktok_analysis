package X;

import Y.ARunnableS105S0100000_5;
import android.widget.TextView;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388960FMw extends AbstractC388970FMx {
    public final C388620FLo LIZIZ;
    public final C390250FRv LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C1664680tQA<AddYoursStickerModel> LJFF;
    public final List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> LJI;
    public C054G LJII;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        C2296808zG.LIZLLL(this.LJII, "");
    }

    public final void LJIIIZ() {
        if (this.LIZIZ.getVisibility() != 4) {
            C388490FLb.LIZ(this.LIZIZ);
            C388620FLo c388620FLo = this.LIZIZ;
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c388620FLo);
            c388620FLo.setTranslationY(fLIZIZ);
            C388620FLo c388620FLo2 = this.LIZIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c388620FLo2);
            c388620FLo2.setAlpha(1.0f);
            this.LIZIZ.animate().alpha(0.0f).translationY(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))).setDuration(200L).setInterpolator(C1619980sG4.LJIILIIL()).withEndAction(new ARunnableS105S0100000_5(this, 23)).start();
        }
    }

    @Override // X.AbstractC388970FMx
    public final void LJIIIIZZ(String str) {
        C19614411oc c19614411oc;
        TextView contentTextView;
        InterfaceC390170FRn interfaceC390170FRn = this.LIZJ.LJI;
        if (interfaceC390170FRn == null || !interfaceC390170FRn.LJ() || (c19614411oc = (C19614411oc) this.LJ.getValue()) == null || (contentTextView = c19614411oc.getContentTextView()) == null || Intrinsics.LJFF(contentTextView.getText().toString(), this.LIZJ.LJIIIIZZ)) {
            return;
        }
        C2296808zG.LIZLLL(this.LJII, "");
        if (str.length() != 0 && !a0.LJJJIL(str)) {
            C1DFH c1dfh = C0PEM.LIZ;
            C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
            this.LJII = c054gLIZ;
            C23250099c.LIZLLL(c054gLIZ, null, null, new C388950FMv(str, contentTextView, this, null), 3);
            return;
        }
        LJIIIZ();
    }

    public C388960FMw(C388620FLo c388620FLo, C390250FRv c390250FRv) {
        super(c390250FRv);
        this.LIZIZ = c388620FLo;
        this.LIZJ = c390250FRv;
        this.LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 150));
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 149));
        this.LJFF = c390250FRv.LJ;
        ArrayList arrayList = new ArrayList();
        this.LJI = arrayList;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJII = C2296808zG.LIZ(C2107308Nj.LIZ);
        int visibility = c388620FLo.getVisibility();
        c388620FLo.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c388620FLo);
        C388980FMy c388980FMy = C388980FMy.LIZ;
        C390220FRs c390220FRs = new C390220FRs(this);
        c388980FMy.getClass();
        C388980FMy.LIZ(arrayList, c388620FLo, c390220FRs, false);
    }
}
