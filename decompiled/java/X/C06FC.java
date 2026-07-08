package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06FC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C06FC extends C2217421BqW implements InterfaceC1631620sYq<StreakData, Boolean, Integer, Unit> {
    public final /* synthetic */ InterfaceC1631620sYq<StreakData, String, Boolean, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06FC(InterfaceC1631620sYq<? super StreakData, ? super String, ? super Boolean, Unit> interfaceC1631620sYq) {
        super(3, C1449605lu.class, "handleResultInner", "onReceiveFakeWriteData$handleResultInner(Lkotlin/jvm/functions/Function3;Lcom/ss/android/ugc/aweme/im/streak/api/StreakData;ZI)V", 0);
        this.LL = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(StreakData streakData, Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        C06FA.LJII(this.LL, streakData, zBooleanValue, iIntValue);
        return Unit.LIZ;
    }
}
