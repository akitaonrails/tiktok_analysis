package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CollabInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.CollabInfoColdStartCache$saveAsync$1", f = "CollabInfoColdStartCache.kt", l = {}, m = "invokeSuspend")
public final class C314980CWi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ CollabInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314980CWi(String str, CollabInfo collabInfo, InterfaceC1364105Vn<? super C314980CWi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = collabInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314980CWi(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollabInfoColdStartCache@32b1.saveAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        CollabInfo collabInfo = this.LLILLJJLI;
        if (str != null && str.length() != 0 && collabInfo != null) {
            try {
                ((Keva) C319380CfY.LIZ.getValue()).storeString(str, ((Gson) C319380CfY.LIZIZ.getValue()).LJIILL(collabInfo));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollabInfoColdStartCache@32b1.saveAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
