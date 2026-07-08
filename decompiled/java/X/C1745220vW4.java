package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745220vW4 extends LinearLayout {
    public final TuxTextView LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final C197039127h LLILZIL;

    public final void setCandInputData(CandInputData candInputData) {
        ViewItem viewItem;
        String str;
        ViewItem viewItem2;
        TuxTextView tuxTextView = this.LLILLL;
        String str2 = null;
        if (tuxTextView != null) {
            List<ViewItem> list = candInputData.viewItems;
            if (list != null && (viewItem2 = (ViewItem) C13LP.LJJJLZIJ(0, list)) != null) {
                str = viewItem2.text;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            List<ViewItem> list2 = candInputData.viewItems;
            if (list2 != null && (viewItem = (ViewItem) C13LP.LJJJLZIJ(1, list2)) != null) {
                str2 = viewItem.text;
            }
            tuxTextView2.setText(str2);
        }
    }

    public final void setUseBtnClickListener(Function0<Unit> function0) {
        C197039127h c197039127h = this.LLILZIL;
        if (c197039127h != null) {
            C786410Ut5.I7(new AjS70S0100000_26(function0, 11), c197039127h);
        }
    }

    public C1745220vW4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.ajj, C786410Ut5.ne(context), this);
        this.LL = (TuxTextView) findViewById(R.id.nx2);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.noc);
        this.LLILLL = (TuxTextView) findViewById(R.id.ahi);
        this.LLILZ = (TuxTextView) findViewById(R.id.ahe);
        this.LLILZIL = (C197039127h) findViewById(R.id.use_btn);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        setBackground(c384050F3z.LIZ(getContext()));
    }
}
