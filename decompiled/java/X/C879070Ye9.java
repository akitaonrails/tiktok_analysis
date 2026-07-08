package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ye9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879070Ye9 {
    public static final boolean LIZ(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        if (!c0y8t.getConversationTags().contains(EnumC879080YeA.AD.getValue())) {
            C0Y8Y coreInfo = c0y8t.getCoreInfo();
            if (coreInfo != null && (ext = coreInfo.getExt()) != null) {
                str = ext.get("a:ad_creative_tags");
            } else {
                str = null;
            }
            if (!C866950Xzh.LIZ(str)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LIZIZ(C0Y8T c0y8t) {
        NoticeFeature noticeFeatureLIZ;
        C05RV c05rvLIZJ;
        IMChatListApi.LJJIII.getClass();
        if (!C890330YwJ.LIZ().LJJIII() || (noticeFeatureLIZ = NoticeFeature.LIZ.LIZ()) == null || (c05rvLIZJ = noticeFeatureLIZ.LIZJ()) == null) {
            return false;
        }
        int i = C06SS.LIZ[c05rvLIZJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                C880710Ygn.LIZJ.getClass();
                if (!((List) AnonymousClass0555.LIZ(r0)).contains(FilterTabType.SPAM.getSerializedName())) {
                    if (!LIZLLL(c0y8t, false) && !LJ(c0y8t, true)) {
                        return false;
                    }
                } else {
                    return LIZLLL(c0y8t, true);
                }
            } else {
                return LIZLLL(c0y8t, true);
            }
        } else if (!LIZLLL(c0y8t, false) && !LJ(c0y8t, true)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(C0Y8T c0y8t) {
        return c0y8t.getConversationTags().contains(EnumC879080YeA.STARRED.getValue());
    }

    public static final boolean LIZJ(C0Y8T c0y8t, boolean z) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creator_inbox_criteria_exp", true) >= 1) {
            if (!c0y8t.getConversationTags().contains(EnumC879080YeA.PRIMARY.getValue()) && c0y8t.getConversationTags().contains(EnumC879080YeA.SECONDARY.getValue())) {
                return false;
            }
        } else {
            EnumC868530Y5j enumC868530Y5jFromValue = EnumC868530Y5j.fromValue(c0y8t.getCategory());
            if (enumC868530Y5jFromValue != null && enumC868530Y5jFromValue != EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY) {
                return false;
            }
        }
        if (z && c0y8t.getConversationTags().contains(EnumC879080YeA.SPAM.getValue())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(C0Y8T c0y8t, boolean z) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creator_inbox_criteria_exp", true) >= 1) {
            if (!c0y8t.getConversationTags().contains(EnumC879080YeA.SECONDARY.getValue())) {
                return false;
            }
        } else if (EnumC868530Y5j.fromValue(c0y8t.getCategory()) != EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_SECONDARY) {
            return false;
        }
        if (z && c0y8t.getConversationTags().contains(EnumC879080YeA.SPAM.getValue())) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(C0Y8T c0y8t, boolean z) {
        C05RV c05rvLIZJ;
        if (c0y8t.getConversationTags().contains(EnumC879080YeA.SPAM.getValue())) {
            if (!z) {
                NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
                if (noticeFeatureLIZ != null) {
                    c05rvLIZJ = noticeFeatureLIZ.LIZJ();
                } else {
                    c05rvLIZJ = null;
                }
                if (c05rvLIZJ != C05RV.BUSINESS_INBOX) {
                    C880710Ygn.LIZJ.getClass();
                    if (!((List) AnonymousClass0555.LIZ(r0)).contains(FilterTabType.SPAM.getSerializedName())) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
