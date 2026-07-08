package com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt;

import X.C019F;
import X.C1133830fbx;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C963290bAt;
import X.C964350bCb;
import X.C964360bCc;
import X.EnumC963280bAs;
import X.InterfaceC2217461Bqa;
import X.RunnableC781530UlD;
import Y.ACListenerS150S0100000_15;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.event.CoHostApplyDialogShowEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CoHostBeInvitedDialogShow;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostFollowPromptAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public RunnableC781530UlD LLJI;
    public C964350bCb LLJIJIL;
    public final C964360bCc LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiCoHostFollowPromptAssem.class, "viewModel", "getViewModel()Lcom/bytedance/android/live/liveinteract/multihost/biz/link/features/followprompt/MultiCoHostFollowPromptViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MultiCoHostFollowPromptAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiCoHostFollowPromptViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 37), AFwS250S0000000_15.get$arr$(84), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C963290bAt.class, null), checkSupervisorPrepared());
        this.LLJILJIL = new C964360bCc();
    }

    public final C963290bAt Go() {
        return (C963290bAt) this.LLJ.getValue();
    }

    public final MultiCoHostFollowPromptViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (MultiCoHostFollowPromptViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!(!Go().LLILLJJLI.LIZ.LIZ.displayUserInfos.isEmpty())) {
            Go().LLILLL.invoke(EnumC963280bAs.OTHERS);
        }
        this.LLJI = (RunnableC781530UlD) view.findViewById(R.id.iez);
        TextView textView = (TextView) view.findViewById(R.id.if6);
        if (textView != null) {
            textView.setText(C1133830fbx.LJIILIIL(Go().LLILLJJLI.LIZ.LIZ.title, ""));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.if5);
        if (textView2 != null) {
            textView2.setText(C1133830fbx.LJIILIIL(Go().LLILLJJLI.LIZ.LIZ.description, ""));
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.if4);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 200));
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0bCZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C964290bCV) obj).LL);
            }
        }, null, new AwS629S0100000_15(this, 66), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0bCd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C964290bCV) obj).LLILLJJLI;
            }
        }, null, new AwS629S0100000_15(this, 67), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0bCa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C964290bCV) obj).LLILLL;
            }
        }, null, new AwS629S0100000_15(this, 68), 6);
        DataChannel dataChannel = Go().LL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, CoHostBeInvitedDialogShow.class, new AwS594S0100000_15(this, 659));
            dataChannel.BQ2(this, CoHostApplyDialogShowEvent.class, new AwS594S0100000_15(this, 660));
        }
    }
}
