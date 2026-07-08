package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.BaseRelationModel$recentLoader$2$2", f = "BaseRelationModel.kt", l = {68}, m = "invokeSuspend")
public final class C0O2C extends C09AX implements Function2<List<? extends C0Y8T>, InterfaceC1364105Vn<? super List<? extends C0Y8T>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0O2E LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O2C(C0O2E c0o2e, InterfaceC1364105Vn<? super C0O2C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0o2e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0O2C c0o2c = new C0O2C(this.LLILLL, interfaceC1364105Vn);
        c0o2c.LLILLJJLI = obj;
        return c0o2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jMax;
        int i;
        long createdAt;
        C1C7U.LIZ("BaseRelationModel@f20a.recentLoader$2$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<C0Y8T> list = (List) this.LLILLJJLI;
            C0O2E c0o2e = this.LLILLL;
            this.LL = 1;
            c0o2e.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!c0o2e.LIZ.LJIJI) {
                for (C0Y8T c0y8t : list) {
                    C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
                    if (lastShowMessage != null) {
                        createdAt = lastShowMessage.getCreatedAt();
                    } else {
                        createdAt = 0;
                    }
                    linkedHashMap.put(c0y8t, C2286608xc.LJFF(createdAt));
                }
                obj = C13LP.LJLLLL(new C512501z9(linkedHashMap, 2), list);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (C0Y8T c0y8t2 : list) {
                    C869590Y9l lastShowMessage2 = c0y8t2.getLastShowMessage();
                    if (lastShowMessage2 != null) {
                        jMax = lastShowMessage2.getCreatedAt();
                    } else {
                        jMax = 0;
                    }
                    if (c0y8t2.isStickTop()) {
                        jMax = Math.max(jMax, c0y8t2.getUpdatedTime());
                    }
                    linkedHashMap.put(c0y8t2, C2286608xc.LJFF(jMax));
                    if (c0y8t2.isStickTop()) {
                        i = 50;
                    } else {
                        i = 0;
                    }
                    linkedHashMap2.put(c0y8t2, C2286608xc.LJ(i));
                }
                obj = C13LP.LJLLLL(new C512301z7(linkedHashMap2, linkedHashMap, 1), list);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseRelationModel@f20a.recentLoader$2$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BaseRelationModel@f20a.recentLoader$2$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends C0Y8T> list, InterfaceC1364105Vn<? super List<? extends C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
