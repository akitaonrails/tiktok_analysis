package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609650rzP {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZLLL(Object obj) {
        UrlModel urlModelLIZJ;
        List<String> urlList;
        UrlModel urlModel;
        String str = null;
        if (obj instanceof User) {
            AvatarSizeUrlStruct dynamicSocialAvatar = ((User) obj).getDynamicSocialAvatar();
            if (dynamicSocialAvatar != null && (urlModel = dynamicSocialAvatar.avatarLarger) != null) {
                urlModelLIZJ = C1609680rzS.LIZJ(urlModel);
            } else {
                urlModelLIZJ = null;
            }
            Pair pair = new Pair(urlModelLIZJ, EnumC1609700rzU.SOCIAL_DYNAMIC_AVATAR);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get user socialVideoImageUrl: ");
            UrlModel urlModel2 = (UrlModel) pair.getFirst();
            if (urlModel2 != null && (urlList = urlModel2.getUrlList()) != null) {
                str = (String) C13LP.LJJJLL(urlList);
            }
            sbLIZ.append(str);
            sbLIZ.append(", type: ");
            sbLIZ.append(pair.getSecond());
            C2188811AlT.LIZIZ(sbLIZ);
            return pair;
        }
        if (obj instanceof List) {
            List<String> listLJFF = LJFF((List) obj);
            UrlModel urlModel3 = new UrlModel();
            urlModel3.setUrlList(listLJFF);
            Pair pair2 = new Pair(urlModel3, EnumC1609700rzU.SOCIAL_DYNAMIC_AVATAR);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get socialVideoImageUrl list: ");
            List<String> urlList2 = ((UrlModel) pair2.getFirst()).getUrlList();
            if (urlList2 != null) {
                str = (String) C13LP.LJJJLL(urlList2);
            }
            sbLIZ2.append(str);
            sbLIZ2.append(", type: ");
            sbLIZ2.append(pair2.getSecond());
            C2188811AlT.LIZIZ(sbLIZ2);
            return pair2;
        }
        return C1609670rzR.LIZ;
    }

    public static int LJ(int i) {
        if (i >= 96) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }

    public static List LJFF(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void LIZJ(AvatarComponentView avatarComponentView, C419460Gca c419460Gca, Object obj, Function1 function1) {
        Pair pairLIZLLL = LIZLLL(obj);
        UrlModel urlModel = (UrlModel) pairLIZLLL.getFirst();
        EnumC1609700rzU enumC1609700rzU = (EnumC1609700rzU) pairLIZLLL.getSecond();
        if (urlModel == null) {
            function1.invoke(new C1609770rzb(false, null, null, null, 53));
            return;
        }
        C03IT c03it = new C03IT(urlModel.getUrlList());
        C1609400rz0 c1609400rz0 = avatarComponentView.getConfig().LIZ;
        System.currentTimeMillis();
        LIZIZ(avatarComponentView, c419460Gca, c03it, new C1609770rzb(false, enumC1609700rzU, urlModel, null, 51), new AwS390S0200000_24(function1, (Function1<? super C1609770rzb, Unit>) c1609400rz0, (C1609400rz0) 69));
    }

    public static void LIZIZ(AvatarComponentView avatarComponentView, SmartImageView smartImageView, C03IT c03it, C1609770rzb c1609770rzb, Function1 function1) {
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03it);
        int width = smartImageView.getWidth();
        int height = smartImageView.getHeight();
        c1331670kl3LJIIJ.LJIIJJI = width;
        c1331670kl3LJIIJ.LJIIL = height;
        c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIJ.LIZLLL = false;
        c1331670kl3LJIIJ.LIZLLL("SocialAvatarImageBind");
        c1331670kl3LJIIJ.LJJ(smartImageView);
        c1331670kl3LJIIJ.LJIIJ(new C1609690rzT(null, c1609770rzb, function1, avatarComponentView));
    }

    public static Object LIZ(C1609760rza c1609760rza, C1609730rzX c1609730rzX, AvatarComponentView avatarComponentView, C419460Gca c419460Gca, Object obj, Boolean bool, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair;
        String str;
        User user;
        UrlModel urlModelLIZJ;
        String str2;
        List<String> urlList;
        UrlModel urlModel;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1609400rz0 c1609400rz0 = avatarComponentView.getConfig().LIZ;
        boolean z2 = obj instanceof User;
        String uid = null;
        if (z2) {
            AvatarSizeUrlStruct socialAvatarWithoutBackground = ((User) obj).getSocialAvatarWithoutBackground();
            if (socialAvatarWithoutBackground != null && (urlModel = socialAvatarWithoutBackground.avatarLarger) != null) {
                urlModelLIZJ = C1609680rzS.LIZJ(urlModel);
            } else {
                urlModelLIZJ = null;
            }
            pair = new Pair(urlModelLIZJ, EnumC1609700rzU.SOCIAL_AVATAR);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get user SocialImageUrl list: ");
            UrlModel urlModel2 = (UrlModel) pair.getFirst();
            if (urlModel2 != null && (urlList = urlModel2.getUrlList()) != null) {
                str2 = (String) C13LP.LJJJLL(urlList);
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", type: ");
            sbLIZ.append(pair.getSecond());
            C2188811AlT.LIZIZ(sbLIZ);
        } else if (obj instanceof List) {
            List<String> listLJFF = LJFF((List) obj);
            UrlModel urlModel3 = new UrlModel();
            urlModel3.setUrlList(listLJFF);
            pair = new Pair(urlModel3, EnumC1609700rzU.SOCIAL_AVATAR);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get SocialImageUrl list: ");
            List<String> urlList2 = ((UrlModel) pair.getFirst()).getUrlList();
            if (urlList2 != null) {
                str = (String) C13LP.LJJJLL(urlList2);
            } else {
                str = null;
            }
            sbLIZ2.append(str);
            sbLIZ2.append(", type: ");
            sbLIZ2.append(pair.getSecond());
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            pair = C1609670rzR.LIZ;
        }
        UrlModel urlModel4 = (UrlModel) pair.getFirst();
        EnumC1609700rzU enumC1609700rzU = (EnumC1609700rzU) pair.getSecond();
        if (urlModel4 == null) {
            C1609770rzb c1609770rzb = new C1609770rzb(false, null, null, null, 53);
            C189200o6.m2constructorimpl(c1609770rzb);
            c2252611DEt.resumeWith(c1609770rzb);
        } else {
            if (z2 && (user = (User) obj) != null) {
                uid = user.getUid();
            }
            if (Intrinsics.LJFF(bool, false) && C1609660rzQ.LIZJ(c1609760rza, c1609730rzX, urlModel4, enumC1609700rzU, z)) {
                C1609770rzb c1609770rzb2 = new C1609770rzb(true, enumC1609700rzU, urlModel4, uid, 33);
                C189200o6.m2constructorimpl(c1609770rzb2);
                c2252611DEt.resumeWith(c1609770rzb2);
            } else {
                C03IT c03it = new C03IT(urlModel4.getUrlList());
                if (c1609730rzX != null) {
                    c1609730rzX.LIZ = urlModel4;
                    c1609730rzX.LIZIZ = enumC1609700rzU;
                    c1609730rzX.LIZJ = uid;
                }
                LIZIZ(avatarComponentView, c419460Gca, c03it, new C1609770rzb(false, enumC1609700rzU, urlModel4, uid, 35), new AwS233S0300000_24(c2252611DEt, c1609730rzX, c1609400rz0, 10));
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
