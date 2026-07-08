package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461300I7c {
    public static final void LIZJ(C869590Y9l c869590Y9l) {
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("greeting_card_opened"), "1")) {
            return;
        }
        c869590Y9l.getLocalExt().put("greeting_card_opened", "1");
        C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "greeting_card_opened", new C0Y3R("1"), new C0Y3I("Greeting card message updated open status"));
    }

    public static final boolean LIZ(C869590Y9l c869590Y9l, boolean z) {
        if (z) {
            if (!Intrinsics.LJFF(c869590Y9l.getLocalExt().get("message_opened_animation_played"), "1")) {
                return true;
            }
            return false;
        }
        if (!Intrinsics.LJFF(c869590Y9l.getLocalExt().get("message_closed_animation_played"), "1")) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(C869590Y9l c869590Y9l, C0IBH c0ibh) {
        if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("greeting_card_opened"), "1")) {
            return true;
        }
        if (c0ibh == C0IBH.GREETING_CARD_STATUS_OPENED) {
            LIZJ(c869590Y9l);
            return true;
        }
        return false;
    }
}
