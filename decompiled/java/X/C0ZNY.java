package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.GroupCameraEntranceExp;
import com.ss.android.ugc.aweme.exp.IMGroupCameraExp;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZNY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNY {
    public static final C0ZNY LIZ = new C0ZNY();

    public static final boolean LIZJ() {
        return IMGroupCameraExp.INSTANCE.enable() && C1865360ydq.LIZ() && GroupCameraEntranceExp.INSTANCE.enable();
    }

    public static final boolean LIZ(String str) {
        return C0ZFW.LIZ.LJIIIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str));
    }

    public static C2272701DxU LJ(String str) {
        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
        if (c0y8tLJIL != null) {
            try {
                ByteString bizExt = c0y8tLJIL.getBizExt();
                if (bizExt != null) {
                    return C2272701DxU.ADAPTER.decode(bizExt);
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static final boolean LJFF(String str) {
        C0IBF c0ibf;
        C2272701DxU c2272701DxULJ = LJ(str);
        if (c2272701DxULJ != null) {
            c0ibf = c2272701DxULJ.camera_message_display_status;
        } else {
            c0ibf = null;
        }
        if (c0ibf == C0IBF.FEATURE_STATUS_HIDE) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(X.C869590Y9l r6) {
        /*
            r5 = this;
            int r1 = r6.getMsgType()
            r4 = 0
            r0 = 1802(0x70a, float:2.525E-42)
            r3 = 0
            if (r1 != r0) goto L62
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r6, r0)
            com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate) r0
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent r0 = r0.fallbackInfo
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.image
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r1 = r0.iconType
        L1e:
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r0 = com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent.MODERATION
            if (r1 != r0) goto L62
            r2 = 1
        L23:
            int r1 = r6.getMsgType()
            r0 = 1803(0x70b, float:2.527E-42)
            if (r1 != r0) goto L5e
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r6, r0)
            com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate) r0
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent r0 = r0.fallbackInfo
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.image
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r3 = r0.iconType
        L3f:
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r0 = com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent.MODERATION
            if (r3 != r0) goto L5e
            r0 = 1
        L44:
            if (r2 != 0) goto L5c
            if (r0 != 0) goto L5c
            java.lang.String r0 = r6.getConversationId()
            boolean r0 = LJFF(r0)
            if (r0 != 0) goto L5c
            java.lang.String r0 = r6.getConversationId()
            boolean r0 = X.C1229100i5c.LJIIIZ(r0)
            if (r0 == 0) goto L5d
        L5c:
            r4 = 1
        L5d:
            return r4
        L5e:
            r0 = 0
            goto L44
        L60:
            r1 = r3
            goto L1e
        L62:
            r2 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZNY.LJI(X.0Y9l):boolean");
    }

    public static final boolean LIZIZ(String str, boolean z) {
        C0IBF c0ibf;
        if (!IMGroupCameraExp.INSTANCE.enable() || !C1865360ydq.LIZ() || !C1727806pg.LIZ.LIZ("group_chat_camera_entrance", str, C461720I8s.LIZIZ(), false)) {
            return false;
        }
        C2272701DxU c2272701DxULJ = LJ(str);
        if (c2272701DxULJ == null || (c0ibf = c2272701DxULJ.camera_status) == null || !c0ibf.isEnable()) {
            if (!z) {
                return false;
            }
            C0ZFW.LIZ.getClass();
            C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(str);
            if (c0y8tLJIL == null || !c0y8tLJIL.isTemp() || !c0y8tLJIL.isGroupChat()) {
                return false;
            }
        }
        if (!C0ZFW.LIZ.LJIIJJI(str)) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL(String str, boolean z) {
        if (GroupCameraEntranceExp.INSTANCE.enable() && LIZIZ(str, z)) {
            return true;
        }
        return false;
    }
}
