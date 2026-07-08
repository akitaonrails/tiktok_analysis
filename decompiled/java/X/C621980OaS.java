package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelBase;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelContent;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinChannelSetting;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0OaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621980OaS {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC622260Oau LIZ = C622190Oan.LIZ;

    public final boolean LIZ(C618110OMf c618110OMf) {
        String str;
        String str2;
        String str3 = "";
        SQLiteDatabase sQLiteDatabaseLJ = this.LIZ.LIZJ().LJ();
        if (sQLiteDatabaseLJ == null) {
            return false;
        }
        ArrayList<Pair> arrayList = new ArrayList();
        BulletinChannelBase bulletinChannelBase = c618110OMf.LIZ;
        if (bulletinChannelBase != null) {
            String strLJJJ = C13LQ.LJJJ(EnumC622090Oad.values(), ", ", null, null, AFwS240S0000000_9.get$arr$(723), 30);
            String strLJJLIIIJ = C13LP.LJJLIIIJ(a0.LJJLIIIJILLIZJL(strLJJJ, new String[]{", "}, 0, 6), ", ", null, null, 0, null, AFwS240S0000000_9.get$arr$(724), 30);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("INSERT OR REPLACE INTO bulletin_board_channel_base (");
            sbLIZ.append(strLJJJ);
            sbLIZ.append(") VALUES (");
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append(");");
            arrayList.add(new Pair(C2188811AlT.LIZIZ(sbLIZ), new Object[]{bulletinChannelBase.bulletinBoardId, bulletinChannelBase.channelVersion, bulletinChannelBase.channelCommandVersion, bulletinChannelBase.channelOwner, bulletinChannelBase.channelStatusCode, bulletinChannelBase.identityType, bulletinChannelBase.channelAccessControl, bulletinChannelBase.subscribeStatusCode, bulletinChannelBase.channelType}));
        }
        BulletinChannelContent bulletinChannelContent = c618110OMf.LIZIZ;
        if (bulletinChannelContent != null) {
            String strLJJJ2 = C13LQ.LJJJ(EnumC622110Oaf.values(), ", ", null, null, AFwS240S0000000_9.get$arr$(730), 30);
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(a0.LJJLIIIJILLIZJL(strLJJJ2, new String[]{", "}, 0, 6), ", ", null, null, 0, null, AFwS240S0000000_9.get$arr$(731), 30);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("INSERT OR REPLACE INTO bulletin_board_channel_ui (");
            sbLIZ2.append(strLJJJ2);
            sbLIZ2.append(") VALUES (");
            sbLIZ2.append(strLJJLIIIJ2);
            sbLIZ2.append(");");
            arrayList.add(new Pair(C2188811AlT.LIZIZ(sbLIZ2), new Object[]{bulletinChannelContent.bulletinBoardId, bulletinChannelContent.name, bulletinChannelContent.desc, bulletinChannelContent.avatarUrl, bulletinChannelContent.memberCount, bulletinChannelContent.badgeIconUrl, bulletinChannelContent.extraData}));
        }
        BulletinChannelSetting bulletinChannelSetting = c618110OMf.LIZJ;
        if (bulletinChannelSetting != null) {
            String strLJJJ3 = C13LQ.LJJJ(EnumC622100Oae.values(), ", ", null, null, AFwS240S0000000_9.get$arr$(728), 30);
            String strLJJLIIIJ3 = C13LP.LJJLIIIJ(a0.LJJLIIIJILLIZJL(strLJJJ3, new String[]{", "}, 0, 6), ", ", null, null, 0, null, AFwS240S0000000_9.get$arr$(729), 30);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("INSERT OR REPLACE INTO bulletin_board_channel_setting (");
            sbLIZ3.append(strLJJJ3);
            sbLIZ3.append(") VALUES (");
            sbLIZ3.append(strLJJLIIIJ3);
            sbLIZ3.append(");");
            arrayList.add(new Pair(C2188811AlT.LIZIZ(sbLIZ3), new Object[]{bulletinChannelSetting.bulletinBoardId, bulletinChannelSetting.reopenDeadlineTime, bulletinChannelSetting.publishQuota, bulletinChannelSetting.editQuota, bulletinChannelSetting.quickPostOrders, bulletinChannelSetting.plusPostOrders, null}));
        }
        C622210Oap c622210Oap = new C622210Oap("write_info", this.LIZ);
        try {
            try {
                sQLiteDatabaseLJ.LJI(true);
                for (Pair pair : arrayList) {
                    String str4 = (String) pair.getFirst();
                    Object[] objArr = (Object[]) pair.getSecond();
                    this.LIZ.LIZ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("insertChannel, sql: ");
                    sbLIZ4.append(str4);
                    C622290Oax.LJFF("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ4));
                    sQLiteDatabaseLJ.LJJ(str4, objArr);
                }
                sQLiteDatabaseLJ.LJJIIZ();
                this.LIZ.LIZ();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("insertChannel Success，bulletinBoardId: ");
                BulletinChannelBase bulletinChannelBase2 = c618110OMf.LIZ;
                if (bulletinChannelBase2 != null) {
                    str2 = bulletinChannelBase2.bulletinBoardId;
                } else {
                    str2 = null;
                }
                sbLIZ5.append(str2);
                C622290Oax.LJFF("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ5));
                c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
                sQLiteDatabaseLJ.LJJIIZI();
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZ();
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("insertChannel failed, channelId: ");
                BulletinChannelBase bulletinChannelBase3 = c618110OMf.LIZ;
                if (bulletinChannelBase3 != null) {
                    str = bulletinChannelBase3.bulletinBoardId;
                } else {
                    str = null;
                }
                sbLIZ6.append(str);
                C622290Oax.LIZJ("BulletinBoardChannelBaseDao", C2188811AlT.LIZIZ(sbLIZ6), e);
                EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
                String message = e.getMessage();
                if (message != null) {
                    str3 = message;
                }
                c622210Oap.LIZ(enumC622250Oat, str3, null);
                sQLiteDatabaseLJ.LJJIIZI();
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sQLiteDatabaseLJ.LJJIIZI();
            throw th;
        }
    }
}
