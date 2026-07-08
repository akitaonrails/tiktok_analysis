package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755010TjX extends C750630TcT {
    public final C753000TgI LLILZIL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 791);
    }

    public C755010TjX(C753000TgI c753000TgI) {
        super(c753000TgI);
        this.LLILZIL = c753000TgI;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    @Override // X.AbstractC752950TgD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(X.EnumC755280Tjy r5) {
        /*
            r4 = this;
            X.0TgI r1 = r4.LLILZIL
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r1.LIZLLL
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L11
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r0.mRoomAuthStatus
            if (r0 == 0) goto L11
            boolean r0 = r0.enableChat
            if (r0 != 0) goto L11
            return r2
        L11:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r1.LJIIIZ
            if (r1 == 0) goto L24
            java.lang.Class<X.0Tgk> r0 = X.C753280Tgk.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L24
            return r2
        L24:
            X.0TgI r0 = r4.LLILZIL
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LJIIIZ
            if (r1 == 0) goto L39
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L39
            boolean r0 = r0.forbiddenCopy
            if (r0 != r3) goto L39
            return r2
        L39:
            X.0TcQ r0 = r4.LLILZ
            X.0ffY r1 = r0.LJFF
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            if (r0 == 0) goto L9a
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            if (r0 == 0) goto L9a
            com.bytedance.android.livesdk.model.message.ChatMessage r1 = (com.bytedance.android.livesdk.model.message.ChatMessage) r1
            if (r1 == 0) goto L9a
            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteWithIndex> r0 = r1.f314emotes
            if (r0 == 0) goto L9a
            int r0 = r0.size()
            if (r0 <= 0) goto L9a
            X.0TcQ r0 = r4.LLILZ
            X.0ffY r1 = r0.LJFF
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            if (r0 == 0) goto L9a
            com.bytedance.android.livesdk.model.message.ChatMessage r1 = (com.bytedance.android.livesdk.model.message.ChatMessage) r1
            if (r1 == 0) goto L9a
            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteWithIndex> r0 = r1.f314emotes
            if (r0 == 0) goto L9a
            java.util.Iterator r2 = r0.iterator()
        L67:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.live.base.model.emoji.EmoteWithIndex r0 = (com.bytedance.android.live.base.model.emoji.EmoteWithIndex) r0
            com.bytedance.android.live.base.model.emoji.EmoteModel r0 = r0.emoteModel
            if (r0 == 0) goto L67
            int r0 = r0.emoteScene
            if (r0 != r3) goto L67
            if (r1 == 0) goto L9a
            r2 = 1
        L7f:
            X.0TgI r0 = r4.LLILZIL
            X.0f0o<?> r0 = r0.LJIIJ
            boolean r1 = r0 instanceof X.C1110490f0J
            X.0Tjy r0 = X.EnumC755280Tjy.ADMIN
            if (r5 == r0) goto L8d
            X.0Tjy r0 = X.EnumC755280Tjy.VIEWER
            if (r5 != r0) goto L9c
        L8d:
            X.0TcQ r0 = r4.LLILZ
            X.0ffY r0 = r0.LJFF
            boolean r0 = r0 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            if (r0 == 0) goto L9c
            if (r2 != 0) goto L9c
            if (r1 != 0) goto L9c
            return r3
        L9a:
            r2 = 0
            goto L7f
        L9c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C755010TjX.LJ(X.0Tjy):boolean");
    }
}
