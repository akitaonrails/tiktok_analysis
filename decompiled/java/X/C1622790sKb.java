package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622790sKb extends AbstractC1622390sJx {
    public Effect LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILLJJLI = null;
        C1665200tR0.LIZ.getClass();
        C1665200tR0.LIZIZ = null;
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return DiyPropParser.LJIIJ(c1627370sRz.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        Effect effect;
        Effect effect2 = c1627370sRz.LIZ;
        if (effect2 == null || (effect = this.LLILLJJLI) == null || !Intrinsics.LJFF(effect.getEffectId(), effect2.getEffectId())) {
            LJJIFFI();
        }
        this.LLILLJJLI = effect2;
    }
}
