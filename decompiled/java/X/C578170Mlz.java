package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel;
import com.ss.android.ugc.aweme.creative.model.edit.VideoImageSeparateSwitchModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.Video2ImageSwitchProcessor$internalSwitchMode$1", f = "ImageVideoSeparateModeSwitchApi.kt", l = {552}, m = "invokeSuspend")
public final class C578170Mlz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C578190Mm1 LLILLJJLI;
    public final /* synthetic */ C578160Mly LLILLL;
    public final /* synthetic */ Bundle LLILZ;
    public final /* synthetic */ InterfaceC332260D0u<EnumC578300MmC> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578170Mlz(C578190Mm1 c578190Mm1, C578160Mly c578160Mly, Bundle bundle, InterfaceC332260D0u<EnumC578300MmC> interfaceC332260D0u, InterfaceC1364105Vn<? super C578170Mlz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578190Mm1;
        this.LLILLL = c578160Mly;
        this.LLILZ = bundle;
        this.LLILZIL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578170Mlz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        VideoPublishEditModel videoPublishEditModel2;
        CreativeModel creativeModel2;
        ImageEditModel imageEditModel;
        VideoPublishEditModel videoPublishEditModel3;
        C1C7U.LIZ("Video2ImageSwitchProcessor@f581.internalSwitchMode$1");
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
            C578190Mm1 c578190Mm1 = this.LLILLJJLI;
            if (c578190Mm1.LLIZLLLIL == null) {
                c578190Mm1.LLIZLLLIL = C23250099c.LIZIZ(LifecycleOwnerKt.getLifecycleScope(c578190Mm1.LLIZ), null, null, new C578180Mm0(c578190Mm1, null), 3);
            }
            C099G c099g = this.LLILLJJLI.LLIZLLLIL;
            if (c099g != null) {
                this.LL = 1;
                if (c099g.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("Video2ImageSwitchProcessor@f581.internalSwitchMode$1");
                    return objLJFF;
                }
            }
        }
        C1439820nZU c1439820nZULIZ = this.LLILLJJLI.LIZJ().LIZ();
        if (c1439820nZULIZ != null) {
            c1439820nZULIZ.LJ = EnumC1438880nXy.SEPARATED;
        }
        C0FQX.LIZ = this.LLILLJJLI.LIZJ();
        C0FQX.LIZIZ = true;
        C1439820nZU c1439820nZU = this.LLILLJJLI.LIZJ().LIZIZ;
        if (c1439820nZU != null && (videoPublishEditModel3 = c1439820nZU.LIZ) != null) {
            videoPublishEditModel3.setEnterFromImageSwitch(true);
        }
        C1439820nZU c1439820nZU2 = this.LLILLJJLI.LIZJ().LIZIZ;
        if (c1439820nZU2 != null && (videoPublishEditModel2 = c1439820nZU2.LIZ) != null && (creativeModel2 = videoPublishEditModel2.creativeModel) != null && (imageEditModel = creativeModel2.imageEditModel) != null) {
            imageEditModel.isVideoChildPageFromImage = false;
        }
        VideoImageSeparateSwitchModel videoImageSeparateSwitchModel = new VideoImageSeparateSwitchModel(this.LLILLL.LIZ, System.currentTimeMillis(), this.LLILLL.LIZIZ);
        C0MUK.LIZJ(this.LLILZ).videoImageSeparateSwitchModel = videoImageSeparateSwitchModel;
        C1439820nZU c1439820nZU3 = this.LLILLJJLI.LIZJ().LIZIZ;
        if (c1439820nZU3 != null && (videoPublishEditModel = c1439820nZU3.LIZ) != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            creativeModel.videoImageSeparateSwitchModel = videoImageSeparateSwitchModel;
        }
        this.LLILZIL.setValue(EnumC578300MmC.SWITCHING);
        this.LLILZ.putBoolean("switch_mode_from_video_to_image", true);
        C565310MFd.LIZIZ(this.LLILLJJLI.LIZLLL(), this.LLILZ, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Video2ImageSwitchProcessor@f581.internalSwitchMode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
