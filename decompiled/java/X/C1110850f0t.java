package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1110850f0t extends C2217421BqW implements Function1<BadgeStruct, Unit> {
    public C1110850f0t(InterfaceC1112060f2q interfaceC1112060f2q) {
        super(1, interfaceC1112060f2q, AbstractC1110790f0n.class, "onBadgeShow", "onBadgeShow(Lcom/bytedance/android/live/base/model/user/BadgeStruct;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BadgeStruct badgeStruct) {
        ((AbstractC1110790f0n) this.receiver).LLILZ(badgeStruct);
        return Unit.LIZ;
    }
}
