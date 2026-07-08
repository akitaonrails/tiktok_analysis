package X;

import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.MessageRequestStoryAggregationCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0ZtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class ViewOnLongClickListenerC913880ZtC implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            default:
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnLongClickListenerC913880ZtC(Object obj, BaseMessageRequestChatListCell<AbstractC885540Yoa<?>> baseMessageRequestChatListCell) {
        this.$t = baseMessageRequestChatListCell;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC913880ZtC viewOnLongClickListenerC913880ZtC, View view) {
        SessionListBaseVH sessionListBaseVH;
        InterfaceC888500YtM interfaceC888500YtM;
        boolean z;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Fragment fragmentLIZ;
        C19EG c19egLIZIZ = null;
        InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJ(((SessionListBaseVH) viewOnLongClickListenerC913880ZtC.l0).itemView, null), InboxAbilityCenter$IInboxFragmentAbility.class, null);
        if ((inboxAbilityCenter$IInboxFragmentAbility != null && inboxAbilityCenter$IInboxFragmentAbility.aA2()) || (interfaceC888500YtM = (sessionListBaseVH = (SessionListBaseVH) viewOnLongClickListenerC913880ZtC.l0).LLJJIJIIJIL) == null) {
            return false;
        }
        if (sessionListBaseVH.P5(interfaceC888500YtM)) {
            return true;
        }
        C882120Yj4.LIZ().getClass();
        C883710Yld c883710YldLIZLLL = C883610YlT.LIZLLL(interfaceC888500YtM);
        SessionListBaseVH sessionListBaseVH2 = (SessionListBaseVH) viewOnLongClickListenerC913880ZtC.l0;
        sessionListBaseVH2.getClass();
        if (C0BV3.LIZ() && (fragmentLIZ = C946803n0.LIZ(sessionListBaseVH2.itemView)) != null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            View view2 = fragmentLIZ.getView();
            if (view2 != null) {
                view2.dispatchTouchEvent(motionEventObtain);
            }
        }
        C19EG c19egR5 = ((SessionListBaseVH) viewOnLongClickListenerC913880ZtC.l0).R5();
        InterfaceC893250Z2l interfaceC893250Z2lLIZIZ = ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZIZ();
        String strB6 = ((SessionListBaseVH) viewOnLongClickListenerC913880ZtC.l0).b6();
        if (c19egR5 != null) {
            z = true;
        } else {
            z = false;
        }
        interfaceC893250Z2lLIZIZ.LIZIZ("action_handler_fragment", strB6, "long_click", z, null, Double.valueOf(((Number) C282700B6e.LIZ.getValue()).doubleValue()));
        if (c19egR5 != null && !c19egR5.getSupportFragmentManager().LJL() && c19egR5.getSupportFragmentManager().LJJLIIIJLJLI() != null) {
            c19egLIZIZ = c19egR5;
        } else {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ);
            }
        }
        if (c883710YldLIZLLL == null || c19egLIZIZ == null) {
            return true;
        }
        c883710YldLIZLLL.LIZJ(interfaceC888500YtM, c19egLIZIZ, ((SessionListBaseVH) viewOnLongClickListenerC913880ZtC.l0).itemView);
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC913880ZtC viewOnLongClickListenerC913880ZtC, View view) {
        if (((SessionListBaseVH) viewOnLongClickListenerC913880ZtC.l0).itemView.isLongClickable()) {
            return ((SessionListBaseVH) viewOnLongClickListenerC913880ZtC.l0).itemView.performLongClick();
        }
        return false;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC913880ZtC viewOnLongClickListenerC913880ZtC, View view) {
        return ((SessionListIMBaseVH) viewOnLongClickListenerC913880ZtC.l0).itemView.performLongClick();
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC913880ZtC viewOnLongClickListenerC913880ZtC, View view) {
        AbstractC885530YoZ abstractC885530YoZ;
        final C19EG c19eg;
        final C878960Ydy c878960YdyI5;
        BaseMessageRequestChatListCell baseMessageRequestChatListCell = (BaseMessageRequestChatListCell) viewOnLongClickListenerC913880ZtC.l0;
        baseMessageRequestChatListCell.getClass();
        if ((!(baseMessageRequestChatListCell instanceof MessageRequestStoryAggregationCell)) && (abstractC885530YoZ = baseMessageRequestChatListCell.LLJJIJIIJIL) != null) {
            Activity activityLIZ = C1388190mED.LIZ(baseMessageRequestChatListCell.itemView.getContext());
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (c878960YdyI5 = baseMessageRequestChatListCell.I5()) != null) {
                IChatListEngine.LIZ.getClass();
                final C879540Yeu<?> c879540YeuLJII = C884160YmM.LIZ().LJII(abstractC885530YoZ.getKey(), c878960YdyI5);
                if (c879540YeuLJII != null) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI(new C879020Ye4(c19eg, c879540YeuLJII, c878960YdyI5), new C887770YsB(c19eg, c879540YeuLJII, c878960YdyI5), new C888450YtH(c19eg, c879540YeuLJII, c878960YdyI5), new C880110Yfp(c19eg, c879540YeuLJII, c878960YdyI5), new C877770Yc3(c19eg, c879540YeuLJII, c878960YdyI5), new AbstractC880120Yfq(c19eg, c879540YeuLJII, c878960YdyI5) { // from class: X.0Ybt
                        public final int LLJ = 2131835689;
                        public final int LLJI = R.raw.icon_story_star_2;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractC880120Yfq
                        public final void LIZ() {
                            C0Y8T c0y8t;
                            T t = this.LLILLJJLI.LIZJ;
                            if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
                                return;
                            }
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C877680Ybu(c0y8t, this, null), 3);
                        }

                        @Override // X.AbstractC880120Yfq
                        public final boolean LJI() {
                            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                            return (((Number) C270400Aik.LIZ.getValue()).intValue() == 1 && (c2213981Bky.isOffline() || c2213981Bky.isRegressionTest())) ? false : true;
                        }

                        @Override // X.AbstractC880120Yfq
                        public final int LIZIZ() {
                            return this.LLJI;
                        }

                        @Override // X.AbstractC880120Yfq
                        public final int LIZLLL() {
                            return this.LLJ;
                        }
                    });
                    C887690Ys3.LIZ.getClass();
                    C887690Ys3.LIZ(c19eg, c879540YeuLJII, listLJIIJJI, null);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
