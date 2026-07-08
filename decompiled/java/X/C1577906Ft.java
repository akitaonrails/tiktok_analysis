package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06Ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1577906Ft extends C2217421BqW implements InterfaceC1685420txc<StreakData, String, Boolean, Integer, BusinessCommandMessage, Unit> {
    public final /* synthetic */ InterfaceC1631630sYr<StreakData, String, Boolean, Integer, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1577906Ft(InterfaceC1631630sYr<? super StreakData, ? super String, ? super Boolean, ? super Integer, Unit> interfaceC1631630sYr) {
        super(5, C1449605lu.class, "handleResultInner", "onReceiveCmdMsg$handleResultInner(Lkotlin/jvm/functions/Function4;Lcom/ss/android/ugc/aweme/im/streak/api/StreakData;Ljava/lang/String;ZILcom/bytedance/im/core/common/statusmsg/BusinessCommandMessage;)V", 0);
        this.LL = interfaceC1631630sYr;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(StreakData streakData, String str, Boolean bool, Integer num, BusinessCommandMessage businessCommandMessage) {
        StreakServerDataSource.LJII(this.LL, streakData, str, bool.booleanValue(), num.intValue(), businessCommandMessage);
        return Unit.LIZ;
    }
}
