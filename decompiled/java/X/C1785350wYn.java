package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785350wYn {
    public final InterfaceC875080YUo LIZ;
    public final InterfaceC1785610wZD LIZIZ;
    public final C1785440wYw LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1778060wN2 r13, X.InterfaceC1364105Vn<? super X.InterfaceC1778050wN1> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C1783590wVx
            if (r0 == 0) goto L54
            r11 = r14
            X.0wVx r11 = (X.C1783590wVx) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r11.LLILZ = r2
        L12:
            java.lang.Object r3 = r11.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r11.LLILZ
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto L66
            X.0wN2 r13 = r11.LL
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L2a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r0)
            if (r0 == 0) goto L5a
            X.0wMz r4 = new X.0wMz
            X.0XrX r3 = r13.LIZ
            long r1 = r13.LIZLLL
            int r0 = r13.LJ
            r4.<init>(r3, r1, r0)
            return r4
        L3c:
            X.C155000ia.LIZIZ(r3)
            X.0YUo r3 = r12.LIZ
            long r4 = r13.LIZIZ
            long r6 = r13.LIZJ
            long r8 = r13.LIZLLL
            int r10 = r13.LJ
            r11.LL = r13
            r11.LLILZ = r0
            java.lang.Object r0 = r3.LIZ(r4, r6, r8, r10, r11)
            if (r0 != r2) goto L2a
            return r2
        L54:
            X.0wVx r11 = new X.0wVx
            r11.<init>(r12, r14)
            goto L12
        L5a:
            X.0wN0 r4 = new X.0wN0
            X.0XrX r3 = r13.LIZ
            long r1 = r13.LIZLLL
            int r0 = r13.LJ
            r4.<init>(r3, r1, r0)
            return r4
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1785350wYn.LIZ(X.0wN2, X.05Vn):java.lang.Object");
    }

    public C1785350wYn(C0YUW c0yuw, C1094290eaB c1094290eaB, C1785440wYw c1785440wYw) {
        this.LIZ = c0yuw;
        this.LIZIZ = c1094290eaB;
        this.LIZJ = c1785440wYw;
    }

    public static C1785460wYy LIZLLL(C1785460wYy c1785460wYy, C861890XrX c861890XrX, Function1 function1) {
        C1785320wYk c1785320wYk = c1785460wYy.LJ;
        if (c1785320wYk == null || !Intrinsics.LJFF(c1785320wYk.LIZ, c861890XrX)) {
            return c1785460wYy;
        }
        C1785300wYi c1785300wYi = c1785320wYk.LIZLLL;
        return C1785460wYy.LIZ(c1785460wYy, null, null, null, null, C1785320wYk.LIZ(c1785320wYk, C1785300wYi.LIZ(c1785300wYi, (C1783880wWQ) function1.invoke(c1785300wYi.LIZIZ), null, null, 29)), null, 47);
    }

    public static C121400dA LIZJ(User user, long j, long j2, String str, String str2) {
        List urls;
        String str3 = str;
        long id = user.getId();
        String displayId = user.getDisplayId();
        String secUid = user.getSecUid();
        String nickName = user.getNickName();
        ImageModel avatarThumb = user.getAvatarThumb();
        if (avatarThumb == null || (urls = avatarThumb.getUrls()) == null) {
            urls = C13BV.INSTANCE;
        }
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = new GiftGalleryBadgeInfo();
        GiftGalleryBadgeSection giftGalleryBadgeSection = new GiftGalleryBadgeSection();
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText = new LinkMicGiftGalleryDisplayText();
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        linkMicGiftGalleryDisplayText.content = str3;
        if (str2 != null) {
            str4 = str2;
        }
        linkMicGiftGalleryDisplayText.color = str4;
        giftGalleryBadgeSection.displayText = linkMicGiftGalleryDisplayText;
        giftGalleryBadgeInfo.leagueInfo = giftGalleryBadgeSection;
        return new C121400dA(j, j2, id, displayId, secUid, nickName, urls, giftGalleryBadgeInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1781110wRx LIZIZ(X.C1785460wYy r35, int r36, long r37, long r39, long r41, com.bytedance.ies.sdk.datachannel.DataChannel r43, boolean r44, boolean r45, X.InterfaceC1631620sYq<? super java.lang.Long, ? super X.C1785370wYp, ? super X.C1783880wWQ, X.C1780260wQa> r46, boolean r47, boolean r48) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1785350wYn.LIZIZ(X.0wYy, int, long, long, long, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, boolean, X.0sYq, boolean, boolean):X.0wRx");
    }
}
