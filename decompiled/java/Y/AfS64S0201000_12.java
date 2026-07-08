package Y;

import X.C09JN;
import X.C13LP;
import X.C1C7U;
import X.C761960Tuk;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AfS64S0201000_12 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS64S0201000_12 afS64S0201000_12, Object obj) {
        C1C7U.LIZ("UserManageService@d46e.reportViolationInGreenScreenScene$1");
        UserManageService userManageService = (UserManageService) afS64S0201000_12.l0;
        int i = afS64S0201000_12.i2;
        DataChannel dataChannel = (DataChannel) afS64S0201000_12.l1;
        userManageService.getClass();
        UserManageService.LIZIZ((ViolationStatusResponse) obj, i, dataChannel);
        C1C7U.LIZIZ("UserManageService@d46e.reportViolationInGreenScreenScene$1");
    }

    public static final void accept$1(AfS64S0201000_12 afS64S0201000_12, Object obj) {
        C1C7U.LIZ("SoundEffectRepository@9056.saveEditedOrder$upload$3");
        if (afS64S0201000_12.i2 < 1) {
            Handler value = ((C761960Tuk) afS64S0201000_12.l0).LJ.getValue();
            List list = (List) afS64S0201000_12.l1;
            int i = afS64S0201000_12.i2;
            Handler handler = value;
            Message messageObtainMessage = handler.obtainMessage(100);
            messageObtainMessage.getData().putLongArray("sfx_id_list", C13LP.LLIIIILZ(list));
            messageObtainMessage.arg1 = i + 1;
            C786410Ut5.LJLJLJ(handler, messageObtainMessage, 30000L);
        }
        C1C7U.LIZIZ("SoundEffectRepository@9056.saveEditedOrder$upload$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS64S0201000_12(int i, int i2, C761960Tuk c761960Tuk, List<Long> list) {
        this.$t = list;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c761960Tuk;
    }
}
