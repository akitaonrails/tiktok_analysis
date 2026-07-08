package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.19Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21554719Xd extends ConstraintLayout {
    public final C19SE LL;
    public final C19SE LLILLJJLI;
    public final C21543019Sq LLILLL;
    public final C21542619Sm LLILZ;
    public final C21542019Sg LLILZIL;
    public InterfaceC21556019Xq LLILZLL;
    public InterfaceC21555819Xo LLIZ;
    public InterfaceC21555919Xp LLIZLLLIL;

    public final void e0() {
        if (this.LLILZIL.getVisibility() == 0) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(this);
            c19mb.LJI(R.id.o3d, getLayoutDirection() == 0 ? 2 : 1);
            c19mb.LIZIZ(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e0();
    }

    public void setActiveSelection(int i) {
        boolean z;
        C19SE c19se = this.LL;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        c19se.setChecked(z);
        C19SE c19se2 = this.LLILLJJLI;
        if (i != 10) {
            z2 = false;
        }
        c19se2.setChecked(z2);
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.LLILLL.LLILLJJLI = z;
    }

    public void setHandRotation(float f) {
        this.LLILLL.LIZIZ(f, false);
    }

    public void setHourClickDelegate(C20094213jo c20094213jo) {
        q0.LJIJ(this.LL, c20094213jo);
    }

    public void setMinuteHourDelegate(C20094213jo c20094213jo) {
        q0.LJIJ(this.LLILLJJLI, c20094213jo);
    }

    public void setOnActionUpListener(InterfaceC21543219Ss interfaceC21543219Ss) {
        this.LLILLL.LLJJ = interfaceC21543219Ss;
    }

    public void setOnDoubleTapListener(InterfaceC21555919Xp interfaceC21555919Xp) {
        this.LLIZLLLIL = interfaceC21555919Xp;
    }

    public void setOnPeriodChangeListener(InterfaceC21556019Xq interfaceC21556019Xq) {
        this.LLILZLL = interfaceC21556019Xq;
    }

    public void setOnSelectionChangeListener(InterfaceC21555819Xo interfaceC21555819Xo) {
        this.LLIZ = interfaceC21555819Xo;
    }

    public C21554719Xd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            e0();
        }
    }

    public C21554719Xd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.19Xk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC21555819Xo interfaceC21555819Xo = this.LL.LLIZ;
                if (interfaceC21555819Xo != null) {
                    interfaceC21555819Xo.LIZ(((Integer) view.getTag(R.id.un7)).intValue());
                }
            }
        };
        C786410Ut5.Sd(R.layout.dkx, C786410Ut5.ne(context), this);
        this.LLILZ = (C21542619Sm) findViewById(R.id.o3e);
        C21542019Sg c21542019Sg = (C21542019Sg) findViewById(R.id.o3i);
        this.LLILZIL = c21542019Sg;
        c21542019Sg.LLILZ.add(new InterfaceC21542519Sl() { // from class: X.19Xh
            @Override // X.InterfaceC21542519Sl
            public final void LIZ(int i2, boolean z) {
                int i3;
                if (i2 == R.id.o3h) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                InterfaceC21556019Xq interfaceC21556019Xq = this.LIZ.LLILZLL;
                if (interfaceC21556019Xq != null && z) {
                    TimeModel timeModel = ((C21554619Xc) interfaceC21556019Xq).LLILLJJLI;
                    if (i3 != timeModel.LLILZIL) {
                        timeModel.LLILZIL = i3;
                        int i4 = timeModel.LLILLJJLI;
                        if (i4 < 12) {
                            if (i3 == 1) {
                                timeModel.LLILLJJLI = i4 + 12;
                            }
                        } else {
                            if (i3 != 0) {
                                return;
                            }
                            timeModel.LLILLJJLI = i4 - 12;
                        }
                    }
                }
            }
        });
        C19SE c19se = (C19SE) findViewById(R.id.o3v);
        this.LL = c19se;
        C19SE c19se2 = (C19SE) findViewById(R.id.o3o);
        this.LLILLJJLI = c19se2;
        this.LLILLL = (C21543019Sq) findViewById(R.id.o3f);
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.19Xg
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                boolean z;
                boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
                InterfaceC21555919Xp interfaceC21555919Xp = this.LL.LLIZLLLIL;
                if (interfaceC21555919Xp != null) {
                    C21555619Xm c21555619Xm = (C21555619Xm) interfaceC21555919Xp;
                    MaterialTimePicker materialTimePicker = c21555619Xm.LIZ;
                    boolean z2 = true;
                    materialTimePicker.LLJJ = 1;
                    materialTimePicker.MR(materialTimePicker.LLJILLL);
                    C21554519Xb c21554519Xb = c21555619Xm.LIZ.LLIZLLLIL;
                    C21545419To c21545419To = c21554519Xb.LLILZIL;
                    if (c21554519Xb.LLILLJJLI.LLILZ == 12) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c21545419To.setChecked(z);
                    C21545419To c21545419To2 = c21554519Xb.LLILZLL;
                    if (c21554519Xb.LLILLJJLI.LLILZ != 10) {
                        z2 = false;
                    }
                    c21545419To2.setChecked(z2);
                }
                return zOnDoubleTap;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: X.0TfR
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        c19se.setOnTouchListener(onTouchListener);
        c19se2.setOnTouchListener(onTouchListener);
        c19se.setTag(R.id.un7, 12);
        c19se2.setTag(R.id.un7, 10);
        C786410Ut5.s9(c19se, onClickListener);
        C786410Ut5.s9(c19se2, onClickListener);
    }
}
