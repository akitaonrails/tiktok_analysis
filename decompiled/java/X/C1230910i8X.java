package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0i8X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230910i8X implements Serializable {
    public final int businessType;
    public final long clickTimeStamp;
    public final int createChatLandingPage;
    public final String defaultGroupName;
    public final int disableMask;
    public final boolean enableClickSelectGroup;
    public final String enterFrom;
    public final String enterMethod;
    public final int excludeBusinessType;
    public final Map<String, String> followLogParams;
    public final boolean hideGroupListTitleText;
    public final List<Integer> inviteTypeList;
    public final int isFullScreen;
    public final EnumC1230500i7s joinGroupSource;
    public final int pageStyle;
    public final Integer panelHeight;
    public final int scene;
    public final Integer timeRange;
    public final String trafficType;
    public final boolean useLocalCache;
    public final boolean useOldFanGroupList;

    public C1230910i8X() {
        this("", "", 1, "", EnumC1219960hqs.UNKNOWN.getValue(), EnumC1219960hqs.UNKNOWN.getValue(), null, EnumC1228720i50.CHAT_ROOM.getValue(), EnumC1230920i8Y.DEFAULT.getValue(), "", 0, false, false, EnumC1229950i6z.DEFAULT.getValue(), System.currentTimeMillis(), false, false, null, null, null, null);
    }

    public final boolean useAnchorSelectStyle() {
        return this.pageStyle == EnumC1229950i6z.ANCHOR_SELECT_STYLE.getValue();
    }

    public final boolean useSelectStyle() {
        return this.pageStyle == EnumC1229950i6z.SELECT_STYLE.getValue() || this.pageStyle == EnumC1229950i6z.ANCHOR_SELECT_STYLE.getValue();
    }

    public final int isFullScreen() {
        return this.isFullScreen;
    }

    public C1230910i8X(String str, String str2, int i, String str3, int i2, int i3, Integer num, int i4, int i5, String str4, int i6, boolean z, boolean z2, int i7, long j, boolean z3, boolean z4, List<Integer> list, Integer num2, Map<String, String> map, EnumC1230500i7s enumC1230500i7s) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.isFullScreen = i;
        this.defaultGroupName = str3;
        this.businessType = i2;
        this.excludeBusinessType = i3;
        this.panelHeight = num;
        this.createChatLandingPage = i4;
        this.scene = i5;
        this.trafficType = str4;
        this.disableMask = i6;
        this.hideGroupListTitleText = z;
        this.enableClickSelectGroup = z2;
        this.pageStyle = i7;
        this.clickTimeStamp = j;
        this.useLocalCache = z3;
        this.useOldFanGroupList = z4;
        this.inviteTypeList = list;
        this.timeRange = num2;
        this.followLogParams = map;
        this.joinGroupSource = enumC1230500i7s;
    }
}
