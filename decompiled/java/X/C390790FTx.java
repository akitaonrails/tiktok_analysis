package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS38S0301000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390790FTx extends C0FUM implements C0FUG {
    public final Context LL;
    public final C0FUH LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final InterfaceC388760FMc LLILZ;
    public final C0FTK LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public C0FTD LLJ;
    public AnonymousClass0956 LLJIJIL;
    public int LLJILJIL;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(282));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, LSPassThroughRecordSizeConfig.DEFAULT));
    public EnumC1466150oFx LLJILJILJ = EnumC1466150oFx.NONE;
    public final List<C0FU7> LLJJI = new ArrayList();

    @Override // X.C0FUG
    public final void LIZJ() {
    }

    @Override // X.C0FUG
    public final void LJI() {
    }

    @Override // X.C0FUG
    public final void LJII(MotionEvent motionEvent) {
    }

    @Override // X.C0FUG
    public final void LJIIIIZZ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIILLIIL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIZILJ() {
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
    }

    @Override // X.C0FUG
    public final void LJIL() {
    }

    @Override // X.C0FUG
    public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJJIII() {
    }

    @Override // X.C0FUG
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0FUG
    public final void LJJIJ() {
    }

    @Override // X.C0FUG
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 100;
    }

    public final C1664680tQA<C0FU3> LJJIJLIJ() {
        return (C1664680tQA) this.LLIZLLLIL.getValue();
    }

    public final boolean LJJIL() {
        C388890FMp c388890FMp = (C388890FMp) this.LLJILLL.getValue();
        if (c388890FMp != null) {
            c388890FMp.LIZJ();
        }
        this.LLJJ = false;
        if (!LJJIJLIJ().LIZ.LIZIZ) {
            return false;
        }
        C388890FMp c388890FMp2 = (C388890FMp) this.LLJILLL.getValue();
        if (c388890FMp2 != null) {
            c388890FMp2.LIZJ();
        }
        this.LLJJ = false;
        LJJIJLIJ().LIZLLL(new AwS20S0010000_5(54), true);
        return true;
    }

    public final void LJJIJIL() {
        if (LJJIJLIJ().LIZ.LIZIZ) {
            AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LJJIL();
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        LJJIJIL();
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUG
    public final void LJIJI(int i, boolean z) {
        if (!z && i == this.LLJILJIL) {
            LJJIJIL();
        }
    }

    public final boolean LJJIZ(PointF pointF, boolean z) throws Throwable {
        float fLIZIZ = C11VU.LIZIZ(41.0f, this.LL);
        float size = (fLIZIZ * LJJIJLIJ().LIZ.LIZ.size()) + C11VU.LIZIZ(12.0f, this.LL) + C11VU.LIZIZ(60.0f, this.LL);
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(C786410Ut5.N3(this.LL), "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUsFwR7edYsye2ry7uL", null));
        int width = displayLLILZIL.getWidth();
        int height = displayLLILZIL.getHeight();
        if (z) {
            float f = pointF.x;
            if (f >= 0.0f && pointF.y >= size && f <= width) {
                return false;
            }
            return true;
        }
        float f2 = pointF.x;
        if (f2 >= 0.0f && f2 <= width && pointF.y <= height - size) {
            return false;
        }
        return true;
    }

    public final PointF LJJIJL(RectF rectF, float f, boolean z) {
        PointF pointF = new PointF();
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        float[] fArr = {f2, f3, f4, f3, f2, f5, f4, f5};
        Matrix matrix = new Matrix();
        float f6 = fArr[2];
        float f7 = fArr[0];
        float f8 = ((f6 - f7) / 2.0f) + f7;
        float f9 = fArr[5];
        float f10 = fArr[3];
        matrix.postRotate(f, f8, ((f9 - f10) / 2.0f) + f10);
        matrix.mapPoints(fArr);
        float f11 = fArr[1] + fArr[3];
        float f12 = fArr[5] + fArr[7];
        if (f11 < f12 && !z) {
            pointF.set((fArr[0] + fArr[2]) / 2.0f, f11 / 2.0f);
        } else {
            pointF.set((fArr[4] + fArr[6]) / 2.0f, f12 / 2.0f);
        }
        pointF.y += this.LLILLJJLI.LJIILJJIL;
        return pointF;
    }

    public final C0FU6 LJJJ(int i, Integer num, Integer num2, String str) {
        int iIntValue;
        int iIntValue2;
        int i2;
        int iIntValue3;
        String string = str;
        int iIntValue4 = R.drawable.bxh;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 11) {
                        if (num != null) {
                            iIntValue4 = num.intValue();
                        }
                        if (string == null) {
                            string = this.LL.getString(2131826910);
                        }
                        return new C0FU6(1, iIntValue4, string, num2, null, 16);
                    }
                    if (num != null) {
                        iIntValue3 = num.intValue();
                    } else {
                        iIntValue3 = R.drawable.a_v;
                    }
                    if (string == null) {
                        string = this.LL.getString(2131844799);
                    }
                    return new C0FU6(11, iIntValue3, string, num2, null, 16);
                }
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = R.drawable.a_u;
                }
                if (string == null) {
                    Context context = this.LL;
                    if (((Boolean) C265190AaL.LIZ.getValue()).booleanValue()) {
                        i2 = 2131829852;
                    } else {
                        i2 = 2131829851;
                    }
                    string = context.getString(i2);
                }
                return new C0FU6(3, iIntValue2, string, num2, null, 16);
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = R.drawable.a_r;
            }
            if (string == null) {
                string = this.LL.getString(2131829874);
            }
            return new C0FU6(2, iIntValue, string, num2, null, 16);
        }
        if (num != null) {
            iIntValue4 = num.intValue();
        }
        if (string == null) {
            string = this.LL.getString(2131826910);
        }
        return new C0FU6(1, iIntValue4, string, num2, null, 16);
    }

    public C390790FTx(Context context, C0FUH c0fuh, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm, InterfaceC388760FMc interfaceC388760FMc, C0FTK c0ftk) {
        this.LL = context;
        this.LLILLJJLI = c0fuh;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = interfaceC388760FMc;
        this.LLILZIL = c0ftk;
        this.LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1001));
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1002));
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 999));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r0v38, types: [T, android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, X.0iGF] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, X.0iGF] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
        C0FFO next;
        T arrayList;
        Object next2;
        List<Integer> list;
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, (List) this.LLILZLL.getValue());
        if (c0ftjLIZ != null && c0ftjLIZ.LJII()) {
            this.LLJI.getValue();
            this.LLJILJIL = i;
            this.LLJILJILJ = enumC1466150oFx;
            C259800zU c259800zU = new C259800zU();
            Iterator<C0FFO> it2 = this.LLILLJJLI.LJIIIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LIZ == enumC1466150oFx) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0FFO c0ffo = next;
            if (c0ffo != null && (list = c0ffo.LJIIIIZZ) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Integer> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(LJJJ(it3.next().intValue(), null, null, null));
                }
            } else {
                arrayList = new ArrayList();
            }
            c259800zU.element = arrayList;
            Iterator it4 = ((ArrayList) this.LLJJI).iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (((C0FU7) next2).getStickerType() == enumC1466150oFx) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C0FU7 c0fu7 = (C0FU7) next2;
            if (c0fu7 != null) {
                c259800zU.element = c0fu7.LIZIZ(i);
            }
            LJJIJLIJ().LIZLLL(new AwS584S0100000_5(c259800zU, (C259800zU<Effect>) 835), true);
            RectF rectF2 = this.LLILZIL.LLJILJIL;
            if (rectF2 == null) {
                rectF2 = new RectF(rectF);
            }
            rectF2.left -= C11VU.LIZ(10.0f);
            rectF2.right += C11VU.LIZ(10.0f);
            rectF2.top -= C11VU.LIZ(10.0f);
            rectF2.bottom += C11VU.LIZ(10.0f);
            int i2 = (int) f;
            int i3 = (int) f2;
            RectF rectF3 = new RectF(rectF2);
            C0FUB c0fubLJII = this.LLILZ.LJII();
            if (c0fubLJII != null) {
                c0fubLJII.LIZ();
            }
            C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = LJJIJL(rectF3, f3, false);
            C259800zU c259800zU3 = new C259800zU();
            ?? r2 = EnumC1235690iGF.TOP;
            c259800zU3.element = r2;
            if (LJJIZ((PointF) c259800zU2.element, true)) {
                c259800zU2.element = LJJIJL(rectF3, f3, true);
                c259800zU3.element = EnumC1235690iGF.BOTTOM;
                if (LJJIZ((PointF) c259800zU2.element, false)) {
                    PointF pointF = (PointF) c259800zU2.element;
                    pointF.x = i2;
                    pointF.y = i3;
                    c259800zU3.element = r2;
                }
            }
            LJJIJLIJ().LIZLLL(new AwS371S0200000_5(c259800zU2, (C259800zU<String>) c259800zU3, (C259800zU<String>) 202), true);
            LJJIJLIJ().LIZLLL(AFwS234S0000000_5.get$arr$(407), true);
            this.LLJJ = true;
            C388890FMp c388890FMp = (C388890FMp) this.LLJILLL.getValue();
            if (c388890FMp != null) {
                c388890FMp.LIZJ();
            }
            C388890FMp c388890FMp2 = (C388890FMp) this.LLJILLL.getValue();
            if (c388890FMp2 != null) {
                c388890FMp2.LIZ(new AwS38S0301000_5(this, c0fu7, i, enumC1466150oFx, 3));
            }
            AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJIJIL = C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C390800FTy(this, null), 3);
        }
    }
}
