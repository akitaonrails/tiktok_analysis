package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.RemoveReservationCardEvent;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928790aHF extends AbstractC960470b6L<C928780aHE> {
    public final DataChannel LL;
    public final InterfaceC921430a5N LLILLJJLI;
    public final int LLILLL;
    public final C1117360fBO LLILZ;
    public RunnableC781530UlD LLILZIL;
    public C1117360fBO LLILZLL;
    public Context LLIZ;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final void N5(Long l) {
        List<?> list;
        Long lValueOf;
        Long lValueOf2;
        List<?> list2;
        C929140aHo c929140aHo;
        ListByTypeResponse.ReservedUser reservedUser;
        User user;
        C1117360fBO c1117360fBO = this.LLILZLL;
        if (c1117360fBO != null && (list = c1117360fBO.LL) != null) {
            int i = 0;
            if (list.size() == 1) {
                Object obj = ListProtector.get(list, 0);
                if ((obj instanceof C929140aHo) && (c929140aHo = (C929140aHo) obj) != null && (reservedUser = c929140aHo.LIZ) != null && (user = reservedUser.user) != null) {
                    lValueOf2 = Long.valueOf(user.getId());
                } else {
                    lValueOf2 = null;
                }
                if (Intrinsics.LJFF(l, lValueOf2)) {
                    C1117360fBO c1117360fBO2 = this.LLILZ;
                    if (c1117360fBO2 != null && (list2 = c1117360fBO2.LL) != null) {
                        int size = list2.size();
                        while (i < size) {
                            Object obj2 = ListProtector.get(list2, i);
                            if ((obj2 instanceof C930130aJP) && ((C930130aJP) obj2).LIZIZ == 2) {
                                ListProtector.remove(list2, i);
                                ListProtector.remove(list2, i);
                                C1117360fBO c1117360fBO3 = this.LLILZ;
                                if (c1117360fBO3 != null) {
                                    c1117360fBO3.LLLII(list2);
                                }
                                L5(i, this.LLILZ, 2);
                            }
                            i++;
                        }
                        return;
                    }
                    return;
                }
            }
            if (list.size() > 1) {
                int size2 = list.size();
                while (i < size2) {
                    Object obj3 = ListProtector.get(list, i);
                    if (obj3 instanceof C929140aHo) {
                        User user2 = ((C929140aHo) obj3).LIZ.user;
                        if (user2 != null) {
                            lValueOf = Long.valueOf(user2.getId());
                        } else {
                            lValueOf = null;
                        }
                        if (Intrinsics.LJFF(lValueOf, l)) {
                            ListProtector.remove(list, i);
                            C1117360fBO c1117360fBO4 = this.LLILZLL;
                            if (c1117360fBO4 != null) {
                                c1117360fBO4.LL = list;
                            }
                            L5(i, c1117360fBO4, 1);
                            return;
                        }
                    }
                    i++;
                }
            }
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C928780aHE c928780aHE = (C928780aHE) obj;
        this.LLIZ = this.itemView.getContext();
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) this.itemView.findViewById(R.id.tbz);
        this.LLILZIL = runnableC781530UlD;
        if (runnableC781530UlD != null) {
            SSLinearLayoutManager sSLinearLayoutManager = new SSLinearLayoutManager(this.LLIZ);
            sSLinearLayoutManager.setOrientation(0);
            runnableC781530UlD.setLayoutManager(sSLinearLayoutManager);
        }
        C1117360fBO c1117360fBO = new C1117360fBO();
        this.LLILZLL = c1117360fBO;
        final InterfaceC921430a5N interfaceC921430a5N = this.LLILLJJLI;
        final int i2 = this.LLILLL;
        c1117360fBO.LLLI(C929140aHo.class, new AbstractC960460b6K<C929140aHo, C928540aGq>(interfaceC921430a5N, i2) { // from class: X.0aHQ
            public final InterfaceC921430a5N LIZIZ;
            public final int LIZJ;

            {
                this.LIZIZ = interfaceC921430a5N;
                this.LIZJ = i2;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C928540aGq(C786410Ut5.Td(layoutInflater, R.layout.hee, viewGroup, false), this.LIZIZ, this.LIZJ);
            }
        });
        RunnableC781530UlD runnableC781530UlD2 = this.LLILZIL;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setAdapter(this.LLILZLL);
        }
        if (C930540aK4.LJIJJLI()) {
            View view = this.itemView;
            C426750GoL.LJIIL(view, 0, 0, 0, 0, 16);
            view.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(163));
            RunnableC781530UlD runnableC781530UlD3 = this.LLILZIL;
            if (runnableC781530UlD3 != null) {
                C426750GoL.LJIIL(runnableC781530UlD3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 16);
            }
        }
        List<ListByTypeResponse.ReservedUser> list = c928780aHE.LIZ;
        if (list != null && !list.isEmpty()) {
            C410901il c410901il = new C410901il();
            Iterator<ListByTypeResponse.ReservedUser> it2 = list.iterator();
            while (it2.hasNext()) {
                c410901il.add(new C929140aHo(it2.next()));
            }
            C1117360fBO c1117360fBO2 = this.LLILZLL;
            if (c1117360fBO2 != null) {
                c1117360fBO2.LL = c410901il;
                c1117360fBO2.notifyDataSetChanged();
            }
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.CQ2(RemoveReservationCardEvent.class, this, new C5183020f(this, 24));
        }
    }

    public static void L5(int i, C1117360fBO c1117360fBO, int i2) {
        List<?> list;
        if (c1117360fBO != null) {
            c1117360fBO.notifyItemRangeRemoved(i, i2);
            List<?> list2 = c1117360fBO.LL;
            if ((list2 != null && i == list2.size()) || (list = c1117360fBO.LL) == null) {
                return;
            }
            c1117360fBO.notifyItemRangeChanged(i, list.size() - i);
        }
    }

    public C928790aHF(View view, DataChannel dataChannel, InterfaceC921430a5N interfaceC921430a5N, int i, C1117360fBO c1117360fBO) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC921430a5N;
        this.LLILLL = i;
        this.LLILZ = c1117360fBO;
    }
}
