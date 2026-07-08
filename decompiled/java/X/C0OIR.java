package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingValue;
import com.ss.android.ugc.aweme.notification.api.BulletinCommentAllowItemType;
import com.ss.android.ugc.aweme.notification.api.BulletinCommentSetting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OIR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OIR {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(581));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(582));
    public BulletinCommentSetting LIZJ;

    public final BulletinCommentSetting LIZIZ() {
        BulletinCommentSetting bulletinCommentSetting;
        String string;
        if (this.LIZJ == null) {
            try {
                string = ((Keva) this.LIZIZ.getValue()).getString("key_comment_enable", "");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadBulletinCommentSetting error :");
                sbLIZ.append(e.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (string != null) {
                bulletinCommentSetting = (BulletinCommentSetting) ((Gson) this.LIZ.getValue()).LJIIIIZZ(string, new TypeToken<BulletinCommentSetting>() { // from class: X.0OIb
                }.getType());
                if (bulletinCommentSetting == null) {
                    bulletinCommentSetting = new BulletinCommentSetting(null, null);
                }
                this.LIZJ = bulletinCommentSetting;
            } else {
                bulletinCommentSetting = new BulletinCommentSetting(null, null);
                this.LIZJ = bulletinCommentSetting;
            }
        }
        return this.LIZJ;
    }

    public final void LIZJ(BulletinSettingList bulletinSettingList) {
        List<BulletinSetting> list;
        String str;
        BulletinSetting next;
        Boolean bool;
        if (bulletinSettingList != null && (list = bulletinSettingList.settings) != null) {
            Iterator<BulletinSetting> it2 = list.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num = next.settingType;
                    int type = EnumC604980No8.BULLETIN_SETTING_TYPE_CHANNEL_COMMENT.getType();
                    if (num != null && num.intValue() == type) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BulletinSetting bulletinSetting = next;
            if (bulletinSetting != null) {
                BulletinSettingValue bulletinSettingValue = bulletinSetting.value;
                if (bulletinSettingValue != null) {
                    bool = bulletinSettingValue.boolValue;
                } else {
                    bool = null;
                }
                Gson gson = (Gson) this.LIZ.getValue();
                Map<String, String> map = bulletinSetting.extra;
                if (map != null) {
                    str = map.get("allow_item_types");
                }
                BulletinCommentSetting bulletinCommentSetting = new BulletinCommentSetting(bool, (List) GsonProtectorUtils.fromJson(gson, str, new TypeToken<List<? extends BulletinCommentAllowItemType>>() { // from class: X.0OIa
                }.getType()));
                this.LIZJ = bulletinCommentSetting;
                ((Keva) this.LIZIZ.getValue()).storeString("key_comment_enable", GsonProtectorUtils.toJson((Gson) this.LIZ.getValue(), bulletinCommentSetting));
            }
        }
    }

    public final boolean LIZ(int i, int i2) {
        Boolean bool;
        BulletinCommentSetting bulletinCommentSettingLIZIZ;
        List<BulletinCommentAllowItemType> list;
        List<Integer> list2;
        BulletinCommentSetting bulletinCommentSettingLIZIZ2 = LIZIZ();
        if (bulletinCommentSettingLIZIZ2 != null && (bool = bulletinCommentSettingLIZIZ2.commentEnable) != null && bool.booleanValue() && (bulletinCommentSettingLIZIZ = LIZIZ()) != null && (list = bulletinCommentSettingLIZIZ.allowItemTypes) != null && !list.isEmpty()) {
            for (BulletinCommentAllowItemType bulletinCommentAllowItemType : list) {
                Integer num = bulletinCommentAllowItemType.itemType;
                if (num != null && num.intValue() == i && ((list2 = bulletinCommentAllowItemType.cardType) == null || list2.contains(Integer.valueOf(i2)))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
