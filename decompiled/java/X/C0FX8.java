package X;

import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0FX8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX8 implements IFetchEffectListener {
    public final int $t;
    public Object l0;

    public static final void onStart$0(C0FX8 c0fx8, Effect effect) {
    }

    public static final void onStart$1(C0FX8 c0fx8, Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, effect, exceptionResult);
                break;
            case 1:
                onFail$1(this, effect, exceptionResult);
                break;
            case 2:
                onFail$2(this, effect, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        switch (this.$t) {
            case 0:
                onStart$0(this, effect);
                break;
            case 1:
                onStart$1(this, effect);
                break;
            case 2:
                onStart$2(this, effect);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effect);
                break;
            case 1:
                onSuccess$1(this, effect);
                break;
            case 2:
                onSuccess$2(this, effect);
                break;
        }
    }

    public C0FX8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onStart$2(C0FX8 c0fx8, Effect effect) {
        C201955140j.LIZLLL(C1465490oEt.LIZIZ, "EditStickerFontStyleManager", "downloadTextFontForFirstItem is start.");
    }

    public static final void onSuccess$0(C0FX8 c0fx8, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c0fx8.l0;
        C387860FIq c387860FIq = new C387860FIq((Effect) obj, false);
        C189200o6.m2constructorimpl(c387860FIq);
        interfaceC1364105Vn.resumeWith(c387860FIq);
    }

    public static final void onSuccess$1(C0FX8 c0fx8, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c0fx8.l0;
        C387860FIq c387860FIq = new C387860FIq((Effect) obj, false);
        C189200o6.m2constructorimpl(c387860FIq);
        interfaceC1364105Vn.resumeWith(c387860FIq);
    }

    public static final void onSuccess$2(C0FX8 c0fx8, Object obj) {
        C201955140j.LIZLLL(C1465490oEt.LIZIZ, "EditStickerFontStyleManager", "downloadTextFontForFirstItem is onSuccess.");
    }

    public static final void onFail$0(C0FX8 c0fx8, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c0fx8.l0;
        C387840FIo c387840FIo = new C387840FIo("fetchEffect onFail", exceptionResult.getErrorCode(), exceptionResult.getException());
        C189200o6.m2constructorimpl(c387840FIo);
        interfaceC1364105Vn.resumeWith(c387840FIo);
    }

    public static final void onFail$1(C0FX8 c0fx8, Effect effect, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c0fx8.l0;
        C387840FIo c387840FIo = new C387840FIo("fetchEffect onFail", exceptionResult.getException(), 2);
        C189200o6.m2constructorimpl(c387840FIo);
        interfaceC1364105Vn.resumeWith(c387840FIo);
    }

    public static final void onFail$2(C0FX8 c0fx8, Effect effect, ExceptionResult exceptionResult) {
        C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadTextFontForFirstItem is failure, dataItemInfo = ");
        sbLIZ.append(((TextFontStyleData) c0fx8.l0).fontName);
        sbLIZ.append(", exception = ");
        sbLIZ.append(exceptionResult);
        C201955140j.LJIIIIZZ(c1465490oEt, "EditStickerFontStyleManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
