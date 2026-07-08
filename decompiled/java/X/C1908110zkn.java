package X;

import Y.ACListenerS162S0100000_28;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908110zkn extends RecyclerView.ViewHolder {
    public final View LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    public C1908110zkn(View view, UrlModel urlModel, String str, String str2, Function0<Unit> function0) throws Throwable {
        super(view);
        this.LL = view;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 466));
        this.LLILLJJLI = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS572S0100000_28(this, 467));
        this.LLILLL = c01gwLIZIZ2;
        if (urlModel != null) {
            RemoteImageView remoteImageView = (RemoteImageView) c01gwLIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1906770zid.THIRD_PAGE.getCoverSceneTag());
            sbLIZ.append("@@inbox_notice");
            C1324840ka2.LJII(remoteImageView, urlModel, null, null, C2188811AlT.LIZIZ(sbLIZ));
        } else if (str != null && str.length() > 0) {
            C1324840ka2.LJIIJ((RemoteImageView) c01gwLIZIZ.getValue(), str, -1, -1);
        }
        C786410Ut5.E9((RemoteImageView) c01gwLIZIZ.getValue(), new ACListenerS162S0100000_28(function0, 67));
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LLLLZLL((TuxTextView) c01gwLIZIZ2.getValue(), 0);
            ((TextView) c01gwLIZIZ2.getValue()).setText(str2);
            C439870HMr.LIZJ((TextView) c01gwLIZIZ2.getValue(), null);
        }
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        View view2 = (View) c01gwLIZIZ.getValue();
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.AVATAR;
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        c1906140zhc.getClass();
        C1906140zhc.LIZ(view2, enumC1906160zhe, fLIZIZ);
    }
}
