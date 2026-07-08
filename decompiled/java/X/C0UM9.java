package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageV2ABSetting;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UM9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment$getFinishEncourageMainColor$1", f = "LiveBroadcastFragment.kt", l = {}, m = "invokeSuspend")
public final class C0UM9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveBroadcastFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UM9(LiveBroadcastFragment liveBroadcastFragment, InterfaceC1364105Vn<? super C0UM9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveBroadcastFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UM9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBroadcastFragment@d956.getFinishEncourageMainColor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bundle bundle = new Bundle();
        bundle.putFloat("x", 0.0f);
        bundle.putFloat("y", 0.0f);
        bundle.putFloat("w", 1.0f);
        bundle.putFloat("h", 1.0f);
        C1273890jFr c1273890jFr = this.LL.LLLI;
        if (c1273890jFr != null) {
            c1273890jFr.B3(bundle, new InterfaceC1272960jEM() { // from class: X.12Mc
                @Override // X.InterfaceC1272960jEM
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1272960jEM
                public final void LIZLLL(Bitmap bitmap) {
                    float f;
                    float f2;
                    if (bitmap != null) {
                        try {
                            if (!bitmap.isRecycled()) {
                                C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
                                AnchorFinishEncourageV2ABSetting anchorFinishEncourageV2ABSetting = AnchorFinishEncourageV2ABSetting.INSTANCE;
                                if (anchorFinishEncourageV2ABSetting.isEnable()) {
                                    f = 0.06f;
                                } else {
                                    f = 0.11f;
                                }
                                if (anchorFinishEncourageV2ABSetting.isEnable()) {
                                    f2 = 0.2f;
                                } else {
                                    f2 = 0.3f;
                                }
                                c204674156yLIZ.LJ(0.04f, 0.12f, f, f2, 0.02f);
                                c204674156yLIZ.LJFF(5.0f);
                                c204674156yLIZ.LJI(2.0f);
                                C15CY.LJIL(c204674156yLIZ.LIZIZ(), c204674156yLIZ.LIZJ());
                                bitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.getFinishEncourageMainColor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
