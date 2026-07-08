package X;

import Y.ARunnableS27S0110000_8;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.gamora.layout.LayoutNLETrackStub;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0MSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSJ extends C0LDI implements InterfaceC20548515at, C0MSI {
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public C0MSL<?> LLILZIL;
    public C0MSD LLILZLL;
    public final RectF LLIZ;
    public boolean LLIZLLLIL;
    public View LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public float LLJILLL;
    public final FrameLayout.LayoutParams LLJJ;

    private final C1322110kVd getImageView() {
        return (C1322110kVd) this.LLILZ.getValue();
    }

    private final TextureView getTextureView() {
        return (TextureView) this.LLILLL.getValue();
    }

    public final void LJI() {
        View view;
        if (this.LLJI <= 0 || this.LLJIJIL <= 0 || (view = this.LLJ) == null) {
            return;
        }
        view.setPivotX(r2 >> 1);
        view.setPivotY(this.LLJIJIL >> 1);
        C786410Ut5.Ob(view, this.LLJILLL);
        C786410Ut5.pc(view, this.LLJILLL);
        C786410Ut5.Jc(view, this.LLJILJIL);
        C786410Ut5.ed(view, this.LLJILJILJ);
    }

    @Override // X.C0LDI, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0MSL<?> c0msl;
        super.onAttachedToWindow();
        C0MSD c0msd = this.LLILZLL;
        if (c0msd != null && (c0msl = this.LLILZIL) != null) {
            c0msl.setDataSource(c0msd.LIZ);
        }
        C0MSO c0mso = C0MSO.LJFF;
        synchronized (c0mso) {
            c0mso.LJ(null);
            c0mso.LIZJ.add(new WeakReference(this));
        }
    }

    @Override // X.C0LDI, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0MSO c0mso = C0MSO.LJFF;
        C0MSO.LJFF.LJ(this);
    }

    public C0MSJ(Context context) {
        super(context, null, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS409S0200000_8(context, this, 117));
        this.LLILZ = C452501pT.LIZIZ(new AwS409S0200000_8(context, this, 116));
        this.LLIZ = new RectF();
        this.LLIZLLLIL = true;
        this.LLJILLL = 1.0f;
        this.LLJJ = new FrameLayout.LayoutParams(-2, -2, 17);
    }

    private final void setContentView(View view) {
        View view2 = this.LLJ;
        if (view2 != view) {
            if (view2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
                removeView(view2);
            }
            this.LLJ = view;
            addView(view, this.LLJJ);
            LJI();
        }
    }

    @Override // X.C0MSI
    public final void LIZ(NLEModel nLEModel) {
        C0MSJ c0msj;
        C0MSO c0mso = C0MSO.LJFF;
        long duration = nLEModel.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (!c0mso.LIZJ.isEmpty()) {
            c0mso.LJ(null);
            if (!c0mso.LIZJ.isEmpty()) {
                synchronized (c0mso) {
                    try {
                        for (WeakReference weakReference : c0mso.LIZJ) {
                            if (weakReference != null && (c0msj = (C0MSJ) weakReference.get()) != null) {
                                c0msj.setDuration(duration);
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC20548515at
    public final void LIZIZ(int i) {
        boolean z;
        C0MSJ c0msj;
        if (i != 2 && i != 6) {
            return;
        }
        C0MSO c0mso = C0MSO.LJFF;
        if (c0mso.LIZJ.isEmpty()) {
            C0MSP.LIZ("ignore alignTimeLinePlay() by observeTargets.isEmpty():1");
        } else {
            c0mso.LJ(null);
            if (c0mso.LIZJ.isEmpty()) {
                C0MSP.LIZ("ignore alignTimeLinePlay() by observeTargets.isEmpty():2");
            } else {
                CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
                synchronized (c0mso) {
                    try {
                        z = false;
                        for (WeakReference weakReference : c0mso.LIZJ) {
                            if (weakReference != null && (c0msj = (C0MSJ) weakReference.get()) != null) {
                                copyOnWriteArraySet.add(c0msj);
                                z |= true;
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (z && !copyOnWriteArraySet.isEmpty() && (copyOnWriteArraySet.size() != 1 || !copyOnWriteArraySet.contains(this))) {
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        C0MSL<?> c0msl = ((C0MSJ) it2.next()).LLILZIL;
                        if (c0msl != null) {
                            c0msl.LIZIZ();
                        }
                    }
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    while (it3.hasNext()) {
                        C0MSL<?> c0msl2 = ((C0MSJ) it3.next()).LLILZIL;
                        if (c0msl2 != null) {
                            c0msl2.resume();
                        }
                    }
                    return;
                }
            }
        }
        C0MSL<?> c0msl3 = this.LLILZIL;
        if (c0msl3 == null) {
            return;
        }
        c0msl3.resume();
    }

    @Override // X.C0MSI
    public final void LJ(LayoutNLETrackStub layoutNLETrackStub) {
        int iHeight;
        int iWidth;
        C0MSD c0msd = this.LLILZLL;
        if (c0msd != null && c0msd.LIZLLL != 0 && c0msd.LJ != 0) {
            C0MSF c0msf = layoutNLETrackStub.LLJJJJ.LIZIZ;
            Rect rect = layoutNLETrackStub.LLJJJIL;
            if (c0msf == C0MSF.FILL_WIDTH) {
                iWidth = rect.width();
                iHeight = (c0msd.LJ * iWidth) / c0msd.LIZLLL;
            } else {
                iHeight = rect.height();
                iWidth = (c0msd.LIZLLL * iHeight) / c0msd.LJ;
            }
            if (this.LLJI != iWidth || this.LLJIJIL != iHeight) {
                this.LLJI = iWidth;
                this.LLJIJIL = iHeight;
                FrameLayout.LayoutParams layoutParams = this.LLJJ;
                layoutParams.width = iWidth;
                layoutParams.height = iHeight;
                View view = this.LLJ;
                if (view != null) {
                    view.setPivotX(iWidth >> 1);
                    view.setPivotY(this.LLJIJIL >> 1);
                    C786410Ut5.W5(view, this.LLJJ);
                }
            }
            float f = layoutNLETrackStub.LLJILJILJ;
            this.LLIZ.set(layoutNLETrackStub.LLJJJJ.LJI.LIZJ);
            float f2 = 2;
            float fCenterX = (this.LLIZ.centerX() / f2) * ((int) (this.LLJI * f));
            float fCenterY = (this.LLIZ.centerY() / f2) * ((int) (this.LLJIJIL * f));
            int i = -((int) fCenterX);
            int i2 = (int) fCenterY;
            if (this.LLJILLL != f || this.LLJILJIL != i || this.LLJILJILJ != i2) {
                this.LLJILLL = f;
                this.LLJILJIL = i;
                this.LLJILJILJ = i2;
                LJI();
            }
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        C0MSL<?> c0msl = this.LLILZIL;
        if (c0msl != null) {
            c0msl.LIZJ(z);
        }
    }

    public final void setDuration(long j) {
        C0MSL<?> c0msl = this.LLILZIL;
        if (c0msl != null) {
            c0msl.setDuration(j);
        }
    }

    @Override // X.C0LDI, X.InterfaceC576410Mj9
    public final InterfaceC576410Mj9 LIZLLL(LayoutItemMedia layoutItemMedia, NLEModel nLEModel, Rect rect, ARunnableS27S0110000_8 aRunnableS27S0110000_8) {
        C0L9K c0l9k;
        View imageView;
        C0MSL<?> c0msl;
        super.LIZLLL(layoutItemMedia, nLEModel, rect, aRunnableS27S0110000_8);
        LayoutNLETrackStub trackStub = getTrackStub();
        if (trackStub != null) {
            trackStub.LLIZLLLIL = this;
            C0MSD c0msd = trackStub.LLJJJJJIL;
            this.LLILZLL = c0msd;
            if (c0msd != null) {
                c0l9k = c0msd.LIZIZ;
            } else {
                c0l9k = null;
            }
            if (c0l9k == C0L9K.VIDEO) {
                imageView = getTextureView();
            } else {
                imageView = getImageView();
            }
            setContentView(imageView);
            C0MSD c0msd2 = this.LLILZLL;
            if (c0msd2 != null && (c0msl = this.LLILZIL) != null) {
                c0msl.setDataSource(c0msd2.LIZ);
            }
        }
        return this;
    }
}
