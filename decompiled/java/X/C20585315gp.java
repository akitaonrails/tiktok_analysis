package X;

import Y.ACListenerS133S0200000_31;
import android.content.Context;
import android.graphics.PointF;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.15gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20585315gp extends ClickableSpan {
    public final StoryNoteTextExtra LL;
    public final boolean LLILLJJLI;
    public final Context LLILLL;
    public final String LLILZ;
    public Float LLILZIL;
    public Float LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        float fFloatValue;
        float fFloatValue2;
        String str;
        List<String> urlList;
        List<String> urlList2;
        C2271391DvN.LIZ(view, (C1A5L) C2271381DvM.LLJLILLLLZIIL.getValue());
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (this.LLILLJJLI) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            Float f = this.LLILZIL;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = iArr[0];
            }
            Float f2 = this.LLILZLL;
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = iArr[1];
            }
            C20612915lH c20612915lH = C20612915lH.LIZIZ;
            Context context = view.getContext();
            PointF pointF = new PointF(fFloatValue, fFloatValue2);
            StoryNoteTextExtra storyNoteTextExtra = this.LL;
            String str2 = storyNoteTextExtra.nickname;
            UrlModel urlModel = storyNoteTextExtra.avatar;
            if (urlModel != null && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
                UrlModel urlModel2 = this.LL.avatar;
                if (urlModel2 == null || (urlList2 = urlModel2.getUrlList()) == null || (str = (String) ListProtector.get(urlList2, 0)) == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                str = "";
            }
            c20612915lH.LJ(context, pointF, str2, str, new ACListenerS133S0200000_31(this, view, 0)).show();
            C438350HGv.LIZIZ("at_prop_click", this.LLILZ, this.LLIZLLLIL, this.LLJ);
            return;
        }
        LIZ(this, view, "half_screen_at");
        String str3 = this.LLIZ;
        String str4 = this.LLILZ;
        String str5 = this.LLIZLLLIL;
        String str6 = this.LLJ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("author_id", str3);
        c0lab.LJ("enter_from", str4);
        c0lab.LJ("group_id", str5);
        c0lab.LJ("to_user_id", str6);
        C20684815ws.LJIILLIIL("ttsocial_thought_bubble_mention_click", c0lab.LIZ);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1o, this.LLILLL);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void LIZ(C20585315gp c20585315gp, View view, String str) {
        String str2 = c20585315gp.LLILZ;
        String str3 = c20585315gp.LLJ;
        String str4 = c20585315gp.LLIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_method", str);
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("to_user_id", str3);
        c0lab.LJ("author_id", str4);
        c0lab.LJ("is_note", "1");
        C20684815ws.LJIILLIIL("enter_personal_detail", c0lab.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//user/profile");
        smartRouteBuildRoute.withParam("uid", c20585315gp.LL.userId);
        smartRouteBuildRoute.withParam("sec_user_id", c20585315gp.LL.secUid);
        smartRouteBuildRoute.withParam("enter_method", str);
        smartRouteBuildRoute.withParam("enter_from", c20585315gp.LLILZ);
        smartRouteBuildRoute.open();
    }

    public C20585315gp(StoryNoteTextExtra storyNoteTextExtra, boolean z, Context context, StoryNoteDataCollection storyNoteDataCollection, String str) {
        String str2;
        String str3;
        this.LL = storyNoteTextExtra;
        this.LLILLJJLI = z;
        this.LLILLL = context;
        this.LLILZ = str;
        String str4 = "";
        this.LLIZ = (storyNoteDataCollection == null || (str3 = storyNoteDataCollection.uid) == null) ? "" : str3;
        if (storyNoteDataCollection != null && (str2 = storyNoteDataCollection.aid) != null) {
            str4 = str2;
        }
        this.LLIZLLLIL = str4;
        this.LLJ = storyNoteTextExtra.userId;
    }
}
