package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08tT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem$scheduleColdStartFirstScreenShotUpdate$1", f = "TakoAssem.kt", l = {710}, m = "invokeSuspend")
public final class C2260908tT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2260908tT(TakoAssem takoAssem, String str, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C2260908tT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAssem;
        this.LLILLL = str;
        this.LLILZ = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2260908tT(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("TakoAssem@6e4b.scheduleColdStartFirstScreenShotUpdate$1");
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
            if (C07EF.LIZ()) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(30000L, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoAssem@6e4b.scheduleColdStartFirstScreenShotUpdate$1");
                    return objLJFF;
                }
            }
        }
        TakoAssem takoAssem = this.LLILLJJLI;
        String str = this.LLILLL;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        takoAssem.getClass();
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && takoAssem.LJJIJL().isAttachedToWindow()) {
            C724270Sb3 c724270Sb3 = takoAssem.LLJI;
            String aid = null;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme = ((VideoItemParams) obj2).getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            }
            if (str == null || str.length() == 0 || Intrinsics.LJFF(str, aid)) {
                boolean zLIZ = C07EE.LIZ();
                boolean z = TakoAssem.LLLIILIL;
                TakoAssem.LLLIILIL = true;
                if (!zLIZ) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoAssem@6e4b.scheduleColdStartFirstScreenShotUpdate$1");
                    return unit;
                }
                this.LLILLJJLI.Ep(true);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TakoAssem@6e4b.scheduleColdStartFirstScreenShotUpdate$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoAssem@6e4b.scheduleColdStartFirstScreenShotUpdate$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
