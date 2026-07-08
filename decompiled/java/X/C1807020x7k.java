package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeStandardizeUISetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807020x7k extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final ViewGroup LLILLL;
    public final ImageView LLILZ;
    public final TextView LLILZIL;
    public final ViewStub LLILZLL;

    public C1807020x7k(View view) {
        int i;
        super(view);
        this.LL = view;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.ftm);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.nbm);
        view.findViewById(R.id.f725j27);
        this.LLILZ = (ImageView) view.findViewById(R.id.lsx);
        if (LiveRechargeStandardizeUISetting.INSTANCE.getValue()) {
            i = R.id.rts;
        } else {
            i = R.id.rst;
        }
        this.LLILZIL = (TextView) view.findViewById(i);
        this.LLILZLL = (ViewStub) view.findViewById(R.id.m7_);
    }

    public final void I5(int i, C1806990x7h c1806990x7h, Diamond diamond) {
        String str;
        String str2 = diamond.iapId;
        Diamond value = c1806990x7h.LLILLL.LLLLIILL.getValue();
        if (value != null) {
            str = value.iapId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            ViewGroup viewGroup = this.LLILLL;
            if (viewGroup != null) {
                viewGroup.setBackground(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.ec2));
            }
            c1806990x7h.LLIZ = i;
            return;
        }
        ViewGroup viewGroup2 = this.LLILLL;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setBackground(C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.ec3));
    }
}
