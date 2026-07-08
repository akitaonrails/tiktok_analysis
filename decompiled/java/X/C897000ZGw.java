package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897000ZGw {
    public static final EnumC2172611A1b LIZ(String str) {
        if (!Intrinsics.LJFF(str, "chat_video_detail") && !Intrinsics.LJFF(str, "link_auto_message")) {
            EnumC2172611A1b.Companion.getClass();
            return C0S2S.LIZ(str);
        }
        return EnumC2172611A1b.CHAT;
    }
}
