package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.UserInteractionRecord;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1575906Ez implements C06F5, C06F8 {
    public final StreakData LIZJ = new StreakData(AbstractC1711506n3.LIZ, null, "placeholder", "", 0, 0, 0, 0, 0, null, 0, 0, 0, -1, 0, null, 0, null, "placeholder", null, null, null);
    public final StreakData LIZLLL = new StreakData(AbstractC1711506n3.LIZIZ, null, "placeholder", "", 0, 0, 0, 0, 0, null, 0, 0, 0, -1, 0, null, 0, null, "placeholder", null, null, null);
    public final C06FA LJ = new C06FA(this);
    public final StreakServerDataSource LJFF = new StreakServerDataSource(this);
    public final C1575806Ey LJI = C1575806Ey.LIZJ;
    public final C06F2 LJII = new C06F2();
    public final Object LJIIIIZZ = new Object();

    public final List<StreakData> LIZ(List<? extends C06G4> list) {
        Object c098200Yq;
        this.LJFF.getClass();
        IMContactApi.LIZ.getClass();
        List<UserInteractionRecord> listLIZJ = C069P.LIZ().LIZIZ().LIZJ(EnumC1581606He.STREAK.getValue(), list);
        if (listLIZJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UserInteractionRecord> it2 = listLIZJ.iterator();
        while (it2.hasNext()) {
            String str = it2.next().data;
            if (str != null) {
                try {
                    c098200Yq = (StreakData) C051M.LIZIZ(StreakData.class, str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
            } else {
                c098200Yq = null;
            }
            if (c098200Yq != null) {
                arrayList.add(c098200Yq);
            }
        }
        return arrayList;
    }

    @Override // X.C06F8
    public final void LJI(List<StreakData> list) {
        for (StreakData streakData : list) {
            String str = streakData.convId;
            if (str != null && str.length() != 0) {
                this.LJII.LIZ.put(str, streakData);
            } else {
                C1590906Kt.LIZJ("Streak: convId is null");
            }
        }
        this.LJI.LJI(list);
    }

    @Override // X.C06F8
    public final void LJ(StreakData streakData, String str) {
        if (((Boolean) C06F0.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(C06F0.LIZIZ, null, null, new AnonymousClass0667(streakData, null), 3);
        }
        this.LJII.LIZ.put(str, streakData);
        this.LJI.LJ(streakData, str);
    }

    public final void LIZIZ(String str, String str2, Function1<? super String, Unit> function1) {
        StreakServerDataSource streakServerDataSource = this.LJFF;
        streakServerDataSource.getClass();
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakServerDataSource triggerStreakCompare convId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1577306Fn(streakServerDataSource, str, str2, function1, null), 3);
    }

    @Override // X.C06F8
    public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
        this.LJI.LIZLLL(str, streakData, streakData2);
    }

    @Override // X.C06F8
    public final void LJFF(String str, C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str2, StreakData streakData, StreakData streakData2, Map<String, String> map) {
        this.LJI.LJFF(str, c06bd, enumC1567006Bo, str2, streakData, streakData2, map);
    }
}
