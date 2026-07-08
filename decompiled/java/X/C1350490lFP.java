package X;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarAction;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;

/* JADX INFO: renamed from: X.0lFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350490lFP extends C09AY implements InterfaceC1631620sYq<View, Integer, MotionEvent, Boolean> {
    public final /* synthetic */ C1350480lFO LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ CommentTopBarComponent LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Aweme LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350490lFP(C1350480lFO c1350480lFO, Context context, CommentTopBarComponent commentTopBarComponent, String str, Aweme aweme) {
        super(3);
        this.LL = c1350480lFO;
        this.LLILLJJLI = context;
        this.LLILLL = commentTopBarComponent;
        this.LLILZ = str;
        this.LLILZIL = aweme;
    }

    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(View view, Integer num, MotionEvent motionEvent) {
        Long lLJIILIIL;
        String string;
        String aid;
        num.intValue();
        C1350480lFO c1350480lFO = this.LL;
        Context context = this.LLILLJJLI;
        CommentTopBarComponent commentTopBarComponent = this.LLILLL;
        String str = this.LLILZ;
        Aweme aweme = this.LLILZIL;
        c1350480lFO.getClass();
        C1350520lFS.LIZIZ(commentTopBarComponent);
        CommentTopBarAction commentTopBarAction = commentTopBarComponent.action;
        if (commentTopBarAction != null && (string = commentTopBarAction.schema) != null) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (string.length() != 0) {
                Uri.Builder builderBuildUpon = UriProtector.parse(string).buildUpon();
                builderBuildUpon.appendQueryParameter("source", "comment_activity");
                builderBuildUpon.appendQueryParameter("current_page", aid);
                builderBuildUpon.appendQueryParameter("last_group_id", str);
                string = builderBuildUpon.build().toString();
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, string);
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.withParam("refer", str);
            smartRouteBuildRoute.open();
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        EnumC1342350l2H enumC1342350l2H = EnumC1342350l2H.CLICK;
        String str2 = commentTopBarComponent.bizId;
        if (str2 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str2);
        } else {
            lLJIILIIL = null;
        }
        c1350920lG6.getClass();
        C1350920lG6.LJLI(enumC1342350l2H, lLJIILIIL, aweme, str);
        C1350920lG6.LJLIL(commentTopBarComponent, str, aweme, null);
        return Boolean.TRUE;
    }
}
