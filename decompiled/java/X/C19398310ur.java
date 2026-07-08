package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19398310ur extends RecyclerView.ViewHolder {
    public final Function1<M10nMockDebugErrorInfo, Unit> LL;
    public final TextView LLILLJJLI;
    public final ImageView LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C19398310ur(View view, Function1<? super M10nMockDebugErrorInfo, Unit> function1) {
        super(view);
        this.LL = function1;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.zfd);
        this.LLILLL = (ImageView) view.findViewById(R.id.khr);
    }
}
