package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.CommentVideoConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;

/* JADX INFO: renamed from: X.0mPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395000mPC {
    public static final C1395000mPC LIZ = new C1395000mPC();

    public static final void LIZ(Context context, CommentVideoModel commentVideoModel) {
        RecordConfig.Builder builder = new RecordConfig.Builder();
        String shootWay = commentVideoModel.getShootWay();
        String str = "";
        if (shootWay == null) {
            shootWay = "";
        }
        builder.shootWay(shootWay);
        CommentVideoConfig commentVideoConfig = new CommentVideoConfig();
        commentVideoConfig.setCommentVideoModel(commentVideoModel);
        builder.CommentVideoConfig(commentVideoConfig);
        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        String shootWay2 = commentVideoModel.getShootWay();
        if (shootWay2 != null) {
            str = shootWay2;
        }
        iExternalService.asyncService(context, str, new C1402090mad(context, builder, 3));
    }
}
