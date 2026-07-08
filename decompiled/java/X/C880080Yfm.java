package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880080Yfm {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && c869590Y9l.getMsgType() == 1809 && Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.SHARE_VIDEO_INLINE.getScene())) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        String str;
        if (c869590Y9l != null) {
            str = c869590Y9l.getExt().get("a:group_important_type");
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, EnumC880090Yfn.MENTION.getValue())) {
            if (c869590Y9l != null) {
                if (c869590Y9l.isMention(C461720I8s.LIZJ()) || c869590Y9l.isRecalled()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (Intrinsics.LJFF(str, EnumC880090Yfn.SEND_BY_OWNER.getValue())) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        if (LIZIZ(c869590Y9l) && !c869590Y9l.isRecalled() && !c869590Y9l.isDeleted()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(C869590Y9l c869590Y9l) {
        String conversationId;
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        if (c869590Y9l != null) {
            conversationId = c869590Y9l.getConversationId();
        } else {
            conversationId = null;
        }
        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(conversationId);
        if (c869590Y9l != null && C0ZDX.LJJIJIIJIL(c869590Y9l) && !C0ZFW.LIZ.LJIIIZ(c0y8tLIZ)) {
            return true;
        }
        return false;
    }
}
