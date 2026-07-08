package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01W7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.download.DraftStickerDownloadMgr$updateEffect$4$1$onSuccess$1", f = "DraftStickerDownloadMgr.kt", l = {}, m = "invokeSuspend")
public final class C01W7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Effect> LL;
    public final /* synthetic */ InterfaceC1364105Vn<List<Effect>> LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01W7(List<Effect> list, InterfaceC1364105Vn<? super List<Effect>> interfaceC1364105Vn, List<String> list2, InterfaceC1364105Vn<? super C01W7> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = list;
        this.LLILLJJLI = interfaceC1364105Vn;
        this.LLILLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01W7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftStickerDownloadMgr@9f02.updateEffect$4$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Effect> list = this.LL;
        List<String> list2 = this.LLILLL;
        ArrayList arrayList = null;
        for (Effect effect : list) {
            if (list2.contains(effect.getEffectId())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(effect);
            }
        }
        InterfaceC1364105Vn<List<Effect>> interfaceC1364105Vn = this.LLILLJJLI;
        C189200o6.m2constructorimpl(arrayList);
        interfaceC1364105Vn.resumeWith(arrayList);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftStickerDownloadMgr@9f02.updateEffect$4$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
