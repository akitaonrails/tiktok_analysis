package X;

import com.bytedance.android.live.adminsetting.ChatApproveApi;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01zJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C513501zJ implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public C513501zJ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(C513501zJ c513501zJ, Object obj, Object obj2) {
        C1111930f2d c1111930f2d = (C1111930f2d) c513501zJ.l0;
        ChatMessage chatMessage = (ChatMessage) obj;
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) obj2;
        c1111930f2d.getClass();
        if (chatMessage != null) {
            C480460Ism.LIZ().getClass();
            ((ChatApproveApi) C480460Ism.LIZLLL(ChatApproveApi.class)).chatApprove(c1111930f2d.LLLJL.LJIIZILJ, chatMessage.getMessageId()).LJIILIIL(new C0UO0()).LJJLL(new C516701zp(c1111930f2d, interfaceC1112060f2q, chatMessage, 4), new C516901zr(16));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C513501zJ c513501zJ, Object obj, Object obj2) {
        Pair pair = new Pair(Boolean.valueOf(((Boolean) obj).booleanValue()), obj2);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c513501zJ.l0;
        C189200o6.m2constructorimpl(pair);
        interfaceC1364105Vn.resumeWith(pair);
        return Unit.LIZ;
    }
}
