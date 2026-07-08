package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1198, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1198 extends AnonymousClass1194<AnchorCell, AnonymousClass1198>.c {
    public final SmartImageView LL;
    public final TextView LLILLJJLI;
    public final C197039127h LLILLL;
    public final /* synthetic */ AnonymousClass1199 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1198(AnonymousClass1199 anonymousClass1199, View view) {
        super(view);
        this.LLILZ = anonymousClass1199;
        this.LL = (SmartImageView) view.findViewById(R.id.jug);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.z4s);
        this.LLILLL = (C197039127h) view.findViewById(R.id.cmz);
    }
}
