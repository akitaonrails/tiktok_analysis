package X;

import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS66S0210000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875490YWd implements InterfaceC875640YWs {
    public final /* synthetic */ PigeonMessageSenderComponent LIZ;
    public final /* synthetic */ GECPigeon LIZIZ;

    @Override // X.InterfaceC875640YWs
    public final void LIZ(C869590Y9l c869590Y9l) {
        GECPigeon.Companion.getClass();
        C872060YIy.LIZ().LIZ().LIZ("rd_im_message_send_finish", new AwS66S0210000_14((C0YMW) null, c869590Y9l, true, 3));
    }

    @Override // X.InterfaceC875640YWs
    public final void LIZJ(C869590Y9l c869590Y9l) {
        GECPigeon.Companion.getClass();
        C872060YIy.LIZ().LIZ().LIZ("rd_im_message_send_begin", new AwS593S0100000_14(c869590Y9l, 340));
    }

    public C875490YWd(PigeonMessageSenderComponent pigeonMessageSenderComponent, GECPigeon gECPigeon) {
        this.LIZ = pigeonMessageSenderComponent;
        this.LIZIZ = gECPigeon;
    }

    @Override // X.InterfaceC875640YWs
    public final void LIZIZ(C869590Y9l c869590Y9l, C0YMW c0ymw) {
        Long lValueOf;
        GECPigeon.Companion.getClass();
        C872060YIy.LIZ().LIZ().LIZ("rd_im_message_send_finish", new AwS66S0210000_14(c0ymw, c869590Y9l, false, 3));
        if (c0ymw != null) {
            lValueOf = Long.valueOf(c0ymw.getCheck());
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        if (Intrinsics.LJFF(strValueOf, EnumC446120HeU.REJECT_NO_TIP.getValue())) {
            this.LIZ.LLILZIL.add(c869590Y9l);
        } else if (Intrinsics.LJFF(strValueOf, EnumC446120HeU.REJECT_DOUBLE_CHECK.getValue())) {
            this.LIZIZ.getPigeonDepend().LIZIZ();
        }
        if (c869590Y9l.getMsgType() == 10000) {
            this.LIZIZ.getPigeonDepend().LIZIZ();
        }
    }
}
