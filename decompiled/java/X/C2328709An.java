package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09An, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.ui.NoticeboardEnlargeFragment$downloadBitmapSingle$1$1", f = "NoticeboardEnlargeFragment.kt", l = {76}, m = "invokeSuspend")
public final class C2328709An extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC2329309At<Bitmap> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2328709An(String str, InterfaceC2329309At<Bitmap> interfaceC2329309At, InterfaceC1364105Vn<? super C2328709An> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = interfaceC2329309At;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2328709An c2328709An = new C2328709An(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2328709An.LLILLJJLI = obj;
        return c2328709An;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoticeboardEnlargeFragment@39ff.downloadBitmapSingle$1$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            String str = this.LLILLL;
            InterfaceC2329309At<Bitmap> interfaceC2329309At = this.LLILZ;
            boolean zLJI = C2296808zG.LJI(interfaceC497601wk);
            this.LL = 1;
            if (C2329009Aq.LIZ(str, interfaceC2329309At, zLJI, this) == objLJFF) {
                C1C7U.LIZIZ("NoticeboardEnlargeFragment@39ff.downloadBitmapSingle$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoticeboardEnlargeFragment@39ff.downloadBitmapSingle$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
