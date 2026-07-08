package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.poplayer.core.PopupManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12Q5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12Q5 extends C12Q8 {
    public C1397510mTF LIZ;
    public C20656615sK LIZIZ;
    public Function0<Unit> LIZJ;

    @Override // X.C12Q8
    public final void LIZ() {
        C1397510mTF c1397510mTF = this.LIZ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        this.LIZ = null;
        C20656615sK c20656615sK = this.LIZIZ;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
        this.LIZIZ = null;
    }

    @Override // X.C12Q8
    public final void LIZLLL(C12QB c12qb, C12QB c12qb2, String str, String str2, String str3) {
        Context contextLJFF = C2214201BlK.LJFF();
        if (contextLJFF == null) {
            contextLJFF = C1BWL.LIZ();
        }
        LJ(contextLJFF, str, str2, str3, c12qb, c12qb2);
    }

    @Override // X.C12Q8
    public final void LIZJ(final String str, final String str2, final C12QB c12qb, final C12QB c12qb2, final String str3, Function0<Unit> function0) {
        this.LIZJ = function0;
        C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new Runnable() { // from class: X.12Q6
            public final void LIZ() {
                if (!C849850XVn.LIZIZ.LIZJ().LJJ("location")) {
                    this.LL.LIZLLL(c12qb, c12qb2, str, str2, str3);
                    return;
                }
                final C12Q5 c12q5 = this.LL;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = str3;
                final C12QB c12qb3 = c12qb;
                final C12QB c12qb4 = c12qb2;
                c12q5.getClass();
                PopupManager.LJIJ(new C10GR() { // from class: X.12Q7
                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return 110;
                    }

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        C19FO c19fo;
                        Context contextLJFF = C2214201BlK.LJFF();
                        if (contextLJFF == null) {
                            contextLJFF = C1BWL.LIZ();
                        }
                        if (!(contextLJFF instanceof C19EG) || (c19fo = (C19FO) contextLJFF) == null) {
                            return null;
                        }
                        return new C688120Qyw(contextLJFF, c19fo, null);
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                        C12Q5 c12q52 = c12q5;
                        c12q52.LIZ = c12q52.LJ(c688120Qyw.LIZ, str4, str5, str6, c12qb3, c12qb4);
                        c12q5.LIZIZ = c20656615sK;
                    }

                    @Override // X.AbstractC20656215sG
                    public final void showPopupFailed(int i, String str7) {
                        super.showPopupFailed(i, str7);
                    }
                }, "location_downgrade_login_consent", new C1668306g5("pns_compliance_location_downgrade_login_consent"));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LocationInitializer$ConsentDialog@7c97.show$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LocationInitializer$ConsentDialog@7c97.show$1");
            }
        });
    }

    public final C1397510mTF LJ(Context context, String str, String str2, String str3, C12QB c12qb, C12QB c12qb2) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dk6, null, false);
        TextView textView = (TextView) viewTd.findViewById(R.id.nom);
        if (textView != null) {
            textView.setText(str);
        }
        SpannableString spannableString = new SpannableString(str2);
        if (str3 != null) {
            int iLJJJ = a0.LJJJ(str2, str3, 0, false, 6);
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, str3.length() + iLJJJ, 0);
        }
        TextView textView2 = (TextView) viewTd.findViewById(R.id.nol);
        if (textView2 != null) {
            textView2.setText(spannableString);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJII = false;
        C1207020hW0.LIZ(c1397580mTM, viewTd);
        C985403tE.LIZ(c1397580mTM, new AwS395S0200000_29(c12qb, c12qb2, 109));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        c1397510mTF.LIZLLL();
        Function0<Unit> function0 = this.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        return c1397510mTF;
    }
}
