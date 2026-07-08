package X;

import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078500eAi extends AbstractC1081700eFs<Object> {
    public final RecyclableWidgetManager LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(391));

    @Override // X.AbstractC1081700eFs
    public final Object LIZIZ() {
        this.LIZ.load(R.id.gew, ((ISlotService) this.LIZIZ.getValue()).getECAuctionActingAreaSlotWidget());
        return null;
    }

    public C1078500eAi(RecyclableWidgetManager recyclableWidgetManager) {
        this.LIZ = recyclableWidgetManager;
    }
}
