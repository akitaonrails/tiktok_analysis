package X;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0vc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748970vc7 extends ConstraintLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;
    public LinearLayout LLILZ;
    public TuxIconView LLILZIL;
    public C1748970vc7 LLILZLL;

    public final TuxIconView getNoticeChevronEndIcon() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q7y);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getPdpClDetailNoticeContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q77);
            this.LLILZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final SmartImageView getPdpSivDetailNoticeIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q7r);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getPdpTtvDetailNoticeContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q80);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getPdpTtvDetailNoticeTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q81);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewOnAttachStateChangeListenerC20604515jv) || (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) parent) == null) {
            return;
        }
        int childAdapterPosition = viewOnAttachStateChangeListenerC20604515jv.getChildAdapterPosition(this);
        List<InterfaceC1891350zJl> listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems();
        if ((listItems != null ? C13LP.LJJJLZIJ(childAdapterPosition - 1, listItems) : null) instanceof C1406010mgx) {
            setPadding(getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        } else {
            setPadding(getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
    }

    public static int h0(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return 48;
            }
            if (num.intValue() == 2) {
                return 80;
            }
            num.intValue();
            return 16;
        }
        return 16;
    }

    public final void setNoticeChevronEndIcon(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setPdpClDetailNoticeContentFromXml(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setPdpSivDetailNoticeIconFromXml(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setPdpTtvDetailNoticeContentFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setPdpTtvDetailNoticeTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C1748970vc7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(X.C1406500mhk r18, X.InterfaceC1752190vhJ r19) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1748970vc7.e0(X.0mhk, X.0vhJ):void");
    }

    public C1748970vc7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = this;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ash, this, true);
        this.LLILZLL = this;
    }

    public static void i0(View view, String str, String str2) {
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str) && view != null) {
            if (!u.LJJIIJZLJL(str, "aweme", false)) {
                str = new Uri.Builder().scheme("aweme").authority("echybrid").appendQueryParameter("url", str).build().toString();
            }
            try {
                SmartRouter.buildRoute(view.getContext(), C1733740vDY.LIZ(str, str2)).open();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1019103yf.LIZ(EnumC1014603xw.ERR10005, thM5exceptionOrNullimpl, null);
            }
        }
    }
}
