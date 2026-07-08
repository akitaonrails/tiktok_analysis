package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.style.ReplacementSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.markdown.taghandler.datahandler.SmartReplySourceItem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetContext;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetData;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetETParam;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetFragment;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839720xyU extends ReplacementSpan implements InterfaceC431020GvE {
    public final List<SmartReplySourceItem> LL;
    public final Map<String, Object> LLILLJJLI;
    public Paint LLJ;
    public TuxIconDrawable LLJI;
    public final boolean LLJILJIL;
    public final AtomicBoolean LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
    public final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(342));

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

    public final CharSequence LIZ() {
        return (CharSequence) this.LLJIJIL.getValue();
    }

    public final int LIZIZ() {
        Context contextLIZ;
        TuxIconDrawable tuxIconDrawable = this.LLJI;
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
        this.LLJI = c419910GdJ.LIZ(contextLIZ);
        return iLIZIZ;
    }

    public final int LJI() {
        if (!this.LLJILJIL) {
            return C1383370m6R.LJFF(R.attr.a1k);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, new ContextThemeWrapper(C21263918Jh.LIZ, R.style.z4));
        return numLIZJ != null ? numLIZJ.intValue() : C1383370m6R.LJFF(R.attr.a1k);
    }

    public final int LJII() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final int LJIIIIZZ() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    public final boolean LJIIJ() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    public final Paint LJIIIZ(Paint paint) {
        Paint paint2 = this.LLJ;
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
        this.LLJ = paint3;
        return paint3;
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        Object obj;
        String str;
        String string;
        String string2;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        Object obj5;
        String str5;
        Activity activityLIZ;
        C19EG c19eg;
        Activity activityLIZIZ;
        Object obj6;
        Object obj7;
        Map<String, Object> map = this.LLILLJJLI;
        if (map != null) {
            obj = map.get("conversation_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Map<String, Object> map2 = this.LLILLJJLI;
        if (map2 != null && (obj7 = map2.get("message_id")) != null) {
            string = obj7.toString();
        } else {
            string = null;
        }
        Map<String, Object> map3 = this.LLILLJJLI;
        if (map3 != null && (obj6 = map3.get("reply_message_id")) != null) {
            string2 = obj6.toString();
        } else {
            string2 = null;
        }
        Map<String, Object> map4 = this.LLILLJJLI;
        if (map4 != null) {
            obj2 = map4.get("to_user_id");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        Map<String, Object> map5 = this.LLILLJJLI;
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
        Map<String, Object> map6 = this.LLILLJJLI;
        if (map6 != null) {
            obj4 = map6.get("chat_type");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof String) {
            str4 = (String) obj4;
        } else {
            str4 = null;
        }
        Map<String, Object> map7 = this.LLILLJJLI;
        if (map7 != null) {
            obj5 = map7.get("enter_from");
        } else {
            obj5 = null;
        }
        if (obj5 instanceof String) {
            str5 = (String) obj5;
        } else {
            str5 = null;
        }
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1499005ts(str5, str4, str3, string2, str2, str, null), 3);
        SourceSheetETParam sourceSheetETParam = new SourceSheetETParam(str5);
        String str6 = "";
        if (str == null) {
            str = "";
        }
        if (string != null) {
            str6 = string;
        }
        SourceSheetContext sourceSheetContext = new SourceSheetContext(str, str6, str5, str4, str3, string2, str2);
        List<SmartReplySourceItem> list = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (SmartReplySourceItem smartReplySourceItem : list) {
            arrayList.add(new SourceSheetItem(smartReplySourceItem.type, smartReplySourceItem.content, smartReplySourceItem.imageUrl, smartReplySourceItem.schema, smartReplySourceItem.createTime, smartReplySourceItem.commentId, smartReplySourceItem.itemId));
        }
        SourceSheetData sourceSheetData = new SourceSheetData(arrayList, sourceSheetETParam, sourceSheetContext);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            SourceSheetFragment sourceSheetFragment = new SourceSheetFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "im_source_sheet_panel_config", sourceSheetData);
            sourceSheetFragment.setArguments(bundle);
            c1390920mIc.LIZ.LLJJIJI = sourceSheetFragment;
            c1390920mIc.LJIIIIZZ(0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJI = numLIZJ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = false;
            tuxSheet.show(c19eg.getSupportFragmentManager(), (String) null);
        }
    }

    public C1839720xyU(List<SmartReplySourceItem> list, Map<String, ? extends Object> map) {
        Object obj;
        this.LL = list;
        this.LLILLJJLI = map;
        if (map != null) {
            obj = map.get("is_sender");
        } else {
            obj = null;
        }
        this.LLJILJIL = Intrinsics.LJFF(obj instanceof String ? obj : null, "true");
        this.LLJILJILJ = new AtomicBoolean(false);
        this.LLJILLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(343));
        this.LLJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1369));
        this.LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1367));
        this.LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1370));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1368));
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iLJII = LJII() + LJIIIIZZ() + ((int) LJIIIZ(paint).measureText(LIZ(), 0, LIZ().length())) + this.LLILZLL + LIZIZ() + ((Number) this.LLJJIJI.getValue()).intValue() + ((Number) this.LLJJI.getValue()).intValue();
        if (this.LLJILJILJ.compareAndSet(false, true)) {
            C054G c054g = C1499405tw.LIZ;
            C1499405tw.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "get_size", "smart-reply-sources");
        }
        return iLJII;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iLJFF;
        Integer numLIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Rect rect = new Rect();
        paint.getTextBounds(LIZ().toString(), 0, LIZ().length(), rect);
        int i6 = rect.top + i4;
        int i7 = this.LLIZ;
        RectF rectF = new RectF(LJII() + f, i6 - i7, f + LJII() + LJIIIIZZ() + ((int) LJIIIZ(paint).measureText(LIZ(), 0, LIZ().length())) + this.LLILZLL + LIZIZ() + ((Number) this.LLJJIJI.getValue()).intValue(), i4 + rect.bottom + i7);
        int color = paint.getColor();
        if (this.LLJILJIL && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, new ContextThemeWrapper(C21263918Jh.LIZ, R.style.z4))) != null) {
            iLJFF = numLIZJ.intValue();
        } else {
            iLJFF = C1383370m6R.LJFF(R.attr.a03);
        }
        paint.setColor(iLJFF);
        float fLIZIZ = C418440Gaw.LIZIZ(4);
        canvas.drawRoundRect(rectF, fLIZIZ, fLIZIZ, paint);
        paint.setColor(color);
        if (LJIIJ()) {
            Paint paintLJIIIZ = LJIIIZ(paint);
            paintLJIIIZ.getTextBounds(LIZ().toString(), 0, LIZ().length(), new Rect());
            float f2 = 2;
            canvas.drawText(LIZ().toString(), 0, LIZ().length(), f + LJII() + LJIIIIZZ() + LIZIZ(), (rectF.bottom - ((rectF.height() - r7.height()) / f2)) - f2, paintLJIIIZ);
        } else {
            Paint paintLJIIIZ2 = LJIIIZ(paint);
            paintLJIIIZ2.getTextBounds(LIZ().toString(), 0, LIZ().length(), new Rect());
            float f3 = 2;
            canvas.drawText(LIZ().toString(), 0, LIZ().length(), f + LJII() + LJIIIIZZ() + this.LLIZLLLIL, (rectF.bottom - ((rectF.height() - r6.height()) / f3)) - f3, paintLJIIIZ2);
        }
        canvas.save();
        if (LJIIJ()) {
            canvas.translate(f + LJII() + LJIIIIZZ() + this.LLIZLLLIL, (rectF.top + rectF.bottom) / 2.0f);
            TuxIconDrawable tuxIconDrawable = this.LLJI;
            if (tuxIconDrawable != null) {
                tuxIconDrawable.draw(canvas);
            }
        } else {
            canvas.translate(f + LJII() + LJIIIIZZ() + LJIIIZ(paint).measureText(LIZ().toString(), 0, LIZ().length()) + this.LLILZLL + this.LLIZLLLIL, (rectF.top + rectF.bottom) / 2.0f);
            TuxIconDrawable tuxIconDrawable2 = this.LLJI;
            if (tuxIconDrawable2 != null) {
                tuxIconDrawable2.draw(canvas);
            }
        }
        canvas.restore();
        C054G c054g = C1499405tw.LIZ;
        C1499405tw.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "draw", "smart-reply-sources");
    }
}
