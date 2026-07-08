package X;

import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01zG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C513201zG implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    public static final void onFail$0(C513201zG c513201zG, ExceptionResult exceptionResult) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                break;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                break;
        }
    }

    public C513201zG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$1(C513201zG c513201zG, ExceptionResult exceptionResult) {
        ((InterfaceC2329309At) c513201zG.l0).onError(exceptionResult.getException());
    }

    public static final void onSuccess$0(C513201zG c513201zG, Object obj) {
        Iterator it2 = C20424314vx.LIZIZ((EffectChannelResponse) obj).iterator();
        while (it2.hasNext()) {
            C20424314vx.LJI((Effect) it2.next());
        }
        Function1 function1 = (Function1) c513201zG.l0;
        if (function1 != null) {
            function1.invoke(C20424314vx.LIZLLL());
        }
        Iterator<String> it3 = C20424314vx.LIZ.keySet().iterator();
        while (it3.hasNext()) {
            if (C20424314vx.LIZIZ.get(it3.next()) == null) {
                InterfaceC397701gd interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
                if (interfaceC397701gdYn2 != null) {
                    interfaceC397701gdYn2.LJIILJJIL("text_header", true, new IFetchEffectChannelListener() { // from class: X.01gK
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                        public final void onFail(ExceptionResult exceptionResult) {
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                            Iterator it4 = C20424314vx.LIZIZ(effectChannelResponse).iterator();
                            while (it4.hasNext()) {
                                C20424314vx.LJI((Effect) it4.next());
                            }
                        }
                    });
                    return;
                }
                return;
            }
        }
    }

    public static final void onSuccess$1(C513201zG c513201zG, Object obj) {
        Iterator it2 = C20424314vx.LIZIZ((EffectChannelResponse) obj).iterator();
        while (it2.hasNext()) {
            C20424314vx.LJI((Effect) it2.next());
        }
        ((InterfaceC2329309At) c513201zG.l0).onSuccess(C20424314vx.LIZLLL());
    }
}
