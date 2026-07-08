package Y;

import X.AbstractC960710b6j;
import X.AnonymousClass0956;
import X.C0WZX;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C932420aN6;
import X.C980540bci;
import X.C986720bmg;
import X.EnumC980460bca;
import X.EnumC980470bcb;
import X.InterfaceC420801kM;
import X.InterfaceC980560bck;
import X.ViewOnClickListenerC986770bml;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.Editable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestQuickConnectInviteSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import com.bytedance.android.livesdk.share.ShareSettingsDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
public class ATListenerS448S0100000_15 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS448S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS448S0100000_15 aTListenerS448S0100000_15, View view, MotionEvent motionEvent) {
        ((InterfaceC420801kM) aTListenerS448S0100000_15.l0).dispose();
        return false;
    }

    public static final boolean onTouch$1(ATListenerS448S0100000_15 aTListenerS448S0100000_15, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((MultiGuestQuickConnectInviteSheetFragment) aTListenerS448S0100000_15.l0).MR();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS448S0100000_15 aTListenerS448S0100000_15, View view, MotionEvent motionEvent) {
        int height;
        if (motionEvent.getAction() == 2) {
            MultiGuestUserInfoFragment multiGuestUserInfoFragment = (MultiGuestUserInfoFragment) aTListenerS448S0100000_15.l0;
            if (!multiGuestUserInfoFragment.hasScrollAndChangeUi) {
                Animator animatorWR = multiGuestUserInfoFragment.WR();
                if (animatorWR != null) {
                    animatorWR.start();
                }
                Animator animatorWR2 = ((MultiGuestUserInfoFragment) aTListenerS448S0100000_15.l0).WR();
                if (animatorWR2 != null) {
                    animatorWR2.addListener(new AAListenerS267S0200000_15(view, (MultiGuestUserInfoFragment) aTListenerS448S0100000_15.l0, 3));
                }
                ViewGroup viewGroup = ((MultiGuestUserInfoFragment) aTListenerS448S0100000_15.l0).gifterAvatarContainer;
                if (viewGroup != null) {
                    height = viewGroup.getHeight();
                } else {
                    height = 0;
                }
                C786410Ut5.Pd(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -height).setDuration(300L));
                MultiGuestUserInfoFragment multiGuestUserInfoFragment2 = (MultiGuestUserInfoFragment) aTListenerS448S0100000_15.l0;
                multiGuestUserInfoFragment2.hasScrollAndChangeUi = true;
                ViewGroup viewGroup2 = multiGuestUserInfoFragment2.avatarTopContainer;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(0, viewGroup2);
                }
                Animator animatorZR = ((MultiGuestUserInfoFragment) aTListenerS448S0100000_15.l0).ZR();
                if (animatorZR != null) {
                    animatorZR.start();
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS448S0100000_15 aTListenerS448S0100000_15, View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (((ViewOnClickListenerC986770bml) aTListenerS448S0100000_15.l0).P0()) {
            ((ViewOnClickListenerC986770bml) aTListenerS448S0100000_15.l0).getContainerScaleDetector().onTouchEvent(motionEvent);
            if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setAction(3);
                ((ViewOnClickListenerC986770bml) aTListenerS448S0100000_15.l0).LLLZLZ.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
            if (motionEvent.getPointerCount() >= 2) {
                return true;
            }
        }
        return ((ViewOnClickListenerC986770bml) aTListenerS448S0100000_15.l0).LLLZLZ.onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$4(ATListenerS448S0100000_15 aTListenerS448S0100000_15, View view, MotionEvent motionEvent) {
        if (((C986720bmg) aTListenerS448S0100000_15.l0).e0()) {
            ((C986720bmg) aTListenerS448S0100000_15.l0).getContainerScaleDetector().onTouchEvent(motionEvent);
            if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setAction(3);
                ((C986720bmg) aTListenerS448S0100000_15.l0).LLJLILLLLZIIL.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
            if (motionEvent.getPointerCount() >= 2) {
                return true;
            }
        }
        return ((C986720bmg) aTListenerS448S0100000_15.l0).LLJLILLLLZIIL.onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$5(ATListenerS448S0100000_15 aTListenerS448S0100000_15, View view, MotionEvent motionEvent) {
        String str;
        EnumC980460bca enumC980460bca;
        if (motionEvent.getAction() == 0) {
            ((ShareSettingsDialog) aTListenerS448S0100000_15.l0).getClass();
            boolean z = !ShareSettingsDialog.NR().isOn();
            ((ShareSettingsDialog) aTListenerS448S0100000_15.l0).getClass();
            if (ShareSettingsDialog.NR().isOn()) {
                str = "switch_turn_off";
            } else {
                str = "switch_turn_on";
            }
            ((IMatchAICommentaryService) C1161920gLG.LIZJ(IMatchAICommentaryService.class)).O92(((ShareSettingsDialog) aTListenerS448S0100000_15.l0).dataChannel, str);
            IMatchAICommentaryService iMatchAICommentaryService = (IMatchAICommentaryService) C1161920gLG.LIZJ(IMatchAICommentaryService.class);
            final ShareSettingsDialog shareSettingsDialog = (ShareSettingsDialog) aTListenerS448S0100000_15.l0;
            DataChannel dataChannel = shareSettingsDialog.dataChannel;
            if (z) {
                enumC980460bca = EnumC980460bca.ON;
            } else {
                enumC980460bca = EnumC980460bca.OFF;
            }
            iMatchAICommentaryService.Jr0(new C980540bci(dataChannel, enumC980460bca, EnumC980470bcb.AUDIENCE_SHARE_SETTING_SWITCH), new InterfaceC980560bck() { // from class: X.0bcd
                @Override // X.InterfaceC980560bck
                public final void onSuccess() {
                    shareSettingsDialog.getClass();
                    boolean zIsOn = ShareSettingsDialog.NR().isOn();
                    shareSettingsDialog.MR().setChecked(zIsOn);
                    if (zIsOn) {
                        return;
                    }
                    C766270U4b.LIZLLL(2131853703);
                }

                @Override // X.InterfaceC980560bck
                public final void onError(String str2) {
                    if (str2.length() == 0) {
                        C766270U4b.LIZLLL(2131842705);
                    } else {
                        C766270U4b.LJIIJJI(str2);
                    }
                }
            });
        }
        return true;
    }

    public static final boolean onTouch$6(ATListenerS448S0100000_15 aTListenerS448S0100000_15, View view, MotionEvent motionEvent) {
        Rect rect = new Rect();
        ((C932420aN6) aTListenerS448S0100000_15.l0).LJJJJJL().getHitRect(rect);
        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            ((C932420aN6) aTListenerS448S0100000_15.l0).LLJZ = true;
            return false;
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS448S0100000_15 aTListenerS448S0100000_15, View view, MotionEvent motionEvent) throws Throwable {
        TextView textView;
        Editable editableLLLFZ;
        TextView textView2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "Search Button Click");
                View view2 = ((MultiCoHostSearchFragment) aTListenerS448S0100000_15.l0).getView();
                if (view2 != null && (textView2 = (TextView) view2.findViewById(R.id.tv_search_textview)) != null) {
                    C786410Ut5.S4(1.0f, textView2);
                }
                LiveEditText liveEditText = ((MultiCoHostSearchFragment) aTListenerS448S0100000_15.l0).LLILZLL;
                if (liveEditText != null) {
                    editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF8AJhVgcdTdZDViJS7KxlteluS4UTf+R2n5Kq6zvG9zOAmqXithS2+iqmR8x/COWp", null));
                } else {
                    editableLLLFZ = null;
                }
                String string = a0.LJLILLLLZI(String.valueOf(editableLLLFZ)).toString();
                if (string.length() > 0) {
                    AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) ((MultiCoHostSearchFragment) aTListenerS448S0100000_15.l0).LLILLL;
                    if (abstractC960710b6j != null) {
                        abstractC960710b6j.LJIJJLI(string);
                    }
                    ((MultiCoHostSearchFragment) aTListenerS448S0100000_15.l0).iS();
                    MultiCoHostSearchFragment multiCoHostSearchFragment = (MultiCoHostSearchFragment) aTListenerS448S0100000_15.l0;
                    multiCoHostSearchFragment.nS(multiCoHostSearchFragment.LLJILJIL, AFwS203S0000000_15.get$arr$(368));
                    MultiCoHostSearchFragment multiCoHostSearchFragment2 = (MultiCoHostSearchFragment) aTListenerS448S0100000_15.l0;
                    multiCoHostSearchFragment2.LLJJIJIL = 2;
                    AnonymousClass0956 anonymousClass0956 = multiCoHostSearchFragment2.LLJJI;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    MultiCoHostSearchFragment multiCoHostSearchFragment3 = (MultiCoHostSearchFragment) aTListenerS448S0100000_15.l0;
                    AbstractC960710b6j abstractC960710b6j2 = (AbstractC960710b6j) multiCoHostSearchFragment3.LLILLL;
                    if (abstractC960710b6j2 != null) {
                        abstractC960710b6j2.LJIJI(multiCoHostSearchFragment3.LLJJIJIL, SystemClock.elapsedRealtime(), string);
                        return true;
                    }
                }
            }
        } else {
            View view3 = ((MultiCoHostSearchFragment) aTListenerS448S0100000_15.l0).getView();
            if (view3 != null && (textView = (TextView) view3.findViewById(R.id.tv_search_textview)) != null) {
                C786410Ut5.S4(0.5f, textView);
                return true;
            }
        }
        return true;
    }
}
