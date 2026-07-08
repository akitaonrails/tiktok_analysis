package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ViewOnAttachStateChangeListenerC521700Kd6 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC521700Kd6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
        ((LiveEndCardWidget) viewOnAttachStateChangeListenerC521700Kd6.l0).y1("attach");
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
        ImageModel imageModel;
        C09RD c09rd = new C09RD((ViewGroup) view);
        C520920Kbq c520920Kbq = (C520920Kbq) viewOnAttachStateChangeListenerC521700Kd6.l0;
        Iterator<View> it2 = c09rd.iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view2 = (View) c09re.next();
                List urls = null;
                if ((view2 instanceof ImageView) && view2 != null) {
                    Object tag = view2.getTag();
                    if (Intrinsics.LJFF(tag, "top")) {
                        ImageModel imageModel2 = c520920Kbq.LIZ;
                        if (imageModel2 != null) {
                            urls = imageModel2.getUrls();
                        }
                    } else if (Intrinsics.LJFF(tag, "bottom")) {
                        ImageModel imageModel3 = c520920Kbq.LIZJ;
                        if (imageModel3 != null) {
                            urls = imageModel3.getUrls();
                        }
                    } else if (Intrinsics.LJFF(tag, "halo") && (imageModel = c520920Kbq.LIZIZ) != null) {
                        urls = imageModel.getUrls();
                    }
                    C1819620xS4.LIZ().LIZJ(urls).LJJI(view2);
                }
            } else {
                return;
            }
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
        InterfaceC500690JkJ interfaceC500690JkJ = (InterfaceC500690JkJ) viewOnAttachStateChangeListenerC521700Kd6.l0;
        if (interfaceC500690JkJ != null) {
            interfaceC500690JkJ.release();
        }
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
        ((C0IEZ) viewOnAttachStateChangeListenerC521700Kd6.l0).LIZ();
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC521700Kd6);
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6, View view) {
        C477190InV c477190InV = (C477190InV) viewOnAttachStateChangeListenerC521700Kd6.l0;
        c477190InV.getClass();
        C1548820qPI.LJIIIIZZ("live_event_update_result", c477190InV);
    }
}
