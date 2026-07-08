package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494220JZs {
    public final String LIZ;
    public final Room LIZIZ;
    public final DataChannel LIZJ;
    public boolean LIZLLL = true;
    public Function0<Unit> LJ;

    public final void LIZ(DataChannel dataChannel, String str) {
        Long lValueOf;
        int i;
        User owner;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscriber_only_live_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(this.LIZ, "show_entrance");
        c474500IjALIZ.LJJII(this.LIZ, "click_position");
        Room room = this.LIZIZ;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        Room room2 = this.LIZIZ;
        if (room2 != null && (owner = room2.getOwner()) != null && owner.isAnchorHasSubQualification()) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i ^ 1), "is_opt_in");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
    }

    public C494220JZs(Room room, DataChannel dataChannel, String str) {
        this.LIZ = str;
        this.LIZIZ = room;
        this.LIZJ = dataChannel;
    }

    public final void LIZIZ(C20743716Ff c20743716Ff, boolean z, Function0<Unit> function0) {
        float f;
        this.LIZLLL = z;
        if (function0 != null) {
            this.LJ = function0;
        }
        if (c20743716Ff != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20743716Ff);
            c20743716Ff.setAlpha(f);
        }
    }

    public final void LIZJ(Context context, C20743716Ff c20743716Ff, ViewGroup viewGroup, ViewGroup viewGroup2) {
        Long lValueOf;
        User owner;
        User owner2;
        int i;
        int i2;
        int i3;
        int i4;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        boolean zW9 = iInteractService.w9();
        boolean zVp0 = iInteractService.vp0();
        boolean zO1 = iInteractService.o1();
        ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
        boolean zLIZIZ = C0U3P.LIZIZ(C0U3Q.KARAOKE);
        boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.LIZJ);
        if (zVp0) {
            if (zKw0) {
                i4 = 2131856595;
            } else {
                i4 = 2131844453;
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(i4));
            return;
        }
        if (zW9) {
            if (zKw0) {
                i3 = 2131856594;
            } else {
                i3 = 2131844452;
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(i3));
            return;
        }
        if (zO1) {
            if (zKw0) {
                i2 = 2131856593;
            } else {
                i2 = 2131844451;
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(i2));
            return;
        }
        if (zLIZIZ) {
            if (zKw0) {
                i = 2131856608;
            } else {
                i = 2131840665;
            }
            C766270U4b.LIZLLL(i);
            return;
        }
        if (this.LIZLLL) {
            final C494100JZg c494100JZg = new C494100JZg(this, context, c20743716Ff, viewGroup, viewGroup2);
            C0JT6<Boolean> c0jt6 = C0KPJ.Ke;
            Boolean boolLIZ = c0jt6.LIZ();
            Boolean bool = Boolean.TRUE;
            int i5 = 0;
            Long lValueOf2 = null;
            if (Intrinsics.LJFF(boolLIZ, bool) || !LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview() || Intrinsics.LJFF(this.LIZ, "anchor_close_live_popup")) {
                c494100JZg.invoke();
            } else {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_longer_preview_popup_show");
                Room room = this.LIZIZ;
                if (room != null && (owner = room.getOwner()) != null) {
                    lValueOf = Long.valueOf(owner.getId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                c474500IjALIZ.LJJII(this.LIZ, "click_position");
                c474500IjALIZ.LIZ();
                c0jt6.LIZJ(bool);
                String strLJIJI = C497740JfY.LJIJI(2131843863);
                C782110Um9 c782110Um9 = new C782110Um9(context);
                c782110Um9.LJIIZILJ(2131843862);
                c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131843861, strLJIJI));
                C494720Jag c494720Jag = new C494720Jag();
                C755620TkW c755620TkW = new C755620TkW();
                c755620TkW.LIZ = C497740JfY.LJIJI(2131843859);
                c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0JZu
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        Long lValueOf3;
                        User owner3;
                        C0KPJ.Je.LIZJ(Boolean.TRUE);
                        liveDialog.dismiss();
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_sub_only_live_longer_preview_popup_click");
                        Room room2 = this.LIZ.LIZIZ;
                        if (room2 != null && (owner3 = room2.getOwner()) != null) {
                            lValueOf3 = Long.valueOf(owner3.getId());
                        } else {
                            lValueOf3 = null;
                        }
                        c474500IjALIZ2.LJJII(lValueOf3, "anchor_id");
                        c474500IjALIZ2.LJJII(this.LIZ.LIZ, "click_position");
                        c474500IjALIZ2.LJJII("confirm", "click_type");
                        c474500IjALIZ2.LIZ();
                        c494100JZg.invoke();
                    }
                };
                c494720Jag.LIZ(new C0TZ2(c755620TkW));
                C755630TkX c755630TkX = new C755630TkX();
                c755630TkX.LIZ = C497740JfY.LJIJI(2131843860);
                c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0JZv
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        Long lValueOf3;
                        User owner3;
                        C0KPJ.Je.LIZJ(Boolean.FALSE);
                        liveDialog.dismiss();
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_sub_only_live_longer_preview_popup_click");
                        Room room2 = this.LIZ.LIZIZ;
                        if (room2 != null && (owner3 = room2.getOwner()) != null) {
                            lValueOf3 = Long.valueOf(owner3.getId());
                        } else {
                            lValueOf3 = null;
                        }
                        c474500IjALIZ2.LJJII(lValueOf3, "anchor_id");
                        c474500IjALIZ2.LJJII(this.LIZ.LIZ, "click_position");
                        c474500IjALIZ2.LJJII("opt_out", "click_type");
                        c474500IjALIZ2.LIZ();
                        c494100JZg.invoke();
                    }
                };
                c494720Jag.LIZ(new C0TZ3(c755630TkX));
                c494720Jag.LIZIZ = 2;
                c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                c782110Um9.LJIILLIIL = false;
                c782110Um9.LJIILL = false;
                C786410Ut5.E4(c782110Um9.LIZ());
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_subscriber_only_live_button_click");
            c474500IjALIZ2.LJIJJLI(this.LIZJ);
            c474500IjALIZ2.LJJII(this.LIZ, "click_position");
            c474500IjALIZ2.LJJII(0, "is_shortcut_entrance");
            Room room2 = this.LIZIZ;
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getOwnerUserId());
            }
            c474500IjALIZ2.LJJII(lValueOf2, "anchor_id");
            Room room3 = this.LIZIZ;
            if (room3 != null && (owner2 = room3.getOwner()) != null && owner2.isAnchorHasSubQualification()) {
                i5 = 1;
            }
            c474500IjALIZ2.LJJII(Integer.valueOf(i5 ^ 1), "is_opt_in");
            c474500IjALIZ2.LJJII("open", "sub_live_status");
            c474500IjALIZ2.LIZ();
            return;
        }
        Function0<Unit> function0 = this.LJ;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
