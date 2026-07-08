package X;

import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.game.GameliveBottombarFlowSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS48S0000100_7;
import kotlin.jvm.internal.AwS79S0100100_7;

/* JADX INFO: renamed from: X.0Il6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475700Il6 extends AbstractC21673619ry<C475710Il7> implements InterfaceC483930IyN {
    public static int LLJIJIL = -1;
    public Context LLILLL;
    public RecyclerView LLILZ;
    public C475690Il5 LLILZIL;
    public C475710Il7 LLIZLLLIL;
    public int LLJI;
    public final List<C468240IXu> LL = Collections.synchronizedList(new ArrayList());
    public boolean LLILLJJLI = true;
    public final C475740IlA LLILZLL = new Object() { // from class: X.0IlA
    };
    public final Set<WeakReference<InterfaceC475720Il8>> LLIZ = new LinkedHashSet();
    public long LLJ = System.currentTimeMillis();

    @Override // X.InterfaceC483930IyN
    public final AbstractC21673619ry<?> LJLJJL() {
        return this;
    }

    @Override // X.InterfaceC483930IyN
    public final void LLILLL() {
        InterfaceC475720Il8 interfaceC475720Il8L5;
        C475710Il7 c475710Il7 = this.LLIZLLLIL;
        if (c475710Il7 == null || (interfaceC475720Il8L5 = c475710Il7.L5()) == null) {
            return;
        }
        interfaceC475720Il8L5.LIZIZ();
    }

    @Override // X.InterfaceC483930IyN
    public final void LLJJJ() {
        RecyclerView recyclerView;
        if (GameliveBottombarFlowSetting.enableGameLiveAutoPlay) {
            C475690Il5 c475690Il5 = this.LLILZIL;
            if ((c475690Il5 == null || c475690Il5.LLILZLL) && (recyclerView = this.LLILZ) != null) {
                HandlerHook.viewPostDelay(recyclerView, new ARunnableS107S0100000_7(this, 235), 500L);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size() + 1;
    }

    @Override // X.InterfaceC483930IyN
    public final void onDestroy() {
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", "destroy（）----");
        C475690Il5 c475690Il5 = this.LLILZIL;
        if (c475690Il5 != null) {
            c475690Il5.dispose();
        }
        this.LLILZIL = null;
        Iterator<WeakReference<InterfaceC475720Il8>> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC475720Il8 interfaceC475720Il8 = it2.next().get();
            if (interfaceC475720Il8 != null) {
                interfaceC475720Il8.release();
            }
        }
        this.LLIZ.clear();
        C468200IXq.LIZ.getClass();
        C468200IXq.LIZ();
    }

    @Override // X.InterfaceC483930IyN
    public final boolean LLIIJI() {
        return System.currentTimeMillis() - this.LLJ > ((long) GameliveBottombarFlowSetting.fragmentCheckIntervalSecond) * 1000;
    }

    @Override // X.InterfaceC483930IyN
    public final boolean LJJJJLL() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0IlA] */
    public C475700Il6(int i) {
    }

    public static Map LLLFZ(C468240IXu c468240IXu) {
        Room room;
        Object objValueOf;
        long id;
        EnterRoomConfig.RoomsData roomsData;
        Map<String, String> map;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c468240IXu != null && (room = c468240IXu.LIZ) != null && c468240IXu.LIZIZ != null) {
            User owner = room.getOwner();
            String str2 = "";
            if (owner == null) {
                objValueOf = "";
            } else {
                objValueOf = Long.valueOf(owner.getId());
            }
            Room room2 = c468240IXu.LIZ;
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            linkedHashMap.put("anchor_id", objValueOf.toString());
            linkedHashMap.put("room_id", String.valueOf(id));
            linkedHashMap.put("btn_name", "live_room");
            EnterRoomConfig enterRoomConfig = c468240IXu.LIZIZ;
            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && (map = roomsData.gameLiveExtra) != null) {
                if (GameliveBottombarFlowSetting.enableFlowPageChoice) {
                    str = "bottombar_feed_hero";
                } else {
                    str = "bottombar_feed";
                }
                String str3 = map.get("tag_name");
                if (str3 == null) {
                    str3 = "";
                }
                linkedHashMap.put("game_name", str3);
                linkedHashMap.put("page_type", str);
                String str4 = map.get("bottombar_content_type");
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap.put("bottom_bar_type", str4);
                String str5 = map.get("bottombar_content");
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put("bottombar_content", str5);
                String str6 = map.get("related_from_request_id");
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap.put("related_from_request_id", str6);
                String str7 = map.get("related_from_video_id");
                if (str7 == null) {
                    str7 = "";
                }
                linkedHashMap.put("related_from_video_id", str7);
                String str8 = map.get("is_in_more_list");
                if (str8 == null) {
                    str8 = "";
                }
                linkedHashMap.put("is_in_more_list", str8);
                String str9 = map.get("bottombar_content_tag");
                if (str9 == null) {
                    str9 = "";
                }
                linkedHashMap.put("bottombar_content_tag", str9);
                String str10 = map.get("click_timestamp");
                if (str10 == null) {
                    str10 = "";
                }
                linkedHashMap.put("click_timestamp", str10);
                String str11 = map.get("request_timestamp");
                if (str11 == null) {
                    str11 = "";
                }
                linkedHashMap.put("request_timestamp", str11);
                String str12 = map.get("request_success_timestamp");
                if (str12 != null) {
                    str2 = str12;
                }
                linkedHashMap.put("request_success_timestamp", str2);
            }
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= this.LL.size()) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        int iHashCode;
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZ = recyclerView;
        Context context = recyclerView.getContext();
        if (context != null) {
            iHashCode = context.hashCode();
        } else {
            iHashCode = 0;
        }
        this.LLJI = iHashCode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Adapter attached to RecyclerView, current sourceItems count: ");
        sbLIZ.append(this.LL.size());
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", "Adapter detached from RecyclerView, clearing reference");
        this.LLILZ = null;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        long jLongValue;
        long jLongValue2;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Long lLJIILIIL3;
        super.onViewAttachedToWindow(viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && bindingAdapterPosition < this.LL.size()) {
            C468240IXu c468240IXu = (C468240IXu) ListProtector.get(this.LL, bindingAdapterPosition);
            if (c468240IXu != null && c468240IXu.LIZ != null && c468240IXu.LIZIZ != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottombar_live_rec_show");
                c474500IjALIZ.LJJIIZI(LLLFZ(c468240IXu));
                c474500IjALIZ.LIZ();
            }
            int i = this.LLJI;
            if (i != LLJIJIL) {
                LLJIJIL = i;
                C468240IXu c468240IXu2 = (C468240IXu) ListProtector.get(this.LL, bindingAdapterPosition);
                if (c468240IXu2 != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) LLLFZ(c468240IXu2);
                    String str = (String) linkedHashMap.get("click_timestamp");
                    long jLongValue3 = 0;
                    if (str != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str)) != null) {
                        jLongValue = lLJIILIIL3.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    String str2 = (String) linkedHashMap.get("request_timestamp");
                    if (str2 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str2)) != null) {
                        jLongValue2 = lLJIILIIL2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    String str3 = (String) linkedHashMap.get("request_success_timestamp");
                    if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
                        jLongValue3 = lLJIILIIL.longValue();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_bottombar_double_column_page_show");
                    c474500IjALIZ2.LJJII("mlbb", "page_type");
                    Object obj = linkedHashMap.get("related_from_video_id");
                    Object obj2 = "";
                    if (obj == null) {
                        obj = "";
                    }
                    c474500IjALIZ2.LJJII(obj, "related_from_video_id");
                    Object obj3 = linkedHashMap.get("bottom_bar_type");
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                    c474500IjALIZ2.LJJII(obj2, "bottom_bar_type");
                    c474500IjALIZ2.LJJII(String.valueOf(jLongValue2 - jLongValue), "state_1_duration");
                    c474500IjALIZ2.LJJII(String.valueOf(jLongValue3 - jLongValue2), "state_2_duration");
                    c474500IjALIZ2.LJJII(String.valueOf(jCurrentTimeMillis - jLongValue3), "state_3_duration");
                    c474500IjALIZ2.LJJII(String.valueOf(jCurrentTimeMillis - jLongValue), "duration");
                    c474500IjALIZ2.LIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC483930IyN
    public final void LJJIJIL(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView recyclerView;
        C475690Il5 c475690Il5 = this.LLILZIL;
        if ((c475690Il5 == null || c475690Il5.LLILZLL) && (recyclerView = this.LLILZ) != null) {
            C476770Imp.LIZJ(recyclerView, new ARunnableS107S0100000_7(viewHolder, 236));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C475710Il7 c475710Il7 = (C475710Il7) viewHolder;
        if (i >= 0 && i <= this.LL.size()) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Binding loading view at position ");
                    sbLIZ.append(i);
                    C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
                    if (this.LLILLJJLI) {
                        View view = c475710Il7.LLIZLLLIL;
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(0, view);
                            return;
                        }
                        return;
                    }
                    View view2 = c475710Il7.LLIZLLLIL;
                    if (view2 == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(4, view2);
                    return;
                }
                return;
            }
            try {
                if (i >= this.LL.size()) {
                    return;
                }
                C468240IXu c468240IXu = this.LL.get(i);
                c475710Il7.LL = i;
                c475710Il7.I5(c475710Il7, c468240IXu);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Binding item at position ");
                sbLIZ2.append(i);
                sbLIZ2.append(": ");
                sbLIZ2.append(c468240IXu.LIZ.getTitle());
                C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onBindViewHolder called with invalid position: ");
        sbLIZ3.append(i);
        sbLIZ3.append(", sourceItems size: ");
        sbLIZ3.append(this.LL.size());
        C20441214yg.LJIIL("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        this.LLILLL = viewGroup.getContext();
        if (i == 1) {
            i2 = R.layout.gm9;
        } else {
            i2 = R.layout.gmq;
        }
        C475710Il7 c475710Il7 = new C475710Il7(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i2, viewGroup, false));
        try {
            View view = c475710Il7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c475710Il7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c475710Il7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C475710Il7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c475710Il7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c475710Il7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C475710Il7.class.getName();
        return c475710Il7;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Il2] */
    @Override // X.InterfaceC483930IyN
    public final void LJZI(Context context, Map<String, String> map, String str, String str2, final long j, boolean z, InterfaceC475680Il4 interfaceC475680Il4) {
        String str3;
        C475690Il5 c475690Il5 = this.LLILZIL;
        if (c475690Il5 != null) {
            c475690Il5.dispose();
        }
        this.LLILZIL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadFeedData[heroId=");
        sbLIZ.append(j);
        sbLIZ.append("] starting new request, cancelling previous if any, isRefresh: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Loading feed[heroId=");
            sbLIZ2.append(j);
            sbLIZ2.append("] data, isRefresh: stop lastPlaying");
            C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("safeClearAdapter old size: ");
            sbLIZ3.append(this.LL);
            sbLIZ3.append(".size");
            C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ3));
            RecyclerView recyclerView = this.LLILZ;
            if (recyclerView != null) {
                HandlerHook.viewPost(recyclerView, new ARunnableS107S0100000_7(this, 237));
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Loading feed[heroId=");
        sbLIZ4.append(j);
        sbLIZ4.append("] data, isRefresh: ");
        sbLIZ4.append(z);
        sbLIZ4.append(", current items: ");
        sbLIZ4.append(this.LL.size());
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ4));
        final C475670Il3 c475670Il3 = new C475670Il3(j, this, z, interfaceC475680Il4);
        final AwS79S0100100_7 awS79S0100100_7 = new AwS79S0100100_7(j, this, 1);
        C475690Il5 c475690Il52 = new C475690Il5(context, map, str, str2, j, z, c475670Il3, awS79S0100100_7, new AwS48S0000100_7(j, 1));
        this.LLILZIL = c475690Il52;
        if (c475690Il52.LLILZLL) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Cannot start disposed feed request[heroId=");
            sbLIZ5.append(j);
            sbLIZ5.append(']');
            C20441214yg.LJIIL("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ5));
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("Starting feed request[heroId=");
        sbLIZ6.append(j);
        sbLIZ6.append("]: ");
        if (z) {
            str3 = "refresh";
        } else {
            str3 = "loadMore";
        }
        sbLIZ6.append(str3);
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ6));
        ?? r2 = new InterfaceC468230IXt(j, c475670Il3, awS79S0100100_7) { // from class: X.0Il2
            public final long LIZ;
            public final InterfaceC1685420txc<List<C468240IXu>, Boolean, Long, String, Integer, Unit> LIZIZ;
            public final Function2<String, String, Unit> LIZJ;

            @Override // X.InterfaceC468230IXt
            public final void onError(String str4, String str5) {
                this.LIZJ.invoke(str4, str5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = j;
                this.LIZIZ = c475670Il3;
                this.LIZJ = awS79S0100100_7;
            }

            @Override // X.InterfaceC468230IXt
            public final void LIZ(int i, String str4, List list, long j2, boolean z2) {
                this.LIZIZ.invoke(list, Boolean.valueOf(z2), Long.valueOf(j2), str4, Integer.valueOf(i));
            }
        };
        if (z) {
            C468200IXq.LIZ.getClass();
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("refreshFeedData[heroId=");
            sbLIZ7.append(j);
            sbLIZ7.append("] called with params: context=");
            sbLIZ7.append(context);
            sbLIZ7.append(", params=");
            sbLIZ7.append(map);
            sbLIZ7.append(", enterFromMerge=");
            sbLIZ7.append(str);
            sbLIZ7.append(", enterMethod=");
            sbLIZ7.append(str2);
            sbLIZ7.append(", callback=");
            sbLIZ7.append("provided");
            C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ7));
            C468200IXq.LIZ();
            C468200IXq.LIZJ(context, map, str, str2, "related_live_refresh", j, r2);
            return;
        }
        C468200IXq.LIZ.getClass();
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("loadMoreFeedData[heroId=");
        sbLIZ8.append(j);
        sbLIZ8.append("] called with params: context=");
        sbLIZ8.append(context);
        sbLIZ8.append(", params=");
        sbLIZ8.append(map);
        sbLIZ8.append(", enterFromMerge=");
        sbLIZ8.append(str);
        sbLIZ8.append(", enterMethod=");
        sbLIZ8.append(str2);
        sbLIZ8.append(", callback=");
        sbLIZ8.append("provided");
        C20441214yg.LIZIZ("GameLiveBottombarFeedProvider", C2188811AlT.LIZIZ(sbLIZ8));
        if (!C468200IXq.LIZIZ.LIZIZ) {
            C20441214yg.LJIIL("GameLiveBottombarFeedProvider", "No more feed data available");
            r2.onError("No more data available", "related_live_loadmore");
        } else {
            C468200IXq.LIZJ(context, map, str, str2, "related_live_loadmore", j, r2);
        }
    }
}
