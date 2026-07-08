package X;

import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchPublishResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteDeleteResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0lTS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1359200lTS extends InterfaceC149400hg {
    C19482011Jy a0(String str, String str2, List list, List list2, Long l, Integer num, String str3, String str4, Boolean bool);

    AbstractC19484711Kz<UpvoteDeleteResponse> deleteUpvote(String str, Integer num, String str2);

    AbstractC19484711Kz<UpvoteBatchPublishResponse> r(List<String> list);
}
