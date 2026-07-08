package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ctm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.ViewerListCache$Companion$startExpiryCheckTask$1", f = "ViewerListCache.kt", l = {213}, m = "invokeSuspend")
public final class C328200Ctm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328200Ctm(String str, InterfaceC1364105Vn<? super C328200Ctm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328200Ctm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, InterfaceC330550CxZ> mapLIZIZ;
        Map map;
        Map<String, InterfaceC330550CxZ> mapLIZIZ2;
        C1C7U.LIZ("ViewerListCache$Companion@33d.startExpiryCheckTask$1");
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
            long j = C328170Ctj.LIZ.cacheTtlInMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ViewerListCache$Companion@33d.startExpiryCheckTask$1");
                return objLJFF;
            }
        }
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
        if (c330530CxX2 != null && (mapLIZIZ2 = c330530CxX2.LIZIZ()) != null) {
            mapLIZIZ2.remove(this.LLILLJJLI);
        }
        C330530CxX c330530CxX3 = C330530CxX.LIZJ;
        if (c330530CxX3 != null && (map = (Map) c330530CxX3.LIZIZ.getValue()) != null) {
            map.remove(this.LLILLJJLI);
        }
        C330530CxX c330530CxX4 = C330530CxX.LIZJ;
        if (c330530CxX4 == null || (mapLIZIZ = c330530CxX4.LIZIZ()) == null || mapLIZIZ.isEmpty()) {
            C330530CxX.LIZJ = null;
        }
        System.currentTimeMillis();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewerListCache$Companion@33d.startExpiryCheckTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
