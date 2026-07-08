package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12N8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12N8 extends LinearLayout {
    public int LL;
    public Function1<? super Integer, Unit> LLILLJJLI;
    public Function0<Unit> LLILLL;
    public VideoPublishEditModel LLILZ;

    private final String getEventTrackingAudienceFooterTypeFromPrivacy() {
        int i = this.LL;
        return i != 0 ? i != 2 ? "" : "friends" : "your_story";
    }

    public final void LIZ() {
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        CreativeModel creativeModel2;
        StoryShootModel storyShootModel2;
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        Function1<? super Integer, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.LL));
        }
        VideoPublishEditModel videoPublishEditModel = this.LLILZ;
        if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (storyShootModel2 = creativeModel2.storyModel) != null) {
            storyShootModel2.setClickAudienceFooter(true);
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLILZ;
        if (videoPublishEditModel2 != null && (creativeModel = videoPublishEditModel2.creativeModel) != null && (storyShootModel = creativeModel.storyModel) != null) {
            storyShootModel.setAudienceFooterClickWay("post_to_story_panel_click");
        }
        C12N5 c12n5 = C12N5.LIZ;
        VideoPublishEditModel videoPublishEditModel3 = this.LLILZ;
        String eventTrackingAudienceFooterTypeFromPrivacy = getEventTrackingAudienceFooterTypeFromPrivacy();
        c12n5.getClass();
        C12N5.LIZIZ(videoPublishEditModel3, "post_to_story", eventTrackingAudienceFooterTypeFromPrivacy);
    }

    public final void LIZIZ() {
        CreativeModel creativeModel;
        StoryShootModel storyShootModel;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel2;
        StoryShootModel storyShootModel2;
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        if (C20622315mn.LIZ()) {
            Function1<? super Integer, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(this.LL));
            }
        } else {
            C1618440sDa.LIZIZ.LJIIJJI().LIZIZ(getContext(), "", false, this.LLILZ, "story_edit_page_share_panel", false, new AwS573S0100000_29(this, 484));
        }
        if (C20622315mn.LIZ() && (videoPublishEditModel = this.LLILZ) != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (storyShootModel2 = creativeModel2.storyModel) != null) {
            storyShootModel2.setClickAudienceFooter(true);
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLILZ;
        if (videoPublishEditModel2 != null && (creativeModel = videoPublishEditModel2.creativeModel) != null && (storyShootModel = creativeModel.storyModel) != null) {
            storyShootModel.setAudienceFooterClickWay("share_panel_click");
        }
        C12N5 c12n5 = C12N5.LIZ;
        VideoPublishEditModel videoPublishEditModel3 = this.LLILZ;
        String eventTrackingAudienceFooterTypeFromPrivacy = getEventTrackingAudienceFooterTypeFromPrivacy();
        if (videoPublishEditModel3 == null) {
            c12n5.getClass();
            return;
        }
        c12n5.getClass();
        C0LAB c0labLIZ = C12N5.LIZ(videoPublishEditModel3);
        c0labLIZ.LJ("audience_footer_type", eventTrackingAudienceFooterTypeFromPrivacy);
        if (C298680BnG.LIZ()) {
            c0labLIZ.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
        }
        C2341909Fp.LIZ("story_edit_page_share_panel_click_share", c0labLIZ.LIZ);
    }

    public final void LIZJ() {
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        C1618440sDa.LIZIZ.LJIIJJI().LJFF(getContext());
        C12N5 c12n5 = C12N5.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILZ;
        String eventTrackingAudienceFooterTypeFromPrivacy = getEventTrackingAudienceFooterTypeFromPrivacy();
        c12n5.getClass();
        C12N5.LIZIZ(videoPublishEditModel, "skip", eventTrackingAudienceFooterTypeFromPrivacy);
    }

    public final VideoPublishEditModel getEditModel() {
        return this.LLILZ;
    }

    public final Function1<Integer, Unit> getPostToStoryOnClick() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getSheetDismissOnClick() {
        return this.LLILLL;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LLILZ = videoPublishEditModel;
    }

    public final void setPostToStoryOnClick(Function1<? super Integer, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public final void setSheetDismissOnClick(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public C12N8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = 1;
        setOrientation(0);
        if (((Boolean) C20622315mn.LIZLLL.getValue()).booleanValue()) {
            C197039127h c197039127h = new C197039127h(getContext(), null, 6, 0);
            c197039127h.setText(c197039127h.getContext().getString(2131848938));
            c197039127h.setButtonVariant(1);
            c197039127h.setButtonSize(3);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), 0);
            layoutParams.weight = 1.0f;
            C786410Ut5.J6(c197039127h, layoutParams);
            C786410Ut5.I7(new AkS95S0100000_29(this, 78), c197039127h);
            c197039127h.LJJJJLI(true);
            C197039127h c197039127h2 = new C197039127h(getContext(), null, 6, 0);
            c197039127h2.setText(c197039127h2.getContext().getString(2131848939));
            c197039127h2.setButtonVariant(0);
            c197039127h2.setButtonSize(3);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), 0);
            layoutParams2.weight = 1.0f;
            C786410Ut5.J6(c197039127h2, layoutParams2);
            C786410Ut5.I7(new AkS95S0100000_29(this, 79), c197039127h2);
            c197039127h2.LJJJJLI(true);
            addView(c197039127h);
            addView(c197039127h2);
            return;
        }
        if (!C20622315mn.LIZ()) {
            return;
        }
        C197039127h c197039127h3 = new C197039127h(getContext(), null, 6, 0);
        c197039127h3.setText(c197039127h3.getContext().getString(2131846769));
        c197039127h3.setButtonVariant(0);
        c197039127h3.setButtonSize(3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), 0);
        C786410Ut5.J6(c197039127h3, layoutParams3);
        C786410Ut5.I7(new AkS95S0100000_29(this, 77), c197039127h3);
        c197039127h3.LJJJJLI(true);
        addView(c197039127h3);
    }
}
