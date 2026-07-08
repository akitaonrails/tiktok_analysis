package X;

import android.net.Uri;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget$addShortCutWithLottie$1$1$4", f = "ActivityTreasureBoxWidget.kt", l = {}, m = "invokeSuspend")
public final class C1104440eqY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ActivityTreasureBoxWidget LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Uri LLILZIL;
    public final /* synthetic */ C1295960jpS LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104440eqY(ActivityTreasureBoxWidget activityTreasureBoxWidget, String str, Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> entry, boolean z, Uri uri, C1295960jpS c1295960jpS, InterfaceC1364105Vn<? super C1104440eqY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activityTreasureBoxWidget;
        this.LLILLJJLI = str;
        this.LLILLL = entry;
        this.LLILZ = z;
        this.LLILZIL = uri;
        this.LLILZLL = c1295960jpS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1104440eqY(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ActivityTreasureBoxWidget activityTreasureBoxWidget = this.LL;
        if (activityTreasureBoxWidget.context == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1$4");
            return unit;
        }
        if (activityTreasureBoxWidget.LLILZ) {
            i = 0;
        } else {
            i = -1;
        }
        C1104380eqS.LIZIZ(this.LLILLL.getValue().envelopList, this.LLILLJJLI, i, Boolean.valueOf(this.LLILZ));
        ActivityTreasureBoxWidget.z1(this.LL, this.LLILLL, this.LLILZIL, this.LLILZLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1$1$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
