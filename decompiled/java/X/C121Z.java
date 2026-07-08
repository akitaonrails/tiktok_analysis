package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.util.ArrayList;
import java.util.Iterator;
import nv7.c0;

/* JADX INFO: renamed from: X.121Z, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C121Z extends View {
    public int LL;
    public int LLILLJJLI;
    public InterfaceC1452170ntP LLILLL;
    public SafeHandler LLILZ;
    public C196880121e LLILZIL;
    public boolean LLILZLL;
    public C121U LLIZ;
    public int LLIZLLLIL;
    public final C196897121v LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public InterfaceC196898121w LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C196876121a LLJJJ;
    public final C122L LLJJJIL;
    public final PointF LLJJJJ;
    public FTCEditInfoStickerViewModel LLJJJJJIL;
    public final ARunnableS129S0100000_29 LLJJJJLIIL;

    public final void LIZ() {
        this.LLJJIJIL = false;
        C196880121e c196880121e = this.LLILZIL;
        if (c196880121e != null) {
            Iterator it2 = ((ArrayList) c196880121e.LIZ).iterator();
            while (it2.hasNext()) {
                ((AnonymousClass1219) it2.next()).LL = false;
            }
        }
        invalidate();
    }

    public void setOnInfoStickerPinEditClick(InterfaceC19629711r5<AnonymousClass1219> interfaceC19629711r5) {
    }

    public void setOnInfoStickerTimeEdit(InterfaceC19629711r5<AnonymousClass1219> interfaceC19629711r5) {
    }

    public void setPinHelper(C196878121c c196878121c) {
    }

    public final void LIZIZ() {
        if (C0IKQ.LIZ(this.LLILZIL.LIZ)) {
            return;
        }
        this.LLILLL.LLL();
        Iterator it2 = ((ArrayList) this.LLILZIL.LIZ).iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            this.LLILZIL.getClass();
            next.getClass();
            throw null;
        }
        C196880121e c196880121e = this.LLILZIL;
        getClass();
        c196880121e.getClass();
    }

    public int getStickNumber() {
        if (C2401009ay.LIZ(this.LLILZIL.LIZ)) {
            return 0;
        }
        return ((ArrayList) this.LLILZIL.LIZ).size();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C122L c122l = this.LLJJJIL;
        c122l.getClass();
        ((ArrayList) C122I.LJIIJJI).add(c122l);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C122L c122l = this.LLJJJIL;
        c122l.getClass();
        ((ArrayList) C122I.LJIIJJI).remove(c122l);
    }

    public C196876121a getGestureListener() {
        return this.LLJJJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C196880121e c196880121e = this.LLILZIL;
        if (c196880121e == null) {
            return;
        }
        Iterator it2 = ((ArrayList) c196880121e.LIZ).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    public void setHavePinEdit(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public void setHaveTimeEdit(boolean z) {
        this.LLJJIJI = z;
    }

    public void setITimeEditListener(C121U c121u) {
        this.LLIZ = c121u;
    }

    public void setShowHelpBox(boolean z) {
        ARunnableS129S0100000_29 aRunnableS129S0100000_29;
        SafeHandler safeHandler;
        this.LLJJIJIL = z;
        ARunnableS129S0100000_29 aRunnableS129S0100000_292 = this.LLJJJJLIIL;
        if (aRunnableS129S0100000_292 != null && (safeHandler = this.LLILZ) != null) {
            safeHandler.removeCallbacks(aRunnableS129S0100000_292);
        }
        if (z) {
            SafeHandler safeHandler2 = this.LLILZ;
            if (safeHandler2 != null && (aRunnableS129S0100000_29 = this.LLJJJJLIIL) != null) {
                safeHandler2.postDelayed(aRunnableS129S0100000_29, LivePreCreateNextRoomPlayer.ENABLE);
            }
            C121U c121u = this.LLIZ;
            if (c121u != null && !c121u.LLLLZLLIL() && !this.LLIZ.LIZ()) {
                c0.LIZ.n2();
                new RectF();
                getClass();
                throw null;
            }
        } else {
            this.LLJJJIL.LJII();
        }
        invalidate();
    }

    public void setStickerDataChangeListener(C121P c121p) {
        C196880121e c196880121e = this.LLILZIL;
        if (c196880121e != null) {
            c196880121e.getClass();
        }
    }

    public void setStickerOnMoveListener(InterfaceC196898121w interfaceC196898121w) {
        this.LLJJIII = interfaceC196898121w;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.121v] */
    public C121Z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZLL = true;
        this.LLJ = new Object() { // from class: X.121v
        };
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = true;
        this.LLJJJIL = new C122L(this, new C122J() { // from class: X.121f
            @Override // X.C122M
            public final void LIZ() {
            }

            @Override // X.C122M
            public final void LIZLLL() {
            }

            @Override // X.C122M
            public final void LIZIZ() {
                C121Z c121z = this.LIZ;
                c121z.LLJ.getClass();
                c121z.setShowHelpBox(false);
            }

            @Override // X.C122M
            public final void LIZJ() {
                C121Z c121z = this.LIZ;
                c121z.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" onClickContent");
                c121z.LLJ.getClass();
                sbLIZ.append(true);
                sbLIZ.append(" ");
                c121z.LLJ.getClass();
                sbLIZ.append(true);
                C2188811AlT.LIZIZ(sbLIZ);
                c121z.setShowHelpBox(true);
                c121z.getClass();
                if (c121z.LLILZIL != null) {
                    c121z.LLJ.getClass();
                    throw null;
                }
                if (c121z.LLJJJJJIL == null) {
                    c121z.LLJJJJJIL = (FTCEditInfoStickerViewModel) C1659640tI2.LIZJ(c121z).LIZ(FTCEditInfoStickerViewModel.class);
                }
                c121z.LLJ.getClass();
                throw null;
            }

            @Override // X.C122M
            public final void LJ() {
                C121Z c121z = this.LIZ;
                c121z.LLJ.getClass();
                c121z.setShowHelpBox(false);
            }
        });
        this.LLJJJJ = new PointF();
        this.LLJJJJLIIL = new ARunnableS129S0100000_29(this, 42);
    }
}
