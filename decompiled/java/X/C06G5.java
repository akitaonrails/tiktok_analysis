package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06G5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06G5 extends C09AY implements Function1<StreakData, String> {
    public C06G5(StreakServerDataSource streakServerDataSource) {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(StreakData streakData) {
        StreakData streakData2 = streakData;
        String str = streakData2.convId;
        if (str == null) {
            C1590906Kt.LIZJ("Streak: convId is invalid");
            return C0YNP.LJ(C1566206Bg.LIZIZ(streakData2));
        }
        return str;
    }
}
