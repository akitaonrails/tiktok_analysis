package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.LivingNoticeManager;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS559S0100000_15;
import wh6.AbS505S0200000_15;

/* JADX INFO: renamed from: X.0bAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963190bAj extends AbstractC960400b6E<C963060bAW> {
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C1117360fBO LLIZ;

    @Override // X.AbstractC960400b6E
    public final void LLIILZL() {
        this.LL = false;
        this.LLIZ.LL.clear();
        this.LLIZ.notifyDataSetChanged();
    }

    @Override // X.AbstractC960400b6E
    public final String getName() {
        return "CoHostHistoryDetailListViewHolder";
    }

    public final void N5(C963060bAW c963060bAW) {
        int size = this.LLIZ.LL.size();
        boolean z = c963060bAW.LJI;
        Integer numValueOf = Integer.valueOf(R.attr.ezt);
        if (z) {
            ImageView imageView = (ImageView) this.LLILZIL.getValue();
            if (imageView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C439101nJ.LIZ(16);
                c419910GdJ.LIZJ = C439101nJ.LIZ(16);
                c419910GdJ.LIZ = R.raw.icon_chevron_up;
                c419910GdJ.LJ = numValueOf;
                imageView.setImageDrawable(c419910GdJ.LIZ(this.itemView.getContext()));
            }
            int size2 = c963060bAW.LJFF.size();
            if (size2 > size) {
                C1117360fBO c1117360fBO = this.LLIZ;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c963060bAW.LJFF);
                c1117360fBO.LL = arrayList;
                this.LLIZ.notifyItemRangeInserted(size, size2 - size);
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) this.LLILZIL.getValue();
        if (imageView2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZIZ = C439101nJ.LIZ(16);
            c419910GdJ2.LIZJ = C439101nJ.LIZ(16);
            c419910GdJ2.LIZ = R.raw.icon_chevron_down;
            c419910GdJ2.LJ = numValueOf;
            imageView2.setImageDrawable(c419910GdJ2.LIZ(this.itemView.getContext()));
        }
        int size3 = c963060bAW.LJ.size();
        if (size == size3) {
            return;
        }
        C1117360fBO c1117360fBO2 = this.LLIZ;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(c963060bAW.LJ);
        c1117360fBO2.LL = arrayList2;
        if (size > size3) {
            this.LLIZ.notifyItemRangeRemoved(size3, size - size3);
        } else {
            this.LLIZ.notifyItemRangeInserted(size, size3 - size);
        }
    }

    public C963190bAj(View view, RecyclerView.RecycledViewPool recycledViewPool) {
        super(view);
        this.LLILZ = C292401Bi.LIZ(new AwS559S0100000_15(view, 893));
        this.LLILZIL = C292401Bi.LIZ(new AwS559S0100000_15(view, 892));
        C01GW c01gwLIZ = C292401Bi.LIZ(new AwS559S0100000_15(view, 894));
        this.LLILZLL = c01gwLIZ;
        C1117360fBO c1117360fBO = new C1117360fBO();
        this.LLIZ = c1117360fBO;
        RecyclerView recyclerView = (RecyclerView) c01gwLIZ.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(c1117360fBO);
        }
        RecyclerView recyclerView2 = (RecyclerView) c01gwLIZ.getValue();
        if (recyclerView2 != null) {
            LivingNoticeManager livingNoticeManager = new LivingNoticeManager(view.getContext());
            livingNoticeManager.setOrientation(1);
            recyclerView2.setLayoutManager(livingNoticeManager);
        }
        RecyclerView recyclerView3 = (RecyclerView) c01gwLIZ.getValue();
        if (recyclerView3 != null) {
            C15EQ c15eq = new C15EQ();
            c15eq.LLIZ = false;
            recyclerView3.setItemAnimator(c15eq);
        }
        RecyclerView recyclerView4 = (RecyclerView) c01gwLIZ.getValue();
        if (recyclerView4 != null) {
            recyclerView4.setRecycledViewPool(recycledViewPool);
        }
        RecyclerView recyclerView5 = (RecyclerView) c01gwLIZ.getValue();
        if (recyclerView5 != null) {
            new C955510ayL(recyclerView5, null);
        }
        c1117360fBO.LLLI(C246300xJ.class, new AbstractC960410b6F<C246300xJ, C963210bAl>() { // from class: X.0bAk
            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostHistoryDetailMatchViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gs9, viewGroup, false);
                return new AbstractC960400b6E<C246300xJ>(viewTd) { // from class: X.0bAl
                    public final C01GW LLILZ;
                    public final C01GW LLILZIL;
                    public final C01GW LLILZLL;
                    public final C01GW LLIZ;
                    public final C01GW LLIZLLLIL;
                    public final C01GW LLJ;
                    public final C01GW LLJI;
                    public final C01GW LLJIJIL;
                    public final C01GW LLJILJIL;

                    @Override // X.AbstractC960400b6E
                    public final String getName() {
                        return "CoHostHistoryDetailMatchViewHolder";
                    }

                    public final View N5() {
                        return (View) this.LLILZIL.getValue();
                    }

                    public final View P5() {
                        return (View) this.LLIZ.getValue();
                    }

                    public final View R5() {
                        return (View) this.LLJ.getValue();
                    }

                    public final C1099610eil S5() {
                        return (C1099610eil) this.LLILZLL.getValue();
                    }

                    public final C1099610eil T5() {
                        return (C1099610eil) this.LLIZLLLIL.getValue();
                    }

                    public final C1099610eil U5() {
                        return (C1099610eil) this.LLJI.getValue();
                    }

                    public final C16F5 V5() {
                        return (C16F5) this.LLJIJIL.getValue();
                    }

                    {
                        super(viewTd);
                        this.LLILZ = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 901));
                        this.LLILZIL = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 895));
                        this.LLILZLL = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 898));
                        this.LLIZ = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 896));
                        this.LLIZLLLIL = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 899));
                        this.LLJ = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 897));
                        this.LLJI = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 900));
                        this.LLJIJIL = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 902));
                        this.LLJILJIL = C292401Bi.LIZ(new AwS559S0100000_15(viewTd, 903));
                    }

                    public static void W5(C1099610eil c1099610eil, Room room) {
                        ImageModel avatarThumb;
                        if (room != null) {
                            User owner = room.getOwner();
                            if (owner != null) {
                                avatarThumb = owner.getAvatarThumb();
                            } else {
                                avatarThumb = null;
                            }
                            C1121670fIL.LJIILIIL(c1099610eil, avatarThumb, -1, -1, R.drawable.el_);
                            C500260Jjc.LLFFF(c1099610eil);
                            return;
                        }
                        C500260Jjc.LJIILIIL(c1099610eil);
                    }

                    @Override // X.AbstractC960400b6E
                    public final void I5(List list, int i, Object obj) {
                        Room room;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list2;
                        CohostHistoryResponse.MatchRecord.Team.User user;
                        long j;
                        Room room2;
                        Room room3;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list3;
                        CohostHistoryResponse.MatchRecord.Team.User user2;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list4;
                        CohostHistoryResponse.MatchRecord.Team.User user3;
                        long j2;
                        Room room4;
                        long j3;
                        Room room5;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list5;
                        CohostHistoryResponse.MatchRecord.Team.User user4;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list6;
                        CohostHistoryResponse.MatchRecord.Team.User user5;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list7;
                        CohostHistoryResponse.MatchRecord.Team.User user6;
                        long j4;
                        Room room6;
                        long j5;
                        Room room7;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list8;
                        CohostHistoryResponse.MatchRecord.Team.User user7;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list9;
                        CohostHistoryResponse.MatchRecord.Team.User user8;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list10;
                        CohostHistoryResponse.MatchRecord.Team.User user9;
                        long j6;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list11;
                        int i2;
                        long j7;
                        CohostHistoryResponse.MatchRecord.Team team;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list12;
                        CohostHistoryResponse.MatchRecord.Team.User user10;
                        CohostHistoryResponse.MatchRecord.Team team2;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list13;
                        CohostHistoryResponse.MatchRecord.Team.User user11;
                        long j8;
                        long j9;
                        CohostHistoryResponse.MatchRecord.Team team3;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list14;
                        CohostHistoryResponse.MatchRecord.Team.User user12;
                        CohostHistoryResponse.MatchRecord.Team team4;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list15;
                        CohostHistoryResponse.MatchRecord.Team.User user13;
                        CohostHistoryResponse.MatchRecord.Team team5;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list16;
                        CohostHistoryResponse.MatchRecord.Team.User user14;
                        long j10;
                        Room room8;
                        long j11;
                        Room room9;
                        CohostHistoryResponse.MatchRecord.Team team6;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list17;
                        CohostHistoryResponse.MatchRecord.Team.User user15;
                        CohostHistoryResponse.MatchRecord.Team team7;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list18;
                        CohostHistoryResponse.MatchRecord.Team.User user16;
                        CohostHistoryResponse.MatchRecord.Team team8;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list19;
                        CohostHistoryResponse.MatchRecord.Team.User user17;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list20;
                        int size;
                        long j12;
                        Room room10;
                        Room room11;
                        CohostHistoryResponse.MatchRecord.Team team9;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list21;
                        CohostHistoryResponse.MatchRecord.Team.User user18;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list22;
                        CohostHistoryResponse.MatchRecord.Team.User user19;
                        long j13;
                        Room room12;
                        long j14;
                        Room room13;
                        CohostHistoryResponse.MatchRecord.Team team10;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list23;
                        CohostHistoryResponse.MatchRecord.Team.User user20;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list24;
                        CohostHistoryResponse.MatchRecord.Team.User user21;
                        List<CohostHistoryResponse.MatchRecord.Team.User> list25;
                        CohostHistoryResponse.MatchRecord.Team.User user22;
                        C246300xJ c246300xJ = (C246300xJ) obj;
                        int i3 = c246300xJ.LJIIIZ.matchType;
                        W5((C1099610eil) this.LLILZ.getValue(), C950220apo.LIZJ());
                        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1VN;
                        long j15 = -1;
                        Room room14 = null;
                        if (i3 == enumC919170a1j.getType()) {
                            CohostHistoryResponse.MatchRecord.Team team11 = c246300xJ.LJIIIZ.myTeam;
                            if (team11 != null && (list20 = team11.users) != null && (size = list20.size()) != 0) {
                                if (size != 1) {
                                    if (size == 2) {
                                        C500260Jjc.LJIILIIL(N5());
                                        C1099610eil c1099610eilS5 = S5();
                                        Map<Long, CohostHistoryResponse.UserInfo> map = c246300xJ.LJ;
                                        CohostHistoryResponse.MatchRecord.Team team12 = c246300xJ.LJIIIZ.myTeam;
                                        if (team12 != null && (list25 = team12.users) != null && (user22 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list25)) != null) {
                                            j13 = user22.userId;
                                        } else {
                                            j13 = -1;
                                        }
                                        CohostHistoryResponse.UserInfo userInfo = map.get(Long.valueOf(j13));
                                        if (userInfo != null) {
                                            room12 = userInfo.room;
                                        } else {
                                            room12 = null;
                                        }
                                        W5(c1099610eilS5, room12);
                                        C500260Jjc.LJIILIIL(P5());
                                        C1099610eil c1099610eilT5 = T5();
                                        Map<Long, CohostHistoryResponse.UserInfo> map2 = c246300xJ.LJ;
                                        CohostHistoryResponse.MatchRecord.Team team13 = c246300xJ.LJIIIZ.myTeam;
                                        if (team13 != null && (list24 = team13.users) != null && (user21 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(1, list24)) != null) {
                                            j14 = user21.userId;
                                        } else {
                                            j14 = -1;
                                        }
                                        CohostHistoryResponse.UserInfo userInfo2 = map2.get(Long.valueOf(j14));
                                        if (userInfo2 != null) {
                                            room13 = userInfo2.room;
                                        } else {
                                            room13 = null;
                                        }
                                        W5(c1099610eilT5, room13);
                                        C500260Jjc.LLFFF(R5());
                                        C1099610eil c1099610eilU5 = U5();
                                        Map<Long, CohostHistoryResponse.UserInfo> map3 = c246300xJ.LJ;
                                        List<CohostHistoryResponse.MatchRecord.Team> list26 = c246300xJ.LJIIIZ.opposingTeams;
                                        if (list26 != null && (team10 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, list26)) != null && (list23 = team10.users) != null && (user20 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list23)) != null) {
                                            j15 = user20.userId;
                                        }
                                        CohostHistoryResponse.UserInfo userInfo3 = map3.get(Long.valueOf(j15));
                                        if (userInfo3 != null) {
                                            room14 = userInfo3.room;
                                        }
                                        W5(c1099610eilU5, room14);
                                    }
                                } else {
                                    C500260Jjc.LJIILIIL(N5());
                                    C1099610eil c1099610eilS52 = S5();
                                    Map<Long, CohostHistoryResponse.UserInfo> map4 = c246300xJ.LJ;
                                    CohostHistoryResponse.MatchRecord.Team team14 = c246300xJ.LJIIIZ.myTeam;
                                    if (team14 != null && (list22 = team14.users) != null && (user19 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list22)) != null) {
                                        j12 = user19.userId;
                                    } else {
                                        j12 = -1;
                                    }
                                    CohostHistoryResponse.UserInfo userInfo4 = map4.get(Long.valueOf(j12));
                                    if (userInfo4 != null) {
                                        room10 = userInfo4.room;
                                    } else {
                                        room10 = null;
                                    }
                                    W5(c1099610eilS52, room10);
                                    C500260Jjc.LLFFF(P5());
                                    C1099610eil c1099610eilT52 = T5();
                                    Map<Long, CohostHistoryResponse.UserInfo> map5 = c246300xJ.LJ;
                                    List<CohostHistoryResponse.MatchRecord.Team> list27 = c246300xJ.LJIIIZ.opposingTeams;
                                    if (list27 != null && (team9 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, list27)) != null && (list21 = team9.users) != null && (user18 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list21)) != null) {
                                        j15 = user18.userId;
                                    }
                                    CohostHistoryResponse.UserInfo userInfo5 = map5.get(Long.valueOf(j15));
                                    if (userInfo5 != null) {
                                        room11 = userInfo5.room;
                                    } else {
                                        room11 = null;
                                    }
                                    W5(c1099610eilT52, room11);
                                    C500260Jjc.LJIILIIL(R5());
                                    W5(U5(), null);
                                }
                            } else {
                                C500260Jjc.LLFFF(N5());
                                C1099610eil c1099610eilS53 = S5();
                                Map<Long, CohostHistoryResponse.UserInfo> map6 = c246300xJ.LJ;
                                List<CohostHistoryResponse.MatchRecord.Team> list28 = c246300xJ.LJIIIZ.opposingTeams;
                                if (list28 != null && (team8 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, list28)) != null && (list19 = team8.users) != null && (user17 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list19)) != null) {
                                    j10 = user17.userId;
                                } else {
                                    j10 = -1;
                                }
                                CohostHistoryResponse.UserInfo userInfo6 = map6.get(Long.valueOf(j10));
                                if (userInfo6 != null) {
                                    room8 = userInfo6.room;
                                } else {
                                    room8 = null;
                                }
                                W5(c1099610eilS53, room8);
                                C500260Jjc.LJIILIIL(P5());
                                C1099610eil c1099610eilT53 = T5();
                                Map<Long, CohostHistoryResponse.UserInfo> map7 = c246300xJ.LJ;
                                List<CohostHistoryResponse.MatchRecord.Team> list29 = c246300xJ.LJIIIZ.opposingTeams;
                                if (list29 != null && (team7 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, list29)) != null && (list18 = team7.users) != null && (user16 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(1, list18)) != null) {
                                    j11 = user16.userId;
                                } else {
                                    j11 = -1;
                                }
                                CohostHistoryResponse.UserInfo userInfo7 = map7.get(Long.valueOf(j11));
                                if (userInfo7 != null) {
                                    room9 = userInfo7.room;
                                } else {
                                    room9 = null;
                                }
                                W5(c1099610eilT53, room9);
                                C500260Jjc.LJIILIIL(R5());
                                C1099610eil c1099610eilU52 = U5();
                                Map<Long, CohostHistoryResponse.UserInfo> map8 = c246300xJ.LJ;
                                List<CohostHistoryResponse.MatchRecord.Team> list30 = c246300xJ.LJIIIZ.opposingTeams;
                                if (list30 != null && (team6 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, list30)) != null && (list17 = team6.users) != null && (user15 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(2, list17)) != null) {
                                    j15 = user15.userId;
                                }
                                CohostHistoryResponse.UserInfo userInfo8 = map8.get(Long.valueOf(j15));
                                if (userInfo8 != null) {
                                    room14 = userInfo8.room;
                                }
                                W5(c1099610eilU52, room14);
                            }
                        } else if (i3 == EnumC919170a1j.MATCH_TYPE_2V2.getType()) {
                            C500260Jjc.LJIILIIL(N5());
                            C1099610eil c1099610eilS54 = S5();
                            Map<Long, CohostHistoryResponse.UserInfo> map9 = c246300xJ.LJ;
                            CohostHistoryResponse.MatchRecord.Team team15 = c246300xJ.LJIIIZ.myTeam;
                            if (team15 != null && (list10 = team15.users) != null && (user9 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list10)) != null) {
                                j4 = user9.userId;
                            } else {
                                j4 = -1;
                            }
                            CohostHistoryResponse.UserInfo userInfo9 = map9.get(Long.valueOf(j4));
                            if (userInfo9 != null) {
                                room6 = userInfo9.room;
                            } else {
                                room6 = null;
                            }
                            W5(c1099610eilS54, room6);
                            C500260Jjc.LLFFF(P5());
                            C1099610eil c1099610eilT54 = T5();
                            Map<Long, CohostHistoryResponse.UserInfo> map10 = c246300xJ.LJ;
                            CohostHistoryResponse.MatchRecord.Team team16 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, c246300xJ.LJIIIZ.opposingTeams);
                            if (team16 != null && (list9 = team16.users) != null && (user8 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list9)) != null) {
                                j5 = user8.userId;
                            } else {
                                j5 = -1;
                            }
                            CohostHistoryResponse.UserInfo userInfo10 = map10.get(Long.valueOf(j5));
                            if (userInfo10 != null) {
                                room7 = userInfo10.room;
                            } else {
                                room7 = null;
                            }
                            W5(c1099610eilT54, room7);
                            C500260Jjc.LJIILIIL(R5());
                            C1099610eil c1099610eilU53 = U5();
                            Map<Long, CohostHistoryResponse.UserInfo> map11 = c246300xJ.LJ;
                            CohostHistoryResponse.MatchRecord.Team team17 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, c246300xJ.LJIIIZ.opposingTeams);
                            if (team17 != null && (list8 = team17.users) != null && (user7 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(1, list8)) != null) {
                                j15 = user7.userId;
                            }
                            CohostHistoryResponse.UserInfo userInfo11 = map11.get(Long.valueOf(j15));
                            if (userInfo11 != null) {
                                room14 = userInfo11.room;
                            }
                            W5(c1099610eilU53, room14);
                        } else if (i3 == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType()) {
                            int size2 = c246300xJ.LJIIIZ.opposingTeams.size();
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    C500260Jjc.LLFFF(N5());
                                    C1099610eil c1099610eilS55 = S5();
                                    Map<Long, CohostHistoryResponse.UserInfo> map12 = c246300xJ.LJ;
                                    CohostHistoryResponse.MatchRecord.Team team18 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, c246300xJ.LJIIIZ.opposingTeams);
                                    if (team18 != null && (list7 = team18.users) != null && (user6 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list7)) != null) {
                                        j2 = user6.userId;
                                    } else {
                                        j2 = -1;
                                    }
                                    CohostHistoryResponse.UserInfo userInfo12 = map12.get(Long.valueOf(j2));
                                    if (userInfo12 != null) {
                                        room4 = userInfo12.room;
                                    } else {
                                        room4 = null;
                                    }
                                    W5(c1099610eilS55, room4);
                                    C500260Jjc.LLFFF(P5());
                                    C1099610eil c1099610eilT55 = T5();
                                    Map<Long, CohostHistoryResponse.UserInfo> map13 = c246300xJ.LJ;
                                    CohostHistoryResponse.MatchRecord.Team team19 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(1, c246300xJ.LJIIIZ.opposingTeams);
                                    if (team19 != null && (list6 = team19.users) != null && (user5 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list6)) != null) {
                                        j3 = user5.userId;
                                    } else {
                                        j3 = -1;
                                    }
                                    CohostHistoryResponse.UserInfo userInfo13 = map13.get(Long.valueOf(j3));
                                    if (userInfo13 != null) {
                                        room5 = userInfo13.room;
                                    } else {
                                        room5 = null;
                                    }
                                    W5(c1099610eilT55, room5);
                                    C500260Jjc.LLFFF(R5());
                                    C1099610eil c1099610eilU54 = U5();
                                    Map<Long, CohostHistoryResponse.UserInfo> map14 = c246300xJ.LJ;
                                    CohostHistoryResponse.MatchRecord.Team team20 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(2, c246300xJ.LJIIIZ.opposingTeams);
                                    if (team20 != null && (list5 = team20.users) != null && (user4 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list5)) != null) {
                                        j15 = user4.userId;
                                    }
                                    CohostHistoryResponse.UserInfo userInfo14 = map14.get(Long.valueOf(j15));
                                    if (userInfo14 != null) {
                                        room14 = userInfo14.room;
                                    }
                                    W5(c1099610eilU54, room14);
                                }
                            } else {
                                C500260Jjc.LLFFF(N5());
                                C1099610eil c1099610eilS56 = S5();
                                Map<Long, CohostHistoryResponse.UserInfo> map15 = c246300xJ.LJ;
                                CohostHistoryResponse.MatchRecord.Team team21 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, c246300xJ.LJIIIZ.opposingTeams);
                                if (team21 != null && (list4 = team21.users) != null && (user3 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list4)) != null) {
                                    j = user3.userId;
                                } else {
                                    j = -1;
                                }
                                CohostHistoryResponse.UserInfo userInfo15 = map15.get(Long.valueOf(j));
                                if (userInfo15 != null) {
                                    room2 = userInfo15.room;
                                } else {
                                    room2 = null;
                                }
                                W5(c1099610eilS56, room2);
                                C500260Jjc.LLFFF(P5());
                                C1099610eil c1099610eilT56 = T5();
                                Map<Long, CohostHistoryResponse.UserInfo> map16 = c246300xJ.LJ;
                                CohostHistoryResponse.MatchRecord.Team team22 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(1, c246300xJ.LJIIIZ.opposingTeams);
                                if (team22 != null && (list3 = team22.users) != null && (user2 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list3)) != null) {
                                    j15 = user2.userId;
                                }
                                CohostHistoryResponse.UserInfo userInfo16 = map16.get(Long.valueOf(j15));
                                if (userInfo16 != null) {
                                    room3 = userInfo16.room;
                                } else {
                                    room3 = null;
                                }
                                W5(c1099610eilT56, room3);
                                C500260Jjc.LJIILIIL(R5());
                                W5(U5(), null);
                            }
                        } else if (i3 == EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
                            C500260Jjc.LJIILIIL(N5());
                            W5(S5(), null);
                            C500260Jjc.LLFFF(P5());
                            C1099610eil c1099610eilT57 = T5();
                            Map<Long, CohostHistoryResponse.UserInfo> map17 = c246300xJ.LJ;
                            CohostHistoryResponse.MatchRecord.Team team23 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, c246300xJ.LJIIIZ.opposingTeams);
                            if (team23 != null && (list2 = team23.users) != null && (user = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list2)) != null) {
                                j15 = user.userId;
                            }
                            CohostHistoryResponse.UserInfo userInfo17 = map17.get(Long.valueOf(j15));
                            if (userInfo17 != null) {
                                room = userInfo17.room;
                            } else {
                                room = null;
                            }
                            W5(c1099610eilT57, room);
                            C500260Jjc.LJIILIIL(R5());
                            W5(U5(), null);
                        }
                        int i4 = c246300xJ.LJIIIZ.result;
                        if (i4 != 0) {
                            if (i4 != 2) {
                                C16F5 c16f5V5 = V5();
                                if (c16f5V5 != null) {
                                    c16f5V5.setText(C497740JfY.LJIJI(2131851696));
                                }
                                C16F5 c16f5V52 = V5();
                                if (c16f5V52 != null) {
                                    c16f5V52.setTextColor(C497740JfY.LIZLLL(R.attr.ezs, this.itemView.getContext()));
                                }
                            } else {
                                C16F5 c16f5V53 = V5();
                                if (c16f5V53 != null) {
                                    c16f5V53.setText(C497740JfY.LJIJI(2131851698));
                                }
                                C16F5 c16f5V54 = V5();
                                if (c16f5V54 != null) {
                                    c16f5V54.setTextColor(C497740JfY.LIZLLL(R.attr.ezs, this.itemView.getContext()));
                                }
                            }
                        } else {
                            C16F5 c16f5V55 = V5();
                            if (c16f5V55 != null) {
                                c16f5V55.setText(C497740JfY.LJIJI(2131851697));
                            }
                            C16F5 c16f5V56 = V5();
                            if (c16f5V56 != null) {
                                c16f5V56.setTextColor(C497740JfY.LIZLLL(R.attr.eya, this.itemView.getContext()));
                            }
                        }
                        CohostHistoryResponse.MatchRecord matchRecord = c246300xJ.LJIIIZ;
                        int i5 = matchRecord.matchType;
                        CohostHistoryResponse.MatchRecord.Team.User user23 = matchRecord.myInfo;
                        long j16 = 0;
                        if (user23 != null) {
                            j6 = user23.points;
                        } else {
                            j6 = 0;
                        }
                        if (i5 != EnumC919170a1j.MATCH_TYPE_1V1.getType() && i5 != EnumC919170a1j.MATCH_TYPE_2V2.getType() && i5 != enumC919170a1j.getType()) {
                            if (i5 == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType()) {
                                int size3 = c246300xJ.LJIIIZ.opposingTeams.size();
                                if (size3 != 2) {
                                    if (size3 == 3) {
                                        List<CohostHistoryResponse.MatchRecord.Team> list31 = c246300xJ.LJIIIZ.opposingTeams;
                                        if (list31 != null && (team5 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, list31)) != null && (list16 = team5.users) != null && (user14 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list16)) != null) {
                                            j8 = user14.points;
                                        } else {
                                            j8 = 0;
                                        }
                                        List<CohostHistoryResponse.MatchRecord.Team> list32 = c246300xJ.LJIIIZ.opposingTeams;
                                        if (list32 != null && (team4 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(1, list32)) != null && (list15 = team4.users) != null && (user13 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list15)) != null) {
                                            j9 = user13.points;
                                        } else {
                                            j9 = 0;
                                        }
                                        List<CohostHistoryResponse.MatchRecord.Team> list33 = c246300xJ.LJIIIZ.opposingTeams;
                                        if (list33 != null && (team3 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(2, list33)) != null && (list14 = team3.users) != null && (user12 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list14)) != null) {
                                            j16 = user12.points;
                                        }
                                        TextView textView = (TextView) this.LLJILJIL.getValue();
                                        if (textView != null) {
                                            textView.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131851872), Arrays.copyOf(new Object[]{C1850730yGF.LJIIIIZZ(j6), C1850730yGF.LJIIIIZZ(j8), C1850730yGF.LJIIIIZZ(j9), C1850730yGF.LJIIIIZZ(j16)}, 4)));
                                        }
                                    }
                                } else {
                                    List<CohostHistoryResponse.MatchRecord.Team> list34 = c246300xJ.LJIIIZ.opposingTeams;
                                    if (list34 != null && (team2 = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(0, list34)) != null && (list13 = team2.users) != null && (user11 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list13)) != null) {
                                        j7 = user11.points;
                                    } else {
                                        j7 = 0;
                                    }
                                    List<CohostHistoryResponse.MatchRecord.Team> list35 = c246300xJ.LJIIIZ.opposingTeams;
                                    if (list35 != null && (team = (CohostHistoryResponse.MatchRecord.Team) C13LP.LJJJLZIJ(1, list35)) != null && (list12 = team.users) != null && (user10 = (CohostHistoryResponse.MatchRecord.Team.User) C13LP.LJJJLZIJ(0, list12)) != null) {
                                        j16 = user10.points;
                                    }
                                    TextView textView2 = (TextView) this.LLJILJIL.getValue();
                                    if (textView2 != null) {
                                        textView2.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131851871), Arrays.copyOf(new Object[]{C1850730yGF.LJIIIIZZ(j6), C1850730yGF.LJIIIIZZ(j7), C1850730yGF.LJIIIIZZ(j16)}, 3)));
                                    }
                                }
                            }
                        } else {
                            CohostHistoryResponse.MatchRecord.Team team24 = c246300xJ.LJIIIZ.myTeam;
                            if (team24 != null && (list11 = team24.users) != null) {
                                Iterator<CohostHistoryResponse.MatchRecord.Team.User> it2 = list11.iterator();
                                while (it2.hasNext()) {
                                    j6 += it2.next().points;
                                }
                            }
                            List<CohostHistoryResponse.MatchRecord.Team> list36 = c246300xJ.LJIIIZ.opposingTeams;
                            if (list36 != null) {
                                Iterator<CohostHistoryResponse.MatchRecord.Team> it3 = list36.iterator();
                                while (it3.hasNext()) {
                                    List<CohostHistoryResponse.MatchRecord.Team.User> list37 = it3.next().users;
                                    if (list37 != null) {
                                        Iterator<CohostHistoryResponse.MatchRecord.Team.User> it4 = list37.iterator();
                                        while (it4.hasNext()) {
                                            j16 += it4.next().points;
                                        }
                                    }
                                }
                            }
                            TextView textView3 = (TextView) this.LLJILJIL.getValue();
                            if (textView3 != null) {
                                textView3.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131851870), Arrays.copyOf(new Object[]{C1850730yGF.LJIIIIZZ(j6), C1850730yGF.LJIIIIZZ(j16)}, 2)));
                            }
                        }
                        View view2 = this.itemView;
                        int paddingLeft = view2.getPaddingLeft();
                        if (c246300xJ.LJIIIIZZ) {
                            i2 = 12;
                        } else {
                            i2 = 10;
                        }
                        view2.setPadding(paddingLeft, C439101nJ.LIZ(i2), this.itemView.getPaddingRight(), this.itemView.getPaddingBottom());
                    }
                };
            }
        });
        c1117360fBO.LLLI(C246400xK.class, new AbstractC960410b6F<C246400xK, C963220bAm>() { // from class: X.0bAn
            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostHistoryDetailTakeTheStageViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new AbstractC960400b6E<C246400xK>(C786410Ut5.Td(layoutInflater, R.layout.gs9, viewGroup, false)) { // from class: X.0bAm
                    public final C01GW LLILZ;
                    public final C01GW LLILZIL;
                    public final C01GW LLILZLL;
                    public final C01GW LLIZ;
                    public final C01GW LLIZLLLIL;
                    public final C01GW LLJ;
                    public final C01GW LLJI;
                    public final C01GW LLJIJIL;
                    public final C01GW LLJILJIL;

                    @Override // X.AbstractC960400b6E
                    public final String getName() {
                        return "CoHostHistoryDetailTakeTheStageViewHolder";
                    }

                    {
                        super(view);
                        this.LLILZ = C292401Bi.LIZ(new AwS559S0100000_15(view, 910));
                        this.LLILZIL = C292401Bi.LIZ(new AwS559S0100000_15(view, 904));
                        this.LLILZLL = C292401Bi.LIZ(new AwS559S0100000_15(view, 907));
                        this.LLIZ = C292401Bi.LIZ(new AwS559S0100000_15(view, 905));
                        this.LLIZLLLIL = C292401Bi.LIZ(new AwS559S0100000_15(view, 908));
                        this.LLJ = C292401Bi.LIZ(new AwS559S0100000_15(view, 906));
                        this.LLJI = C292401Bi.LIZ(new AwS559S0100000_15(view, 909));
                        this.LLJIJIL = C292401Bi.LIZ(new AwS559S0100000_15(view, 911));
                        this.LLJILJIL = C292401Bi.LIZ(new AwS559S0100000_15(view, 912));
                    }

                    public static void N5(C1099610eil c1099610eil, Room room, boolean z) {
                        ImageModel avatarThumb;
                        User owner;
                        if (z) {
                            if (room != null && (owner = room.getOwner()) != null) {
                                avatarThumb = owner.getAvatarThumb();
                            } else {
                                avatarThumb = null;
                            }
                            C1121670fIL.LJIILIIL(c1099610eil, avatarThumb, -1, -1, R.drawable.el_);
                            C500260Jjc.LLFFF(c1099610eil);
                            return;
                        }
                        C500260Jjc.LJIILIIL(c1099610eil);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x0129 A[LOOP:0: B:41:0x0123->B:43:0x0129, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x01af A[PHI: r5
                      0x01af: PHI (r5v1 com.bytedance.android.livesdkapi.depend.model.live.Room) = 
                      (r5v0 com.bytedance.android.livesdkapi.depend.model.live.Room)
                      (r5v6 com.bytedance.android.livesdkapi.depend.model.live.Room)
                     binds: [B:22:0x00b6, B:24:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x01b2  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x01b6  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x01fd  */
                    @Override // X.AbstractC960400b6E
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void I5(java.util.List r9, int r10, java.lang.Object r11) {
                        /*
                            Method dump skipped, instruction units count: 512
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C963220bAm.I5(java.util.List, int, java.lang.Object):void");
                    }
                };
            }
        });
    }

    @Override // X.AbstractC960400b6E
    public final void I5(List list, int i, Object obj) {
        C963060bAW c963060bAW = (C963060bAW) obj;
        if (list != null && list.size() > 0) {
            return;
        }
        N5(c963060bAW);
        View view = (View) this.LLILZ.getValue();
        if (view == null) {
            return;
        }
        C786410Ut5.I7(new AbS505S0200000_15(c963060bAW, this, 4), view);
    }
}
