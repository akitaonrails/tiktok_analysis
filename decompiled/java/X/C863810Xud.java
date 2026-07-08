package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0Xud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C863810Xud extends C1696260uF6 implements InterfaceC1631630sYr<Integer, Integer, Boolean, C0YK7, Unit> {
    public C863810Xud(C863650XuN c863650XuN) {
        super(4, c863650XuN, C863650XuN.class, "getMessagesByUser", "getMessagesByUser(IIZLcom/bytedance/im/core/internal/link/usecase/getmsgbyuser/IGetByUserTracker;Ljava/util/Map;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Integer num, Integer num2, Boolean bool, C0YK7 c0yk7) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        boolean zBooleanValue = bool.booleanValue();
        ((C863650XuN) this.receiver).LLIIJLIL(iIntValue, iIntValue2, c0yk7, null, zBooleanValue);
        return Unit.LIZ;
    }
}
