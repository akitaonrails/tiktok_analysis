package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.zhiliaoapp.musically.R;
import g1c.AjS6S0201000_26;
import java.util.List;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749440vcs extends ArrayAdapter<CpfElem> {
    public final int LL;
    public final List<CpfElem> LLILLJJLI;
    public AwS640S0100000_26 LLILLL;
    public String LLILZ;

    public C1749440vcs(Context context, List list) {
        super(context, R.layout.aoq, list);
        this.LL = R.layout.aoq;
        this.LLILLJJLI = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), this.LL, viewGroup, false);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.z37);
        CpfElem cpfElem = (CpfElem) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (cpfElem != null) {
            String str = cpfElem.maskCode;
            String str2 = this.LLILZ;
            if (str2 != null && str != null && a0.LJJIIZI(str, str2, false)) {
                String str3 = this.LLILZ;
                if (str3 != null) {
                    int iLJJJ = a0.LJJJ(str, str3, 0, false, 6);
                    String str4 = this.LLILZ;
                    if (str4 != null) {
                        int length = str4.length();
                        SpannableString spannableString = new SpannableString(str);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                        if (numLIZJ != null) {
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, length + iLJJJ, 33);
                            tuxTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
                        } else {
                            tuxTextView.setText(str);
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                tuxTextView.setText(str);
            }
            C786410Ut5.I7(new AjS6S0201000_26(this, cpfElem, i, 1), viewTd);
            return viewTd;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("cpfInfo is null");
        return viewTd;
    }
}
