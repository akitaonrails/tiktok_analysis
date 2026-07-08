package X;

import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18PS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C18PS extends FrameLayout {
    public static final C18PV LLJILJILJ = new C18PV();
    public final Fragment LL;
    public C18PW LLILLJJLI;
    public final Map<String, String> LLILLL;
    public final Map<String, Map<String, String>> LLILZ;
    public EnumC1780190wQT LLILZIL;
    public boolean LLILZLL;
    public InterfaceC21280718Pt LLIZ;
    public int LLIZLLLIL;
    public EcUgProduct LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;

    public boolean LIZ() {
        return true;
    }

    public abstract EnumC1782280wTq LIZIZ();

    public abstract C18Q6 LIZLLL(VSACardsResponse.VSACardData vSACardData, List list, C18PN c18pn);

    public abstract /* synthetic */ int getBgColor();

    public final void LIZJ() {
        if (this.LLJI) {
            try {
                if (!C1740380vOG.LIZ()) {
                    try {
                        ExecutorC1592406Li.LLILLJJLI.execute(new ARunnableS132S0100000_32(this, 86));
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                }
                InterfaceC21280718Pt interfaceC21280718Pt = this.LLIZ;
                if (interfaceC21280718Pt != null) {
                    interfaceC21280718Pt.hide();
                }
                C18PW c18pw = this.LLILLJJLI;
                if (c18pw != null) {
                    c18pw.LIZJ();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final void LJFF() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        LIZJ();
        InterfaceC21280718Pt interfaceC21280718Pt = this.LLIZ;
        if (interfaceC21280718Pt != null) {
            interfaceC21280718Pt.LLIZLLLIL();
        }
        this.LLIZ = null;
        this.LLILLJJLI = null;
        ((LinkedHashMap) this.LLILLL).clear();
        ((LinkedHashMap) this.LLILZ).clear();
        this.LLIZLLLIL = -1;
        this.LLJ = null;
        this.LLILZIL = EnumC1780190wQT.UNKNOWN;
        this.LLILZLL = false;
        this.LLJI = false;
        this.LLJIJIL = true;
        this.LLJILJIL = 0;
    }

    public final int getCurrentIndex() {
        return this.LLIZLLLIL;
    }

    public final EcUgProduct getCurrentProduct() {
        return this.LLJ;
    }

    public final Fragment getFragment() {
        return this.LL;
    }

    public final void setCurrentIndex(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setCurrentProduct(EcUgProduct ecUgProduct) {
        this.LLJ = ecUgProduct;
    }

    public final void LJ(int i, EcUgProduct ecUgProduct, C1740600vOc c1740600vOc) {
        C18PW c18pw = this.LLILLJJLI;
        if (c18pw != null) {
            c18pw.LIZLLL(this.LLIZLLLIL, ecUgProduct, c1740600vOc);
        }
        C18PM c18pm = C18PM.LIZ;
        EnumC1780190wQT enumC1780190wQT = this.LLILZIL;
        Map<String, String> map = this.LLILLL;
        Map map2 = (Map) ((LinkedHashMap) this.LLILZ).get(ecUgProduct.productId);
        EnumC21279418Pg enumC21279418Pg = EnumC21279418Pg.PRODUCT_CARD;
        boolean z = this.LLILZLL;
        c18pm.getClass();
        C18PM.LJ(enumC1780190wQT, i, ecUgProduct, map, map2, enumC21279418Pg, z, false, c1740600vOc);
    }

    public C18PS(int i, Context context, AttributeSet attributeSet, Fragment fragment) {
        super(context, attributeSet, i);
        this.LL = fragment;
        this.LLILLL = new LinkedHashMap();
        this.LLILZ = new LinkedHashMap();
        this.LLILZIL = EnumC1780190wQT.UNKNOWN;
        this.LLIZLLLIL = -1;
        this.LLJIJIL = true;
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLL.getValue());
    }
}
