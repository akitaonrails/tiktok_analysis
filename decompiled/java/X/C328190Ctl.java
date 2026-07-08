package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ctl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.ViewerListCache$Companion$startExpiryCheckTask$2", f = "ViewerListCache.kt", l = {226}, m = "invokeSuspend")
public final class C328190Ctl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328190Ctl(String str, InterfaceC1364105Vn<? super C328190Ctl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328190Ctl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ViewerListCache$Companion@33d.startExpiryCheckTask$2");
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
            long j = C328170Ctj.LIZ.diskCacheTtlInMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ViewerListCache$Companion@33d.startExpiryCheckTask$2");
                return objLJFF;
            }
        }
        try {
            C330530CxX.LJII.getValue().erase(this.LLILLJJLI);
            C330530CxX.LJIIIIZZ.getValue().erase(this.LLILLJJLI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            HashMap map = new HashMap();
            String str = this.LLILLJJLI;
            map.put("author_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            map.put("item_id", str);
            Npth.reportBizException("ViewerListCache", e, message, map);
        }
        System.currentTimeMillis();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewerListCache$Companion@33d.startExpiryCheckTask$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
