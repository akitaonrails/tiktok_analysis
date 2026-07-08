package X;

import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Inb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC477250Inb implements InterfaceC477270Ind {
    public final Context LIZ;
    public final EnumC471790Ien LIZIZ;
    public final Function1<Integer, Unit> LIZJ;
    public final String LIZLLL;
    public final Function0<Integer> LJ;
    public ViewGroup LJFF;
    public final C01GW LJI = C292401Bi.LIZ(new AwS551S0100000_7(this, 706));
    public final C01GW LJII = C292401Bi.LIZ(new AwS551S0100000_7(this, 699));
    public final C01GW LJIIIIZZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 698));
    public final C01GW LJIIIZ = C292401Bi.LIZ(new AwS551S0100000_7(this, 696));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 697));
    public final C01GW LJIIJJI = C292401Bi.LIZ(new AwS551S0100000_7(this, 704));
    public final C01GW LJIIL = C292401Bi.LIZ(new AwS551S0100000_7(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
    public final C01GW LJIILIIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 702));
    public final C01GW LJIILJJIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 701));
    public final C01GW LJIILL = C292401Bi.LIZ(new AwS551S0100000_7(this, 703));
    public final C01GW LJIILLIIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 705));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(282));
    public boolean LJIJ;
    public BaseListResponse<FeedItem, FeedExtra> LJIJI;
    public boolean LJIJJ;

    public abstract String LIZJ();

    public abstract int LIZLLL();

    @Override // X.InterfaceC477270Ind
    public View LIZ() {
        C0GUM c0gum;
        C0GUM c0gum2;
        this.LJFF = (ViewGroup) C786410Ut5.Td(C786410Ut5.ne(this.LIZ), LIZLLL(), null, false);
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        View view = (View) this.LJIIJ.getValue();
        if ((view instanceof C0GUM) && view != null) {
            view.setWillNotDraw(false);
        }
        if (C497740JfY.LJJ()) {
            View view2 = (View) this.LJIIIZ.getValue();
            if (view2 != null) {
                C786410Ut5.Ob(view2, -1.0f);
            }
            View view3 = (View) this.LJIIJ.getValue();
            if ((view3 instanceof C0GUM) && (c0gum2 = (C0GUM) view3) != null) {
                c0gum2.e0(iLIZIZ, iLIZIZ, 0, 0);
            }
        } else {
            View view4 = (View) this.LJIIIZ.getValue();
            if (view4 != null) {
                C786410Ut5.Ob(view4, 1.0f);
            }
            View view5 = (View) this.LJIIJ.getValue();
            if ((view5 instanceof C0GUM) && (c0gum = (C0GUM) view5) != null) {
                c0gum.e0(0, 0, iLIZIZ, iLIZIZ);
            }
        }
        View view6 = (View) this.LJIIIZ.getValue();
        if (view6 != null) {
            C1143680frq.LIZLLL(view6, "tiktok_live_watch_resource_normal_1", "live_skylight_nearby_bg_v2.png");
        }
        ViewGroup viewGroup = this.LJFF;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS142S0100000_7(this, 244));
        }
        View view7 = (View) this.LJIILJJIL.getValue();
        if (view7 != null) {
            C1143680frq.LJ(view7, "tiktok_live_watch_resource_normal_1", LIZJ(), ImageView.ScaleType.FIT_XY);
        }
        View view8 = (View) this.LJIILL.getValue();
        if (view8 != null) {
            C1143680frq.LJ(view8, "tiktok_live_watch_resource_normal_1", LIZJ(), ImageView.ScaleType.FIT_XY);
        }
        View view9 = (View) this.LJIILLIIL.getValue();
        if (view9 != null) {
            C1143680frq.LJ(view9, "tiktok_live_watch_resource_normal_1", "live_skylight_nearby_avatar_self_outer.png", ImageView.ScaleType.FIT_XY);
        }
        View view10 = (View) this.LJIILJJIL.getValue();
        if (view10 != null) {
            C786410Ut5.LJLLLLLL(8, view10);
        }
        View view11 = (View) this.LJIILL.getValue();
        if (view11 != null) {
            C786410Ut5.LJLLLLLL(8, view11);
        }
        View view12 = (View) this.LJIILLIIL.getValue();
        if (view12 != null) {
            C786410Ut5.LJLLLLLL(8, view12);
        }
        ViewGroup viewGroup2 = this.LJFF;
        return viewGroup2 == null ? new View(this.LIZ) : viewGroup2;
    }

    public final void LIZIZ() {
        View view = (View) this.LJIILJJIL.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = (View) this.LJIILL.getValue();
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = (View) this.LJIILLIIL.getValue();
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        this.LJIJ = false;
    }

    public final void LJFF() {
        ImageModel avatarThumb;
        List<String> listLIZ;
        InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
        String str = (curUser == null || (avatarThumb = curUser.getAvatarThumb()) == null || (listLIZ = C842240X2g.LIZ(avatarThumb)) == null) ? null : (String) C13LP.LJJJLL(listLIZ);
        if (str != null && str.length() != 0) {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
            url.LJIIL = new C521890KdP(this, 7);
            url.LJJI((View) this.LJIIJJI.getValue());
            return;
        }
        C1322110kVd c1322110kVd = (C1322110kVd) this.LJIIJJI.getValue();
        if (c1322110kVd != null) {
            c1322110kVd.setImageResource(R.drawable.eze);
        }
        View view = (View) this.LJIILLIIL.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void LJI() {
        List<FeedItem> list;
        long ownerUserId;
        User owner;
        String str = Intrinsics.LJFF(this.LIZLLL, "live_merge") ? "livesdk_toplive_module_show" : "livesdk_livetab_module_show";
        ArrayList arrayList = new ArrayList();
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = this.LJIJI;
        if (baseListResponse != null && (list = baseListResponse.data) != null) {
            for (FeedItem feedItem : list) {
                Room room = feedItem.getRoom();
                if (room != null) {
                    ownerUserId = room.getOwnerUserId();
                } else {
                    Room room2 = feedItem.getRoom();
                    if (room2 != null && (owner = room2.getOwner()) != null) {
                        ownerUserId = owner.getId();
                    }
                }
                Long lValueOf = Long.valueOf(ownerUserId);
                if (lValueOf != null) {
                    arrayList.add(String.valueOf(lValueOf.longValue()));
                }
            }
        }
        if (this.LJIJJ) {
            return;
        }
        this.LJIJJ = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII("nearby_module", "module_name");
        c474500IjALIZ.LJJII(this.LJ.invoke(), "module_position");
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(C13LP.LL(arrayList, 2), ",", null, null, 0, null, null, 62), "anchor_id");
        c474500IjALIZ.LJJII(this.LIZIZ == EnumC471790Ien.ROOM ? "discover" : "nearby", "top_tab");
        c474500IjALIZ.LIZ();
    }

    public final void LJ(List<? extends FeedItem> list) {
        boolean z;
        FeedItem feedItem;
        Room room;
        User owner;
        ImageModel avatarThumb;
        List urls;
        User owner2;
        ImageModel avatarThumb2;
        List urls2;
        Room room2;
        User owner3;
        ImageModel avatarThumb3;
        List urls3;
        User owner4;
        ImageModel avatarThumb4;
        List urls4;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (room2 = ((FeedItem) ListProtector.get(list, 0)).getRoom()) != null && (owner3 = room2.getOwner()) != null && (avatarThumb3 = owner3.getAvatarThumb()) != null && (urls3 = avatarThumb3.getUrls()) != null && !urls3.isEmpty()) {
            Room room3 = ((FeedItem) ListProtector.get(list, 0)).getRoom();
            if (room3 != null && (owner4 = room3.getOwner()) != null && (avatarThumb4 = owner4.getAvatarThumb()) != null && (urls4 = avatarThumb4.getUrls()) != null && urls4.size() > 0) {
                C1324610kZf c1324610kZfLJIILIIL = C1819620xS4.LIZ().LJIILIIL((String) this.LJIIZILJ.getValue());
                c1324610kZfLJIILIIL.LJIJJLI((String) ListProtector.get(urls4, 0), "toplive_window");
                c1324610kZfLJIILIIL.LJIIL = new C521890KdP(this, 5);
                c1324610kZfLJIILIIL.LJJI((View) this.LJIIL.getValue());
            }
        } else {
            View view = (View) this.LJIILJJIL.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = (View) this.LJIIL.getValue();
            if (view2 != null) {
                C1143680frq.LJ(view2, "tiktok_live_watch_resource_normal_1", "live_skylight_nearby_avatar_default_1.png", ImageView.ScaleType.FIT_XY);
            }
        }
        if (list != null && !list.isEmpty() && list.size() >= 2 && (feedItem = (FeedItem) ListProtector.get(list, 1)) != null && (room = feedItem.getRoom()) != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null && !urls.isEmpty()) {
            Room room4 = ((FeedItem) ListProtector.get(list, 1)).getRoom();
            if (room4 != null && (owner2 = room4.getOwner()) != null && (avatarThumb2 = owner2.getAvatarThumb()) != null && (urls2 = avatarThumb2.getUrls()) != null && urls2.size() > 0) {
                C1324610kZf c1324610kZfLJIILIIL2 = C1819620xS4.LIZ().LJIILIIL((String) this.LJIIZILJ.getValue());
                c1324610kZfLJIILIIL2.LJIJJLI((String) ListProtector.get(urls2, 0), "toplive_window");
                c1324610kZfLJIILIIL2.LJIIL = new C521890KdP(this, 6);
                c1324610kZfLJIILIIL2.LJJI((View) this.LJIILIIL.getValue());
                return;
            }
            return;
        }
        View view3 = (View) this.LJIILL.getValue();
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = (View) this.LJIILIIL.getValue();
        if (view4 != null) {
            C1143680frq.LJ(view4, "tiktok_live_watch_resource_normal_1", "live_skylight_nearby_avatar_default_2.png", ImageView.ScaleType.FIT_XY);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC477250Inb(Context context, EnumC471790Ien enumC471790Ien, Function1<? super Integer, Unit> function1, String str, Function0<Integer> function0) {
        this.LIZ = context;
        this.LIZIZ = enumC471790Ien;
        this.LIZJ = function1;
        this.LIZLLL = str;
        this.LJ = function0;
    }
}
