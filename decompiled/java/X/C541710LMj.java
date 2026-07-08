package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationDownloadListTask$run$lastInfo$1", f = "AICreationDownloadListTask.kt", l = {145}, m = "invokeSuspend")
public final class C541710LMj extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int[] LLILZ;
    public final /* synthetic */ C541740LMm LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541710LMj(int i, int[] iArr, C541740LMm c541740LMm, InterfaceC1364105Vn<? super C541710LMj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = iArr;
        this.LLILZIL = c541740LMm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C541710LMj c541710LMj = new C541710LMj(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c541710LMj.LLILLJJLI = ((Number) obj).intValue();
        return c541710LMj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationDownloadListTask@242.run$lastInfo$1");
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
            int i2 = this.LLILLJJLI;
            int i3 = this.LLILLL;
            int iLJJLIIIJ = 0;
            if (i3 >= 0 && i3 < this.LLILZ.length) {
                this.LLILZ[i3] = i2;
            }
            int[] iArr = this.LLILZ;
            if (iArr.length != 0) {
                iLJJLIIIJ = C13LQ.LJJLIIIJ(iArr) / this.LLILZ.length;
            }
            C541740LMm c541740LMm = this.LLILZIL;
            C0LSZ c0lszLIZ = C0LSZ.LIZ(c541740LMm.LIZLLL, null, null, null, null, null, null, null, iLJJLIIIJ, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435327);
            this.LL = 1;
            if (c541740LMm.LJIIIZ(c0lszLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("AICreationDownloadListTask@242.run$lastInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AICreationDownloadListTask@242.run$lastInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
