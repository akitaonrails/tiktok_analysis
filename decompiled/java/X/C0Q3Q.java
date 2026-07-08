package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* JADX INFO: renamed from: X.0Q3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3Q {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, Fragment fragment, SearchResultParam searchResultParam) {
        Activity activityLIZ;
        String groupId;
        String entrySearchSource;
        boolean z;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean z2;
        n nVar = new n();
        String isSarRecall = null;
        if (context != null) {
            activityLIZ = C2493909px.LIZ(context);
        } else {
            activityLIZ = null;
        }
        String string = "";
        boolean zBooleanValue4 = false;
        if (!(activityLIZ instanceof LifecycleOwner)) {
            groupId = "";
            entrySearchSource = "";
            z = false;
            zBooleanValue = false;
            zBooleanValue2 = false;
        } else {
            C646000PVm c646000PVm = C650950Pg5.Companion;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            c646000PVm.getClass();
            C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, c19egLIZIZ);
            if (c650960Pg6LJII == null) {
                if (searchResultParam == null || (groupId = searchResultParam.getGroupId()) == null) {
                    groupId = "";
                }
                if (searchResultParam != null && searchResultParam.isFeedLiked()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (searchResultParam != null && searchResultParam.isFeedCommentClicked()) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = false;
                }
                if (searchResultParam != null && searchResultParam.isFeedForwardClicked()) {
                    zBooleanValue2 = true;
                } else {
                    zBooleanValue2 = false;
                }
                if (searchResultParam != null && searchResultParam.isFeedCollected()) {
                    zBooleanValue4 = true;
                }
                z = zBooleanValue4;
                zBooleanValue4 = z2;
            } else {
                C664030Q2v c664030Q2v = c650960Pg6LJII.searchVideoModel;
                groupId = c664030Q2v.groupId;
                if (groupId == null) {
                    groupId = "";
                }
                Boolean boolIsFeedLiked = c664030Q2v.isFeedLiked();
                if (boolIsFeedLiked != null) {
                    zBooleanValue3 = boolIsFeedLiked.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                Boolean boolIsFeedCommentClicked = c650960Pg6LJII.searchVideoModel.isFeedCommentClicked();
                if (boolIsFeedCommentClicked != null) {
                    zBooleanValue = boolIsFeedCommentClicked.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean boolIsFeedForwardClicked = c650960Pg6LJII.searchVideoModel.isFeedForwardClicked();
                if (boolIsFeedForwardClicked != null) {
                    zBooleanValue2 = boolIsFeedForwardClicked.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                Boolean boolIsFeedCollected = c650960Pg6LJII.searchVideoModel.isFeedCollected();
                if (boolIsFeedCollected != null) {
                    zBooleanValue4 = boolIsFeedCollected.booleanValue();
                }
                z = zBooleanValue4;
                zBooleanValue4 = zBooleanValue3;
            }
            if (searchResultParam == null || (entrySearchSource = searchResultParam.getEntrySearchSource(Boolean.TRUE)) == null) {
                entrySearchSource = "";
            }
        }
        n nVar2 = new n();
        nVar2.LJJIIJ("last_feed_group_id", groupId);
        nVar2.LJJII(Boolean.valueOf(zBooleanValue4), "last_feed_like_status");
        nVar2.LJJII(Boolean.valueOf(zBooleanValue), "last_feed_click_comment");
        nVar2.LJJII(Boolean.valueOf(zBooleanValue2), "last_feed_click_forward");
        nVar2.LJJII(Boolean.valueOf(z), "last_feed_favorite_status");
        nVar2.LJJIIJ("entry_search_source", entrySearchSource);
        if (searchResultParam != null) {
            isSarRecall = searchResultParam.getIsSarRecall();
        }
        if (C703302op.LIZ(isSarRecall)) {
            nVar2.LJJIIJ("is_sar_recall", "1");
        }
        nVar.LJJIFFI("last_feed_context", nVar2);
        try {
            string = nVar.toString();
            return string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return string;
        }
    }
}
