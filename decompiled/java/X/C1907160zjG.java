package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.ExtraActionTemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.LabelInfoTemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TextLinkConfig;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import mf.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907160zjG extends AbstractViewOnClickListenerC1907000zj0 {
    public static final /* synthetic */ int LLJLLIL = 0;
    public TuxTextView LLIZ;
    public C0QB7 LLIZLLLIL;
    public C424600Gks LLJ;
    public LinearLayout LLJI;
    public C424600Gks LLJIJIL;
    public C0DWH LLJILJIL;
    public RelationLabelTextView LLJILJILJ;
    public LinearLayout LLJILLL;
    public TuxTextView LLJJ;
    public LinearLayout LLJJI;
    public TuxTextView LLJJIII;
    public final View LLJJIJI;
    public final TuxTextView LLJJIJIIJIL;
    public final C1908730zln LLJJIJIL;
    public InterfaceC1907020zj2 LLJJJ;
    public boolean LLJJJIL;
    public User LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public int LLJLIL;
    public TextPaint LLJLILLLLZIIL;
    public int LLJLL;

    private final View.OnClickListener getMMoreClickListener() {
        return (View.OnClickListener) this.LLJJJJLIIL.getValue();
    }

    public final LinearLayout getMiddleBottomBtnContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.obv);
            this.LLJJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C0QB7 getMutualRelationViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oyo);
            this.LLIZLLLIL = (C0QB7) callbackFindViewById;
        }
        return (C0QB7) callbackFindViewById;
    }

    public final Integer getNormalTextColor() {
        return (Integer) this.LLJJL.getValue();
    }

    public final TuxTextView getNotificationAllContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pdj);
            this.LLJJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getNotificationContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pdu);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C424600Gks getNotificationCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pdw);
            this.LLJ = (C424600Gks) callbackFindViewById;
        }
        return (C424600Gks) callbackFindViewById;
    }

    public final C424600Gks getNotificationIconImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pe9);
            this.LLJIJIL = (C424600Gks) callbackFindViewById;
        }
        return (C424600Gks) callbackFindViewById;
    }

    public final C0DWH getNotificationMiddleImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.peg);
            this.LLJILJIL = (C0DWH) callbackFindViewById;
        }
        return (C0DWH) callbackFindViewById;
    }

    public final LinearLayout getNotificationReplyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pet);
            this.LLJI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getNotificationReplyContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.peu);
            this.LLJJIII = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final Integer getPressedTextColor() {
        return (Integer) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final LinearLayout getQuickCommentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sme);
            this.LLJILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final RelationLabelTextView getRelationLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t4q);
            this.LLJILJILJ = (RelationLabelTextView) callbackFindViewById;
        }
        return (RelationLabelTextView) callbackFindViewById;
    }

    public final float LJIILIIL() {
        float f;
        GeneralTemplateNotice templateNotice;
        NoticeUITemplate noticeUITemplate;
        NoticeUITemplate noticeUITemplate2;
        Integer numValueOf;
        InterfaceC1907020zj2 mBridge = getMBridge();
        float f2 = 0.0f;
        if (C1906760zic.LIZ(mBridge != null ? mBridge.getScenario() : null)) {
            f = -8.0f;
        } else {
            InterfaceC1907020zj2 mBridge2 = getMBridge();
            f = (!C1906760zic.LIZ(mBridge2 != null ? mBridge2.getScenario() : null) || (templateNotice = getTemplateNotice()) == null || (noticeUITemplate = templateNotice.uiTemplate) == null || noticeUITemplate.rightType != 11) ? 0.0f : -16.0f;
        }
        GeneralTemplateNotice templateNotice2 = getTemplateNotice();
        if (templateNotice2 != null && (noticeUITemplate2 = templateNotice2.uiTemplate) != null && (numValueOf = Integer.valueOf(noticeUITemplate2.rightType)) != null) {
            if (numValueOf.intValue() == 10) {
                f2 = 116.0f;
            } else if (numValueOf.intValue() == 11) {
                f2 = 84.0f;
            } else if (numValueOf.intValue() == 12 || numValueOf.intValue() == 13) {
                f2 = 48.0f;
            }
        }
        return f + 85.0f + f2;
    }

    public final boolean LJIILJJIL() {
        InterfaceC1907020zj2 mBridge = getMBridge();
        EnumC1906270zhp scenario = mBridge != null ? mBridge.getScenario() : null;
        if (scenario != EnumC1906270zhp.NEW_ACTIVITY && scenario != EnumC1906270zhp.AGGREGATE_PAGE) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return !C426750GoL.LIZLLL(C844470XAv.LIZ()) && ((Number) C1906760zic.LIZ.getValue()).intValue() >= 2;
    }

    public final int getLastMaxLines() {
        return this.LLJLL;
    }

    public final int getLastMeasuredWidth() {
        return this.LLJLIL;
    }

    public final TextPaint getLastPaint() {
        return this.LLJLILLLLZIIL;
    }

    public final String getLastText() {
        return this.LLJL;
    }

    public final C1908730zln getNotificationNameAppendFollowOrInfo() {
        return this.LLJJIJIL;
    }

    public final TuxTextView getNotification_name() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public EnumC1907390zjd getTemplatePosition() {
        return EnumC1907390zjd.Middle;
    }

    public final View getTitle_container() {
        return this.LLJJIJI;
    }

    private final void setNewAppendFollow(List<? extends User> list) {
        User user;
        boolean z;
        C1905040zfq c1905040zfq;
        if (list != null && (user = (User) C13LP.LJJJLL(list)) != null) {
            C1905050zfr viewHolderConfig = getViewHolderConfig();
            boolean z2 = false;
            if (viewHolderConfig != null && viewHolderConfig.LJ) {
                z = true;
            } else {
                z = false;
            }
            String str = null;
            if (z) {
                C1906910zir c1906910zir = C1906910zir.LIZ;
                C1908730zln c1908730zln = this.LLJJIJIL;
                GeneralTemplateNotice templateNotice = getTemplateNotice();
                if (templateNotice != null) {
                    str = templateNotice.messageExtra;
                }
                c1906910zir.LIZIZ(c1908730zln, "", list, true, str);
            } else {
                C1906910zir c1906910zir2 = C1906910zir.LIZ;
                C1908730zln c1908730zln2 = this.LLJJIJIL;
                GeneralTemplateNotice templateNotice2 = getTemplateNotice();
                if (templateNotice2 != null) {
                    str = templateNotice2.messageExtra;
                }
                c1906910zir2.LIZIZ(c1908730zln2, "", list, false, str);
            }
            if (Intrinsics.LJFF(user, this.LLJJJJ) && list.size() > 1) {
                return;
            }
            C1905050zfr viewHolderConfig2 = getViewHolderConfig();
            if (viewHolderConfig2 != null && (c1905040zfq = viewHolderConfig2.LIZ) != null && c1905040zfq.LIZ) {
                z2 = true;
            }
            C1908730zln c1908730zln3 = this.LLJJIJIL;
            C0SWE c0swe = new C0SWE(user);
            c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
            c0swe.LJ = z2;
            c1908730zln3.LLLLZIL(c0swe.LIZ());
            this.LLJJIJIL.setTracker(new AwS572S0100000_28(this, 484));
            this.LLJJIJIL.setDataChangeListener(new AwS394S0200000_28(this, (C1907160zjG) list, (List<? extends User>) 33));
            C0SY5.LIZIZ.contains(Integer.valueOf(user.getFollowStatus()));
            C426750GoL.LJIIIZ(this.LLJJIJIL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
            this.LLJJJJ = user;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setRelationLabel(com.ss.android.ugc.aweme.relation.label.RelationLabelTextView r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r6.getTemplateNotice()
            r4 = 0
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r0.uiTemplate
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate r0 = r0.titleTemplate
            if (r0 == 0) goto L34
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r0.fromUsers
            if (r1 == 0) goto L34
            int r0 = r1.size()
            if (r0 != r5) goto L34
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r4)
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.ss.android.ugc.aweme.profile.model.User) r3
            if (r3 == 0) goto L35
            boolean r0 = X.C1245020iVI.LIZLLL(r3)
            if (r0 != r5) goto L35
        L2c:
            r1 = 8
            if (r5 != 0) goto L37
            X.C786410Ut5.v0(r7, r1)
            return
        L34:
            r3 = r2
        L35:
            r5 = 0
            goto L2c
        L37:
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r3.getMatchedFriendStruct()
            if (r0 == 0) goto L3f
            java.lang.String r2 = r0.recType
        L3f:
            java.lang.String r0 = "6-1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L4b
            X.C786410Ut5.v0(r7, r1)
            return
        L4b:
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r2 = r3.getMatchedFriendStruct()
            if (r2 == 0) goto L79
            X.0iuv r1 = new X.0iuv
            r1.<init>(r4)
            r1.LJJJJZI(r3)
            java.lang.String r0 = "notification_page"
            r1.LJJIJLIJ(r0)
            java.lang.String r0 = X.C1900870zZ7.LIZ
            r1.LJJJJIZL(r0)
            X.0iux r0 = X.EnumC1260930iux.SHOW
            r1.LJJLIIIJJI = r0
            X.0iuw r0 = X.EnumC1260920iuw.RELATION_LABEL
            r1.LJJLIIIJILLIZJL = r0
            r1.LJJJJLL()
            r1.LJIILJJIL()
            X.C786410Ut5.v0(r7, r4)
            X.10KJ r0 = X.C1264070j01.LJIIJ
            com.ss.android.ugc.aweme.relation.label.RelationLabelTextView.LJJJJL(r7, r2, r0)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907160zjG.setRelationLabel(com.ss.android.ugc.aweme.relation.label.RelationLabelTextView):void");
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public final String LIZJ(View view) {
        Integer numValueOf;
        NoticeUITemplate noticeUITemplate;
        NoticeUITemplate noticeUITemplate2;
        TitleTemplate titleTemplate;
        NoticeUITemplate noticeUITemplate3;
        LabelInfoTemplate labelInfoTemplate;
        String str;
        NoticeUITemplate noticeUITemplate4;
        TitleTemplate titleTemplate2;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() != R.id.pdw && numValueOf.intValue() != R.id.pdu && numValueOf.intValue() != R.id.pet) {
                if (numValueOf.intValue() == R.id.pel) {
                    GeneralTemplateNotice templateNotice = getTemplateNotice();
                    if (templateNotice == null || (noticeUITemplate4 = templateNotice.uiTemplate) == null || (titleTemplate2 = noticeUITemplate4.titleTemplate) == null) {
                        return null;
                    }
                    return titleTemplate2.extraSchemaUrl;
                }
                if (numValueOf.intValue() == R.id.oyo || numValueOf.intValue() == R.id.t4q) {
                    GeneralTemplateNotice templateNotice2 = getTemplateNotice();
                    if (templateNotice2 != null && (noticeUITemplate3 = templateNotice2.uiTemplate) != null && (labelInfoTemplate = noticeUITemplate3.labelInfo) != null && (str = labelInfoTemplate.schema) != null) {
                        return str;
                    }
                    GeneralTemplateNotice templateNotice3 = getTemplateNotice();
                    if (templateNotice3 == null || (noticeUITemplate2 = templateNotice3.uiTemplate) == null || (titleTemplate = noticeUITemplate2.titleTemplate) == null) {
                        return null;
                    }
                    return titleTemplate.extraSchemaUrl;
                }
            } else {
                GeneralTemplateNotice templateNotice4 = getTemplateNotice();
                if (templateNotice4 == null || (noticeUITemplate = templateNotice4.uiTemplate) == null) {
                    return null;
                }
                return noticeUITemplate.middleSchemaUrl;
            }
        }
        return null;
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public final boolean LIZLLL(View view) {
        Function1<String, Unit> function1;
        String strLIZJ = LIZJ(view);
        if (strLIZJ != null) {
            C1242270iQr searchTemplateInfo = getSearchTemplateInfo();
            if (searchTemplateInfo != null && (function1 = searchTemplateInfo.LIZLLL) != null) {
                function1.invoke(null);
            }
            LJ(EnumC1905950zhJ.MIDDLE, strLIZJ);
            return true;
        }
        return false;
    }

    public final C1907330zjX LJII(C1907330zjX c1907330zjX) throws Throwable {
        String str;
        NoticeUITemplate noticeUITemplate;
        EnumC1906270zhp scenario;
        NoticeUITemplate noticeUITemplate2;
        String str2;
        if (LJIILJJIL() || getMBaseNotice() == null) {
            return c1907330zjX;
        }
        C786410Ut5.LLLLZLL(getNotificationContentFromXml(), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        GeneralTemplateNotice generalTemplateNotice = c1907330zjX.LIZ;
        if (generalTemplateNotice == null || (noticeUITemplate2 = generalTemplateNotice.uiTemplate) == null || (str2 = noticeUITemplate2.content) == null || spannableStringBuilder.append((CharSequence) str2) == null) {
            GeneralTemplateNotice generalTemplateNotice2 = c1907330zjX.LIZ;
            if (generalTemplateNotice2 == null || (noticeUITemplate = generalTemplateNotice2.uiTemplate) == null || (str = noticeUITemplate.event) == null) {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (spannableStringBuilder.length() == 0) {
            C1907190zjJ c1907190zjJ = C1907190zjJ.LIZ;
            GeneralTemplateNotice generalTemplateNotice3 = c1907330zjX.LIZ;
            EnumC1907220zjM enumC1907220zjM = EnumC1907220zjM.MIDDLE;
            c1907190zjJ.getClass();
            C1907190zjJ.LIZIZ(generalTemplateNotice3, enumC1907220zjM, "not_content");
        }
        MusNotice mBaseNotice = getMBaseNotice();
        if (mBaseNotice != null) {
            TuxTextView notificationContentFromXml = getNotificationContentFromXml();
            int iLJIIJ = C12ES.LJIIJ(getContext()) - ((int) C12ES.LIZJ(LJIILIIL(), getContext()));
            C1242270iQr searchTemplateInfo = getSearchTemplateInfo();
            InterfaceC1907020zj2 mBridge = getMBridge();
            if (mBridge != null) {
                scenario = mBridge.getScenario();
            } else {
                scenario = null;
            }
            C1907170zjH.LIZ(notificationContentFromXml, spannableStringBuilder, mBaseNotice, 5, iLJIIJ, searchTemplateInfo, scenario);
        }
        C1905050zfr viewHolderConfig = getViewHolderConfig();
        if (viewHolderConfig != null && viewHolderConfig.LIZIZ) {
            C439870HMr.LIZJ(getNotificationContentFromXml(), null);
        }
        return c1907330zjX;
    }

    public final C1907330zjX LJIIIIZZ(C1907330zjX c1907330zjX) throws Throwable {
        EnumC1906270zhp scenario;
        EnumC1906270zhp scenario2;
        NoticeUITemplate noticeUITemplate;
        MusNotice mBaseNotice;
        GeneralTemplateNotice generalTemplateNotice;
        Integer num;
        if (!LJIILJJIL() && getMBaseNotice() != null) {
            InterfaceC1907020zj2 mBridge = getMBridge();
            if (mBridge != null) {
                scenario = mBridge.getScenario();
            } else {
                scenario = null;
            }
            if (scenario != EnumC1906270zhp.AGGREGATE_PAGE || ((mBaseNotice = getMBaseNotice()) != null && (generalTemplateNotice = mBaseNotice.templateNotice) != null && (num = generalTemplateNotice.type) != null && num.intValue() == 31)) {
                C786410Ut5.LLLLZLL(getNotificationContentFromXml(), 0);
                C786410Ut5.h9(getNotificationContentFromXml(), null);
                getNotificationContentFromXml().setOnLongClickListener(null);
                getNotificationContentFromXml().setMovementMethod(C431440Gvu.LIZ());
                C1360520lVa c1360520lVa = new C1360520lVa();
                GeneralTemplateNotice generalTemplateNotice2 = c1907330zjX.LIZ;
                if (generalTemplateNotice2 != null && (noticeUITemplate = generalTemplateNotice2.uiTemplate) != null) {
                    String str = noticeUITemplate.content;
                    if (str != null && str.length() != 0) {
                        C1904650zfD.LIZ(c1360520lVa, noticeUITemplate, new C1907270zjR(this));
                    } else {
                        String str2 = noticeUITemplate.event;
                        if (str2 == null) {
                            str2 = "";
                        }
                        c1360520lVa.LIZIZ(str2);
                    }
                }
                if (c1360520lVa.LIZ.length() == 0) {
                    C1907190zjJ c1907190zjJ = C1907190zjJ.LIZ;
                    GeneralTemplateNotice generalTemplateNotice3 = c1907330zjX.LIZ;
                    EnumC1907220zjM enumC1907220zjM = EnumC1907220zjM.MIDDLE;
                    c1907190zjJ.getClass();
                    C1907190zjJ.LIZIZ(generalTemplateNotice3, enumC1907220zjM, "not_content");
                }
                MusNotice mBaseNotice2 = getMBaseNotice();
                if (mBaseNotice2 != null) {
                    TuxTextView notificationContentFromXml = getNotificationContentFromXml();
                    C1360500lVY c1360500lVY = c1360520lVa.LIZ;
                    int iLJIIJ = C12ES.LJIIJ(getContext()) - ((int) C12ES.LIZJ(LJIILIIL(), getContext()));
                    InterfaceC1907020zj2 mBridge2 = getMBridge();
                    if (mBridge2 != null) {
                        scenario2 = mBridge2.getScenario();
                    } else {
                        scenario2 = null;
                    }
                    C1907170zjH.LIZ(notificationContentFromXml, c1360500lVY, mBaseNotice2, 5, iLJIIJ, null, scenario2);
                }
                C439870HMr.LIZJ(getNotificationContentFromXml(), null);
                LJIIL(c1907330zjX);
            }
        }
        return c1907330zjX;
    }

    public final C1907330zjX LJIIIZ(C1907330zjX c1907330zjX) {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        C0DTR.LIZIZ(getMutualRelationViewFromXml());
        C0DTR.LIZIZ(getRelationLabelFromXml());
        if (this.LLJJJJJIL && (generalTemplateNotice = c1907330zjX.LIZ) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && noticeUITemplate.labelInfo != null) {
            setRelationLabel(getRelationLabelFromXml());
        }
        return c1907330zjX;
    }

    public final void LJIIL(C1907330zjX c1907330zjX) {
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        ExtraActionTemplate extraActionTemplate;
        List<User> list;
        GeneralTemplateNotice generalTemplateNotice = c1907330zjX.LIZ;
        if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (extraActionTemplate = titleTemplate.extraAction) != null && extraActionTemplate.actionType == 2 && (list = titleTemplate.fromUsers) != null && C13LP.LJJJLL(list) != null && titleTemplate.extraAction != null) {
            setNewAppendFollow(titleTemplate.fromUsers);
        }
    }

    public final void setCanShowRelationLabel(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setLastMaxLines(int i) {
        this.LLJLL = i;
    }

    public final void setLastMeasuredWidth(int i) {
        this.LLJLIL = i;
    }

    public final void setLastPaint(TextPaint textPaint) {
        this.LLJLILLLLZIIL = textPaint;
    }

    public final void setLastText(String str) {
        this.LLJL = str;
    }

    public final void setMiddleBottomBtnContainerFromXml(LinearLayout linearLayout) {
        this.LLJJI = linearLayout;
    }

    public final void setMutualRelationViewFromXml(C0QB7 c0qb7) {
        this.LLIZLLLIL = c0qb7;
    }

    public final void setNotificationAllContentFromXml(TuxTextView tuxTextView) {
        this.LLJJ = tuxTextView;
    }

    public final void setNotificationContentFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setNotificationCoverFromXml(C424600Gks c424600Gks) {
        this.LLJ = c424600Gks;
    }

    public final void setNotificationIconImageFromXml(C424600Gks c424600Gks) {
        this.LLJIJIL = c424600Gks;
    }

    public final void setNotificationMiddleImageFromXml(C0DWH c0dwh) {
        this.LLJILJIL = c0dwh;
    }

    public final void setNotificationReplyContainerFromXml(LinearLayout linearLayout) {
        this.LLJI = linearLayout;
    }

    public final void setNotificationReplyContentFromXml(TuxTextView tuxTextView) {
        this.LLJJIII = tuxTextView;
    }

    public final void setQuickCommentContainerFromXml(LinearLayout linearLayout) {
        this.LLJILLL = linearLayout;
    }

    public final void setRelationLabelFromXml(RelationLabelTextView relationLabelTextView) {
        this.LLJILJILJ = relationLabelTextView;
    }

    public C1907160zjG(Context context, AttributeSet attributeSet) {
        View.OnClickListener fVar;
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aam, this, true);
        C424600Gks notificationCoverFromXml = getNotificationCoverFromXml();
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(notificationCoverFromXml);
        }
        notificationCoverFromXml.setOnClickListener(aVar);
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        C424600Gks notificationCoverFromXml2 = getNotificationCoverFromXml();
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.AVATAR;
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        c1906140zhc.getClass();
        C1906140zhc.LIZ(notificationCoverFromXml2, enumC1906160zhe, fLIZIZ);
        this.LLJJIJI = findViewById(R.id.y0w);
        this.LLJJIJIIJIL = (TuxTextView) findViewById(R.id.pel);
        this.LLJJIJIL = (C1908730zln) findViewById(R.id.peo);
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS429S0200000_28(this, context, 171));
        this.LLJJL = C452501pT.LIZIZ(new AwS560S0100000_16(context, 1028));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS560S0100000_16(context, 1029));
        this.LLJL = "";
        this.LLJLIL = -1;
        this.LLJLILLLLZIIL = new TextPaint();
        this.LLJLL = 2;
    }

    public final void LJIIJ(final TextLinkConfig textLinkConfig, C1360520lVa c1360520lVa) {
        C444920HcY c444920HcY;
        Integer numValueOf;
        Object c1906800zig = null;
        Integer numValueOf2 = null;
        if (textLinkConfig != null && (numValueOf = Integer.valueOf(textLinkConfig.type)) != null && numValueOf.intValue() == 2) {
            Integer pressedTextColor = getPressedTextColor();
            if (pressedTextColor != null) {
                int iIntValue = pressedTextColor.intValue();
                numValueOf2 = Integer.valueOf(Color.argb(C814420VxA.LIZIZ(Color.alpha(iIntValue) * 0.2f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
            }
            c444920HcY = new C444920HcY(52, false);
            Integer normalTextColor = getNormalTextColor();
            if (normalTextColor != null) {
                int iIntValue2 = normalTextColor.intValue();
                if (numValueOf2 != null) {
                    c1906800zig = new C1906800zig(null, 100, iIntValue2, numValueOf2.intValue(), new InterfaceC1906810zih() { // from class: X.0zj3
                        @Override // X.InterfaceC1906810zih
                        public final void LIZ(View view, User user, int i) {
                            InterfaceC1907020zj2 mBridge;
                            String accountType;
                            InterfaceC1907020zj2 mBridge2;
                            InterfaceC1907020zj2 mBridge3 = this.LIZ.getMBridge();
                            if (mBridge3 != null) {
                                mBridge3.q(view);
                            }
                            TextLinkConfig textLinkConfig2 = textLinkConfig;
                            if (textLinkConfig2 != null && textLinkConfig2.needTrack && (mBridge2 = this.LIZ.getMBridge()) != null) {
                                mBridge2.LLD(EnumC1154130g8h.OTHERS);
                            }
                            String str = C1900870zZ7.LIZ;
                            if (str == null) {
                                str = "";
                            }
                            TextLinkConfig textLinkConfig3 = textLinkConfig;
                            if (textLinkConfig3 != null && textLinkConfig3.schemaType == 1 && (mBridge = this.LIZ.getMBridge()) != null) {
                                MusNotice mBaseNotice = this.LIZ.getMBaseNotice();
                                if (mBaseNotice != null) {
                                    accountType = mBaseNotice.getAccountType();
                                } else {
                                    accountType = null;
                                }
                                mBridge.s4(user, "click_name", str, accountType);
                            }
                            HashMap map = new HashMap();
                            map.put("inbox_position", str);
                            C19724912Fj.LIZLLL().LJFF(textLinkConfig.schemaUrl, map);
                            InterfaceC1907020zj2 mBridge4 = this.LIZ.getMBridge();
                            if (mBridge4 != null) {
                                mBridge4.a4();
                            }
                        }
                    });
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            c444920HcY = null;
        }
        String str = textLinkConfig.text;
        if (str == null) {
            str = "";
        }
        c1360520lVa.LIZJ(str, c1906800zig, 33);
        int length = c1360520lVa.LIZ.length();
        C786410Ut5.r2(c1360520lVa.LIZ, c444920HcY, length - str.length(), length, 33);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        if (this.LLJJIJI.getVisibility() == 0 && this.LLJJIJIIJIL.getVisibility() == 0) {
            TextPaint paint = this.LLJJIJIIJIL.getPaint();
            int measuredWidth = this.LLJJIJIIJIL.getMeasuredWidth();
            int maxLines = this.LLJJIJIIJIL.getMaxLines();
            String str2 = this.LLJL;
            CharSequence text = this.LLJJIJIIJIL.getText();
            String string = null;
            if (text != null) {
                string = text.toString();
            }
            if (Intrinsics.LJFF(str2, string) && Intrinsics.LJFF(this.LLJLILLLLZIIL, paint) && this.LLJLIL == measuredWidth && this.LLJLL == maxLines) {
                return;
            }
            Object tag = this.LLJJIJIIJIL.getTag();
            if (!(tag instanceof String) || (str = (String) tag) == null) {
                str = "";
            }
            TuxTextView tuxTextView = this.LLJJIJIIJIL;
            tuxTextView.setText(C1907170zjH.LIZJ(new SpannableStringBuilder(tuxTextView.getText()), paint, measuredWidth, maxLines, str.length(), (int) paint.measureText(str)));
            this.LLJL = this.LLJJIJIIJIL.getText().toString();
            this.LLJLIL = measuredWidth;
            this.LLJLILLLLZIIL = paint;
            this.LLJLL = maxLines;
        }
    }

    public static void LJIIJJI(C1907160zjG c1907160zjG, C1907330zjX c1907330zjX, int i) throws JSONException {
        boolean z;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        NoticeUITemplate noticeUITemplate2;
        TitleTemplate titleTemplate2;
        String strLIZ;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!c1907160zjG.LJIILJJIL()) {
            C786410Ut5.LJLLLLLL(0, c1907160zjG.LLJJIJI);
            GeneralTemplateNotice generalTemplateNotice = c1907330zjX.LIZ;
            List<User> list = null;
            if (generalTemplateNotice != null && (noticeUITemplate2 = generalTemplateNotice.uiTemplate) != null && (titleTemplate2 = noticeUITemplate2.titleTemplate) != null) {
                List<User> list2 = titleTemplate2.fromUsers;
                if (list2 != null && z) {
                    c1907160zjG.LLJJJIL = z;
                    C786410Ut5.h9(c1907160zjG.LLJJIJIIJIL, new ACListenerS162S0100000_28(c1907160zjG, c1907330zjX, 68));
                    TuxTextView tuxTextView = c1907160zjG.LLJJIJIIJIL;
                    Regex regex = C1387040mCM.LIZ;
                    C1387040mCM.LIZ(tuxTextView, AFwS289S0000000_6.get$arr$(36));
                    c1907160zjG.LLJJIJIIJIL.LLJJ = true;
                    InterfaceC1907020zj2 mBridge = c1907160zjG.getMBridge();
                    if (mBridge != null) {
                        TuxTextView tuxTextView2 = c1907160zjG.LLJJIJIIJIL;
                        Integer numValueOf = Integer.valueOf(titleTemplate2.mergeCount);
                        MusNotice mBaseNotice = c1907160zjG.getMBaseNotice();
                        GeneralTemplateNotice generalTemplateNotice2 = c1907330zjX.LIZ;
                        if (generalTemplateNotice2 == null || (strLIZ = C1906180zhg.LIZ(generalTemplateNotice2, titleTemplate2.extraSchemaUrl)) == null) {
                            strLIZ = titleTemplate2.extraSchemaUrl;
                        }
                        mBridge.x5(tuxTextView2, list2, numValueOf, mBaseNotice, strLIZ);
                    }
                    if (list2.isEmpty()) {
                        C1907190zjJ c1907190zjJ = C1907190zjJ.LIZ;
                        GeneralTemplateNotice generalTemplateNotice3 = c1907330zjX.LIZ;
                        EnumC1907220zjM enumC1907220zjM = EnumC1907220zjM.MIDDLE;
                        c1907190zjJ.getClass();
                        C1907190zjJ.LIZIZ(generalTemplateNotice3, enumC1907220zjM, "not_title");
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String str = titleTemplate2.title;
                    if (str == null) {
                        str = "";
                    }
                    spannableStringBuilder.append((CharSequence) str);
                    if (C1907180zjI.LJ(c1907330zjX.LIZ)) {
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1h, c1907160zjG.getContext())), 0, spannableStringBuilder.length(), 33);
                    } else {
                        C786410Ut5.q2(spannableStringBuilder, new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                    }
                    c1907160zjG.LLJJIJIIJIL.setText(spannableStringBuilder);
                    if (spannableStringBuilder.length() == 0) {
                        C1907190zjJ c1907190zjJ2 = C1907190zjJ.LIZ;
                        GeneralTemplateNotice generalTemplateNotice4 = c1907330zjX.LIZ;
                        EnumC1907220zjM enumC1907220zjM2 = EnumC1907220zjM.MIDDLE;
                        c1907190zjJ2.getClass();
                        C1907190zjJ.LIZIZ(generalTemplateNotice4, enumC1907220zjM2, "not_title");
                    }
                }
            }
            if (c1907160zjG.getSearchTemplateInfo() == null) {
                C1905050zfr viewHolderConfig = c1907160zjG.getViewHolderConfig();
                if (viewHolderConfig != null && !viewHolderConfig.LIZLLL) {
                    return;
                }
                GeneralTemplateNotice generalTemplateNotice5 = c1907330zjX.LIZ;
                if (generalTemplateNotice5 != null && (noticeUITemplate = generalTemplateNotice5.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null) {
                    list = titleTemplate.fromUsers;
                }
                c1907160zjG.setNewAppendFollow(list);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05c1 A[PHI: r11
      0x05c1: PHI (r11v3 java.lang.Boolean) = (r11v2 java.lang.Boolean), (r11v9 java.lang.Boolean) binds: [B:307:0x05be, B:294:0x059d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05c6 A[PHI: r8 r11
      0x05c6: PHI (r8v3 com.ss.android.ugc.aweme.feed.model.Aweme) = (r8v2 com.ss.android.ugc.aweme.feed.model.Aweme), (r8v6 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:310:0x05c3, B:297:0x05a3] A[DONT_GENERATE, DONT_INLINE]
      0x05c6: PHI (r11v4 java.lang.Boolean) = (r11v3 java.lang.Boolean), (r11v8 java.lang.Boolean) binds: [B:310:0x05c3, B:297:0x05a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x068a A[PHI: r18
      0x068a: PHI (r18v2 com.ss.android.ugc.aweme.comment.model.Comment) = (r18v1 com.ss.android.ugc.aweme.comment.model.Comment), (r18v5 com.ss.android.ugc.aweme.comment.model.Comment) binds: [B:352:0x0686, B:323:0x05f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x072d A[PHI: r28
      0x072d: PHI (r28v1 com.ss.android.ugc.aweme.comment.model.Comment) = (r28v0 com.ss.android.ugc.aweme.comment.model.Comment), (r28v6 com.ss.android.ugc.aweme.comment.model.Comment) binds: [B:389:0x072a, B:363:0x06af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0732 A[PHI: r21 r28
      0x0732: PHI (r21v1 com.ss.android.ugc.aweme.feed.model.Aweme) = 
      (r21v0 com.ss.android.ugc.aweme.feed.model.Aweme)
      (r21v5 com.ss.android.ugc.aweme.feed.model.Aweme)
      (r21v5 com.ss.android.ugc.aweme.feed.model.Aweme)
     binds: [B:392:0x072f, B:366:0x06b7, B:368:0x06bb] A[DONT_GENERATE, DONT_INLINE]
      0x0732: PHI (r28v2 com.ss.android.ugc.aweme.comment.model.Comment) = 
      (r28v1 com.ss.android.ugc.aweme.comment.model.Comment)
      (r28v5 com.ss.android.ugc.aweme.comment.model.Comment)
      (r28v5 com.ss.android.ugc.aweme.comment.model.Comment)
     binds: [B:392:0x072f, B:366:0x06b7, B:368:0x06bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0816 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x081e  */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r5v44, types: [T, X.0lDT] */
    /* JADX WARN: Type inference failed for: r7v11, types: [X.0zjL] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractViewOnClickListenerC1907000zj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r34, X.InterfaceC1907020zj2 r35, X.C1242270iQr r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907160zjG.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, X.0zj2, X.0iQr):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1907330zjX LJFF(X.C1907330zjX r18, X.C00AR r19, X.EnumC1907240zjO r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907160zjG.LJFF(X.0zjX, X.00AR, X.0zjO):X.0zjX");
    }
}
