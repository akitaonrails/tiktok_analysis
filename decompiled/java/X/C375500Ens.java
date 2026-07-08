package X;

import Y.ARunnableS38S0300000_5;
import android.graphics.Bitmap;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ens, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.common.logic.CropAlignComponent$showCover$1", f = "CropAlignComponent.kt", l = {}, m = "invokeSuspend")
public final class C375500Ens extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C375490Enr LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C375500Ens(C375490Enr c375490Enr, Function0<Unit> function0, InterfaceC1364105Vn<? super C375500Ens> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c375490Enr;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C375500Ens(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        INLEMediaSession iNLEMediaSessionFD1;
        C1C7U.LIZ("CropAlignComponent@a185.showCover$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC374920Emw interfaceC374920EmwZ1 = this.LL.Z1();
        if (interfaceC374920EmwZ1 != null && (iNLEMediaSessionFD1 = interfaceC374920EmwZ1.fD1()) != null) {
            Bitmap currDisplayImage = iNLEMediaSessionFD1.getMediaRuntimeApi().getCurrDisplayImage();
            C375490Enr c375490Enr = this.LL;
            HandlerHook.viewPost(c375490Enr.LLILZIL, new ARunnableS38S0300000_5(c375490Enr, currDisplayImage, this.LLILLJJLI, 3));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CropAlignComponent@a185.showCover$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CropAlignComponent@a185.showCover$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
