package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.156W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C156W {
    public final C155H LIZ;
    public final AbstractC204621154x LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1476));

    public void LIZLLL() {
    }

    public abstract void LJ(boolean z);

    public abstract void LJFF(boolean z);

    public void LJI(boolean z) {
    }

    public abstract void LJII(int i);

    public void LJIIIIZZ(C156O c156o) {
    }

    public void LJIIIZ(CharSequence charSequence) {
    }

    public void LJIIJ(boolean z) {
    }

    public final C1664680tQA<C156U> LIZ() {
        return (C1664680tQA) this.LIZJ.getValue();
    }

    public final String LJIIJJI() {
        int i = this.LIZ.LJJII.LIZIZ;
        return (i == 1 || i == 2) ? "restore" : i != 3 ? "" : "restore_original_sound";
    }

    public final void LIZIZ() {
        LIZ().LIZ(new C2217381BqS() { // from class: X.156b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C156U) obj).LJI);
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 449));
        LIZ().LIZ(new C2217381BqS() { // from class: X.156c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C156U) obj).LJFF);
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 450));
        LIZ().LIZ(new C2217381BqS() { // from class: X.156T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C156U) obj).LJ;
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.156R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C156K) obj).LIZ;
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 451));
        LIZ().LIZ(new C2217381BqS() { // from class: X.156V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C156U) obj).LJ;
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.156d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C156K) obj).LIZIZ);
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 443));
        LIZ().LIZ(new C2217381BqS() { // from class: X.156e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C156U) obj).LIZIZ;
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 444));
        LIZ().LIZ(new C2217381BqS() { // from class: X.156X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C156U) obj).LIZ);
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 445));
        LIZ().LIZ(new C2217381BqS() { // from class: X.156Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C156U) obj).LIZJ);
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 446));
        LIZ().LIZ(new C2217381BqS() { // from class: X.156Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C156U) obj).LIZLLL);
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 447));
        LIZ().LIZ(new C2217381BqS() { // from class: X.156a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C156U) obj).LJII);
            }
        }).LJIIIZ(this.LIZ.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 448));
    }

    public final boolean LIZJ() {
        return LIZ().LIZ.LJFF && LIZ().LIZ.LJ.LIZ == C156O.STRIPPING;
    }

    public final void LJIIL() {
        String strAppend;
        int i = C156P.LIZ[LIZ().LIZ.LJ.LIZ.ordinal()];
        if (i == 1) {
            C155H c155h = this.LIZ;
            int i2 = c155h.LJJII.LIZIZ;
            if (i2 == 1 || i2 == 2) {
                String string = c155h.LJJIIJZLJL.getString(2131857896);
                String string2 = this.LIZ.LJJIIJZLJL.getString(2131857897);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(string2);
                SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                C844470XAv.LIZ.getClass();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, C844470XAv.LIZ());
                if (numLIZJ != null) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), 0, spannableString.length(), 33);
                }
                strAppend = spannableStringBuilder.append((CharSequence) spannableString);
            } else {
                strAppend = i2 != 3 ? "" : c155h.LJJIIJZLJL.getString(2131857898);
            }
        } else if (i == 2) {
            strAppend = this.LIZ.LJJIIJZLJL.getString(2131857894);
        } else if (i == 3) {
            strAppend = this.LIZ.LJJIIJZLJL.getString(2131857892);
        } else {
            if (i != 4) {
                throw new C1954807lC();
            }
            strAppend = this.LIZ.LJJIIJZLJL.getString(2131857891);
        }
        LIZ().LIZLLL(new AwS610S0100000_31(strAppend, 452), true);
    }

    public C156W(C155H c155h, AbstractC204621154x abstractC204621154x) {
        this.LIZ = c155h;
        this.LIZIZ = abstractC204621154x;
    }
}
