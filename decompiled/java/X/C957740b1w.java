package X;

import com.bytedance.android.live.liveinteract.multihost.clientai.ICoHostTriggerApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957740b1w implements InterfaceC1145110fu9 {
    public DataChannel LIZIZ;
    public final List<String> LIZ = Collections.singletonList("live_cohost_follow_prompt");
    public final List<InterfaceC420801kM> LIZJ = Collections.synchronizedList(new ArrayList());

    @Override // X.InterfaceC1145110fu9
    public final List<String> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1145110fu9
    public final void LIZIZ(String str, C01JS c01js) {
        if (!Intrinsics.LJFF(str, "live_cohost_follow_prompt")) {
            return;
        }
        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(this.LIZIZ);
        if (jLJJLIIIJ == 0) {
            return;
        }
        C480460Ism.LIZ().getClass();
        this.LIZJ.add(((ICoHostTriggerApi) C480460Ism.LIZLLL(ICoHostTriggerApi.class)).triggerNotice(jLJJLIIIJ, c01js.LIZ(), 1).LJIILIIL(C0J1R.LIZJ(ICoHostTriggerApi.class)).LJJLJ());
    }
}
