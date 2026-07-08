package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.ability.SuppressPanelAutoSwitchAbility;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06w8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class DialogInterfaceOnDismissListenerC1767806w8 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onDismiss$10(this, dialogInterface);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onDismiss$11(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC1767806w8(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public DialogInterfaceOnDismissListenerC1767806w8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        ((AnonymousClass0634) dialogInterfaceOnDismissListenerC1767806w8.l0).LL.setCurrentState(Lifecycle.State.DESTROYED);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        ((C1618706Vl) dialogInterfaceOnDismissListenerC1767806w8.l0).LL.setCurrentState(Lifecycle.State.DESTROYED);
    }

    public static final void onDismiss$10(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIIJJI(dialogInterface);
        ((C1686306iz) dialogInterfaceOnDismissListenerC1767806w8.l0).LLZLI();
        ((C1686306iz) dialogInterfaceOnDismissListenerC1767806w8.l0).LLILZ = null;
    }

    public static final void onDismiss$11(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        C20684815ws.LJIILLIIL("confirm_link_privacy_pop_up", C2097908Jt.LIZJ(new Pair("result", "close")));
        ((C20515215Pi) dialogInterfaceOnDismissListenerC1767806w8.l0).LIZIZ();
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        ((Function1) dialogInterfaceOnDismissListenerC1767806w8.l0).invoke(Boolean.valueOf(C1391190mJ3.LJIIJJI(dialogInterface) instanceof C1752506tf));
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        SuppressPanelAutoSwitchAbility suppressPanelAutoSwitchAbility;
        Fragment fragment = (Fragment) dialogInterfaceOnDismissListenerC1767806w8.l0;
        if (fragment != null && (suppressPanelAutoSwitchAbility = (SuppressPanelAutoSwitchAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), SuppressPanelAutoSwitchAbility.class, null)) != null) {
            suppressPanelAutoSwitchAbility.rq0(false);
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        AnonymousClass0956 anonymousClass0956 = ((OpenCelebrationCreateAction) dialogInterfaceOnDismissListenerC1767806w8.l0).LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        InterfaceC1642506bv interfaceC1642506bv;
        ViewOnClickListenerC1643106c1 viewOnClickListenerC1643106c1 = (ViewOnClickListenerC1643106c1) dialogInterfaceOnDismissListenerC1767806w8.l0;
        viewOnClickListenerC1643106c1.getClass();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "off";
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1642806by(viewOnClickListenerC1643106c1, c259800zU, null), 3);
        if (viewOnClickListenerC1643106c1.LLILZLL != EnumC1643006c0.NO_ONE && (interfaceC1642506bv = viewOnClickListenerC1643106c1.LLILZIL) != null) {
            interfaceC1642506bv.call();
        }
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        AnonymousClass0956 anonymousClass0956 = ((ReplaceMusicWithMovieHelper) dialogInterfaceOnDismissListenerC1767806w8.l0).LLJJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343980De8) {
            C912070ZqH.LIZIZ.LJIJJ().LIZJ().LIZIZ(2, "chat");
        }
        ((C1692206jw) dialogInterfaceOnDismissListenerC1767806w8.l0).LLZLI();
        ((C1692206jw) dialogInterfaceOnDismissListenerC1767806w8.l0).LLILZIL = null;
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        ((C06ME) ((C1600306Oj) dialogInterfaceOnDismissListenerC1767806w8.l0).LLIZ.getValue()).LLZLI();
    }

    public static final void onDismiss$9(DialogInterfaceOnDismissListenerC1767806w8 dialogInterfaceOnDismissListenerC1767806w8, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1767806w8.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
