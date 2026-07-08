package X;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.pipo.ttpay.recharge.RechargeAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.msg.GroupInvitationCardAssem;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0IDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC462870IDd implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onGlobalLayout$9(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        Layout layout = ((C431730GwN) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getLayout();
        if (layout != null) {
            C431730GwN c431730GwN = (C431730GwN) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0;
            if (c431730GwN.LLJJLIIIJLLLLLLLZ == null && c431730GwN.getText() != null) {
                C786410Ut5.C3(c431730GwN.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
                c431730GwN.setText(c431730GwN.LJJJLIIL(layout, c431730GwN.getText()));
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        Rect rect = new Rect();
        ((C19604211my) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getRootView().getWindowVisibleDisplayFrame(rect);
        int height = ((C19604211my) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getRootView().getRootView().getHeight();
        int i = height - rect.bottom;
        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(((C19604211my) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getContext());
        if (i > ((double) height) * 0.15d) {
            ViewGroup.LayoutParams layoutParams = ((C19604211my) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getLayoutParams();
            layoutParams.height = rect.bottom;
            C19604211my c19604211my = (C19604211my) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19604211my);
            c19604211my.setLayoutParams(layoutParams);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = ((C19604211my) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getLayoutParams();
        layoutParams2.height = height - iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
        C19604211my c19604211my2 = (C19604211my) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19604211my2);
        c19604211my2.setLayoutParams(layoutParams2);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        if (((TextView) ((GroupInvitationCardAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LLJLILLLLZIIL.getValue()).getLineCount() <= 1) {
            ((TextView) ((GroupInvitationCardAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LLJLL.getValue()).setMaxLines(3);
        } else {
            ((TextView) ((GroupInvitationCardAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LLJLL.getValue()).setMaxLines(2);
        }
        C786410Ut5.C3(((View) ((GroupInvitationCardAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LLJLILLLLZIIL.getValue()).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        Rect rect = new Rect();
        ((C0H22) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LIZLLL.getContentView().getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom;
        C0H22 c0h22 = (C0H22) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0;
        int i2 = c0h22.LIZ;
        if (i2 == 0) {
            c0h22.LIZ = i;
            return;
        }
        if (i2 == i) {
            return;
        }
        C0H23 c0h23 = c0h22.LIZJ;
        if (c0h23 != null) {
            int i3 = i2 - i;
            int i4 = c0h22.LIZIZ;
            if (i3 > i4) {
                c0h23.LJJIIJ(i3);
            } else if (i2 <= i && i - i2 > i4) {
                c0h23.LIZ();
            } else {
                c0h23.LIZIZ();
            }
        }
        ((C0H22) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LIZ = i;
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        C786410Ut5.C3(((RechargeAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).Go().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
        EditText editTextGo = ((RechargeAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).Go();
        final EditText editTextGo2 = ((RechargeAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).Go();
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
        final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        final AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((RechargeAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0, 1225);
        editTextGo.addTextChangedListener(new TextWatcher(editTextGo2, iLIZIZ, iLIZIZ2, awS550S0100000_6) { // from class: X.0Gus
            public final EditText LL;
            public final int LLILLJJLI;
            public final int LLILLL;
            public final Function0<Integer> LLILZ;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.LL = editTextGo2;
                this.LLILLJJLI = iLIZIZ;
                this.LLILLL = iLIZIZ2;
                this.LLILZ = awS550S0100000_6;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int iIntValue = ((this.LLILZ.invoke().intValue() - this.LL.getPaddingStart()) - this.LL.getPaddingEnd()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                TextPaint paint = this.LL.getPaint();
                float f = iIntValue;
                if (paint.measureText(String.valueOf(charSequence)) <= f) {
                    float textSize = this.LL.getTextSize();
                    while (textSize < this.LLILLJJLI) {
                        textSize += C418440Gaw.LIZIZ(1);
                        paint.setTextSize(textSize);
                        if (paint.measureText(String.valueOf(charSequence)) >= f) {
                            this.LL.setTextSize(C0OBT.LIZ(Float.valueOf(textSize)));
                            return;
                        }
                    }
                    this.LL.setTextSize(C0OBT.LIZ(Float.valueOf(textSize)));
                    return;
                }
                float textSize2 = this.LL.getTextSize();
                while (textSize2 > this.LLILLL) {
                    textSize2 -= C418440Gaw.LIZIZ(1);
                    paint.setTextSize(textSize2);
                    if (paint.measureText(String.valueOf(charSequence)) <= f) {
                        this.LL.setTextSize(C0OBT.LIZ(Float.valueOf(textSize2)));
                        return;
                    }
                }
                this.LL.setTextSize(C0OBT.LIZ(Float.valueOf(textSize2)));
            }
        });
        String string = C2204961BRm.LLJILLL(((RechargeAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).Go(), new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhwMOXCw4YwRSzxfnVPcxJq4oRY++7r1hGsUe5D4=", null)).toString();
        if (C123100dR.LIZ(string)) {
            ((RechargeAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).Go().setText(CardStruct.IStatusCode.DEFAULT);
            ((RechargeAssem) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).Go().setText(string);
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        Layout layout = ((C437310HCv) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getLayout();
        int i = 0;
        if (layout != null && !((C437310HCv) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LJJJJL(layout)) {
            int measuredWidth = (((C437310HCv) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getMeasuredWidth() - ((C437310HCv) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getPaddingLeft()) - ((C437310HCv) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getPaddingRight();
            if (measuredWidth >= 0) {
                i = measuredWidth;
            }
            try {
                ((C437310HCv) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LJJJJLI(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C664410Q4h.LIZIZ(C0Q3I.COMMON, EnumC665990QAj.VIEW, e, "CustomEllipsizeTextViewProcessTextError", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
            }
        }
        C786410Ut5.C3(((C437310HCv) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        if (((VEChooseVideoCoverFragment) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LLILZLL.getMeasuredWidth() > 0) {
            VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0;
            TextView textView = vEChooseVideoCoverFragment.LLILZLL;
            vEChooseVideoCoverFragment.getClass();
            if (textView.getPaint().measureText(textView.getText().toString()) <= (textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd()) {
                C786410Ut5.LLIL(((VEChooseVideoCoverFragment) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LLILZLL, 0);
            } else {
                C786410Ut5.LLIL(((VEChooseVideoCoverFragment) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LLILZLL, 8);
                VEChooseVideoCoverFragment vEChooseVideoCoverFragment2 = (VEChooseVideoCoverFragment) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0;
                ConstraintLayout constraintLayout = vEChooseVideoCoverFragment2.LLILZ;
                TuxIconView tuxIconView = vEChooseVideoCoverFragment2.LLILZIL;
                vEChooseVideoCoverFragment2.getClass();
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJI(tuxIconView.getId(), 3);
                c19mb.LJIIIZ(tuxIconView.getId(), 6, 0, 6, 0);
                c19mb.LJIIIZ(tuxIconView.getId(), 7, 0, 7, 0);
                c19mb.LJIIIZ(tuxIconView.getId(), 3, 0, 3, 0);
                c19mb.LJIIIZ(tuxIconView.getId(), 4, 0, 4, 0);
                c19mb.LIZIZ(constraintLayout);
            }
            C786410Ut5.C3(((VEChooseVideoCoverFragment) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LLILZLL.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
        }
    }

    public static final void onGlobalLayout$7(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        if (((C197039127h) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getViewTreeObserver().isAlive()) {
            C786410Ut5.C3(((C197039127h) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC462870IDd);
        }
        Layout layout = ((C197039127h) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getLayout();
        if (layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            ((C197039127h) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).setButtonStartIcon(null);
            ((C197039127h) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).LJJJJLI(true);
        }
    }

    public static final void onGlobalLayout$8(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        Rect rect = new Rect();
        ((C1355730lNr) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getLocalVisibleRect(rect);
        if (rect.top >= 0 && rect.bottom <= ((C1355730lNr) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getHeight()) {
            int i = rect.bottom;
            Layout layout = ((C1355730lNr) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0).getLayout();
            if (layout != null) {
                layout.getLineEnd(layout.getLineForVertical(i));
            }
        }
    }

    public static final void onGlobalLayout$9(ViewTreeObserverOnGlobalLayoutListenerC462870IDd viewTreeObserverOnGlobalLayoutListenerC462870IDd) {
        C430560GuU c430560GuU = (C430560GuU) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0;
        if (c430560GuU.LLJLILLLLZIIL != c430560GuU.getWidth()) {
            C430560GuU c430560GuU2 = (C430560GuU) viewTreeObserverOnGlobalLayoutListenerC462870IDd.l0;
            c430560GuU2.LJJJJL(c430560GuU2.getWidth());
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC462870IDd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
