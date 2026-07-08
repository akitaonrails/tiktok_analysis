package X;

import Y.AfS176S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.competition.core.timer.CompetitionCountTimeEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.room.FollowAnchorStateChangeEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostTakeStagePerformerTextWidthBugfix;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982830bgP extends AbstractC982270bfV {
    public C19QH LLIZLLLIL;
    public final Map<Long, C983660bhk> LLJ;
    public C16F5 LLJI;
    public final C11NJ LLJIJIL;
    public List<C954460awe> LLJILJIL;
    public List<C954460awe> LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.AbstractC982270bfV
    public final String LJIIL() {
        return "TakeTheStageBarLeftComponent";
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIJ() {
        super.LJIIJ();
        this.LLJIJIL.dispose();
        this.LLIZ = false;
        this.LLJILLL = true;
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIZILJ() {
        super.LJIIZILJ();
        Iterator it2 = ((LinkedHashMap) this.LLJ).entrySet().iterator();
        while (it2.hasNext()) {
            C16F5 c16f5 = ((C983660bhk) ((Map.Entry) it2.next()).getValue()).LIZIZ;
            if (c16f5 != null) {
                c16f5.setText("00:00");
            }
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.DQ2(CompetitionCountTimeEvent.class, this, new AwS594S0100000_15(this, 974));
        }
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977430bXh
    public final void onUnload() {
        DataChannel dataChannel;
        super.onUnload();
        Iterator it2 = ((LinkedHashMap) this.LLJ).values().iterator();
        while (it2.hasNext()) {
            C500320Jji c500320Jji = ((C983660bhk) it2.next()).LIZJ;
            C11JL c11jl = c500320Jji.LIZLLL;
            if (c11jl != null) {
                c11jl.dispose();
            }
            C11JF c11jf = c500320Jji.LJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            View view = c500320Jji.LIZ;
            if (view != null && (dataChannel = c500320Jji.LIZJ) != null) {
                dataChannel.zQ2(view);
            }
        }
        ((LinkedHashMap) this.LLJ).clear();
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        C19QH c19qh;
        super.LIZLLL(matchBaseWidget);
        View view = matchBaseWidget.LL;
        C16F5 c16f5 = null;
        if (view != null) {
            c19qh = (C19QH) view.findViewById(R.id.x32);
        } else {
            c19qh = null;
        }
        this.LLIZLLLIL = c19qh;
        if (c19qh != null) {
            c16f5 = (C16F5) c19qh.findViewById(R.id.x34);
        }
        this.LLJI = c16f5;
    }

    @Override // X.AbstractC982270bfV
    public final void LJIILL(boolean z) {
        super.LJIILL(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("èèèèèèèèè start anim:");
        sbLIZ.append(z);
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C500260Jjc.LLFFF(this.LLIZLLLIL);
            C19QH c19qh = this.LLIZLLLIL;
            if (c19qh != null) {
                C16F5 c16f5 = this.LLJI;
                if (c16f5 == null) {
                    return;
                } else {
                    c19qh.LIZIZ(400L, 630L, c16f5);
                }
            }
            C19QH c19qh2 = this.LLIZLLLIL;
            if (c19qh2 != null) {
                c19qh2.LIZ(new C983850bi3(500L), 1170L);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        C19QH c19qh3 = this.LLIZLLLIL;
        if (c19qh3 != null) {
            C16F5 c16f52 = this.LLJI;
            if (c16f52 == null) {
                return;
            } else {
                c19qh3.LIZIZ(0L, 0L, c16f52);
            }
        }
        C19QH c19qh4 = this.LLIZLLLIL;
        if (c19qh4 != null) {
            c19qh4.LIZ(new C983850bi3(0L), 0L);
        }
    }

    @Override // X.AbstractC982270bfV
    public final void LJIJI(List<C954460awe> list) {
        ConstraintLayout constraintLayout;
        View viewFindViewById;
        C19ME c19me;
        LJIJJLI(list);
        int i = 1;
        int size = list.size() - 1;
        if (size >= 1) {
            i = size;
        }
        C19QH c19qh = this.LLIZLLLIL;
        Context context = null;
        if (c19qh != null) {
            context = c19qh.getContext();
        }
        int iLIZIZ = C465640INu.LIZIZ(context);
        if (iLIZIZ <= 0) {
            LJIILJJIL("resizeAnchorNameViewWidth return due to screenWidth is 0");
            return;
        }
        float f = C983090bgp.LLIZLLLIL;
        int iLIZ = C439101nJ.LIZ(116);
        float f2 = f + ((iLIZ - r1) / 2) + C983090bgp.LLJILJIL + (i * (C983090bgp.LLJIJIL + C983090bgp.LLJI)) + C983090bgp.LLJ;
        float f3 = iLIZIZ - f2;
        C19QH c19qh2 = this.LLIZLLLIL;
        if (c19qh2 != null) {
            Iterator<View> it2 = new C09RD(c19qh2).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                View view = (View) c09re.next();
                if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null && (viewFindViewById = constraintLayout.findViewById(R.id.x3j)) != null) {
                    int iLIZ2 = (int) (f3 - C439101nJ.LIZ(18));
                    if (CoHostTakeStagePerformerTextWidthBugfix.INSTANCE.isEnable()) {
                        C19MB c19mb = new C19MB();
                        c19mb.LJII(constraintLayout);
                        c19mb.LJIILIIL(viewFindViewById.getId(), iLIZ2);
                        c19mb.LIZIZ(constraintLayout);
                    } else {
                        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                            c19me.matchConstraintMaxWidth = iLIZ2;
                        }
                        viewFindViewById.requestLayout();
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resizeAnchorNameViewWidth rightComponentWidth:");
        sbLIZ.append(f2);
        sbLIZ.append(" leftWidth:");
        sbLIZ.append(f3);
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJJLI(List<C954460awe> list) {
        View viewFindViewById;
        if (this.LLJ.size() >= list.size()) {
            return;
        }
        int i = 10;
        if (!this.LLJ.isEmpty()) {
            StringBuilder sb = new StringBuilder("previous inflation is not enough, need to preparePerformerView again, cur size:");
            sb.append(((LinkedHashMap) this.LLJ).keySet());
            sb.append(", userList:");
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C954460awe> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
            sb.append(arrayList);
            LJIILJJIL(sb.toString());
        }
        for (C954460awe c954460awe : list) {
            if (((LinkedHashMap) this.LLJ).get(Long.valueOf(c954460awe.LJ)) == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(Integer.valueOf(R.id.m8r));
                linkedHashSet.add(Integer.valueOf(R.id.m8s));
                linkedHashSet.add(Integer.valueOf(R.id.m8t));
                linkedHashSet.add(Integer.valueOf(R.id.m8u));
                Iterator it3 = linkedHashSet.iterator();
                while (true) {
                    String str = null;
                    if (it3.hasNext()) {
                        int iIntValue = ((Number) it3.next()).intValue();
                        Iterator it4 = ((LinkedHashMap) this.LLJ).entrySet().iterator();
                        while (it4.hasNext()) {
                            View view = ((C983660bhk) ((Map.Entry) it4.next()).getValue()).LIZ;
                            if (view == null || view.getId() != iIntValue) {
                            }
                        }
                        C19QH c19qh = this.LLIZLLLIL;
                        if (c19qh != null && (viewFindViewById = c19qh.findViewById(iIntValue)) != null) {
                            C11JL c11jlLJJI = C950220apo.LJJI((C16F5) viewFindViewById.findViewById(R.id.x3j), c954460awe, "TakeTheStageBarScoreBarLeftComponent_updateDisplayId", "TakeTheStageBarScoreBarLeftComponent_updateDisplayId", null);
                            if (c11jlLJJI != null) {
                                this.LLJIJIL.LIZ(c11jlLJJI);
                            }
                            View viewFindViewById2 = viewFindViewById.findViewById(R.id.view_performer_follow);
                            Map<Long, C983660bhk> map = this.LLJ;
                            Long lValueOf = Long.valueOf(c954460awe.LJ);
                            C16F5 c16f5 = (C16F5) viewFindViewById.findViewById(R.id.xph);
                            DataChannel dataChannel = this.LLILLJJLI;
                            C500320Jji c500320Jji = new C500320Jji(viewFindViewById2, c954460awe, dataChannel);
                            if (viewFindViewById2 != null) {
                                C635860Owq.LIZ.LIZJ(C439101nJ.LIZ(i), viewFindViewById2);
                            }
                            ((C0J1N) C784440Upu.LIZ().LJ(C257100z3.class).LIZJ(C11RD.LIZJ(viewFindViewById2))).LIZ(new AfS176S0100000_7(c500320Jji, 174), new C09JN() { // from class: X.00L3
                                @Override // X.C09JN
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    C1C7U.LIZ("CoHostFollowViewHelper@79e1.init$3");
                                    C1C7U.LIZIZ("CoHostFollowViewHelper@79e1.init$3");
                                }
                            });
                            if (viewFindViewById2 != null && dataChannel != null) {
                                dataChannel.CQ2(FollowAnchorStateChangeEvent.class, viewFindViewById2, new AwS586S0100000_7(c500320Jji, 363));
                            }
                            c500320Jji.LIZ("TakeTheStageBarScoreBarLeftComponent_updateFollowStatus", "TakeTheStageBarScoreBarLeftComponent_updateFollowStatus", true);
                            map.put(lValueOf, new C983660bhk(viewFindViewById, c16f5, c500320Jji));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("preparePerformerView success for ");
                            C754570Tip c754570Tip = c954460awe.LJIJJ;
                            if (c754570Tip != null) {
                                str = c754570Tip.LIZIZ;
                            }
                            sbLIZ.append(str);
                            LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("preparePerformerView failed for ");
                        C754570Tip c754570Tip2 = c954460awe.LJIJJ;
                        if (c754570Tip2 != null) {
                            str = c754570Tip2.LIZIZ;
                        }
                        sbLIZ2.append(str);
                        LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            i = 10;
        }
    }

    public C982830bgP(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list) {
        super(z, dataChannel, awS559S0100000_15, list);
        this.LLJ = new LinkedHashMap();
        this.LLJIJIL = new C11NJ();
        this.LLJILLL = true;
    }

    @Override // X.InterfaceC977410bXf
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
        this.LLJILJIL = list3;
        this.LLJILJILJ = list4;
        LJIJJLI(list4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changePerformerSequence size:");
        sbLIZ.append(list4.size());
        sbLIZ.append(", hasFinalCallStart:");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isFirstChangePerformerSequence:");
        sbLIZ.append(this.LLJILLL);
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLIZ) {
            C500260Jjc.LLFFF(this.LLIZLLLIL);
            C954460awe c954460awe = (C954460awe) C13LP.LJJJLZIJ(0, list4);
            if (c954460awe != null) {
                C983660bhk c983660bhk = (C983660bhk) ((LinkedHashMap) this.LLJ).get(Long.valueOf(c954460awe.LJ));
                if (c983660bhk != null) {
                    if (this.LLJILLL) {
                        C19QH c19qh = this.LLIZLLLIL;
                        if (c19qh != null) {
                            View view = c983660bhk.LIZ;
                            if (view != null) {
                                c19qh.LIZIZ(0L, 0L, view);
                            } else {
                                return;
                            }
                        }
                    } else {
                        C16F5 c16f5 = c983660bhk.LIZIZ;
                        if (c16f5 != null) {
                            c16f5.setText("00:00");
                        }
                        C19QH c19qh2 = this.LLIZLLLIL;
                        if (c19qh2 != null) {
                            View view2 = c983660bhk.LIZ;
                            if (view2 == null) {
                                return;
                            } else {
                                c19qh2.LIZIZ(0L, 630L, view2);
                            }
                        }
                    }
                    this.LLJILLL = false;
                }
            }
        }
    }
}
