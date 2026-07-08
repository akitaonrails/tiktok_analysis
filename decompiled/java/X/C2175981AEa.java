package X;

import Y.ACListenerS167S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS279S0000000_33;

/* JADX INFO: renamed from: X.1AEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175981AEa extends RecyclerView.ViewHolder implements Observer<Boolean> {
    public final C19EG LL;
    public final TextView LLILLJJLI;
    public final RemoteImageView LLILLL;
    public final FrameLayout LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final InterfaceC1259570isl LLIZ;
    public C09JN<C1610420s0e> LLIZLLLIL;
    public final C1ACD LLJ;

    public final void L5() {
        N5(new View[]{this.LLILLJJLI, this.LLILZ, this.LLILZIL}, AFwS279S0000000_33.get$arr$(390));
        N5(new View[]{this.LLILLL, this.LLILZLL}, AFwS279S0000000_33.get$arr$(391));
    }

    public static void I5(LiveRoomStruct liveRoomStruct) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("scene_id", "1009");
        c2344009Gk.LJIIIIZZ("enter_from_merge", "others_homepage");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("anchor_id", liveRoomStruct.owner.getUid());
        c2344009Gk.LIZLLL(liveRoomStruct.id, "room_id");
        c2344009Gk.LJIIIIZZ("request_id", liveRoomStruct.getRequestId());
        c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
        C486660J6q.LJIIJ(c2344009Gk.LIZ);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        bool.booleanValue();
    }

    public C2175981AEa(View view, C19EG c19eg) {
        super(view);
        this.LL = c19eg;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_top);
        this.LLILLL = (RemoteImageView) view.findViewById(R.id.tn6);
        this.LLILZ = (FrameLayout) view.findViewById(R.id.i72);
        this.LLILZIL = (TextView) view.findViewById(R.id.tv_watch_people_count);
        this.LLILZLL = (TextView) view.findViewById(R.id.hzb);
        this.LLIZ = C1260090itb.LIZIZ.mainAnimViewModel(c19eg);
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 93), view);
        this.LLJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.1AEb
            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i, int i2, View view2) {
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void w9(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() {
                C786410Ut5.LLIL(this.LL.LLILLJJLI, 0);
                C786410Ut5.LJZ(0, this.LL.LLILZ);
                C786410Ut5.LLIL(this.LL.LLILZIL, 0);
                C786410Ut5.l(this.LL.LLILLL, 8);
                C786410Ut5.LLIL(this.LL.LLILZLL, 8);
                C2175981AEa c2175981AEa = this.LL;
                HandlerHook.viewPostDelay(c2175981AEa.LLILLL, new ARunnableS133S0100000_33(c2175981AEa, 114), 1000L);
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                int i = C1891710zKL.LIZ[enumC1913550ztZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            this.LL.L5();
                            return;
                        }
                        return;
                    } else {
                        C2175981AEa c2175981AEa = this.LL;
                        C2175981AEa.N5(new View[]{c2175981AEa.LLILLJJLI, c2175981AEa.LLILZ, c2175981AEa.LLILZIL, c2175981AEa.LLILZLL}, AFwS279S0000000_33.get$arr$(389));
                        C786410Ut5.l(this.LL.LLILLL, 0);
                        this.LL.getClass();
                        return;
                    }
                }
                C2175981AEa c2175981AEa2 = this.LL;
                C2175981AEa.N5(new View[]{c2175981AEa2.LLILLJJLI, c2175981AEa2.LLILZ, c2175981AEa2.LLILZIL}, AFwS279S0000000_33.get$arr$(387));
                C2175981AEa c2175981AEa3 = this.LL;
                C2175981AEa.N5(new View[]{c2175981AEa3.LLILLL, c2175981AEa3.LLILZLL}, AFwS279S0000000_33.get$arr$(388));
            }
        }, EnumC1913520ztW.NORMAL);
    }

    public static void N5(View[] viewArr, Function1 function1) {
        for (View view : viewArr) {
            function1.invoke(view);
        }
    }
}
