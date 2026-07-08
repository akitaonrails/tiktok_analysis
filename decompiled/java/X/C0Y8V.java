package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y8V, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8V {
    public static String LJII(Map<String, String> map) {
        String strLJIILL = "";
        if (map != null) {
            try {
                if (map.size() > 0) {
                    strLJIILL = C09EF.LIZ.LJIILL(map);
                    return strLJIILL;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strLJIILL;
    }

    public static List<C0YAE> LIZJ(String str, List<Participant> list) {
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Participant participant : list) {
                if (participant.user_id != null) {
                    C0YAE c0yae = new C0YAE();
                    c0yae.setConversationId(str);
                    c0yae.setAlias(participant.alias);
                    Integer num = participant.role;
                    if (num != null) {
                        c0yae.setRole(num.intValue());
                    }
                    Long l = participant.sort_order;
                    if (l != null) {
                        c0yae.setSortOrder(l.longValue());
                    }
                    EnumC868560Y5m enumC868560Y5m = participant.blocked;
                    if (enumC868560Y5m != null) {
                        c0yae.setSilent(enumC868560Y5m.getValue());
                    }
                    Long l2 = participant.left_block_time;
                    if (l2 != null) {
                        c0yae.setSilentTime(l2.longValue());
                    }
                    c0yae.setUid(participant.user_id.longValue());
                    c0yae.setSecUid(participant.sec_uid);
                    arrayList.add(c0yae);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static C0Y8W LJFF(C0Y8W c0y8w, ConversationSettingInfo conversationSettingInfo) {
        int iIntValue;
        int iIntValue2;
        if (c0y8w == null) {
            c0y8w = new C0Y8W();
            c0y8w.setConversationId(conversationSettingInfo.conversation_id);
        }
        Long l = conversationSettingInfo.setting_version;
        if (l != null && l.longValue() >= c0y8w.getVersion()) {
            Integer num = conversationSettingInfo.mute;
            int iIntValue3 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c0y8w.setMute(iIntValue);
            Integer num2 = conversationSettingInfo.stick_on_top;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            c0y8w.setStickTop(iIntValue2);
            c0y8w.setExt(conversationSettingInfo.ext);
            Integer num3 = conversationSettingInfo.favorite;
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            }
            c0y8w.setFavor(iIntValue3);
            c0y8w.setVersion(conversationSettingInfo.setting_version.longValue());
            c0y8w.setSetTopTime(conversationSettingInfo.set_top_time.longValue());
            c0y8w.setSetFavoriteTime(conversationSettingInfo.set_favorite_time.longValue());
            EnumC868530Y5j enumC868530Y5j = conversationSettingInfo.category;
            if (enumC868530Y5j == null) {
                enumC868530Y5j = EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
            }
            c0y8w.setCategory(enumC868530Y5j.getValue());
            c0y8w.setConversationTagsStr(conversationSettingInfo.conversation_tags);
        }
        BizConvSettingPersistentExt bizConvSettingPersistentExt = conversationSettingInfo.biz_setting_persistent_extra;
        if (bizConvSettingPersistentExt != null) {
            try {
                c0y8w.setBizSettingPersistentExtraRaw(C870740YDw.LIZIZ(bizConvSettingPersistentExt.encode()));
                return c0y8w;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c0y8w;
    }

    public static C0YAE LJI(String str, Participant participant) {
        if (participant != null && participant.user_id != null) {
            C0YAE c0yae = new C0YAE();
            c0yae.setConversationId(str);
            c0yae.setUid(participant.user_id.longValue());
            c0yae.setSecUid(participant.sec_uid);
            Integer num = participant.role;
            if (num != null) {
                c0yae.setRole(num.intValue());
            }
            c0yae.setAlias(participant.alias);
            Long l = participant.sort_order;
            if (l != null) {
                c0yae.setSortOrder(l.longValue());
            }
            EnumC868560Y5m enumC868560Y5m = participant.blocked;
            if (enumC868560Y5m != null) {
                c0yae.setSilent(enumC868560Y5m.getValue());
            }
            Long l2 = participant.left_block_time;
            if (l2 != null) {
                c0yae.setSilentTime(l2.longValue());
            }
            return c0yae;
        }
        return null;
    }

    public static C0Y8Y LJ(String str, C0Y8Y c0y8y, ConversationCoreInfo conversationCoreInfo) {
        long jLongValue;
        long jLongValue2;
        int i;
        int iIntValue;
        if (c0y8y == null) {
            c0y8y = new C0Y8Y();
            String str2 = conversationCoreInfo.conversation_id;
            if (str2 != null) {
                str = str2;
            }
            c0y8y.setConversationId(str);
        }
        c0y8y.setName(conversationCoreInfo.name);
        c0y8y.setIcon(conversationCoreInfo.icon);
        c0y8y.setDesc(conversationCoreInfo.desc);
        c0y8y.setNotice(conversationCoreInfo.notice);
        c0y8y.setExt(conversationCoreInfo.ext);
        Long l = conversationCoreInfo.info_version;
        long jLongValue3 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c0y8y.setVersion(jLongValue);
        Long l2 = conversationCoreInfo.creator_uid;
        long jLongValue4 = -1;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = -1;
        }
        c0y8y.setCreator(jLongValue2);
        Long l3 = conversationCoreInfo.owner;
        if (l3 != null) {
            jLongValue4 = l3.longValue();
        }
        c0y8y.setOwner(jLongValue4);
        c0y8y.setSecOwner(conversationCoreInfo.sec_owner);
        Long l4 = conversationCoreInfo.first_message_timestamp;
        if (l4 != null) {
            jLongValue3 = l4.longValue();
        }
        c0y8y.setFirstMessageTimestamp(jLongValue3);
        EnumC868560Y5m enumC868560Y5m = conversationCoreInfo.block_status;
        if (enumC868560Y5m == null) {
            enumC868560Y5m = EnumC868560Y5m.UNBLOCK;
        }
        c0y8y.setSilent(enumC868560Y5m.getValue());
        Boolean bool = conversationCoreInfo.block_normal_only;
        if (bool != null && bool.booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        c0y8y.setSilentNormalOnly(i);
        Integer num = conversationCoreInfo.mode;
        if (num == null) {
            iIntValue = -1;
        } else {
            iIntValue = num.intValue();
        }
        c0y8y.setMode(iIntValue);
        BizConvCorePersistentExt bizConvCorePersistentExt = conversationCoreInfo.biz_core_persistent_extra;
        if (bizConvCorePersistentExt != null) {
            try {
                c0y8y.setBizCorePersistentExtraRaw(ByteString.of(bizConvCorePersistentExt.encode()));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c0y8y.setMemberRegions(conversationCoreInfo.member_regions);
        return c0y8y;
    }

    public static List LIZIZ(long j, String str, List list, Map map) {
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Long l = (Long) it2.next();
                if (l != null) {
                    j++;
                    C0YAE c0yae = new C0YAE();
                    c0yae.setConversationId(str);
                    c0yae.setSortOrder(j);
                    c0yae.setUid(l.longValue());
                    c0yae.setSilent(EnumC868560Y5m.UNBLOCK.getValue());
                    c0yae.setSilentTime(0L);
                    if (map != null) {
                        c0yae.setSecUid((String) ((HashMap) map).get(l));
                    }
                    arrayList.add(c0yae);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C869590Y9l LIZ(X.C0YEM r13, java.lang.String r14, X.C869590Y9l r15, com.bytedance.im.core.proto.MessageBody r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y8V.LIZ(X.0YEM, java.lang.String, X.0Y9l, com.bytedance.im.core.proto.MessageBody, int, int):X.0Y9l");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0Y8T LIZLLL(X.C0YEM r18, int r19, X.C0Y8T r20, com.bytedance.im.core.proto.ConversationInfoV2 r21, long r22, X.C869590Y9l r24, java.util.List<X.C0YAE> r25, boolean r26, java.lang.Boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y8V.LIZLLL(X.0YEM, int, X.0Y8T, com.bytedance.im.core.proto.ConversationInfoV2, long, X.0Y9l, java.util.List, boolean, java.lang.Boolean, boolean, boolean):X.0Y8T");
    }
}
