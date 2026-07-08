package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367520Eb0 extends AbstractC368090Ebv implements InterfaceC497601wk {
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public RectF LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final C1DFB LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final C01GW LLJJJ;
    public InterfaceC367590Eb7 LLJJJIL;
    public final C444890HcV LLJJJJ;
    public final Paint LLJJJJJIL;
    public final Rect LLJJJJLIIL;
    public final Rect LLJJL;
    public final Path LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public TuxIconDrawable LLJLIL;
    public String LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public String LLJZ;

    private final C367540Eb2 getOldTrackViewModel() {
        return (C367540Eb2) this.LLJJJ.getValue();
    }

    private final InterfaceC367590Eb7 getTrackViewModel() {
        InterfaceC367590Eb7 interfaceC367590Eb7 = this.LLJJJIL;
        return interfaceC367590Eb7 == null ? getOldTrackViewModel() : interfaceC367590Eb7;
    }

    @Override // X.InterfaceC368560Ecg
    public final boolean LJII() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public int getBgColor() {
        return this.LLJJI;
    }

    @Override // X.AbstractC368090Ebv
    public int getBgRadius() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC368090Ebv
    public float getClipLength() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public RectF getClipRectF() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC368090Ebv
    public boolean getDrawDivider() {
        return this.LLJIJIL;
    }

    public final boolean getEnableIcon$editor_trackpanel_release() {
        return this.LLJJIJIIJIL;
    }

    public final String getText() {
        return this.LLJZ;
    }

    @Override // X.AbstractC368090Ebv
    public float getTimelineScale() {
        return this.LLJJ;
    }

    public final InterfaceC367590Eb7 getTrackViewModelCompat() {
        return this.LLJJJIL;
    }

    public C367520Eb0(Context context) {
        super(context, null, 0);
        this.LLJIJIL = true;
        this.LLJILLL = new RectF();
        this.LLJJ = C360610EBv.LIZJ();
        this.LLJJI = -16777216;
        this.LLJJIJI = C0PEM.LIZJ;
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = C360610EBv.LJ;
        this.LLJJJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(433));
        C444890HcV c444890HcV = new C444890HcV();
        this.LLJJJJ = c444890HcV;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LLJJJJJIL = paint;
        this.LLJJJJLIIL = new Rect();
        this.LLJJL = new Rect();
        this.LLJJLIIIJLLLLLLLZ = new Path();
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1697));
        this.LLJLILLLLZIIL = "";
        this.LLJLL = C0FU0.LIZ(10.0f);
        this.LLJLLIL = C0FU0.LIZ(9.0f);
        this.LLJLLL = C0FU0.LIZ(14.0f);
        this.LLJZ = "";
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextSize(C0FU0.LIZ(13.0f));
        c444890HcV.setStrokeWidth(C0FU0.LIZ(1.0f));
        c444890HcV.setStyle(Paint.Style.FILL);
        c444890HcV.LIZ(62);
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public final void LJI(Canvas canvas) {
        int bgColor;
        int iLIZ;
        int iLIZ2;
        canvas.getClipBounds(this.LLJJL);
        Paint paint = this.LLJJJJJIL;
        Typeface typeface = C368130Ebz.LIZ;
        Integer numLIZIZ = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.e2));
        if (numLIZIZ != null) {
            bgColor = numLIZIZ.intValue();
        } else {
            bgColor = getBgColor();
        }
        paint.setColor(bgColor);
        setBgRadius(LJIIJ(getTrackViewModel().LIZIZ()));
        canvas.drawRoundRect(new RectF(this.LLJJL), getBgRadius(), getBgRadius(), this.LLJJJJJIL);
        if (!this.LLJILJIL) {
            Rect rect = this.LLJJL;
            int i = rect.left;
            int i2 = rect.right - C367650EbD.LLILZLL;
            Rect rect2 = this.LLJJL;
            RectF rectF = new RectF(i + r0, rect2.top, i2, rect2.bottom);
            this.LLJJLIIIJLLLLLLLZ.reset();
            this.LLJJLIIIJLLLLLLLZ.addRoundRect(rectF, getBgRadius(), getBgRadius(), Path.Direction.CCW);
            canvas.clipPath(this.LLJJLIIIJLLLLLLLZ);
        }
        this.LLJJJJJIL.setColor(getBgColor());
        canvas.drawRoundRect(new RectF(this.LLJJL), getBgRadius(), getBgRadius(), this.LLJJJJJIL);
        if (LJIIJJI()) {
            int trackHeight = getTrackHeight();
            int i3 = AbstractC367990Ebl.LJIILJJIL;
            if (trackHeight > i3 + 1) {
                this.LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                this.LLJJJJ.LIZ(62);
            } else if (getTrackHeight() > i3 - 1) {
                this.LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                this.LLJJJJ.LIZ(62);
            } else {
                this.LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                this.LLJJJJ.LIZ(72);
            }
        }
        this.LLJLLIL = (getTrackHeight() - C0FU0.LIZ(18.0f)) / 2;
        this.LLJLL = (getTrackHeight() - this.LLJLLL) / 2;
        float fWidth = 0.0f;
        if (((Boolean) this.LLJL.getValue()).booleanValue()) {
            if (getClipRectF().width() == 0.0f) {
                fWidth = getMeasuredWidth();
            } else {
                fWidth = getClipRectF().width();
            }
        }
        if (LJIIJJI()) {
            if (getTrackHeight() < this.LLJJIJIL) {
                iLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            } else if (getTrackHeight() == this.LLJJIJIL) {
                iLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            } else {
                iLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
        } else {
            iLIZ = C0FU0.LIZ(4.0f);
        }
        if (this.LLJJIJIIJIL) {
            if (((Boolean) this.LLJL.getValue()).booleanValue()) {
                TuxIconDrawable tuxIconDrawable = this.LLJLIL;
                if (tuxIconDrawable != null) {
                    int i4 = ((int) fWidth) - iLIZ;
                    int i5 = this.LLJLLL;
                    int i6 = this.LLJLL;
                    tuxIconDrawable.setBounds(i4 - i5, i6, i4, i5 + i6);
                }
            } else {
                TuxIconDrawable tuxIconDrawable2 = this.LLJLIL;
                if (tuxIconDrawable2 != null) {
                    int i7 = ((int) fWidth) + iLIZ;
                    int i8 = this.LLJLL;
                    int i9 = this.LLJLLL;
                    tuxIconDrawable2.setBounds(i7, i8, i7 + i9, i9 + i8);
                }
            }
            TuxIconDrawable tuxIconDrawable3 = this.LLJLIL;
            if (tuxIconDrawable3 != null) {
                tuxIconDrawable3.draw(canvas);
            }
        }
        int i10 = this.LLJLLL;
        if (LJIIJJI()) {
            if (getTrackHeight() < this.LLJJIJIL) {
                iLIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            } else if (getTrackHeight() == this.LLJJIJIL) {
                iLIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            }
        } else {
            iLIZ2 = C0FU0.LIZ(2.0f);
        }
        if (!this.LLJJIJIIJIL) {
            iLIZ2 = iLIZ;
            iLIZ = 0;
            i10 = 0;
        }
        if (((Boolean) this.LLJL.getValue()).booleanValue()) {
            if (this.LLJZ.length() == 0) {
                this.LLJJJJLIIL.set(0, 0, 0, 0);
                this.LLJLILLLLZIIL = "";
            } else if (!Intrinsics.LJFF(this.LLJLILLLLZIIL, this.LLJZ)) {
                C444890HcV c444890HcV = this.LLJJJJ;
                String str = this.LLJZ;
                c444890HcV.getTextBounds(str, 0, str.length(), this.LLJJJJLIIL);
                this.LLJLILLLLZIIL = this.LLJZ;
            }
            canvas.drawText(this.LLJZ, fWidth - (((iLIZ + i10) + iLIZ2) + this.LLJJJJLIIL.width()), this.LLJLLIL + this.LLJJJJ.getTextSize(), this.LLJJJJ);
        } else {
            canvas.drawText(this.LLJZ, ((int) fWidth) + iLIZ + i10 + iLIZ2, this.LLJLLIL + this.LLJJJJ.getTextSize(), this.LLJJJJ);
        }
        super.LJI(canvas);
    }

    @Override // X.AbstractC368090Ebv, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LLJILJIL) {
            LJI(canvas);
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgColor(int i) {
        this.LLJJI = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgRadius(int i) {
        this.LLJJIII = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipLength(float f) {
        this.LLJILJILJ = f;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipRectF(RectF rectF) {
        this.LLJILLL = rectF;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setDrawDivider(boolean z) {
        if (this.LLJIJIL != z) {
            this.LLJIJIL = z;
            invalidate();
        }
    }

    public final void setEnableIcon$editor_trackpanel_release(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setItemSelected(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setSegment(NLETrackSlot nLETrackSlot) {
        String resourceName;
        setNleTrackSlot$editor_trackpanel_release(nLETrackSlot);
        if (C351220Dpo.LLJ(nLETrackSlot)) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f1, getContext());
            if (numLIZJ != null) {
                setBgColor(numLIZJ.intValue());
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_camera_filter_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.f2);
                c419910GdJ.LJFF = false;
                this.LLJLIL = c419910GdJ.LIZ(getContext());
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.f2, getContext());
            if (numLIZJ2 != null) {
                this.LLJJJJ.setColor(numLIZJ2.intValue());
            }
            NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentFilterDynamicCast != null) {
                NLEResourceNode effectSDKFilter = nLESegmentFilterDynamicCast.getEffectSDKFilter();
                if (effectSDKFilter == null || (resourceName = effectSDKFilter.getResourceName()) == null) {
                    resourceName = "";
                }
                setText(resourceName);
            }
        }
        if (C351220Dpo.LLJJIJIIJIL(nLETrackSlot)) {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.el, getContext());
            if (numLIZJ3 != null) {
                setBgColor(numLIZJ3.intValue());
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_control_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.eu);
                c419910GdJ2.LJFF = false;
                this.LLJLIL = c419910GdJ2.LIZ(getContext());
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.eu, getContext());
            if (numLIZJ4 != null) {
                this.LLJJJJ.setColor(numLIZJ4.intValue());
            }
            setText(getContext().getString(2131825206));
        }
    }

    public final void setText(String str) {
        if (!Intrinsics.LJFF(str, this.LLJZ)) {
            this.LLJZ = str;
            invalidate();
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setTimelineScale(float f) {
        this.LLJJ = f;
    }

    public final void setTrackViewModelCompat(InterfaceC367590Eb7 interfaceC367590Eb7) {
        this.LLJJJIL = interfaceC367590Eb7;
    }
}
