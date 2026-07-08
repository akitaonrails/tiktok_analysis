package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233090iC3 extends RecyclerView.ViewHolder {
    public final Function1<MinisSubscriptionInfo, Unit> LL;
    public final C427870Gq9 LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1233090iC3(View view, Function1<? super MinisSubscriptionInfo, Unit> function1) {
        super(view);
        this.LL = function1;
        this.LLILLJJLI = (C427870Gq9) view.findViewById(R.id.l8r);
        this.LLILLL = (TextView) view.findViewById(R.id.zfd);
        this.LLILZ = (TextView) view.findViewById(R.id.z9v);
        this.LLILZIL = (TextView) view.findViewById(R.id.zxt);
    }
}
