package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import njp.a;

/* JADX INFO: renamed from: X.0UJI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.VoiceModeContainerRevision$1$1", f = "VoiceModeContainerRevision.kt", l = {477}, m = "invokeSuspend")
public final class C0UJI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UJI(String str, InterfaceC1364105Vn<? super C0UJI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UJI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceModeContainerRevision@3797.<init>$1$1");
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
            C781270Ukn.LJI().getH5EventStickerManager();
            C0UAS.LIZIZ();
            C0UAN h5EventStickerManager = C781270Ukn.LJI().getH5EventStickerManager();
            String str = this.LLILLJJLI;
            h5EventStickerManager.getClass();
            C0UAS.LIZIZ = str;
            C0UEA liveEffectController = C781270Ukn.LJI().getLiveEffectController();
            String str2 = this.LLILLJJLI;
            String str3 = C0UD4.LIZIZ;
            AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(140);
            AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(343);
            this.LL = 1;
            if (liveEffectController.LJFF(str2, str3, "trending", this, aFwS199S0000000_12, aFwS245S0000000_12, null, true, false) == objLJFF) {
                C1C7U.LIZIZ("VoiceModeContainerRevision@3797.<init>$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceModeContainerRevision@3797.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
