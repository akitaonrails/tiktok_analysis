package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PE0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel$fetchData$1$1$onDownloadSuccess$2$1", f = "ReuseAudioViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0PE0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PE0(String str, InterfaceC1364105Vn<? super C0PE0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PE0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("ReuseAudioViewModel@995a.fetchData$1$1$onDownloadSuccess$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).vesdkService().getAudioFileInfo(this.LL).duration;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLJ = C2286608xc.LJ(iIntValue);
        C1C7U.LIZIZ("ReuseAudioViewModel@995a.fetchData$1$1$onDownloadSuccess$2$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
