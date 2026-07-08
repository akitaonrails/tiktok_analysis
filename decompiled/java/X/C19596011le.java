package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;

/* JADX INFO: renamed from: X.11le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19596011le implements InterfaceC19578611iq {
    public final Context LL;
    public final C705930RmZ LLILLJJLI;
    public final Aweme LLILLL;
    public final C19EG LLILZ;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (X.C2188811AlT.LIZIZ(r2) != null) goto L13;
     */
    @Override // X.InterfaceC19578611iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onClick(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r12, android.graphics.PointF r13) {
        /*
            r11 = this;
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onClick type="
            r2.append(r0)
            int r0 = r12.getType()
            r2.append(r0)
            java.lang.String r0 = " point="
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = " awemeId="
            r2.append(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.LLILLL
            java.lang.String r0 = r0.getAid()
            r2.append(r0)
            java.lang.String r0 = " hasVideoShareInfo="
            r2.append(r0)
            com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct r0 = r12.getVideoShareInfoStruct()
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L68
            r0 = 1
        L34:
            r2.append(r0)
            X.C2188811AlT.LIZIZ(r2)
            android.content.Context r0 = r11.LL
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.LLILLL
            boolean r0 = X.C0OAD.LIZIZ(r0)
            if (r0 != 0) goto L67
            com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct r0 = r12.getVideoShareInfoStruct()
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "videoShareInfoStruct is null on type="
            r2.append(r0)
            int r0 = r12.getType()
            r2.append(r0)
            java.lang.String r0 = " — sticker metadata may be malformed"
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            if (r0 == 0) goto L6a
        L67:
            return r8
        L68:
            r0 = 0
            goto L34
        L6a:
            com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct r7 = r12.getVideoShareInfoStruct()
            X.00zU r10 = new X.00zU
            r10.<init>()
            X.11jU r9 = X.C19582611jU.LIZ
            X.19EG r6 = r11.LLILZ
            X.11jV r5 = new X.11jV
            int r4 = r12.getType()
            X.11lg r3 = new X.11lg
            r3.<init>()
            kotlin.jvm.internal.AwS608S0100000_29 r2 = new kotlin.jvm.internal.AwS608S0100000_29
            r0 = 585(0x249, float:8.2E-43)
            r2.<init>(r10, r0)
            r5.<init>(r4, r13, r3, r2)
            r0 = 138(0x8a, float:1.93E-43)
            kotlin.jvm.internal.AFwS273S0000000_29 r0 = kotlin.jvm.internal.AFwS273S0000000_29.get$arr$(r0)
            r9.getClass()
            X.C19582611jU.LJFF(r6, r5, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.LLILLL
            X.1BzW r0 = X.C2203211BKt.LIZ(r0)
            if (r0 == 0) goto La1
            r8 = 1
        La1:
            java.lang.String r0 = "show"
            r11.LIZ(r0, r7, r8)
            X.0RmZ r0 = r11.LLILLJJLI
            if (r0 == 0) goto Lb4
            X.11lV r0 = r0.LJIILIIL
            if (r0 == 0) goto Lb4
            r12.getType()
            r0.LIZIZ(r1)
        Lb4:
            java.lang.Class<com.ss.android.ugc.aweme.video.IPlayerManagerService> r2 = com.ss.android.ugc.aweme.video.IPlayerManagerService.class
            r3 = 0
            r6 = 14
            r7 = 0
            r4 = r3
            r5 = r3
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.video.IPlayerManagerService r0 = (com.ss.android.ugc.aweme.video.IPlayerManagerService) r0
            if (r0 == 0) goto Lc7
            r0.LIZ()
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19596011le.onClick(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, android.graphics.PointF):boolean");
    }

    public final void LIZ(String str, VideoShareInfoStruct videoShareInfoStruct, boolean z) {
        String str2;
        C0R60 c0r60;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("creator_id", videoShareInfoStruct.authorId);
        c2344009Gk.LJIIIIZZ("original_group_id", videoShareInfoStruct.awemeId);
        C705930RmZ c705930RmZ = this.LLILLJJLI;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r60.LIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(this.LLILLL));
        c2344009Gk.LJIIIIZZ("group_id", this.LLILLL.getAid());
        c2344009Gk.LJIIIIZZ("story_collection_id", C729510SjV.LJII(this.LLILLL));
        c2344009Gk.LIZJ(z ? 1 : 0, "is_share_public_comment_to_story");
        C20684815ws.LJIILLIIL("view_original_post", c2344009Gk.LIZ);
    }

    public C19596011le(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg) {
        this.LL = context;
        this.LLILLJJLI = c705930RmZ;
        this.LLILLL = aweme;
        this.LLILZ = c19eg;
    }
}
