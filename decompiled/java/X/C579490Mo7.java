package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.tt.appbrandimpl.PublishExtra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0Mo7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579490Mo7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(MicroAppModel microAppModel, StringBuilder sb, List list) {
        PublishExtra publishExtra;
        List<TaskMentionedUser> list2;
        if (microAppModel != null && (!TextUtils.isEmpty(microAppModel.extra)) && (publishExtra = (PublishExtra) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), microAppModel.extra, PublishExtra.class)) != null) {
            List<String> list3 = publishExtra.hashTagList;
            if (list3 != null && (!list3.isEmpty())) {
                for (String str : list3) {
                    sb.append("#");
                    sb.append(str);
                    sb.append(" ");
                }
            }
            String str2 = publishExtra.videoTitle;
            if (str2 != null && (list2 = publishExtra.userList) != null && (!list2.isEmpty())) {
                ArrayList arrayList = new ArrayList();
                for (TaskMentionedUser taskMentionedUser : list2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(taskMentionedUser.getNickname());
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                sb.append(C786410Ut5.j4(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
                for (TaskMentionedUser taskMentionedUser2 : list2) {
                    int iIndexOf = sb.indexOf(taskMentionedUser2.getNickname()) - 1;
                    ((ArrayList) list).add(AVTextExtraStructHelper.createAtStruct(iIndexOf, iIndexOf + 1 + taskMentionedUser2.getNickname().length(), taskMentionedUser2.getUserId(), taskMentionedUser2.getSecUid()));
                }
            }
        }
    }
}
