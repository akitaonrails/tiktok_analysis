package X;

import Y.AObjectS371S0100000_28;
import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS149S0201000_28;

/* JADX INFO: renamed from: X.0zil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1906850zil extends ViewOnClickListenerC1906680ziU {
    public User bindedUser;
    public Context mContext;
    public BaseNotice mMTBaseNotice;
    public String mTimelineTypeStr;
    public C1908730zln nameAppendFollowText;
    public final Observer<Boolean> refreshObserver;
    public EnumC1906270zhp scenario;
    public static final int NEW_CONTENT_TITLE_SPACE = C341940Daq.LIZ(3.0d);
    public static final int NEW_LEFT_CONTAINER_TOP_SPACE = C341940Daq.LIZ(11.0d);
    public static final int LARGE_AVATAR_ADD_SPACE = C341940Daq.LIZ(4.0d);
    public static final int LARGE_TITLE_SIZE = C341940Daq.LIZ(16.0d);

    public void applyNewCover(int i) {
    }

    public void applyNewStyle(C1906880zio c1906880zio) {
    }

    public abstract int getRootId();

    @Override // X.ViewOnClickListenerC1906680ziU
    public boolean needLongClick() {
        return true;
    }

    public void reportShowEvent() {
    }

    @Override // X.ViewOnClickListenerC1906680ziU
    public void onAttached() {
        NoticeVideoManager.InnerManager innerManagerLIZ;
        super.onAttached();
        reportShowEvent();
        InterfaceC1906840zik interfaceC1906840zik = this.vm;
        if (interfaceC1906840zik instanceof InterfaceC1906930zit) {
            ((InterfaceC1906930zit) interfaceC1906840zik).LIZ().observe(C1388190mED.LIZIZ(this.mContext), this.refreshObserver);
        }
        if (this.mMTBaseNotice == null || (innerManagerLIZ = NoticeVideoManager.LIZ()) == null) {
            return;
        }
        C2252408s6.LJIIIZ(new AwS149S0201000_28(this.mMTBaseNotice, innerManagerLIZ, getWrappedLayoutPosition(), 12));
    }

    @Override // X.ViewOnClickListenerC1906680ziU
    public void onDetached() {
        super.onDetached();
        InterfaceC1906840zik interfaceC1906840zik = this.vm;
        if (interfaceC1906840zik instanceof InterfaceC1906930zit) {
            ((InterfaceC1906930zit) interfaceC1906840zik).LIZ().removeObserver(this.refreshObserver);
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public BaseNotice getNotice() {
        return this.mMTBaseNotice;
    }

    public AbstractC1906850zil(View view) {
        super(view);
        this.refreshObserver = new AObserverS230S0100000_28(this, 38);
        this.mContext = view.getContext();
        View viewFindViewById = view.findViewById(getRootId());
        if (viewFindViewById != null && needLongClick()) {
            viewFindViewById.setOnLongClickListener(this);
        }
        C1908730zln c1908730zln = (C1908730zln) view.findViewById(R.id.peo);
        this.nameAppendFollowText = c1908730zln;
        if (c1908730zln != null) {
            c1908730zln.setDataChangeListener(new AObjectS371S0100000_28(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Boolean bool) {
        reportShowEvent();
    }

    public static boolean useNewTimeStyle(EnumC1906270zhp enumC1906270zhp) {
        if (C1906760zic.LIZIZ() && enumC1906270zhp != null) {
            if (enumC1906270zhp == EnumC1906270zhp.NEW_ACTIVITY || enumC1906270zhp == EnumC1906270zhp.NEW_FOLLOWER || enumC1906270zhp == EnumC1906270zhp.AGGREGATE_PAGE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void clearTypeIconFromAvatar(C0HX6 c0hx6) {
        if (c0hx6 == null) {
            return;
        }
        C1907140zjE.LIZ.getClass();
        C1907140zjE.LIZIZ(c0hx6);
    }

    public void markHasRead(BaseNotice baseNotice) {
        C429790GtF.LIZ(this.itemView);
        if (baseNotice != null) {
            baseNotice.hasRead = true;
        }
    }

    public void markHasReadWhenFollowRequest(FollowRequestData followRequestData) {
        C429790GtF.LIZ(this.itemView);
        if (followRequestData != null) {
            followRequestData.setHasRead(true);
        }
    }

    public void setAppendFollowTextMarginStart(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.nameAppendFollowText.getLayoutParams();
        marginLayoutParams.setMarginStart((int) C12ES.LIZJ(f, this.mContext));
        C1908730zln c1908730zln = this.nameAppendFollowText;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1908730zln);
        c1908730zln.setLayoutParams(marginLayoutParams);
    }

    public void setBindedUser(User user) {
        this.bindedUser = user;
    }

    public void setScenario(EnumC1906270zhp enumC1906270zhp) {
        this.scenario = enumC1906270zhp;
    }

    public static String addNoticeDisableSpan(Context context, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append(" ").append("  ");
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZJ = C418440Gaw.LIZ(13);
        c419910GdJ.LIZIZ = C418440Gaw.LIZ(13);
        c419910GdJ.LIZ = R.raw.icon_bell_slash;
        C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, context), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
        return "  ";
    }

    public static String getNoticeCreateTimeDesc(long j, Context context) {
        String strLJFF;
        if (j != 0) {
            C296870BkL.LIZ.getClass();
            if (C296870BkL.LIZ()) {
                strLJFF = C2215101Bmm.LJII(j * 1000);
            } else {
                C1866820ygC.LIZ.getClass();
                if (C1866820ygC.LIZ()) {
                    strLJFF = C2215101Bmm.LJI(j * 1000, C1866820ygC.LIZIZ());
                } else {
                    strLJFF = C1356610lPH.LJFF(j * 1000, context);
                }
            }
            String strReplaceAll = strLJFF.replaceAll("(.)", "$1\u2060");
            if (!C444960Hcc.LIZJ(context)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 8237);
                sbLIZ.append(strReplaceAll);
                sbLIZ.append((char) 8237);
                strReplaceAll = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" ");
            sbLIZ2.append(C444960Hcc.LIZ(context));
            sbLIZ2.append(strReplaceAll);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return "";
    }

    private void resetViewSize(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public String addCreateTimeSpan(SpannableStringBuilder spannableStringBuilder, long j) {
        int i;
        String noticeCreateTimeDesc = getNoticeCreateTimeDesc(j, this.mContext);
        if (noticeCreateTimeDesc.indexOf(8237) > -1) {
            i = 2;
        } else {
            i = 0;
        }
        useNewTimeStyle(this.scenario);
        if (!TextUtils.isEmpty(noticeCreateTimeDesc)) {
            spannableStringBuilder.append((CharSequence) noticeCreateTimeDesc);
            if (useNewTimeStyle(this.scenario)) {
                C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(12, true), (spannableStringBuilder.length() - noticeCreateTimeDesc.length()) + i, spannableStringBuilder.length(), 17);
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, this.mContext);
            if (numLIZJ == null) {
                return "";
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), (spannableStringBuilder.length() - noticeCreateTimeDesc.length()) + i, spannableStringBuilder.length(), 17);
        }
        return noticeCreateTimeDesc;
    }

    public void applyArrow(C1906880zio c1906880zio, View view) {
        Drawable drawable;
        if (c1906880zio != null && (drawable = c1906880zio.LJIIL) != null) {
            if (view instanceof TuxIconView) {
                ((TuxIconView) view).setImageDrawable(drawable);
                return;
            }
            return;
        }
        ((TuxIconView) view).setTintColor(C960203pA.LIZ(R.attr.a1h, view.getContext()));
    }

    public void applyContentColor(C1906880zio c1906880zio, TextView textView) {
        int i;
        if (c1906880zio != null && (i = c1906880zio.LJII) != -1 && (textView instanceof TuxTextView)) {
            textView.setTextColor(i);
        }
    }

    public void applyContentTitleGap(C1906880zio c1906880zio, TextView textView) {
        int i;
        if (c1906880zio != null && (i = c1906880zio.LJIIIZ) != -1) {
            int iLIZ = C341940Daq.LIZ(i);
            if (textView instanceof TuxTextView) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                marginLayoutParams.topMargin = iLIZ;
                C786410Ut5.g6(textView, marginLayoutParams);
            }
        }
    }

    public void applyCoverBorder(C1906880zio c1906880zio, ImageView imageView) {
        if (c1906880zio != null && c1906880zio.LJIIZILJ != -1.0f && (imageView instanceof C424560Gko)) {
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZIZ = C418440Gaw.LIZIZ(Float.valueOf(c1906880zio.LJIIZILJ));
            int i = c1906880zio.LJIJ;
            if (i != -1) {
                c1331750klB.LIZJ = i;
            }
            int i2 = c1906880zio.LJIILLIIL;
            if (i2 != -1) {
                c1331750klB.LJ = C418440Gaw.LIZIZ(Integer.valueOf(i2));
            }
            ((SmartImageView) imageView).setCircleOptions(c1331750klB.LIZ());
        }
    }

    public void applyCoverRadiusSize(C1906880zio c1906880zio, ImageView imageView) {
        int i;
        if (c1906880zio != null && (i = c1906880zio.LJIILLIIL) != -1 && (imageView instanceof C424560Gko)) {
            ((C424560Gko) imageView).setCornerRadius(C341940Daq.LIZ(i));
        }
    }

    public void applyCoverSize(C1906880zio c1906880zio, ImageView imageView) {
        int i;
        if (c1906880zio != null && (i = c1906880zio.LJIILL) != -1 && (imageView instanceof C424560Gko)) {
            resetViewSize(imageView, C341940Daq.LIZ(i));
        }
    }

    public void applyHead(C1906880zio c1906880zio, View view) {
        int iLIZ;
        if (c1906880zio != null && (iLIZ = C341940Daq.LIZ(c1906880zio.LIZ)) != -1) {
            resetViewSize(view, iLIZ);
        }
    }

    public void applyHeadStoryRing(C1906880zio c1906880zio, View view) {
        int i;
        if (c1906880zio != null && (i = c1906880zio.LIZ) != -1) {
            resetViewSize(view, (int) (C341940Daq.LIZ(i) + TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics())));
        }
    }

    public void applyTitleSize(C1906880zio c1906880zio, TextView textView) {
        if (c1906880zio == null) {
            return;
        }
        int i = c1906880zio.LIZLLL;
        if (i != -1 && (textView instanceof TuxTextView)) {
            ((TuxTextView) textView).setTuxFont(i);
        }
        int i2 = c1906880zio.LJ;
        if (i2 != -1 && (textView instanceof TuxTextView)) {
            ((TuxTextView) textView).LJJJJI(i2);
        }
    }

    public void applyTitleTypeFace(C1906880zio c1906880zio, TextView textView) {
        Typeface typeface;
        if (c1906880zio != null && (typeface = c1906880zio.LJIILJJIL) != null && (textView instanceof TuxTextView)) {
            ((TuxTextView) textView).setTypeface(typeface);
        }
    }

    public void bindNotice(BaseNotice baseNotice, int i) {
        this.mMTBaseNotice = baseNotice;
        ((ViewOnClickListenerC1906680ziU) this).mPosition = i;
        this.mTimelineTypeStr = C1902710zc5.LIZIZ(baseNotice.timeLineType);
    }

    public int getViewTopMarginAddSpace(View view, int i) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + i;
    }

    public void resetViewTopMargin(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        }
    }

    public static String getNoticeCreateTimeDesc(BaseNotice baseNotice, Context context) {
        return getNoticeCreateTimeDesc(baseNotice.createTime, context);
    }

    public void addCreateTimeSpan(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice) {
        addCreateTimeSpan(spannableStringBuilder, baseNotice, this.mContext, this.scenario);
    }

    public void applyCoverSize(int i, View view) {
        if (i <= 0) {
            return;
        }
        resetViewSize(view, i);
    }

    public void addTypeIconToAvatar(C0HX6 c0hx6, UrlModel urlModel, boolean z) {
        if (c0hx6 == null) {
            return;
        }
        C1907140zjE.LIZ.getClass();
        C1907140zjE.LIZIZ(c0hx6);
        C1907140zjE.LIZ(c0hx6, this.mContext, urlModel, C960203pA.LIZ(R.attr.bx, c0hx6.getContext()), z);
    }

    public void bindNotice(BaseNotice baseNotice, int i, EnumC1906270zhp enumC1906270zhp) {
        bindNotice(baseNotice, i);
        this.scenario = enumC1906270zhp;
    }

    public void logNotificationClick(String str, int i, String str2) {
        logNotificationClick(str, i, null, null, "", str2);
    }

    public void markUnreadIfNeed(boolean z, View view, boolean z2) {
        if (z2 && view != null) {
            C429790GtF.LIZ(view);
            if (z) {
                return;
            }
            C429790GtF.LIZIZ(view);
        }
    }

    public static String addCreateTimeSpan(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, Context context, EnumC1906270zhp enumC1906270zhp) {
        int i;
        String noticeCreateTimeDesc = getNoticeCreateTimeDesc(baseNotice, context);
        if (noticeCreateTimeDesc.indexOf(8237) > -1) {
            i = 2;
        } else {
            i = 0;
        }
        useNewTimeStyle(enumC1906270zhp);
        if (!TextUtils.isEmpty(noticeCreateTimeDesc)) {
            spannableStringBuilder.append((CharSequence) noticeCreateTimeDesc);
            if (useNewTimeStyle(enumC1906270zhp)) {
                C786410Ut5.q2(spannableStringBuilder, new AbsoluteSizeSpan(12, true), (spannableStringBuilder.length() - noticeCreateTimeDesc.length()) + i, spannableStringBuilder.length(), 17);
            }
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1k, context)), (spannableStringBuilder.length() - noticeCreateTimeDesc.length()) + i, spannableStringBuilder.length(), 17);
            if (Boolean.TRUE.equals(C634610Oup.LIZIZ(baseNotice))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(noticeCreateTimeDesc);
                sbLIZ.append(addNoticeDisableSpan(context, spannableStringBuilder));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return noticeCreateTimeDesc;
        }
        return noticeCreateTimeDesc;
    }

    public void applyAggregatedHead(C1906880zio c1906880zio, View view, View view2, View view3) {
        int i;
        if (c1906880zio != null && (i = c1906880zio.LIZ) != -1 && c1906880zio.LIZIZ != -1 && c1906880zio.LIZJ != -1) {
            int iLIZ = C341940Daq.LIZ(i);
            int iLIZ2 = C341940Daq.LIZ(c1906880zio.LIZIZ);
            int iLIZ3 = C341940Daq.LIZ(c1906880zio.LIZJ);
            resetViewSize(view, iLIZ);
            resetViewSize(view2, iLIZ2);
            resetViewSize(view3, iLIZ3);
        }
    }

    public void resetContentTopMargin(TextView textView, View view, View view2, int i) {
        if (textView != null && view != null && i != 8 && textView.getVisibility() != 8 && textView.getTextSize() == LARGE_TITLE_SIZE && view.getVisibility() != 8) {
            if (view2 != null && view2.getVisibility() != 8) {
                resetViewTopMargin(view, 0);
            } else {
                resetViewTopMargin(view, NEW_CONTENT_TITLE_SPACE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public void logNotificationClick(String str, int i, String str2, User user, String str3, String str4) {
        String templateId;
        long j;
        String str5;
        ?? r5;
        BaseNotice baseNotice;
        BaseNotice baseNotice2 = this.mMTBaseNotice;
        if (baseNotice2 != null) {
            templateId = baseNotice2.getTemplateId();
            BaseNotice baseNotice3 = this.mMTBaseNotice;
            str5 = baseNotice3.nid;
            j = baseNotice3.createTime;
        } else {
            templateId = "";
            j = 0;
            str5 = "";
        }
        if (!C1902710zc5.LIZJ() && (baseNotice = this.mMTBaseNotice) != null) {
            templateId = baseNotice.getTemplateId();
            BaseNotice baseNotice4 = this.mMTBaseNotice;
            str5 = baseNotice4.nid;
            r5 = baseNotice4.hasRead;
        } else {
            r5 = 0;
        }
        ?? c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("account_type", str);
        c2344009Gk.LJIIIIZZ("client_order", String.valueOf(i));
        c2344009Gk.LJIIIIZZ("template_id", templateId);
        c2344009Gk.LJIIIIZZ("content_id", str5);
        c2344009Gk.LIZLLL(j, "message_time");
        c2344009Gk.LIZJ(r5, "is_read");
        c2344009Gk.LIZJ(this.mMTBaseNotice.isFriend ? 1 : 0, "is_friends_notice");
        if (!TextUtils.isEmpty(str3)) {
            c2344009Gk.LJFF("follow_source", str3);
        }
        if (user != null) {
            C1906910zir.LIZ.getClass();
            c2344009Gk.LJFF("follow_status_to_user", C1906910zir.LIZJ(user));
        }
        if (!TextUtils.isEmpty(str2)) {
            c2344009Gk.LJFF("button_type", str2);
        } else if (user != null) {
            C0SDC c0sdc = C0SDC.LIZ;
            Context context = this.mContext;
            c0sdc.getClass();
            c2344009Gk.LJFF("button_type", C0SDC.LIZ(context, user));
        }
        if (!TextUtils.isEmpty(C1900870zZ7.LIZ)) {
            c2344009Gk.LJFF("position", C1900870zZ7.LIZ);
        }
        InterfaceC1906840zik interfaceC1906840zik = this.vm;
        if (interfaceC1906840zik != null) {
            interfaceC1906840zik.Dx2();
        }
        C20684815ws.LJIILLIIL("notification_message_inner_message", c2344009Gk.LIZ);
    }
}
