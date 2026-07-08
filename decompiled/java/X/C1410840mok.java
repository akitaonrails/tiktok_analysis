package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410840mok extends C09AY implements Function1<C1411350mpZ, C1411350mpZ> {
    public final /* synthetic */ List<SMBOptInStep> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410840mok(List<SMBOptInStep> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1411350mpZ invoke(C1411350mpZ c1411350mpZ) {
        AbstractC1411370mpb abstractC1411370mpb;
        C1411350mpZ c1411350mpZ2 = c1411350mpZ;
        if (this.LL.isEmpty()) {
            abstractC1411370mpb = c1411350mpZ2.LL;
        } else {
            abstractC1411370mpb = C1410940mou.LIZ;
        }
        return C1411350mpZ.LIZ(c1411350mpZ2, abstractC1411370mpb, null, null, false, this.LL, null, null, null, null, null, 1006);
    }
}
