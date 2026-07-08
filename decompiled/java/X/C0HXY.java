package X;

import Y.ACListenerS110S0200000_6;
import Y.ACListenerS71S0300000_4;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.SocialAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAISelfCompatibilityConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HXY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC20647615qs("sa_dm_stickers_sheet")
public final class C0HXY extends AbstractC20659615so<TuxSheet> {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C0HXZ LLILZ;
    public final int LLILZIL = 231;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(622));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1621));

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        C0HXZ c0hxz = this.LLILZ;
        if (c0hxz != null) {
            c0hxz.LIZLLL();
        }
        C0HWW c0hww = C0HWW.LIZ;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        c0hww.getClass();
        C0HWW.LJIIIZ("show", str, str2);
    }

    public final SocialAvatarAISelfCompatibilityConfig.AssetConfig LJIIL() {
        return (SocialAvatarAISelfCompatibilityConfig.AssetConfig) this.LLILZLL.getValue();
    }

    public final void LJIILIIL() {
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIIZ(2131827092);
        c1389890mGx.LJIIJJI();
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void onPopupDismiss() {
        C0HXZ c0hxz = this.LLILZ;
        if (c0hxz != null) {
            c0hxz.LIZJ();
        }
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        String str;
        String str2;
        C0HK0 c0hk0;
        UrlModel urlModel;
        List<String> urlList;
        String str3;
        UrlModel urlModel2;
        List<String> urlList2;
        String str4;
        UrlModel urlModel3;
        List<String> urlList3;
        String str5;
        String str6;
        C453740Hqm c453740HqmLIZLLL;
        View viewLJLLJ = C786410Ut5.LJLLJ(c688120Qyw.LIZ, R.layout.eip, null);
        C416810GVz c416810GVz = (C416810GVz) viewLJLLJ.findViewById(R.id.w7x);
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.e2g);
        C197039127h c197039127h = (C197039127h) viewLJLLJ.findViewById(R.id.dq7);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.flb);
        SmartImageView smartImageView = (SmartImageView) viewLJLLJ.findViewById(R.id.bok);
        if (C960203pA.LIZIZ(c688120Qyw.LIZ)) {
            str = LJIIL().popupBackgroundDarkUrl;
        } else {
            str = LJIIL().popupBackgroundLightUrl;
        }
        if (C960203pA.LIZIZ(c688120Qyw.LIZ)) {
            str2 = LJIIL().popupForegroundDarkUrl;
        } else {
            str2 = LJIIL().popupForegroundLightUrl;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
        if (iSocialAvatarDebugService != null) {
            iSocialAvatarDebugService.LIZIZ();
        }
        IMSocialAvatarStatus value = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLI(null, false).getValue();
        if ((value instanceof C0HK0) && (c0hk0 = (C0HK0) value) != null) {
            c0hk0.getStickerSetMetadata();
            List<StickerItem> stickers = c0hk0.getStickers();
            ArrayList arrayList = new ArrayList();
            for (StickerItem stickerItem : stickers) {
                SocialAvatarStickerItem socialAvatarStickerItem = stickerItem.socialAvatarInfo;
                if (socialAvatarStickerItem != null) {
                    str6 = socialAvatarStickerItem.expression;
                } else {
                    str6 = null;
                }
                if (C866950Xzh.LIZ(str6) && (c453740HqmLIZLLL = C453560HqU.LIZLLL(stickerItem)) != null) {
                    arrayList.add(c453740HqmLIZLLL);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = {LJIIL().stickerLeft, LJIIL().stickerRight, LJIIL().stickerBehind};
            int i = 0;
            do {
                String str7 = strArr[i];
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Set<String> set = ((C453740Hqm) next).LLILZIL;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it3 = set.iterator();
                        while (it3.hasNext()) {
                            if (a0.LJJIIZI((String) it3.next(), str7, false)) {
                                if (next != null) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                    }
                }
                i++;
            } while (i < 3);
            int size = 3 - arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next2 = it4.next();
                        if (!arrayList2.contains(next2)) {
                            if (next2 != null) {
                                arrayList2.add(next2);
                            }
                        }
                    }
                }
            }
            String str8 = ((C437560HDu) ((ISocialAvatarCreationStatusService) ServiceManager.get().getService(ISocialAvatarCreationStatusService.class)).LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).getValue()).LJIIIIZZ;
            if (str8 != null) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
                c416810GVz.getClass();
                if (arrayList2.size() >= 3 && (urlModel = ((C453740Hqm) ListProtector.get(arrayList2, 0)).LLILZ.midResolutionUrl) != null && (urlList = urlModel.getUrlList()) != null && (str3 = (String) ListProtector.get(urlList, 0)) != null && (urlModel2 = ((C453740Hqm) ListProtector.get(arrayList2, 1)).LLILZ.midResolutionUrl) != null && (urlList2 = urlModel2.getUrlList()) != null && (str4 = (String) ListProtector.get(urlList2, 0)) != null && (urlModel3 = ((C453740Hqm) ListProtector.get(arrayList2, 2)).LLILZ.midResolutionUrl) != null && (urlList3 = urlModel3.getUrlList()) != null && (str5 = (String) ListProtector.get(urlList3, 0)) != null) {
                    C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C433320Gyw(c416810GVz, str3, str4, str5, str2, str8, null), 2);
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
                c1390920mIc.LJIIIIZZ(1);
                c1390920mIc.LIZ.LLJLILLLLZIIL = false;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c688120Qyw.LIZ);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJI = numLIZJ;
                tuxSheet.LL = new C0IDU(this, 2);
                C786410Ut5.a9(tuxIconView, new ACListenerS110S0200000_6(tuxSheet, this, 66));
                C786410Ut5.U8(c197039127h, new ACListenerS110S0200000_6(tuxSheet, this, 67));
                C786410Ut5.h9(tuxTextView, new ACListenerS71S0300000_4(tuxSheet, this, c688120Qyw, 9));
                return tuxSheet;
            }
            return null;
        }
        return null;
    }

    public C0HXY(C19EG c19eg, String str, String str2, C0HXZ c0hxz) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c0hxz;
    }
}
