package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MH9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.CoverCreationManager$triggerNextCoverTask$1", f = "CoverCreationManager.kt", l = {307}, m = "invokeSuspend")
public final class C0MH9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0MHA LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MH9(C0MHA c0mha, String str, String str2, InterfaceC1364105Vn<? super C0MH9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mha;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MH9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap;
        List<C0MHA> list;
        List<C0MHA> list2;
        C1C7U.LIZ("CoverCreationManager@555f.triggerNextCoverTask$1");
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
            boolean zBooleanValue = this.LLILLJJLI.LIZIZ.invoke().booleanValue();
            ConcurrentHashMap<String, ConcurrentHashMap<String, List<C0MHA>>> concurrentHashMap2 = C0MH8.LIZLLL;
            ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap3 = concurrentHashMap2.get(this.LLILLL);
            if (concurrentHashMap3 != null && (list2 = concurrentHashMap3.get(this.LLILZ)) != null) {
                Boolean.valueOf(list2.remove(this.LLILLJJLI));
            }
            ConcurrentHashMap<String, List<C0MHA>> concurrentHashMap4 = concurrentHashMap2.get(this.LLILLL);
            if ((concurrentHashMap4 == null || (list = concurrentHashMap4.get(this.LLILZ)) == null || list.isEmpty()) && (concurrentHashMap = concurrentHashMap2.get(this.LLILLL)) != null) {
                concurrentHashMap.remove(this.LLILZ);
            }
            this.LLILLJJLI.LIZLLL = zBooleanValue;
            if (((Boolean) C0BCW.LIZ.getValue()).booleanValue()) {
                C2252331DDr c2252331DDr = C0MH8.LJFF;
                C0MHA c0mha = this.LLILLJJLI;
                this.LL = 1;
                if (c2252331DDr.emit(c0mha, this) == objLJFF) {
                    C1C7U.LIZIZ("CoverCreationManager@555f.triggerNextCoverTask$1");
                    return objLJFF;
                }
            } else {
                C0MH8.LJ.postValue(this.LLILLJJLI);
            }
        }
        C0MH8 c0mh8 = C0MH8.LIZ;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        c0mh8.getClass();
        C0MH8.LJIJJ(str, str2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoverCreationManager@555f.triggerNextCoverTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
