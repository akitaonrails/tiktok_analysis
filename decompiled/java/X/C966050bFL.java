package X;

import java.util.List;

/* JADX INFO: renamed from: X.0bFL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966050bFL {
    public static final /* synthetic */ int LIZJ = 0;
    public final InterfaceC2181441AZa LIZ;
    public volatile C1276910jKj LIZIZ;

    public C966050bFL(InterfaceC2181441AZa interfaceC2181441AZa) {
        this.LIZ = interfaceC2181441AZa;
    }

    @InterfaceC1294060jmO
    public final void LIZIZ(String str) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[invalidateSei], trigger_mix_stream_signal, source=");
        sbLIZ.append(str);
        C1AZW.LJIIIZ(interfaceC2181441AZa, "RustRtcEngine", C2188811AlT.LIZIZ(sbLIZ), null, null);
        C1276910jKj c1276910jKj = this.LIZIZ;
        if (c1276910jKj != null) {
            c1276910jKj.LJJJJI();
        }
    }

    public final void LIZ(String str, List<? extends C1276580jKC> list) {
        C1276910jKj c1276910jKj = this.LIZIZ;
        if (c1276910jKj != null) {
            if (str.length() > 0) {
                InterfaceC1276380jJs interfaceC1276380jJs = c1276910jKj.LLJJJJ;
                if (interfaceC1276380jJs != null) {
                    interfaceC1276380jJs.LJJIII(str, list);
                    return;
                }
                return;
            }
            InterfaceC1276380jJs interfaceC1276380jJs2 = c1276910jKj.LLJJJJ;
            if (interfaceC1276380jJs2 == null) {
                return;
            }
            interfaceC1276380jJs2.LJI();
        }
    }
}
