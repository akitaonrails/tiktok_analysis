package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import wh6.AbS510S0200000_24;

/* JADX INFO: renamed from: X.0rDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579870rDN extends AbstractC1579890rDP<C1579490rCl> {
    public C1579490rCl LL;
    public RemoteImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C1579880rDO LLILZLL;

    @Override // X.AbstractC1579890rDP
    public final void onViewCreated(View view) {
        this.LLILLJJLI = (RemoteImageView) view.findViewById(R.id.kgf);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zwv);
        TuxTextView tuxTextView2 = null;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(C1578770rBb.LIZ(this.LLILZIL, R.attr.a1h));
        } else {
            tuxTextView = null;
        }
        this.LLILLL = tuxTextView;
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.tv_sub_title);
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(C1578770rBb.LIZ(this.LLILZIL, R.attr.a1k));
            tuxTextView2 = tuxTextView3;
        }
        this.LLILZ = tuxTextView2;
        C786410Ut5.I7(new AbS510S0200000_24(this, this.LLILZLL, 0), view);
    }

    @Override // X.AbstractC1579890rDP
    public final void I5(int i, Object obj) {
        String str;
        String str2;
        String str3;
        C1579490rCl c1579490rCl = (C1579490rCl) obj;
        this.LL = c1579490rCl;
        RemoteImageView remoteImageView = this.LLILLJJLI;
        if (remoteImageView != null) {
            if (c1579490rCl != null) {
                str3 = c1579490rCl.LJFF;
            } else {
                str3 = null;
            }
            C1324840ka2.LJIIJ(remoteImageView, str3, 80, 108);
        }
        TuxTextView tuxTextView = this.LLILLL;
        String str4 = "";
        if (tuxTextView != null) {
            if (c1579490rCl == null || (str2 = c1579490rCl.LJI) == null) {
                str2 = "";
            }
            tuxTextView.setText(str2);
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            if (c1579490rCl != null && (str = c1579490rCl.LJII) != null) {
                str4 = str;
            }
            tuxTextView2.setText(str4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579870rDN(ViewGroup viewGroup, Context context, C1579880rDO c1579880rDO) {
        super(R.layout.f4z, viewGroup);
        this.LLILZIL = context;
        this.LLILZLL = c1579880rDO;
    }
}
