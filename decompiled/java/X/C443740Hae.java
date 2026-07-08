package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Hae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443740Hae extends C443910Hav {
    public final boolean LIZIZ;

    public C443740Hae() {
        this(false);
    }

    @Override // X.InterfaceC444050Hb9
    public final int LIZJ() {
        return 10;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final int LIZLLL() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C443740Hae) && this.LIZIZ == ((C443740Hae) obj).LIZIZ;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final String getName() {
        return "Ai-moji";
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiMojiStickerType(showRedDot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[RETURN] */
    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getIconUrl() {
        /*
            r4 = this;
            X.0HsE r3 = com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi.LIZ
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r3.LIZIZ()
            com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService r1 = r0.getImSocialAvatarService()
            r0 = 0
            X.0HWb r2 = r1.LJIILJJIL(r0, r0)
            java.lang.String r1 = ""
            if (r2 != 0) goto L14
            return r1
        L14:
            boolean r0 = r2 instanceof X.C442300HWa
            if (r0 != 0) goto L5c
            boolean r0 = r2 instanceof X.C0HWX
            if (r0 == 0) goto L39
            X.0HWX r2 = (X.C0HWX) r2
            com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData r0 = r2.LIZ
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct r0 = r0.icon
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.midResolutionUrl
            if (r0 == 0) goto L5c
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.String r0 = (java.lang.String) r0
        L36:
            if (r0 == 0) goto L5c
            return r0
        L39:
            boolean r0 = r2 instanceof X.C0HWY
            if (r0 == 0) goto L56
            X.0HWY r2 = (X.C0HWY) r2
            com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData r0 = r2.LIZ
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct r0 = r0.icon
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.midResolutionUrl
            if (r0 == 0) goto L5c
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L36
        L56:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L5c:
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r3.LIZIZ()
            X.0Hvw r0 = r0.getImAvatarDuoService()
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r3.LIZIZ()
            com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService r0 = r0.getImSocialAvatarService()
            com.ss.android.ugc.aweme.im.sticker.api.socialavatar.SocialAvatarSettingsConfig r0 = r0.LJJJ()
            java.lang.String r1 = r0.LIZ()
            return r1
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C443740Hae.getIconUrl():java.lang.String");
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final List<C451030HmP> LIZ() {
        return C13BV.INSTANCE;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final boolean LJIIJ() {
        return this.LIZIZ;
    }

    public C443740Hae(boolean z) {
        this.LIZIZ = z;
    }

    @Override // X.C443910Hav, X.InterfaceC444050Hb9
    public final Drawable LJFF(Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_aimoji_placeholder;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        return c419910GdJ.LIZ(context);
    }
}
