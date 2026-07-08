package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.ab.NoticeCollapsibility;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900560zYc {
    public static final void LIZ(AbstractC1900570zYd abstractC1900570zYd) {
        int i;
        NoticeCollapsibility noticeCollapsibility;
        boolean zLIZJ;
        NoticeCollapsibility noticeCollapsibility2;
        if (!abstractC1900570zYd.LIZ()) {
            return;
        }
        int size = ((ArrayList) abstractC1900570zYd.LJFF).size();
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            MusNotice musNotice = (MusNotice) ListProtector.get(abstractC1900570zYd.LJFF, i4);
            if (!musNotice.isMock()) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    noticeCollapsibility2 = (NoticeCollapsibility) SettingsManager.LJII("notice_collapsibility", NoticeCollapsibility.class);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (noticeCollapsibility2 == null || !noticeCollapsibility2.collapseByActivityPreference) {
                    if (abstractC1900570zYd.LIZJ()) {
                        zLIZJ = LIZJ(musNotice);
                    } else {
                        zLIZJ = musNotice.needCollapse;
                    }
                } else {
                    int i5 = abstractC1900570zYd.LJII;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (abstractC1900570zYd.LIZJ()) {
                                zLIZJ = LIZJ(musNotice);
                            } else {
                                zLIZJ = musNotice.needCollapse;
                            }
                        } else {
                            zLIZJ = musNotice.hasRead;
                        }
                    }
                    i3++;
                    i2 = i4;
                }
                if (zLIZJ) {
                    break;
                }
                i3++;
                i2 = i4;
            }
        }
        Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        int i6 = iIntValue + 1;
        if (i6 >= ((ArrayList) abstractC1900570zYd.LJFF).size()) {
            int i7 = C2187451AjH.LIZ;
            C1720106oR.LJI("NoticeCollapseUtil", "All data should be shown, data new");
            return;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            noticeCollapsibility = (NoticeCollapsibility) SettingsManager.LJII("notice_collapsibility", NoticeCollapsibility.class);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (noticeCollapsibility != null) {
            i = noticeCollapsibility.atLeastShowCount;
        } else {
            i = 0;
        }
        while (iIntValue2 < i && i6 < ((ArrayList) abstractC1900570zYd.LJFF).size()) {
            if (!((MusNotice) ListProtector.get(abstractC1900570zYd.LJFF, i6)).isMock()) {
                iIntValue2++;
                iIntValue = i6;
            }
            i6++;
        }
        int i8 = iIntValue + 1;
        if (i8 >= ((ArrayList) abstractC1900570zYd.LJFF).size()) {
            int i9 = C2187451AjH.LIZ;
            C1720106oR.LIZ("NoticeCollapseUtil", "show notice count is less than/equal to atLeastShowNoticeCount, show all data ");
            return;
        }
        int i10 = C2187451AjH.LIZ;
        C1720106oR.LJI("NoticeCollapseUtil", "collapseData, add view all");
        ((ArrayList) abstractC1900570zYd.LJI).addAll(((ArrayList) abstractC1900570zYd.LJFF).subList(0, i8));
        ((ArrayList) abstractC1900570zYd.LJI).add(new C1242480iRC(0));
    }

    public static final void LIZIZ(AbstractC1900570zYd abstractC1900570zYd) {
        if (abstractC1900570zYd.LIZIZ().isEmpty()) {
            return;
        }
        List<MusNotice> listLIZIZ = abstractC1900570zYd.LIZIZ();
        List<MusNotice> list = abstractC1900570zYd.LJFF;
        for (MusNotice musNotice : listLIZIZ) {
            for (BaseNotice baseNotice : (ArrayList) list) {
                if (Intrinsics.LJFF(musNotice.nid, baseNotice.nid) && musNotice.hasRead) {
                    baseNotice.hasRead = true;
                    GeneralTemplateNotice generalTemplateNotice = baseNotice.templateNotice;
                    if (generalTemplateNotice != null) {
                        generalTemplateNotice.hasRead = true;
                    }
                }
            }
        }
    }

    public static final boolean LIZJ(MusNotice musNotice) {
        int i;
        NoticeCollapsibility noticeCollapsibility;
        if (!musNotice.hasRead) {
            return false;
        }
        if (C890290YwF.LIZIZ.LIZJ(false) && musNotice.isPriority) {
            return false;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            noticeCollapsibility = (NoticeCollapsibility) SettingsManager.LJII("notice_collapsibility", NoticeCollapsibility.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (noticeCollapsibility != null) {
            i = noticeCollapsibility.cutOffHours;
        } else {
            i = 0;
        }
        long j = ((long) i) * 3600000;
        if (j <= 0 || Calendar.getInstance().getTimeInMillis() - (musNotice.createTime * 1000) < j) {
            return false;
        }
        return true;
    }
}
