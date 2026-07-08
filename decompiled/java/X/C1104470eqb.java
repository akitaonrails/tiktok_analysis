package X;

import android.net.Uri;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget$addShortCutWithLottie$1$1$5", f = "ActivityTreasureBoxWidget.kt", l = {}, m = "invokeSuspend")
public final class C1104470eqb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Uri LL;
    public final /* synthetic */ ActivityTreasureBoxWidget LLILLJJLI;
    public final /* synthetic */ Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104470eqb(Uri uri, ActivityTreasureBoxWidget activityTreasureBoxWidget, Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> entry, InterfaceC1364105Vn<? super C1104470eqb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
        this.LLILLJJLI = activityTreasureBoxWidget;
        this.LLILLL = entry;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1104470eqb(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ActivityTreasureBoxWidget.z1(this.LLILLJJLI, this.LLILLL, this.LL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
