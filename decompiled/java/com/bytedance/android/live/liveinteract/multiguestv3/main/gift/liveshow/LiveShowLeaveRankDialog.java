package com.bytedance.android.live.liveinteract.multiguestv3.main.gift.liveshow;

import X.C01NB;
import X.C11NJ;
import X.C11QI;
import X.C11S5;
import X.C16FV;
import X.C16FZ;
import X.C1701940uOG;
import X.C19487311Lz;
import X.C480460Ism;
import X.C500260Jjc;
import X.C516201zk;
import X.C786410Ut5;
import X.C930540aK4;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC512201z6;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.ILiveShowApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankParams;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowLeaveRankDialog extends LiveDialogFragment implements GenericLifecycleObserver {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2HELIOSOzE6emE+KSwiZyg6LjFiJSYlLTYkJjh9BCw6LBw7JzIALC4lLRctJyQXISQgJig=";
    public C16FZ LL;
    public View LLILLJJLI;
    public View LLILLL;
    public RunnableC781530UlD LLILZ;
    public C16FV LLILZIL;
    public final C11NJ LLILZLL = new C11NJ();
    public LifecycleOwner LLIZ;
    public Long LLIZLLLIL;
    public Long LLJ;
    public Long LLJI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onLifecycleOwnerDestroy();
        }
    }

    public final void MR() {
        Long l = this.LLIZLLLIL;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = this.LLJ;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                Long l3 = this.LLJI;
                if (l3 != null) {
                    long jLongValue3 = l3.longValue();
                    C16FZ c16fz = this.LL;
                    if (c16fz != null) {
                        C500260Jjc.LJLJLJ(c16fz, true);
                    }
                    RunnableC781530UlD runnableC781530UlD = this.LLILZ;
                    if (runnableC781530UlD != null) {
                        C500260Jjc.LJLJLJ(runnableC781530UlD, false);
                    }
                    View view = this.LLILLJJLI;
                    if (view != null) {
                        C500260Jjc.LJLJLJ(view, false);
                    }
                    View view2 = this.LLILLL;
                    if (view2 != null) {
                        C500260Jjc.LJLJLJ(view2, false);
                    }
                    GetShowRankParams getShowRankParams = new GetShowRankParams();
                    getShowRankParams.roomId = jLongValue;
                    getShowRankParams.channelId = jLongValue2;
                    getShowRankParams.showId = jLongValue3;
                    C480460Ism.LIZ().getClass();
                    C19487311Lz.LIZ(new C11QI(C01NB.LIZIZ(((ILiveShowApi) C480460Ism.LIZLLL(ILiveShowApi.class)).getShowRank(getShowRankParams), "MultiGuestLiveShowLeaveRankDialog", "getShowRank").LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516201zk(this, 29)).LJIIL(new C516201zk(this, 30))).LJIILL(), this.LLILZLL, null, null, 30);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L47
            int r3 = X.C465640INu.LIZIZ(r0)
        La:
            X.0Jkm r2 = new X.0Jkm
            r0 = 2131569263(0x7f0d2a6f, float:1.8764148E38)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L43
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L43
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L44
            r0 = 8388629(0x800015, float:1.1754973E-38)
        L29:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L41
            r0 = -1
        L32:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L37
            r3 = -1
        L37:
            r2.LJIIJ = r3
            if (r1 == 0) goto L49
            r0 = 2131887795(0x7f1206b3, float:1.9410207E38)
            r2.LIZJ = r0
            return r2
        L41:
            r0 = r3
            goto L32
        L43:
            r1 = 1
        L44:
            r0 = 80
            goto L29
        L47:
            r3 = 0
            goto La
        L49:
            r0 = 2131887796(0x7f1206b4, float:1.941021E38)
            r2.LIZJ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.gift.liveshow.LiveShowLeaveRankDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        Lifecycle lifecycle;
        super.dismiss();
        LifecycleOwner lifecycleOwner = this.LLIZ;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Lifecycle lifecycle;
        super.onDestroy();
        LifecycleOwner lifecycleOwner = this.LLIZ;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onLifecycleOwnerDestroy() {
        C930540aK4.LJJIZ(this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.LLILZLL.LJ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 6), view.findViewById(R.id.yg_));
        this.LLILZIL = (C16FV) view.findViewById(R.id.k33);
        this.LLILZ = (RunnableC781530UlD) view.findViewById(R.id.tvh);
        this.LL = (C16FZ) view.findViewById(R.id.nnp);
        this.LLILLJJLI = view.findViewById(R.id.h3o);
        View viewFindViewById = view.findViewById(R.id.p4z);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 7), viewFindViewById);
        }
        C16FV c16fv = this.LLILZIL;
        if (c16fv != null) {
            C786410Ut5.m8(c16fv, new ViewOnClickListenerC512201z6(this, 8));
        }
        RunnableC781530UlD runnableC781530UlD = this.LLILZ;
        if (runnableC781530UlD != null) {
            Context context = getContext();
            if (context != null) {
                runnableC781530UlD.setLayoutManager(new LinearLayoutManager(context));
            } else {
                return;
            }
        }
        MR();
    }
}
