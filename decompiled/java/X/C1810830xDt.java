package X;

import Y.ARunnableS127S0100000_27;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.list.bulletin.BulletinView$startDisplay$1$1", f = "BulletinView.kt", l = {291}, m = "invokeSuspend")
public final class C1810830xDt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1810810xDr LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1810830xDt(C1810810xDr c1810810xDr, String str, InterfaceC1364105Vn<? super C1810830xDt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1810810xDr;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1810830xDt c1810830xDt = new C1810830xDt(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1810830xDt.LLILLJJLI = obj;
        return c1810830xDt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final InterfaceC497601wk interfaceC497601wk;
        int iMeasureText;
        int iMeasureText2;
        int scrollX;
        int iMeasureText3;
        C1C7U.LIZ("BulletinView@89c6.startDisplay$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinView@89c6.startDisplay$1$1");
                return objLJFF;
            }
        }
        final C1810810xDr c1810810xDr = this.LLILLL;
        String str = this.LLILZ;
        TextView textView = c1810810xDr.LLILLL;
        InterfaceC1811000xEA interfaceC1811000xEA = new InterfaceC1811000xEA() { // from class: X.0xDv
            @Override // X.InterfaceC1811000xEA
            public final void LIZ(int i2) {
                if (i2 > 0) {
                    if (((ArrayList) c1810810xDr.LLJJIJIIJIL).size() > 1) {
                        C1810810xDr c1810810xDr2 = c1810810xDr;
                        c1810810xDr2.LIZJ(new ARunnableS127S0100000_27(c1810810xDr2, 1));
                        return;
                    } else {
                        if (!(!((ArrayList) c1810810xDr.LLJJIJIIJIL).isEmpty())) {
                            return;
                        }
                        C1810810xDr c1810810xDr3 = c1810810xDr;
                        c1810810xDr3.LIZLLL((RankListV2Response.Bulletin) ListProtector.get(c1810810xDr3.LLJJIJIIJIL, 0));
                        return;
                    }
                }
                if (((ArrayList) c1810810xDr.LLJJIJIIJIL).size() <= 1) {
                    return;
                }
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1810860xDw(c1810810xDr, null), 3);
            }
        };
        if (c1810810xDr.LLJJJ) {
            textView.setText(str);
            textView.setScrollX(c1810810xDr.LIZIZ());
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                iMeasureText = (int) paint.measureText(str);
            } else {
                iMeasureText = 0;
            }
            if (iMeasureText > textView.getWidth()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("               ");
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                C118300cf c118300cf = new C118300cf();
                TextPaint paint2 = textView.getPaint();
                if (paint2 != null) {
                    iMeasureText2 = (int) paint2.measureText(textView.getText().toString());
                } else {
                    iMeasureText2 = 0;
                }
                c118300cf.element = iMeasureText2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("               ");
                sbLIZ2.append(str);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ2));
                if (((ArrayList) c1810810xDr.LLJJIJIIJIL).size() > 1) {
                    TextPaint paint3 = textView.getPaint();
                    if (paint3 != null) {
                        iMeasureText3 = (int) paint3.measureText(textView.getText().toString());
                    } else {
                        iMeasureText3 = 0;
                    }
                    c118300cf.element = iMeasureText3 - textView.getWidth();
                }
                if (C497740JfY.LJJ()) {
                    scrollX = textView.getScrollX() - c118300cf.element;
                } else {
                    scrollX = textView.getScrollX() + c118300cf.element;
                }
                C786410Ut5.LJLLLLLL(0, c1810810xDr.LLILZ);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(textView.getScrollX(), scrollX);
                c1810810xDr.LLJJJJ = valueAnimatorOfInt;
                if (valueAnimatorOfInt != null) {
                    valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                }
                ValueAnimator valueAnimator = c1810810xDr.LLJJJJ;
                if (valueAnimator != null) {
                    valueAnimator.setDuration((long) (((c118300cf.element * 1.0f) / ((int) C497740JfY.LIZIZ(40.0f))) * 1000));
                }
                ValueAnimator valueAnimator2 = c1810810xDr.LLJJJJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new AUListenerS256S0100000_6(textView, 7));
                }
                ValueAnimator valueAnimator3 = c1810810xDr.LLJJJJ;
                if (valueAnimator3 != null) {
                    valueAnimator3.addListener(new C1864930yd9(interfaceC1811000xEA, c118300cf, 0));
                }
                ValueAnimator valueAnimator4 = c1810810xDr.LLJJJJ;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            } else {
                interfaceC1811000xEA.LIZ(0);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinView@89c6.startDisplay$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
