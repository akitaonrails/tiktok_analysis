package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.unifiedauthapi.model.SubSwitch;

/* JADX INFO: renamed from: X.0maU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402000maU implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCheckedChanged$0(C1402000maU c1402000maU, CompoundButton compoundButton, boolean z) {
        if (z) {
            ((C19207610Ck) c1402000maU.l0).LLIZ.add(((SubSwitch) c1402000maU.l1).switchField);
        } else {
            ((C19207610Ck) c1402000maU.l0).LLIZ.remove(((SubSwitch) c1402000maU.l1).switchField);
        }
        if (((C19207610Ck) c1402000maU.l0).LLIZ.isEmpty()) {
            C1391990mKL c1391990mKL = (C1391990mKL) ((C259800zU) c1402000maU.l2).element;
            if (c1391990mKL != null) {
                c1391990mKL.LIZLLL = false;
                C197039127h c197039127h = c1391990mKL.LIZ;
                if (c197039127h != null) {
                    c197039127h.setEnabled(false);
                }
            }
            C1389890mGx c1389890mGx = new C1389890mGx(((C19207610Ck) c1402000maU.l0).LL);
            c1389890mGx.LJIIIZ(2131832584);
            c1389890mGx.LJIIJJI();
            return;
        }
        C1391990mKL c1391990mKL2 = (C1391990mKL) ((C259800zU) c1402000maU.l2).element;
        if (c1391990mKL2 == null) {
            return;
        }
        c1391990mKL2.LIZLLL = true;
        C197039127h c197039127h2 = c1391990mKL2.LIZ;
        if (c197039127h2 == null) {
            return;
        }
        c197039127h2.setEnabled(true);
    }

    public static final void onCheckedChanged$1(C1402000maU c1402000maU, CompoundButton compoundButton, boolean z) {
        C0P0T c0p0t;
        C1348410lC3 c1348410lC3 = (C1348410lC3) c1402000maU.l0;
        C0P0T c0p0t2 = c1348410lC3.LIZ;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = c1348410lC3.LIZ) != null) {
            c0p0t.dismiss();
        }
        ((InterfaceC1348430lC5) c1402000maU.l1).LIZ(z);
        ((C1348410lC3) c1402000maU.l0).LIZJ = z;
        ((C0HZQ) c1402000maU.l2).invalidate();
    }

    public static final void onCheckedChanged$2(C1402000maU c1402000maU, CompoundButton compoundButton, boolean z) {
        ((C1344790l6D) c1402000maU.l0).LIZIZ = z;
        ((InterfaceC1344800l6E) c1402000maU.l1).LIZ(z);
        ((C0HZQ) c1402000maU.l2).invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1402000maU(Object obj, C19207610Ck c19207610Ck, SubSwitch subSwitch, C259800zU<C1391990mKL> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = c19207610Ck;
        this.l2 = subSwitch;
    }
}
