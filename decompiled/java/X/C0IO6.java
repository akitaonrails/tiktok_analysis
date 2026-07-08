package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0IO6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IO6 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function1<Room, Unit> LL;
    public int LLILLJJLI = 2;
    public final List<FeedItem> LLILLL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size() + 1;
    }

    public C0IO6(AwS586S0100000_7 awS586S0100000_7) {
        this.LL = awS586S0100000_7;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i + 1 == getItemCount()) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJI(new C521600Kcw(this, layoutManager, 1));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long userCount;
        long jLongValue;
        Long l;
        boolean z;
        if (viewHolder instanceof C465630INt) {
            C465630INt c465630INt = (C465630INt) viewHolder;
            Room room = ((FeedItem) ListProtector.get(this.LLILLL, i)).getRoom();
            Function1<Room, Unit> function1 = this.LL;
            c465630INt.getClass();
            if (room != null) {
                ImageModel cover = room.getCover();
                if (cover != null) {
                    List urls = cover.getUrls();
                    if (urls != null && !urls.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        c465630INt.LL.setActualImageResource(R.drawable.ehd);
                        C786410Ut5.LJLLLLLL(8, c465630INt.LLILZ);
                        C786410Ut5.LJLLLLLL(8, c465630INt.LLILZIL);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = cover.getUrls().iterator();
                        while (it2.hasNext()) {
                            C495520Jby c495520Jby = new C495520Jby((String) it2.next());
                            c495520Jby.LIZJ("biz_tag", "scene_cover");
                            arrayList.add(c495520Jby.LIZLLL());
                        }
                        cover.setUrls(arrayList);
                        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(cover);
                        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.ehd;
                        c1324610kZfLJIIIZ.LJIJI(Float.valueOf(((int) C497740JfY.LIZIZ(0.0f)) + 0.0f));
                        c1324610kZfLJIIIZ.LJJII = false;
                        c1324610kZfLJIIIZ.LJJI(c465630INt.LL);
                    }
                }
                String title = room.getTitle();
                if (title != null) {
                    c465630INt.LLILLJJLI.setText(C341701Uh.LIZ("%s", title));
                }
                C16F5 c16f5 = c465630INt.LLILLL;
                if (room.getStatus() == 4) {
                    userCount = 0;
                } else {
                    userCount = room.getUserCount();
                }
                c16f5.setText(C470340IcS.LIZ(userCount));
                C786410Ut5.I7(new ACListenerS111S0200000_7(function1, room, 65), c465630INt.itemView);
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJ("click");
                String str = null;
                c474500IjALIZ.LJJIIZI(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(null));
                c474500IjALIZ.LJJII("live_detail", "enter_from_merge");
                c474500IjALIZ.LJJII("hashtag", "enter_method");
                Hashtag hashtag = room.hashtag;
                if (hashtag != null) {
                    str = hashtag.title;
                }
                c474500IjALIZ.LJJII(str, "hash_type");
                c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_return");
                User owner = room.getOwner();
                if (owner != null && (l = owner.followStatus) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "initial_follow_status");
                c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
                c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
                if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
                    c474500IjALIZ.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
                }
                c474500IjALIZ.LIZ();
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C0IO7)) {
            return;
        }
        C0IO7 c0io7 = (C0IO7) viewHolder;
        int i2 = this.LLILLJJLI;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    c0io7.getClass();
                    return;
                } else {
                    C786410Ut5.LLLIZZ(c0io7.LL, 8);
                    return;
                }
            }
            C786410Ut5.LLLIZZ(c0io7.LL, 4);
            return;
        }
        C786410Ut5.LLLIZZ(c0io7.LL, 0);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0io7;
        if (i == 0) {
            c0io7 = new C465630INt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g7i, viewGroup, false));
        } else {
            c0io7 = new C0IO7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gow, viewGroup, false));
        }
        try {
            View view = c0io7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0io7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0io7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0io7.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0io7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0io7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0io7.getClass().getName();
        return c0io7;
    }
}
