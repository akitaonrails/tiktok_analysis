package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import zoo.b;

/* JADX INFO: renamed from: X.0FTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390760FTu extends C0FUE {
    public static final C01GW<Integer> LLJLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
    public static final C01GW<Integer> LLJZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1501));
    public final C0FFD LLJJ;
    public final Context LLJJI;
    public final C390420FSm LLJJIII;
    public final C0FK0 LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public EnumC1466150oFx LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final float LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public final C01GW LLJLLIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FUE
    public final boolean LJJIL() {
        C0FF8 c0ff8LIZ = ((InterfaceC388760FMc) this.LLJJIII.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LIZ();
        return c0ff8LIZ != null && c0ff8LIZ.LIZIZ(C364540EQy.LIZ((TextStickerModel) LJJJZ().LIZ)) && LJJJJ();
    }

    @Override // X.C0FUE
    public final boolean LJJJ() {
        C0FK0 c0fk0 = this.LLJJIJI;
        return c0fk0 != null && c0fk0.LJIJJ;
    }

    @Override // X.C0FUE
    public final C1664680tQA<BaseStickerModel> LJJJIL() {
        return this.LLJJ.LJJIJ();
    }

    public final void LJJJJZI() {
        C364650ERj c364650ERj;
        if ((this.LLJJ.LJJJZ().LIZ.getTextTemplateModel().enableTextTemplate || (LJJJLZIJ() instanceof C0ERO)) && LJJJJ()) {
            C0FFP c0ffpLJJJLZIJ = LJJJLZIJ();
            C0ERO c0ero = c0ffpLJJJLZIJ instanceof C0ERO ? (C0ERO) c0ffpLJJJLZIJ : null;
            if (c0ero != null) {
                c0ero.LJIILLIIL(false);
            }
            C0FFP c0ffpLJJJLZIJ2 = LJJJLZIJ();
            if (!(c0ffpLJJJLZIJ2 instanceof C364650ERj) || (c364650ERj = (C364650ERj) c0ffpLJJJLZIJ2) == null) {
                return;
            }
            c364650ERj.LJIILIIL(false);
        }
    }

    public final C0FTH LJJJLL() {
        return (C0FTH) this.LLJJIJIIJIL.getValue();
    }

    public final C0FFP LJJJLZIJ() {
        return this.LLJJ.LJJIL();
    }

    public final C1664680tQA LJJJZ() {
        return this.LLJJ.LJJJZ();
    }

    public final void LJJLI() {
        try {
            ((Vibrator) this.LLJLLIL.getValue()).vibrate(30L);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FUE
    public final boolean LJJJJ() {
        C0FF8 c0ff8LIZ;
        if (!((TextStickerModel) LJJJZ().LIZ).getEnableGesture() || (((c0ff8LIZ = ((InterfaceC388760FMc) this.LLJJIII.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LIZ()) != null && c0ff8LIZ.LIZ(C364540EQy.LIZ((TextStickerModel) LJJJZ().LIZ), this.LLJL)) || (LJJJLL().LIZLLL().LJIILIIL().LIZ.LIZIZ && C0F8Y.LJIIIIZZ((TextStickerModel) LJJJZ().LIZ)))) {
            return false;
        }
        if (!this.LLJJ.LJJJZ().LIZ.getTextTemplateModel().enableTextTemplate && !(LJJJLZIJ() instanceof C0ERO)) {
            return LJJJIL().LIZ.getVisible();
        }
        InterfaceC386690FEd interfaceC386690FEdLIZIZ = ((InterfaceC388760FMc) this.LLJJIII.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LIZIZ();
        int iLLL = interfaceC386690FEdLIZIZ != null ? interfaceC386690FEdLIZIZ.LLL() : 0;
        if (LJJJIL().LIZ.getVisible()) {
            int startTime = (int) LJJJIL().LIZ.getStartTime();
            if (iLLL <= ((int) LJJJIL().LIZ.getEndTime()) && startTime <= iLLL) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C0FUE
    public final float LJJJI() {
        return this.LLJLIL;
    }

    public static boolean LJJJJZ(float f) {
        if (f <= 0.0f || f > LLJLLL.getValue().intValue()) {
            if (f < 0.0f && (-f) <= LLJZ.getValue().intValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        LJJJJZI();
        boolean zE2 = super.E2(c21645419nQ);
        this.LLJJJJLIIL = zE2;
        return zE2;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LIZIZ(MotionEvent motionEvent) {
        this.LLJL = true;
        LJJJJZI();
        boolean zLIZIZ = super.LIZIZ(motionEvent);
        this.LLJL = false;
        return zLIZIZ;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final void LJFF(b bVar) {
        if ((LJJJLZIJ() instanceof C0ERO) && this.LLJJJJ) {
            this.LLJJJJ = false;
            LJJJJL(new AwS584S0100000_5(this, 1079));
        } else {
            super.LJFF(bVar);
        }
        this.LLJLILLLLZIIL = 0.0f;
        this.LLJLL = 0.0f;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJIIIZ(float f) {
        if ((LJJJLZIJ() instanceof C0ERO) && this.LLJJJJLIIL) {
            this.LLJJJJLIIL = false;
            LJJJJJL(new AwS549S0100000_5(this, 1493));
            return true;
        }
        return super.LJIIIZ(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FUE
    public final float LJJIJL(ScaleGestureDetector scaleGestureDetector) {
        float fLJJIJL = super.LJJIJL(scaleGestureDetector);
        if (LJJJIL().LIZ.getType() == EnumC1466150oFx.TEXT && !C0F8Y.LJIILJJIL((TextStickerModel) LJJJZ().LIZ)) {
            float f = ((TextStickerModel) LJJJZ().LIZ).getFontModel().fontSize;
            float fLIZIZ = C0FM7.LIZIZ(((TextStickerModel) LJJJZ().LIZ).getCompatModel().getMinFontSize());
            if (f > 0.0f && fLIZIZ > 0.0f) {
                return Math.max(fLIZIZ / f, fLJJIJL);
            }
            return fLJJIJL;
        }
        return fLJJIJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FUE
    public final void LJJJJLI(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wsx: realScale :");
        sbLIZ.append(f);
        sbLIZ.append(" originalFontSize = ");
        sbLIZ.append(((TextStickerModel) LJJJZ().LIZ).getFontModel().fontSize);
        sbLIZ.append(" realFontSize = ");
        sbLIZ.append(((TextStickerModel) LJJJZ().LIZ).getFontModel().fontSize * f);
        sbLIZ.append(' ');
        C388320FKk.LIZ.d(C2188811AlT.LIZIZ(sbLIZ));
        super.LJJJJLI(f);
    }

    public final RectF LJJJLIIL(RectF rectF) {
        return new RectF(rectF.left - LJJJLL().LIZ().LJJIJL(), rectF.top - LJJJLL().LIZ().LLJJJJLIIL, LJJJLL().LIZ().LJJIJLIJ() - rectF.right, LJJJLL().LIZ().LLJJL - rectF.bottom);
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLJI(float f) {
        if ((LJJJLZIJ() instanceof C0ERO) && this.LLJJJJJIL) {
            this.LLJJJJJIL = false;
            LJJJJJL(new AwS549S0100000_5(this, 1494));
            return true;
        }
        return super.LLLLJI(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x02d5, code lost:
    
        if (java.lang.Math.abs(r11) > X.C390760FTu.LLJZ.getValue().intValue()) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029c A[RETURN] */
    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLZLZ(zoo.b r67) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390760FTu.LLLZLZ(zoo.b):boolean");
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (LJJJJ() && motionEvent != null) {
            LJJJJZI();
            super.onDown(motionEvent);
            this.LLJJIJIL = LJJJLL().LIZIZ().LJJIJLIJ().LIZ.LIZIZ;
            this.LLJJJ = LJJJLL().LIZIZ().LLJILJIL;
            this.LLJJJIL = LJJJLL().LIZIZ().LLJILJILJ;
        }
        return false;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        LJJJJZI();
        boolean zOnScaleBegin = super.onScaleBegin(scaleGestureDetector);
        this.LLJJJJJIL = zOnScaleBegin;
        return zOnScaleBegin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.graphics.RectF] */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, android.graphics.RectF] */
    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        TextStyleModel textStyle;
        this.LLJL = true;
        LJJJJZI();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = LJJJIL().LIZ.getVisibleRectWithoutRotation();
        if (((TextStickerModel) LJJJZ().LIZ).getMode() != 2 && !((TextStickerModel) LJJJZ().LIZ).getTextTemplateModel().enableTextTemplate && ((TextStickerModel) LJJJZ().LIZ).getMode() != 3 && ((textStyle = ((TextStickerModel) LJJJZ().LIZ).getTextStyle()) == null || textStyle.background == null)) {
            c259800zU.element = BaseStickerModel.copy$default(LJJJIL().LIZ, 0, 0, null, 0, 0, 0.0f, 0.0f, LJJJIL().LIZ.getWidth() - (((int) C11VU.LIZIZ(12.0f, this.LLJJI)) * 2), LJJJIL().LIZ.getHeight() - (((int) C11VU.LIZIZ(8.0f, this.LLJJI)) * 2), 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -385, 15, null).getVisibleRectWithoutRotation();
        }
        if (C121Q.LIZ(motionEvent.getX(), motionEvent.getY(), LJJJIL().LIZ.getRotation(), (RectF) c259800zU.element, this.LLJLIL)) {
            if (!LJJJJ()) {
                LJJJJL(new AwS584S0100000_5(this, 1080));
                this.LLJL = false;
                return false;
            }
            int id = LJJJIL().LIZ.getId();
            EnumC1466150oFx type = LJJJIL().LIZ.getType();
            C0FK0 c0fk0 = this.LLJJIJI;
            if (c0fk0 != null && c0fk0.LJIILL && this.LLJJIJIL && this.LLJJJ == id && this.LLJJJIL == type) {
                this.LLJL = false;
                return LIZIZ(motionEvent);
            }
            for (C0FUD c0fud : this.LLILZ) {
                int id2 = LJJJIL().LIZ.getId();
                LJJJIL().LIZ.getType();
                motionEvent.getX();
                motionEvent.getY();
                new RectF((RectF) c259800zU.element);
                if (c0fud.LJJIIJ(id2)) {
                    this.LLJL = false;
                    return true;
                }
            }
            LJJJJL(new AwS214S0300000_5(this, (C390760FTu) motionEvent, (MotionEvent) c259800zU, (C259800zU<RectF>) 34));
            this.LLJL = false;
            return true;
        }
        this.LLJL = false;
        return false;
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onUp(MotionEvent motionEvent) {
        if (C390410FSl.LIZIZ(this.LLJJIII).LJIILLIIL) {
            LJJJLL().LIZ().LJJJJLI();
        }
        super.onUp(motionEvent);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RectF LJJL(BaseStickerModel baseStickerModel, float f, float f2) {
        int iLIZIZ;
        int iLIZIZ2 = 0;
        if (C0F8Y.LJIILJJIL((TextStickerModel) LJJJZ().LIZ)) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        if (!C0F8Y.LJIILJJIL((TextStickerModel) LJJJZ().LIZ)) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        return BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, LJJJIL().LIZ.getWidth() - (iLIZIZ * 2), LJJJIL().LIZ.getHeight() - (iLIZIZ2 * 2), 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291841, 15, null).getVisibleRectWithoutRotationInContainer();
    }

    @Override // X.C0FUE, X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJJL = false;
        LJJJJZI();
        boolean zLLLLLLLLL = super.LLLLLLLLL(bVar, f, f2);
        this.LLJJJJ = zLLLLLLLLL;
        return zLLLLLLLLL;
    }

    public C390760FTu(C0FFD c0ffd, Context context, C390420FSm c390420FSm, C0FK0 c0fk0) {
        float f;
        super(c0ffd.LJJIJ(), c390420FSm);
        this.LLJJ = c0ffd;
        this.LLJJI = context;
        this.LLJJIII = c390420FSm;
        this.LLJJIJI = c0fk0;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1495));
        this.LLJJJ = -1;
        this.LLJJJIL = EnumC1466150oFx.NONE;
        if (c0fk0 != null) {
            f = c0fk0.LJJIIJZLJL;
        } else {
            f = 0.0f;
        }
        this.LLJLIL = f;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1496));
    }
}
