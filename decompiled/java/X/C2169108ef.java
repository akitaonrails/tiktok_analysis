package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.resize.MvBitMapUtilsExt$makeEffectIconV2$2", f = "MvBitMapUtilsExt.kt", l = {84}, m = "invokeSuspend")
public final class C2169108ef extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<Integer> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2169108ef(Bitmap bitmap, String str, List<Integer> list, InterfaceC1364105Vn<? super C2169108ef> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2169108ef(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MvBitMapUtilsExt@16a0.makeEffectIconV2$2");
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
            Bitmap bitmap = this.LLILLJJLI;
            String str = this.LLILLL;
            List<Integer> list = this.LLILZ;
            this.LL = 1;
            obj = C2169208eg.LIZIZ(162, 162, 0, 0, 0, bitmap, str, list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MvBitMapUtilsExt@16a0.makeEffectIconV2$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MvBitMapUtilsExt@16a0.makeEffectIconV2$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
