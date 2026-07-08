package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05iX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AutoPickTemplateAssetDownloader$downloadData$5", f = "AutoPickTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1428705iX extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1437705jz<C1412860ms0> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428705iX(String str, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz, InterfaceC1364105Vn<? super C1428705iX> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1437705jz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Exception runtimeException;
        C1C7U.LIZ("AutoPickTemplateAssetDownloader@c432.downloadData$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTemplateAssetDownloader -> download failed/timeout assetId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(": ");
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(th.getMessage());
        C201955140j.LJII(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz = this.LLILLL;
        if (!(th instanceof Exception) || (runtimeException = (Exception) th) == null) {
            runtimeException = new RuntimeException(th.getMessage());
        }
        interfaceC1437705jz.LIZ(runtimeException);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoPickTemplateAssetDownloader@c432.downloadData$5");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C443120HZe<? extends NLEModel, ? extends AVMusic, ? extends Boolean>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1428705iX c1428705iX = new C1428705iX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1428705iX.LL = th;
        return c1428705iX.invokeSuspend(Unit.LIZ);
    }
}
