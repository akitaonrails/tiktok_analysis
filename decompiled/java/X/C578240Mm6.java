package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.ImageVideoSeparateModeSwitchComponent$realSeparateSwitch$1", f = "ImageVideoSeparateModeSwitchApi.kt", l = {237, 238}, m = "invokeSuspend")
public final class C578240Mm6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C578250Mm7 LLILLJJLI;
    public final /* synthetic */ C578160Mly LLILLL;
    public final /* synthetic */ InterfaceC332260D0u<EnumC578300MmC> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578240Mm6(C578250Mm7 c578250Mm7, C578160Mly c578160Mly, InterfaceC332260D0u<EnumC578300MmC> interfaceC332260D0u, InterfaceC1364105Vn<? super C578240Mm6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578250Mm7;
        this.LLILLL = c578160Mly;
        this.LLILZ = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578240Mm6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageVideoSeparateModeSwitchComponent@6927.realSeparateSwitch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.realSeparateSwitch$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMediaPlayerManagerService iMediaPlayerManagerService = (IMediaPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IMediaPlayerManagerService.class, false, false, false, 14, null);
            if (iMediaPlayerManagerService != null) {
                MusicBuzModel musicBuzModel = this.LLILLJJLI.getEditModel().creativeModel.musicBuzModel;
                this.LL = 1;
                if (iMediaPlayerManagerService.LIZIZ(musicBuzModel, "separateSwitch", true, true, this) == objLJFF) {
                    C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.realSeparateSwitch$1");
                    return objLJFF;
                }
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C578230Mm5 c578230Mm5 = new C578230Mm5(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c578230Mm5) == objLJFF) {
            C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.realSeparateSwitch$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.realSeparateSwitch$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
