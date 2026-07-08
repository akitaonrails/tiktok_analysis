package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.118y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194534118y extends AnonymousClass1194<AnchorModule, C194534118y>.a {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final /* synthetic */ C194533118x LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C194534118y(C194533118x c194533118x, View view) {
        super(c194533118x, view);
        this.LLILLL = c194533118x;
        this.LL = (TextView) view.findViewById(R.id.txt_more);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.txt_recently_add);
    }
}
