package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0scr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634110scr implements InterfaceC1634140scu {
    public final long LIZ = System.currentTimeMillis();
    public final /* synthetic */ InterfaceC1632620saS<InfoStickerEffect, Object, Object> LIZIZ;
    public final /* synthetic */ InfoStickerEffect LIZJ;
    public final /* synthetic */ AbstractC1634120scs<Object, Object> LIZLLL;

    @Override // X.InterfaceC1634140scu
    public final void onProgress(int i) {
        this.LIZIZ.LIZJ(i, this.LIZJ);
    }

    @Override // X.C13MA
    public final void onSuccess(InfoStickerEffect infoStickerEffect) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        InterfaceC1632620saS<InfoStickerEffect, Object, Object> interfaceC1632620saS = this.LIZIZ;
        InfoStickerEffect infoStickerEffect2 = this.LIZJ;
        getClass();
        getClass();
        interfaceC1632620saS.LIZ(infoStickerEffect2, null, Unit.LIZ, jCurrentTimeMillis);
    }

    @Override // X.C13MA
    public final /* bridge */ /* synthetic */ void preProcess(InfoStickerEffect infoStickerEffect) {
    }

    @Override // X.C13MA
    public final void onFail(InfoStickerEffect infoStickerEffect, C1662010tLr c1662010tLr) {
        Exception exception;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        InterfaceC1632620saS<InfoStickerEffect, Object, Object> interfaceC1632620saS = this.LIZIZ;
        InfoStickerEffect infoStickerEffect2 = this.LIZJ;
        AbstractC1634120scs<Object, Object> abstractC1634120scs = this.LIZLLL;
        ExceptionResult oldExceptionResult = ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr);
        abstractC1634120scs.getClass();
        if (oldExceptionResult != null) {
            exception = oldExceptionResult.getException();
        } else {
            exception = null;
        }
        AbstractC1634120scs<Object, Object> abstractC1634120scs2 = this.LIZLLL;
        ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr);
        abstractC1634120scs2.getClass();
        interfaceC1632620saS.LIZIZ(infoStickerEffect2, exception, Unit.LIZ, jCurrentTimeMillis);
    }

    public C1634110scr(C1632760sag c1632760sag, InfoStickerEffect infoStickerEffect, AbstractC1634120scs abstractC1634120scs) {
        this.LIZIZ = c1632760sag;
        this.LIZJ = infoStickerEffect;
        this.LIZLLL = abstractC1634120scs;
    }
}
