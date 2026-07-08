package X;

import com.ss.android.ugc.aweme.feed.assem.dislike.DislikeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Sl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.dislike.DislikeAssem$doDislike$2", f = "DislikeAssem.kt", l = {}, m = "invokeSuspend")
public final class C730470Sl3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DislikeAssem LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C730470Sl3(DislikeAssem dislikeAssem, String str, InterfaceC1364105Vn<? super C730470Sl3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dislikeAssem;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C730470Sl3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DislikeAssem@2d78.doDislike$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2277881EDy.LIZIZ.disLikeAweme(this.LL.LLLF, C737370SwB.LIZ(this.LLILLJJLI), "", 1, 0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DislikeAssem@2d78.doDislike$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
