package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerHelper$getLiveEffectByResourceId$2$multiGuestLiveEffect$1", f = "MultiGuestStickerHelper.kt", l = {49}, m = "invokeSuspend")
public final class C324340CnY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super LiveEffect>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324340CnY(LifecycleOwner lifecycleOwner, String str, InterfaceC1364105Vn<? super C324340CnY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324340CnY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiGuestStickerHelper@da8a.getLiveEffectByResourceId$2$multiGuestLiveEffect$1");
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
            C760740Tsm c760740Tsm = C760740Tsm.LIZ;
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = C0UD4.LJ;
            this.LL = 1;
            c760740Tsm.getClass();
            obj = C760740Tsm.LIZIZ(lifecycleOwner, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MultiGuestStickerHelper@da8a.getLiveEffectByResourceId$2$multiGuestLiveEffect$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MultiGuestStickerHelper@da8a.getLiveEffectByResourceId$2$multiGuestLiveEffect$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super LiveEffect> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
