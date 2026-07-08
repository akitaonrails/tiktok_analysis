package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectOffPeakStableDurationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectOffPeakDownloadManager$onStreamStart$1", f = "LiveEffectOffPeakDownloadManager.kt", l = {32, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0NNO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C609450NvL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NNO(C609450NvL c609450NvL, InterfaceC1364105Vn<? super C0NNO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c609450NvL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NNO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectOffPeakDownloadManager@768b.onStreamStart$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveEffectOffPeakDownloadManager@768b.onStreamStart$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long stableDurationMs = LiveEffectOffPeakStableDurationSetting.INSTANCE.getStableDurationMs();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(stableDurationMs, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEffectOffPeakDownloadManager@768b.onStreamStart$1");
                return objLJFF;
            }
        }
        C609450NvL c609450NvL = this.LLILLJJLI;
        this.LL = 2;
        if (c609450NvL.LIZ(this) == objLJFF) {
            C1C7U.LIZIZ("LiveEffectOffPeakDownloadManager@768b.onStreamStart$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveEffectOffPeakDownloadManager@768b.onStreamStart$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
