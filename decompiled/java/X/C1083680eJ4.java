package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.BigFlyingGiftPathWidget;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eJ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1083680eJ4 extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1083680eJ4(Object obj) {
        super(1, obj, BigFlyingGiftPathWidget.class, "handleScreenClearEvent", "handleScreenClearEvent(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        BigFlyingGiftPathWidget bigFlyingGiftPathWidget = (BigFlyingGiftPathWidget) this.receiver;
        bigFlyingGiftPathWidget.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleScreenClearEvent isCleared = ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LJIIIZ("FlyingGiftManager", C2188811AlT.LIZIZ(sbLIZ));
        bigFlyingGiftPathWidget.LLILLL = zBooleanValue;
        if (zBooleanValue) {
            Iterator it2 = C13LP.LLIIII(bigFlyingGiftPathWidget.LLILZIL).iterator();
            while (it2.hasNext()) {
                ((C1295960jpS) it2.next()).cancelAnimation();
            }
        }
        return Unit.LIZ;
    }
}
