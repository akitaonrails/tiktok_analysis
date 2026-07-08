package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import defpackage.RepostFeedEntranceCell;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0maa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewTreeObserverOnPreDrawListenerC1402060maa implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1402060maa viewTreeObserverOnPreDrawListenerC1402060maa) {
        ViewTreeObserver viewTreeObserver = ((RepostFeedEntranceCell) viewTreeObserverOnPreDrawListenerC1402060maa.l0).itemView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1402060maa);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1402060maa, ViewTreeObserver.OnPreDrawListener.class);
        }
        ((RepostFeedEntranceCell) viewTreeObserverOnPreDrawListenerC1402060maa.l0).I5().vQ2();
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1402060maa viewTreeObserverOnPreDrawListenerC1402060maa) {
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnPreDrawListenerC1402060maa.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1402060maa);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1402060maa, ViewTreeObserver.OnPreDrawListener.class);
        }
        HandlerHook.viewPost((View) viewTreeObserverOnPreDrawListenerC1402060maa.l0, new Runnable() { // from class: X.0l64
            public static void LIZ() throws JSONException {
                C1344690l63.LIZ.getClass();
                if (!C295210Bhf.LIZ() || C1344690l63.LIZJ) {
                    return;
                }
                long j = C1344690l63.LIZIZ;
                if (j > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                    C1344690l63.LIZJ = true;
                    C1344690l63.LIZIZ = 0L;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("endPanelOpen duration=");
                    sbLIZ.append(jCurrentTimeMillis);
                    sbLIZ.append(" groupId=");
                    sbLIZ.append(C1344690l63.LIZLLL);
                    sbLIZ.append(" enterFrom=");
                    sbLIZ.append(C1344690l63.LJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jCurrentTimeMillis);
                    jSONObject.put("group_id", C1344690l63.LIZLLL);
                    jSONObject.put("enter_from", C1344690l63.LJ);
                    C20684815ws.LJIJ("comment_input_sticker_panel_first_load", jSONObject);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommentKeyboardMultiPanelAssem@3a12.switchPanel$3$1$onPreDraw$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommentKeyboardMultiPanelAssem@3a12.switchPanel$3$1$onPreDraw$1");
            }
        });
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC1402060maa viewTreeObserverOnPreDrawListenerC1402060maa) {
        C1388820mFE c1388820mFE = (C1388820mFE) viewTreeObserverOnPreDrawListenerC1402060maa.l0;
        c1388820mFE.LJJ = null;
        if (c1388820mFE.LIZ.getViewTreeObserver().isAlive()) {
            C786410Ut5.D3(((C1388820mFE) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LIZ.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1402060maa);
        }
        View viewLIZIZ = ((C1388820mFE) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LIZIZ();
        if (viewLIZIZ != null) {
            C786410Ut5.ed(viewLIZIZ, viewLIZIZ.getHeight());
        }
        View view = ((C1388820mFE) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LJII;
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        ((C1388820mFE) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LJIIJ().addUpdateListener((ValueAnimator.AnimatorUpdateListener) ((C1388820mFE) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LJJII.getValue());
        ((C1388820mFE) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LJIIJ().start();
        return true;
    }

    public static final boolean onPreDraw$3(ViewTreeObserverOnPreDrawListenerC1402060maa viewTreeObserverOnPreDrawListenerC1402060maa) throws Throwable {
        C1353650lKV c1353650lKV = (C1353650lKV) viewTreeObserverOnPreDrawListenerC1402060maa.l0;
        if (!c1353650lKV.LLJLILLLLZIIL && c1353650lKV.LLJZ != null) {
            C786410Ut5.D3(c1353650lKV.getViewTreeObserver(), ((C1353650lKV) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LLJZ);
            return true;
        }
        if (c1353650lKV.LLJZ != null) {
            C786410Ut5.D3(c1353650lKV.getViewTreeObserver(), ((C1353650lKV) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LLJZ);
        }
        C1353650lKV c1353650lKV2 = (C1353650lKV) viewTreeObserverOnPreDrawListenerC1402060maa.l0;
        c1353650lKV2.LJJJZ(c1353650lKV2.getWidth(), "init_text");
        ((C1353650lKV) viewTreeObserverOnPreDrawListenerC1402060maa.l0).LLJLILLLLZIIL = false;
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1402060maa(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
