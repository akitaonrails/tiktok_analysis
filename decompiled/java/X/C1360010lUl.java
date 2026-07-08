package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.whitebar.RepostViewFlipper$mobInfo$1", f = "RepostViewFlipper.kt", l = {}, m = "invokeSuspend")
public final class C1360010lUl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1359990lUj LL;
    public final /* synthetic */ C1360050lUp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360010lUl(C1359990lUj c1359990lUj, C1360050lUp c1360050lUp, InterfaceC1364105Vn<? super C1360010lUl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1359990lUj;
        this.LLILLJJLI = c1360050lUp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360010lUl(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("RepostViewFlipper@a2ac.mobInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1359350lTh c1359350lTh = C1359350lTh.LIZ;
        C1359990lUj c1359990lUj = this.LL;
        String str = c1359990lUj.LLILZIL;
        Aweme aweme = c1359990lUj.LLILZ;
        String str2 = this.LLILLJJLI.LIZJ;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        C1360050lUp c1360050lUp = this.LLILLJJLI;
        C1359350lTh.LIZ(c1359350lTh, "show", str, aweme, z, c1360050lUp.LJIIJJI, c1360050lUp.LJIIIZ, null, 64);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostViewFlipper@a2ac.mobInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
