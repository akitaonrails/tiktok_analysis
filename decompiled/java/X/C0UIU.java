package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UIU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.sticker.StickerMonitorEffectHelper$saveMonitorEffect$1", f = "StickerMonitorEffectHelper.kt", l = {78, 79}, m = "invokeSuspend")
public final class C0UIU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LiveEffect LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UIU(String str, String str2, InterfaceC1364105Vn<? super C0UIU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UIU(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveEffect liveEffect;
        C1C7U.LIZ("StickerMonitorEffectHelper@a9e4.saveMonitorEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    liveEffect = this.LL;
                    C155000ia.LIZIZ(obj);
                    C0UIT.LIZIZ = liveEffect;
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerMonitorEffectHelper@a9e4.saveMonitorEffect$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0UIT c0uit = C0UIT.LIZ;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LLILLJJLI = 1;
            obj = c0uit.LIZLLL(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerMonitorEffectHelper@a9e4.saveMonitorEffect$1");
                return objLJFF;
            }
        }
        LiveEffect liveEffect2 = (LiveEffect) obj;
        if (liveEffect2 != null) {
            C0UIT c0uit2 = C0UIT.LIZ;
            this.LL = liveEffect2;
            this.LLILLJJLI = 2;
            if (c0uit2.LIZJ(liveEffect2, this) == objLJFF) {
                C1C7U.LIZIZ("StickerMonitorEffectHelper@a9e4.saveMonitorEffect$1");
                return objLJFF;
            }
            liveEffect = liveEffect2;
        } else {
            liveEffect = null;
        }
        C0UIT.LIZIZ = liveEffect;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerMonitorEffectHelper@a9e4.saveMonitorEffect$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
