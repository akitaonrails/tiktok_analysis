package X;

import Y.ACListenerS134S0200000_32;
import Y.ACListenerS96S0300000_32;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.autofill.AdPaymentModel;
import com.ss.android.ugc.aweme.autofill.setting.AdAutofillConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.18Ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21282518Ql extends AbstractC21673619ry<C21282618Qm> {
    public final List<AdPaymentModel> LL;
    public final boolean LLILLJJLI;
    public final WebView LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final C1035880d3y LLILZLL;
    public InterfaceC21282718Qn LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.String] */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strLIZIZ;
        String expiryTime;
        C21282618Qm c21282618Qm = (C21282618Qm) viewHolder;
        if (this.LLILLJJLI) {
            AdPaymentModel adPaymentModel = (AdPaymentModel) ListProtector.get(this.LL, i);
            c21282618Qm.getClass();
            if (adPaymentModel.getCardNumber().length() >= 4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(adPaymentModel.getCardType());
                sbLIZ.append(" **** ");
                sbLIZ.append(adPaymentModel.getCardNumber().substring(adPaymentModel.getCardNumber().length() - 4, adPaymentModel.getCardNumber().length()));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(adPaymentModel.getCardType());
                sbLIZ2.append(" **** ");
                sbLIZ2.append(adPaymentModel.getCardNumber());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (adPaymentModel.getExpiryTime().length() >= 2) {
                String strSubstring = adPaymentModel.getExpiryTime().substring(0, 2);
                String strSubstring2 = adPaymentModel.getExpiryTime().substring(adPaymentModel.getExpiryTime().length() - 2, adPaymentModel.getExpiryTime().length());
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strSubstring);
                sbLIZ3.append('/');
                sbLIZ3.append(strSubstring2);
                expiryTime = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                expiryTime = adPaymentModel.getExpiryTime();
            }
            if (c21282618Qm.LLJ.LLILZIL) {
                TuxTextView tuxTextView = c21282618Qm.LLILLJJLI;
                if (tuxTextView != null) {
                    tuxTextView.setText(expiryTime);
                }
                TuxTextView tuxTextView2 = c21282618Qm.LLILLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(strLIZIZ);
                }
            } else {
                TuxTextView tuxTextView3 = c21282618Qm.LLILLJJLI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(strLIZIZ);
                }
                TuxTextView tuxTextView4 = c21282618Qm.LLILLL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(expiryTime);
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(AdAutofillConfigSettings.LIZ().cardIconLink);
            sbLIZ4.append(C21282618Qm.L5(adPaymentModel.getCardType()));
            sbLIZ4.append(".png");
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
            c1331670kl3LJIIIZ.LJJ(c21282618Qm.LL);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = false;
            c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            return;
        }
        AdPaymentModel adPaymentModel2 = (AdPaymentModel) ListProtector.get(this.LL, i);
        c21282618Qm.getClass();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(AdAutofillConfigSettings.LIZ().cardIconLink);
        sbLIZ5.append(C21282618Qm.L5(adPaymentModel2.getCardType()));
        sbLIZ5.append(".png");
        C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5));
        c1331670kl3LJIIIZ2.LJJ(c21282618Qm.LLILZ);
        C1331750klB c1331750klB2 = new C1331750klB();
        c1331750klB2.LIZ = false;
        c1331670kl3LJIIIZ2.LJJI = new C1331730kl9(c1331750klB2);
        c1331670kl3LJIIIZ2.LJJ = EnumC1338240kve.CENTER_CROP;
        C786410Ut5.h3(c1331670kl3LJIIIZ2);
        if (adPaymentModel2.getCardNumber().length() >= 4) {
            TuxTextView tuxTextView5 = c21282618Qm.LLILZIL;
            if (tuxTextView5 != null) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(adPaymentModel2.getCardType());
                sbLIZ6.append(" **** ");
                sbLIZ6.append(adPaymentModel2.getCardNumber().substring(adPaymentModel2.getCardNumber().length() - 4, adPaymentModel2.getCardNumber().length()));
                tuxTextView5.setText(C2188811AlT.LIZIZ(sbLIZ6));
            }
        } else {
            TuxTextView tuxTextView6 = c21282618Qm.LLILZIL;
            if (tuxTextView6 != null) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(adPaymentModel2.getCardType());
                sbLIZ7.append(" **** ");
                sbLIZ7.append(adPaymentModel2.getCardNumber());
                tuxTextView6.setText(C2188811AlT.LIZIZ(sbLIZ7));
            }
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = adPaymentModel2.getExpiryTime();
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = adPaymentModel2.getExpiryTime();
        adPaymentModel2.getExpiryTime();
        if (adPaymentModel2.getExpiryTime().length() >= 4) {
            adPaymentModel2.getExpiryTime().substring(adPaymentModel2.getExpiryTime().length() - 4, adPaymentModel2.getExpiryTime().length());
        }
        if (adPaymentModel2.getExpiryTime().length() >= 2) {
            c259800zU.element = adPaymentModel2.getExpiryTime().substring(0, 2);
            c259800zU2.element = adPaymentModel2.getExpiryTime().substring(adPaymentModel2.getExpiryTime().length() - 2, adPaymentModel2.getExpiryTime().length());
            TuxTextView tuxTextView7 = c21282618Qm.LLILZLL;
            if (tuxTextView7 != null) {
                tuxTextView7.setText((CharSequence) c259800zU.element);
            }
            TuxTextView tuxTextView8 = c21282618Qm.LLIZ;
            if (tuxTextView8 != null) {
                tuxTextView8.setText((CharSequence) c259800zU2.element);
            }
        }
        TuxTextView tuxTextView9 = c21282618Qm.LLILZIL;
        if (tuxTextView9 != null) {
            C786410Ut5.h9(tuxTextView9, new ACListenerS96S0300000_32(adPaymentModel2, c21282618Qm.LLJ, c21282618Qm, 6));
        }
        TuxTextView tuxTextView10 = c21282618Qm.LLILZLL;
        if (tuxTextView10 != null) {
            C786410Ut5.h9(tuxTextView10, new ACListenerS96S0300000_32(c21282618Qm, c259800zU, c21282618Qm.LLJ, 7));
        }
        TuxTextView tuxTextView11 = c21282618Qm.LLIZ;
        if (tuxTextView11 != null) {
            C786410Ut5.h9(tuxTextView11, new ACListenerS96S0300000_32(c21282618Qm, c259800zU2, c21282618Qm.LLJ, 8));
        }
        if (c21282618Qm.LLJ.LLILZ) {
            C197039127h c197039127h = c21282618Qm.LLIZLLLIL;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 0);
            }
            C197039127h c197039127h2 = c21282618Qm.LLIZLLLIL;
            if (c197039127h2 == null) {
                return;
            }
            C786410Ut5.U8(c197039127h2, new ACListenerS134S0200000_32(c21282618Qm.LLJ, c21282618Qm, 25));
            return;
        }
        C197039127h c197039127h3 = c21282618Qm.LLIZLLLIL;
        if (c197039127h3 == null) {
            return;
        }
        C786410Ut5.LLLLLLJ(c197039127h3, 8);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (this.LLILLJJLI) {
            i2 = R.layout.kv;
        } else {
            i2 = R.layout.kw;
        }
        C21282618Qm c21282618Qm = new C21282618Qm(this, C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false));
        try {
            View view = c21282618Qm.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c21282618Qm.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c21282618Qm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C21282618Qm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c21282618Qm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c21282618Qm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C21282618Qm.class.getName();
        return c21282618Qm;
    }

    public C21282518Ql(List<AdPaymentModel> list, boolean z, WebView webView, boolean z2, boolean z3, C1035880d3y c1035880d3y) {
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = webView;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = c1035880d3y;
    }
}
