package Y;

import X.C01CC;
import X.C09JN;
import X.C118300cf;
import X.C1C7U;
import com.bytedance.android.livesdk.dataChannel.EnigmaStatus;
import com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public class AfS1S0300200_7 implements C09JN {
    public final int $t;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0300200_7 afS1S0300200_7, Object obj) {
        String str;
        boolean z;
        C1C7U.LIZ("EnigmaService@185c.switchEnigma$disposableChain$8");
        ((Function0) afS1S0300200_7.l0).invoke();
        if (afS1S0300200_7.j3 == 2) {
            str = "wear";
        } else {
            str = "remove";
        }
        C01CC.LJFF((int) (System.currentTimeMillis() - afS1S0300200_7.j4), str, "success", "", Integer.valueOf(((C118300cf) afS1S0300200_7.l1).element));
        EnigmaService enigmaService = (EnigmaService) afS1S0300200_7.l2;
        if (afS1S0300200_7.j3 == 2) {
            z = true;
        } else {
            z = false;
        }
        enigmaService.getClass();
        DataChannelGlobal.LLILZ.HQ2(EnigmaStatus.class, Boolean.valueOf(z));
        C1C7U.LIZIZ("EnigmaService@185c.switchEnigma$disposableChain$8");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$1(Y.AfS1S0300200_7 r19, java.lang.Object r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S0300200_7.accept$1(Y.AfS1S0300200_7, java.lang.Object):void");
    }

    public AfS1S0300200_7(Object obj, Object obj2, long j, Object obj3, long j2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j3 = j;
        this.l2 = obj3;
        this.j4 = j2;
    }
}
