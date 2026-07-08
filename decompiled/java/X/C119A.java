package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.119A, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119A extends AnonymousClass1194<LiveEventModule, C119A>.a {
    public final SmartImageView LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final C1841350y17 LLILZ;
    public final View LLILZIL;
    public final /* synthetic */ C119B LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119A(C119B c119b, View view) {
        super(c119b, view);
        this.LLILZLL = c119b;
        this.LL = (SmartImageView) view.findViewById(R.id.k1o);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.z4s);
        this.LLILLL = (TextView) view.findViewById(R.id.zhs);
        this.LLILZ = (C1841350y17) view.findViewById(R.id.dq8);
        this.LLILZIL = view.findViewById(R.id.moq);
    }
}
