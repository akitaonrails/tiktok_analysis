package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;

/* JADX INFO: renamed from: X.0MMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567320MMw {
    public static void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaDownloadHelper->");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(final java.lang.String r13, com.ss.android.ugc.aweme.creative.model.CreativeInfo r14, com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r15) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567320MMw.LIZJ(java.lang.String, com.ss.android.ugc.aweme.creative.model.CreativeInfo, com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia):java.lang.String");
    }

    public final String LIZ(Context context, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MML c0mml) {
        if (c0mml.getUseCanVasNewStyle()) {
            String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.SHARE_T0_STORY, null, false, 12);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("profile-avatar-uid-");
            sbLIZ.append(forwardMedia.author.getUid());
            sbLIZ.append(".png");
            final String path = new C0VSJ(strLIZLLL, C2188811AlT.LIZIZ(sbLIZ)).getPath();
            UrlModel avatarURL = forwardMedia.author.getAvatarURL();
            if (avatarURL != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarURL));
                c1331670kl3LJIIIIZZ.LIZLLL("ShareStoryGenerateTask");
                c1331670kl3LJIIIIZZ.LJJIJL(context);
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.09nQ
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) throws Throwable {
                        if (bitmap != null) {
                            C2477909nN.LJI(bitmap, path, Bitmap.CompressFormat.PNG, 0, 4);
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        String message;
                        C567320MMw c567320MMw = this;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Avatar download failed: ");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ2.append(message);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c567320MMw.getClass();
                        C567320MMw.LIZIZ(strLIZIZ);
                    }
                });
            }
            return path;
        }
        return "";
    }
}
