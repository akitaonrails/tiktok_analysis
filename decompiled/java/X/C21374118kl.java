package X;

import Y.ACListenerS166S0100000_32;
import Y.ACListenerS54S0201000_32;
import Y.ARunnableS101S0200000_32;
import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBottombarMixWaterfallFlowSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS83S0210000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21374118kl extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC483930IyN {
    public static int LLJIJIL = -1;
    public final Lifecycle LL;
    public boolean LLILLL;
    public boolean LLILZ;
    public RecyclerView.ViewHolder LLIZLLLIL;
    public int LLJ;
    public final List<AbstractC21148617pU> LLILLJJLI = new ArrayList();
    public long LLILZIL = System.currentTimeMillis();
    public final Set<WeakReference<InterfaceC475720Il8>> LLILZLL = new LinkedHashSet();
    public final Set<WeakReference<InterfaceC21374518kp>> LLIZ = new LinkedHashSet();
    public final BPEAHandler LLJI = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC483930IyN
    public final AbstractC21673619ry<?> LJLJJL() {
        return this;
    }

    @Override // X.InterfaceC483930IyN
    public final void LLILLL() {
        if (GameLiveBottombarMixWaterfallFlowSetting.autoPlay) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopCurVideoItem, lastPlaying: ");
            sbLIZ.append(this.LLIZLLLIL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoMixAdapter", C2188811AlT.LIZIZ(sbLIZ));
            RecyclerView.ViewHolder viewHolder = this.LLIZLLLIL;
            if (viewHolder == null) {
                return;
            }
            C786410Ut5.LJJZZIII(this.LLJI, new ARunnableS132S0100000_32(viewHolder, 81));
        }
    }

    @Override // X.InterfaceC483930IyN
    public final void LLJJJ() {
        C21374218km c21374218km;
        if (GameLiveBottombarMixWaterfallFlowSetting.autoPlay) {
            RecyclerView.ViewHolder viewHolder = this.LLIZLLLIL;
            C21374318kn c21374318kn = viewHolder instanceof C21374318kn ? (C21374318kn) viewHolder : null;
            boolean z = true;
            if (c21374318kn == null || !c21374318kn.isPlaying()) {
                RecyclerView.ViewHolder viewHolder2 = this.LLIZLLLIL;
                if (!(viewHolder2 instanceof C21374218km) || (c21374218km = (C21374218km) viewHolder2) == null || !c21374218km.isPlaying()) {
                    z = false;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playLastVideoItem, lastPlaying: ");
            sbLIZ.append(this.LLIZLLLIL);
            sbLIZ.append(", lastPlayingIsPlaying: ");
            sbLIZ.append(z);
            sbLIZ.append("isLoading: ");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ("GameLiveBottombarVideoMixAdapter", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                return;
            }
            C786410Ut5.LJLIIL(500L, this.LLJI, new ARunnableS132S0100000_32(this, 80));
        }
    }

    public final C331200Cyc LLLFZ() {
        InterfaceC21374418ko interfaceC21374418ko;
        List<AbstractC21148617pU> list = this.LLILLJJLI;
        boolean z = this.LLILZ;
        ArrayList arrayList = new ArrayList();
        for (AbstractC21148617pU abstractC21148617pU : list) {
            if (abstractC21148617pU instanceof C21148517pT) {
                interfaceC21374418ko = ((C21148517pT) abstractC21148617pU).LIZ;
            } else {
                if (!(abstractC21148617pU instanceof C21148717pV)) {
                    throw new C1954807lC();
                }
                interfaceC21374418ko = ((C21148717pV) abstractC21148617pU).LIZ;
            }
            arrayList.add(interfaceC21374418ko);
        }
        return new C331200Cyc(z, arrayList);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size() + 1;
    }

    @Override // X.InterfaceC483930IyN
    public final void onDestroy() {
        Iterator<WeakReference<InterfaceC475720Il8>> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            InterfaceC475720Il8 interfaceC475720Il8 = it2.next().get();
            if (interfaceC475720Il8 != null) {
                interfaceC475720Il8.release();
            }
        }
        this.LLILZLL.clear();
        Iterator<WeakReference<InterfaceC21374518kp>> it3 = this.LLIZ.iterator();
        while (it3.hasNext()) {
            InterfaceC21374518kp interfaceC21374518kp = it3.next().get();
            if (interfaceC21374518kp != null) {
                interfaceC21374518kp.release();
            }
        }
        this.LLIZ.clear();
    }

    @Override // X.InterfaceC483930IyN
    public final boolean LLIIJI() {
        return System.currentTimeMillis() - this.LLILZIL > ((long) GameLiveBottombarMixWaterfallFlowSetting.refreshInterval) * 1000;
    }

    @Override // X.InterfaceC483930IyN
    public final boolean LJJJJLL() {
        return this.LLILZ;
    }

    public C21374118kl(Lifecycle lifecycle) {
        this.LL = lifecycle;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= ((ArrayList) this.LLILLJJLI).size()) {
            return 2;
        }
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        if (obj instanceof C21148517pT) {
            return 0;
        }
        if (obj instanceof C21148717pV) {
            return 1;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        int iHashCode;
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        if (context != null) {
            iHashCode = context.hashCode();
        } else {
            iHashCode = 0;
        }
        this.LLJ = iHashCode;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        InterfaceC21374418ko interfaceC21374418ko;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Long lLJIILIIL3;
        InterfaceC21374418ko interfaceC21374418ko2;
        InterfaceC21374418ko interfaceC21374418ko3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        Long lLJIILIIL4;
        Long lLJIILIIL5;
        Long lLJIILIIL6;
        InterfaceC21374418ko interfaceC21374418ko4;
        Room roomLJIIIIZZ;
        String string;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C21374318kn) {
            C21374318kn c21374318kn = (C21374318kn) viewHolder;
            C21148517pT c21148517pT = c21374318kn.LLILLJJLI;
            if (c21148517pT != null && (interfaceC21374418ko4 = c21148517pT.LIZ) != null && (roomLJIIIIZZ = interfaceC21374418ko4.LJIIIIZZ()) != null) {
                Map<String, String> logExtra = c21148517pT.LIZ.getLogExtra();
                HashMap map = new HashMap();
                User owner = roomLJIIIIZZ.getOwner();
                if (owner == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
                    string = "";
                }
                map.put("anchor_id", string);
                map.put("room_id", String.valueOf(roomLJIIIIZZ.getId()));
                String str = logExtra.get("tag_name");
                if (str == null) {
                    str = "";
                }
                map.put("game_name", str);
                map.put("page_type", "bottombar_feed");
                String str2 = logExtra.get("bottombar_content_type");
                if (str2 == null) {
                    str2 = "";
                }
                map.put("bottom_bar_type", str2);
                String str3 = logExtra.get("bottombar_content");
                if (str3 == null) {
                    str3 = "";
                }
                map.put("bottombar_content", str3);
                String str4 = logExtra.get("related_from_request_id");
                if (str4 == null) {
                    str4 = "";
                }
                map.put("related_from_request_id", str4);
                String str5 = logExtra.get("related_from_video_id");
                if (str5 == null) {
                    str5 = "";
                }
                map.put("related_from_video_id", str5);
                map.put("btn_name", "live_room");
                map.put("is_live", "1");
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bottombar_live_rec_show");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
            }
            if (this.LLJ != LLJIJIL) {
                C21148517pT c21148517pT2 = c21374318kn.LLILLJJLI;
                if (c21148517pT2 != null && (interfaceC21374418ko3 = c21148517pT2.LIZ) != null) {
                    Map<String, String> logExtra2 = interfaceC21374418ko3.getLogExtra();
                    HashMap map2 = new HashMap();
                    map2.put("page_type", "mix_feed");
                    String str6 = logExtra2.get("related_from_video_id");
                    if (str6 == null) {
                        str6 = "";
                    }
                    map2.put("related_from_video_id", str6);
                    String str7 = logExtra2.get("bottombar_content_type");
                    if (str7 == null) {
                        str7 = "";
                    }
                    map2.put("bottom_bar_type", str7);
                    String str8 = logExtra2.get("click_timestamp");
                    if (str8 != null && (lLJIILIIL6 = C2095008Iq.LJIILIIL(str8)) != null) {
                        jLongValue4 = lLJIILIIL6.longValue();
                    } else {
                        jLongValue4 = 0;
                    }
                    String str9 = logExtra2.get("request_timestamp");
                    if (str9 != null && (lLJIILIIL5 = C2095008Iq.LJIILIIL(str9)) != null) {
                        jLongValue5 = lLJIILIIL5.longValue();
                    } else {
                        jLongValue5 = 0;
                    }
                    String str10 = logExtra2.get("request_success_timestamp");
                    if (str10 != null && (lLJIILIIL4 = C2095008Iq.LJIILIIL(str10)) != null) {
                        jLongValue6 = lLJIILIIL4.longValue();
                    } else {
                        jLongValue6 = 0;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    map2.put("state_1_duration", String.valueOf(jLongValue5 - jLongValue4));
                    map2.put("state_2_duration", String.valueOf(jLongValue6 - jLongValue5));
                    map2.put("state_3_duration", String.valueOf(jCurrentTimeMillis - jLongValue6));
                    map2.put("duration", String.valueOf(jCurrentTimeMillis - jLongValue4));
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_bottombar_double_column_page_show");
                    c474500IjALIZ2.LJJIIZI(map2);
                    c474500IjALIZ2.LIZ();
                }
                LLJIJIL = this.LLJ;
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C21374218km)) {
            return;
        }
        C21374218km c21374218km = (C21374218km) viewHolder;
        C21148717pV c21148717pV = c21374218km.LLILLJJLI;
        if (c21148717pV != null && (interfaceC21374418ko2 = c21148717pV.LIZ) != null) {
            Map<String, String> logExtra3 = interfaceC21374418ko2.getLogExtra();
            HashMap map3 = new HashMap();
            map3.put("anchor_id", interfaceC21374418ko2.LJIIJ());
            String str11 = logExtra3.get("tag_name");
            if (str11 == null) {
                str11 = "";
            }
            map3.put("game_name", str11);
            map3.put("page_type", "bottombar_feed");
            String str12 = logExtra3.get("bottombar_content_type");
            if (str12 == null) {
                str12 = "";
            }
            map3.put("bottom_bar_type", str12);
            String str13 = logExtra3.get("bottombar_content");
            if (str13 == null) {
                str13 = "";
            }
            map3.put("bottombar_content", str13);
            String str14 = logExtra3.get("related_from_request_id");
            if (str14 == null) {
                str14 = "";
            }
            map3.put("related_from_request_id", str14);
            String str15 = logExtra3.get("related_from_video_id");
            if (str15 == null) {
                str15 = "";
            }
            map3.put("related_from_video_id", str15);
            map3.put("btn_name", "video");
            String str16 = logExtra3.get("bottombar_content_tag");
            if (str16 == null) {
                str16 = "";
            }
            map3.put("bottombar_content_tag", str16);
            map3.put("is_live", CardStruct.IStatusCode.DEFAULT);
            map3.put("item_id", interfaceC21374418ko2.getAwemeId());
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_bottombar_live_rec_show");
            c474500IjALIZ3.LJJIIZI(map3);
            c474500IjALIZ3.LIZ();
        }
        if (this.LLJ == LLJIJIL) {
            return;
        }
        C21148717pV c21148717pV2 = c21374218km.LLILLJJLI;
        if (c21148717pV2 != null && (interfaceC21374418ko = c21148717pV2.LIZ) != null) {
            Map<String, String> logExtra4 = interfaceC21374418ko.getLogExtra();
            HashMap map4 = new HashMap();
            map4.put("page_type", "mix_feed");
            String str17 = logExtra4.get("related_from_video_id");
            if (str17 == null) {
                str17 = "";
            }
            map4.put("related_from_video_id", str17);
            String str18 = logExtra4.get("bottombar_content_type");
            if (str18 == null) {
                str18 = "";
            }
            map4.put("bottom_bar_type", str18);
            String str19 = logExtra4.get("click_timestamp");
            if (str19 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str19)) != null) {
                jLongValue = lLJIILIIL3.longValue();
            } else {
                jLongValue = 0;
            }
            String str20 = logExtra4.get("request_timestamp");
            if (str20 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str20)) != null) {
                jLongValue2 = lLJIILIIL2.longValue();
            } else {
                jLongValue2 = 0;
            }
            String str21 = logExtra4.get("request_success_timestamp");
            if (str21 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str21)) != null) {
                jLongValue3 = lLJIILIIL.longValue();
            } else {
                jLongValue3 = 0;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            map4.put("state_1_duration", String.valueOf(jLongValue2 - jLongValue));
            map4.put("state_2_duration", String.valueOf(jLongValue3 - jLongValue2));
            map4.put("state_3_duration", String.valueOf(jCurrentTimeMillis2 - jLongValue3));
            map4.put("duration", String.valueOf(jCurrentTimeMillis2 - jLongValue));
            C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_bottombar_double_column_page_show");
            c474500IjALIZ4.LJJIIZI(map4);
            c474500IjALIZ4.LIZ();
        }
        LLJIJIL = this.LLJ;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        View videoView;
        if (viewHolder instanceof C21374218km) {
            C21374218km c21374218km = (C21374218km) viewHolder;
            InterfaceC21374518kp interfaceC21374518kpI5 = c21374218km.I5();
            if (interfaceC21374518kpI5 != null) {
                interfaceC21374518kpI5.pause();
            }
            InterfaceC21374518kp interfaceC21374518kpI52 = c21374218km.I5();
            if (interfaceC21374518kpI52 != null) {
                videoView = interfaceC21374518kpI52.getVideoView();
            } else {
                videoView = null;
            }
            C786410Ut5.LJJJLZIJ(videoView, c21374218km.LLILZIL);
        }
        super.onViewRecycled(viewHolder);
    }

    @Override // X.InterfaceC483930IyN
    public final void LJJIJIL(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C21374218km c21374218km;
        C21374218km c21374218km2;
        C21374318kn c21374318kn;
        if (!GameLiveBottombarMixWaterfallFlowSetting.autoPlay) {
            return;
        }
        RecyclerView.ViewHolder viewHolder2 = this.LLIZLLLIL;
        C21374318kn c21374318kn2 = null;
        if (viewHolder instanceof C21374318kn) {
            c21374318kn2 = (C21374318kn) viewHolder;
        }
        boolean z2 = true;
        if ((c21374318kn2 != null && c21374318kn2.isPlaying()) || ((viewHolder instanceof C21374218km) && (c21374218km = (C21374218km) viewHolder) != null && c21374218km.isPlaying())) {
            z = true;
        } else {
            z = false;
        }
        if ((!(viewHolder2 instanceof C21374318kn) || (c21374318kn = (C21374318kn) viewHolder2) == null || !c21374318kn.isPlaying()) && (!(viewHolder2 instanceof C21374218km) || (c21374218km2 = (C21374218km) viewHolder2) == null || !c21374218km2.isPlaying())) {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playItemByIndex, index: ");
        sbLIZ.append(i);
        sbLIZ.append(", holder: ");
        sbLIZ.append(viewHolder);
        sbLIZ.append(", lastPlaying: ");
        sbLIZ.append(viewHolder2);
        sbLIZ.append(", viewHolderIsPlaying: ");
        sbLIZ.append(z);
        sbLIZ.append(", lastPlayingIsPlaying: ");
        sbLIZ.append(z2);
        sbLIZ.append(", isLoading: ");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("GameLiveBottombarVideoMixAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(viewHolder2, viewHolder) && z) {
            return;
        }
        if (!Intrinsics.LJFF(viewHolder2, viewHolder)) {
            LLILLL();
        }
        C786410Ut5.LJJZZIII(this.LLJI, new ARunnableS101S0200000_32(this, viewHolder, 52));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        View videoView;
        if (viewHolder instanceof C21374318kn) {
            C21374318kn c21374318kn = (C21374318kn) viewHolder;
            C21148517pT c21148517pT = (C21148517pT) ListProtector.get(this.LLILLJJLI, i);
            c21374318kn.getClass();
            InterfaceC21374418ko interfaceC21374418ko = c21148517pT.LIZ;
            c21374318kn.LLILLJJLI = c21148517pT;
            c21374318kn.LLILLL = i;
            List<String> listLJFF = interfaceC21374418ko.LJFF();
            C1324720kZq c1324720kZq = c21374318kn.LLILZIL;
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(listLJFF);
            c1324610kZfLIZJ.LJIL = true;
            c1324610kZfLIZJ.LJJI(c1324720kZq);
            c21374318kn.LLILZLL.setText(interfaceC21374418ko.LIZIZ());
            c21374318kn.LLIZ.setText(interfaceC21374418ko.LJII());
            List<String> listLJ = interfaceC21374418ko.LJ();
            C1324720kZq c1324720kZq2 = c21374318kn.LLIZLLLIL;
            C1324610kZf c1324610kZfLIZJ2 = C1819620xS4.LIZ().LIZJ(listLJ);
            c1324610kZfLIZJ2.LJIL = true;
            c1324610kZfLIZJ2.LJJI(c1324720kZq2);
            c21374318kn.LLJ.setText(interfaceC21374418ko.LJIIJJI());
            C786410Ut5.e8(c21374318kn.LLILZIL, new ACListenerS54S0201000_32(c21374318kn, i, c21148517pT, 2));
            C500260Jjc.LJIILIIL(c21374318kn.LLJI);
            C21374318kn.P5(c21374318kn.LLJI, InterfaceC1106030et7.C8.LIZIZ().booleanValue());
            InterfaceC475720Il8 interfaceC475720Il8I5 = c21374318kn.I5();
            if (interfaceC475720Il8I5 != null) {
                interfaceC475720Il8I5.LIZJ(c21374318kn.LLJI, c21374318kn.LLJIJIL);
            }
            C786410Ut5.a9(c21374318kn.LLJI, new ACListenerS166S0100000_32(c21374318kn, 96));
            return;
        }
        int i2 = 0;
        if (viewHolder instanceof C21374218km) {
            C21374218km c21374218km = (C21374218km) viewHolder;
            C21148717pV c21148717pV = (C21148717pV) ListProtector.get(this.LLILLJJLI, i);
            c21374218km.getClass();
            InterfaceC21374418ko interfaceC21374418ko2 = c21148717pV.LIZ;
            c21374218km.LLILLJJLI = c21148717pV;
            c21374218km.LLILLL = i;
            List<String> listLIZ = interfaceC21374418ko2.LIZ();
            ImageView imageView = c21374218km.LLILZLL;
            C1324610kZf c1324610kZfLIZJ3 = C1819620xS4.LIZ().LIZJ(listLIZ);
            c1324610kZfLIZJ3.LJIL = true;
            c1324610kZfLIZJ3.LJJI(imageView);
            List<String> listLIZJ = interfaceC21374418ko2.LIZJ();
            ImageView imageView2 = c21374218km.LLIZLLLIL;
            C1324610kZf c1324610kZfLIZJ4 = C1819620xS4.LIZ().LIZJ(listLIZJ);
            c1324610kZfLIZJ4.LJIL = true;
            c1324610kZfLIZJ4.LJJI(imageView2);
            c21374218km.LLIZ.setText(interfaceC21374418ko2.LJI());
            C21374218km.P5(c21374218km.LLIZ);
            c21374218km.LLJ.setText(interfaceC21374418ko2.LIZLLL());
            C21374218km.P5(c21374218km.LLJ);
            c21374218km.LLJI.setText(interfaceC21374418ko2.LJIIIZ());
            LiveIconView liveIconView = c21374218km.LLJIJIL;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_like;
            c419910GdJ.LJ = Integer.valueOf(C497740JfY.LIZLLL(R.attr.ezt, c21374218km.itemView.getContext()));
            liveIconView.setIcon(c419910GdJ.LIZ(c21374218km.itemView.getContext()));
            liveIconView.setIconTint(C497740JfY.LIZLLL(R.attr.ezt, liveIconView.getContext()));
            C786410Ut5.Q7(c21374218km.LLILZLL, new ACListenerS54S0201000_32(c21374218km, i, c21148717pV, 3));
            InterfaceC21374518kp interfaceC21374518kpI5 = c21374218km.I5();
            if (interfaceC21374518kpI5 != null && (videoView = interfaceC21374518kpI5.getVideoView()) != null) {
                C786410Ut5.I7(new ACListenerS54S0201000_32(c21374218km, i, c21148717pV, 4), videoView);
                c21374218km.LLILZIL.addView(videoView);
            }
            C500260Jjc.LLFFF(c21374218km.LLILZLL);
            C500260Jjc.LJIILLIIL(c21374218km.LLJILJIL);
            C500260Jjc.LJIILLIIL(c21374218km.LLJILJILJ);
            InterfaceC21374518kp interfaceC21374518kpI52 = c21374218km.I5();
            if (interfaceC21374518kpI52 != null) {
                interfaceC21374518kpI52.LJIIIZ(interfaceC21374418ko2);
            }
            InterfaceC21374518kp interfaceC21374518kpI53 = c21374218km.I5();
            if (interfaceC21374518kpI53 != null) {
                interfaceC21374518kpI53.LIZIZ(i);
            }
            InterfaceC21374518kp interfaceC21374518kpI54 = c21374218km.I5();
            if (interfaceC21374518kpI54 != null) {
                interfaceC21374518kpI54.setLogExtras(C2097608Jq.LJIIJ(new Pair("index", String.valueOf(i)), new Pair("item_type", "video")));
            }
            InterfaceC21374518kp interfaceC21374518kpI55 = c21374218km.I5();
            if (interfaceC21374518kpI55 != null) {
                interfaceC21374518kpI55.LIZJ(c21374218km.LLJILJIL, c21374218km.LLJILJILJ);
            }
            InterfaceC21374518kp interfaceC21374518kpI56 = c21374218km.I5();
            if (interfaceC21374518kpI56 != null) {
                interfaceC21374518kpI56.LIZ(InterfaceC1106030et7.C8.LIZIZ().booleanValue());
            }
            c21374218km.S5();
            C786410Ut5.a9(c21374218km.LLJILJIL, new ACListenerS166S0100000_32(c21374218km, 97));
            return;
        }
        if (!(viewHolder instanceof C21374618kq)) {
            return;
        }
        boolean z = this.LLILZ;
        View view = ((C21374618kq) viewHolder).LL;
        if (!z) {
            i2 = 4;
        }
        C786410Ut5.LJLLLLLL(i2, view);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c21374318kn;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i != 0) {
            if (i == 1 || i != 2) {
                c21374318kn = new C21374218km(C786410Ut5.Td(layoutInflaterNe, R.layout.gmr, viewGroup, false), this);
            } else {
                c21374318kn = new C21374618kq(C786410Ut5.Td(layoutInflaterNe, R.layout.gm9, viewGroup, false));
            }
        } else {
            c21374318kn = new C21374318kn(C786410Ut5.Td(layoutInflaterNe, R.layout.gmq, viewGroup, false), this);
        }
        try {
            View view = c21374318kn.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c21374318kn.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c21374318kn.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c21374318kn.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c21374318kn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c21374318kn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c21374318kn.getClass().getName();
        return c21374318kn;
    }

    @Override // X.InterfaceC483930IyN
    public final void LJZI(Context context, Map<String, String> map, String str, String str2, long j, boolean z, InterfaceC475680Il4 interfaceC475680Il4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadFeedData, isRefresh: ");
        sbLIZ.append(z);
        sbLIZ.append(", hasMore: ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("GameLiveBottombarVideoMixAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("safeClearAdapter old size: ");
            sbLIZ2.append(((ArrayList) this.LLILLJJLI).size());
            C20441214yg.LIZIZ("GameLiveBottombarVideoMixAdapter", C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.LJJZZIII(this.LLJI, new ARunnableS132S0100000_32(this, 82));
        } else if (!this.LLILZ) {
            return;
        }
        InterfaceC331230Cyf interfaceC331230CyfK31 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).K31();
        if (interfaceC331230CyfK31 == null) {
            return;
        }
        this.LLILLL = true;
        interfaceC331230CyfK31.LIZIZ(map, str, str2, z, new AwS83S0210000_32(this, z, interfaceC475680Il4, 2));
    }
}
