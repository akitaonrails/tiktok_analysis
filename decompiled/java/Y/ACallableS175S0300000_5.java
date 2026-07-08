package Y;

import X.C0FI2;
import X.C0FID;
import X.C0FX6;
import X.C196909122h;
import X.C1C7U;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.services.storage.StorageSensitivityService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public class ACallableS175S0300000_5 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS175S0300000_5 aCallableS175S0300000_5) {
        C0FI2 c0fi2 = (C0FI2) aCallableS175S0300000_5.l0;
        TextFontStyleData textFontStyleData = (TextFontStyleData) aCallableS175S0300000_5.l1;
        C0FID c0fid = (C0FID) aCallableS175S0300000_5.l2;
        c0fi2.getClass();
        C1C7U.LIZ("EditStickerFontStyleManager@4190.startDownload$1L");
        C196909122h.LIZ().LJIIL(textFontStyleData.LJ, new C0FX6(c0fi2, c0fid, 1));
        C1C7U.LIZIZ("EditStickerFontStyleManager@4190.startDownload$1L");
        return null;
    }

    public static final Object call$1(ACallableS175S0300000_5 aCallableS175S0300000_5) {
        final C0FI2 c0fi2 = (C0FI2) aCallableS175S0300000_5.l0;
        final Boolean bool = (Boolean) aCallableS175S0300000_5.l1;
        final IFetchEffectChannelListener iFetchEffectChannelListener = (IFetchEffectChannelListener) aCallableS175S0300000_5.l2;
        c0fi2.getClass();
        C1C7U.LIZ("EditStickerFontStyleManager@4190.downloadFontList$1L");
        C196909122h.LIZ().LJI(c0fi2.LIZ, true, new IFetchEffectChannelListener() { // from class: X.0FI7
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("textFontDownload err: ");
                sbLIZ.append(exceptionResult.getMsg());
                C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
                iFetchEffectChannelListener.onFail(exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = C0FJK.LIZIZ(effectChannelResponse2, c0fi2.LIZ).iterator();
                while (it2.hasNext()) {
                    TextFontStyleData textFontStyleDataLJJIJL = c0fi2.LJJIJL((Effect) it2.next());
                    if (textFontStyleDataLJJIJL != null) {
                        arrayList.add(textFontStyleDataLJJIJL);
                    }
                }
                c0fi2.LJ(bool, arrayList);
                iFetchEffectChannelListener.onSuccess(effectChannelResponse2);
            }
        });
        C1C7U.LIZIZ("EditStickerFontStyleManager@4190.downloadFontList$1L");
        return null;
    }

    public static final Object call$2(ACallableS175S0300000_5 aCallableS175S0300000_5) {
        final C0FI2 c0fi2 = (C0FI2) aCallableS175S0300000_5.l0;
        final ArrayList arrayList = (ArrayList) aCallableS175S0300000_5.l1;
        final Boolean bool = (Boolean) aCallableS175S0300000_5.l2;
        c0fi2.getClass();
        C1C7U.LIZ("EditStickerFontStyleManager@4190.downloadTextFontIfNeed$1L");
        C196909122h.LIZ().LJI(c0fi2.LIZ, !StorageSensitivityService.getLimitEffectPreload(), new IFetchEffectChannelListener() { // from class: X.0FI6
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("textFontDownload err: ");
                sbLIZ.append(exceptionResult.getMsg());
                C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                Iterator it2 = C0FJK.LIZIZ(effectChannelResponse, c0fi2.LIZ).iterator();
                while (it2.hasNext()) {
                    arrayList.add(c0fi2.LJJIJL((Effect) it2.next()));
                }
                c0fi2.LJ(bool, arrayList);
            }
        });
        C1C7U.LIZIZ("EditStickerFontStyleManager@4190.downloadTextFontIfNeed$1L");
        return null;
    }

    public ACallableS175S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
