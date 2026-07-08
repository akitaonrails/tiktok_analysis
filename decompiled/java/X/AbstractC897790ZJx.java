package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.common.model.IMSaasConversation;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostConversationApi;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC897790ZJx implements IDMAvatarLoader, InterfaceC418001ju {
    public final String LIZ;
    public final C0ZK0 LIZIZ;
    public final WeakReference<InterfaceC418001ju> LIZJ = new WeakReference<>(this);
    public volatile C897810ZJz LIZLLL;

    public abstract void LJFF(UrlModel urlModel, String str);

    public abstract void LJI(String str, UrlModel urlModel, C0ZKF c0zkf, int i, C897800ZJy c897800ZJy);

    public abstract void LJIIIZ(UrlModel urlModel, C0ZKF c0zkf, int i, C897800ZJy c897800ZJy);

    public final void LJIIJ() {
        C897810ZJz c897810ZJz = this.LIZLLL;
        if (c897810ZJz == null || c897810ZJz.LIZ) {
            return;
        }
        String str = c897810ZJz.LIZIZ;
        UrlModel urlModelLIZ = this.LIZIZ.LIZ(null, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reloadCurrentUserAvatar: uid=");
        sbLIZ.append(str);
        sbLIZ.append(", avatar_valid=");
        sbLIZ.append(urlModelLIZ != null ? Boolean.valueOf(C897770ZJv.LIZLLL(urlModelLIZ, true)) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C897770ZJv.LIZIZ();
        LJIIIIZZ(c897810ZJz, urlModelLIZ, 0);
    }

    @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader
    public final void LIZ() {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unbind: info=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", this=");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C897770ZJv.LIZIZ();
        C897810ZJz c897810ZJz = this.LIZLLL;
        if (c897810ZJz != null && (!c897810ZJz.LIZ) && (str = c897810ZJz.LIZIZ) != null) {
            this.LIZIZ.LIZJ(str, this.LIZJ);
        }
        this.LIZLLL = null;
    }

    public AbstractC897790ZJx(String str, C0ZK0 c0zk0) {
        this.LIZ = str;
        this.LIZIZ = c0zk0;
    }

    @Override // X.InterfaceC418001ju
    public final void LIZJ(UrlModel urlModel, String str) {
        C897810ZJz c897810ZJz = this.LIZLLL;
        if (c897810ZJz != null && !c897810ZJz.LIZ) {
            if (Intrinsics.LJFF(c897810ZJz.LIZIZ, str)) {
                if (c897810ZJz.LJII == 2 && Intrinsics.LJFF(c897810ZJz.LJFF, C897780ZJw.LIZIZ(urlModel, true))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onAvatarChanged: uid=");
                    sbLIZ.append(str);
                    sbLIZ.append(", valid=");
                    sbLIZ.append(C897770ZJv.LIZLLL(urlModel, false));
                    sbLIZ.append(", uri=");
                    sbLIZ.append(C897780ZJw.LIZIZ(urlModel, true));
                    C2188811AlT.LIZIZ(sbLIZ);
                    C897770ZJv.LIZIZ();
                    return;
                }
                LJIIIIZZ(c897810ZJz, urlModel, 9);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onAvatarChanged: uid=");
                sbLIZ2.append(str);
                sbLIZ2.append(", valid=");
                sbLIZ2.append(C897770ZJv.LIZLLL(urlModel, false));
                sbLIZ2.append(", uri=");
                sbLIZ2.append(C897780ZJw.LIZIZ(urlModel, true));
                C2188811AlT.LIZIZ(sbLIZ2);
                C897770ZJv.LIZIZ();
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onAvatarChanged: uid is not equals, ignore, bondUid=");
            sbLIZ3.append(c897810ZJz.LIZIZ);
            sbLIZ3.append(", uid=");
            sbLIZ3.append(str);
            C2188811AlT.LIZIZ(sbLIZ3);
            C897770ZJv.LIZ();
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onAvatarChanged: binding avatar is group, loadInfo=");
        sbLIZ4.append(c897810ZJz);
        C2188811AlT.LIZIZ(sbLIZ4);
        C897770ZJv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader
    public final void LJ(BaseContact baseContact, C0ZKF c0zkf) {
        IMSaasConversation iMSaasConversationLJIILLIIL;
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        if (contactFeatureLIZ != null && (iMSaasConversationLJIILLIIL = contactFeatureLIZ.LJIILLIIL(baseContact)) != null) {
            IMHostConversationApi.LIZ.getClass();
            IMHostConversationApi iMHostConversationApiLIZ = C1688306jJ.LIZ();
            if (iMHostConversationApiLIZ != null && iMHostConversationApiLIZ.LIZIZ(iMSaasConversationLJIILLIIL.getConversationType())) {
                IMHostConversationApi iMHostConversationApiLIZ2 = C1688306jJ.LIZ();
                if (iMHostConversationApiLIZ2 != null) {
                    LIZIZ(String.valueOf(iMHostConversationApiLIZ2.LIZJ(iMSaasConversationLJIILLIIL.getConversationId())), baseContact.getDisplayAvatar(), c0zkf);
                    return;
                }
                return;
            }
            IMHostConversationApi iMHostConversationApiLIZ3 = C1688306jJ.LIZ();
            if (iMHostConversationApiLIZ3 == null || !iMHostConversationApiLIZ3.LIZLLL(iMSaasConversationLJIILLIIL.getConversationType())) {
                return;
            }
            String conversationId = iMSaasConversationLJIILLIIL.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            LIZLLL(conversationId, null, baseContact.getDisplayAvatar(), c0zkf);
            return;
        }
        LIZIZ(baseContact.getUid(), baseContact.getDisplayAvatar(), c0zkf);
    }

    @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader
    public final void LIZIZ(String str, UrlModel urlModel, C0ZKF c0zkf) {
        boolean z;
        String str2;
        C897810ZJz c897810ZJz = this.LIZLLL;
        boolean z2 = false;
        if (c897810ZJz != null && C897770ZJv.LJ(str) && Intrinsics.LJFF(c897810ZJz.LIZIZ, str) && C123100dR.LIZ(c897810ZJz.LJFF) && c897810ZJz.LJII == 2) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if (z) {
            C1524205xw c1524205xw = C1524205xw.LIZ;
            C897810ZJz c897810ZJz2 = this.LIZLLL;
            if (c897810ZJz2 != null) {
                C1524205xw.LIZIZ(c1524205xw, true, c897810ZJz2.LIZIZ, c897810ZJz2.LIZLLL, 6, c897810ZJz2.LIZ, true, false);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bind: avatar is the same, skip, uid=");
            sbLIZ.append(str);
            sbLIZ.append(", uri=");
            C897810ZJz c897810ZJz3 = this.LIZLLL;
            if (c897810ZJz3 != null) {
                str3 = c897810ZJz3.LJFF;
            }
            sbLIZ.append(str3);
            C2188811AlT.LIZIZ(sbLIZ);
            C897770ZJv.LIZIZ();
            return;
        }
        if (str != null && C897770ZJv.LJ(str)) {
            C897810ZJz c897810ZJz4 = this.LIZLLL;
            if (c897810ZJz4 != null) {
                str2 = c897810ZJz4.LIZIZ;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bind: add observer, uid=");
                sbLIZ2.append(str);
                sbLIZ2.append(", this=");
                sbLIZ2.append(hashCode());
                C2188811AlT.LIZIZ(sbLIZ2);
                C897770ZJv.LIZIZ();
                this.LIZIZ.LIZIZ(str, this.LIZJ);
            } else if (!Intrinsics.LJFF(str2, str)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("bind: replace observer, uid=");
                sbLIZ3.append(str);
                sbLIZ3.append(", this=");
                sbLIZ3.append(hashCode());
                C2188811AlT.LIZIZ(sbLIZ3);
                C897770ZJv.LIZIZ();
                this.LIZIZ.LIZJ(str2, this.LIZJ);
                this.LIZIZ.LIZIZ(str, this.LIZJ);
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("bind: observer is same, uid=");
                sbLIZ4.append(str);
                sbLIZ4.append(", this=");
                sbLIZ4.append(hashCode());
                C2188811AlT.LIZIZ(sbLIZ4);
                C897770ZJv.LIZIZ();
            }
            C897810ZJz c897810ZJz5 = new C897810ZJz(false, str, c0zkf, this.LIZ, hashCode());
            this.LIZLLL = c897810ZJz5;
            UrlModel urlModelLIZ = this.LIZIZ.LIZ(urlModel, str);
            if (urlModelLIZ != null) {
                if (C897770ZJv.LIZLLL(urlModelLIZ, true)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("bind: avatar is valid, uid=");
                    sbLIZ5.append(str);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    C897770ZJv.LIZIZ();
                    LJIIIIZZ(c897810ZJz5, urlModelLIZ, 3);
                    return;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("bind: avatar is expired, uid=");
                sbLIZ6.append(str);
                C2188811AlT.LIZIZ(sbLIZ6);
                C897770ZJv.LIZIZ();
                LJIIIIZZ(c897810ZJz5, urlModelLIZ, 8);
                return;
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("bind: avatar is null, uid=");
            sbLIZ7.append(str);
            C2188811AlT.LIZIZ(sbLIZ7);
            C897770ZJv.LIZIZ();
            LJIIIIZZ(c897810ZJz5, null, 1);
            return;
        }
        if (urlModel != null && C897770ZJv.LIZLLL(urlModel, true)) {
            z2 = true;
        }
        LJIIIIZZ(new C897810ZJz(false, "", c0zkf, this.LIZ, hashCode()), urlModel, 7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("bind: uid is invalid, avatar_valid = ");
        sbLIZ8.append(z2);
        C2188811AlT.LIZIZ(sbLIZ8);
        C897770ZJv.LIZ();
    }

    public final void LJIIIIZZ(C897810ZJz c897810ZJz, UrlModel urlModel, int i) {
        String strLIZIZ;
        int i2;
        List<String> urlList;
        if (urlModel != null) {
            strLIZIZ = C897780ZJw.LIZIZ(urlModel, true);
        } else {
            strLIZIZ = null;
        }
        c897810ZJz.LJFF = strLIZIZ;
        c897810ZJz.LJII = 1;
        c897810ZJz.LJI = i;
        C0ZK1 c0zk1 = c897810ZJz.LIZJ.LJFF;
        if (c0zk1 != null) {
            c0zk1.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadUserAvatar: info=");
        sbLIZ.append(c897810ZJz);
        C2188811AlT.LIZIZ(sbLIZ);
        C897770ZJv.LIZIZ();
        C1212690hf9.LIZ.getClass();
        if (C1212690hf9.LJI) {
            i2 = 2130971789;
        } else {
            i2 = R.drawable.fhx;
        }
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
            LJIIIZ(urlModel, c897810ZJz.LIZJ, i2, new C897800ZJy(this, c897810ZJz));
        } else {
            LJIIIZ(null, c897810ZJz.LIZJ, i2, new C897800ZJy(this, c897810ZJz));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    @Override // com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r16, java.lang.String r17, com.ss.android.ugc.aweme.base.model.UrlModel r18, X.C0ZKF r19) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC897790ZJx.LIZLLL(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, X.0ZKF):void");
    }
}
