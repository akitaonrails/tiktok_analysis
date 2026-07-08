package X;

import Y.ARunnableS127S0100000_27;
import Y.ATListenerS346S0200000_27;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835840xsE extends RecyclerView.ViewHolder {
    public final C1324720kZq LL;
    public final FrameLayout LLILLJJLI;
    public final View LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxIconView LLILZLL;
    public final TuxIconView LLIZ;
    public final TuxSpinner LLIZLLLIL;
    public final TuxIconView LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final TuxTag LLJILJIL;
    public final ARunnableS127S0100000_27 LLJILJILJ;
    public boolean LLJILLL;
    public C1835820xsC LLJJ;
    public final GestureDetector LLJJI;

    public C1835840xsE(final View view) {
        super(view);
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.kfa);
        this.LL = c1324720kZq;
        this.LLILLJJLI = (FrameLayout) view.findViewById(R.id.video_container);
        this.LLILLL = view.findViewById(R.id.y0w);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.title);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.gbz);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.qmf);
        this.LLIZ = (TuxIconView) view.findViewById(R.id.q3q);
        this.LLIZLLLIL = (TuxSpinner) view.findViewById(R.id.nli);
        this.LLJ = (TuxIconView) view.findViewById(R.id.tdz);
        this.LLJI = view.findViewById(R.id.y14);
        this.LLJIJIL = view.findViewById(R.id.ev1);
        TuxTag tuxTag = (TuxTag) view.findViewById(R.id.hpi);
        tuxTag.setTagIcon(Integer.valueOf(R.raw.icon_camera_meter_2));
        tuxTag.setTagSize(3);
        tuxTag.setTuxFont(102);
        tuxTag.setTagBackgroundColor(C497740JfY.LIZJ(R.attr.uk));
        this.LLJILJIL = tuxTag;
        this.LLJILJILJ = new ARunnableS127S0100000_27(this, 36);
        this.LLJJI = new GestureDetector(view.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.0xsD
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C1835840xsE c1835840xsE = this.LL;
                c1835840xsE.LLJILLL = true;
                C1835820xsC c1835820xsC = c1835840xsE.LLJJ;
                if (c1835820xsC != null) {
                    C1835760xs6 c1835760xs6 = c1835820xsC.LIZ;
                    if (c1835760xs6.LJ) {
                        InterfaceC1484830ok5 interfaceC1484830ok5LIZ = c1835760xs6.LIZ();
                        if (interfaceC1484830ok5LIZ != null) {
                            interfaceC1484830ok5LIZ.setSpeed(2.0f);
                        }
                        C1246020iWu.LIZ(c1835820xsC.LIZIZ.LLJILJIL);
                        C1246020iWu.LIZ(c1835820xsC.LIZIZ.LLJIJIL);
                        C500260Jjc.LJIILLIIL(c1835820xsC.LIZIZ.LLILLL);
                        C500260Jjc.LJIILLIIL(c1835820xsC.LIZIZ.LLJI);
                    }
                }
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C1835820xsC c1835820xsC = this.LL.LLJJ;
                if (c1835820xsC != null) {
                    C1835840xsE c1835840xsE = c1835820xsC.LIZIZ;
                    if (!C500260Jjc.LJJJJIZL(c1835840xsE.LLILZLL) && !C500260Jjc.LJJJJIZL(c1835840xsE.LLJ)) {
                        if (C500260Jjc.LJJJJIZL(c1835840xsE.LLIZ)) {
                            C500260Jjc.LJIILLIIL(c1835840xsE.LLIZ);
                            HandlerHook.viewRemoveCallbacks(c1835840xsE.LL, c1835840xsE.LLJILJILJ);
                            return true;
                        }
                        C1246020iWu.LIZ(c1835840xsE.LLIZ);
                        HandlerHook.viewPostDelay(c1835840xsE.LL, c1835840xsE.LLJILJILJ, 3000L);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
        c1324720kZq.setOnTouchListener(new ATListenerS346S0200000_27(this, view, 3));
    }
}
