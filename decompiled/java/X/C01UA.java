package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01UA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoBottomHeightAssem$onViewCreated$1$1", f = "TakoAIVideoFeedVideoBottomHeightAssem.kt", l = {}, m = "invokeSuspend")
public final class C01UA extends C09AX implements InterfaceC1631620sYq<Integer, Boolean, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Boolean>>, Object> {
    public /* synthetic */ int LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C01UA(InterfaceC1364105Vn<? super C01UA> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoFeedVideoBottomHeightAssem@148f.onViewCreated$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = new Pair(C2286608xc.LJ(this.LL), Boolean.valueOf(this.LLILLJJLI));
        C1C7U.LIZIZ("TakoAIVideoFeedVideoBottomHeightAssem@148f.onViewCreated$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, Boolean bool, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Boolean>> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        C01UA c01ua = new C01UA(interfaceC1364105Vn);
        c01ua.LL = iIntValue;
        c01ua.LLILLJJLI = zBooleanValue;
        return c01ua.invokeSuspend(Unit.LIZ);
    }
}
