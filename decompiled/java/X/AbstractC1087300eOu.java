package X;

import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsSwitchSetting;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0eOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1087300eOu<M> {
    public final CopyOnWriteArrayList<C1087320eOw<M>> LIZ = new CopyOnWriteArrayList<>();
    public final long LIZIZ = LiveStrategyParamsSwitchSetting.getValue().realtimeFeaturePeriod;
    public final C1085640eME<C1087320eOw<M>> LIZJ = new C1085640eME<>(2);

    public abstract void LIZ(List<C1087320eOw<M>> list, long j, long j2);
}
