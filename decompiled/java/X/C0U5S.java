package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0U5S, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.composer.LiveComposerManagerB$updateOtherTagValue$1", f = "LiveComposerManagerB.kt", l = {534}, m = "invokeSuspend")
public final class C0U5S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U5S(LiveEffect liveEffect, int i, InterfaceC1364105Vn<? super C0U5S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveEffect;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U5S(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJLL;
        C1C7U.LIZ("LiveComposerManagerB@e202.updateOtherTagValue$1");
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
            C0U8T c0u8t = C0U8T.LIZ;
            String resourceId = this.LLILLJJLI.getResourceId();
            String strLLILL2 = this.LLILLJJLI.LLILL();
            if (strLLILL2 == null) {
                strLLILL2 = "";
            }
            if (strLJLL != null) {
                str = strLJLL;
            }
            this.LL = 1;
            obj = c0u8t.LJIIL(resourceId, strLLILL2, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveComposerManagerB@e202.updateOtherTagValue$1");
                return objLJFF;
            }
        }
        LiveEffect liveEffect = (LiveEffect) obj;
        if (liveEffect != null) {
            int i2 = this.LLILLL;
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ != null) {
                composerConfigLJIIJ.LIZ = i2;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveComposerManagerB@e202.updateOtherTagValue$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
