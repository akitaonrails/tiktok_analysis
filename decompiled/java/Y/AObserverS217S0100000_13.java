package Y;

import X.AnonymousClass1224;
import X.C0CV2;
import X.C0TA0;
import X.C0VGD;
import X.C0VGG;
import X.C0VGI;
import X.C0XQ7;
import X.C1447790nmL;
import X.C15O7;
import X.C1697810uHb;
import X.C786410Ut5;
import X.C854460XfY;
import X.C854740Xg0;
import X.EnumC19241510Pl;
import X.InterfaceC1237470iJ7;
import X.InterfaceC853800XeU;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.compliance.agegate.view.DatePickerBottomSheetFragment;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class AObserverS217S0100000_13 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
        }
    }

    public AObserverS217S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        InterfaceC853800XeU interfaceC853800XeU;
        int i;
        InterfaceC1237470iJ7 interfaceC1237470iJ7 = (InterfaceC1237470iJ7) obj;
        if ((interfaceC1237470iJ7 instanceof InterfaceC853800XeU) && (interfaceC853800XeU = (InterfaceC853800XeU) interfaceC1237470iJ7) != null) {
            TuxTextView tuxTextViewZS = ((UnbindInputCodeFragment) aObserverS217S0100000_13.l0).ZS();
            C854460XfY c854460XfY = C854460XfY.LIZ;
            VerificationMethodType verificationMethodTypeLIZJ = interfaceC853800XeU.LIZJ();
            c854460XfY.getClass();
            if (!((ArrayList) C854460XfY.LJFF(r3, verificationMethodTypeLIZJ)).isEmpty()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextViewZS, i);
        }
    }

    public static final void onChanged$1(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        Date date = (Date) obj;
        DatePickerBottomSheetFragment datePickerBottomSheetFragment = (DatePickerBottomSheetFragment) aObserverS217S0100000_13.l0;
        View view = datePickerBottomSheetFragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS82S0200000_13(date, datePickerBottomSheetFragment, 97));
        }
    }

    public static final void onChanged$10(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() != -1) {
            C1447790nmL c1447790nmL = (C1447790nmL) aObserverS217S0100000_13.l0;
            TextView textView = c1447790nmL.LLIZ;
            if (textView == null) {
                textView = null;
            }
            textView.setText(c1447790nmL.getContext().getResources().getString(2131844968, num));
        }
    }

    public static final void onChanged$11(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        List<C0TA0> currentPluginList;
        C0TA0 next;
        IPluginService.PluginDataWrapper value;
        IPluginService.SimplePluginData simplePluginData;
        if (obj == C0CV2.REQUEST_SUCCESS) {
            C0VGG.LIZ.getClass();
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService != null && (currentPluginList = iPluginService.getCurrentPluginList()) != null) {
                Iterator<C0TA0> it2 = currentPluginList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getType() == EnumC19241510Pl.UB_TRACKING_CONFIG) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0TA0 c0ta0 = next;
                if (c0ta0 != null && (value = c0ta0.getValue()) != null && (simplePluginData = value.simplePluginData) != null && simplePluginData.abGroup == 1) {
                    C0VGG c0vgg = C0VGG.LIZ;
                    C0VGD c0vgd = new C0VGD(true, AwemeConfigCenter.LIZIZ(), C1697810uHb.LJ("/passport/"), C1697810uHb.LJ("video_play_cla_related", "click_see_translation", "click_see_original", "ec_search_pdp_params_verify_error", "rd_ec_request_result", "rd_ec_request_send", "rd_tiktokec_track_error", "trending_words_click", "search_history", "enter_search_blankpage"), 40);
                    Context context = (Context) aObserverS217S0100000_13.l0;
                    c0vgg.getClass();
                    C0VGG.LIZ(c0vgd, context);
                }
            }
        }
        C0VGI c0vgi = C0VGG.LIZIZ;
        if (c0vgi != null) {
            c0vgi.onComplete();
        }
    }

    public static final void onChanged$12(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        ImageView imageView = null;
        if (((Boolean) obj).booleanValue()) {
            ImageView imageView2 = ((ChooseMusicSelectView) aObserverS217S0100000_13.l0).LLJIJIL;
            if (imageView2 != null) {
                imageView = imageView2;
            }
            C786410Ut5.V4(imageView, 1.0f);
            return;
        }
        ImageView imageView3 = ((ChooseMusicSelectView) aObserverS217S0100000_13.l0).LLJIJIL;
        if (imageView3 != null) {
            imageView = imageView3;
        }
        C786410Ut5.V4(imageView, 0.35f);
    }

    public static final void onChanged$13(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        ImageView imageView = null;
        if (((Boolean) obj).booleanValue()) {
            ImageView imageView2 = ((ChooseMusicSelectView) aObserverS217S0100000_13.l0).LLJ;
            if (imageView2 != null) {
                imageView = imageView2;
            }
            C786410Ut5.LJZI(0, imageView);
            return;
        }
        ImageView imageView3 = ((ChooseMusicSelectView) aObserverS217S0100000_13.l0).LLJ;
        if (imageView3 != null) {
            imageView = imageView3;
        }
        C786410Ut5.LJZI(8, imageView);
    }

    public static final void onChanged$14(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        View view = null;
        if (((Boolean) obj).booleanValue()) {
            View view2 = ((ChooseMusicSelectView) aObserverS217S0100000_13.l0).LLILLJJLI;
            if (view2 != null) {
                view = view2;
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        View view3 = ((ChooseMusicSelectView) aObserverS217S0100000_13.l0).LLILLJJLI;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public static final void onChanged$15(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        TextView textView = ((AnonymousClass1224) aObserverS217S0100000_13.l0).LLJILJIL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    public static final void onChanged$16(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        if (obj != null) {
            AccountFlowFragmentViewModel accountFlowFragmentViewModel = (AccountFlowFragmentViewModel) ((BaseI18nLoginFragment) aObserverS217S0100000_13.l0).LLILLJJLI.getValue();
            if (accountFlowFragmentViewModel.LL.getValue() == null) {
                accountFlowFragmentViewModel.LL.postValue(obj);
            }
        }
    }

    public static final void onChanged$2(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        DatePickerBottomSheetFragment datePickerBottomSheetFragment = (DatePickerBottomSheetFragment) aObserverS217S0100000_13.l0;
        datePickerBottomSheetFragment.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime((Date) obj);
        View view = datePickerBottomSheetFragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS82S0200000_13(calendar, datePickerBottomSheetFragment, 99));
        }
    }

    public static final void onChanged$3(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        DatePickerBottomSheetFragment datePickerBottomSheetFragment = (DatePickerBottomSheetFragment) aObserverS217S0100000_13.l0;
        datePickerBottomSheetFragment.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime((Date) obj);
        View view = datePickerBottomSheetFragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS82S0200000_13(calendar, datePickerBottomSheetFragment, 98));
        }
    }

    public static final void onChanged$4(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        DatePickerBottomSheetFragment datePickerBottomSheetFragment = (DatePickerBottomSheetFragment) aObserverS217S0100000_13.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        View view = datePickerBottomSheetFragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS32S0110000_13(datePickerBottomSheetFragment, zBooleanValue, 12));
        }
    }

    public static final void onChanged$5(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        DatePickerBottomSheetFragment datePickerBottomSheetFragment = (DatePickerBottomSheetFragment) aObserverS217S0100000_13.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        View view = datePickerBottomSheetFragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS32S0110000_13(datePickerBottomSheetFragment, zBooleanValue, 13));
        }
    }

    public static final void onChanged$6(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        String str = (String) obj;
        DatePickerBottomSheetFragment datePickerBottomSheetFragment = (DatePickerBottomSheetFragment) aObserverS217S0100000_13.l0;
        View view = datePickerBottomSheetFragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS18S1100000_13(datePickerBottomSheetFragment, str, 23));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$7(Y.AObserverS217S0100000_13 r6, java.lang.Object r7) {
        /*
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r6.l0
            com.ss.android.ugc.aweme.compliance.agegate.view.DatePickerBottomSheetFragment r3 = (com.ss.android.ugc.aweme.compliance.agegate.view.DatePickerBottomSheetFragment) r3
            r6 = 0
            if (r7 == 0) goto L35
            r3.getClass()
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            if (r0 != 0) goto L35
            r0 = 0
        L13:
            r5 = 2131390854(0x7f0a7186, float:1.8402291E38)
            r4 = 0
            if (r0 == 0) goto L37
            android.widget.LinearLayout r1 = r3.LLILZ
            if (r1 != 0) goto L2d
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto L27
            android.view.View r4 = r0.findViewById(r5)
        L27:
            r0 = r4
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.LLILZ = r0
            r1 = r4
        L2d:
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0 = 8
            X.C786410Ut5.LJZL(r0, r1)
            return
        L35:
            r0 = 1
            goto L13
        L37:
            com.bytedance.tux.icon.TuxIconView r2 = r3.LLILZIL
            if (r2 != 0) goto L4d
            android.view.View r1 = r3.getView()
            if (r1 == 0) goto L8d
            r0 = 2131390853(0x7f0a7185, float:1.840229E38)
            android.view.View r2 = r1.findViewById(r0)
        L48:
            r0 = r2
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            r3.LLILZIL = r0
        L4d:
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1 = -65536(0xffffffffffff0000, float:NaN)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            android.widget.LinearLayout r1 = r3.LLILZ
            if (r1 != 0) goto L69
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto L8b
            android.view.View r1 = r0.findViewById(r5)
        L64:
            r0 = r1
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.LLILZ = r0
        L69:
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            X.C786410Ut5.LJZL(r6, r1)
            com.bytedance.tux.input.TuxTextView r0 = r3.LLILZLL
            if (r0 != 0) goto L85
            android.view.View r1 = r3.getView()
            if (r1 == 0) goto L7f
            r0 = 2131390847(0x7f0a717f, float:1.8402277E38)
            android.view.View r4 = r1.findViewById(r0)
        L7f:
            r0 = r4
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r3.LLILZLL = r0
            r0 = r4
        L85:
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r7)
            return
        L8b:
            r1 = r4
            goto L64
        L8d:
            r2 = r4
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS217S0100000_13.onChanged$7(Y.AObserverS217S0100000_13, java.lang.Object):void");
    }

    public static final void onChanged$8(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            SecurityVerificationCell securityVerificationCell = (SecurityVerificationCell) aObserverS217S0100000_13.l0;
            securityVerificationCell.getClass();
            C0XQ7.LJ();
            C0XQ7.LIZ.LJFF().getTwoStepVerificationStatusFromNetwork().LJ(new C854740Xg0(securityVerificationCell, 1), C15O7.LJIIIIZZ, null);
        }
    }

    public static final void onChanged$9(AObserverS217S0100000_13 aObserverS217S0100000_13, Object obj) {
        ((C1447790nmL) aObserverS217S0100000_13.l0).LJIIIZ(((Integer) obj).intValue());
    }
}
