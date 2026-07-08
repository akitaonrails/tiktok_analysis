package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;

/* JADX INFO: renamed from: X.112l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194365112l {
    public Integer LIZ = 0;
    public InterfaceC194315110n LIZIZ;
    public LifecycleOwner LIZJ;

    public final EffectDownloadController LIZ() {
        Integer num = this.LIZ;
        int iIntValue = num != null ? num.intValue() : 3;
        InterfaceC194315110n interfaceC194315110n = this.LIZIZ;
        if (interfaceC194315110n == null) {
            interfaceC194315110n = new InterfaceC194315110n() { // from class: X.112o
                @Override // X.InterfaceC194315110n
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.InterfaceC194315110n
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC194315110n
                public final void LIZJ() {
                }
            };
        }
        return new EffectDownloadController(iIntValue, interfaceC194315110n, this.LIZJ);
    }
}
