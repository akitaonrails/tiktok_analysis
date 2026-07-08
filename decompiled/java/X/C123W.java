package X;

import Y.ARunnableS129S0100000_29;
import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.123W, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C123W extends C124T {
    public float LLLLJI;
    public float LLLLL;
    public final int LLLLLIL;
    public C123V LLLLLILLIL;
    public final FrameLayout LLLLLJIL;
    public final C416980GWq LLLLLJLJLL;
    public final C123X LLLLLL;
    public InnerEffectTextLayoutConfig LLLLLLIL;

    @Override // X.C124T
    public final void LJIIZILJ() {
    }

    @Override // X.C124T
    public int getTopMargin() {
        return 0;
    }

    @Override // X.C124T
    public void setData(TextStickerData textStickerData) {
    }

    @Override // X.C124T
    public final void LJ() {
        C387890FIt c387890FIt = this.LLJJJJ;
        if (((ArrayList) c387890FIt.LLILZ).size() <= 0 || !(((View) ListProtector.get(c387890FIt.LLILZ, 0)).getTag() instanceof String)) {
            C0FI2.LJIJJ().LJJJIL(c387890FIt.LLJ, "default");
        } else {
            C0FI2.LJIJJ().LJI = (String) ((View) ListProtector.get(c387890FIt.LLILZ, 0)).getTag();
        }
        c387890FIt.LLJI = "";
        c387890FIt.LLILZLL.scrollTo(0, 0);
        super.LJ();
    }

    @Override // X.C124T
    public final void LJIILJJIL() {
        if (this.LLLIL) {
            C21410318qb focusableEditText = this.LLLLLL.getFocusableEditText();
            if (focusableEditText != null) {
                KeyboardUtils.LIZ(getContext(), focusableEditText);
            }
        } else {
            KeyboardUtils.LIZ(getContext(), this.LLILLL);
        }
        this.LLLLLL.setEditable(false);
        C1360870lW9.LIZLLL(this.LLILLL, false);
    }

    @Override // X.C124T
    public final void LJJIII() {
        if (!this.LLLIL) {
            KeyboardUtils.LIZJ(getContext(), this.LLILLL);
        } else {
            C21410318qb focusableEditText = this.LLLLLL.getFocusableEditText();
            if (focusableEditText != null) {
                KeyboardUtils.LIZJ(getContext(), focusableEditText);
            }
        }
    }

    @Override // X.C124T
    public List<TextStickerTextWrap> getTextWrapList() {
        if (!this.LLLIL) {
            return C1697810uHb.LJ(C123P.LIZ(this.LLILLL, null));
        }
        C123X c123x = this.LLLLLL;
        ArrayList arrayList = new ArrayList();
        if (c123x == null) {
            return arrayList;
        }
        Iterator<C196949123v> it2 = c123x.getEditTextList().iterator();
        while (it2.hasNext()) {
            arrayList.add(C123P.LIZ(it2.next().LIZ, null));
        }
        return arrayList;
    }

    public final InnerEffectTextLayoutConfig getInnerLayoutConfig() {
        return this.LLLLLLIL;
    }

    public final C123V getScaleInfo() {
        return this.LLLLLILLIL;
    }

    @Override // X.C124T
    public void setEffectText(List<TextStickerTextWrap> list) {
        if ((list != null && !list.isEmpty()) || ((!true) && list != null)) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (TextStickerTextWrap textStickerTextWrap : list) {
                arrayList.add(new C123Z(textStickerTextWrap.getText(), textStickerTextWrap.getSelectionStart(), false, textStickerTextWrap.getHasFocus()));
            }
            this.LLLLLL.setText(arrayList);
            return;
        }
        this.LLLLLL.setText(C1697810uHb.LJ(new C123Z((String) null, 0, false, 15)));
    }

    public final void setInnerLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.LLLLLLIL = innerEffectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            this.LLLLLL.setInnerLayoutConfig(innerEffectTextLayoutConfig);
            this.LLLIL = true;
            C124Q c124q = this.LLILLL;
            int visibility = c124q.getVisibility();
            c124q.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c124q);
            C786410Ut5.LJZL(8, this.LLJJJJJIL);
            C786410Ut5.P1(this.LLLLLL, 0);
            return;
        }
        this.LLLIL = false;
        C124Q c124q2 = this.LLILLL;
        int visibility2 = c124q2.getVisibility();
        c124q2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c124q2);
        C786410Ut5.LJZL(0, this.LLJJJJJIL);
        C786410Ut5.P1(this.LLLLLL, 4);
    }

    public final void setScaleInfo(C123V c123v) {
        if (!Intrinsics.LJFF(this.LLLLLILLIL, c123v)) {
            this.LLLLLILLIL = c123v;
            if (!c123v.LIZ) {
                HandlerHook.viewPost(this, new ARunnableS129S0100000_29((Object) this, 29));
            }
        }
    }

    public C123W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.krx);
        this.LLLLLIL = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.LLLLLILLIL = new C123V(0);
        ScrollView scrollView = new ScrollView(context);
        C19ME c19me = new C19ME(-1, -1);
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(scrollView);
        scrollView.setLayoutParams(c19me);
        scrollView.setFillViewport(true);
        viewGroup.addView(scrollView);
        scrollView.setOnTouchListener(new ATListenerS461S0100000_29(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        scrollView.addView(frameLayout);
        this.LLLLLJIL = frameLayout;
        C416980GWq c416980GWq = new C416980GWq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c416980GWq);
        c416980GWq.setLayoutParams(layoutParams);
        frameLayout.addView(c416980GWq);
        this.LLLLLJLJLL = c416980GWq;
        C123X c123x = new C123X(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c123x);
        c123x.setLayoutParams(layoutParams2);
        C786410Ut5.P1(c123x, 4);
        c123x.setShowHint(true);
        c123x.setHintString(context.getString(2131844982));
        c123x.setMaxViewWidth(ScreenUtils.getScreenWidth(context));
        c416980GWq.addView(c123x);
        this.LLLLLL = c123x;
        this.LLILLL.addTextChangedListener(new C19773412Ya(this, 4));
        C786410Ut5.LJZL(8, this.LLJLL);
        View view = this.LLJJIJIL;
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(C960203pA.LIZ(R.attr.ee, context));
        }
        this.LLILLL.bringToFront();
        this.LLILLL.setHint(" ");
        ViewGroup.LayoutParams layoutParams3 = this.LLILLL.getLayoutParams();
        layoutParams3.width = -2;
        C124Q c124q = this.LLILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c124q);
        c124q.setLayoutParams(layoutParams3);
    }

    @Override // X.C124T
    public final void LJJII(List<TextStickerTextWrap> list, List<? extends InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, String str2, Integer num, boolean z2, boolean z3) {
        this.LLLLLL.setEditable(true);
        C1360870lW9.LIZLLL(this.LLILLL, true);
        super.LJJII(list, list2, i, i2, i3, str, z, i4, i5, str2, num, z2, z3);
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
            this.LLJILJIL = null;
        }
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
            this.LLILZ = null;
        }
    }
}
