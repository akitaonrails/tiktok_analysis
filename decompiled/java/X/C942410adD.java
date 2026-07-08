package X;

import Y.ALAdapterS10S0200000_15;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0adD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942410adD {
    public final String LIZ;
    public final long LIZIZ;
    public final ViewGroup LIZJ;
    public final C942440adG LIZLLL;
    public View LJ;
    public Rect LJFF;
    public View LJI;
    public final C054G LJII;
    public AnonymousClass0956 LJIIIIZZ;
    public long LJIIIZ;
    public final C01GW LJIIJ;
    public long LJIIJJI;

    public final Rect LIZJ() {
        C916420ZxI c916420ZxI;
        C916720Zxm c916720ZxmDK1 = C915980Zwa.LIZLLL().DK1(this.LIZIZ);
        if (c916720ZxmDK1 == null || (c916420ZxI = c916720ZxmDK1.LJ) == null) {
            return null;
        }
        int i = c916420ZxI.LIZ;
        View view = (View) this.LJIIJ.getValue();
        int left = i + (view != null ? view.getLeft() : 0);
        int i2 = c916420ZxI.LIZIZ;
        View view2 = (View) this.LJIIJ.getValue();
        int top = i2 + (view2 != null ? view2.getTop() : 0);
        return new Rect(left, top, c916420ZxI.LIZJ + left, c916420ZxI.LIZLLL + top);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super android.graphics.Rect> r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942410adD.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZLLL(boolean z) {
        this.LJIIJJI = 0L;
        View view = this.LJI;
        if (view != null) {
            view.animate().setListener(null);
            view.animate().cancel();
            C930540aK4.LJJIJL(view);
            this.LJI = null;
        }
        View view2 = this.LJ;
        this.LJ = null;
        this.LJFF = null;
        if (view2 == null) {
            return;
        }
        if (!z) {
            C930540aK4.LJJIJL(view2);
            return;
        }
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width > 0 && height > 0) {
            this.LJI = view2;
            view2.setPivotX(width);
            view2.setPivotY(height);
            view2.animate().scaleX(0.0f).scaleY(0.0f).setDuration(250L).setListener(new ALAdapterS10S0200000_15(this, view2, 5)).start();
            return;
        }
        C930540aK4.LJJIJL(view2);
    }

    public final void LIZ(Rect rect, long j, String str) {
        if (rect == null || j != this.LJIIIZ) {
            return;
        }
        this.LJIIJJI = System.currentTimeMillis();
        View view = this.LJ;
        if (view != null) {
            view.setId(R.id.oow);
        }
        View view2 = this.LJ;
        if (view2 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.leftMargin = rect.left;
            layoutParams.topMargin = rect.top;
            C786410Ut5.W5(view2, layoutParams);
        }
        View view3 = this.LJ;
        if (view3 == null || view3.getParent() == null) {
            if (C950220apo.LJFF() == this.LIZIZ) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String strLIZ = C01ZF.LIZ();
                linkedHashMap.put("use_id", String.valueOf(C950220apo.LJFF()));
                linkedHashMap.put("anchor_id", String.valueOf(C950220apo.LJ()));
                linkedHashMap.put("room_id", String.valueOf(C950220apo.LIZLLL()));
                linkedHashMap.put("user_type", strLIZ);
                linkedHashMap.put("stage_reaction_id", str);
                linkedHashMap.put("stage_reaction_show_ucnt", String.valueOf(C0IUA.LIZJ));
                C0KX4.LIZ("livesdk_multi_stage_reaction_show", linkedHashMap, null, true);
            }
            this.LJFF = rect;
            this.LIZJ.addView(this.LJ);
        }
    }

    public C942410adD(String str, long j, ViewGroup viewGroup, C942440adG c942440adG) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = viewGroup;
        this.LIZLLL = c942440adG;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJII = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LJIIJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(424));
    }
}
