package X;

import Y.AObjectS240S0100000_5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Editable;
import android.util.Size;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.0FB8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FB8 extends C0FC9<C0FB3, C363630ENl> {
    public C0FBA<?> LLJJJJJIL;
    public C0EO5<?> LLJJJJLIIL;
    public InterfaceC385890FBb LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public View LLJLILLLLZIIL;

    public final boolean LLLLLJLJLL() {
        C0EO0 c0eo0 = LLLLILI().LIZ.LIZJ;
        if (Intrinsics.LJFF(LLLLILI().LIZ.LJI, Boolean.TRUE) || !LLLLILI().LIZ.LJIILL) {
            return false;
        }
        if (LLLLILI().LIZ.LJIILJJIL && c0eo0 != null) {
            long j = c0eo0.LJFF;
            long j2 = c0eo0.LJI;
            long j3 = LLLLILI().LIZ.LJIILIIL;
            if (j > j3 || j3 > j2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLLLIL() {
        C0FBA<?> c0fb9;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        C0ENU c0enuLIZ;
        float f;
        C0FB9 c0fb92;
        AbstractC363520ENa abstractC363520ENa = LLLLILI().LIZ.LIZIZ;
        final Context contextRequireSceneContext = requireSceneContext();
        C0FBA<?> c0fba = this.LLJJJJJIL;
        final C363630ENl c363630ENlLLLLIL = LLLLIL();
        Float fValueOf = null;
        if (abstractC363520ENa instanceof C0ENY) {
            if (!(c0fba instanceof C0FBE) || (c0fb9 = (C0FBE) c0fba) == null) {
                c0fb9 = new C0FBA<C0ENY>(contextRequireSceneContext, c363630ENlLLLLIL) { // from class: X.0FBE
                    @Override // X.C0FBA, X.C0FBW
                    public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
                        C0EO0 c0eo0;
                        PointF pointFLJI;
                        if (!this.LIZIZ) {
                            return;
                        }
                        super.LIZ(canvas, size, c0few);
                        C0ENY c0eny = (C0ENY) this.LIZJ;
                        if (c0eny == null || (c0eo0 = this.LJJ) == null || (pointFLJI = LJI()) == null) {
                            return;
                        }
                        float f2 = pointFLJI.x;
                        float f3 = pointFLJI.y;
                        canvas.drawCircle(f2, f3, this.LJIJJ, this.LJIILLIIL);
                        float f4 = c0eny.LIZIZ * c0eo0.LIZIZ;
                        canvas.save();
                        canvas.rotate(c0eny.LIZ.LIZIZ + c0eo0.LJ, f2, f3);
                        float f5 = (float) this.LJIILL;
                        float f6 = f4 / 2;
                        float f7 = f3 - f6;
                        canvas.drawLine(f2 - f5, f7, f2 + f5, f7, this.LJIILLIIL);
                        float f8 = (float) this.LJIILL;
                        float f9 = f3 + f6;
                        canvas.drawLine(f2 - f8, f9, f2 + f8, f9, this.LJIILLIIL);
                        LIZLLL(new PointF(f2, f9), canvas);
                        canvas.restore();
                        LIZJ(canvas, size, c0few);
                    }
                };
            }
        } else if (abstractC363520ENa instanceof C0ENZ) {
            if (!(c0fba instanceof C0FBD) || (c0fb9 = (C0FBD) c0fba) == null) {
                c0fb9 = new C0FBA<C0ENZ>(contextRequireSceneContext, c363630ENlLLLLIL) { // from class: X.0FBD
                    @Override // X.C0FBA, X.C0FBW
                    public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
                        C0ENU c0enu;
                        C0EO0 c0eo0;
                        PointF pointFLJI;
                        if (!this.LIZIZ) {
                            return;
                        }
                        super.LIZ(canvas, size, c0few);
                        C0ENZ c0enz = (C0ENZ) this.LIZJ;
                        if (c0enz == null || (c0enu = c0enz.LIZ) == null || (c0eo0 = this.LJJ) == null || (pointFLJI = LJI()) == null) {
                            return;
                        }
                        float f2 = pointFLJI.x;
                        float f3 = pointFLJI.y;
                        canvas.drawCircle(f2, f3, this.LJIJJ, this.LJIILLIIL);
                        int iSave = canvas.save();
                        try {
                            canvas.rotate(c0enu.LIZIZ + c0eo0.LJ, f2, f3);
                            float f4 = f2 - this.LJIJJ;
                            canvas.drawLine((float) (((double) f4) - this.LJIILL), f3, f4, f3, this.LJIILLIIL);
                            float f5 = f2 + this.LJIJJ;
                            canvas.drawLine(f5, f3, (float) (((double) f5) + this.LJIILL), f3, this.LJIILLIIL);
                            LIZLLL(new PointF(f2, f3 + this.LJIJJ), canvas);
                            canvas.restoreToCount(iSave);
                            LIZJ(canvas, size, c0few);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            canvas.restoreToCount(iSave);
                            throw th;
                        }
                    }
                };
            }
        } else if (abstractC363520ENa instanceof C0ENV) {
            if (!(c0fba instanceof C0FBC) || (c0fb9 = (C0FBC) c0fba) == null) {
                c0fb9 = new C0FBA<C0ENV>(contextRequireSceneContext, c363630ENlLLLLIL) { // from class: X.0FBC
                    @Override // X.C0FBA, X.C0FBW
                    public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
                        C0EO0 c0eo0;
                        PointF pointFLJI;
                        if (!this.LIZIZ) {
                            return;
                        }
                        super.LIZ(canvas, size, c0few);
                        C0ENV c0env = (C0ENV) this.LIZJ;
                        if (c0env == null || (c0eo0 = this.LJJ) == null || (pointFLJI = LJI()) == null) {
                            return;
                        }
                        float f2 = pointFLJI.x;
                        float f3 = pointFLJI.y;
                        canvas.drawCircle(f2, f3, this.LJIJJ, this.LJIILLIIL);
                        float f4 = c0env.LIZJ * c0eo0.LIZIZ;
                        float f5 = c0env.LIZIZ * c0eo0.LIZ;
                        canvas.save();
                        canvas.rotate(c0env.LIZ.LIZIZ + c0eo0.LJ, f2, f3);
                        float f6 = 2;
                        float f7 = f5 / f6;
                        float f8 = f2 - f7;
                        float f9 = f4 / f6;
                        float f10 = f3 - f9;
                        float f11 = f7 + f2;
                        float f12 = f9 + f3;
                        canvas.drawOval(f8, f10, f11, f12, this.LJIILLIIL);
                        LIZLLL(new PointF(f2, f12), canvas);
                        LJFF(new PointF(f11 + this.LJIJJLI + this.LJIL, f3), new PointF(f2, (f10 - this.LJIJJLI) - this.LJIL), canvas, 1.0f);
                        canvas.restore();
                        LIZJ(canvas, size, c0few);
                    }
                };
            }
        } else if (abstractC363520ENa instanceof C0ENW) {
            if (!(c0fba instanceof C0FB9) || (c0fb9 = (C0FB9) c0fba) == null) {
                c0fb9 = new C0FB9(contextRequireSceneContext, c363630ENlLLLLIL);
            }
        } else if (!(abstractC363520ENa instanceof C0ENX)) {
            c0fb9 = null;
        } else if (!(c0fba instanceof C0FBB) || (c0fb9 = (C0FBB) c0fba) == null) {
            c0fb9 = new C0FBA<C0ENX>(contextRequireSceneContext, c363630ENlLLLLIL) { // from class: X.0FBB
                public final TuxIconDrawable LJJIFFI;
                public final float LJJII;
                public final float LJJIII;

                {
                    super(contextRequireSceneContext, c363630ENlLLLLIL);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_radius;
                    c419910GdJ.LJ = -16777216;
                    c419910GdJ.LJFF = false;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    this.LJJIFFI = c419910GdJ.LIZ(contextRequireSceneContext);
                    this.LJJII = C418440Gaw.LIZIZ(16);
                    this.LJJIII = C418440Gaw.LIZIZ(64);
                }

                @Override // X.C0FBA, X.C0FBW
                public final void LIZ(Canvas canvas, Size size, C0FEW c0few) {
                    C0EO0 c0eo0;
                    PointF pointFLJI;
                    if (!this.LIZIZ) {
                        return;
                    }
                    super.LIZ(canvas, size, c0few);
                    C0ENX c0enx = (C0ENX) this.LIZJ;
                    if (c0enx == null || (c0eo0 = this.LJJ) == null || (pointFLJI = LJI()) == null) {
                        return;
                    }
                    float f2 = pointFLJI.x;
                    float f3 = pointFLJI.y;
                    canvas.drawCircle(f2, f3, this.LJIJJ, this.LJIILLIIL);
                    float f4 = c0enx.LIZJ * c0eo0.LIZIZ;
                    float f5 = c0enx.LIZIZ * c0eo0.LIZ;
                    canvas.save();
                    canvas.rotate(c0enx.LIZ.LIZIZ + c0eo0.LJ, f2, f3);
                    float f6 = 2;
                    float fMin = (Math.min(f4, f5) / f6) * c0enx.LIZLLL;
                    float f7 = f5 / f6;
                    float f8 = f2 - f7;
                    float f9 = f4 / f6;
                    float f10 = f3 - f9;
                    float f11 = f7 + f2;
                    float f12 = f9 + f3;
                    canvas.drawRoundRect(f8, f10, f11, f12, fMin, fMin, this.LJIILLIIL);
                    LIZLLL(new PointF(f2, f12), canvas);
                    LJFF(new PointF(f11 + this.LJIJJLI + this.LJIL, f3), new PointF(f2, (f10 - this.LJIJJLI) - this.LJIL), canvas, 1.0f);
                    float f13 = this.LJJII;
                    float f14 = f13 + (c0enx.LIZLLL * (this.LJJIII - f13));
                    double radians = Math.toRadians(135.0d);
                    PointF pointF = new PointF(f8, f10);
                    float f15 = pointF.x + fMin;
                    float f16 = pointF.y + fMin;
                    double radians2 = Math.toRadians(45.0d);
                    double d = f15;
                    double d2 = fMin;
                    float fCos = (float) (d - (Math.cos(radians2) * d2));
                    float fSin = (float) (((double) f16) - (d2 * Math.sin(radians2)));
                    double d3 = f14;
                    PointF pointF2 = new PointF((float) (((double) fCos) + (Math.cos(radians) * d3)), (float) (((double) fSin) - (d3 * Math.sin(radians))));
                    this.LJIILLIIL.setPathEffect(this.LJIILJJIL);
                    canvas.drawLine(fCos, fSin, pointF2.x, pointF2.y, this.LJIILLIIL);
                    this.LJIILLIIL.setPathEffect(null);
                    LJ(new PointF(pointF2.x - (this.LJJIFFI.LIZJ() / 2), pointF2.y - (this.LJJIFFI.LIZIZ() / 2)), this.LJJIFFI, canvas, 1.0f);
                    canvas.restore();
                    LIZJ(canvas, size, c0few);
                }
            };
        }
        if (Intrinsics.LJFF(LLLLILI().LIZ.LJI, Boolean.TRUE)) {
            if (c0fb9 != null) {
                c0fb9.LJII(LLLLILI().LIZ.LJIILL);
            }
        } else if (c0fb9 != null) {
            c0fb9.LJII(LLLLLJLJLL());
        }
        if ((c0fb9 instanceof C0FB9) && (c0fb92 = (C0FB9) c0fb9) != null) {
            c0fb92.LJJIIJ = LLLLLJLJLL();
        }
        C0FBA<?> c0fba2 = this.LLJJJJJIL;
        if (c0fb9 != c0fba2) {
            if (c0fba2 != null) {
                LLLLIL().LIZIZ.invoke(c0fba2);
            }
            if (c0fb9 != null) {
                LLLLIL().LIZ.invoke(c0fb9);
            }
            this.LLJJJJJIL = c0fb9;
            if (c0fb9 != null) {
                c0fb9.LJIIIIZZ = false;
            }
        }
        AbstractC363520ENa abstractC363520ENa2 = LLLLILI().LIZ.LIZIZ;
        C0EO5<?> c0eo5 = this.LLJJJJLIIL;
        final C363630ENl c363630ENlLLLLIL2 = LLLLIL();
        final C0E48 c0e48LIZIZ = LIZIZ();
        if (abstractC363520ENa2 instanceof C0ENY) {
            if (!(c0eo5 instanceof C0EO8) || c0eo5 == null) {
                c0eo5 = new C0EO5<C0ENY>(c363630ENlLLLLIL2, c0e48LIZIZ) { // from class: X.0EO8
                    public final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    public boolean LLJJJJ;

                    @Override // X.C0EO5
                    public final RectF LJJIZ(PointF pointF) {
                        return null;
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJIL(PointF pointF) {
                        return null;
                    }

                    @Override // X.C0EO5
                    public final RectF LJJIL(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENY c0eny = (C0ENY) this.LLJILJILJ;
                        if (c0eny == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float f2 = c0eny.LIZIZ * c0eo0.LIZIZ;
                        float f3 = pointF.x;
                        float f4 = this.LLJJIJIL;
                        float f5 = 2;
                        float f6 = f4 / f5;
                        return new RectF(f3 - f6, pointF.y + (f2 / f5) + (this.LLJJJIL / 2), f3 + f6, f4);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJI(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENY c0eny = (C0ENY) this.LLJILJILJ;
                        if (c0eny == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float f2 = c0eny.LIZIZ * c0eo0.LIZIZ;
                        float f3 = pointF.x;
                        float f4 = 2;
                        float f5 = this.LLJJIJIL / f4;
                        float f6 = pointF.y;
                        float f7 = f2 / f4;
                        float f8 = this.LLJJJIL / 2;
                        return new RectF(f3 - f5, (f6 - f7) - f8, f3 + f5, f6 + f7 + f8);
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                        C0ENY c0eny;
                        if (!this.LLILLL || (c0eny = (C0ENY) this.LLJILJILJ) == null) {
                            return true;
                        }
                        LJJJJIZL(null, null, null, null, Float.valueOf(scaleGestureDetector.getScaleFactor() * c0eny.LIZIZ));
                        return true;
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final void onTouchEvent(MotionEvent motionEvent) {
                        if (!this.LLILLL) {
                            return;
                        }
                        super.onTouchEvent(motionEvent);
                        if (this.LLJJJJ && C1697810uHb.LJIIJJI(3, 1).contains(Integer.valueOf(motionEvent.getActionMasked()))) {
                            this.LLJJJJ = false;
                            this.LL.LJIIJJI.invoke();
                        }
                    }

                    @Override // X.C0EO5
                    public final void LJJJJIZL(PointF pointF, Float f2, Float f3, Float f4, Float f5) {
                        float fFloatValue;
                        float fFloatValue2;
                        float fFloatValue3;
                        C0ENY c0eny = (C0ENY) this.LLJILJILJ;
                        if (c0eny == null) {
                            return;
                        }
                        this.LLJJJJ = true;
                        C0ENU c0enu = c0eny.LIZ;
                        Function1<AbstractC363520ENa, Unit> function1 = this.LL.LJIIIIZZ;
                        if (pointF == null) {
                            pointF = c0enu.LIZ;
                        }
                        if (f2 != null) {
                            fFloatValue = f2.floatValue();
                        } else {
                            fFloatValue = c0enu.LIZIZ;
                        }
                        if (f3 != null) {
                            fFloatValue2 = f3.floatValue();
                        } else {
                            fFloatValue2 = c0enu.LIZJ;
                        }
                        C0ENU c0enuLIZ2 = C0ENU.LIZ(c0enu, pointF, fFloatValue, fFloatValue2);
                        if (f5 != null) {
                            fFloatValue3 = f5.floatValue();
                        } else {
                            fFloatValue3 = c0eny.LIZIZ;
                        }
                        function1.invoke(new C0ENY(c0enuLIZ2, fFloatValue3));
                    }
                };
            }
        } else if (abstractC363520ENa2 instanceof C0ENZ) {
            if (!(c0eo5 instanceof C0EOB) || c0eo5 == null) {
                c0eo5 = new C0EO5<C0ENZ>(c363630ENlLLLLIL2, c0e48LIZIZ) { // from class: X.0EOB
                    public final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    public boolean LLJJJJ;

                    @Override // X.C0EO5
                    public final RectF LJJIZ(PointF pointF) {
                        return null;
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJIL(PointF pointF) {
                        return null;
                    }

                    @Override // X.C0EO5
                    public final RectF LJJIL(PointF pointF) {
                        float f2 = pointF.x;
                        float f3 = this.LLJJIJIL;
                        float f4 = f3 / 2;
                        return new RectF(f2 - f4, pointF.y + (this.LLJJJIL / 2), f2 + f4, f3);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJI(PointF pointF) {
                        float f2 = pointF.x;
                        float f3 = this.LLJJIJIL / 2;
                        float f4 = pointF.y;
                        float f5 = this.LLJJJIL / 2;
                        return new RectF(f2 - f3, f4 - f5, f2 + f3, f4 + f5);
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final void onTouchEvent(MotionEvent motionEvent) {
                        if (!this.LLILLL) {
                            return;
                        }
                        super.onTouchEvent(motionEvent);
                        if (this.LLJJJJ && C1697810uHb.LJIIJJI(3, 1).contains(Integer.valueOf(motionEvent.getActionMasked()))) {
                            this.LLJJJJ = false;
                            this.LL.LJIIJJI.invoke();
                        }
                    }

                    @Override // X.C0EO5
                    public final void LJJJJIZL(PointF pointF, Float f2, Float f3, Float f4, Float f5) {
                        float fFloatValue;
                        float fFloatValue2;
                        C0ENZ c0enz = (C0ENZ) this.LLJILJILJ;
                        if (c0enz == null) {
                            return;
                        }
                        this.LLJJJJ = true;
                        C0ENU c0enu = c0enz.LIZ;
                        Function1<AbstractC363520ENa, Unit> function1 = this.LL.LJIIIIZZ;
                        if (pointF == null) {
                            pointF = c0enu.LIZ;
                        }
                        if (f2 != null) {
                            fFloatValue = f2.floatValue();
                        } else {
                            fFloatValue = c0enu.LIZIZ;
                        }
                        if (f3 != null) {
                            fFloatValue2 = f3.floatValue();
                        } else {
                            fFloatValue2 = c0enu.LIZJ;
                        }
                        function1.invoke(new C0ENZ(C0ENU.LIZ(c0enu, pointF, fFloatValue, fFloatValue2)));
                    }
                };
            }
        } else if (abstractC363520ENa2 instanceof C0ENV) {
            if (!(c0eo5 instanceof C0EO9) || c0eo5 == null) {
                c0eo5 = new C0EO5<C0ENV>(c363630ENlLLLLIL2, c0e48LIZIZ) { // from class: X.0EO9
                    public final float LLJJJIL = C418440Gaw.LIZIZ(24);
                    public boolean LLJJJJ;

                    @Override // X.C0EO5
                    public final RectF LJJIL(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENV c0env = (C0ENV) this.LLJILJILJ;
                        if (c0env == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float fMax = Math.max(this.LLJJJIL, c0env.LIZIZ * c0eo0.LIZ);
                        float fMax2 = Math.max(this.LLJJJIL, c0env.LIZJ * c0eo0.LIZIZ);
                        float f2 = pointF.x;
                        float f3 = 2;
                        float f4 = fMax / f3;
                        return new RectF(f2 - f4, pointF.y + (fMax2 / f3), f2 + f4, this.LLJJIJIL);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJIZ(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENV c0env = (C0ENV) this.LLJILJILJ;
                        if (c0env == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float fMax = Math.max(this.LLJJJIL, c0env.LIZIZ * c0eo0.LIZ);
                        float fMax2 = Math.max(this.LLJJJIL, c0env.LIZJ * c0eo0.LIZIZ);
                        float f2 = 2;
                        float f3 = pointF.x + (fMax / f2);
                        float f4 = pointF.y;
                        float f5 = fMax2 / f2;
                        return new RectF(f3, f4 - f5, this.LLJJIJIL, f4 + f5);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJI(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENV c0env = (C0ENV) this.LLJILJILJ;
                        if (c0env == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float f2 = c0env.LIZIZ * c0eo0.LIZ;
                        float f3 = c0env.LIZJ * c0eo0.LIZIZ;
                        float f4 = pointF.x;
                        float f5 = 2;
                        float f6 = f2 / f5;
                        float f7 = pointF.y;
                        float f8 = f3 / f5;
                        return new RectF(f4 - f6, f7 - f8, f4 + f6, f7 + f8);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJIL(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENV c0env = (C0ENV) this.LLJILJILJ;
                        if (c0env == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float fMax = Math.max(this.LLJJJIL, c0env.LIZIZ * c0eo0.LIZ);
                        float fMax2 = Math.max(this.LLJJJIL, c0env.LIZJ * c0eo0.LIZIZ);
                        float f2 = pointF.x;
                        float f3 = 2;
                        float f4 = fMax / f3;
                        return new RectF(f2 - f4, -this.LLJJIJIL, f2 + f4, pointF.y - (fMax2 / f3));
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final void onTouchEvent(MotionEvent motionEvent) {
                        if (!this.LLILLL) {
                            return;
                        }
                        super.onTouchEvent(motionEvent);
                        if (this.LLJJJJ && C1697810uHb.LJIIJJI(3, 1).contains(Integer.valueOf(motionEvent.getActionMasked()))) {
                            this.LLJJJJ = false;
                            this.LL.LJIIJJI.invoke();
                        }
                    }

                    @Override // X.C0EO5
                    public final void LJJJJIZL(PointF pointF, Float f2, Float f3, Float f4, Float f5) {
                        float fFloatValue;
                        float fFloatValue2;
                        float fFloatValue3;
                        float fFloatValue4;
                        C0ENV c0env = (C0ENV) this.LLJILJILJ;
                        if (c0env == null) {
                            return;
                        }
                        this.LLJJJJ = true;
                        C0ENU c0enu = c0env.LIZ;
                        Function1<AbstractC363520ENa, Unit> function1 = this.LL.LJIIIIZZ;
                        if (pointF == null) {
                            pointF = c0enu.LIZ;
                        }
                        if (f2 != null) {
                            fFloatValue = f2.floatValue();
                        } else {
                            fFloatValue = c0enu.LIZIZ;
                        }
                        if (f3 != null) {
                            fFloatValue2 = f3.floatValue();
                        } else {
                            fFloatValue2 = c0enu.LIZJ;
                        }
                        C0ENU c0enuLIZ2 = C0ENU.LIZ(c0enu, pointF, fFloatValue, fFloatValue2);
                        if (f4 != null) {
                            fFloatValue3 = f4.floatValue();
                        } else {
                            fFloatValue3 = c0env.LIZIZ;
                        }
                        if (f5 != null) {
                            fFloatValue4 = f5.floatValue();
                        } else {
                            fFloatValue4 = c0env.LIZJ;
                        }
                        function1.invoke(new C0ENV(c0enuLIZ2, fFloatValue3, fFloatValue4));
                    }
                };
            }
        } else if (abstractC363520ENa2 instanceof C0ENW) {
            if (!(c0eo5 instanceof C0EO6) || c0eo5 == null) {
                c0eo5 = new C0EO5<C0ENW>(c363630ENlLLLLIL2, c0e48LIZIZ) { // from class: X.0EO6
                    public boolean LLJJJJ;
                    public float LLJJJJJIL;
                    public RectF LLJJL;
                    public final C364570ERb LLJJJIL = new C364570ERb();
                    public final float LLJJJJLIIL = C418440Gaw.LIZIZ(28);

                    @Override // X.C0EO5
                    public final RectF LJJJIL(PointF pointF) {
                        return null;
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final boolean LIZIZ(MotionEvent motionEvent) {
                        LJJJJLL(motionEvent);
                        return true;
                    }

                    @Override // X.C0EO5
                    public final RectF LJJIL(PointF pointF) {
                        RectF rectFLJJJI;
                        if (!this.LLILLL || (rectFLJJJI = LJJJI(pointF)) == null) {
                            return null;
                        }
                        float f2 = 2;
                        return new RectF(pointF.x - (rectFLJJJI.width() / f2), pointF.y + (rectFLJJJI.height() / f2), pointF.x + (rectFLJJJI.width() / f2), this.LLJJIJIL);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJIZ(PointF pointF) {
                        RectF rectFLJJJI;
                        if (!this.LLILLL || (rectFLJJJI = LJJJI(pointF)) == null) {
                            return null;
                        }
                        float f2 = 2;
                        return new RectF(pointF.x + (rectFLJJJI.width() / f2), pointF.y - (rectFLJJJI.height() / f2), this.LLJJIJIL, pointF.y + (rectFLJJJI.height() / f2));
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJI(PointF pointF) {
                        if (!this.LLILLL) {
                            return null;
                        }
                        return LJJJJLI(pointF, false);
                    }

                    @Override // X.C0EO5
                    public final void LJJJJJL(b bVar) {
                        PointF pointFLJJJ;
                        RectF rectFLJJJI;
                        Float fValueOf2;
                        if (!this.LLILLL || (pointFLJJJ = LJJJ()) == null || (rectFLJJJI = LJJJI(pointFLJJJ)) == null) {
                            return;
                        }
                        SizeF sizeF = new SizeF(rectFLJJJI.width(), rectFLJJJI.height());
                        PointF pointF = bVar.LJIIJJI;
                        RectF rectF = this.LLJJL;
                        Float fValueOf3 = null;
                        if (rectF != null) {
                            fValueOf2 = Float.valueOf(rectF.width());
                        } else {
                            fValueOf2 = null;
                        }
                        Float fLJJIJL = LJJIJL(sizeF, pointF, fValueOf2);
                        if (fLJJIJL != null) {
                            float fFloatValue = fLJJIJL.floatValue();
                            C0EO0 c0eo0 = this.LLJI;
                            if (c0eo0 != null) {
                                float f2 = c0eo0.LIZ;
                                if (f2 > 0.0f && c0eo0.LIZIZ > 0.0f && f2 * fFloatValue != rectFLJJJI.width()) {
                                    float f3 = c0eo0.LIZ * fFloatValue;
                                    RectF rectF2 = this.LLJJL;
                                    if (rectF2 != null) {
                                        fValueOf3 = Float.valueOf(rectF2.width());
                                    }
                                    if (Intrinsics.LIZ(f3, fValueOf3)) {
                                        this.LLIZ.LIZ(0);
                                    }
                                }
                            }
                            LJJJJIZL(null, null, null, Float.valueOf(fFloatValue), null);
                        }
                    }

                    public final void LJJJJLL(MotionEvent motionEvent) {
                        PointF pointFLJJJ;
                        if (!this.LLILLL || (pointFLJJJ = LJJJ()) == null) {
                            return;
                        }
                        if (LJJJJI(motionEvent.getX(), motionEvent.getY(), LJJJI(pointFLJJJ))) {
                            this.LL.LJ.invoke(Boolean.TRUE);
                        } else {
                            LJJIJLIJ(motionEvent);
                        }
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                        C0ENW c0enw;
                        if (!this.LLILLL || (c0enw = (C0ENW) this.LLJILJILJ) == null) {
                            return true;
                        }
                        this.LL.LJIIIIZZ.invoke(C0ENW.LIZIZ(c0enw, null, null, c0enw.LIZJ * scaleGestureDetector.getScaleFactor(), 27));
                        return true;
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                        LJJJJLL(motionEvent);
                        return true;
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final void onTouchEvent(MotionEvent motionEvent) {
                        if (!this.LLILLL) {
                            return;
                        }
                        super.onTouchEvent(motionEvent);
                        if (this.LLJJJJ && C1697810uHb.LJIIJJI(3, 1).contains(Integer.valueOf(motionEvent.getActionMasked()))) {
                            this.LLJJJJ = false;
                            this.LL.LJIIJJI.invoke();
                        }
                    }

                    public final RectF LJJJJLI(PointF pointF, boolean z) {
                        C0ENW c0enw = (C0ENW) this.LLJILJILJ;
                        if (c0enw == null) {
                            return null;
                        }
                        NLETextRichContent nLETextRichContentLIZJ = c0enw.LIZJ();
                        if (this.LLJJJ <= 0.0f) {
                            return null;
                        }
                        if (C363770ENz.LIZJ(this.LLJJJIL.LIZ(nLETextRichContentLIZJ, Float.valueOf(this.LLJJJJJIL), c0enw.LIZJ, this.LLJJJ, z))) {
                            return null;
                        }
                        return new RectF(pointF.x - (r6.getWidth() / 2), pointF.y - (r6.getHeight() / 2), pointF.x + (r6.getWidth() / 2), pointF.y + (r6.getHeight() / 2));
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final boolean LLLLLLLLL(b bVar, float f2, float f3) {
                        PointF pointFLJJJ;
                        if (!this.LLILLL) {
                            return true;
                        }
                        super.LLLLLLLLL(bVar, f2, f3);
                        if (this.LLJJIJI && (pointFLJJJ = LJJJ()) != null) {
                            this.LLJJL = LJJJJLI(pointFLJJJ, false);
                        }
                        return true;
                    }

                    @Override // X.C0EO5
                    public final void LJJJJIZL(PointF pointF, Float f2, Float f3, Float f4, Float f5) {
                        C0ENW c0enw;
                        PointF pointFLJJJ;
                        RectF rectFLJJJI;
                        C0ENW c0enw2;
                        String jsonStr;
                        float fFloatValue;
                        float fFloatValue2;
                        float fFloatValue3;
                        if (!this.LLILLL || (c0enw = (C0ENW) this.LLJILJILJ) == null) {
                            return;
                        }
                        this.LLJJJJ = true;
                        C0ENU c0enu = c0enw.LIZ;
                        C0EO0 c0eo0 = this.LLJI;
                        if (c0eo0 != null && (pointFLJJJ = LJJJ()) != null && (rectFLJJJI = LJJJI(pointFLJJJ)) != null && (c0enw2 = (C0ENW) this.LLJILJILJ) != null) {
                            NLETextRichContent nLETextRichContentLIZJ = c0enw2.LIZJ();
                            if (this.LLJJJJJIL <= 0.0f) {
                                return;
                            }
                            float fWidth = rectFLJJJI.width() / c0eo0.LIZ;
                            int length = nLETextRichContentLIZJ.richTextData.textStr.length();
                            if (f4 != null) {
                                if (length <= 1) {
                                    fFloatValue3 = 0.0f;
                                } else {
                                    fFloatValue3 = (((((f4.floatValue() - fWidth) * c0eo0.LIZ) * this.LLJJJ) / c0enw.LIZJ) / this.LLJJJJLIIL) / (length - 1);
                                }
                                nLETextRichContentLIZJ.setLetterSpacing(nLETextRichContentLIZJ.letterSpacing + fFloatValue3);
                                nLETextRichContentLIZJ.setLetterSpacing(Math.max(0.0f, nLETextRichContentLIZJ.letterSpacing));
                                jsonStr = nLETextRichContentLIZJ.toJsonStr();
                            } else {
                                jsonStr = null;
                            }
                            Function1<AbstractC363520ENa, Unit> function1 = this.LL.LJIIIIZZ;
                            if (pointF == null) {
                                pointF = c0enu.LIZ;
                            }
                            if (f2 != null) {
                                fFloatValue = f2.floatValue();
                            } else {
                                fFloatValue = c0enu.LIZIZ;
                            }
                            if (f3 != null) {
                                fFloatValue2 = f3.floatValue();
                            } else {
                                fFloatValue2 = c0enu.LIZJ;
                            }
                            C0ENU c0enuLIZ2 = C0ENU.LIZ(c0enu, pointF, fFloatValue, fFloatValue2);
                            if (jsonStr == null) {
                                jsonStr = c0enw.LIZIZ;
                            }
                            function1.invoke(C0ENW.LIZIZ(c0enw, c0enuLIZ2, jsonStr, 0.0f, 28));
                        }
                    }

                    @Override // X.C0EO5
                    public final void LJJJJL(C0EO0 c0eo0, Float f2, Size size, Size size2, Size size3) {
                        super.LJJJJL(c0eo0, f2, size, size2, size3);
                        if (c0eo0 != null && f2 != null) {
                            f2.floatValue();
                            this.LLJJJJJIL = (c0eo0.LIZ / f2.floatValue()) * this.LLJJJ;
                        }
                    }
                };
            }
        } else if (abstractC363520ENa2 instanceof C0ENX) {
            if (!(c0eo5 instanceof C0EO7) || c0eo5 == null) {
                c0eo5 = new C0EO5<C0ENX>(c363630ENlLLLLIL2, c0e48LIZIZ) { // from class: X.0EO7
                    public boolean LLJJJIL;
                    public final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    public final float LLJJJJJIL = C418440Gaw.LIZIZ(24);
                    public boolean LLJJJJLIIL;

                    @Override // X.C0EO5
                    public final RectF LJJIL(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENX c0enx = (C0ENX) this.LLJILJILJ;
                        if (c0enx == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float fMax = Math.max(this.LLJJJJJIL, c0enx.LIZIZ * c0eo0.LIZ);
                        float fMax2 = Math.max(this.LLJJJJJIL, c0enx.LIZJ * c0eo0.LIZIZ);
                        float f2 = pointF.x;
                        float f3 = 2;
                        float f4 = fMax / f3;
                        return new RectF(f2 - f4, pointF.y + (fMax2 / f3), f2 + f4, this.LLJJIJIL);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJIZ(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENX c0enx = (C0ENX) this.LLJILJILJ;
                        if (c0enx == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float fMax = Math.max(this.LLJJJJJIL, c0enx.LIZIZ * c0eo0.LIZ);
                        float fMax2 = Math.max(this.LLJJJJJIL, c0enx.LIZJ * c0eo0.LIZIZ);
                        float f2 = 2;
                        float f3 = pointF.x + (fMax / f2);
                        float f4 = pointF.y;
                        float f5 = fMax2 / f2;
                        return new RectF(f3, f4 - f5, this.LLJJIJIL, f4 + f5);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJI(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENX c0enx = (C0ENX) this.LLJILJILJ;
                        if (c0enx == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float f2 = c0enx.LIZIZ * c0eo0.LIZ;
                        float f3 = c0enx.LIZJ * c0eo0.LIZIZ;
                        float f4 = pointF.x;
                        float f5 = 2;
                        float f6 = f2 / f5;
                        float f7 = pointF.y;
                        float f8 = f3 / f5;
                        return new RectF(f4 - f6, f7 - f8, f4 + f6, f7 + f8);
                    }

                    @Override // X.C0EO5
                    public final RectF LJJJIL(PointF pointF) {
                        C0EO0 c0eo0;
                        C0ENX c0enx = (C0ENX) this.LLJILJILJ;
                        if (c0enx == null || (c0eo0 = this.LLJI) == null) {
                            return null;
                        }
                        float fMax = Math.max(this.LLJJJJJIL, c0enx.LIZIZ * c0eo0.LIZ);
                        float fMax2 = Math.max(this.LLJJJJJIL, c0enx.LIZJ * c0eo0.LIZIZ);
                        float f2 = pointF.x;
                        float f3 = 2;
                        float f4 = fMax / f3;
                        return new RectF(f2 - f4, -this.LLJJIJIL, f2 + f4, pointF.y - (fMax2 / f3));
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final boolean LLLZLZ(b bVar) {
                        C0ENX c0enx;
                        float fMax;
                        if (!this.LLILLL) {
                            return true;
                        }
                        super.LLLZLZ(bVar);
                        if (bVar.LJIIL > 1 || !this.LLJJJIL || (c0enx = (C0ENX) this.LLJILJILJ) == null) {
                            return true;
                        }
                        this.LLJJJJLIIL = true;
                        Function1<AbstractC363520ENa, Unit> function1 = this.LL.LJIIIIZZ;
                        PointF pointF = bVar.LJIIJJI;
                        C0EO0 c0eo0 = this.LLJI;
                        if (c0eo0 == null) {
                            fMax = 0.0f;
                        } else {
                            C0EOF c0eof = C0EOF.LIZ;
                            float f2 = pointF.x;
                            float f3 = pointF.y;
                            float f4 = (-c0eo0.LJ) - c0enx.LIZ.LIZIZ;
                            c0eof.getClass();
                            PointF pointFLIZIZ = C0EOF.LIZIZ(f2, f3, f4, 0.0f, 0.0f);
                            float f5 = pointFLIZIZ.x;
                            float f6 = pointFLIZIZ.y;
                            float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
                            if (pointFLIZIZ.x <= 0.0f || pointFLIZIZ.y <= 0.0f) {
                                fSqrt = -fSqrt;
                            }
                            float fMin = (Math.min(c0enx.LIZIZ, c0enx.LIZJ) / 2) * c0enx.LIZLLL;
                            float f7 = this.LLJJJJ;
                            float f8 = c0enx.LIZIZ;
                            float f9 = c0enx.LIZJ;
                            fMax = Math.max(Math.min(c0enx.LIZLLL - (fSqrt / (f7 - (((float) Math.sqrt((f8 * f8) + (f9 * f9))) - fMin))), 1.0f), 0.0f);
                        }
                        function1.invoke(C0ENX.LIZIZ(c0enx, null, 0.0f, 0.0f, fMax, 7));
                        return true;
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final void onTouchEvent(MotionEvent motionEvent) {
                        if (!this.LLILLL) {
                            return;
                        }
                        super.onTouchEvent(motionEvent);
                        if (this.LLJJJJLIIL && C1697810uHb.LJIIJJI(3, 1).contains(Integer.valueOf(motionEvent.getActionMasked()))) {
                            this.LLJJJJLIIL = false;
                            this.LL.LJIIJJI.invoke();
                        }
                    }

                    @Override // X.C0EO5, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                    public final boolean LLLLLLLLL(b bVar, float f2, float f3) {
                        C0EO0 c0eo0;
                        if (!this.LLILLL) {
                            return true;
                        }
                        super.LLLLLLLLL(bVar, f2, f3);
                        PointF pointFLJJJ = LJJJ();
                        if (pointFLJJJ == null) {
                            return true;
                        }
                        this.LLJJJIL = false;
                        C0ENX c0enx = (C0ENX) this.LLJILJILJ;
                        RectF rectF = null;
                        if (c0enx != null && (c0eo0 = this.LLJI) != null) {
                            float f4 = c0enx.LIZIZ * c0eo0.LIZ;
                            float f5 = c0enx.LIZJ * c0eo0.LIZIZ;
                            float f6 = -this.LLJJIJIL;
                            float f7 = 2;
                            rectF = new RectF(f6, f6, pointFLJJJ.x - (f4 / f7), pointFLJJJ.y - (f5 / f7));
                        }
                        if (LJJJJI(f2, f3, rectF)) {
                            this.LLJJJIL = true;
                        }
                        return true;
                    }

                    @Override // X.C0EO5
                    public final void LJJJJIZL(PointF pointF, Float f2, Float f3, Float f4, Float f5) {
                        float fFloatValue;
                        float fFloatValue2;
                        float fFloatValue3;
                        float fFloatValue4;
                        C0ENX c0enx = (C0ENX) this.LLJILJILJ;
                        if (c0enx == null) {
                            return;
                        }
                        C0ENU c0enu = c0enx.LIZ;
                        this.LLJJJJLIIL = true;
                        Function1<AbstractC363520ENa, Unit> function1 = this.LL.LJIIIIZZ;
                        if (pointF == null) {
                            pointF = c0enu.LIZ;
                        }
                        if (f2 != null) {
                            fFloatValue = f2.floatValue();
                        } else {
                            fFloatValue = c0enu.LIZIZ;
                        }
                        if (f3 != null) {
                            fFloatValue2 = f3.floatValue();
                        } else {
                            fFloatValue2 = c0enu.LIZJ;
                        }
                        C0ENU c0enuLIZ2 = C0ENU.LIZ(c0enu, pointF, fFloatValue, fFloatValue2);
                        if (f4 != null) {
                            fFloatValue3 = f4.floatValue();
                        } else {
                            fFloatValue3 = c0enx.LIZIZ;
                        }
                        if (f5 != null) {
                            fFloatValue4 = f5.floatValue();
                        } else {
                            fFloatValue4 = c0enx.LIZJ;
                        }
                        function1.invoke(C0ENX.LIZIZ(c0enx, c0enuLIZ2, fFloatValue3, fFloatValue4, 0.0f, 8));
                    }
                };
            }
        } else if (!(c0eo5 instanceof C0EOC) || c0eo5 == null) {
            c0eo5 = new C0EO5<Object>(c363630ENlLLLLIL2, c0e48LIZIZ) { // from class: X.0EOC
                @Override // X.C0EO5
                public final RectF LJJIL(PointF pointF) {
                    return null;
                }

                @Override // X.C0EO5
                public final RectF LJJIZ(PointF pointF) {
                    return null;
                }

                @Override // X.C0EO5
                public final RectF LJJJI(PointF pointF) {
                    return null;
                }

                @Override // X.C0EO5
                public final RectF LJJJIL(PointF pointF) {
                    return null;
                }

                @Override // X.C0EO5
                public final void LJJJJIZL(PointF pointF, Float f2, Float f3, Float f4, Float f5) {
                }
            };
        }
        c0eo5.LLILLL = LLLLLJLJLL();
        C0EO5<?> c0eo52 = this.LLJJJJLIIL;
        if (c0eo5 != c0eo52) {
            if (c0eo52 != null) {
                LLLLIL().LIZLLL.invoke(c0eo52);
            }
            LLLLIL().LIZJ.invoke(c0eo5);
            this.LLJJJJLIIL = c0eo5;
        }
        C0FBA<?> c0fba3 = this.LLJJJJJIL;
        if (c0fba3 != null) {
            AbstractC363520ENa abstractC363520ENa3 = LLLLILI().LIZ.LIZIZ;
            c0fba3.LIZJ = abstractC363520ENa3 == null ? 0 : abstractC363520ENa3;
            if (abstractC363520ENa3 != null && (c0enuLIZ = abstractC363520ENa3.LIZ()) != null) {
                float f2 = c0enuLIZ.LIZIZ;
                if (f2 < 0.0f) {
                    float f3 = 360;
                    f = (f2 % f3) + f3;
                } else {
                    f = f2 % 360;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((int) f);
                sbLIZ.append((char) 176);
                c0fba3.LJIIJJI = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        C0FBA<?> c0fba4 = this.LLJJJJJIL;
        if (c0fba4 != null) {
            C0EO0 c0eo0 = LLLLILI().LIZ.LIZJ;
            C0E48 c0e48LIZIZ2 = LIZIZ();
            Float fValueOf2 = (c0e48LIZIZ2 == null || (nLETrackSlotLLLLLLIL2 = c0e48LIZIZ2.LLLLLLIL()) == null) ? null : Float.valueOf(nLETrackSlotLLLLLLIL2.getScale());
            C0FB3 c0fb3 = LLLLILI().LIZ;
            c0fba4.LJIIIIZZ(c0eo0, fValueOf2, LLLLILI().LIZ.LJ, LLLLILI().LIZ.LJFF);
        }
        C0EO5<?> c0eo53 = this.LLJJJJLIIL;
        if (c0eo53 != null) {
            AbstractC363520ENa abstractC363520ENa4 = LLLLILI().LIZ.LIZIZ;
            T t = abstractC363520ENa4;
            if (abstractC363520ENa4 == null) {
                t = 0;
            }
            c0eo53.LLJILJILJ = t;
        }
        C0EO5<?> c0eo54 = this.LLJJJJLIIL;
        if (c0eo54 != null) {
            C0EO0 c0eo02 = LLLLILI().LIZ.LIZJ;
            C0E48 c0e48LIZIZ3 = LIZIZ();
            if (c0e48LIZIZ3 != null && (nLETrackSlotLLLLLLIL = c0e48LIZIZ3.LLLLLLIL()) != null) {
                fValueOf = Float.valueOf(nLETrackSlotLLLLLLIL.getScale());
            }
            c0eo54.LJJJJL(c0eo02, fValueOf, LLLLILI().LIZ.LIZLLL, LLLLILI().LIZ.LJ, LLLLILI().LIZ.LJFF);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C0EO5<?> c0eo5 = this.LLJJJJLIIL;
        if (c0eo5 != null) {
            LLLLIL().LIZLLL.invoke(c0eo5);
        }
        C0FBA<?> c0fba = this.LLJJJJJIL;
        if (c0fba != null) {
            LLLLIL().LIZIZ.invoke(c0fba);
        }
    }

    public C0FB8(C1DRG c1drg) {
        super(c1drg);
    }

    public final void LLLLLL(boolean z) {
        this.LLJLIL = true;
        LLLLIL().LJIIJ.invoke(Boolean.valueOf(z));
        InterfaceC385890FBb interfaceC385890FBb = this.LLJJL;
        if (interfaceC385890FBb != null) {
            interfaceC385890FBb.LJLZ();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C385670FAf<Boolean> c385670FAfSM;
        C385670FAf<C386100FBw> c385670FAfRf;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.xoc);
        View viewFindViewById = view.findViewById(R.id.krz);
        this.LLJLILLLLZIIL = viewFindViewById;
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = LLLLILI().LIZ.LIZ;
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0FBQ
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(10));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(10));
            view3.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        View view4 = this.LLJJLIIIJLLLLLLLZ;
        if (view4 != null) {
            C786410Ut5.T4(view4, 0.0f);
        }
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(317));
        C1664590tQ1.LIZLLL(this, null, false, AFwS234S0000000_5.get$arr$(318), 3);
        C1664600tQ2.LIZ(this, "TextEditPanelScene", new AwS584S0100000_5(this, 648));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLJJL = (InterfaceC385890FBb) c1drg.LJIIL(null, InterfaceC385890FBb.class);
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C0FB3) obj).LJIILIIL);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 644));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0FB3) obj).LIZIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 645));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0FB3) obj).LIZJ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 646));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FB7
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0FB3) obj).LJIIIIZZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 647));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0FB3) obj).LJIIIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 649));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FB4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0FB3) obj).LJIIJ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 633));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C0FB3) obj).LJIILL);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 634));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FB5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0FB3) obj).LJIIJJI;
                }
            }, new AwS584S0100000_5(this, 637));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBS
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0FB3) obj).LJI;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 639));
            InterfaceC385890FBb interfaceC385890FBb = this.LLJJL;
            if (interfaceC385890FBb != null && (c385670FAfRf = interfaceC385890FBb.Rf()) != null) {
                c385670FAfRf.LIZ(this, new AObjectS240S0100000_5(this, 108));
            }
            InterfaceC385890FBb interfaceC385890FBb2 = this.LLJJL;
            if (interfaceC385890FBb2 != null) {
                interfaceC385890FBb2.GX1(new InterfaceC19682311zZ() { // from class: X.0FBG
                    @Override // X.InterfaceC19682311zZ
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC19682311zZ
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC19682311zZ
                    public final void LIZ(Editable editable, boolean z) {
                        InterfaceC385890FBb interfaceC385890FBb3;
                        if (z) {
                            return;
                        }
                        this.LIZ.LLLLIL().LJIIIZ.invoke(String.valueOf(editable), Boolean.TRUE);
                        if (String.valueOf(editable).length() > 500 && (interfaceC385890FBb3 = this.LIZ.LLJJL) != null) {
                            interfaceC385890FBb3.LLLLIIIILLL(String.valueOf(editable).substring(0, 500));
                        }
                    }
                });
            }
            InterfaceC385890FBb interfaceC385890FBb3 = this.LLJJL;
            if (interfaceC385890FBb3 != null && (c385670FAfSM = interfaceC385890FBb3.SM()) != null) {
                c385670FAfSM.LIZ(this, new AObjectS240S0100000_5(this, 109));
            }
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FB6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0FB3) obj).LJIIL;
                }
            }, new AwS584S0100000_5(this, 643));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c1z, viewGroup, false);
    }
}
