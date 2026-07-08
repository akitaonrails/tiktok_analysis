package X;

import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.contacts.api.model.BusinessToolsItem;
import com.ss.android.ugc.aweme.im.contacts.api.model.CommentToDmSetting;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMB2CBusinessInfoAvgResp;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageAlert;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageRequestSetting;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06pK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1725606pK {
    public static final EnumC1725606pK ARCHIVE_SETTINGS;
    public static final EnumC1725606pK B2C_USER_AVG_RESP_TIME;
    public static final EnumC1725606pK BUSINESS_TOOLS_ITEMS;
    public static final EnumC1725606pK COMMENT_TO_DM;
    public static final EnumC1725606pK IM_RELATION_LABEL;
    public static final EnumC1725606pK INBOX_MODE_SWITCH;
    public static final /* synthetic */ EnumC1725606pK[] LLIZ;
    public static final /* synthetic */ C2254308sP LLIZLLLIL;
    public static final EnumC1725606pK MESSAGE_ALERT;
    public static final EnumC1725606pK MESSAGE_REQUEST_SETTING;
    public static final EnumC1725606pK UNKNOWN;
    public final int LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final Type LLILZIL;
    public final List<C05KF> LLILZLL;

    public static InterfaceC2044707zh<EnumC1725606pK> getEntries() {
        return LLIZLLLIL;
    }

    static {
        EnumC1725606pK enumC1725606pK = new EnumC1725606pK("UNKNOWN", 0, 0, false, false, false, Object.class);
        UNKNOWN = enumC1725606pK;
        EnumC1725606pK enumC1725606pK2 = new EnumC1725606pK("INBOX_MODE_SWITCH", 1, 1, true, false, true, Integer.TYPE);
        INBOX_MODE_SWITCH = enumC1725606pK2;
        C05KF c05kf = C05KF.SWITCH_ACCOUNT;
        EnumC1725606pK enumC1725606pK3 = new EnumC1725606pK("B2C_USER_AVG_RESP_TIME", 2, 4, true, false, true, IMB2CBusinessInfoAvgResp.class, Collections.singletonList(c05kf));
        B2C_USER_AVG_RESP_TIME = enumC1725606pK3;
        EnumC1725606pK enumC1725606pK4 = new EnumC1725606pK("ARCHIVE_SETTINGS", 3, 5, true, true, true, IMUserArchiveSettings.class);
        ARCHIVE_SETTINGS = enumC1725606pK4;
        EnumC1725606pK enumC1725606pK5 = new EnumC1725606pK("MESSAGE_REQUEST_SETTING", 4, 6, true, true, true, MessageRequestSetting.class);
        MESSAGE_REQUEST_SETTING = enumC1725606pK5;
        EnumC1725606pK enumC1725606pK6 = new EnumC1725606pK("COMMENT_TO_DM", 5, 8, true, true, true, CommentToDmSetting.class);
        COMMENT_TO_DM = enumC1725606pK6;
        EnumC1725606pK enumC1725606pK7 = new EnumC1725606pK("BUSINESS_TOOLS_ITEMS", 6, 9, true, true, true, TypeToken.getParameterized(List.class, BusinessToolsItem.class).getType(), Collections.singletonList(C05KF.INBOX_MODE_SWITCH));
        BUSINESS_TOOLS_ITEMS = enumC1725606pK7;
        EnumC1725606pK enumC1725606pK8 = new EnumC1725606pK("MESSAGE_ALERT", 7, 10, true, true, true, MessageAlert.class);
        MESSAGE_ALERT = enumC1725606pK8;
        EnumC1725606pK enumC1725606pK9 = new EnumC1725606pK("IM_RELATION_LABEL", 8, 11, true, false, true, IMRelationLabelInfo.class, Collections.singletonList(c05kf));
        IM_RELATION_LABEL = enumC1725606pK9;
        EnumC1725606pK[] enumC1725606pKArr = {enumC1725606pK, enumC1725606pK2, enumC1725606pK3, enumC1725606pK4, enumC1725606pK5, enumC1725606pK6, enumC1725606pK7, enumC1725606pK8, enumC1725606pK9};
        LLIZ = enumC1725606pKArr;
        LLIZLLLIL = new C2254308sP(enumC1725606pKArr);
    }

    public static EnumC1725606pK[] values() {
        return (EnumC1725606pK[]) LLIZ.clone();
    }

    public final boolean getAllowUsingLocalStaleValue() {
        return this.LLILZ;
    }

    public final List<C05KF> getClearCacheScenes() {
        return this.LLILZLL;
    }

    public final Type getDataType() {
        return this.LLILZIL;
    }

    public final boolean getInitFromServerRequestOnLaunch() {
        return this.LLILLL;
    }

    public final int getValue() {
        return this.LL;
    }

    public final boolean isStoredToKeva() {
        return this.LLILLJJLI;
    }

    public static EnumC1725606pK valueOf(String str) {
        return (EnumC1725606pK) C08FF.LIZ(EnumC1725606pK.class, str);
    }

    public EnumC1725606pK(String str, int i, int i2, boolean z, boolean z2, boolean z3, Type type) {
        this(str, i, i2, z, z2, z3, type, C13BV.INSTANCE);
    }

    public EnumC1725606pK(String str, int i, int i2, boolean z, boolean z2, boolean z3, Type type, List list) {
        this.LL = i2;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = type;
        this.LLILZLL = list;
    }
}
