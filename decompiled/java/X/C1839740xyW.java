package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.taghandler.datahandler.CommonTagItem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839740xyW extends ReplacementSpan implements InterfaceC431020GvE {
    public final String LL;
    public final CommonTagItem LLILLJJLI;
    public final Map<String, Object> LLILLL;
    public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final float LLJI = C418440Gaw.LIZIZ(Float.valueOf(0.5f));
    public Paint LLJIJIL;
    public TuxIconDrawable LLJILJIL;
    public final boolean LLJILJILJ;
    public final AtomicBoolean LLJILLL;
    public final AtomicBoolean LLJJ;
    public final String LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
    }

    public final int LIZ() {
        if (!this.LLJILJILJ) {
            return C1383370m6R.LJFF(R.attr.a03);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, new ContextThemeWrapper(C21263918Jh.LIZ, R.style.z4));
        return numLIZJ != null ? numLIZJ.intValue() : C1383370m6R.LJFF(R.attr.a03);
    }

    public final int LIZIZ() {
        Context contextLIZ;
        TuxIconDrawable tuxIconDrawable = this.LLJILJIL;
        if (tuxIconDrawable != null) {
            return tuxIconDrawable.LJII;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
        c419910GdJ.LIZLLL = Integer.valueOf(LJI());
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (contextLIZ = abstractC1387200mCcLJ.LIZIZ()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        this.LLJILJIL = c419910GdJ.LIZ(contextLIZ);
        return iLIZIZ;
    }

    public final int LJI() {
        if (!this.LLJILJILJ) {
            return C1383370m6R.LJFF(R.attr.a1k);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, new ContextThemeWrapper(C21263918Jh.LIZ, R.style.z4));
        return numLIZJ != null ? numLIZJ.intValue() : C1383370m6R.LJFF(R.attr.a1k);
    }

    public final int LJII() {
        return ((Number) this.LLJJIJI.getValue()).intValue();
    }

    public final int LJIIIIZZ() {
        return ((Number) this.LLJJIJIL.getValue()).intValue();
    }

    public final boolean LJIIJ() {
        return ((Boolean) this.LLJJIII.getValue()).booleanValue();
    }

    public final Paint LJIIIZ(Paint paint) {
        Paint paint2 = this.LLJIJIL;
        if (paint2 != null) {
            return paint2;
        }
        Paint paint3 = new Paint(paint);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(92);
        paint3.setTypeface(c444890HcV.getTypeface());
        paint3.setTextSize(c444890HcV.getTextSize());
        paint3.setStrokeWidth(c444890HcV.getStrokeWidth());
        paint3.setColor(LJI());
        this.LLJIJIL = paint3;
        return paint3;
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        String string;
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        Object obj5;
        String str5;
        Object obj6;
        Map<String, Object> map = this.LLILLL;
        if (map != null && (obj6 = map.get("reply_message_id")) != null) {
            string = obj6.toString();
        } else {
            string = null;
        }
        C1508705vR c1508705vR = C1508705vR.LL;
        Map<String, Object> map2 = this.LLILLL;
        if (map2 != null) {
            obj = map2.get("enter_from");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Map<String, Object> map3 = this.LLILLL;
        if (map3 != null) {
            obj2 = map3.get("chat_type");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Map<String, Object> map4 = this.LLILLL;
        if (map4 != null) {
            obj3 = map4.get("is_self");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        Map<String, Object> map5 = this.LLILLL;
        if (map5 != null) {
            obj4 = map5.get("to_user_id");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof String) {
            str4 = (String) obj4;
        } else {
            str4 = null;
        }
        Map<String, Object> map6 = this.LLILLL;
        if (map6 != null) {
            obj5 = map6.get("conversation_id");
        } else {
            obj5 = null;
        }
        if (obj5 instanceof String) {
            str5 = (String) obj5;
        } else {
            str5 = null;
        }
        String str6 = this.LLJJI;
        c1508705vR.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1498905tr(str, str2, str3, string, str4, str5, str6, null), 3);
        SmartRouter.buildRoute(view.getContext(), this.LLILLJJLI.schema).open();
    }

    public C1839740xyW(String str, CommonTagItem commonTagItem, Map<String, ? extends Object> map) {
        Object obj;
        this.LL = str;
        this.LLILLJJLI = commonTagItem;
        this.LLILLL = map;
        if (map != null) {
            obj = map.get("is_sender");
        } else {
            obj = null;
        }
        this.LLJILJILJ = Intrinsics.LJFF(obj instanceof String ? obj : null, "true");
        this.LLJILLL = new AtomicBoolean(false);
        this.LLJJ = new AtomicBoolean(false);
        String str2 = commonTagItem.type;
        this.LLJJI = str2 != null ? a0.LJJZ(str2, "/", str2) : null;
        this.LLJJIII = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(344));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1373));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1371));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1374));
        this.LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1372));
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String string;
        String string2;
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        Object obj5;
        String str5;
        Object obj6;
        Object obj7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iLJII = LJII() + LJIIIIZZ();
        Paint paintLJIIIZ = LJIIIZ(paint);
        String str6 = this.LL;
        int iMeasureText = iLJII + ((int) paintLJIIIZ.measureText(str6, 0, str6.length())) + this.LLIZ + LIZIZ() + ((Number) this.LLJJJ.getValue()).intValue() + ((Number) this.LLJJIJIIJIL.getValue()).intValue();
        if (this.LLJILLL.compareAndSet(false, true)) {
            C054G c054g = C1499405tw.LIZ;
            C1499405tw.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "get_size", "smart-reply-sources");
        }
        if (this.LLJJ.compareAndSet(false, true)) {
            Map<String, Object> map = this.LLILLL;
            if (map != null && (obj7 = map.get("message_id")) != null) {
                string = obj7.toString();
            } else {
                string = null;
            }
            Map<String, Object> map2 = this.LLILLL;
            if (map2 != null && (obj6 = map2.get("reply_message_id")) != null) {
                string2 = obj6.toString();
            } else {
                string2 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str7 = "";
            if (string == null) {
                string = "";
            }
            sbLIZ.append(string);
            sbLIZ.append('_');
            String str8 = this.LLJJI;
            if (str8 == null) {
                str8 = "";
            }
            sbLIZ.append(str8);
            sbLIZ.append('_');
            String str9 = this.LLILLJJLI.title;
            if (str9 == null) {
                str9 = "";
            }
            sbLIZ.append(str9);
            sbLIZ.append('_');
            String str10 = this.LLILLJJLI.schema;
            if (str10 != null) {
                str7 = str10;
            }
            sbLIZ.append(str7);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1508705vR c1508705vR = C1508705vR.LL;
            Map<String, Object> map3 = this.LLILLL;
            if (map3 != null) {
                obj = map3.get("enter_from");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            Map<String, Object> map4 = this.LLILLL;
            if (map4 != null) {
                obj2 = map4.get("chat_type");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            Map<String, Object> map5 = this.LLILLL;
            if (map5 != null) {
                obj3 = map5.get("is_self");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            } else {
                str3 = null;
            }
            Map<String, Object> map6 = this.LLILLL;
            if (map6 != null) {
                obj4 = map6.get("to_user_id");
            } else {
                obj4 = null;
            }
            if (obj4 instanceof String) {
                str4 = (String) obj4;
            } else {
                str4 = null;
            }
            Map<String, Object> map7 = this.LLILLL;
            if (map7 != null) {
                obj5 = map7.get("conversation_id");
            } else {
                obj5 = null;
            }
            if (obj5 instanceof String) {
                str5 = (String) obj5;
            } else {
                str5 = null;
            }
            String str11 = this.LLJJI;
            c1508705vR.getClass();
            C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1499205tu(str, str2, str3, string2, str4, str5, str11, strLIZIZ, null), 3);
        }
        return iMeasureText;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Rect rect = new Rect();
        String str = this.LL;
        str.toString();
        paint.getTextBounds(str, 0, this.LL.length(), rect);
        Paint paintLJIIIZ = LJIIIZ(paint);
        String str2 = this.LL;
        float fLJII = f + LJII() + LJIIIIZZ() + ((int) paintLJIIIZ.measureText(str2, 0, str2.length())) + this.LLIZ + LIZIZ() + ((Number) this.LLJJJ.getValue()).intValue();
        int i6 = rect.top + i4;
        int i7 = this.LLIZLLLIL;
        RectF rectF = new RectF(LJII() + f, i6 - i7, fLJII, i4 + rect.bottom + i7);
        int color = paint.getColor();
        Paint.Style style = paint.getStyle();
        float strokeWidth = paint.getStrokeWidth();
        float fLIZIZ = C418440Gaw.LIZIZ(200);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(LIZ());
        canvas.drawRoundRect(rectF, fLIZIZ, fLIZIZ, paint);
        float f2 = this.LLJI / 2.0f;
        RectF rectF2 = new RectF(rectF.left + f2, rectF.top + f2, rectF.right - f2, rectF.bottom - f2);
        float f3 = fLIZIZ - f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.LLJI);
        paint.setColor(LIZ());
        canvas.drawRoundRect(rectF2, f3, f3, paint);
        paint.setColor(color);
        paint.setStyle(style);
        paint.setStrokeWidth(strokeWidth);
        if (LJIIJ()) {
            Paint paintLJIIIZ2 = LJIIIZ(paint);
            Rect rect2 = new Rect();
            String str3 = this.LL;
            str3.toString();
            paintLJIIIZ2.getTextBounds(str3, 0, this.LL.length(), rect2);
            float f4 = 2;
            float fHeight = (rectF.bottom - ((rectF.height() - rect2.height()) / f4)) - f4;
            String str4 = this.LL;
            str4.toString();
            canvas.drawText(str4, 0, this.LL.length(), f + LJII() + LJIIIIZZ() + LIZIZ(), fHeight, paintLJIIIZ2);
        } else {
            Paint paintLJIIIZ3 = LJIIIZ(paint);
            Rect rect3 = new Rect();
            String str5 = this.LL;
            str5.toString();
            paintLJIIIZ3.getTextBounds(str5, 0, this.LL.length(), rect3);
            float f5 = 2;
            float fHeight2 = (rectF.bottom - ((rectF.height() - rect3.height()) / f5)) - f5;
            String str6 = this.LL;
            str6.toString();
            canvas.drawText(str6, 0, this.LL.length(), f + LJII() + LJIIIIZZ() + this.LLJ, fHeight2, paintLJIIIZ3);
        }
        canvas.save();
        if (LJIIJ()) {
            canvas.translate(f + LJII() + LJIIIIZZ() + this.LLJ, (rectF.top + rectF.bottom) / 2.0f);
            TuxIconDrawable tuxIconDrawable = this.LLJILJIL;
            if (tuxIconDrawable != null) {
                tuxIconDrawable.draw(canvas);
            }
        } else {
            Paint paintLJIIIZ4 = LJIIIZ(paint);
            String str7 = this.LL;
            str7.toString();
            canvas.translate(f + LJII() + LJIIIIZZ() + paintLJIIIZ4.measureText(str7, 0, this.LL.length()) + this.LLIZ + this.LLJ, (rectF.top + rectF.bottom) / 2.0f);
            TuxIconDrawable tuxIconDrawable2 = this.LLJILJIL;
            if (tuxIconDrawable2 != null) {
                tuxIconDrawable2.draw(canvas);
            }
        }
        canvas.restore();
        C054G c054g = C1499405tw.LIZ;
        C1499405tw.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "draw", "smart-reply-sources");
    }
}
