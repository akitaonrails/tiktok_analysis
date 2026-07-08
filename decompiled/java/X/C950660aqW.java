package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0aqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950660aqW extends FrameLayout implements InterfaceC951640as6, InterfaceC2183161AcM {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final AwS629S0100000_15 LLILZ;
    public DataChannel LLILZIL;
    public final C1117360fBO LLILZLL;
    public final C410901il LLIZ;
    public C2183111AcH LLIZLLLIL;
    public C2183111AcH LLJ;
    public final AwS559S0100000_15 LLJI;
    public final AwS559S0100000_15 LLJIJIL;

    private final C16FV getSplitLineInit() {
        return (C16FV) this.LLILLJJLI.getValue();
    }

    private final C16FV getSplitLineIntermediate() {
        return (C16FV) this.LLILLL.getValue();
    }

    private final RunnableC781530UlD getUserListRecyclerView() {
        return (RunnableC781530UlD) this.LL.getValue();
    }

    @Override // X.InterfaceC2183161AcM
    public final void LIZIZ() {
        C955410ayB.LJI(C915980Zwa.LJIIIZ().LIZLLL(), "waitinglist_cancel", "active_invite_withdraw");
        C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.CANCEL_BUTTON_CLICKED, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getUserListRecyclerView().setLayoutManager(new GridLayoutManager(getContext(), C950220apo.LJIIJJI()));
        getUserListRecyclerView().setAdapter(this.LLILZLL);
        AbstractC21673719rz itemAnimator = getUserListRecyclerView().getItemAnimator();
        if (itemAnimator instanceof AbstractC21674919sB) {
            ((AbstractC21674919sB) itemAnimator).LLIZ = false;
        }
        RunnableC781530UlD userListRecyclerView = getUserListRecyclerView();
        final int iLIZIZ = (int) C497740JfY.LIZIZ(5.0f);
        userListRecyclerView.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0GiK
            public final int LL;

            {
                this.LL = iLIZIZ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (recyclerView.getChildAdapterPosition(view) != 0) {
                    rect.left = this.LL;
                }
            }
        });
        this.LLILZLL.LLLI(C954460awe.class, new AbstractC960410b6F<C954460awe, C951620as4>(this) { // from class: X.0as5
            public final InterfaceC951640as6 LIZIZ;

            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostInviteListMangePanelUserViewBinder";
            }

            {
                this.LIZIZ = this;
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C951620as4(C786410Ut5.Td(layoutInflater, R.layout.gsc, viewGroup, false), this.LIZIZ);
            }
        });
        this.LLILZLL.LLLI(C950680aqY.class, new AbstractC960410b6F<C950680aqY, C951660as8>() { // from class: X.0as7
            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostInviteListManagePanelEmptyUserViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gsb, viewGroup, false);
                return new AbstractC960400b6E<C950680aqY>(viewTd) { // from class: X.0as8
                    public final C01GW LLILZ;
                    public final C01GW LLILZIL;

                    @Override // X.AbstractC960400b6E
                    public final String getName() {
                        return "CoHostInviteListManagePanelEmptyUserViewHolder";
                    }

                    {
                        super(viewTd);
                        this.LLILZ = C1935407i4.LIZ(new AwS559S0100000_15(viewTd, 987));
                        this.LLILZIL = C1935407i4.LIZ(new AwS559S0100000_15(viewTd, 986));
                    }

                    @Override // X.AbstractC960400b6E
                    public final void I5(List list, int i, Object obj) {
                        int i2;
                        final boolean zLJJLIIIJJI = C915980Zwa.LJII().LJJLIIIJJI();
                        ViewGroup viewGroup2 = (ViewGroup) this.LLILZ.getValue();
                        if (viewGroup2 != null) {
                            C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0ayU
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C955400ayA c955400ayA = C955400ayA.LIZ;
                                    HashMap map = new HashMap();
                                    if (C915980Zwa.LJI().LJIIJ().getChannelId() != 0) {
                                        map.put("channel_id", String.valueOf(C915980Zwa.LJI().LJIIJ().getChannelId()));
                                    }
                                    map.put("is_successful", CardStruct.IStatusCode.DEFAULT);
                                    map.put("is_clickable", CardStruct.IStatusCode.DEFAULT);
                                    C955400ayA.LJIIZILJ(map);
                                    C955400ayA.LJJ(null, map);
                                    C955400ayA.LJJIIZ(map);
                                    C955400ayA.LJIILLIIL(map);
                                    C955400ayA.LIZLLL(map);
                                    map.put("is_multi_bubble_guide", CardStruct.IStatusCode.DEFAULT);
                                    C955400ayA.LJ(map);
                                    C955400ayA.LIZIZ(map);
                                    C955400ayA.LJIIL(c955400ayA, map, new C943870afZ(C915980Zwa.LJI().LIZ().LLFFF()), true, 8);
                                    C955400ayA.LLIILII("livesdk_connection_management_invite", map);
                                    if (zLJJLIIIJJI) {
                                        C766270U4b.LIZLLL(2131851856);
                                    }
                                }
                            });
                        }
                        TextView textView = (TextView) this.LLILZIL.getValue();
                        if (zLJJLIIIJJI) {
                            i2 = 2131851841;
                        } else {
                            i2 = 2131851639;
                        }
                        textView.setText(C497740JfY.LJIJI(i2));
                    }
                };
            }
        });
        this.LLILZLL.LLLI(VirtualWaitingUser.class, new C2183121AcI(this));
        LIZLLL("onAttachedToWindow");
        C915980Zwa.LJII().LJLZ(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, this.LLILZ);
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C2183111AcH c2183111AcH = this.LLIZLLLIL;
        if (c2183111AcH != null) {
            c2183111AcH.LIZIZ();
        }
        this.LLIZLLLIL = null;
        C2183111AcH c2183111AcH2 = this.LLJ;
        if (c2183111AcH2 != null) {
            c2183111AcH2.LIZIZ();
        }
        this.LLJ = null;
    }

    public final DataChannel getDataChannel() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC951640as6
    public final void LIZ(C954460awe c954460awe) {
        String str;
        long j;
        long j2;
        long j3;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJLZ("active_invite_withdraw", String.valueOf(c954460awe.LJ), "waitlist_cancel", null, 8);
        if (c954460awe.LJIIJJI()) {
            if (c954460awe.LJIIL && c954460awe.LJIILIIL) {
                j = c954460awe.LJIILLIIL;
                j2 = c954460awe.LJIILL;
                j3 = c954460awe.LJIIZILJ;
            } else {
                j = c954460awe.LJFF;
                j2 = c954460awe.LJ;
                j3 = c954460awe.LJI;
            }
            str = "rivalIsCurrentUser";
        } else {
            str = "";
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCancelInvite");
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(", roomId=");
        sbLIZ.append(j);
        sbLIZ.append(", userId=");
        sbLIZ.append(j2);
        sbLIZ.append(", channelId=");
        sbLIZ.append(j3);
        C20441214yg.LJIIIZ("MultiCoHostManagePanelLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (c954460awe.LJIIL && c954460awe.LJIILIIL) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("cancelApply_manager");
            C920580a40 c920580a40 = new C920580a40(1, j, j2, j3, null, "cancelApply_manager", arrayList, 48);
            C766270U4b.LIZLLL(2131841241);
            C915980Zwa.LJII().LJ(c920580a40, new InterfaceC950010apT<C920600a42>() { // from class: X.0Zvq
                @Override // X.InterfaceC950010apT
                public final /* bridge */ /* synthetic */ void LIZ(C920640a46 c920640a46) {
                }

                @Override // X.InterfaceC950010apT
                public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                    if (th != null) {
                        C1304660k3U.LIZ.LIZIZ(803, "cancel multi_cohost link application failed", th, null);
                    }
                }
            });
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("cancelInvite_manager");
            C920580a40 c920580a402 = new C920580a40(0, j, j2, j3, null, "cancelInvite_manager", arrayList2, 48);
            C766270U4b.LIZLLL(2131841236);
            C915980Zwa.LJII().LLJJLIIIJLLLLLLLZ(c920580a402, new InterfaceC950010apT<C920600a42>() { // from class: X.0Zvp
                @Override // X.InterfaceC950010apT
                public final /* bridge */ /* synthetic */ void LIZ(C920640a46 c920640a46) {
                }

                @Override // X.InterfaceC950010apT
                public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                    if (th != null) {
                        C1304660k3U.LIZ.LIZIZ(802, "cancel multi_cohost link invitation failed", th, null);
                    }
                }
            }, C915260ZvQ.LIZ);
        }
        LIZLLL("onCancelInvite");
    }

    public final void LIZJ(boolean z) {
        if (z) {
            C786410Ut5.LLJJJJJIL(getSplitLineIntermediate(), 0);
            C786410Ut5.LLJJJJJIL(getSplitLineInit(), 8);
        } else {
            C786410Ut5.LLJJJJJIL(getSplitLineIntermediate(), 8);
            C786410Ut5.LLJJJJJIL(getSplitLineInit(), 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C950660aqW.LIZLLL(java.lang.String):void");
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLILZIL = dataChannel;
    }

    public C950660aqW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C1935407i4.LIZ(new AwS559S0100000_15(this, 947));
        this.LLILLJJLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 944));
        this.LLILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 945));
        this.LLILZ = new AwS629S0100000_15(this, 84);
        this.LLILZLL = new C1117360fBO();
        this.LLIZ = new C410901il();
        this.LLJI = new AwS559S0100000_15(this, 946);
        this.LLJIJIL = new AwS559S0100000_15(this, 943);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h9a, this, true);
    }
}
