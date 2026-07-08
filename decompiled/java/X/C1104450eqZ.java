package X;

import android.net.Uri;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget$addShortCutWithLottie$1", f = "ActivityTreasureBoxWidget.kt", l = {381}, m = "invokeSuspend")
public final class C1104450eqZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ CountDownLatch LLILZ;
    public final /* synthetic */ C1295960jpS LLILZIL;
    public final /* synthetic */ CountDownLatch LLILZLL;
    public final /* synthetic */ ActivityTreasureBoxWidget LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Uri LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104450eqZ(String str, String str2, CountDownLatch countDownLatch, C1295960jpS c1295960jpS, CountDownLatch countDownLatch2, ActivityTreasureBoxWidget activityTreasureBoxWidget, String str3, Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> entry, boolean z, Uri uri, InterfaceC1364105Vn<? super C1104450eqZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = countDownLatch;
        this.LLILZIL = c1295960jpS;
        this.LLILZLL = countDownLatch2;
        this.LLIZ = activityTreasureBoxWidget;
        this.LLIZLLLIL = str3;
        this.LLJ = entry;
        this.LLJI = z;
        this.LLJIJIL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1104450eqZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1104460eqa c1104460eqa = new C1104460eqa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c1104460eqa) == objLJFF) {
                C1C7U.LIZIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityTreasureBoxWidget@fb6.addShortCutWithLottie$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
