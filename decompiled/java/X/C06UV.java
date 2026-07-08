package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.feed.MyProfileStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.aweme.story.highlights.widget.StoryHighlightsCoverView;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.06UV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06UV implements InterfaceC2262521Dh4 {
    public final C1674830tgX LIZ;
    public final StoryHighlightsMyProfileVM LIZIZ;
    public final MyProfileStoryHighlightsFeedSharedVM LIZJ;
    public final FragmentManager LIZLLL;
    public final Context LJ;
    public final Fragment LJFF;

    @Override // X.InterfaceC2262521Dh4
    public final void LIZ(int i) {
        String str;
        StoryHighlightCollection storyHighlightCollectionLLLFZ = this.LIZ.LLLFZ(i);
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZJ(R.raw.icon_plus);
        c1247530iZL.LIZIZ(2131848982);
        c1247530iZL.LIZ(new AwS368S0200000_2(this, storyHighlightCollectionLLLFZ, 143));
        c13dvLIZIZ.add(c1247530iZL);
        C1247530iZL c1247530iZL2 = new C1247530iZL();
        c1247530iZL2.LIZJ(R.raw.icon_pen);
        c1247530iZL2.LIZIZ(2131848960);
        c1247530iZL2.LIZ(new AwS368S0200000_2(this, storyHighlightCollectionLLLFZ, 144));
        c13dvLIZIZ.add(c1247530iZL2);
        if (C289420BWa.LIZ()) {
            C1247530iZL c1247530iZL3 = new C1247530iZL();
            c1247530iZL3.LIZJ(R.raw.icon_arrow_turn_up_right);
            c1247530iZL3.LIZIZ(2131848999);
            c1247530iZL3.LIZ(new AwS368S0200000_2(this, storyHighlightCollectionLLLFZ, 145));
            c13dvLIZIZ.add(c1247530iZL3);
        }
        C1247530iZL c1247530iZL4 = new C1247530iZL();
        c1247530iZL4.LIZJ = 1;
        c1247530iZL4.LIZJ(R.raw.icon_trash_bin);
        c1247530iZL4.LIZIZ(2131848959);
        c1247530iZL4.LIZ(new AwS368S0200000_2(this, storyHighlightCollectionLLLFZ, 140));
        c13dvLIZIZ.add(c1247530iZL4);
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJFF(listLIZ);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        FragmentManager fragmentManager = this.LIZLLL;
        if (fragmentManager != null) {
            tuxActionSheetLIZJ.show(fragmentManager, "StoryHighlightsCollectionMenu");
            StoryHighlightsMyProfileVM storyHighlightsMyProfileVM = this.LIZIZ;
            if (storyHighlightCollectionLLLFZ != null) {
                str = storyHighlightCollectionLLLFZ.collectionId;
            } else {
                str = null;
            }
            storyHighlightsMyProfileVM.getClass();
            C06US.LIZ.getClass();
            C06US.LIZIZ("personal_homepage", "longpress_cover", str);
        }
    }

    @Override // X.InterfaceC2262521Dh4
    public final StoryHighlightsCoverView LIZIZ(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C1674850tgZ) {
            return ((C1674850tgZ) viewHolder).LLILLJJLI;
        }
        return null;
    }

    @Override // X.InterfaceC2262521Dh4
    public final void LJIIJJI(int i) {
        int iIntValue;
        String str;
        List<StoryHighlightCollection> list;
        String str2;
        User currentUser;
        C2252321DDq c2252321DDqLJII;
        Integer num;
        StoryHighlightCollection storyHighlightCollectionLLLFZ = this.LIZ.LLLFZ(i);
        StoryHighlightsMyProfileVM storyHighlightsMyProfileVM = this.LIZIZ;
        if (storyHighlightCollectionLLLFZ != null && (num = storyHighlightCollectionLLLFZ.count) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i2 = i - 1;
        if (storyHighlightCollectionLLLFZ != null) {
            str = storyHighlightCollectionLLLFZ.collectionId;
        } else {
            str = null;
        }
        storyHighlightsMyProfileVM.getClass();
        C06US.LIZ.getClass();
        C06US.LJ(iIntValue, i2, -1, "personal_homepage", str, "other");
        MyProfileStoryHighlightsFeedSharedVM myProfileStoryHighlightsFeedSharedVM = this.LIZJ;
        Context context = this.LJ;
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
        if (iStoryHighlightsMyDataManager == null || (c2252321DDqLJII = iStoryHighlightsMyDataManager.LJII()) == null || (list = (List) c2252321DDqLJII.getValue()) == null) {
            list = C13BV.INSTANCE;
        }
        if (storyHighlightCollectionLLLFZ == null || (str2 = storyHighlightCollectionLLLFZ.collectionId) == null) {
            str2 = "";
        }
        myProfileStoryHighlightsFeedSharedVM.getClass();
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            myProfileStoryHighlightsFeedSharedVM.FQ2(context, "my_profile", list, str2, currentUser, "personal_homepage", AFwS229S0000000_2.get$arr$(727));
        }
    }

    @Override // X.InterfaceC2262521Dh4
    public final String getItemId(int i) {
        StoryHighlightCollection storyHighlightCollectionLLLFZ = this.LIZ.LLLFZ(i);
        if (storyHighlightCollectionLLLFZ != null) {
            return storyHighlightCollectionLLLFZ.collectionId;
        }
        return null;
    }

    @Override // X.InterfaceC2262521Dh4
    public final void LIZJ(String str, String str2) {
        StoryHighlightsMyProfileVM storyHighlightsMyProfileVM = this.LIZIZ;
        storyHighlightsMyProfileVM.getClass();
        C06US.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "personal_homepage");
        c0lab.LJ("story_highlight_id", str);
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_move_result", c0lab.LIZ);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyHighlightsMyProfileVM), C0PEM.LIZJ, null, new C420401kI(str, str2, null), 2);
    }

    @Override // X.InterfaceC2262521Dh4
    public final void onMove(int i, int i2) {
        C1674830tgX c1674830tgX = this.LIZ;
        if (i != i2) {
            Collections.swap(c1674830tgX.LLILZ, i, i2);
            c1674830tgX.notifyItemMoved(i, i2);
        } else {
            c1674830tgX.getClass();
        }
    }

    public C06UV(C1674830tgX c1674830tgX, StoryHighlightsMyProfileVM storyHighlightsMyProfileVM, MyProfileStoryHighlightsFeedSharedVM myProfileStoryHighlightsFeedSharedVM, FragmentManager fragmentManager, Context context, Fragment fragment) {
        this.LIZ = c1674830tgX;
        this.LIZIZ = storyHighlightsMyProfileVM;
        this.LIZJ = myProfileStoryHighlightsFeedSharedVM;
        this.LIZLLL = fragmentManager;
        this.LJ = context;
        this.LJFF = fragment;
    }
}
