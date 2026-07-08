package X;

import com.ss.android.ugc.aweme.services.IFoundationAVService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import njp.a;

/* JADX INFO: renamed from: X.0my3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.SoundSyncAssetDownloader$downloadEffectStickPointModel$1", f = "SoundSyncAssetDownloader.kt", l = {96}, m = "invokeSuspend")
public final class C1416610my3 extends C09AX implements Function2<C094D<? super Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C1416610my3(InterfaceC1364105Vn<? super C1416610my3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1416610my3 c1416610my3 = new C1416610my3(interfaceC1364105Vn);
        c1416610my3.LLILLJJLI = obj;
        return c1416610my3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SoundSyncAssetDownloader@f4a2.downloadEffectStickPointModel$1");
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            c094d.LJIIIIZZ(false);
            C1420960n54 c1420960n54 = C1420960n54.LIZ;
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = new IFoundationAVService.IFetchResourcesListener() { // from class: X.0my4
                @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                public final void onFailed(Exception exc) {
                    C094D<Boolean> c094d2 = c094d;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sound sync  failed:  ");
                    String message = null;
                    if (exc != null) {
                        message = exc.getMessage();
                    }
                    sbLIZ.append(message);
                    c094d2.LJIIJJI(new C1416460mxo(-1, C2188811AlT.LIZIZ(sbLIZ)));
                }

                @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                public final void onSuccess(String[] strArr) {
                    c094d.LJIIIIZZ(Boolean.TRUE);
                    c094d.LJIIJJI(null);
                }
            };
            c1420960n54.getClass();
            C1420960n54.LIZLLL(iFetchResourcesListener);
            AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(478);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS210S0000000_22, this) == objLJFF) {
                C1C7U.LIZIZ("SoundSyncAssetDownloader@f4a2.downloadEffectStickPointModel$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SoundSyncAssetDownloader@f4a2.downloadEffectStickPointModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Boolean> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
