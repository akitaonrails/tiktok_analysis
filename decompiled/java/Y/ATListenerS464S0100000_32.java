package Y;

import X.AnonymousClass1814;
import X.C18S8;
import X.C21271918Mj;
import X.C21272018Mk;
import X.C21272418Mo;
import X.C21339718fD;
import X.C214848196g;
import X.C21509219Fq;
import X.C786410Ut5;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public class ATListenerS464S0100000_32 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS464S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS464S0100000_32 aTListenerS464S0100000_32, View view, MotionEvent motionEvent) {
        ((C21339718fD) aTListenerS464S0100000_32.l0).requestFocus();
        DataChannel dataChannel = ((C21339718fD) aTListenerS464S0100000_32.l0).getDataChannel();
        if (dataChannel != null) {
            dataChannel.FQ2(PreviewHideKeyboardEvent.class);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS464S0100000_32 aTListenerS464S0100000_32, View view, MotionEvent motionEvent) {
        if (((C18S8) aTListenerS464S0100000_32.l0).mView.getVisibility() == 8) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                    ((C18S8) aTListenerS464S0100000_32.l0).LLLLIL().LJFF.invoke();
                } else {
                    ((C18S8) aTListenerS464S0100000_32.l0).LLLLIL().LIZLLL.invoke(Float.valueOf(motionEvent.getY() - ((C18S8) aTListenerS464S0100000_32.l0).LLJLILLLLZIIL));
                }
            } else {
                view.performClick();
                ((C18S8) aTListenerS464S0100000_32.l0).LLLLIL().LJ.invoke();
            }
        } else {
            ((C18S8) aTListenerS464S0100000_32.l0).LLJLILLLLZIIL = motionEvent.getY();
            ((C18S8) aTListenerS464S0100000_32.l0).LLLLIL().LIZJ.invoke();
        }
        return true;
    }

    public static final boolean onTouch$2(ATListenerS464S0100000_32 aTListenerS464S0100000_32, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C214848196g c214848196g = (C214848196g) aTListenerS464S0100000_32.l0;
            c214848196g.LJJIZ = c214848196g.LJJIL;
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r1 != 3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$3(Y.ATListenerS464S0100000_32 r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            int r1 = r7.getAction()
            r4 = 0
            r3 = 1
            if (r1 == r3) goto L1c
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto L1c
        Le:
            return r4
        Lf:
            java.lang.Object r1 = r5.l0
            X.196S r1 = (X.C196S) r1
            int r0 = r1.LLILZLL
            if (r0 >= 0) goto Le
            int r0 = r1.LLILZIL
            r1.LLILZLL = r0
            return r4
        L1c:
            java.lang.Object r0 = r5.l0
            X.196S r0 = (X.C196S) r0
            int r1 = r0.LLILZIL
            int r0 = r0.LLILZLL
            int r1 = r1 - r0
            int r1 = java.lang.Math.abs(r1)
            r0 = 10
            if (r1 <= r0) goto L43
            java.lang.Object r0 = r5.l0
            X.196S r0 = (X.C196S) r0
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r2 = r0.LLIZ
            if (r2 == 0) goto L43
            int r1 = r0.LLILZIL
            int r0 = r0.LLILZLL
            if (r1 > r0) goto L3c
            r3 = 0
        L3c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.invoke(r0)
        L43:
            java.lang.Object r1 = r5.l0
            X.196S r1 = (X.C196S) r1
            r0 = -1
            r1.LLILZLL = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS464S0100000_32.onTouch$3(Y.ATListenerS464S0100000_32, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$4(ATListenerS464S0100000_32 aTListenerS464S0100000_32, View view, MotionEvent motionEvent) {
        C21509219Fq c21509219Fq = (C21509219Fq) aTListenerS464S0100000_32.l0;
        C786410Ut5.LJJJLZIJ(c21509219Fq.LIZLLL, c21509219Fq.LIZIZ);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$5(Y.ATListenerS464S0100000_32 r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS464S0100000_32.onTouch$5(Y.ATListenerS464S0100000_32, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$6(ATListenerS464S0100000_32 aTListenerS464S0100000_32, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                ((AnonymousClass1814) aTListenerS464S0100000_32.l0).LLJILJIL = motionEvent.getX();
                ((AnonymousClass1814) aTListenerS464S0100000_32.l0).LLJILJILJ = motionEvent.getY();
                ((AnonymousClass1814) aTListenerS464S0100000_32.l0).LLJILLL = 0;
            } else if (numValueOf != null) {
                if (numValueOf.intValue() == 2) {
                    float x = motionEvent.getX() - ((AnonymousClass1814) aTListenerS464S0100000_32.l0).LLJILJIL;
                    float y = motionEvent.getY() - ((AnonymousClass1814) aTListenerS464S0100000_32.l0).LLJILJILJ;
                    if (Math.abs(x) > 1.0f || Math.abs(y) > 1.0f) {
                        ((AnonymousClass1814) aTListenerS464S0100000_32.l0).LLJILLL = 1;
                        return false;
                    }
                } else if (numValueOf.intValue() == 1) {
                    AnonymousClass1814 anonymousClass1814 = (AnonymousClass1814) aTListenerS464S0100000_32.l0;
                    if (anonymousClass1814.LLJILLL == 0) {
                        anonymousClass1814.i0(anonymousClass1814.LLJJ);
                    }
                    ((AnonymousClass1814) aTListenerS464S0100000_32.l0).LLJILLL = 0;
                    return false;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS464S0100000_32 aTListenerS464S0100000_32, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            EPAICreateSelectMaterialScene ePAICreateSelectMaterialScene = (EPAICreateSelectMaterialScene) aTListenerS464S0100000_32.l0;
            ePAICreateSelectMaterialScene.X0 = true ^ ePAICreateSelectMaterialScene.X0;
            ePAICreateSelectMaterialScene.C0();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$8(ATListenerS464S0100000_32 aTListenerS464S0100000_32, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            C21272418Mo c21272418Mo = (C21272418Mo) aTListenerS464S0100000_32.l0;
            int i = c21272418Mo.LLJILLL;
            ProductListModel productListModel = c21272418Mo.LL;
            C21272018Mk c21272018Mk = C21272018Mk.LIZ;
            ArrayList arrayList = new ArrayList(c21272418Mo.LLILLL);
            c21272018Mk.getClass();
            int iLJIILLIIL = C21272018Mk.LJIILLIIL(arrayList);
            String str = ((C21272418Mo) aTListenerS464S0100000_32.l0).LLJJI;
            c21271918Mj.getClass();
            C21271918Mj.LJIJJLI(i, productListModel, iLJIILLIIL, str);
            ((C21272418Mo) aTListenerS464S0100000_32.l0).LLJILLL = 0;
        }
        return false;
    }
}
