package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.whitebar.RepostViewFlipper$mobBtn$1", f = "RepostViewFlipper.kt", l = {}, m = "invokeSuspend")
public final class C1360020lUm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1359990lUj LL;
    public final /* synthetic */ C1360050lUp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360020lUm(C1359990lUj c1359990lUj, C1360050lUp c1360050lUp, InterfaceC1364105Vn<? super C1360020lUm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1359990lUj;
        this.LLILLJJLI = c1360050lUp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360020lUm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        C1C7U.LIZ("RepostViewFlipper@a2ac.mobBtn$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        C1359990lUj c1359990lUj = this.LL;
        String str2 = c1359990lUj.LLILZIL;
        C1360050lUp c1360050lUp = this.LLILLJJLI;
        if (c1360050lUp.LJIIJJI) {
            str = "anchor_guide_bubble";
        } else {
            str = "bubble";
        }
        Aweme aweme = c1359990lUj.LLILZ;
        if (c1360050lUp.LIZLLL == 2) {
            i = 0;
        } else {
            i = 1;
        }
        C1358550lSP.LJIJJLI(c1358550lSP, str2, str, aweme, "show", null, i, null, null, null, null, 976);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostViewFlipper@a2ac.mobBtn$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
