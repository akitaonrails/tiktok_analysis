package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.ImageSwitchModeScene$navToAnotherPage$1", f = "ImageSwitchModeScene.kt", l = {265, 269}, m = "invokeSuspend")
public final class C578450MmR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C578370MmJ LLILLJJLI;
    public final /* synthetic */ Bundle LLILLL;
    public final /* synthetic */ SwitchModePayload LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578450MmR(C578370MmJ c578370MmJ, Bundle bundle, SwitchModePayload switchModePayload, InterfaceC1364105Vn<? super C578450MmR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578370MmJ;
        this.LLILLL = bundle;
        this.LLILZ = switchModePayload;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578450MmR(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bundle bundle;
        MusicBuzModel musicBuzModel;
        C1C7U.LIZ("ImageSwitchModeScene@3ccb.navToAnotherPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ImageSwitchModeScene@3ccb.navToAnotherPage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMediaPlayerManagerService iMediaPlayerManagerService = (IMediaPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IMediaPlayerManagerService.class, false, false, false, 14, null);
            if (iMediaPlayerManagerService != null) {
                MusicBuzModel musicBuzModel2 = this.LLILLJJLI.getEditModel().creativeModel.musicBuzModel;
                this.LL = 1;
                if (C13044058o.LIZ(iMediaPlayerManagerService, musicBuzModel2, "navToAnotherPage", true, this, 8) == objLJFF) {
                    C1C7U.LIZIZ("ImageSwitchModeScene@3ccb.navToAnotherPage$1");
                    return objLJFF;
                }
            }
        }
        C141Q c141q = C141Q.LIZ;
        String mMusicPath = this.LLILLJJLI.getEditModel().getMMusicPath();
        c141q.getClass();
        if (!C141Q.LJII(mMusicPath) && (bundle = this.LLILLL) != null && (musicBuzModel = C0MUK.LIZJ(bundle).musicBuzModel) != null) {
            musicBuzModel.musicPath = this.LLILLJJLI.getEditModel().getMMusicPath();
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C578460MmS c578460MmS = new C578460MmS(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c578460MmS) == objLJFF) {
            C1C7U.LIZIZ("ImageSwitchModeScene@3ccb.navToAnotherPage$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImageSwitchModeScene@3ccb.navToAnotherPage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
