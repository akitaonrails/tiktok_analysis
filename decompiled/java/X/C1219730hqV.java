package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.pipeline.handler.PPSingleProcessHandler$doProcess$2", f = "PPSingleProcessHandler.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1219730hqV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<InterfaceC19526611aS> LLILLL;
    public final /* synthetic */ AbstractC1219760hqY LLILZ;
    public final /* synthetic */ InterfaceC19526511aR LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1219730hqV(List<? extends InterfaceC19526611aS> list, AbstractC1219760hqY abstractC1219760hqY, InterfaceC19526511aR interfaceC19526511aR, InterfaceC1364105Vn<? super C1219730hqV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = abstractC1219760hqY;
        this.LLILZIL = interfaceC19526511aR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1219730hqV c1219730hqV = new C1219730hqV(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1219730hqV.LLILLJJLI = obj;
        return c1219730hqV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("PPSingleProcessHandler@7710.doProcess$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            List<InterfaceC19526611aS> list = this.LLILLL;
            AbstractC1219760hqY abstractC1219760hqY = this.LLILZ;
            InterfaceC19526511aR interfaceC19526511aR = this.LLILZIL;
            Iterator<InterfaceC19526611aS> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1219740hqW(abstractC1219760hqY, interfaceC19526511aR, it3.next(), null), 3));
            }
            it2 = arrayList.iterator();
        }
        while (it2.hasNext()) {
            AnonymousClass0957 anonymousClass0957 = (AnonymousClass0957) it2.next();
            this.LLILLJJLI = it2;
            this.LL = 1;
            if (anonymousClass0957.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("PPSingleProcessHandler@7710.doProcess$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PPSingleProcessHandler@7710.doProcess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
