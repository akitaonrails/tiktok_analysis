package X;

import Y.ACListenerS142S0100000_7;
import Y.ARunnableS76S0200000_7;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragmentV2;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0ILX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ILX implements InterfaceC1364105Vn<Boolean> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ACListenerS142S0100000_7 LLILLJJLI;

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return C0PEM.LIZJ;
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        if (obj instanceof Boolean) {
            C786410Ut5.LJJZZIII(((LiveNewAudienceEndFragmentV2) this.LLILLJJLI.l0).LLILZ, new ARunnableS76S0200000_7((Boolean) obj, this, 51));
        }
    }

    public C0ILX(ACListenerS142S0100000_7 aCListenerS142S0100000_7, boolean z) {
        this.LLILLJJLI = aCListenerS142S0100000_7;
        this.LL = z;
    }
}
