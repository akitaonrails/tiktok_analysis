package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectLoadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0U5T, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.composer.LiveComposerManagerOPT$updateOtherTagValue$1", f = "LiveComposerManagerOPT.kt", l = {844}, m = "invokeSuspend")
public final class C0U5T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U5T(LiveEffect liveEffect, int i, InterfaceC1364105Vn<? super C0U5T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveEffect;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U5T(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJLL;
        LiveEffect.ComposerConfig composerConfigLJIIJ;
        C1C7U.LIZ("LiveComposerManagerOPT@a709.updateOtherTagValue$1");
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
            if (LiveEffectLoadOptSetting.INSTANCE.isEnable()) {
                C0U8T c0u8t = C0U8T.LIZ;
                String resourceId = this.LLILLJJLI.getResourceId();
                int i2 = this.LLILLL;
                c0u8t.getClass();
                LiveEffect liveEffect = C0U8T.LIZJ.get(resourceId);
                if (liveEffect != null && (composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect)) != null) {
                    composerConfigLJIIJ.LIZ = i2;
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LiveComposerManagerOPT@a709.updateOtherTagValue$1");
                return unit;
            }
            String str = "";
            if (LiveStickerDataSourceOptSetting.INSTANCE.enable()) {
                String strLLILL = this.LLILLJJLI.LLILL();
                String str2 = C0UD4.LIZ;
                if (Intrinsics.LJFF(strLLILL, "livefiltercomposerexperiment")) {
                    strLJLL = "";
                } else {
                    strLJLL = this.LLILLJJLI.LJLL();
                }
            } else {
                strLJLL = this.LLILLJJLI.LJLL();
            }
            C0U8T c0u8t2 = C0U8T.LIZ;
            String resourceId2 = this.LLILLJJLI.getResourceId();
            String strLLILL2 = this.LLILLJJLI.LLILL();
            if (strLLILL2 == null) {
                strLLILL2 = "";
            }
            if (strLJLL != null) {
                str = strLJLL;
            }
            this.LL = 1;
            obj = c0u8t2.LJIIL(resourceId2, strLLILL2, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveComposerManagerOPT@a709.updateOtherTagValue$1");
                return objLJFF;
            }
        }
        LiveEffect liveEffect2 = (LiveEffect) obj;
        if (liveEffect2 != null) {
            int i3 = this.LLILLL;
            LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect2);
            if (composerConfigLJIIJ2 != null) {
                composerConfigLJIIJ2.LIZ = i3;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveComposerManagerOPT@a709.updateOtherTagValue$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
