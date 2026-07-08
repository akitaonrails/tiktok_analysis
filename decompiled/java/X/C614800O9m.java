package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614800O9m extends C09AY implements Function2<VideoAuthorInfoRelationAssem, C291001Au<? extends Integer>, Unit> {
    public C614800O9m() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, C291001Au<? extends Integer> c291001Au) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
        if (c291001Au != null && (videoItemParams = (VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem2)) != null && (aweme = videoItemParams.getAweme()) != null) {
            if (videoAuthorInfoRelationAssem2.LLLLIIIILLL.keySet().contains(aweme.getAid())) {
                VideoAuthorInfoVM videoAuthorInfoVMQp = videoAuthorInfoRelationAssem2.Qp();
                String str = videoAuthorInfoRelationAssem2.LLLLIIIILLL.get(aweme.getAid());
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                videoAuthorInfoVMQp.getClass();
                if (C20684815ws.LJI("tag_anchor_show")) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", videoAuthorInfoVMQp.eventType);
                    String aid = aweme.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    c2344009Gk.LJIIIIZZ("group_id", aid);
                    String authorUid = AwemeExtKt.getAuthorUid(aweme);
                    if (authorUid != null) {
                        str2 = authorUid;
                    }
                    c2344009Gk.LJIIIIZZ("author_id", str2);
                    c2344009Gk.LJIIIIZZ("anchor_type", str);
                    C20684815ws.LJIILLIIL("tag_anchor_show", c2344009Gk.LIZ);
                }
            } else if (TextUtils.isEmpty(videoAuthorInfoRelationAssem2.LLLL)) {
                videoAuthorInfoRelationAssem2.LLLL = aweme.getAid();
            }
        }
        return Unit.LIZ;
    }
}
