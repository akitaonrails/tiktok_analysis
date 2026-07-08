package X;

import Y.AObjectS1S0900000_12;
import Y.AObjectS288S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Tja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class ViewOnClickListenerC755040Tja extends DialogC1118080fCY implements View.OnClickListener, InterfaceC755430TkD, InterfaceC755080Tje, InterfaceC750500TcG {
    public final Context LLJILJILJ;
    public final AbstractC1110800f0o<?> LLJILLL;
    public User LLJJ;
    public final Room LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final AbstractC1136060ffY LLJJIJIIJIL;
    public final InterfaceC2262081DgM LLJJIJIL;
    public final C1111350f1h LLJJJ;
    public final String LLJJJIL;
    public final boolean LLJJJJ;
    public final boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final String LLJJL;
    public final Map<String, String> LLJJLIIIJLLLLLLLZ;
    public final Function0<Unit> LLJL;
    public final Function0<Unit> LLJLIL;
    public final Function0<Unit> LLJLILLLLZIIL;
    public final FragmentManager LLJLL;
    public final Function0<Unit> LLJLLIL;
    public final boolean LLJLLL;
    public final DataChannel LLJZ;
    public final String LLJZIJLIL;
    public final Function0<Unit> LLL;
    public boolean LLLF;
    public final C755060Tjc LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final boolean LLLI;
    public View LLLII;
    public View LLLIIII;
    public C20745116Ft LLLIIIIL;
    public final C21627319kV LLLIIIL;

    @Override // X.InterfaceC755430TkD
    public final void FN() {
    }

    @Override // X.InterfaceC755430TkD
    public final void TC(C752140Teu c752140Teu, Exception exc) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LLLFFI = false;
        this.LLLFF.detachView();
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC755080Tje
    public final void LLJJIJI() {
        if (this.LLLFFI) {
            this.LLLFZ = false;
            LJLI(true);
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLFFI = true;
    }

    @Override // X.DialogC1118080fCY, X.C19GI, X.DialogC21505919Ej, android.app.Dialog
    public final void onStart() throws JSONException {
        View decorView;
        View decorView2;
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(1024);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setNavigationBarColor(C20736316Cj.LIZIZ(R.attr.fx2, getContext()));
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setLayout(-1, -1);
        }
        Activity activityLJIJ = C520010KaN.LJIJ(this.LLJILJILJ, false);
        if (activityLJIJ == null || !C500260Jjc.LJJII(activityLJIJ.getRequestedOrientation())) {
            return;
        }
        View viewFindViewById = findViewById(R.id.a2s);
        WindowManager.LayoutParams attributes = null;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (viewFindViewById != null ? viewFindViewById.getLayoutParams() : null);
        layoutParams.width = Math.min(C14KS.LIZLLL(), C14KS.LJFF());
        C19R0 c19r0 = (C19R0) findViewById(R.id.a2s);
        if (c19r0 != null) {
            c19r0.setBottomEndRadius((int) C497740JfY.LIZIZ(12.0f));
        }
        C19R0 c19r02 = (C19R0) findViewById(R.id.a2s);
        if (c19r02 != null) {
            c19r02.setBottomStartRadius((int) C497740JfY.LIZIZ(12.0f));
        }
        C19R0 c19r03 = (C19R0) findViewById(R.id.a2s);
        if (c19r03 != null) {
            c19r03.setTopEndRadius((int) C497740JfY.LIZIZ(12.0f));
        }
        C19R0 c19r04 = (C19R0) findViewById(R.id.a2s);
        if (c19r04 != null) {
            c19r04.setTopStartRadius((int) C497740JfY.LIZIZ(12.0f));
        }
        layoutParams.setMargins(0, 0, 0, (int) C497740JfY.LIZIZ(8.0f));
        layoutParams.gravity = 81;
        Window window6 = getWindow();
        if (window6 != null && (decorView2 = window6.getDecorView()) != null) {
            decorView2.setSystemUiVisibility(3846);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Window window7 = getWindow();
            if (window7 != null && (attributes = window7.getAttributes()) != null) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            Window window8 = getWindow();
            if (window8 != null) {
                window8.setAttributes(attributes);
            }
            Window window9 = getWindow();
            if (window9 == null || (decorView = window9.getDecorView()) == null) {
                return;
            }
            decorView.setSystemUiVisibility(3846);
        }
    }

    public final Map LJJZZI(boolean z) {
        long id;
        C20337914i1<Boolean> c20337914i1;
        String str;
        Room room;
        User owner;
        Room room2;
        HashMap map = new HashMap();
        DataChannel dataChannel = this.LLJZ;
        long id2 = 0;
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        map.put("room_id", String.valueOf(id));
        if (!z) {
            DataChannel dataChannel2 = this.LLJZ;
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
                id2 = owner.getId();
            }
            map.put("anchor_id", String.valueOf(id2));
        }
        map.put("type", "global_default_on");
        if (!z) {
            c20337914i1 = InterfaceC1106030et7.G5;
        } else {
            c20337914i1 = InterfaceC1106030et7.J5;
        }
        if (c20337914i1.LIZIZ().booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        map.put("from_status", str);
        map.put("position", "long_press");
        return map;
    }

    public final void LJJZZIII(int i) {
        String str;
        if (this.LLJLL == null) {
            return;
        }
        AbstractC1136060ffY abstractC1136060ffY = this.LLJJIJIIJIL;
        if (abstractC1136060ffY instanceof ChatMessage) {
            str = ((ChatMessage) abstractC1136060ffY).content;
        } else {
            str = "";
        }
        ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).M22(this.LLJJI.getId(), str, this.LLJLL, i, Long.valueOf(this.LLJJIJIIJIL.getMessageId()));
    }

    public final C474500IjA LJL(String str) {
        Boolean boolValueOf;
        String str2;
        UserAttr userAttr;
        String str3;
        long id;
        ChatMessage chatMessage;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manage_negative_comment");
        Long lValueOf = null;
        if (this.LLJJIII) {
            str2 = "anchor";
        } else {
            InterfaceC2262081DgM interfaceC2262081DgM = this.LLJJIJIL;
            if (interfaceC2262081DgM != null && (userAttr = interfaceC2262081DgM.getUserAttr()) != null) {
                boolValueOf = Boolean.valueOf(userAttr.isAdmin);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                str2 = "admin";
            } else {
                str2 = "viewer";
            }
        }
        c474500IjALIZ.LJJII(str2, "admin_type");
        User user = this.LLJJ;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        c474500IjALIZ.LJJII(lValueOf, "to_user_id");
        AbstractC1136060ffY abstractC1136060ffY = this.LLJJIJIIJIL;
        if (!(abstractC1136060ffY instanceof ChatMessage) || (chatMessage = (ChatMessage) abstractC1136060ffY) == null || (str3 = chatMessage.content) == null) {
            str3 = "";
        }
        c474500IjALIZ.LJJII(str3, "live_message");
        c474500IjALIZ.LJJII(str, "manage_action");
        InterfaceC2262081DgM interfaceC2262081DgM2 = this.LLJJIJIL;
        if (interfaceC2262081DgM2 != null) {
            id = interfaceC2262081DgM2.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJJI.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJJI.getId()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJJIJIIJIL.getMessageId()), "msg_id");
        return c474500IjALIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI(boolean r10) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC755040Tja.LJLI(boolean):void");
    }

    @Override // X.InterfaceC755080Tje
    public final void a(InterfaceC2262081DgM interfaceC2262081DgM) {
        if (!this.LLLFFI) {
            return;
        }
        if (interfaceC2262081DgM != null && interfaceC2262081DgM.getId() > 0) {
            User userFrom = User.from(interfaceC2262081DgM);
            if (userFrom != null) {
                this.LLJJ = userFrom;
                this.LLLFZ = true;
                LJLI(false);
                return;
            } else {
                new IllegalArgumentException("User is invalid");
                LLJJIJI();
                return;
            }
        }
        new IllegalArgumentException("User is invalid");
        LLJJIJI();
    }

    @Override // X.InterfaceC750500TcG
    public final void ca(Exception exc) {
        if (!this.LLLFFI) {
            return;
        }
        C501540Jlg.LIZLLL(this.LLJILJILJ, exc, 2131853482);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0220  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r35) {
        /*
            Method dump skipped, instruction units count: 1623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC755040Tja.onClick(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01df  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC755040Tja.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC750500TcG
    public final void cd(long j, boolean z) {
        if (z) {
            C474500IjA c474500IjALJL = LJL("mute");
            c474500IjALJL.LJJII(Long.valueOf(j), "mute_duration");
            c474500IjALJL.LJJII(Long.valueOf(j), "default_mute_set");
            c474500IjALJL.LIZ();
            LJJZZIII(1);
        }
        if (!this.LLLFFI) {
            return;
        }
        LJLI(false);
    }

    public ViewOnClickListenerC755040Tja(Context context, AbstractC1110800f0o abstractC1110800f0o, User user, Room room, boolean z, boolean z2, AbstractC1136060ffY abstractC1136060ffY, InterfaceC2262081DgM interfaceC2262081DgM, C1111350f1h c1111350f1h, String str, boolean z3, boolean z4, boolean z5, String str2, Map map, AObjectS1S0900000_12 aObjectS1S0900000_12, Function0 function0, AObjectS288S0200000_12 aObjectS288S0200000_12, FragmentManager fragmentManager, C513101zF c513101zF, boolean z6, DataChannel dataChannel, String str3, AObjectS288S0200000_12 aObjectS288S0200000_122) {
        Long lValueOf;
        Object objValueOf;
        super(context, true);
        this.LLJILJILJ = context;
        this.LLJILLL = abstractC1110800f0o;
        this.LLJJ = user;
        this.LLJJI = room;
        this.LLJJIII = z;
        this.LLJJIJI = z2;
        this.LLJJIJIIJIL = abstractC1136060ffY;
        this.LLJJIJIL = interfaceC2262081DgM;
        this.LLJJJ = c1111350f1h;
        this.LLJJJIL = str;
        this.LLJJJJ = z3;
        this.LLJJJJJIL = z4;
        this.LLJJJJLIIL = z5;
        this.LLJJL = str2;
        this.LLJJLIIIJLLLLLLLZ = map;
        this.LLJL = aObjectS1S0900000_12;
        this.LLJLIL = function0;
        this.LLJLILLLLZIIL = aObjectS288S0200000_12;
        this.LLJLL = fragmentManager;
        this.LLJLLIL = c513101zF;
        this.LLJLLL = z6;
        this.LLJZ = dataChannel;
        this.LLJZIJLIL = str3;
        this.LLL = aObjectS288S0200000_122;
        C755060Tjc c755060Tjc = new C755060Tjc();
        c755060Tjc.attachView(this);
        this.LLLFF = c755060Tjc;
        User user2 = this.LLJJ;
        if (user2 != null) {
            lValueOf = Long.valueOf(user2.getId());
        } else {
            lValueOf = null;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            objValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            objValueOf = 0;
        }
        this.LLLI = Intrinsics.LJFF(lValueOf, objValueOf);
        this.LLLIIIL = C21627319kV.LIZJ();
    }
}
