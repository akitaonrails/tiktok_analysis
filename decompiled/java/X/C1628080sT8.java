package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0sT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1628080sT8 implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ o LL;

    public C1628080sT8(o oVar) {
        this.LL = oVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC346701Wf) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(2, this.LL, o.class, "collectHorizontalEffectFetchData", "collectHorizontalEffectFetchData(Lcom/ss/android/ugc/aweme/mvp/model/LiveDataWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws JSONException {
        Object objN6 = this.LL.N6((C1641640sp0) obj, interfaceC1364105Vn);
        if (objN6 != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objN6;
    }
}
