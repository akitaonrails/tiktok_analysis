package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import njp.a;

/* JADX INFO: renamed from: X.0mxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.EffectAssetDownloader$downloadEffect$1", f = "EffectAssetDownloader.kt", l = {198}, m = "invokeSuspend")
public final class C1416560mxy extends C09AX implements Function2<C094D<? super C443120HZe<? extends Integer, ? extends Effect, ? extends Boolean>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1416470mxp LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416560mxy(C1416470mxp c1416470mxp, Effect effect, boolean z, InterfaceC1364105Vn<? super C1416560mxy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1416470mxp;
        this.LLILZ = effect;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1416560mxy c1416560mxy = new C1416560mxy(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1416560mxy.LLILLJJLI = obj;
        return c1416560mxy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectAssetDownloader@f641.downloadEffect$1");
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
            if (this.LLILLL.LLILLJJLI.LJIJJLI(this.LLILZ)) {
                c094d.LJIIIIZZ(new C443120HZe(C2286608xc.LJ(100), this.LLILZ, true));
                Boolean.valueOf(c094d.LJIIJJI(null));
            } else {
                InterfaceC1635410sex interfaceC1635410sex = this.LLILLL.LLILLJJLI;
                Effect effect = this.LLILZ;
                IEffectDownloadProgressListener iEffectDownloadProgressListener = new IEffectDownloadProgressListener() { // from class: X.0mxz
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect2) {
                        c094d.LJIIIIZZ(new C443120HZe<>(0, null, Boolean.FALSE));
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect2) {
                        if (effect2 == null) {
                            c094d.LJIIJJI(new C1416460mxo(-1, "Effect is null"));
                        } else {
                            c094d.LJIIIIZZ(new C443120HZe<>(100, effect2, Boolean.FALSE));
                            c094d.LJIIJJI(null);
                        }
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                        C094D<C443120HZe<Integer, ? extends Effect, Boolean>> c094d2 = c094d;
                        int errorCode = exceptionResult.getErrorCode();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("effect failed: ");
                        sbLIZ.append(exceptionResult.getErrorCode());
                        sbLIZ.append(", ");
                        sbLIZ.append(exceptionResult.getMsg());
                        c094d2.LJIIJJI(new C1416460mxo(errorCode, C2188811AlT.LIZIZ(sbLIZ)));
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                    public final void onProgress(Effect effect2, int i2, long j) {
                        c094d.LJIIIIZZ(new C443120HZe<>(Integer.valueOf(i2), null, Boolean.FALSE));
                    }
                };
                boolean z = this.LLILZIL;
                interfaceC1635410sex.LJ(effect, z, z, true, iEffectDownloadProgressListener);
            }
            AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(476);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS210S0000000_22, this) == objLJFF) {
                C1C7U.LIZIZ("EffectAssetDownloader@f641.downloadEffect$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectAssetDownloader@f641.downloadEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C443120HZe<? extends Integer, ? extends Effect, ? extends Boolean>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
