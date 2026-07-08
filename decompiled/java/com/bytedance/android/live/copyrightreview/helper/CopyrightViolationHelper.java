package com.bytedance.android.live.copyrightreview.helper;

import X.C0IJT;
import X.C1091120eV4;
import X.C1133830fbx;
import X.C11JF;
import X.C11NJ;
import X.C11S5;
import X.C1701940uOG;
import X.C19GN;
import X.C19GO;
import X.C2189631Amn;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C766270U4b;
import X.C786410Ut5;
import X.DialogInterfaceOnClickListenerC2189551Amf;
import X.DialogInterfaceOnClickListenerC2189621Amm;
import Y.ARunnableS133S0100000_33;
import Y.AfS202S0100000_33;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.copyrightreview.ReviewApi;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;

/* JADX INFO: loaded from: classes34.dex */
public class CopyrightViolationHelper implements GenericLifecycleObserver {
    public final BPEAHandler LL;
    public C19GN LLILLJJLI;
    public C19GN LLILLL;
    public C11JF LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final Runnable LLIZ;
    public final ARunnableS133S0100000_33 LLIZLLLIL = new ARunnableS133S0100000_33(this, 0);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C19GN c19gn = this.LLILLJJLI;
        if (c19gn != null && c19gn.isShowing()) {
            C786410Ut5.LIZIZ(this.LLILLJJLI);
        }
        C19GN c19gn2 = this.LLILLL;
        if (c19gn2 != null && c19gn2.isShowing()) {
            C786410Ut5.LIZIZ(this.LLILLL);
        }
        this.LL.removeMessages(1);
        this.LL.removeMessages(2);
    }

    public static boolean LIZIZ(Room room) {
        if (room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public final void LJ(int i) {
        if (!this.LL.hasMessages(i)) {
            C786410Ut5.LJLJJI(i, 2000L, this.LL);
        }
        C766270U4b.LIZLLL(2131842708);
    }

    public CopyrightViolationHelper(BaseFragment baseFragment, Runnable runnable) {
        baseFragment.getLifecycle().addObserver(this);
        this.LLIZ = runnable;
        this.LL = new BPEAHandler(new C2189631Amn(this, 0));
    }

    public static void LIZJ(Room room, boolean z, String str) {
        String str2;
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(room.author().getId()));
        map.put("room_id", String.valueOf(room.getId()));
        if (z) {
            map.put("button_click_type", str);
            if (LIZIZ(room)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            map.put("object_oriented", str2);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_copyright_notification_popup_click");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
            return;
        }
        map.put("button_type", str);
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_copyright_warning_popup_click");
        c474500IjALIZ2.LJJIIZI(map);
        c474500IjALIZ2.LIZ();
    }

    public final C11JF LIZLLL(Room room, int i, int i2) {
        C480460Ism.LIZ().getClass();
        return (C11JF) ((ReviewApi) C480460Ism.LIZLLL(ReviewApi.class)).confirmCopyright(room.getId(), i, i2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS202S0100000_33(this, 4), new AfS202S0100000_33(this, 0));
    }

    public final void LIZ(Context context, RemindMessage remindMessage, final Room room, final C11NJ c11nj) {
        boolean z;
        String str;
        C19GN c19gn;
        final int i = 1;
        if (remindMessage.noticeType == 7) {
            z = true;
        } else {
            z = false;
            C19GN c19gn2 = this.LLILLJJLI;
            if (c19gn2 != null && c19gn2.isShowing()) {
                return;
            }
        }
        if (!this.LLILZIL && !this.LL.hasMessages(1)) {
            if ((!z || (c19gn = this.LLILLL) == null || !c19gn.isShowing()) && !this.LLILZLL && !this.LL.hasMessages(2)) {
                CharSequence charSequenceLJIILIIL = C1133830fbx.LJIILIIL(remindMessage.noticeContent, "");
                if (TextUtils.isEmpty(charSequenceLJIILIIL)) {
                    charSequenceLJIILIIL = remindMessage.content;
                }
                if (TextUtils.isEmpty(charSequenceLJIILIIL)) {
                    return;
                }
                CharSequence charSequenceLJIILIIL2 = C1133830fbx.LJIILIIL(remindMessage.noticeTitle, "");
                if (TextUtils.isEmpty(charSequenceLJIILIIL2)) {
                    charSequenceLJIILIIL2 = C1133830fbx.LJIILIIL(remindMessage.title, "");
                }
                if (TextUtils.isEmpty(charSequenceLJIILIIL2)) {
                    charSequenceLJIILIIL2 = C497740JfY.LJIJI(2131853059);
                }
                if (z) {
                    if (!LIZIZ(room)) {
                        i = 2;
                    }
                    C19GO c19go = new C19GO(context);
                    c19go.LJJIIJ = false;
                    c19go.LJ(2131856767, new DialogInterface.OnClickListener() { // from class: X.1AK0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            CopyrightViolationHelper copyrightViolationHelper = this;
                            C11NJ c11nj2 = c11nj;
                            Room room2 = room;
                            int i3 = i;
                            copyrightViolationHelper.LLILZLL = true;
                            C11JF c11jf = copyrightViolationHelper.LLILZ;
                            if (c11jf != null) {
                                c11jf.dispose();
                            }
                            c11nj2.LIZ(copyrightViolationHelper.LIZLLL(room2, i3, 101));
                            dialogInterface.dismiss();
                            CopyrightViolationHelper.LIZJ(room2, true, "confirm");
                        }
                    }, false);
                    c19go.LIZJ(2131841519, new DialogInterface.OnClickListener() { // from class: X.1AJz
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            CopyrightViolationHelper copyrightViolationHelper = this;
                            Room room2 = room;
                            C11NJ c11nj2 = c11nj;
                            int i3 = i;
                            C11JF c11jf = copyrightViolationHelper.LLILZ;
                            if (c11jf != null) {
                                c11jf.dispose();
                            }
                            CopyrightViolationHelper.LIZJ(room2, true, "end_live");
                            dialogInterface.dismiss();
                            c11nj2.LIZ(copyrightViolationHelper.LIZLLL(room2, i3, 102));
                            if (CopyrightViolationHelper.LIZIZ(room2)) {
                                C464950ILd.LJI.getClass();
                                C464950ILd.LJ(null, 0);
                            } else {
                                Runnable runnable = copyrightViolationHelper.LLIZ;
                                if (runnable == null) {
                                    return;
                                }
                                runnable.run();
                            }
                        }
                    }, false);
                    c19go.LIZLLL = charSequenceLJIILIIL2;
                    c19go.LJIIIIZZ = charSequenceLJIILIIL;
                    this.LLILLL = c19go.LIZ();
                    C19GN c19gn3 = this.LLILLJJLI;
                    if (c19gn3 != null && c19gn3.isShowing()) {
                        C786410Ut5.LJLIIL(2000L, this.LL, this.LLIZLLLIL);
                    } else {
                        C786410Ut5.LJJZZIII(this.LL, this.LLIZLLLIL);
                    }
                } else {
                    C19GO c19go2 = new C19GO(context);
                    c19go2.LJJIIJ = false;
                    c19go2.LJ(2131856767, new DialogInterfaceOnClickListenerC2189621Amm(this, c11nj, room, 0), false);
                    c19go2.LIZJ(2131851480, new DialogInterfaceOnClickListenerC2189551Amf(this, room, 0), false);
                    c19go2.LIZLLL = charSequenceLJIILIIL2;
                    c19go2.LJIIIIZZ = charSequenceLJIILIIL;
                    C19GN c19gnLIZ = c19go2.LIZ();
                    this.LLILLJJLI = c19gnLIZ;
                    C786410Ut5.B4(c19gnLIZ);
                }
                LIZIZ(room);
                C1091120eV4.LIZJ(remindMessage);
                HashMap map = new HashMap();
                map.put("anchor_id", String.valueOf(room.author().getId()));
                map.put("room_id", String.valueOf(room.getId()));
                if (z) {
                    if (LIZIZ(room)) {
                        str = "anchor";
                    } else {
                        str = "user";
                    }
                    map.put("object_oriented", str);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_copyright_notification_popup_show");
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LIZ();
                    return;
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_copyright_warning_popup_show");
                c474500IjALIZ2.LJJIIZI(map);
                c474500IjALIZ2.LIZ();
            }
        }
    }
}
