package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice;
import com.ss.android.ugc.aweme.notification.aggregate.data.TemplateAggregateLeftUiInfo;
import com.ss.android.ugc.aweme.notification.aggregate.data.TemplateAggregateMiddleUiInfo;
import com.ss.android.ugc.aweme.notification.aggregate.data.TemplateAggregateUiInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840260xzM extends AbstractViewOnClickListenerC1840840y0I {
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TemplateAggregateMiddleUiInfo LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public TextPaint LLJ;
    public int LLJI;

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final boolean j0(View view) {
        return false;
    }

    public final TuxTextView getNotificationContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pdu);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getNotificationNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pel);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final int getLastMaxLines() {
        return this.LLJI;
    }

    public final int getLastMeasuredWidth() {
        return this.LLIZLLLIL;
    }

    public final TextPaint getLastPaint() {
        return this.LLJ;
    }

    public final String getLastText() {
        return this.LLIZ;
    }

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final String i0(View view) {
        TemplateAggregateMiddleUiInfo templateAggregateMiddleUiInfo = this.LLILZLL;
        if (templateAggregateMiddleUiInfo != null) {
            return templateAggregateMiddleUiInfo.schemeUrl;
        }
        return null;
    }

    public final void setLastMaxLines(int i) {
        this.LLJI = i;
    }

    public final void setLastMeasuredWidth(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setLastPaint(TextPaint textPaint) {
        this.LLJ = textPaint;
    }

    public final void setLastText(String str) {
        this.LLIZ = str;
    }

    public final void setNotificationContentFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setNotificationNameFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public C1840260xzM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.AbstractViewOnClickListenerC1840840y0I
    public final void h0(BulletinAggregateNotice bulletinAggregateNotice, C1840830y0H c1840830y0H) {
        TemplateAggregateMiddleUiInfo templateAggregateMiddleUiInfo;
        TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo;
        List<User> list;
        super.h0(bulletinAggregateNotice, c1840830y0H);
        TemplateAggregateUiInfo uiInfo = getUiInfo();
        if (uiInfo != null) {
            templateAggregateMiddleUiInfo = uiInfo.middleUiInfo;
        } else {
            templateAggregateMiddleUiInfo = null;
        }
        this.LLILZLL = templateAggregateMiddleUiInfo;
        if (templateAggregateMiddleUiInfo != null) {
            String str = templateAggregateMiddleUiInfo.title;
            if (str != null) {
                C12ES.LJIILL(0, getNotificationNameFromXml());
                getNotificationNameFromXml().setText(str);
                TemplateAggregateUiInfo uiInfo2 = getUiInfo();
                if (uiInfo2 != null && (templateAggregateLeftUiInfo = uiInfo2.leftUiInfo) != null && (list = templateAggregateLeftUiInfo.fromUsers) != null && list.size() == 1 && C1908030zkf.LJIIJ(getContext(), new UserVerify(null, ((User) ListProtector.get(list, 0)).getCustomVerify(), ((User) ListProtector.get(list, 0)).getEnterpriseVerifyReason(), -1), getNotificationNameFromXml())) {
                    getNotificationNameFromXml().setTag(" T");
                }
                getNotificationNameFromXml().setMaxLines(1);
            } else {
                C0DTR.LIZIZ(getNotificationNameFromXml());
            }
            String str2 = templateAggregateMiddleUiInfo.content;
            if (str2 != null) {
                C12ES.LJIILL(0, getNotificationContentFromXml());
                getNotificationContentFromXml().setText(str2);
                getNotificationContentFromXml().setMaxLines(5);
                return;
            }
            C0DTR.LIZIZ(getNotificationContentFromXml());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        if (getNotificationNameFromXml().getVisibility() != 0) {
            return;
        }
        TextPaint paint = getNotificationNameFromXml().getPaint();
        int measuredWidth = getNotificationNameFromXml().getMeasuredWidth();
        int maxLines = getNotificationNameFromXml().getMaxLines();
        String str2 = this.LLIZ;
        CharSequence text = getNotificationNameFromXml().getText();
        String string = null;
        if (text != null) {
            string = text.toString();
        }
        if (Intrinsics.LJFF(str2, string) && Intrinsics.LJFF(this.LLJ, paint) && this.LLIZLLLIL == measuredWidth && this.LLJI == maxLines) {
            return;
        }
        Object tag = getNotificationNameFromXml().getTag();
        if (!(tag instanceof String) || (str = (String) tag) == null) {
            str = "";
        }
        getNotificationNameFromXml().setText(C1907170zjH.LIZJ(new SpannableStringBuilder(getNotificationNameFromXml().getText()), paint, measuredWidth, maxLines, str.length(), (int) paint.measureText(str)));
        this.LLIZ = getNotificationNameFromXml().getText().toString();
        this.LLIZLLLIL = measuredWidth;
        this.LLJ = paint;
        this.LLJI = maxLines;
    }

    public C1840260xzM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a9r, this, true);
        this.LLIZ = "";
        this.LLIZLLLIL = -1;
        this.LLJ = new TextPaint();
        this.LLJI = 1;
    }
}
