package X;

import Y.ATListenerS443S0100000_9;
import android.content.Context;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkbenchMiddleBannerCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkbenchMiddleBannerMoreCell;
import com.ss.android.ugc.aweme.inbox.workbench.view.card.MiddleContentCell;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BannerImageStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ContentTitleExtra;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionLineTextStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionMiddleStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionUIStruct;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0P0K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P0K extends AbstractViewOnClickListenerC635100Ovc {
    public ViewOnAttachStateChangeListenerC20604515jv LLILZIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZLL;
    public TuxTextView LLIZ;
    public LinearLayout LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public C419890GdH LLJILJIL;
    public String LLJILJILJ;
    public int LLJILLL;
    public TextPaint LLJJ;
    public int LLJJI;

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public String getClickEnterMethod() {
        return "content";
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getWorkbenchCardMiddleBannerListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_middle_banner_list);
            this.LLILZLL = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getWorkbenchCardMiddleContentListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_middle_content_list);
            this.LLILZIL = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
    }

    public final TuxIconView getWorkbenchCardMiddleIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_middle_icon);
            this.LLJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getWorkbenchCardMiddleSubtitleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_middle_subtitle_container);
            this.LLIZLLLIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getWorkbenchCardMiddleSubtitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_middle_subtitle);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getWorkbenchCardMiddleSubtitleIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_middle_subtitle_icon);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getWorkbenchCardMiddleTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.workbench_card_middle_title);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public String getSchemaUrl() {
        MissionUIStruct missionUIStruct;
        MissionMiddleStruct missionMiddleStruct;
        MissionStruct mission = getMission();
        if (mission == null || (missionUIStruct = mission.uiStruct) == null || (missionMiddleStruct = missionUIStruct.middle) == null) {
            return null;
        }
        return missionMiddleStruct.schemaUrl;
    }

    public final int getLastMaxLines() {
        return this.LLJJI;
    }

    public final int getLastMeasuredWidth() {
        return this.LLJILLL;
    }

    public final TextPaint getLastPaint() {
        return this.LLJJ;
    }

    public final String getLastText() {
        return this.LLJILJILJ;
    }

    public final void setLastMaxLines(int i) {
        this.LLJJI = i;
    }

    public final void setLastMeasuredWidth(int i) {
        this.LLJILLL = i;
    }

    public final void setLastPaint(TextPaint textPaint) {
        this.LLJJ = textPaint;
    }

    public final void setLastText(String str) {
        this.LLJILJILJ = str;
    }

    public final void setWorkbenchCardMiddleBannerListFromXml(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LLILZLL = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void setWorkbenchCardMiddleContentListFromXml(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LLILZIL = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void setWorkbenchCardMiddleIconFromXml(TuxIconView tuxIconView) {
        this.LLJ = tuxIconView;
    }

    public final void setWorkbenchCardMiddleSubtitleContainerFromXml(LinearLayout linearLayout) {
        this.LLIZLLLIL = linearLayout;
    }

    public final void setWorkbenchCardMiddleSubtitleFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setWorkbenchCardMiddleSubtitleIconFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setWorkbenchCardMiddleTitleFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public C0P0K(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        int iOffsetByCodePoints;
        super.onMeasure(i, i2);
        if (getWorkbenchCardMiddleTitleFromXml().getVisibility() != 0) {
            return;
        }
        TextPaint paint = getWorkbenchCardMiddleTitleFromXml().getPaint();
        int measuredWidth = getWorkbenchCardMiddleTitleFromXml().getMeasuredWidth();
        int maxLines = getWorkbenchCardMiddleTitleFromXml().getMaxLines();
        String str2 = this.LLJILJILJ;
        CharSequence text = getWorkbenchCardMiddleTitleFromXml().getText();
        String string = null;
        if (text != null) {
            string = text.toString();
        }
        if (Intrinsics.LJFF(str2, string) && Intrinsics.LJFF(this.LLJJ, paint) && this.LLJILLL == measuredWidth && this.LLJJI == maxLines) {
            return;
        }
        Object tag = getWorkbenchCardMiddleTitleFromXml().getTag();
        if (!(tag instanceof String) || (str = (String) tag) == null) {
            str = "";
        }
        CharSequence text2 = getWorkbenchCardMiddleTitleFromXml().getText();
        TuxTextView workbenchCardMiddleTitleFromXml = getWorkbenchCardMiddleTitleFromXml();
        int length = str.length();
        int iMeasureText = (int) paint.measureText(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text2);
        if (measuredWidth >= 0) {
            DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, paint, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (dynamicLayout.getLineCount() > maxLines) {
                float fMeasureText = measuredWidth - (paint.measureText("...") + iMeasureText);
                int lineStart = dynamicLayout.getLineStart(maxLines - 1);
                String string2 = spannableStringBuilder.toString();
                while (lineStart < spannableStringBuilder.length() - length && '\n' != spannableStringBuilder.charAt(lineStart) && (iOffsetByCodePoints = string2.offsetByCodePoints(lineStart, 1)) <= spannableStringBuilder.length()) {
                    fMeasureText -= paint.measureText(spannableStringBuilder, lineStart, iOffsetByCodePoints);
                    if (fMeasureText <= 0.0f) {
                        break;
                    } else {
                        lineStart = iOffsetByCodePoints;
                    }
                }
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(spannableStringBuilder.length() - length, spannableStringBuilder.length());
                if (lineStart - charSequenceSubSequence.length() > 0) {
                    lineStart -= charSequenceSubSequence.length();
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, lineStart));
                spannableStringBuilder2.append((CharSequence) "...");
                spannableStringBuilder2.append(charSequenceSubSequence);
                C419890GdH c419890GdH = this.LLJILJIL;
                if (c419890GdH != null) {
                    C786410Ut5.q2(spannableStringBuilder2, c419890GdH, (spannableStringBuilder2.length() - length) + 1, spannableStringBuilder2.length(), 17);
                }
                spannableStringBuilder = spannableStringBuilder2;
            }
        }
        workbenchCardMiddleTitleFromXml.setText(spannableStringBuilder);
        this.LLJILJILJ = getWorkbenchCardMiddleTitleFromXml().getText().toString();
        this.LLJILLL = measuredWidth;
        this.LLJJ = paint;
        this.LLJJI = maxLines;
    }

    public C0P0K(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aa2, this, true);
        C0OSB.LIZLLL(this, 0, 0, 0, 0);
        ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleContentListFromXml = getWorkbenchCardMiddleContentListFromXml();
        if (workbenchCardMiddleContentListFromXml != null) {
            workbenchCardMiddleContentListFromXml.setOnTouchListener(new ATListenerS443S0100000_9(this, 2));
        }
        ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleContentListFromXml2 = getWorkbenchCardMiddleContentListFromXml();
        if (workbenchCardMiddleContentListFromXml2 != null) {
            workbenchCardMiddleContentListFromXml2.getState().LIZLLL = C0Q4Y.BUFFER;
            workbenchCardMiddleContentListFromXml2.LJIILJJIL(MiddleContentCell.class);
            workbenchCardMiddleContentListFromXml2.setItemAnimator(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleBannerListFromXml = getWorkbenchCardMiddleBannerListFromXml();
        if (workbenchCardMiddleBannerListFromXml != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            workbenchCardMiddleBannerListFromXml.setLayoutManager(linearLayoutManager);
            workbenchCardMiddleBannerListFromXml.addItemDecoration(new C346270Dhp(3));
            workbenchCardMiddleBannerListFromXml.getState().LIZLLL = C0Q4Y.BUFFER;
            workbenchCardMiddleBannerListFromXml.LJIILJJIL(WorkbenchMiddleBannerCell.class, WorkbenchMiddleBannerMoreCell.class);
            workbenchCardMiddleBannerListFromXml.setItemAnimator(null);
        }
        this.LLJILJILJ = "";
        this.LLJILLL = -1;
        this.LLJJ = new TextPaint();
        this.LLJJI = 2;
    }

    @Override // X.AbstractViewOnClickListenerC635100Ovc
    public final void e0(MissionStruct missionStruct, WorkBenchViewModel workBenchViewModel, WorkbenchCardAbility workbenchCardAbility) {
        MissionMiddleStruct missionMiddleStruct;
        int iIntValue;
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        int i;
        C20600815jK<InterfaceC1891350zJl> state3;
        MissionTextStruct missionTextStruct;
        String str;
        MissionTextStruct missionTextStruct2;
        String str2;
        ImageUrlModel imageUrlModelLIZIZ;
        TuxImageModel tuxImageModel;
        C419890GdH c419890GdHLJIIIIZZ;
        super.e0(missionStruct, workBenchViewModel, workbenchCardAbility);
        MissionUIStruct missionUIStruct = missionStruct.uiStruct;
        if (missionUIStruct != null && (missionMiddleStruct = missionUIStruct.middle) != null) {
            ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleBannerListFromXml = getWorkbenchCardMiddleBannerListFromXml();
            if (workbenchCardMiddleBannerListFromXml != null) {
                workbenchCardMiddleBannerListFromXml.setTag(R.id.rnd, workbenchCardAbility.LLIIJLIL());
            }
            MissionTextStruct missionTextStruct3 = missionMiddleStruct.contentTitle;
            TuxImageModel tuxImageModel2 = missionMiddleStruct.contentTitleIcon;
            this.LLJILJIL = null;
            getWorkbenchCardMiddleTitleFromXml().setTag(null);
            getWorkbenchCardMiddleTitleFromXml().LLJJ = true;
            C635240Ovq.LIZ(getWorkbenchCardMiddleTitleFromXml(), missionTextStruct3);
            if (tuxImageModel2 != null && (c419890GdHLJIIIIZZ = C0OSB.LJIIIIZZ(tuxImageModel2, getContext())) != null) {
                this.LLJILJIL = c419890GdHLJIIIIZZ;
                getWorkbenchCardMiddleTitleFromXml().setTag(" T");
                TuxTextView workbenchCardMiddleTitleFromXml = getWorkbenchCardMiddleTitleFromXml();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(workbenchCardMiddleTitleFromXml.getText());
                try {
                    spannableStringBuilder.append((CharSequence) " T");
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLJIIIIZZ, (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
                    workbenchCardMiddleTitleFromXml.setText(spannableStringBuilder);
                } catch (IndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            ContentTitleExtra contentTitleExtra = missionMiddleStruct.contentTitleExtra;
            if (contentTitleExtra == null || (contentTitleExtra.text == null && ((tuxImageModel = contentTitleExtra.iconUrl) == null || C0OSD.LIZIZ(getContext(), tuxImageModel) == null))) {
                LinearLayout workbenchCardMiddleSubtitleContainerFromXml = getWorkbenchCardMiddleSubtitleContainerFromXml();
                if (workbenchCardMiddleSubtitleContainerFromXml != null) {
                    C0DTR.LIZIZ(workbenchCardMiddleSubtitleContainerFromXml);
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getWorkbenchCardMiddleIconFromXml().getLayoutParams();
                layoutParams.gravity = 16;
                layoutParams.topMargin = 0;
                C786410Ut5.M6(getWorkbenchCardMiddleIconFromXml(), layoutParams);
            } else {
                LinearLayout workbenchCardMiddleSubtitleContainerFromXml2 = getWorkbenchCardMiddleSubtitleContainerFromXml();
                if (workbenchCardMiddleSubtitleContainerFromXml2 != null) {
                    C12ES.LJIILL(0, workbenchCardMiddleSubtitleContainerFromXml2);
                }
                C635240Ovq.LIZ(getWorkbenchCardMiddleSubtitleFromXml(), contentTitleExtra.text);
                TuxIconView workbenchCardMiddleSubtitleIconFromXml = getWorkbenchCardMiddleSubtitleIconFromXml();
                TuxImageModel tuxImageModel3 = contentTitleExtra.iconUrl;
                if (tuxImageModel3 != null) {
                    imageUrlModelLIZIZ = C0OSD.LIZIZ(getContext(), tuxImageModel3);
                } else {
                    imageUrlModelLIZIZ = null;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZIZ);
                c1331670kl3LJIIIIZZ.LJJI(workbenchCardMiddleSubtitleIconFromXml);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getWorkbenchCardMiddleIconFromXml().getLayoutParams();
                layoutParams2.gravity = 48;
                layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                C786410Ut5.M6(getWorkbenchCardMiddleIconFromXml(), layoutParams2);
            }
            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(missionMiddleStruct.rightImageModel));
            c1331670kl3LJIIIIZZ2.LJJI(getWorkbenchCardMiddleIconFromXml());
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = false;
            c1331750klB.LJ = C418440Gaw.LIZIZ(Double.valueOf(4.0d));
            c1331750klB.LIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c1331750klB.LIZJ = iIntValue;
            c1331670kl3LJIIIIZZ2.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIIZZ2.LJIIJ(new C0P43(this, 2));
            List<MissionLineTextStruct> list = missionMiddleStruct.contents;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (MissionLineTextStruct missionLineTextStruct : list) {
                    if (missionLineTextStruct != null && (missionTextStruct = missionLineTextStruct.leftText) != null && (str = missionTextStruct.text) != null && (!a0.LJJJIL(str)) && (missionTextStruct2 = missionLineTextStruct.rightText) != null && (str2 = missionTextStruct2.text) != null && (!a0.LJJJIL(str2))) {
                        arrayList.add(new C0P0L(missionLineTextStruct));
                    }
                }
            }
            ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleContentListFromXml = getWorkbenchCardMiddleContentListFromXml();
            if (workbenchCardMiddleContentListFromXml != null && (state3 = workbenchCardMiddleContentListFromXml.getState()) != null) {
                state3.LJIILL(arrayList, null);
            }
            ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleContentListFromXml2 = getWorkbenchCardMiddleContentListFromXml();
            if (workbenchCardMiddleContentListFromXml2 != null) {
                if (arrayList.isEmpty()) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LLF(i, workbenchCardMiddleContentListFromXml2);
            }
            List<BannerImageStruct> list2 = missionMiddleStruct.bannerImages;
            long j = missionMiddleStruct.totalBannerImage;
            ArrayList arrayList2 = new ArrayList();
            if (list2 != null) {
                for (BannerImageStruct bannerImageStruct : list2) {
                    if (bannerImageStruct != null) {
                        arrayList2.add(new C1876807Ws(bannerImageStruct));
                    }
                }
            }
            if ((!arrayList2.isEmpty()) && j > 0) {
                long size = j - ((long) arrayList2.size());
                if (size > 0) {
                    String schemaUrl = getSchemaUrl();
                    if (schemaUrl == null) {
                        schemaUrl = "";
                    }
                    arrayList2.add(new C053000Hg(size, schemaUrl));
                }
                ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleBannerListFromXml2 = getWorkbenchCardMiddleBannerListFromXml();
                if (workbenchCardMiddleBannerListFromXml2 != null && (state2 = workbenchCardMiddleBannerListFromXml2.getState()) != null) {
                    state2.LJIILL(arrayList2, null);
                }
                ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleBannerListFromXml3 = getWorkbenchCardMiddleBannerListFromXml();
                if (workbenchCardMiddleBannerListFromXml3 != null) {
                    C12ES.LJIILL(0, workbenchCardMiddleBannerListFromXml3);
                    return;
                }
                return;
            }
            ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleBannerListFromXml4 = getWorkbenchCardMiddleBannerListFromXml();
            if (workbenchCardMiddleBannerListFromXml4 != null && (state = workbenchCardMiddleBannerListFromXml4.getState()) != null) {
                state.LJIILL(new ArrayList(), null);
            }
            ViewOnAttachStateChangeListenerC20604515jv workbenchCardMiddleBannerListFromXml5 = getWorkbenchCardMiddleBannerListFromXml();
            if (workbenchCardMiddleBannerListFromXml5 != null) {
                C0DTR.LIZIZ(workbenchCardMiddleBannerListFromXml5);
            }
        }
    }
}
