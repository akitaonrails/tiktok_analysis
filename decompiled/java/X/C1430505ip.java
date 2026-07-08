package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.VideoMixEditingMaterialComponent$tryPreDownloadAsset$1", f = "VideoMixEditingMaterialComponent.kt", l = {939}, m = "invokeSuspend")
public final class C1430505ip extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1413530mt5 LLILLJJLI;
    public final /* synthetic */ C1412800mru LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430505ip(C1413530mt5 c1413530mt5, C1412800mru c1412800mru, int i, InterfaceC1364105Vn<? super C1430505ip> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1413530mt5;
        this.LLILLL = c1412800mru;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1430505ip(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("VideoMixEditingMaterialComponent@1cfb.tryPreDownloadAsset$1");
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
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1430305in(null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.tryPreDownloadAsset$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C201955140j.LIZLLL(C0MJ8.LIZIZ, "a21740", "we have space, let's preload");
            this.LLILLJJLI.N6(this.LLILLL, this.LLILZ);
        } else {
            C201955140j.LIZLLL(C0MJ8.LIZIZ, "a21740", "sorry, we dont have enough space, let's skip");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.tryPreDownloadAsset$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
