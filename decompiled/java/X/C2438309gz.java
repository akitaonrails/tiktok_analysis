package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.fly_main_color.FlyMainColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.GameUiStrategy$getFinishEncourageMainColor$1", f = "GameUiStrategy.kt", l = {}, m = "invokeSuspend")
public final class C2438309gz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Bitmap LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2438309gz(Bitmap bitmap, InterfaceC1364105Vn<? super C2438309gz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2438309gz(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("GameUiStrategy@3ab.getFinishEncourageMainColor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        if (bitmap != null && !bitmap.isRecycled()) {
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(this.LL, null));
            c204674156yLIZ.LJ(0.04f, 0.12f, 0.11f, 0.3f, 0.02f);
            c204674156yLIZ.LJFF(5.0f);
            c204674156yLIZ.LJI(2.0f);
            Integer numLIZIZ = c204674156yLIZ.LIZIZ();
            int iIntValue2 = 0;
            if (numLIZIZ != null) {
                iIntValue = numLIZIZ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ = c204674156yLIZ.LIZJ();
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setColor(iIntValue, iIntValue2);
            C786410Ut5.LJJJJ(this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameUiStrategy@3ab.getFinishEncourageMainColor$1");
        return unit;
    }
}
