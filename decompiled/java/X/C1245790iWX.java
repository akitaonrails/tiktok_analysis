package X;

import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: renamed from: X.0iWX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("story_reveal_friend_popup")
public final class C1245790iWX extends AbstractC20660015ss<DialogFragment> {
    public final Fragment LL;
    public final String LLILLJJLI = "homepage_friends";

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        return null;
    }

    public C1245790iWX(Fragment fragment) {
        this.LL = fragment;
    }

    public static void LJIIL(ImageView imageView) {
        String anywhereChannelPath;
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null && (anywhereChannelPath = iMainService.getAnywhereChannelPath("tiktok_social_friends_interaction_res")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anywhereChannelPath);
            sbLIZ.append("/story_reveal/story_reveal_friends1_promotion.png");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                try {
                    imageView.setImageURI(Uri.fromFile(c0vsj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012 A[PHI: r5
      0x0012: PHI (r5v1 X.19EG) = (r5v0 X.19EG), (r5v3 X.19EG) binds: [B:3:0x0004, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.poplayer.IPopupTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showPopup(X.C688120Qyw r11) {
        /*
            r10 = this;
            X.19EG r5 = r11.LIZIZ()
            if (r5 != 0) goto L12
            androidx.fragment.app.Fragment r0 = r10.LL
            r3 = 0
            if (r0 == 0) goto L11
            X.19EG r5 = r0.getActivity()
            if (r5 != 0) goto L12
        L11:
            return r3
        L12:
            androidx.fragment.app.FragmentManager r4 = r5.getSupportFragmentManager()
            X.0mKI r3 = new X.0mKI
            r3.<init>()
            kotlin.jvm.internal.AwS589S0100000_10 r1 = new kotlin.jvm.internal.AwS589S0100000_10
            r0 = 515(0x203, float:7.22E-43)
            r1.<init>(r10, r0)
            r3.LJ = r1
            r0 = -1
            r3.LJI = r0
            r0 = 2131849082(0x7f116f7a, float:1.9331688E38)
            java.lang.String r0 = r5.getString(r0)
            r3.LJII = r0
            r0 = 1
            r3.LIZ = r0
            r0 = 2131849081(0x7f116f79, float:1.9331686E38)
            java.lang.String r2 = r5.getString(r0)
            kotlin.jvm.internal.AwS633S0100000_19 r1 = new kotlin.jvm.internal.AwS633S0100000_19
            r0 = 267(0x10b, float:3.74E-43)
            r1.<init>(r5, r0)
            r3.LIZIZ(r2, r1)
            X.0HMp r0 = r3.LIZ()
            com.bytedance.tux.sheet.intro.TuxPanel r3 = r0.LIZ
            java.lang.String r0 = "StoryRevealFriendsIntroPanel"
            r3.show(r4, r0)
            java.lang.Class<com.ss.android.ugc.aweme.story.reveal.IStoryRevealService> r4 = com.ss.android.ugc.aweme.story.reveal.IStoryRevealService.class
            r5 = 0
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.story.reveal.IStoryRevealService r2 = (com.ss.android.ugc.aweme.story.reveal.IStoryRevealService) r2
            if (r2 == 0) goto L11
            java.lang.String r1 = r10.LLILLJJLI
            if (r1 != 0) goto L65
            java.lang.String r1 = ""
        L65:
            X.0i9Y r0 = X.EnumC1231540i9Y.FRIENDS_POPUP
            r2.LIZJ(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1245790iWX.showPopup(X.0Qyw):java.lang.Object");
    }
}
