package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0n7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1422330n7H extends C2217421BqW implements InterfaceC1631620sYq<Integer, C1419590n2r, Long, Unit> {
    public C1422330n7H(C1422560n7e c1422560n7e) {
        super(3, c1422560n7e, C1422560n7e.class, "notifyPlayTime", "notifyPlayTime(ILcom/ss/android/ugc/aweme/tools/mvtemplate/core/MixAsset;J)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, C1419590n2r c1419590n2r, Long l) {
        long jLongValue = l.longValue();
        ((C1422560n7e) this.receiver).x5(num.intValue(), c1419590n2r, jLongValue);
        return Unit.LIZ;
    }
}
