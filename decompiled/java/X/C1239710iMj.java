package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPageImpl;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239710iMj extends FrameLayout implements C15N2 {
    public TuxTextView LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public final TuxTextView getBrandedContentTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cjo);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.C15N2
    public int getChangeOrGetVisibility() {
        return getVisibility();
    }

    @Override // X.C15N2
    public View getProvideRootView() {
        return getRootView();
    }

    public boolean getMusicUsageOrigin() {
        return this.LLILLL;
    }

    @Override // X.C15N2
    public void setBrandedContent(boolean z) {
        String str;
        String string;
        SpannableString spannableString;
        String string2;
        if (getBrandedContentTvFromXml() == null) {
            return;
        }
        C786410Ut5.LLLLZLL(getBrandedContentTvFromXml(), 0);
        String string3 = getContext().getResources().getString(2131844953);
        String string4 = getContext().getResources().getString(2131827281);
        C1403010mc7.LIZ.getCommerceService().getClass();
        BrandedContentToolSchema brandedContentToolSchemaLIZ = C1209830haX.LIZ();
        if (brandedContentToolSchemaLIZ == null || (str = brandedContentToolSchemaLIZ.brandedContentPolicy) == null) {
            str = "https://www.tiktok.com/falcon/forest/nebula/content_tool?hide_nav_bar=1";
        }
        if (this.LLILLJJLI) {
            if (z) {
                string2 = getContext().getResources().getString(2131827274, string4);
            } else {
                string2 = getContext().getResources().getString(2131825283, string4);
            }
            if (!PublishPageImpl.LIZLLL().LIZ()) {
                spannableString = new SpannableString(string2);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string2);
                sbLIZ.append(' ');
                sbLIZ.append(string3);
                spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            }
            int iLJJJ = a0.LJJJ(string2, string4, 0, false, 6);
            int length = string4.length() + iLJJJ;
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, new C346220Dhk(this, str, 1), iLJJJ, length, 33);
        } else {
            String string5 = getContext().getResources().getString(2131827280);
            if (z) {
                string = getContext().getResources().getString(2131827275, string4, string5);
            } else {
                string = getContext().getResources().getString(2131825284, string4, string5);
            }
            if (!PublishPageImpl.LIZLLL().LIZ()) {
                spannableString = new SpannableString(string);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(string);
                sbLIZ2.append(' ');
                sbLIZ2.append(string3);
                spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
            }
            int iLJJJ2 = a0.LJJJ(string, string4, 0, false, 6);
            int length2 = string4.length() + iLJJJ2;
            int iLJJJ3 = a0.LJJJ(string, string5, 0, false, 6);
            int length3 = string5.length() + iLJJJ3;
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ2, length2, 33);
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ3, length3, 33);
            C786410Ut5.p2(spannableString, new C346220Dhk(this, str, 2), iLJJJ2, length2, 33);
            C786410Ut5.p2(spannableString, new C346220Dhk(this, str, 3), iLJJJ3, length3, 33);
        }
        if (PublishPageImpl.LIZLLL().LIZ()) {
            getBrandedContentTvFromXml().setTuxFont(81);
            getBrandedContentTvFromXml().setLineSpacing(0.0f, 1.0f);
        }
        getBrandedContentTvFromXml().setMovementMethod(new LinkMovementMethod());
        getBrandedContentTvFromXml().setText(spannableString);
    }

    public final void setBrandedContentTvFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    @Override // X.C15N2
    public void setChangeOrGetVisibility(int i) {
        setVisibility(i);
    }

    @Override // X.C15N2
    public void setCommerceMusic(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // X.C15N2
    public void setMusicUsageOrigin(boolean z) {
        this.LLILLL = z;
    }

    public C1239710iMj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aby, this, true);
    }
}
