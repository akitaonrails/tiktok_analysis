package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664020Q2u {
    public static final C664020Q2u LIZ = new C664020Q2u();

    @InterfaceC1294060jmO
    public static void LIZ(C650950Pg5 c650950Pg5, C0QER c0qer) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        String str = "1";
        if (!Intrinsics.LJFF(c650950Pg5.getImmutableData().searchCommonModel.isFromVideo(), "1") && !Intrinsics.LJFF(c0qer.isFromVideoFix(), "1")) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0P8O c0p8o = new C0P8O(c650950Pg5.getSourceId(), true);
        C646640PXy.LIZ.getClass();
        ISearchContextAbility iSearchContextAbilityL = C646640PXy.LIZ().l(c0p8o);
        String str2 = c650950Pg5.getImmutableData().searchCommonModel.enterFrom;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = c650950Pg5.getImmutableData().searchCommonModel.previousPage;
        if (str4 == null) {
            str4 = "";
        }
        boolean z = c650950Pg5.getImmutableData().searchCommonModel.shouldShowScanView;
        boolean z2 = c650950Pg5.getImmutableData().searchCommonModel.shouldShowSug;
        String strIsFromComment = c650950Pg5.getImmutableData().searchCommonModel.isFromComment();
        if (strIsFromComment == null) {
            strIsFromComment = "";
        }
        String strIsFromVideo = c650950Pg5.getImmutableData().searchCommonModel.isFromVideo();
        if (strIsFromVideo == null) {
            strIsFromVideo = "";
        }
        iSearchContextAbilityL.fe(new C664010Q2t(str2, str4, z, z2, strIsFromComment, str, c650950Pg5.getImmutableData().searchCommonModel.backPressFlag, c650950Pg5.getImmutableData().searchCommonModel.feedSearchBarFlag, c650950Pg5.getImmutableData().searchCommonModel.keepTabPosition, strIsFromVideo, c650950Pg5.getImmutableData().searchCommonModel.takoProcessId, c650950Pg5.getImmutableData().searchCommonModel.takoMessageId));
        String str5 = c650950Pg5.getImmutableData().searchVideoModel.authorId;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = c650950Pg5.getImmutableData().searchVideoModel.groupId;
        if (str6 != null) {
            str3 = str6;
        }
        Boolean boolIsFeedLiked = c650950Pg5.getImmutableData().searchVideoModel.isFeedLiked();
        if (boolIsFeedLiked != null) {
            zBooleanValue = boolIsFeedLiked.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean boolIsFeedCollected = c650950Pg5.getImmutableData().searchVideoModel.isFeedCollected();
        if (boolIsFeedCollected != null) {
            zBooleanValue2 = boolIsFeedCollected.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Boolean boolIsFeedCommentClicked = c650950Pg5.getImmutableData().searchVideoModel.isFeedCommentClicked();
        if (boolIsFeedCommentClicked != null) {
            zBooleanValue3 = boolIsFeedCommentClicked.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        Boolean boolIsFeedForwardClicked = c650950Pg5.getImmutableData().searchVideoModel.isFeedForwardClicked();
        if (boolIsFeedForwardClicked != null) {
            zBooleanValue4 = boolIsFeedForwardClicked.booleanValue();
        } else {
            zBooleanValue4 = false;
        }
        iSearchContextAbilityL.fe(new C0Q37(str5, zBooleanValue, zBooleanValue2, zBooleanValue3, str3, zBooleanValue4));
    }
}
