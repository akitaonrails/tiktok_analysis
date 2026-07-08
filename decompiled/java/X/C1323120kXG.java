package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotViewHolder$loadRecordCover$1$1$1", f = "PUgcSlotsAdapter.kt", l = {420}, m = "invokeSuspend")
public final class C1323120kXG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1323130kXH LLILLJJLI;
    public final /* synthetic */ C15QC LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PUgcSlotData LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1323120kXG(C1323130kXH c1323130kXH, C15QC c15qc, String str, PUgcSlotData pUgcSlotData, int i, int i2, InterfaceC1364105Vn<? super C1323120kXG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1323130kXH;
        this.LLILLL = c15qc;
        this.LLILZ = str;
        this.LLILZIL = pUgcSlotData;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1323120kXG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PUgcSlotViewHolder@d751.loadRecordCover$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                if (LJIIIIZZ()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PUgcSlotViewHolder@d751.loadRecordCover$1$1$1");
                    return unit;
                }
                if (this.LLILLL.LL.containsKey(this.LLILZ)) {
                    C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LLILLL.LL.get(this.LLILZ);
                    if (c1323050kX9 != null) {
                        Boolean.valueOf(LJIILIIL(c1323050kX9.clone(), true));
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("PUgcSlotViewHolder@d751.loadRecordCover$1$1$1");
                    return unit2;
                }
                C15QC c15qc = this.LLILLL;
                PUgcSlotData pUgcSlotData = this.LLILZIL;
                int i2 = this.LLIZ;
                this.LL = 1;
                c15qc.getClass();
                obj = C15QC.I5(pUgcSlotData, i2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PUgcSlotViewHolder@d751.loadRecordCover$1$1$1");
                    return objLJFF;
                }
            }
            C1323050kX9<AbstractC1327750kej> c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(new C1325120kaU((Bitmap) obj, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0));
            this.LLILLL.LL.put(this.LLILZ, c1323050kX9LJIJJLI);
            LJIILIIL(c1323050kX9LJIJJLI.clone(), true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIJJI(e);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PUgcSlotViewHolder@d751.loadRecordCover$1$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
