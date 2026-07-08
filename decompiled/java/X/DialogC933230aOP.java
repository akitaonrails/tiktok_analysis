package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aOP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC933230aOP extends AbstractDialogC972150bPB {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final boolean LLJI;
    public final PosIdentity LLJIJIL;
    public final PosIdentity LLJILJIL;
    public final Function1<PosIdentity, Unit> LLJILJILJ;
    public ViewGroup LLJILLL;
    public C1324720kZq LLJJ;
    public C16F5 LLJJI;
    public LiveIconView LLJJIII;
    public C1841350y17 LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public C1324720kZq LLJJIJIL;
    public C16F5 LLJJJ;
    public LiveIconView LLJJJIL;
    public C1841350y17 LLJJJJ;
    public boolean LLJJJJJIL;
    public PosIdentity LLJJJJLIIL;
    public final C987120bnK LLJJL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.gm3;
    }

    public final void LJLIIIL() {
        if (Intrinsics.LJFF(this.LLJJJJLIIL, this.LLJILJIL)) {
            C1841350y17 c1841350y17 = this.LLJJIJI;
            if (c1841350y17 != null) {
                c1841350y17.setChecked(false);
            }
            C1841350y17 c1841350y172 = this.LLJJJJ;
            if (c1841350y172 != null) {
                c1841350y172.setChecked(true);
                return;
            }
            return;
        }
        C1841350y17 c1841350y173 = this.LLJJIJI;
        if (c1841350y173 != null) {
            c1841350y173.setChecked(true);
        }
        C1841350y17 c1841350y174 = this.LLJJJJ;
        if (c1841350y174 != null) {
            c1841350y174.setChecked(false);
        }
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
        this.LLJILLL = (ViewGroup) findViewById(R.id.i0v);
        this.LLJJ = (C1324720kZq) findViewById(R.id.i0t);
        this.LLJJI = (C16F5) findViewById(R.id.i0x);
        this.LLJJIII = (LiveIconView) findViewById(R.id.i0a);
        C1841350y17 c1841350y17 = (C1841350y17) findViewById(R.id.i0u);
        C1841350y17 c1841350y172 = null;
        if (c1841350y17 != null) {
            c1841350y17.setClickable(false);
        } else {
            c1841350y17 = null;
        }
        this.LLJJIJI = c1841350y17;
        this.LLJJIJIIJIL = (ViewGroup) findViewById(R.id.uhw);
        this.LLJJIJIL = (C1324720kZq) findViewById(R.id.uhu);
        this.LLJJJ = (C16F5) findViewById(R.id.uhx);
        this.LLJJJIL = (LiveIconView) findViewById(R.id.uh5);
        C1841350y17 c1841350y173 = (C1841350y17) findViewById(R.id.uhv);
        if (c1841350y173 != null) {
            c1841350y173.setClickable(false);
            c1841350y172 = c1841350y173;
        }
        this.LLJJJJ = c1841350y172;
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.e26);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 281));
        }
        C16FS c16fs = (C16FS) findViewById(R.id.cpn);
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 282));
        }
        ViewGroup viewGroup = this.LLJILLL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS150S0100000_15(this, 283));
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, new ACListenerS150S0100000_15(this, 284));
        }
        LJLIIIL();
        int i = this.LLJIJIL.type;
        if (i == 1) {
            C1324720kZq c1324720kZq = this.LLJJ;
            if (c1324720kZq != null) {
                C12ES.LJIILL(0, c1324720kZq);
            }
            LiveIconView liveIconView2 = this.LLJJIII;
            if (liveIconView2 != null) {
                C439101nJ.LJI(liveIconView2);
            }
            LJLI(this.LLJJI, this.LLJJ, this.LLJIJIL.value);
        } else if (i == 2) {
            C1324720kZq c1324720kZq2 = this.LLJJ;
            if (c1324720kZq2 != null) {
                C439101nJ.LJI(c1324720kZq2);
            }
            LiveIconView liveIconView3 = this.LLJJIII;
            if (liveIconView3 != null) {
                C12ES.LJIILL(0, liveIconView3);
            }
            LJL(this.LLJJIII, this.LLJJI);
        }
        int i2 = this.LLJILJIL.type;
        if (i2 == 1) {
            C1324720kZq c1324720kZq3 = this.LLJJIJIL;
            if (c1324720kZq3 != null) {
                C12ES.LJIILL(0, c1324720kZq3);
            }
            LiveIconView liveIconView4 = this.LLJJJIL;
            if (liveIconView4 != null) {
                C439101nJ.LJI(liveIconView4);
            }
            LJLI(this.LLJJJ, this.LLJJIJIL, this.LLJILJIL.value);
            return;
        }
        if (i2 != 2) {
            return;
        }
        C1324720kZq c1324720kZq4 = this.LLJJIJIL;
        if (c1324720kZq4 != null) {
            C439101nJ.LJI(c1324720kZq4);
        }
        LiveIconView liveIconView5 = this.LLJJJIL;
        if (liveIconView5 != null) {
            C12ES.LJIILL(0, liveIconView5);
        }
        LJL(this.LLJJJIL, this.LLJJJ);
    }

    public static void LJL(LiveIconView liveIconView, C16F5 c16f5) {
        String strLJIJI;
        if (c16f5 == null || liveIconView == null) {
            return;
        }
        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
            strLJIJI = C497740JfY.LJIJI(2131854991);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131854020);
        }
        c16f5.setText(strLJIJI);
        liveIconView.setIconAttr(R.attr.ctk);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI(X.C16F5 r6, X.C1324720kZq r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r5.LLJI
            r3 = 0
            if (r0 == 0) goto L79
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r0 = r1.LJIIJJI(r0)
            X.01Fe r0 = (X.InterfaceC302401Fe) r0
            if (r0 == 0) goto Laf
            X.0aGn r0 = r0.LIZ()
            if (r0 == 0) goto Laf
            java.util.List r0 = r0.LJJIII()
            if (r0 == 0) goto Laf
            java.util.Iterator r2 = r0.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            java.lang.String r0 = r0.mInteractIdStr
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            if (r0 == 0) goto L21
        L36:
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r1 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r1
        L38:
            if (r1 == 0) goto L67
            if (r7 == 0) goto L67
            r0 = 1111490560(0x42400000, float:48.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r4 = (int) r0
            X.0JBN r2 = X.C1819620xS4.LIZ()
            com.bytedance.android.live.base.model.user.User r0 = r1.mUser
            if (r0 == 0) goto L75
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getAvatarThumb()
        L4f:
            X.0kZf r2 = r2.LJIIIZ(r0)
            r0 = 2130975366(0x7f041a86, float:1.7559581E38)
            r2.LJIIIZ = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.LJIILIIL = r0
            r2.LJ = r4
            r2.LJFF = r4
            X.0bnK r0 = r5.LLJJL
            r2.LJIIL = r0
            r2.LJJI(r7)
        L67:
            if (r6 == 0) goto L74
            if (r1 == 0) goto L6d
            com.bytedance.android.live.base.model.user.User r3 = r1.mUser
        L6d:
            java.lang.String r0 = X.C0KVU.LIZ(r3)
            r6.setText(r0)
        L74:
            return
        L75:
            r0 = r3
            goto L4f
        L77:
            r1 = r3
            goto L36
        L79:
            X.0amx r1 = X.C948450amx.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_MODERATOR_USER_MANAGER"
            java.lang.Object r0 = r1.LJIIJJI(r0)
            X.0Zz5 r0 = (X.InterfaceC917530Zz5) r0
            if (r0 == 0) goto Laf
            X.0aGn r0 = r0.LIZ()
            if (r0 == 0) goto Laf
            java.util.List r0 = r0.LJJIII()
            if (r0 == 0) goto Laf
            java.util.Iterator r2 = r0.iterator()
        L95:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            java.lang.String r0 = r0.mInteractIdStr
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            if (r0 == 0) goto L95
        Laa:
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r1 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r1
            goto L38
        Lad:
            r1 = r3
            goto Laa
        Laf:
            r1 = r3
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC933230aOP.LJLI(X.16F5, X.0kZq, java.lang.String):void");
    }

    public DialogC933230aOP(Context context, boolean z, PosIdentity posIdentity, PosIdentity posIdentity2, Function1 function1) {
        super(context);
        this.LLJI = z;
        this.LLJIJIL = posIdentity;
        this.LLJILJIL = posIdentity2;
        this.LLJILJILJ = function1;
        this.LLJJJJLIIL = posIdentity;
        this.LLJJL = new C987120bnK(8);
    }
}
