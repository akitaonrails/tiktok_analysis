package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.EffectAssetDownloader$downloadData$4", f = "EffectAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1437105jt extends C09AX implements Function2<Pair<? extends C443120HZe<? extends Integer, ? extends Effect, ? extends Boolean>, ? extends C443120HZe<? extends Integer, ? extends AVMusic, ? extends Boolean>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1416470mxp LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILZ;
    public final /* synthetic */ C1412860ms0 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437105jt(C1416470mxp c1416470mxp, String str, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, C1412860ms0 c1412860ms0, InterfaceC1364105Vn<? super C1437105jt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1416470mxp;
        this.LLILLL = str;
        this.LLILZ = interfaceC1437705jz;
        this.LLILZIL = c1412860ms0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1437105jt c1437105jt = new C1437105jt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1437105jt.LL = obj;
        return c1437105jt;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1437105jt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends C443120HZe<? extends Integer, ? extends Effect, ? extends Boolean>, ? extends C443120HZe<? extends Integer, ? extends AVMusic, ? extends Boolean>> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
