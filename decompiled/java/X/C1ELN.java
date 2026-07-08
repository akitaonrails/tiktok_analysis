package X;

import android.content.Context;
import kotlin.jvm.internal.AwS149S1200000_35;
import kotlin.jvm.internal.AwS184S1100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ELN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ELN extends AbstractC888820Yts {
    public static final void LIZJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        AbstractC888820Yts.LIZ(c2344009Gk, str);
        c2344009Gk.LJIIIIZZ("copy_type", "notification");
        c2344009Gk.LJIIIIZZ("button_type", str2);
        c2344009Gk.LIZJ(1, "system_status");
        c2344009Gk.LIZJ(0, "outer_status");
        c2344009Gk.LIZJ(0, "inner_status");
        C20684815ws.LJIILLIIL("ttsocial_message_request_push_guide_click", c2344009Gk.LIZ);
    }

    @Override // X.AbstractC888820Yts
    public final C888640Yta LIZIZ(Context context, String str) {
        String string;
        String string2;
        String string3;
        if (Intrinsics.LJFF(str, "chat_inline_msg")) {
            string = context.getString(2131837227);
        } else {
            string = context.getString(2131837219);
        }
        String string4 = null;
        if (Intrinsics.LJFF(str, "chat_inline_msg")) {
            string2 = context.getString(2131837226);
        } else {
            string2 = null;
        }
        if (Intrinsics.LJFF(str, "chat_inline_msg")) {
            string3 = context.getString(2131837229);
        } else {
            string3 = context.getString(2131837218);
        }
        if (Intrinsics.LJFF(str, "chat_inline_msg")) {
            string4 = context.getString(2131837228);
        }
        return new C888640Yta(string, string2, string3, string4, new AwS149S1200000_35(context, this, str, 2), new AwS184S1100000_35(this, str, 5), new AwS184S1100000_35(this, str, 6));
    }
}
