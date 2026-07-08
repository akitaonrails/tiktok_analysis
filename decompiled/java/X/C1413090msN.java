package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0msN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.VideoMixEditingMaterialComponent$onInsertForce$1$1", f = "VideoMixEditingMaterialComponent.kt", l = {}, m = "invokeSuspend")
public final class C1413090msN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1412800mru LL;
    public final /* synthetic */ C1413070msL LLILLJJLI;
    public final /* synthetic */ AVMusic LLILLL;
    public final /* synthetic */ C1413530mt5 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413090msN(C1412800mru c1412800mru, C1413070msL c1413070msL, AVMusic aVMusic, C1413530mt5 c1413530mt5, InterfaceC1364105Vn<? super C1413090msN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1412800mru;
        this.LLILLJJLI = c1413070msL;
        this.LLILLL = aVMusic;
        this.LLILZ = c1413530mt5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1413090msN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoMixEditingMaterialComponent@1cfb.onInsertForce$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1412800mru c1412800mru = this.LL;
        if (c1412800mru != null) {
            c1412800mru.LJ = new C1413070msL(this.LLILLJJLI.LIZIZ, this.LLILLL);
        }
        InterfaceC1413600mtC interfaceC1413600mtCN5 = this.LLILZ.n5();
        if (interfaceC1413600mtCN5 != null) {
            interfaceC1413600mtCN5.Io1(this.LLILLL, EnumC1413120msQ.EFFECT, 0, 0, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.onInsertForce$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
