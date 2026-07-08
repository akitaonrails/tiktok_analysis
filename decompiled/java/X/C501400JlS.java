package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0JlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501400JlS implements InterfaceC773910UXl, InterfaceC501420JlU {
    public View LL;
    public DataChannel LLILLJJLI;

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131855143;
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return 0;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
    }

    @Override // X.InterfaceC501420JlU
    public final void onEnd() {
        View viewFindViewById;
        View view = this.LL;
        if (view == null || (viewFindViewById = view.findViewById(R.id.kij)) == null) {
            return;
        }
        C500260Jjc.LJIILIIL(viewFindViewById);
    }

    @Override // X.InterfaceC501420JlU
    public final void onStart() {
        View viewFindViewById;
        View view = this.LL;
        if (view == null || (viewFindViewById = view.findViewById(R.id.kij)) == null) {
            return;
        }
        C500260Jjc.LLFFF(viewFindViewById);
    }

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
        AnonymousClass0101 anonymousClass0101LIZ;
        if (dataChannel != null) {
            C2660011e c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class);
            if (c2660011e != null) {
                anonymousClass0101LIZ = c2660011e.LIZ(InterfaceC501410JlT.class);
            } else {
                anonymousClass0101LIZ = null;
            }
            InterfaceC501410JlT interfaceC501410JlT = (InterfaceC501410JlT) anonymousClass0101LIZ;
            if (interfaceC501410JlT != null) {
                interfaceC501410JlT.LJIILIIL(this);
            }
        }
    }

    public final void LIZJ(boolean z) {
        long id;
        Object objLJJJJJL;
        Object obj;
        User userLJIIIIZZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_play_together_entrance");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel)) != null) {
            id = userLJIIIIZZ.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            objLJJJJJL = C500260Jjc.LJJJJJL(dataChannel2);
        } else {
            objLJJJJJL = null;
        }
        c474500IjALIZ.LJJII(objLJJJJJL, "live_type");
        if (z) {
            obj = "show";
        } else {
            obj = "click";
        }
        c474500IjALIZ.LJJII(obj, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(RedDotExtensionKt.LJIILLIIL(C0UX6.RED_DOT_LIVE_BROADCAST_INTERACT_PLAY_TOGETHER))) ? 1 : 0), "has_red_dot");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        View viewFindViewById;
        AnonymousClass0101 anonymousClass0101LIZ;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            C2660011e c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class);
            if (c2660011e != null) {
                anonymousClass0101LIZ = c2660011e.LIZ(InterfaceC501410JlT.class);
            } else {
                anonymousClass0101LIZ = null;
            }
            InterfaceC501410JlT interfaceC501410JlT = (InterfaceC501410JlT) anonymousClass0101LIZ;
            if (interfaceC501410JlT != null) {
                interfaceC501410JlT.LJ();
            }
        }
        LIZJ(false);
        C0UX6 c0ux6 = C0UX6.RED_DOT_LIVE_BROADCAST_INTERACT_PLAY_TOGETHER;
        RedDotExtensionKt.LIZ(c0ux6);
        if (view != null && (viewFindViewById = view.findViewById(R.id.t16)) != null) {
            RedDotExtensionKt.LJIILJJIL(c0ux6, viewFindViewById, false);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(DismissToolbarPopEvent.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // X.InterfaceC773910UXl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.view.View r5, androidx.lifecycle.LifecycleOwner r6, com.bytedance.ies.sdk.datachannel.DataChannel r7) {
        /*
            r4 = this;
            r4.LL = r5
            r3 = 0
            if (r5 == 0) goto L52
            r0 = 2131375547(0x7f0a35bb, float:1.8371245E38)
            android.view.View r2 = r5.findViewById(r0)
        Lc:
            java.lang.String r1 = "tiktok_live_game_demand_2"
            java.lang.String r0 = "icon_play_together.png"
            X.C1143680frq.LIZLLL(r2, r1, r0)
            r4.LLILLJJLI = r7
            X.0UX6 r2 = X.C0UX6.RED_DOT_LIVE_BROADCAST_INTERACT_PLAY_TOGETHER
            boolean r1 = com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJIILLIIL(r2)
            if (r5 == 0) goto L29
            r0 = 2131388005(0x7f0a6665, float:1.8396513E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L29
            com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJIILJJIL(r2, r0, r1)
        L29:
            if (r7 == 0) goto L3d
            java.lang.Class<X.0UKi> r0 = X.C770500UKi.class
            java.lang.Object r1 = r7.gg0(r0)
            X.011e r1 = (X.C2660011e) r1
            if (r1 == 0) goto L3b
            java.lang.Class<X.0JlT> r0 = X.InterfaceC501410JlT.class
            X.0101 r3 = r1.LIZ(r0)
        L3b:
            X.0JlT r3 = (X.InterfaceC501410JlT) r3
        L3d:
            r1 = 1
            if (r3 == 0) goto L4e
            boolean r0 = r3.LIZJ()
            if (r0 != r1) goto L4b
            r4.onStart()
            if (r3 == 0) goto L4e
        L4b:
            r3.LJIIL(r4)
        L4e:
            r4.LIZJ(r1)
            return
        L52:
            r2 = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C501400JlS.LJI(android.view.View, androidx.lifecycle.LifecycleOwner, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
