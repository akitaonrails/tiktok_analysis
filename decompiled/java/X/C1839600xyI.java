package X;

import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0xyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839600xyI<T> implements InterfaceC300801Eo {
    public final /* synthetic */ boolean LL;

    public C1839600xyI(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<List<BoardTextFontStyleData>> interfaceC2329309At) {
        if (!C1815390xLF.LIZ()) {
            C1839660xyO.Companion.getClass();
            interfaceC2329309At.onError(C1839660xyO.VE_PLUGIN_NOT_READY);
            return;
        }
        InterfaceC397701gd interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
        if (interfaceC397701gdYn2 != null) {
            final C11KT c11kt = (C11KT) interfaceC2329309At;
            interfaceC397701gdYn2.LJIILJJIL("pcs_font_panel", this.LL, new IFetchEffectChannelListener() { // from class: X.0xyM
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    c11kt.onError(exceptionResult.getException());
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    Iterator<Effect> it2 = effectChannelResponse.getAllCategoryEffects().iterator();
                    while (it2.hasNext()) {
                        C1839560xyE.LJII(it2.next());
                    }
                    c11kt.onSuccess(C1839560xyE.LIZLLL());
                }
            });
        } else {
            interfaceC2329309At.onError(new IllegalStateException("BoardFontManager not available"));
        }
    }
}
