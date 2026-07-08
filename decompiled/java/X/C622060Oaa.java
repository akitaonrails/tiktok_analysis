package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelBase;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelContent;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelSetting;

/* JADX INFO: renamed from: X.0Oaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622060Oaa {
    public static C618110OMf LIZ(C908020Zjk c908020Zjk) {
        Integer numValueOf;
        int columnIndex;
        if (c908020Zjk.moveToPosition(0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("base_");
            sbLIZ.append(EnumC622090Oad.BULLETIN_BOARD_ID.getKey());
            String strLJ = C622120Oag.LJ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("base_");
            sbLIZ2.append(EnumC622090Oad.CHANNEL_VERSION.getKey());
            Long lLIZIZ = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("base_");
            sbLIZ3.append(EnumC622090Oad.CHANNEL_COMMAND_VERSION.getKey());
            Long lLIZIZ2 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("base_");
            sbLIZ4.append(EnumC622090Oad.CHANNEL_OWNER.getKey());
            String strLIZLLL = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("base_");
            sbLIZ5.append(EnumC622090Oad.CHANNEL_STATUS_CODE.getKey());
            Integer numValueOf2 = Integer.valueOf(C622120Oag.LIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ5)));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("base_");
            sbLIZ6.append(EnumC622090Oad.IDENTITY_TYPE.getKey());
            Integer numValueOf3 = Integer.valueOf(C622120Oag.LIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ6)));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("base_");
            sbLIZ7.append(EnumC622090Oad.CHANNEL_ACCESS_CONTROL.getKey());
            String strLIZLLL2 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ7));
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("base_");
            sbLIZ8.append(EnumC622090Oad.SUBSCRIBE_STATUS_CODE.getKey());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
            try {
                columnIndex = c908020Zjk.getColumnIndex(strLIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("getIntOrNull: Failed to get int for column ");
                sbLIZ9.append(strLIZIZ);
                sbLIZ9.append(". Error: ");
                sbLIZ9.append(e.getMessage());
                C622290Oax.LJFF("CursorUtils", C2188811AlT.LIZIZ(sbLIZ9));
            }
            if (columnIndex == -1) {
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("getIntOrNull: Column ");
                sbLIZ10.append(strLIZIZ);
                sbLIZ10.append(" not found, returning null.");
                C622290Oax.LJFF("CursorUtils", C2188811AlT.LIZIZ(sbLIZ10));
            } else {
                numValueOf = Integer.valueOf(c908020Zjk.getInt(columnIndex));
                if (numValueOf.intValue() != 0) {
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("base_");
                    sbLIZ11.append(EnumC622090Oad.CHANNEL_TYPE.getKey());
                    BulletinChannelBase bulletinChannelBase = new BulletinChannelBase(strLJ, lLIZIZ, lLIZIZ2, strLIZLLL, numValueOf2, numValueOf3, strLIZLLL2, numValueOf, C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ11)));
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("ui_");
                    sbLIZ12.append(EnumC622110Oaf.BULLETIN_BOARD_ID.getKey());
                    String strLIZLLL3 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ12));
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("ui_");
                    sbLIZ13.append(EnumC622110Oaf.NAME.getKey());
                    String strLIZLLL4 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ13));
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("ui_");
                    sbLIZ14.append(EnumC622110Oaf.DESC.getKey());
                    String strLIZLLL5 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ14));
                    StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                    sbLIZ15.append("ui_");
                    sbLIZ15.append(EnumC622110Oaf.AVATAR_URL.getKey());
                    String strLIZLLL6 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ15));
                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                    sbLIZ16.append("ui_");
                    sbLIZ16.append(EnumC622110Oaf.MEMBER_COUNT.getKey());
                    Long lLIZIZ3 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ16));
                    StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                    sbLIZ17.append("ui_");
                    sbLIZ17.append(EnumC622110Oaf.BADGE_ICON_URL.getKey());
                    String strLIZLLL7 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ17));
                    StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                    sbLIZ18.append("ui_");
                    sbLIZ18.append(EnumC622110Oaf.EXTRA_DATA.getKey());
                    BulletinChannelContent bulletinChannelContent = new BulletinChannelContent(strLIZLLL3, strLIZLLL4, strLIZLLL5, strLIZLLL6, lLIZIZ3, strLIZLLL7, C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ18)));
                    StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                    sbLIZ19.append("s_");
                    sbLIZ19.append(EnumC622100Oae.BULLETIN_BOARD_ID.getKey());
                    String strLIZLLL8 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ19));
                    StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                    sbLIZ20.append("s_");
                    sbLIZ20.append(EnumC622100Oae.REOPEN_DEADLINE_TIME.getKey());
                    Long lLIZIZ4 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ20));
                    StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                    sbLIZ21.append("s_");
                    sbLIZ21.append(EnumC622100Oae.PUBLISH_QUOTA.getKey());
                    Long lLIZIZ5 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ21));
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("s_");
                    sbLIZ22.append(EnumC622100Oae.EDIT_QUOTA.getKey());
                    Long lLIZIZ6 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ22));
                    StringBuilder sbLIZ23 = C2188811AlT.LIZ();
                    sbLIZ23.append("s_");
                    sbLIZ23.append(EnumC622100Oae.QUICK_POST_ORDERS.getKey());
                    String strLIZLLL9 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ23));
                    StringBuilder sbLIZ24 = C2188811AlT.LIZ();
                    sbLIZ24.append("s_");
                    sbLIZ24.append(EnumC622100Oae.PLUS_POST_ORDERS.getKey());
                    return new C618110OMf(bulletinChannelBase, bulletinChannelContent, new BulletinChannelSetting(strLIZLLL8, lLIZIZ4, lLIZIZ5, lLIZIZ6, strLIZLLL9, C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ24))));
                }
            }
            numValueOf = null;
            StringBuilder sbLIZ112 = C2188811AlT.LIZ();
            sbLIZ112.append("base_");
            sbLIZ112.append(EnumC622090Oad.CHANNEL_TYPE.getKey());
            BulletinChannelBase bulletinChannelBase2 = new BulletinChannelBase(strLJ, lLIZIZ, lLIZIZ2, strLIZLLL, numValueOf2, numValueOf3, strLIZLLL2, numValueOf, C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ112)));
            StringBuilder sbLIZ122 = C2188811AlT.LIZ();
            sbLIZ122.append("ui_");
            sbLIZ122.append(EnumC622110Oaf.BULLETIN_BOARD_ID.getKey());
            String strLIZLLL32 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ122));
            StringBuilder sbLIZ132 = C2188811AlT.LIZ();
            sbLIZ132.append("ui_");
            sbLIZ132.append(EnumC622110Oaf.NAME.getKey());
            String strLIZLLL42 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ132));
            StringBuilder sbLIZ142 = C2188811AlT.LIZ();
            sbLIZ142.append("ui_");
            sbLIZ142.append(EnumC622110Oaf.DESC.getKey());
            String strLIZLLL52 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ142));
            StringBuilder sbLIZ152 = C2188811AlT.LIZ();
            sbLIZ152.append("ui_");
            sbLIZ152.append(EnumC622110Oaf.AVATAR_URL.getKey());
            String strLIZLLL62 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ152));
            StringBuilder sbLIZ162 = C2188811AlT.LIZ();
            sbLIZ162.append("ui_");
            sbLIZ162.append(EnumC622110Oaf.MEMBER_COUNT.getKey());
            Long lLIZIZ32 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ162));
            StringBuilder sbLIZ172 = C2188811AlT.LIZ();
            sbLIZ172.append("ui_");
            sbLIZ172.append(EnumC622110Oaf.BADGE_ICON_URL.getKey());
            String strLIZLLL72 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ172));
            StringBuilder sbLIZ182 = C2188811AlT.LIZ();
            sbLIZ182.append("ui_");
            sbLIZ182.append(EnumC622110Oaf.EXTRA_DATA.getKey());
            BulletinChannelContent bulletinChannelContent2 = new BulletinChannelContent(strLIZLLL32, strLIZLLL42, strLIZLLL52, strLIZLLL62, lLIZIZ32, strLIZLLL72, C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ182)));
            StringBuilder sbLIZ192 = C2188811AlT.LIZ();
            sbLIZ192.append("s_");
            sbLIZ192.append(EnumC622100Oae.BULLETIN_BOARD_ID.getKey());
            String strLIZLLL82 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ192));
            StringBuilder sbLIZ202 = C2188811AlT.LIZ();
            sbLIZ202.append("s_");
            sbLIZ202.append(EnumC622100Oae.REOPEN_DEADLINE_TIME.getKey());
            Long lLIZIZ42 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ202));
            StringBuilder sbLIZ212 = C2188811AlT.LIZ();
            sbLIZ212.append("s_");
            sbLIZ212.append(EnumC622100Oae.PUBLISH_QUOTA.getKey());
            Long lLIZIZ52 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ212));
            StringBuilder sbLIZ222 = C2188811AlT.LIZ();
            sbLIZ222.append("s_");
            sbLIZ222.append(EnumC622100Oae.EDIT_QUOTA.getKey());
            Long lLIZIZ62 = C622120Oag.LIZIZ(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ222));
            StringBuilder sbLIZ232 = C2188811AlT.LIZ();
            sbLIZ232.append("s_");
            sbLIZ232.append(EnumC622100Oae.QUICK_POST_ORDERS.getKey());
            String strLIZLLL92 = C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ232));
            StringBuilder sbLIZ242 = C2188811AlT.LIZ();
            sbLIZ242.append("s_");
            sbLIZ242.append(EnumC622100Oae.PLUS_POST_ORDERS.getKey());
            return new C618110OMf(bulletinChannelBase2, bulletinChannelContent2, new BulletinChannelSetting(strLIZLLL82, lLIZIZ42, lLIZIZ52, lLIZIZ62, strLIZLLL92, C622120Oag.LIZLLL(c908020Zjk, C2188811AlT.LIZIZ(sbLIZ242))));
        }
        return null;
    }
}
