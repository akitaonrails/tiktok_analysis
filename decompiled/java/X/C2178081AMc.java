package X;

import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2178081AMc implements InterfaceC2178111AMf<XAudioSrc, C2178071AMb> {
    public void LIZIZ(XAudioSrc xAudioSrc, Function1<? super C2178071AMb, Unit> function1) {
        C2178071AMb c2178071AMb;
        if (xAudioSrc == null) {
            c2178071AMb = null;
        } else {
            c2178071AMb = new C2178071AMb(xAudioSrc.getPlayUrl(), null, null, null, xAudioSrc.getPlayModel(), 14);
        }
        if (function1 != null) {
            function1.invoke(c2178071AMb);
        }
    }
}
