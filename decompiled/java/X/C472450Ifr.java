package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.GoLiveViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventBigViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventGapViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventSmallViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveMultiGuestApplyViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomInformationDoubleViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomInformationSingleViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.WatchLaterViewHolder;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.TaxonomyTagInfo;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.feed.EventStruct;

/* JADX INFO: renamed from: X.0Ifr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472450Ifr extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static int LLJI;
    public final AbstractC472460Ifs LL;
    public final InterfaceC472640IgA LLILLJJLI;
    public final EnumC471790Ien LLILLL;
    public final LifecycleOwner LLILZ;
    public FeedExtra LLILZLL;
    public final String LLIZLLLIL;
    public final C0IS1<C0IR0> LLJ;
    public List<? extends FeedItem> LLILZIL = new ArrayList();
    public String LLIZ = "";

    public final void LLLFZ() {
        InterfaceC676420Qg4 interfaceC676420Qg4;
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Sv0() && Intrinsics.LJFF(this.LL, C472490Ifv.LIZIZ)) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends FeedItem> it2 = this.LLILZIL.iterator();
            while (it2.hasNext()) {
                final Room room = it2.next().getRoom();
                if (room != null) {
                    arrayList.add(new InterfaceC1479620obg() { // from class: X.0okB
                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void LIZ() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ InterfaceC691690RBf LIZIZ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ String LIZJ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ C1479570obb LIZLLL() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ HashMap LJ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ SimVideoUrlModel LJFF() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void LJI() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ List LJII() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ C1698870uJJ LJIIIZ() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void LJIIJ() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ List LJIIJJI() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void getAspectRatio() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ long getDuration() {
                            return 0L;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ String getFormat() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ String getMeta() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ String getRatio() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ C1479530obX getRequest() {
                            return null;
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void getVideoHeight() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final /* synthetic */ void getVideoWidth() {
                        }

                        @Override // X.InterfaceC1479620obg
                        public final InterfaceC1483230ohV LJIIIIZZ() {
                            final Room room2 = room;
                            return new InterfaceC1483230ohV() { // from class: X.00d8
                                @Override // X.InterfaceC1483230ohV
                                public final String LIZ() {
                                    JSONObject jSONObject = new JSONObject();
                                    Room room3 = room2;
                                    try {
                                        jSONObject.putOpt("live_json_string_data", room3.getMultiStreamData());
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("live_room_mode", room3.liveRoomMode);
                                        TaxonomyTagInfo taxonomyTagInfo = room3.taxonomyTagInfo;
                                        if (taxonomyTagInfo != null) {
                                            jSONObject2.put("level1_tag", taxonomyTagInfo.level1Tag);
                                            jSONObject2.put("level2_tag", taxonomyTagInfo.level2Tag);
                                        }
                                        C189200o6.m2constructorimpl(jSONObject.put("extra", jSONObject2));
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                    }
                                    return C786410Ut5.J3(jSONObject);
                                }
                            };
                        }

                        @Override // X.InterfaceC1479620obg
                        public final String getKey() {
                            return String.valueOf(room.getId());
                        }
                    });
                }
            }
            C13LP.LJJLIIIJ(arrayList, "; ", null, null, 0, null, AFwS263S0000000_23.get$arr$(43), 30);
            C0IS1<C0IR0> c0is1 = this.LLJ;
            if (c0is1 != null) {
                c0is1.LIZJ();
            }
            C0IS1<C0IR0> c0is12 = this.LLJ;
            if (c0is12 == null || (interfaceC676420Qg4 = (InterfaceC676420Qg4) c0is12.LIZLLL()) == null) {
                return;
            }
            interfaceC676420Qg4.LJIIIIZZ(this.LLIZLLLIL, arrayList);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZIL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        EventStruct eventStruct;
        RoomLinkInfo linkMicInfo;
        List<User> list;
        int i2;
        RoomLinkInfo linkMicInfo2;
        List<User> list2;
        RoomLinkInfo linkMicInfo3;
        List<User> list3;
        if (this.LL.LIZ()) {
            FeedItem feedItem = (FeedItem) ListProtector.get(this.LLILZIL, i);
            if (feedItem.type == 22) {
                if (LiveWatchLaterSettingSetting.INSTANCE.getValue() == 2) {
                    if (feedItem.watchLaterInfo == null) {
                        return 11;
                    }
                    return 10;
                }
                return 0;
            }
            if (feedItem.getRoom() != null) {
                Room room = feedItem.getRoom();
                if (room != null && (linkMicInfo3 = room.getLinkMicInfo()) != null && (list3 = linkMicInfo3.showUserList) != null && list3.size() >= 2) {
                    return 2;
                }
                if (feedItem.getRoom().getOwner() != null) {
                    return 1;
                }
                return 0;
            }
            if (feedItem.liveEvent != null) {
                return 3;
            }
            if (feedItem.type == 101) {
                return 8;
            }
            return 0;
        }
        FeedItem feedItem2 = (FeedItem) ListProtector.get(this.LLILZIL, i);
        int i3 = feedItem2.type;
        if (i3 == 1010 || i3 == 1011 || i3 == 1012) {
            return 5;
        }
        if (i3 == 22) {
            if (LiveWatchLaterSettingSetting.INSTANCE.getValue() != 2) {
                return 0;
            }
            if (feedItem2.watchLaterInfo == null) {
                return 11;
            }
            return 10;
        }
        if (feedItem2.getRoom() != null && (((i2 = feedItem2.type) == 1 || i2 == 19) && feedItem2.skylightItemStyle == C00UH.ROOM_INFO)) {
            Room room2 = ((FeedItem) ListProtector.get(this.LLILZIL, i)).getRoom();
            if (room2 != null && (linkMicInfo2 = room2.getLinkMicInfo()) != null && (list2 = linkMicInfo2.showUserList) != null && list2.size() >= 2) {
                return 7;
            }
            if (feedItem2.getRoom().getOwner() != null) {
                return 6;
            }
        } else {
            if (feedItem2.type == 21 && Intrinsics.LJFF(this.LL, C472490Ifv.LIZIZ)) {
                return 9;
            }
            if (feedItem2.getRoom() != null) {
                Room room3 = ((FeedItem) ListProtector.get(this.LLILZIL, i)).getRoom();
                if (room3 != null && (linkMicInfo = room3.getLinkMicInfo()) != null && (list = linkMicInfo.showUserList) != null && list.size() >= 2) {
                    return 2;
                }
                if (feedItem2.getRoom().getOwner() != null) {
                    return 1;
                }
            } else if (feedItem2.liveEvent != null) {
                if (Intrinsics.LJFF(this.LL, C472490Ifv.LIZIZ) && (eventStruct = feedItem2.liveEvent) != null && eventStruct.owner != null) {
                    if (eventStruct == null || eventStruct.style != 2) {
                        return 3;
                    }
                    return 4;
                }
            } else {
                int i4 = feedItem2.type;
                if (i4 == 1007) {
                    return 5;
                }
                if (i4 == 101) {
                    return 8;
                }
            }
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        DrawerFollowingViewHolder drawerFollowingViewHolder;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof DrawerFollowingViewHolder) && (drawerFollowingViewHolder = (DrawerFollowingViewHolder) viewHolder) != null) {
            drawerFollowingViewHolder.LL = true;
            drawerFollowingViewHolder.onViewAttachedToWindow();
            drawerFollowingViewHolder.L5();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        DrawerFollowingViewHolder drawerFollowingViewHolder;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof DrawerFollowingViewHolder) && (drawerFollowingViewHolder = (DrawerFollowingViewHolder) viewHolder) != null) {
            drawerFollowingViewHolder.LL = false;
            drawerFollowingViewHolder.LLILLJJLI = false;
            drawerFollowingViewHolder.onViewDetachedFromWindow();
            drawerFollowingViewHolder.clearAnimation();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        DrawerFollowingViewHolder drawerFollowingViewHolder;
        Lifecycle lifecycle;
        FeedItem feedItem = (FeedItem) ListProtector.get(this.LLILZIL, i);
        if ((viewHolder instanceof LiveEventViewHolder) && ((FeedItem) ListProtector.get(this.LLILZIL, 0)).liveEvent != null) {
            i++;
        }
        if ((viewHolder instanceof DrawerFollowingViewHolder) && (drawerFollowingViewHolder = (DrawerFollowingViewHolder) viewHolder) != null) {
            FeedExtra feedExtra = this.LLILZLL;
            String str = this.LLIZ;
            drawerFollowingViewHolder.moveToStopState();
            if (!drawerFollowingViewHolder.LLILZIL) {
                LifecycleOwner lifecycleOwner = drawerFollowingViewHolder.LLILLL;
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.addObserver(drawerFollowingViewHolder);
                }
                drawerFollowingViewHolder.LLILZIL = true;
            }
            drawerFollowingViewHolder.moveToResumeState();
            drawerFollowingViewHolder.I5(feedItem, feedExtra, str, i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder watchLaterViewHolder;
        Context context;
        int i2;
        Context context2;
        int i3;
        Context context3;
        int i4;
        Context context4;
        int i5;
        View viewFindViewById;
        switch (i) {
            case 1:
                int i6 = LiveRoomSingleViewHolder.LLJLL;
                AbstractC472460Ifs abstractC472460Ifs = this.LL;
                InterfaceC472640IgA interfaceC472640IgA = this.LLILLJJLI;
                EnumC471790Ien enumC471790Ien = this.LLILLL;
                LifecycleOwner lifecycleOwner = this.LLILZ;
                if (abstractC472460Ifs.LIZ()) {
                    context3 = C1834150xpV.LJII(viewGroup.getContext());
                } else {
                    context3 = viewGroup.getContext();
                }
                if (abstractC472460Ifs.LIZ()) {
                    i4 = R.layout.gdz;
                } else if (C472520Ify.LIZ[abstractC472460Ifs.LIZ.ordinal()] == 1) {
                    i4 = R.layout.gdp;
                } else {
                    i4 = R.layout.gdo;
                }
                watchLaterViewHolder = new LiveRoomSingleViewHolder(C786410Ut5.Td(C786410Ut5.ne(context3), i4, viewGroup, false), abstractC472460Ifs, interfaceC472640IgA, enumC471790Ien, lifecycleOwner);
                break;
            case 2:
                int i7 = LiveRoomDoubleViewHolder.LLJLLL;
                AbstractC472460Ifs abstractC472460Ifs2 = this.LL;
                InterfaceC472640IgA interfaceC472640IgA2 = this.LLILLJJLI;
                EnumC471790Ien enumC471790Ien2 = this.LLILLL;
                LifecycleOwner lifecycleOwner2 = this.LLILZ;
                if (abstractC472460Ifs2.LIZ()) {
                    context2 = C1834150xpV.LJII(viewGroup.getContext());
                } else {
                    context2 = viewGroup.getContext();
                }
                if (abstractC472460Ifs2.LIZ()) {
                    i3 = R.layout.gdj;
                } else if (C472510Ifx.LIZ[abstractC472460Ifs2.LIZ.ordinal()] == 1) {
                    i3 = R.layout.gdi;
                } else {
                    i3 = R.layout.gdh;
                }
                watchLaterViewHolder = new LiveRoomDoubleViewHolder(C786410Ut5.Td(C786410Ut5.ne(context2), i3, viewGroup, false), abstractC472460Ifs2, interfaceC472640IgA2, enumC471790Ien2, lifecycleOwner2);
                break;
            case 3:
                int i8 = LiveEventSmallViewHolder.LLJJJ;
                AbstractC472460Ifs abstractC472460Ifs3 = this.LL;
                if (abstractC472460Ifs3.LIZ()) {
                    context = C1834150xpV.LJII(viewGroup.getContext());
                } else {
                    context = viewGroup.getContext();
                }
                if (abstractC472460Ifs3.LIZ()) {
                    i2 = R.layout.gdm;
                } else {
                    i2 = R.layout.gdl;
                }
                watchLaterViewHolder = new LiveEventSmallViewHolder(C786410Ut5.Td(C786410Ut5.ne(context), i2, viewGroup, false), abstractC472460Ifs3);
                break;
            case 4:
                int i9 = LiveEventBigViewHolder.LLJILJILJ;
                watchLaterViewHolder = new LiveEventBigViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gdk, viewGroup, false));
                break;
            case 5:
                int i10 = LiveEventGapViewHolder.LLIZ;
                AbstractC472460Ifs abstractC472460Ifs4 = this.LL;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gdg, viewGroup, false);
                if ((abstractC472460Ifs4 instanceof C472490Ifv) && (viewFindViewById = viewTd.findViewById(R.id.view_gap)) != null) {
                    viewFindViewById.setBackgroundColor(C497740JfY.LIZLLL(R.attr.ey_, C1834150xpV.LJII(viewGroup.getContext())));
                }
                watchLaterViewHolder = new LiveEventGapViewHolder(viewTd);
                break;
            case 6:
                int i11 = LiveRoomInformationSingleViewHolder.LLJLIL;
                watchLaterViewHolder = new LiveRoomInformationSingleViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hl3, viewGroup, false), this.LL, this.LLILLJJLI);
                break;
            case 7:
                int i12 = LiveRoomInformationDoubleViewHolder.LLJLILLLLZIIL;
                watchLaterViewHolder = new LiveRoomInformationDoubleViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hl2, viewGroup, false), this.LL, this.LLILLJJLI);
                break;
            case 8:
                int i13 = GoLiveViewHolder.LLJJJIL;
                AbstractC472460Ifs abstractC472460Ifs5 = this.LL;
                InterfaceC472640IgA interfaceC472640IgA3 = this.LLILLJJLI;
                if (abstractC472460Ifs5.LIZ()) {
                    context4 = C1834150xpV.LJII(viewGroup.getContext());
                } else {
                    context4 = viewGroup.getContext();
                }
                if (abstractC472460Ifs5.LIZ()) {
                    i5 = R.layout.gdv;
                } else {
                    i5 = R.layout.gdu;
                }
                watchLaterViewHolder = new GoLiveViewHolder(C786410Ut5.Td(C786410Ut5.ne(context4), i5, viewGroup, false), interfaceC472640IgA3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                int i14 = LiveMultiGuestApplyViewHolder.LLJZIJLIL;
                watchLaterViewHolder = new LiveMultiGuestApplyViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gdn, viewGroup, false), this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                int i15 = WatchLaterViewHolder.LLJJJ;
                watchLaterViewHolder = new WatchLaterViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gds, viewGroup, false), this.LLILZ, false);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                int i16 = WatchLaterViewHolder.LLJJJ;
                watchLaterViewHolder = new WatchLaterViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gdt, viewGroup, false), this.LLILZ, true);
                break;
            default:
                final View view = new View(viewGroup.getContext());
                watchLaterViewHolder = new RecyclerView.ViewHolder(view) { // from class: X.0Ift
                };
                break;
        }
        try {
            View view2 = watchLaterViewHolder.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        watchLaterViewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (watchLaterViewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(watchLaterViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) watchLaterViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(watchLaterViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = watchLaterViewHolder.getClass().getName();
        return watchLaterViewHolder;
    }

    public C472450Ifr(AbstractC472460Ifs abstractC472460Ifs, InterfaceC472640IgA interfaceC472640IgA, EnumC471790Ien enumC471790Ien, LifecycleOwner lifecycleOwner) {
        C0IS1<C0IR0> c0is1LIZIZ;
        this.LL = abstractC472460Ifs;
        this.LLILLJJLI = interfaceC472640IgA;
        this.LLILLL = enumC471790Ien;
        this.LLILZ = lifecycleOwner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerSkyLightSceneName");
        sbLIZ.append(hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZLLLIL = strLIZIZ;
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Sv0()) {
            InterfaceC468940IaC interfaceC468940IaCLIZ = C582130MsN.LIZ().LIZ();
            C0IS3 c0is3 = new C0IS3();
            c0is3.LIZ = strLIZIZ;
            c0is3.LIZIZ = "inflow";
            c0is3.LIZJ = "LIVE_DATA_MODE";
            c0is1LIZIZ = interfaceC468940IaCLIZ.LIZIZ(c0is3);
            c0is1LIZIZ.LIZJ();
        } else {
            c0is1LIZIZ = null;
        }
        this.LLJ = c0is1LIZIZ;
    }
}
