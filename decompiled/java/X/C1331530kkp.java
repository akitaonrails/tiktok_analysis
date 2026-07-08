package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0kkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331530kkp extends C1320700kTM<InterfaceC1330440kj4> {
    public SmartImageView LIZIZ;
    public InterfaceC427850Gq7 LIZJ;
    public Uri LIZLLL;
    public C1329380khM LJ;
    public boolean LJFF;
    public boolean LJI;
    public C1331510kkn LJII;
    public AbstractC1320710kTN LJIIIIZZ;

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZIZ(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRelease  id=");
        sbLIZ.append(str);
        C1330590kjJ.LJII(this.LJII.hashCode(), "ControllerListenerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC427850Gq7 interfaceC427850Gq7 = this.LIZJ;
        if (interfaceC427850Gq7 != null) {
            interfaceC427850Gq7.e1(this.LIZLLL);
        }
        this.LJFF = false;
        this.LJI = false;
    }

    public final void LJIIJJI(C1331510kkn c1331510kkn) {
        this.LJII = c1331510kkn;
        this.LIZIZ = (SmartImageView) c1331510kkn.LJJIJ;
        this.LIZJ = c1331510kkn.LJJIJIIJIL;
        C03IT c03it = c1331510kkn.LJJJI;
        if (c03it != null && !c03it.LIZ()) {
            this.LIZLLL = UriProtector.parse((String) ListProtector.get(c1331510kkn.LJJJI.LIZ, 0));
        } else {
            this.LIZLLL = c1331510kkn.LIZ;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onIntermediateImageFailed  id=");
        sbLIZ.append(str);
        sbLIZ.append("  throwable: ");
        sbLIZ.append(th);
        C1330590kjJ.LIZLLL(this.LJII.hashCode(), "ControllerListenerAdapter", C2188811AlT.LIZIZ(sbLIZ), "");
        InterfaceC427850Gq7 interfaceC427850Gq7 = this.LIZJ;
        if (interfaceC427850Gq7 != null) {
            interfaceC427850Gq7.lg(this.LIZLLL, th);
        }
        this.LJFF = false;
        this.LJI = false;
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZJ(Object obj, String str) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onIntermediateImageSet  id=");
        sbLIZ.append(str);
        C1330590kjJ.LJII(this.LJII.hashCode(), "ControllerListenerAdapter", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC427850Gq7 interfaceC427850Gq7 = this.LIZJ;
        if (interfaceC427850Gq7 != null) {
            if (interfaceC1330440kj4 != null) {
                this.LIZJ.A3(this.LIZLLL, new C428600GrK(interfaceC1330440kj4.getWidth(), interfaceC1330440kj4.getHeight()));
            } else {
                interfaceC427850Gq7.A3(this.LIZLLL, null);
            }
        }
        this.LJFF = false;
        this.LJI = false;
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        C1331510kkn c1331510kkn = this.LJII;
        if (c1331510kkn.LJJJJI) {
            C1331710kl7.LIZ(c1331510kkn);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  id=");
        sbLIZ.append(str);
        sbLIZ.append(", ex=");
        sbLIZ.append(th);
        C1330590kjJ.LIZLLL(this.LJII.hashCode(), "ControllerListenerAdapter", "onFailure", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC427850Gq7 interfaceC427850Gq7 = this.LIZJ;
        if (interfaceC427850Gq7 != null) {
            interfaceC427850Gq7.cm(this.LIZLLL, this.LIZIZ, th);
        }
        this.LJFF = false;
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" id = ");
        sbLIZ.append(str);
        C1330590kjJ.LJIIIIZZ(this.LJII.hashCode(), "ControllerListenerAdapter", "onSubmit", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC427850Gq7 interfaceC427850Gq7 = this.LIZJ;
        if (interfaceC427850Gq7 != null) {
            interfaceC427850Gq7.Bh(this.LIZLLL, this.LIZIZ);
        }
        C1331510kkn c1331510kkn = this.LJII;
        if (c1331510kkn.LJJJJI) {
            final AbstractC1320710kTN abstractC1320710kTN = this.LJIIIIZZ;
            C1331710kl7.LIZ.execute(new ARunnableS89S0200000_20(new InterfaceC469401sC(abstractC1320710kTN) { // from class: X.0kav
                public final WeakReference<InterfaceC1320280kSg> LL;

                @Override // X.InterfaceC469401sC
                public final void cancel() {
                    InterfaceC1320280kSg interfaceC1320280kSg = this.LL.get();
                    if (interfaceC1320280kSg != null) {
                        int i2 = C2187451AjH.LIZ;
                        C1330590kjJ.LIZIZ("ControllerCancellable", "cancel");
                        C0STY.LIZ.execute(new ARunnableS120S0100000_20(interfaceC1320280kSg, 381));
                    }
                }

                {
                    this.LL = new WeakReference<>(abstractC1320710kTN);
                }
            }, c1331510kkn, 231));
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFinalImageSet  id=");
        sbLIZ.append(str);
        C1330590kjJ.LIZ(this.LJII.hashCode(), "ControllerListenerAdapter", C2188811AlT.LIZIZ(sbLIZ), "");
        C1331510kkn c1331510kkn = this.LJII;
        if (c1331510kkn.LJJJJI) {
            C1331710kl7.LIZ(c1331510kkn);
        }
        boolean z = interfaceC1330440kj4 instanceof C1329380khM;
        if (z) {
            this.LJ = (C1329380khM) interfaceC1330440kj4;
        }
        boolean z2 = true;
        this.LJI = true;
        if (animatable == null) {
            z2 = false;
        }
        this.LJFF = z2;
        InterfaceC427850Gq7 interfaceC427850Gq7 = this.LIZJ;
        if (interfaceC427850Gq7 != null) {
            if (interfaceC1330440kj4 != null) {
                this.LIZJ.Ad(this.LIZLLL, this.LIZIZ, new C428600GrK(interfaceC1330440kj4.getWidth(), interfaceC1330440kj4.getHeight()), animatable);
            } else {
                interfaceC427850Gq7.Ad(this.LIZLLL, this.LIZIZ, null, animatable);
            }
        }
        if (this.LJ != null && this.LJII.LJJIJLIJ && !TextUtils.isEmpty(this.LIZIZ.getAnimPreviewFrameCacheKey())) {
            C1329340khI c1329340khI = C0QD7.LIZ;
            if (c1329340khI.LIZJ(this.LIZIZ.getAnimPreviewFrameCacheKey()) == null && z) {
                c1329340khI.LIZ(this.LIZIZ.getAnimPreviewFrameCacheKey(), this.LJ);
            }
        }
        if (this.LJFF && this.LJII.LIZLLL) {
            this.LIZIZ.LJI();
        }
    }

    @Override // X.C1320700kTM
    public final void LJIIIIZZ(String str, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable, C1325710kbR c1325710kbR, Map map) {
        C1331510kkn c1331510kkn = this.LJII;
        if (c1331510kkn.LJJJJI) {
            C1331710kl7.LIZ(c1331510kkn);
        }
    }
}
