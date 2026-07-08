package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CV7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CV7 implements WireEnum {
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_UNKNOWN(0),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_LIST_CHANGE_IM(1),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_GROUP_LIST_CHANGE_IM(2),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_P_TO_P_GROUP_LIST_CHANGE_IM(3),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_UPDATE_GROUP_USER_LIST(4),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_USER_MANAGER_NOTIFY(5),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_MIGRATE_GROUP_REQ(6),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_RECHARGE_REQ(7),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_LOCAL_CHANGE(8),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_SEI_LIST_CHANGE(9),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_INNER_LINK_MIC_ACTION(10),
    VAR_LINK_MIC_LIST_CHANGE_SOURCE_CROSS_LINK_MIC_ACTION(11);

    public static final ProtoAdapter<C1CV7> ADAPTER = new EnumAdapter<C1CV7>() { // from class: X.1CV6
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CV7.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CV7 fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_UNKNOWN;
            case 1:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_LIST_CHANGE_IM;
            case 2:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_GROUP_LIST_CHANGE_IM;
            case 3:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_P_TO_P_GROUP_LIST_CHANGE_IM;
            case 4:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_UPDATE_GROUP_USER_LIST;
            case 5:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_USER_MANAGER_NOTIFY;
            case 6:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_MIGRATE_GROUP_REQ;
            case 7:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_RECHARGE_REQ;
            case 8:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_LOCAL_CHANGE;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_SEI_LIST_CHANGE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_INNER_LINK_MIC_ACTION;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_LINK_MIC_LIST_CHANGE_SOURCE_CROSS_LINK_MIC_ACTION;
            default:
                return null;
        }
    }

    public static C1CV7 valueOf(String str) {
        return (C1CV7) C08FF.LIZ(C1CV7.class, str);
    }

    C1CV7(int i) {
        this.LL = i;
    }
}
