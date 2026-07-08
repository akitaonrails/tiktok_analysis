package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05KS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMUserPreloader$addResources$1", f = "IMUserPreloader.kt", l = {149}, m = "invokeSuspend")
public final class C05KS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public Object LLILLJJLI;
    public C05KW LLILLL;
    public int LLILZ;
    public final /* synthetic */ C05KW LLILZIL;
    public final /* synthetic */ List<InterfaceC1329505If> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05KS(C05KW c05kw, List<? extends InterfaceC1329505If> list, InterfaceC1364105Vn<? super C05KS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c05kw;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KS(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05KW c05kw;
        C1DEV c1dev;
        List<InterfaceC1329505If> list;
        boolean z;
        C1C7U.LIZ("IMUserPreloader@15f4.addResources$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                c05kw = this.LLILLL;
                list = (List) this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c05kw = this.LLILZIL;
            c1dev = c05kw.LIZLLL;
            list = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = list;
            this.LLILLL = c05kw;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("IMUserPreloader@15f4.addResources$1");
                return objLJFF;
            }
        }
        try {
            for (InterfaceC1329505If interfaceC1329505If : list) {
                String resourceId = interfaceC1329505If.getResourceId();
                boolean zLJFF = false;
                if (resourceId.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !Intrinsics.LJFF(resourceId, CardStruct.IStatusCode.DEFAULT)) {
                    c05kw.LIZIZ.add(resourceId);
                    Map<String, Object> mapLJJIFFI = interfaceC1329505If.LJJIFFI();
                    if (mapLJJIFFI != null) {
                        zLJFF = Intrinsics.LJFF(mapLJJIFFI.get("PRELOAD_AVATAR"), true);
                    }
                    if (zLJFF) {
                        c05kw.LIZJ.add(resourceId);
                    }
                }
            }
            if (!c05kw.LJ) {
                c05kw.LJ = true;
                C23250099c.LIZLLL(c05kw.LJFF, null, null, new C05KU(c05kw, null), 3);
            }
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMUserPreloader@15f4.addResources$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
