package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0RmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705870RmT implements InterfaceC695290RPb {
    public ViewGroup LL;
    public InterfaceC705840RmQ LLILLJJLI;
    public boolean LLILLL;
    public final Set<Integer> LLILZ = new LinkedHashSet();
    public final ViewTreeObserverOnPreDrawListenerC705860RmS LLILZIL = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0RmS
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ViewGroup viewGroup;
            ViewGroup viewGroup2;
            ViewTreeObserver viewTreeObserver;
            C705870RmT c705870RmT = this.LL;
            c705870RmT.getClass();
            if (C715260S3w.LIZIZ() && c705870RmT.LLILLJJLI != null && !c705870RmT.LLILLL && (viewGroup = c705870RmT.LL) != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    int id = childAt.getId();
                    if (!c705870RmT.LLILZ.contains(Integer.valueOf(id)) && C705870RmT.LIZ(childAt)) {
                        c705870RmT.LLILZ.add(Integer.valueOf(id));
                        if (!c705870RmT.LLILLL) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            c705870RmT.LLILLL = true;
                            InterfaceC705840RmQ interfaceC705840RmQ = c705870RmT.LLILLJJLI;
                            if (interfaceC705840RmQ != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("First Contentful Paint detected at: ");
                                sbLIZ.append(jCurrentTimeMillis);
                                sbLIZ.append(" ns, ");
                                ViewGroup viewGroup3 = c705870RmT.LL;
                                sbLIZ.append(viewGroup3 != null ? C708120Rq6.LIZ(viewGroup3) : null);
                                sbLIZ.append(' ');
                                ViewGroup viewGroup4 = c705870RmT.LL;
                                sbLIZ.append(viewGroup4 != null ? Integer.valueOf(viewGroup4.getVisibility()) : null);
                                C2188811AlT.LIZIZ(sbLIZ);
                                interfaceC705840RmQ.LIZ(jCurrentTimeMillis);
                            }
                        }
                        if (c705870RmT.LLILLL) {
                            if (C715260S3w.LIZIZ() && (viewGroup2 = c705870RmT.LL) != null && (viewTreeObserver = viewGroup2.getViewTreeObserver()) != null) {
                                ViewTreeObserverOnPreDrawListenerC705860RmS viewTreeObserverOnPreDrawListenerC705860RmS = c705870RmT.LLILZIL;
                                viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC705860RmS);
                                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC705860RmS, ViewTreeObserver.OnPreDrawListener.class);
                            }
                        }
                    }
                    i++;
                }
            }
            return true;
        }
    };

    public final void LIZIZ() {
        ViewGroup viewGroup;
        ViewTreeObserver viewTreeObserver;
        if (!C715260S3w.LIZIZ() || !C715260S3w.LIZIZ() || this.LLILLJJLI == null || this.LLILLL || (viewGroup = this.LL) == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC705860RmS viewTreeObserverOnPreDrawListenerC705860RmS = this.LLILZIL;
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC705860RmS);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC705860RmS, ViewTreeObserver.OnPreDrawListener.class);
    }

    public final void LIZJ() {
        ViewGroup viewGroup;
        ViewTreeObserver viewTreeObserver;
        if (C715260S3w.LIZIZ()) {
            if (C715260S3w.LIZIZ() && (viewGroup = this.LL) != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
                ViewTreeObserverOnPreDrawListenerC705860RmS viewTreeObserverOnPreDrawListenerC705860RmS = this.LLILZIL;
                viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC705860RmS);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC705860RmS, ViewTreeObserver.OnPreDrawListener.class);
            }
            if (C715260S3w.LIZIZ()) {
                this.LLILLL = false;
                this.LLILZ.clear();
            }
        }
    }

    public static boolean LIZ(View view) {
        if (view.getVisibility() != 0 || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return false;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getText().length() <= 0) {
                for (Drawable drawable : textView.getCompoundDrawablesRelative()) {
                    if (drawable != null) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (view instanceof ImageView) {
            if (((ImageView) view).getDrawable() == null) {
                return false;
            }
        } else {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (!LIZ(viewGroup.getChildAt(i))) {
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC695290RPb
    public final void setOnPerfListener(InterfaceC705840RmQ interfaceC705840RmQ) {
        if (!C715260S3w.LIZIZ()) {
            return;
        }
        this.LLILLJJLI = interfaceC705840RmQ;
    }
}
