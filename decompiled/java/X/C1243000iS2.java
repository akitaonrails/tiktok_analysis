package X;

import Y.ACListenerS122S0200000_19;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.storyreveal.StoryRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: renamed from: X.0iS2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("story_reveal_inbox_popup")
public final class C1243000iS2 extends AbstractC20660115st<View> {
    public final Context LL;
    public final Fragment LLILLJJLI;
    public final String LLILLL;
    public volatile C20515215Pi LLILZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 4;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        Activity activity;
        int iLJFF;
        int iLIZJ;
        C20244914Jj c20244914JjLIZ;
        Context context;
        Fragment fragment = this.LLILLJJLI;
        if (fragment != null && ((activity = fragment.getActivity()) != null || ((context = this.LL) != null && (activity = C1388190mED.LIZ(context)) != null))) {
            AwS385S0200000_19 awS385S0200000_19 = new AwS385S0200000_19(this, activity, 79);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bitmap_story_reveal;
            c419910GdJ.LIZIZ = C1338790kwX.LIZ(38.0f);
            c419910GdJ.LIZJ = C1338790kwX.LIZ(38.0f);
            C20515215Pi c20515215Pi = new C20515215Pi(fragment);
            c20515215Pi.LJFF(c419910GdJ);
            c20515215Pi.LJII(2131849092);
            c20515215Pi.LIZ(2131849093);
            HomePageCommonService homePageCommonService = (HomePageCommonService) ServiceManager.get().getService(HomePageCommonService.class);
            if (homePageCommonService != null) {
                iLJFF = homePageCommonService.LJFF();
            } else {
                iLJFF = C14LC.LJIILIIL;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLJFF)));
            C20246014Ju c20246014JuLIZ = C14K4.LIZ(activity.getWindow().getDecorView());
            if ((c20246014JuLIZ == null || (c20244914JjLIZ = c20246014JuLIZ.LIZ(2)) == null || (iLIZJ = c20244914JjLIZ.LIZLLL) <= 0) && (iLIZJ = C14KI.LIZJ(activity)) <= 0) {
                iLIZJ = C14KI.LIZIZ(activity);
            }
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJIIIZ = iLIZIZ + iLIZJ;
            c1057450dcl.LJIILL = true;
            c1057450dcl.LJIIL = true;
            c1057450dcl.LIZJ = true;
            c1057450dcl.LIZIZ = 8000L;
            c1057450dcl.LJIILIIL = new ACListenerS122S0200000_19(awS385S0200000_19, c20515215Pi, 30);
            c1057450dcl.LJIIJJI = new ACListenerS122S0200000_19(awS385S0200000_19, c20515215Pi, 31);
            IStoryRevealService iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
            if (iStoryRevealService != null) {
                String str = this.LLILLL;
                if (str == null) {
                    str = "";
                }
                iStoryRevealService.LIZJ(str, EnumC1231540i9Y.INBOX_POPUP);
            }
            c20515215Pi.LJ();
            C20514915Pf c20514915Pf = c20515215Pi.LJ;
            if (c20514915Pf != null) {
                this.LLILZ = c20515215Pi;
                StoryRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1 storyRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1 = new StoryRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1(c20515215Pi);
                c20515215Pi.LIZ.LJIILJJIL = new AwS228S0300000_19(this, fragment, storyRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1, 22);
                fragment.getLifecycle().addObserver(storyRevealInboxFloatingNoticePopupTask$showPopup$3$pauseDismissObserver$1);
                return c20514915Pf;
            }
        }
        return null;
    }

    @Override // X.AbstractC20656215sG
    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || this.LLILZ == null) {
            return;
        }
        this.LLILZ = null;
    }

    public C1243000iS2(InterfaceC20660615sy interfaceC20660615sy, Context context, Fragment fragment) {
        super(interfaceC20660615sy);
        this.LL = context;
        this.LLILLJJLI = fragment;
        this.LLILLL = "notification_page";
    }
}
