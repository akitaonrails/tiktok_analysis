package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import java.util.List;
import webcast.api.sub.UserEmotesUploadRequest;

/* JADX INFO: renamed from: X.0JVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JVZ implements C0JVN {
    @Override // X.C0JVN
    public final C11O8 LJII(String str) {
        C480460Ism.LIZ().getClass();
        return ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getUserEmote(str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    @Override // X.C0JVN
    public final C11O8 M(String str, List list) {
        UserEmotesUploadRequest userEmotesUploadRequest = new UserEmotesUploadRequest();
        userEmotesUploadRequest.secAnchorId = str;
        userEmotesUploadRequest.uploadEmoteList = list;
        C480460Ism.LIZ().getClass();
        return ((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).uploadUserEmote(userEmotesUploadRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    @Override // X.C0JVN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(android.content.Context r9, X.C492890JUp r10, com.bytedance.android.livesdkapi.host.IHostSubscription.Params r11, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.api.UserEmote> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C493000JVa
            if (r0 == 0) goto L7c
            r3 = r12
            X.0JVa r3 = (X.C493000JVa) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r2 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L37
            if (r0 == r6) goto L64
            if (r0 != r7) goto L82
            X.C155000ia.LIZIZ(r2)
        L25:
            java.lang.String r2 = (java.lang.String) r2
        L27:
            com.bytedance.android.livesdk.chatroom.api.UserEmote r1 = new com.bytedance.android.livesdk.chatroom.api.UserEmote
            r1.<init>()
            com.bytedance.android.live.base.model.ImageModel r0 = new com.bytedance.android.live.base.model.ImageModel
            r0.<init>()
            r0.setUri(r2)
            r1.image = r0
            return r1
        L37:
            X.C155000ia.LIZIZ(r2)
            int r0 = r10.LLILZIL
            r5 = 0
            if (r0 == 0) goto L8a
            android.graphics.Bitmap r2 = r10.LLILLJJLI
            if (r2 != 0) goto L4e
            com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel r0 = r10.LLILLL
            if (r0 == 0) goto L4d
            com.bytedance.android.livesdkapi.host.IHostSubscription$Result$PhotoFile r0 = X.C20188213yy.LIZ(r9, r0, r11)
            android.graphics.Bitmap r5 = r0.bitmap
        L4d:
            r2 = r5
        L4e:
            int r0 = r10.LLILZIL
            if (r0 != r6) goto L6a
            X.0K8F r0 = X.C0K8F.LIZ
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP
            r3.LLILLL = r6
            r0.getClass()
            r0 = 50
            java.lang.Object r2 = X.C0K8F.LJIIIZ(r2, r0, r1, r3)
            if (r2 != r4) goto L67
            return r4
        L64:
            X.C155000ia.LIZIZ(r2)
        L67:
            java.lang.String r2 = (java.lang.String) r2
            goto L27
        L6a:
            X.0K8F r0 = X.C0K8F.LIZ
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP
            r3.LLILLL = r7
            r0.getClass()
            r0 = 100
            java.lang.Object r2 = X.C0K8F.LJIIIZ(r2, r0, r1, r3)
            if (r2 != r4) goto L25
            return r4
        L7c:
            X.0JVa r3 = new X.0JVa
            r3.<init>(r8, r12)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8a:
            com.bytedance.android.livesdk.chatroom.api.UserEmote r3 = new com.bytedance.android.livesdk.chatroom.api.UserEmote
            r3.<init>()
            com.bytedance.android.live.base.model.ImageModel r1 = new com.bytedance.android.live.base.model.ImageModel
            r1.<init>()
            com.bytedance.android.livesdk.chatroom.api.UserEmote r0 = r10.LL
            com.bytedance.android.live.base.model.ImageModel r0 = r0.image
            if (r0 == 0) goto L9e
            java.lang.String r5 = r0.getUri()
        L9e:
            r1.setUri(r5)
            r3.image = r1
            com.bytedance.android.livesdk.chatroom.api.UserEmote r2 = r10.LL
            long r0 = r2.emoteId
            r3.emoteId = r0
            java.lang.String r0 = r2.emoteIdStr
            r3.emoteIdStr = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JVZ.Y(android.content.Context, X.0JUp, com.bytedance.android.livesdkapi.host.IHostSubscription$Params, X.05Vn):java.lang.Object");
    }
}
