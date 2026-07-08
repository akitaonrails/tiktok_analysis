package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0SkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730150SkX {
    public static final boolean LIZ(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 109) {
                    if (interactStickerStruct != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 108) {
                    if (interactStickerStruct != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (aweme != null) {
            if (AwemeExtKt.isProhibited(aweme) || AwemeExtKt.shouldShowReviewStatus(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.C1387050mCN r11, android.content.Context r12, com.ss.android.ugc.aweme.story.model.StoryInteraction r13, kotlin.jvm.internal.AwS255S0300000_11 r14) {
        /*
            r10 = 1
            r11.LIZLLL = r10
            if (r14 == 0) goto L62
            X.0SY7 r7 = X.C0SY7.FOLLOW_MUTUAL
            com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy r0 = X.C1336205Ku.LIZJ()
            boolean r0 = r0.LIZJ()
            r9 = 0
            if (r0 == 0) goto L2d
            X.0zm3 r6 = new X.0zm3
            r0 = 2131832369(0x7f112e31, float:1.929779E38)
            java.lang.String r0 = r12.getString(r0)
            r6.<init>(r0, r9)
        L1e:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r6)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r0)
            java.util.Map<X.0SY7, X.0zm3> r0 = r11.LJII
            r0.putAll(r1)
            return
        L2d:
            X.0zm3 r6 = new X.0zm3
            r0 = 2131849112(0x7f116f98, float:1.9331749E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131837236(0x7f114134, float:1.9307661E38)
            java.lang.String r8 = r12.getString(r0)
            r3 = 0
            if (r13 == 0) goto L56
            long r1 = r13.flipCount
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L49
            r10 = 0
        L49:
            if (r13 == 0) goto L4f
            X.0Y9l r9 = r13.msg
            int r1 = r13.type
        L4f:
            if (r10 != 0) goto L56
            if (r9 == 0) goto L56
            r0 = 3
            if (r1 != r0) goto L57
        L56:
            r5 = r8
        L57:
            kotlin.jvm.internal.AwS555S0100000_11 r1 = new kotlin.jvm.internal.AwS555S0100000_11
            r0 = 1667(0x683, float:2.336E-42)
            r1.<init>(r14, r0)
            r6.<init>(r5, r1)
            goto L1e
        L62:
            r11.LIZJ = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C730150SkX.LIZLLL(X.0mCN, android.content.Context, com.ss.android.ugc.aweme.story.model.StoryInteraction, kotlin.jvm.internal.AwS255S0300000_11):void");
    }
}
