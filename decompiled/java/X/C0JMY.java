package X;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JMY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMY extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C0JMR LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JMY(long j, Activity activity, C0JMR c0jmr, String str) {
        super(1);
        this.LL = c0jmr;
        this.LLILLJJLI = activity;
        this.LLILLL = j;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        String aid;
        C490770JMl.LJ(Long.valueOf(this.LL.LIZ), "click", "report");
        C0JMX c0jmx = C0JMX.LIZ;
        Activity activity = this.LLILLJJLI;
        C0JMR c0jmr = this.LL;
        long j = this.LLILLL;
        String str = this.LLILZ;
        c0jmx.getClass();
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "video");
        Aweme awemeLIZIZ = c0jmr.LIZIZ();
        String aid2 = null;
        if (awemeLIZIZ != null) {
            aid2 = awemeLIZIZ.getAid();
        }
        String str2 = "";
        if (aid2 == null) {
            aid2 = "";
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("object_id", aid2).appendQueryParameter("owner_id", String.valueOf(j));
        Aweme awemeLIZIZ2 = c0jmr.LIZIZ();
        if (awemeLIZIZ2 != null && (aid = awemeLIZIZ2.getAid()) != null) {
            str2 = aid;
        }
        ComplianceServiceProvider.LJJ().LIZIZ(activity, builderAppendQueryParameter2.appendQueryParameter("group_id", str2).appendQueryParameter("enter_from", str));
        return Unit.LIZ;
    }
}
