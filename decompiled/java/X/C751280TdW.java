package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751280TdW {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final DataChannel LIZJ;
    public final Room LIZLLL;
    public final View LJ;
    public final String LJFF;
    public final boolean LJI;
    public final Observer<Unit> LJII;
    public final boolean LJIIIIZZ;
    public final C20743716Ff LJIIIZ;
    public final C20743716Ff LJIIJ;
    public final C20743716Ff LJIIJJI;
    public final TextView LJIIL;
    public final View LJIILIIL;
    public boolean LJIILJJIL;

    public final void LIZ() {
        View viewFindViewById;
        if (!C01C5.LIZ(this.LIZJ) || C500260Jjc.LJJIJLIJ()) {
            return;
        }
        View view = this.LJ;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.hxh);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
        } else {
            viewFindViewById = null;
        }
        if (C488020JBw.LIZ(this.LIZLLL)) {
            if (!C488040JBy.LIZ(1)) {
                View view2 = this.LJ;
                C500260Jjc.LJIILIIL(view2 != null ? view2.findViewById(R.id.eax) : null);
                View view3 = this.LJ;
                C500260Jjc.LJIILIIL(view3 != null ? view3.findViewById(R.id.h63) : null);
                View view4 = this.LJ;
                C500260Jjc.LJIILIIL(view4 != null ? view4.findViewById(R.id.oyd) : null);
                View view5 = this.LJ;
                C500260Jjc.LJIILIIL(view5 != null ? view5.findViewById(R.id.c3i) : null);
                View view6 = this.LJ;
                C500260Jjc.LJIILIIL(view6 != null ? view6.findViewById(R.id.wh) : null);
            }
            if (C488040JBy.LIZ(1) || (C488040JBy.LIZ(14) && this.LJIILJJIL)) {
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
                View view7 = this.LJ;
                C500260Jjc.LLFFF(view7 != null ? view7.findViewById(R.id.wh) : null);
            }
        }
    }

    public final boolean LIZJ() {
        Room room;
        StarCommentConfig starCommentConfig;
        RoomCreateInfo roomCreateInfo;
        if (!Intrinsics.LJFF(this.LJFF, "from_page_preview")) {
            return this.LJIIIIZZ && (room = this.LIZLLL) != null && (starCommentConfig = room.starCommentConfig) != null && starCommentConfig.starCommentQualification;
        }
        DataChannel dataChannel = this.LIZJ;
        return (dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || !roomCreateInfo.anchorStarCommentPermission) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r5) {
        /*
            r4 = this;
            android.view.View r1 = r4.LJ
            if (r1 == 0) goto L68
            r0 = 2131372814(0x7f0a2b0e, float:1.8365702E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L68
            r3 = 0
            if (r5 == 0) goto L6f
            int r0 = r5.chatL2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L18:
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC1106030et7.j6
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = X.C750850Tcp.LIZ(r0, r1)
            if (r0 != 0) goto L6b
            if (r5 == 0) goto L69
            int r0 = r5.chatCommunityFlagged
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L32:
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC1106030et7.k6
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = X.C750850Tcp.LIZ(r0, r1)
            if (r0 != 0) goto L6b
            if (r5 == 0) goto L4c
            int r0 = r5.chatSpamComments
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L4c:
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC1106030et7.i6
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = X.C750850Tcp.LIZ(r0, r3)
            if (r0 != 0) goto L6b
            r0 = 2131841682(0x7f115292, float:1.9316679E38)
        L61:
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r2.setText(r0)
        L68:
            return
        L69:
            r1 = r3
            goto L32
        L6b:
            r0 = 2131841683(0x7f115293, float:1.931668E38)
            goto L61
        L6f:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751280TdW.LIZIZ(com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751280TdW.LIZLLL(X.05Vn):java.lang.Object");
    }

    public final void LJ(boolean z) {
        View viewFindViewById;
        View view;
        View viewFindViewById2;
        int i;
        View view2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        Room room;
        StarCommentConfig starCommentConfig;
        StarCommentConfig starCommentConfig2;
        View viewFindViewById7;
        int i2;
        View viewFindViewById8;
        int i3;
        View viewFindViewById9;
        int i4;
        View viewFindViewById10;
        int i5;
        View viewFindViewById11;
        String str;
        int i6;
        View view3 = this.LJ;
        View viewFindViewById12 = null;
        int i7 = 8;
        if (view3 != null && (viewFindViewById10 = view3.findViewById(R.id.hxh)) != null) {
            if (z && (this.LJIIIIZZ || Intrinsics.LJFF(this.LJFF, "from_page_preview"))) {
                View view4 = this.LJ;
                if (view4 != null) {
                    viewFindViewById11 = view4.findViewById(R.id.hxi);
                } else {
                    viewFindViewById11 = null;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_filter_access_view");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                if (this.LJIIIIZZ) {
                    str = "anchor";
                } else {
                    str = "admin";
                }
                c474500IjALIZ.LJJII(str, "admin_type");
                if (viewFindViewById11 != null && viewFindViewById11.getVisibility() == 0) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                c474500IjALIZ.LJJII(Integer.valueOf(i6), "red_dot");
                c474500IjALIZ.LIZ();
                i5 = 0;
            } else {
                i5 = 8;
            }
            C786410Ut5.LJLLLLLL(i5, viewFindViewById10);
        }
        if (!this.LJI) {
            View view5 = this.LJ;
            if (view5 != null && (viewFindViewById9 = view5.findViewById(R.id.xix)) != null) {
                if (z) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                C786410Ut5.LJLLLLLL(i4, viewFindViewById9);
            }
        } else {
            View view6 = this.LJ;
            if (view6 != null && (viewFindViewById = view6.findViewById(R.id.xix)) != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
        }
        View view7 = this.LJ;
        if (view7 != null && (viewFindViewById8 = view7.findViewById(R.id.c3i)) != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, viewFindViewById8);
        }
        View view8 = this.LJ;
        if (view8 != null && (viewFindViewById7 = view8.findViewById(R.id.bez)) != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById7);
        }
        if ((this.LJIIIIZZ || Intrinsics.LJFF(this.LJFF, "from_page_preview")) && (view = this.LJ) != null && (viewFindViewById2 = view.findViewById(R.id.eet)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById2);
        }
        if ((this.LIZLLL == null || !C755070Tjd.LIZ(this.LJIIIIZZ) || !this.LJIIIIZZ) && (view2 = this.LJ) != null && (viewFindViewById3 = view2.findViewById(R.id.bez)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        if (z) {
            View view9 = this.LJ;
            if (view9 != null && (viewFindViewById12 = view9.findViewById(R.id.vxg)) != null) {
                if (LIZJ()) {
                    i7 = 0;
                }
                C786410Ut5.LJLLLLLL(i7, viewFindViewById12);
            }
            if (!Intrinsics.LJFF(this.LJFF, "from_page_preview") && (room = this.LIZLLL) != null && (starCommentConfig = room.starCommentConfig) != null && !starCommentConfig.starCommentQualification && (starCommentConfig2 = room.starCommentConfig) != null && starCommentConfig2.displayLock && viewFindViewById12 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById12);
                ImageView imageView = (ImageView) viewFindViewById12.findViewById(R.id.vxh);
                if (imageView != null) {
                    C1143680frq.LJI(imageView, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_pin.png"), null, true);
                    C786410Ut5.LJZI(0, imageView);
                }
            }
        } else {
            View view10 = this.LJ;
            if (view10 != null && (viewFindViewById4 = view10.findViewById(R.id.vxg)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById4);
            }
        }
        if (this.LJI) {
            View view11 = this.LJ;
            if (view11 != null && (viewFindViewById6 = view11.findViewById(R.id.oxj)) != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById6);
            }
            View view12 = this.LJ;
            if (view12 != null && (viewFindViewById5 = view12.findViewById(R.id.oy3)) != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById5);
            }
        }
        LIZ();
    }

    public final void LJFF(boolean z) {
        Object obj;
        HashMap map = new HashMap();
        String str = "open";
        if (z) {
            obj = "open";
        } else {
            obj = "close";
        }
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, obj);
        map.put("situation", "comment_setting");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_set_comment_status");
        if (!z) {
            str = "close";
        }
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII("comment_setting", "situation");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJIJJLI(this.LIZJ);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(boolean r8, android.widget.CompoundButton.OnCheckedChangeListener r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C751310TdZ
            if (r0 == 0) goto L27
            r6 = r10
            X.0TdZ r6 = (X.C751310TdZ) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L39
            if (r0 != r4) goto L31
            boolean r8 = r6.LL
            java.lang.Object r9 = r6.LLILLJJLI
            android.widget.CompoundButton$OnCheckedChangeListener r9 = (android.widget.CompoundButton.OnCheckedChangeListener) r9
            goto L2d
        L27:
            X.0TdZ r6 = new X.0TdZ
            r6.<init>(r7, r10)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L93
            goto L58
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r2 = new com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings
            r2.<init>()
            int r0 = X.C750850Tcp.LIZIZ(r8)
            r2.commentTray = r0
            X.0Tde r1 = X.C751360Tde.LIZ     // Catch: java.lang.Exception -> L93
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.LIZJ     // Catch: java.lang.Exception -> L93
            r6.LLILLJJLI = r9     // Catch: java.lang.Exception -> L93
            r6.LL = r8     // Catch: java.lang.Exception -> L93
            r6.LLILZIL = r4     // Catch: java.lang.Exception -> L93
            java.lang.Object r0 = r1.LIZJ(r2, r0, r6)     // Catch: java.lang.Exception -> L93
            if (r0 != r5) goto L58
            return r5
        L58:
            if (r8 != 0) goto L60
            r0 = 2131853861(0x7f118225, float:1.934138E38)
            X.C766270U4b.LIZLLL(r0)     // Catch: java.lang.Exception -> L93
        L60:
            java.lang.String r0 = "livesdk_hot_comment_panel_set"
            X.0IjA r2 = X.C0IJT.LIZ(r0)     // Catch: java.lang.Exception -> L93
            r2.LJIIIIZZ()     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = "live_take_page"
            r2.LJIILJJIL(r0)     // Catch: java.lang.Exception -> L93
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LIZJ     // Catch: java.lang.Exception -> L93
            if (r1 == 0) goto L91
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r0 = r1.gg0(r0)     // Catch: java.lang.Exception -> L93
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0     // Catch: java.lang.Exception -> L93
            if (r0 == 0) goto L91
            java.lang.String r0 = r0.logStreamingType     // Catch: java.lang.Exception -> L93
        L7e:
            r2.LJJ(r0)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = "to_status"
            if (r8 == 0) goto L8e
            java.lang.String r0 = "open"
        L87:
            r2.LJJII(r0, r1)     // Catch: java.lang.Exception -> L93
            r2.LIZ()     // Catch: java.lang.Exception -> L93
            goto La4
        L8e:
            java.lang.String r0 = "close"
            goto L87
        L91:
            r0 = r3
            goto L7e
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.16Ff r0 = r7.LJIIJJI
            if (r0 == 0) goto La4
            X.C786410Ut5.A7(r0, r3)
            r0.toggle()
            X.C786410Ut5.A7(r0, r9)
        La4:
            androidx.lifecycle.Observer<kotlin.Unit> r1 = r7.LJII
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.onChanged(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751280TdW.LJII(boolean, android.widget.CompoundButton$OnCheckedChangeListener, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(boolean r8, android.widget.CompoundButton.OnCheckedChangeListener r9, X.InterfaceC1364105Vn r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C751300TdY
            if (r0 == 0) goto L29
            r6 = r10
            X.0TdY r6 = (X.C751300TdY) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r2 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L33
            boolean r8 = r6.LL
            java.lang.Object r9 = r6.LLILLL
            android.widget.CompoundButton$OnCheckedChangeListener r9 = (android.widget.CompoundButton.OnCheckedChangeListener) r9
            kotlin.jvm.functions.Function1 r1 = r6.LLILLJJLI
            goto L2f
        L29:
            X.0TdY r6 = new X.0TdY
            r6.<init>(r7, r10)
            goto L12
        L2f:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L6a
            goto L5d
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            X.C155000ia.LIZIZ(r2)
            com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings r2 = new com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings
            r2.<init>()
            int r0 = X.C750850Tcp.LIZIZ(r8)
            r2.enigmaWhisper = r0
            X.0Tde r1 = X.C751360Tde.LIZ     // Catch: java.lang.Exception -> L6a
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.LIZJ     // Catch: java.lang.Exception -> L6a
            r6.LLILLJJLI = r4     // Catch: java.lang.Exception -> L6a
            r6.LLILLL = r9     // Catch: java.lang.Exception -> L6a
            r6.LL = r8     // Catch: java.lang.Exception -> L6a
            r6.LLILZLL = r3     // Catch: java.lang.Exception -> L6a
            java.lang.Object r0 = r1.LJFF(r2, r0, r6)     // Catch: java.lang.Exception -> L6a
            if (r0 != r5) goto L5c
            return r5
        L5c:
            r1 = r4
        L5d:
            if (r1 == 0) goto L81
            if (r8 != 0) goto L62
            r3 = 0
        L62:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L6a
            r1.invoke(r0)     // Catch: java.lang.Exception -> L6a
            goto L81
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 2131842705(0x7f115691, float:1.9318754E38)
            X.C766270U4b.LIZLLL(r0)
            X.16Ff r0 = r7.LJIIJ
            if (r0 == 0) goto L81
            X.C786410Ut5.A7(r0, r4)
            r0.toggle()
            X.C786410Ut5.A7(r0, r9)
        L81:
            androidx.lifecycle.Observer<kotlin.Unit> r1 = r7.LJII
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.onChanged(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751280TdW.LJIIIIZZ(boolean, android.widget.CompoundButton$OnCheckedChangeListener, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(boolean r7, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r8, android.widget.CompoundButton.OnCheckedChangeListener r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C751290TdX
            if (r0 == 0) goto L28
            r5 = r10
            X.0TdX r5 = (X.C751290TdX) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L2e
            boolean r7 = r5.LL
            java.lang.Object r9 = r5.LLILLL
            android.widget.CompoundButton$OnCheckedChangeListener r9 = (android.widget.CompoundButton.OnCheckedChangeListener) r9
            kotlin.jvm.functions.Function1 r8 = r5.LLILLJJLI
            goto L57
        L28:
            X.0TdX r5 = new X.0TdX
            r5.<init>(r6, r10)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r2 = new com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings
            r2.<init>()
            int r0 = X.C750850Tcp.LIZIZ(r7)
            r2.chat = r0
            X.0Tde r1 = X.C751360Tde.LIZ     // Catch: java.lang.Exception -> L9a
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.LIZJ     // Catch: java.lang.Exception -> L9a
            r5.LLILLJJLI = r8     // Catch: java.lang.Exception -> L9a
            r5.LLILLL = r9     // Catch: java.lang.Exception -> L9a
            r5.LL = r7     // Catch: java.lang.Exception -> L9a
            r5.LLILZLL = r3     // Catch: java.lang.Exception -> L9a
            java.lang.Object r0 = r1.LIZJ(r2, r0, r5)     // Catch: java.lang.Exception -> L9a
            if (r0 != r4) goto L5a
            return r4
        L57:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L9a
        L5a:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.LIZJ     // Catch: java.lang.Exception -> L9a
            boolean r0 = X.C500260Jjc.LJIIZILJ(r0)     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L73
            X.0Upu r2 = X.C784440Upu.LIZ()     // Catch: java.lang.Exception -> L9a
            X.0Tds r1 = new X.0Tds     // Catch: java.lang.Exception -> L9a
            if (r7 == 0) goto L6c
            r0 = 1
            goto L6d
        L6c:
            r0 = 0
        L6d:
            r1.<init>(r0)     // Catch: java.lang.Exception -> L9a
            r2.LIZIZ(r1)     // Catch: java.lang.Exception -> L9a
        L73:
            java.lang.String r1 = r6.LJFF     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = "from_page_preview"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L8b
            if (r8 == 0) goto L8b
            if (r7 == 0) goto L83
            r0 = 1
            goto L84
        L83:
            r0 = 0
        L84:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L9a
            r8.invoke(r0)     // Catch: java.lang.Exception -> L9a
        L8b:
            if (r7 == 0) goto L8f
            r0 = 1
            goto L90
        L8f:
            r0 = 0
        L90:
            r6.LJFF(r0)     // Catch: java.lang.Exception -> L9a
            if (r7 != 0) goto L96
            r3 = 0
        L96:
            r6.LJ(r3)     // Catch: java.lang.Exception -> L9a
            goto Lb2
        L9a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 2131842705(0x7f115691, float:1.9318754E38)
            X.C766270U4b.LIZLLL(r0)
            X.16Ff r1 = r6.LJIIIZ
            if (r1 == 0) goto Lb2
            r0 = 0
            X.C786410Ut5.A7(r1, r0)
            r1.toggle()
            X.C786410Ut5.A7(r1, r9)
        Lb2:
            androidx.lifecycle.Observer<kotlin.Unit> r1 = r6.LJII
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.onChanged(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751280TdW.LJI(boolean, kotlin.jvm.functions.Function1, android.widget.CompoundButton$OnCheckedChangeListener, X.05Vn):java.lang.Object");
    }

    public C751280TdW(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, Room room, View view, String str, boolean z, Observer<Unit> observer) {
        C20743716Ff c20743716Ff;
        C20743716Ff c20743716Ff2;
        C20743716Ff c20743716Ff3;
        TextView textView;
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = dataChannel;
        this.LIZLLL = room;
        this.LJ = view;
        this.LJFF = str;
        this.LJI = z;
        this.LJII = observer;
        this.LJIIIIZZ = C500260Jjc.LJIIZILJ(dataChannel);
        if (view != null) {
            c20743716Ff = (C20743716Ff) view.findViewById(R.id.eay);
        } else {
            c20743716Ff = null;
        }
        this.LJIIIZ = c20743716Ff;
        if (view != null) {
            c20743716Ff2 = (C20743716Ff) view.findViewById(R.id.h6o);
        } else {
            c20743716Ff2 = null;
        }
        this.LJIIJ = c20743716Ff2;
        if (view != null) {
            c20743716Ff3 = (C20743716Ff) view.findViewById(R.id.eeu);
        } else {
            c20743716Ff3 = null;
        }
        this.LJIIJJI = c20743716Ff3;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.fi8);
        } else {
            textView = null;
        }
        this.LJIIL = textView;
        this.LJIILIIL = view != null ? view.findViewById(R.id.hxh) : null;
    }
}
