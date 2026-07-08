package Y;

import X.AbstractC1273900jFs;
import X.C006A;
import X.C09JN;
import X.C0IJT;
import X.C0KYR;
import X.C0UF5;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C1C7U;
import X.C20743716Ff;
import X.C474500IjA;
import X.C500260Jjc;
import X.C501520Jle;
import X.C745220TLc;
import X.C750620TcS;
import X.C766270U4b;
import X.C776870Udh;
import X.C776890Udj;
import X.C776910Udl;
import X.C785990UsP;
import X.C786410Ut5;
import X.InterfaceC772390URp;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.AnchorReminderWordStatus;

/* JADX INFO: loaded from: classes13.dex */
public class AfS32S0210000_12 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS32S0210000_12 afS32S0210000_12, Object obj) {
        C1C7U.LIZ("LiveAdminSettingGuideAdapter@ff9f.initManagerCueSwitch$1$1$1");
        ((C20743716Ff) afS32S0210000_12.l0).setChecked(!afS32S0210000_12.z2);
        AnchorReminderWordStatus anchorReminderWordStatus = (AnchorReminderWordStatus) afS32S0210000_12.l1;
        anchorReminderWordStatus.status = C500260Jjc.LJJJI(Boolean.valueOf(afS32S0210000_12.z2 ^ true)) ? 1 : 0;
        C0UF5.LJ = anchorReminderWordStatus;
        C1C7U.LIZIZ("LiveAdminSettingGuideAdapter@ff9f.initManagerCueSwitch$1$1$1");
    }

    public static final void accept$1(AfS32S0210000_12 afS32S0210000_12, Object obj) {
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initManagerCue$1$2");
        ((C20743716Ff) afS32S0210000_12.l0).setChecked(!afS32S0210000_12.z2);
        AnchorReminderWordStatus anchorReminderWordStatus = (AnchorReminderWordStatus) afS32S0210000_12.l1;
        anchorReminderWordStatus.status = C500260Jjc.LJJJI(Boolean.valueOf(afS32S0210000_12.z2 ^ true)) ? 1 : 0;
        C0UF5.LJ = anchorReminderWordStatus;
        C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initManagerCue$1$2");
    }

    public static final void accept$2(AfS32S0210000_12 afS32S0210000_12, Object obj) {
        C1C7U.LIZ("ModeratorPermissionEditFragmentSheet@bb7d.updatePermission$2");
        Throwable th = (Throwable) obj;
        if ((th instanceof C501520Jle) && ((C501520Jle) th).getErrorCode() == 4002167) {
            C786410Ut5.w7((CompoundButton) afS32S0210000_12.l0, null);
            ((CompoundButton) afS32S0210000_12.l0).setChecked(false);
            C786410Ut5.w7((CompoundButton) afS32S0210000_12.l0, new C785990UsP((ModeratorPermissionEditFragmentSheet) afS32S0210000_12.l1, 21));
            C766270U4b.LIZLLL(2131843119);
        } else {
            C786410Ut5.w7((CompoundButton) afS32S0210000_12.l0, null);
            ((CompoundButton) afS32S0210000_12.l0).setChecked(!afS32S0210000_12.z2);
            C786410Ut5.w7((CompoundButton) afS32S0210000_12.l0, new C785990UsP((ModeratorPermissionEditFragmentSheet) afS32S0210000_12.l1, 22));
            C766270U4b.LIZLLL(2131842705);
        }
        C1C7U.LIZIZ("ModeratorPermissionEditFragmentSheet@bb7d.updatePermission$2");
    }

    public static final void accept$3(AfS32S0210000_12 afS32S0210000_12, Object obj) {
        C1C7U.LIZ("BasePreviewSettingMainFragment@5a3c.initManagerCue$1$observable$2");
        ((BasePreviewSettingMainFragment) afS32S0210000_12.l0).cS().setChecked(!afS32S0210000_12.z2);
        AnchorReminderWordStatus anchorReminderWordStatus = (AnchorReminderWordStatus) afS32S0210000_12.l1;
        anchorReminderWordStatus.status = C500260Jjc.LJJJI(Boolean.valueOf(afS32S0210000_12.z2 ^ true)) ? 1 : 0;
        C0UF5.LJ = anchorReminderWordStatus;
        C1C7U.LIZIZ("BasePreviewSettingMainFragment@5a3c.initManagerCue$1$observable$2");
    }

    public static final void accept$4(AfS32S0210000_12 afS32S0210000_12, Object obj) {
        int i;
        int i2;
        boolean z;
        C1C7U.LIZ("GameUiStrategy@3ab.rotateScreenIfNeeded$1");
        Map<String, Object> map = C1338270kvh.LIZ;
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(((C776870Udh) afS32S0210000_12.l0).LJJIFFI)) && afS32S0210000_12.z2) {
            ((C776870Udh) afS32S0210000_12.l0).LJJIIZI = true;
        }
        C776870Udh c776870Udh = (C776870Udh) afS32S0210000_12.l0;
        boolean z2 = c776870Udh.LJJIIZ;
        boolean z3 = c776870Udh.LJJIFFI;
        int i3 = 2;
        if (C500260Jjc.LJJJI(c776870Udh.LJJIIJZLJL)) {
            i = 1;
        } else {
            i = 2;
        }
        if (C500260Jjc.LJJJI(Boolean.valueOf(((C776870Udh) afS32S0210000_12.l0).LJJIIJ))) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        if (((C776870Udh) afS32S0210000_12.l0).LJIIJJI) {
            i3 = 1;
        }
        boolean z4 = afS32S0210000_12.z2;
        C474500IjA c474500IjA = (C474500IjA) afS32S0210000_12.l1;
        c474500IjA.LJJII(Integer.valueOf(z2 ? 1 : 0), "pause_status");
        c474500IjA.LJJII(Integer.valueOf(z3 ? 1 : 0), "background_status");
        c474500IjA.LJJII(Integer.valueOf(z4 ? 1 : 0), "forced");
        c474500IjA.LJJII(Integer.valueOf(i), "cur_orientation");
        c474500IjA.LJJII(Integer.valueOf(i2), "pre_orientation");
        c474500IjA.LJJII(Integer.valueOf(i3), "game_orientation");
        C776870Udh c776870Udh2 = (C776870Udh) afS32S0210000_12.l0;
        if (c776870Udh2.LJJIIZ) {
            C474500IjA c474500IjA2 = (C474500IjA) afS32S0210000_12.l1;
            c474500IjA2.LJJII("paused_not_rotate", "action");
            c474500IjA2.LIZ();
        } else {
            if (!afS32S0210000_12.z2 && !c776870Udh2.LJJIIZI && Intrinsics.LJFF(c776870Udh2.LJJIIJZLJL, Boolean.valueOf(c776870Udh2.LJJIIJ))) {
                z = false;
            } else {
                z = true;
            }
            C776870Udh c776870Udh3 = (C776870Udh) afS32S0210000_12.l0;
            if (c776870Udh3.LJJIFFI && z) {
                Boolean bool = c776870Udh3.LJJIIJZLJL;
                if (bool != null) {
                    c776870Udh3.LJJIIJ = bool.booleanValue();
                    C776870Udh c776870Udh4 = (C776870Udh) afS32S0210000_12.l0;
                    boolean z5 = c776870Udh4.LJIIJJI;
                    boolean z6 = c776870Udh4.LJJIIJ;
                    if (z5 != z6) {
                        c776870Udh4.LJJII = true;
                        c776870Udh4.LJJ(z6);
                        ((C776870Udh) afS32S0210000_12.l0).LIZIZ.yS(90, (C474500IjA) afS32S0210000_12.l1);
                    } else if (c776870Udh4.LJJII) {
                        c776870Udh4.LIZIZ.yS(0, (C474500IjA) afS32S0210000_12.l1);
                    }
                } else {
                    Context context = c776870Udh3.LIZIZ.getContext();
                    if (context != null) {
                        ((C776870Udh) afS32S0210000_12.l0).LJJIIJ(context, "init_orientation", (C474500IjA) afS32S0210000_12.l1);
                    }
                    C776870Udh c776870Udh5 = (C776870Udh) afS32S0210000_12.l0;
                    Boolean bool2 = c776870Udh5.LJJIIJZLJL;
                    if (bool2 != null) {
                        c776870Udh5.LJJIIJ = bool2.booleanValue();
                    }
                    C776870Udh c776870Udh6 = (C776870Udh) afS32S0210000_12.l0;
                    boolean z7 = c776870Udh6.LJIIJJI;
                    boolean z8 = c776870Udh6.LJJIIJ;
                    if (z7 != z8) {
                        c776870Udh6.LJJII = true;
                        c776870Udh6.LJJ(z8);
                        ((C776870Udh) afS32S0210000_12.l0).LIZIZ.yS(90, (C474500IjA) afS32S0210000_12.l1);
                    }
                }
                ((C776870Udh) afS32S0210000_12.l0).LJJIIZI = false;
            }
            if (!((C776870Udh) afS32S0210000_12.l0).LJJII) {
                C474500IjA c474500IjA3 = (C474500IjA) afS32S0210000_12.l1;
                c474500IjA3.LJJII("no_exception_not_rotate", "action");
                c474500IjA3.LIZ();
            }
            C776870Udh c776870Udh7 = (C776870Udh) afS32S0210000_12.l0;
            if (!c776870Udh7.LJJIII && c776870Udh7.LJJII) {
                InterfaceC772390URp.t.LJFF(Boolean.TRUE);
                ((C776870Udh) afS32S0210000_12.l0).LJJIII = true;
            }
        }
        C1C7U.LIZIZ("GameUiStrategy@3ab.rotateScreenIfNeeded$1");
    }

    public static final void accept$5(AfS32S0210000_12 afS32S0210000_12, Object obj) {
        Long lValueOf;
        Long lValueOf2;
        String str;
        C1C7U.LIZ("MuteBehavior@97a4.reportClickMute$1$1");
        String strLIZJ = C0KYR.LIZJ(((C750620TcS) afS32S0210000_12.l0).LJIIIZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mute_click");
        c474500IjALIZ.LJIJJLI(((C750620TcS) afS32S0210000_12.l0).LJIIIZ);
        c474500IjALIZ.LJJII(Long.valueOf(((C745220TLc) obj).LIZ), "default_mute_set");
        User user = ((C750620TcS) afS32S0210000_12.l0).LIZ;
        Long lValueOf3 = null;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "to_user_id");
        c474500IjALIZ.LJJII("profile_card", "entry_point");
        Room room = (Room) afS32S0210000_12.l1;
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        Room room2 = (Room) afS32S0210000_12.l1;
        if (room2 != null) {
            lValueOf3 = Long.valueOf(room2.getId());
        }
        c474500IjALIZ.LJJII(lValueOf3, "room_id");
        c474500IjALIZ.LJJII(strLIZJ, "admin_type");
        c474500IjALIZ.LJJII(((C750620TcS) afS32S0210000_12.l0).LJIIIIZZ, "enter_from");
        if (afS32S0210000_12.z2) {
            str = "set";
        } else {
            str = "cancel";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).Ru0().LIZ), "mute_duration");
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("MuteBehavior@97a4.reportClickMute$1$1");
    }

    public static final void accept$6(AfS32S0210000_12 afS32S0210000_12, Object obj) {
        int i;
        IHostAppContext iHostAppContext;
        C1C7U.LIZ("GameLiveBackgroundFrameManager@16e4.init$1");
        C006A c006aLIZJ = C1161920gLG.LIZJ(IHostAppContext.class);
        Boolean boolValueOf = null;
        if ((c006aLIZJ instanceof IHostAppContext) && (iHostAppContext = (IHostAppContext) c006aLIZJ) != null) {
            boolValueOf = Boolean.valueOf(iHostAppContext.isAppBackground());
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C776890Udj c776890Udj = (C776890Udj) afS32S0210000_12.l0;
            if (!c776890Udj.LJ) {
                c776890Udj.LIZLLL = new C776910Udl((C776890Udj) afS32S0210000_12.l0);
                C776910Udl c776910Udl = ((C776890Udj) afS32S0210000_12.l0).LIZLLL;
                if (c776910Udl != null) {
                    AbstractC1273900jFs abstractC1273900jFs = (AbstractC1273900jFs) afS32S0210000_12.l1;
                    boolean z = afS32S0210000_12.z2;
                    if (abstractC1273900jFs != null) {
                        int iLJJIIZI = abstractC1273900jFs.LLD().LJJIIZI();
                        int iLJJIIJ = abstractC1273900jFs.LLD().LJJIIJ();
                        int i2 = 640;
                        if (z) {
                            i = 640;
                            i2 = 360;
                        } else {
                            i = 360;
                        }
                        if (iLJJIIZI > 0 && iLJJIIJ > 0) {
                            i2 = 1280;
                            if (z) {
                                if (iLJJIIZI > 1280) {
                                    i = 1280;
                                } else {
                                    i = iLJJIIZI;
                                }
                                i2 = (iLJJIIJ * i) / iLJJIIZI;
                            } else {
                                if (iLJJIIJ <= 1280) {
                                    i2 = iLJJIIJ;
                                }
                                i = (iLJJIIZI * i2) / iLJJIIJ;
                            }
                        }
                        Bundle bundle = new Bundle();
                        bundle.putInt("mode", 2);
                        bundle.putInt(Scene.SCENE_SERVICE, 2);
                        bundle.putInt("width", i);
                        bundle.putInt("height", i2);
                        if (!z) {
                            bundle.putFloat("rotation", -90.0f);
                        }
                        abstractC1273900jFs.LJLIIIL(bundle, c776910Udl.LIZJ, c776910Udl);
                        if (!c776910Udl.LIZIZ.get()) {
                            c776910Udl.LIZIZ.set(true);
                            c776910Udl.LIZLLL = System.currentTimeMillis();
                            c776910Udl.LIZJ.LIZ = 1;
                        }
                    }
                }
                ((C776890Udj) afS32S0210000_12.l0).LJ = true;
            } else {
                C776910Udl c776910Udl2 = c776890Udj.LIZLLL;
                if (c776910Udl2 != null && !c776910Udl2.LIZIZ.get()) {
                    c776910Udl2.LIZIZ.set(true);
                    c776910Udl2.LIZLLL = System.currentTimeMillis();
                    c776910Udl2.LIZJ.LIZ = 1;
                }
            }
        }
        C1C7U.LIZIZ("GameLiveBackgroundFrameManager@16e4.init$1");
    }

    public AfS32S0210000_12(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
