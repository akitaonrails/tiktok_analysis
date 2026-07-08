package X;

import Y.ACListenerS89S1100000_28;
import Y.ATListenerS460S0100000_28;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AdHelperNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BusinessAccountNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.PromoteNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.TcmNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907430zjh extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;

    private final TuxTextView getBottomText() {
        return (TuxTextView) this.LL.getValue();
    }

    private final String getDefaultSeeMore() {
        return (String) this.LLILLL.getValue();
    }

    private final TuxTextView getSourceTag() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final void LIZJ() {
        TuxTextView bottomText = getBottomText();
        if (bottomText != null) {
            C337180DJs.LIZ(bottomText);
        }
        TuxTextView sourceTag = getSourceTag();
        if (sourceTag != null) {
            C337180DJs.LIZ(sourceTag);
        }
        this.LLILZ = false;
        C786410Ut5.fa(this, null);
        setOnTouchListener(null);
    }

    public final boolean getHasAction() {
        return this.LLILZ;
    }

    public C1907430zjh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        LinearLayout.inflate(context, R.layout.abo, this);
        this.LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 684));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 686));
        this.LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(context, 685));
    }

    public final void LIZ(C1246520iXi c1246520iXi, C1907450zjj c1907450zjj) {
        String defaultSeeMore;
        String str;
        List<NoticeUITemplateButton> list;
        NoticeUITemplateButton next;
        this.LLILZ = false;
        MusNotice musNotice = c1246520iXi.LL;
        GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
        if (generalTemplateNotice == null) {
            UserTextNotice userTextNotice = musNotice.textNotice;
            if (userTextNotice != null) {
                LIZIZ(c1907450zjj, userTextNotice.getSchemaUrl(), getDefaultSeeMore());
                return;
            }
            AnnouncementNotice announcementNotice = musNotice.announcement;
            if (announcementNotice != null) {
                LIZIZ(c1907450zjj, announcementNotice.getSchemaUrl(), getDefaultSeeMore());
            }
            AdHelperNotice adHelperNotice = musNotice.adHelperNotice;
            if (adHelperNotice != null) {
                LIZIZ(c1907450zjj, adHelperNotice.schemaUrl, getDefaultSeeMore());
            }
            BusinessAccountNotice businessAccountNotice = musNotice.businessAccountNotice;
            if (businessAccountNotice != null) {
                LIZIZ(c1907450zjj, businessAccountNotice.schemaUrl, getDefaultSeeMore());
            }
            TcmNotice tcmNotice = musNotice.tcmNotice;
            if (tcmNotice != null) {
                LIZIZ(c1907450zjj, tcmNotice.schemaUrl, getDefaultSeeMore());
            }
            PromoteNotice promoteNotice = musNotice.promoteNotice;
            if (promoteNotice == null) {
                return;
            }
            LIZIZ(c1907450zjj, promoteNotice.schemaUrl, getDefaultSeeMore());
            return;
        }
        String str2 = generalTemplateNotice.schemaUrl;
        NoticeUITemplate noticeUITemplate = generalTemplateNotice.uiTemplate;
        if (noticeUITemplate == null || (defaultSeeMore = noticeUITemplate.buttonContent) == null) {
            defaultSeeMore = getDefaultSeeMore();
        }
        NoticeUITemplate noticeUITemplate2 = generalTemplateNotice.uiTemplate;
        if (noticeUITemplate2 != null && (list = noticeUITemplate2.bottomButtons) != null) {
            Iterator<NoticeUITemplateButton> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str3 = next.schemaUrl;
                    if (str3 != null && str3.length() != 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NoticeUITemplateButton noticeUITemplateButton = next;
            if (noticeUITemplateButton != null) {
                str2 = noticeUITemplateButton.schemaUrl;
                String str4 = noticeUITemplateButton.content;
                if (str4 != null && str4.length() > 0) {
                    defaultSeeMore = str4;
                }
            }
        }
        Pair pair = new Pair(str2, defaultSeeMore);
        LIZIZ(c1907450zjj, (String) pair.getFirst(), (String) pair.getSecond());
        NoticeUITemplate noticeUITemplate3 = generalTemplateNotice.uiTemplate;
        if (noticeUITemplate3 != null && (str = noticeUITemplate3.sourceTag) != null && str.length() != 0) {
            TuxTextView sourceTag = getSourceTag();
            if (sourceTag != null) {
                C337180DJs.LIZJ(sourceTag);
            }
            TuxTextView sourceTag2 = getSourceTag();
            if (sourceTag2 != null) {
                sourceTag2.setText(str);
                return;
            }
            return;
        }
        TuxTextView sourceTag3 = getSourceTag();
        if (sourceTag3 == null) {
            return;
        }
        C337180DJs.LIZ(sourceTag3);
    }

    public final void LIZIZ(C1907450zjj c1907450zjj, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return;
        }
        this.LLILZ = true;
        TuxTextView bottomText = getBottomText();
        if (bottomText != null) {
            C786410Ut5.LLLLZLL(bottomText, 0);
        }
        TuxTextView bottomText2 = getBottomText();
        if (bottomText2 != null) {
            bottomText2.setText(str2);
        }
        C786410Ut5.fa(this, new ACListenerS89S1100000_28(c1907450zjj, str, 4));
        setOnTouchListener(new ATListenerS460S0100000_28(this, 3));
    }
}
