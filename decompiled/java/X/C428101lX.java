package X;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$startPublish$publishJob$1$defferTaskList$1$1$1$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {}, m = "invokeSuspend")
public final class C428101lX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C428101lX(Map<String, String> map, List<String> list, InterfaceC1364105Vn<? super C428101lX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C428101lX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$defferTaskList$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set<String> setKeySet = this.LL.keySet();
        List<String> list = this.LLILLJJLI;
        for (String str : setKeySet) {
            if (list.contains(str)) {
                C2286708xd.LJIJ(str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$defferTaskList$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
