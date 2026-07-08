package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard.SearchAdAIProductCardCell;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0e8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewOnLongClickListenerC1077280e8k implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onLongClick$9(this, view);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onLongClick$10(this, view);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onLongClick$11(this, view);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onLongClick$12(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC1077280e8k(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        InterfaceC1066270dqz interfaceC1066270dqz = ((C1066240dqw) viewOnLongClickListenerC1077280e8k.l0).LLIZ;
        if (interfaceC1066270dqz != null) {
            interfaceC1066270dqz.LIZIZ(view);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((FriendsFeedEmptyPageCell) viewOnLongClickListenerC1077280e8k.l0).itemView.getContext());
        if (c19egLIZIZ != null) {
            C621180OYa.LIZ.LJJIJLIJ(c19egLIZIZ, "FRIENDS_TAB");
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$10(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        ((SearchAdAIProductCardCell) viewOnLongClickListenerC1077280e8k.l0).N5();
        return true;
    }

    public static final boolean onLongClick$11(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        ((SearchAdAIProductCardCell) viewOnLongClickListenerC1077280e8k.l0).N5();
        return true;
    }

    public static final boolean onLongClick$12(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        ((SearchAdAIProductCardCell) viewOnLongClickListenerC1077280e8k.l0).N5();
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        WebView webView;
        WebView.HitTestResult hitTestResult;
        if ((view instanceof WebView) && (hitTestResult = (webView = (WebView) view).getHitTestResult()) != null && webView.getSettings() != null && (hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
            String extra = hitTestResult.getExtra();
            Context context = webView.getContext();
            if (extra != null && context != null && !C2093608Ic.LJ(extra) && (extra.toLowerCase().startsWith("http://") || extra.toLowerCase().startsWith("https://"))) {
                ((C1545770qKN) viewOnLongClickListenerC1077280e8k.l0).getClass();
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    C1390850mIV c1390850mIV = new C1390850mIV();
                    C1247510iZJ c1247510iZJ = new C1247510iZJ();
                    c1247510iZJ.LIZ = context.getString(R.string.webview_save_image);
                    c1247510iZJ.LJ = new AnonymousClass1470(context, extra);
                    c1390850mIV.LIZIZ(c1247510iZJ);
                    c1390850mIV.LIZJ().show(c19egLIZIZ.getSupportFragmentManager(), "saveImage");
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        InterfaceC1003440cDe interfaceC1003440cDe = ((C1012150cRh) viewOnLongClickListenerC1077280e8k.l0).LLJLIL;
        if (interfaceC1003440cDe != null) {
            interfaceC1003440cDe.LJ(view);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        InterfaceC1003440cDe interfaceC1003440cDe = ((C1012050cRX) viewOnLongClickListenerC1077280e8k.l0).LLJLIL;
        if (interfaceC1003440cDe != null) {
            interfaceC1003440cDe.LJ(view);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        InterfaceC1003440cDe interfaceC1003440cDe = ((C1012050cRX) viewOnLongClickListenerC1077280e8k.l0).LLJLIL;
        if (interfaceC1003440cDe != null) {
            interfaceC1003440cDe.LJ(view);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        InterfaceC1003440cDe interfaceC1003440cDe = ((C1012050cRX) viewOnLongClickListenerC1077280e8k.l0).LLJLIL;
        if (interfaceC1003440cDe != null) {
            interfaceC1003440cDe.LJ(view);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$7(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        InterfaceC1003440cDe interfaceC1003440cDe = ((C1012050cRX) viewOnLongClickListenerC1077280e8k.l0).LLJLIL;
        if (interfaceC1003440cDe != null) {
            interfaceC1003440cDe.LJ(view);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$8(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        ((SearchAdAIProductCardCell) viewOnLongClickListenerC1077280e8k.l0).N5();
        return true;
    }

    public static final boolean onLongClick$9(ViewOnLongClickListenerC1077280e8k viewOnLongClickListenerC1077280e8k, View view) {
        ((SearchAdAIProductCardCell) viewOnLongClickListenerC1077280e8k.l0).N5();
        return true;
    }

    public ViewOnLongClickListenerC1077280e8k(C1066240dqw c1066240dqw, int i, int i2) {
        this.$t = i2;
        this.l0 = c1066240dqw;
    }
}
