package X;

import Y.ACListenerS110S0200000_6;
import Y.ACListenerS112S0200000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarStoryPostStickerSettings;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC20647615qs("social_avatar_anchor_sheet")
public final class C455410HtT extends AbstractC20659615so<TuxSheet> {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final List<String> LLILZIL;
    public final int LLILZLL = 1;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(625));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1629));

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
    }

    public final void LJIIL() {
        ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarService.class, false, false, false, 14, null);
        if (iSocialAvatarService != null) {
            iSocialAvatarService.LJIILLIIL(new C0HHA(this.LL, "click_social_avatar_anchor", "post_social_avatar_anchor_page", null, null, 0, false, false, null, false, null, 4088), null, null);
            C0HWW c0hww = C0HWW.LIZ;
            String str = (String) this.LLIZLLLIL.getValue();
            c0hww.getClass();
            C0HWW.LJIIJJI("click_edit_my_avatar", str);
        }
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        return new C688120Qyw(this.LL, this.LLILLJJLI, null);
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void onPopupDismiss() {
        C1440005kM.LIZ(new C453940Hr6(false, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        int i;
        int i2;
        List<String> listSingletonList = null;
        View viewLJLLJ = C786410Ut5.LJLLJ(c688120Qyw.LIZ, R.layout.f_8, null);
        SmartImageView smartImageView = (SmartImageView) viewLJLLJ.findViewById(R.id.kfa);
        TextView textView = (TextView) viewLJLLJ.findViewById(R.id.y3j);
        boolean z = false;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c688120Qyw.LIZ);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        List<String> list = this.LLILZIL;
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) this.LLIZ.getValue();
        if (iSocialAvatarStoryPostService != null) {
            Iterator<String> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SocialAvatarStickerStruct socialAvatarStickerStructLIZIZ = iSocialAvatarStoryPostService.LIZIZ(it2.next());
                if (socialAvatarStickerStructLIZIZ != null) {
                    listSingletonList = socialAvatarStickerStructLIZIZ.getMidResolutionUrl();
                    if (listSingletonList == null || listSingletonList.isEmpty()) {
                        break;
                    }
                }
            }
            z = true;
        } else {
            z = true;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(232));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
                C786410Ut5.W5(smartImageView, layoutParams);
                listSingletonList = Collections.singletonList(SocialAvatarStoryPostStickerSettings.LIZ().anchorDefaultImage);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
                C786410Ut5.W5(smartImageView, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(listSingletonList));
        c1331670kl3LJIIJ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIJ);
        Context context = this.LL;
        if (this.LLILLL) {
            i = 2131827002;
        } else if (this.LLILZ) {
            i = 2131827008;
        } else {
            i = 2131827005;
        }
        textView.setText(context.getString(i));
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.e2g);
        C197039127h c197039127h = (C197039127h) viewLJLLJ.findViewById(R.id.ru1);
        C197039127h c197039127h2 = (C197039127h) viewLJLLJ.findViewById(R.id.ui3);
        if (this.LLILLL) {
            c197039127h.setText(this.LL.getString(2131827003));
            C786410Ut5.U8(c197039127h, new ACListenerS110S0200000_6(viewLJLLJ, this, 69));
            if (c197039127h2 != null) {
                C786410Ut5.LLLLLLJ(c197039127h2, 8);
            }
        } else {
            Context context2 = this.LL;
            if (this.LLILZ) {
                i2 = 2131827007;
            } else {
                i2 = 2131827004;
            }
            c197039127h.setText(context2.getString(i2));
            C786410Ut5.U8(c197039127h, new ACListenerS112S0200000_8(viewLJLLJ, this, 27));
            c197039127h2.setText(this.LL.getString(2131827006));
            C786410Ut5.U8(c197039127h2, new ACListenerS110S0200000_6(viewLJLLJ, this, 70));
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS110S0200000_6(viewLJLLJ, this, 71));
        return tuxSheet;
    }

    public C455410HtT(C19EG c19eg, LifecycleOwner lifecycleOwner, boolean z, boolean z2, List list) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = list;
    }
}
