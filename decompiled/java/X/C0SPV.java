package X;

import Y.ACListenerS115S0200000_11;
import Y.ACListenerS146S0100000_11;
import Y.ACListenerS48S0400000_11;
import Y.ARunnableS111S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.SubscriptSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.aigc.IAIInfoPanelService;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import irm.AkS56S0200000_11;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS660S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0SPV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPV extends LinearLayout {
    public final TuxTextView LL;
    public final C720770SPb LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final LinearLayout LLILZIL;
    public final FrameLayout LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public SpannableStringBuilder LLJI;
    public int LLJIJIL;
    public SpannableStringBuilder LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C21279718Pj LLJJIJIIJIL;
    public final TuxTextView LLJJIJIL;
    public final C0QB7 LLJJJ;
    public final TuxTextView LLJJJIL;
    public final LinearLayout LLJJJJ;
    public Aweme LLJJJJJIL;
    public C0SPY LLJJJJLIIL;
    public Integer LLJJL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Function0<Unit> LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public SpannableStringBuilder LLJZ;
    public List<? extends TextExtraStruct> LLJZIJLIL;
    public String[] LLL;
    public int LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public int LLLFZ;
    public String LLLI;
    public String LLLII;

    private final SpannableStringBuilder getEndOmitTextAndTime() {
        String strLIZ = this.LLLII;
        if (strLIZ == null) {
            Aweme aweme = this.LLJJJJJIL;
            if (aweme == null) {
                aweme = null;
            }
            strLIZ = C0SQ4.LIZ(aweme.getCreateTime() * 1000, getContext());
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) "...");
        spannableStringBuilderAppend.append((CharSequence) strLIZ);
        C786410Ut5.q2(spannableStringBuilderAppend, new C0GWZ(getTimeStampTextColor(), false), 3, strLIZ.length() + 3, 33);
        return spannableStringBuilder;
    }

    private final CharSequence getPostTime() {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        String strLIZ = this.LLLII;
        if (strLIZ == null) {
            Aweme aweme = this.LLJJJJJIL;
            if (aweme == null) {
                aweme = null;
            }
            strLIZ = C0SQ4.LIZ(aweme.getCreateTime() * 1000, getContext());
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C786410Ut5.q2(spannableStringBuilder.append((CharSequence) String.valueOf(strLIZ)), new C0GWZ(getTimeStampTextColor(), this.LLJLLL), 0, spannableStringBuilder.length(), 33);
        C786410Ut5.q2(spannableStringBuilder, subscriptSpan, 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final int LIZLLL() {
        if (this.LLJLLL) {
            return Integer.MAX_VALUE;
        }
        return C719100SIq.LIZ();
    }

    private final CharSequence getEndTextWhenTruncated() {
        return getEndOmitTextAndTime().append("   ").append((CharSequence) getContext().getString(2131825209));
    }

    private final int getTimeStampTextColor() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    public final boolean getEnableToggle() {
        return this.LLJLIL;
    }

    public final Integer getExtraBackgroundSpanColor() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int getMaxLinesWhenFold() {
        return this.LLJL;
    }

    public final boolean getShouldShowPhotoDescription() {
        return this.LLJLLL;
    }

    public final Function0<Unit> getSpanClickInterceptor() {
        return this.LLJLL;
    }

    public final Integer getTextColor() {
        return this.LLJJL;
    }

    public final boolean getUnableClickSpan() {
        return this.LLJLILLLLZIIL;
    }

    private final void setCollabInfo(Aweme aweme) {
        if (aweme.getCollabInfo() == null) {
            return;
        }
        if (!C328100Ctc.LJ(aweme)) {
            C786410Ut5.LJZL(8, this.LLJJJJ);
            return;
        }
        C786410Ut5.LJZL(0, this.LLJJJJ);
        List<User> listLIZIZ = C328100Ctc.LIZIZ(aweme);
        if (!listLIZIZ.isEmpty()) {
            C0QB7 c0qb7 = this.LLJJJ;
            C786410Ut5.u1(c0qb7, 0);
            c0qb7.setCollabInFeedLabel(true);
            c0qb7.LIZJ(C0HD5.LIZ(c0qb7, 18), C0HD5.LIZ(c0qb7, 12));
            int size = listLIZIZ.size();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            for (User user : listLIZIZ) {
                String uid = user.getUid();
                String str = "";
                if (uid == null) {
                    uid = "";
                }
                String nickname = user.getNickname();
                if (nickname != null) {
                    str = nickname;
                }
                arrayList.add(new MutualUser(uid, str, user.getAvatarThumb(), user.getAvatarThumb(), "", null));
            }
            c0qb7.LIZ(new MutualStruct(0, size, arrayList, 0), 4);
            this.LLJJJIL.setText(getResources().getQuantityString(2131755138, listLIZIZ.size(), Integer.valueOf(listLIZIZ.size())));
        } else {
            C786410Ut5.u1(this.LLJJJ, 8);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
            c419910GdJ.LIZIZ = C0HD5.LIZ(this, Float.valueOf(6.4f));
            c419910GdJ.LIZJ = C0HD5.LIZ(this, 13);
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
            TuxTextView tuxTextView = this.LLJJJIL;
            tuxTextView.setText(tuxTextView.getContext().getString(2131828906));
            tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
            tuxTextView.setCompoundDrawablePadding(C0HD5.LIZ(tuxTextView, 2));
        }
        C786410Ut5.I7(new AkS56S0200000_11(this, aweme, 0), this.LLJJJJ);
    }

    public final boolean LJ(TextExtraStruct textExtraStruct) {
        int length;
        int length2;
        SpannableStringBuilder spannableStringBuilder = this.LLJZ;
        if (spannableStringBuilder != null) {
            length = spannableStringBuilder.length();
        } else {
            length = 0;
        }
        Aweme aweme = this.LLJJJJJIL;
        Aweme aweme2 = null;
        if (aweme == null) {
            aweme = null;
        }
        String desc = aweme.getDesc();
        if (desc != null) {
            length2 = desc.length();
        } else {
            length2 = 0;
        }
        int iMax = Math.max(length, length2);
        Aweme aweme3 = this.LLJJJJJIL;
        if (aweme3 != null) {
            aweme2 = aweme3;
        }
        if (aweme2.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > iMax || textExtraStruct.getStart() >= iMax || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    public final void LJFF(Aweme aweme) {
        Context context;
        int lineCount;
        int lineEnd;
        int i = this.LLLFZ;
        if (i == 0 || (context = getContext()) == null) {
            return;
        }
        int iLIZLLL = LIZLLL();
        getEndTextWhenTruncated().toString().getClass();
        if (this.LLILLJJLI.getLineCount() == 0) {
            lineCount = iLIZLLL;
        } else {
            lineCount = this.LLILLJJLI.getLineCount();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("descLineCount: ");
        sbLIZ.append(lineCount);
        sbLIZ.append(", maxLines: ");
        sbLIZ.append(iLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI.getText().toString();
        if (lineCount > iLIZLLL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(context.getString(2131834549));
            C2188811AlT.LIZIZ(sbLIZ2);
            final boolean z = false;
            if (this.LLILLJJLI.getLayout() != null) {
                int i2 = iLIZLLL - 1;
                this.LLILLJJLI.getLayout().getLineStart(i2);
                lineEnd = this.LLILLJJLI.getLayout().getLineEnd(i2);
            } else {
                lineEnd = 0;
            }
            CharSequence text = this.LLILLJJLI.getText();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Desc more than 4 lines, lineCount is ");
            sbLIZ3.append(this.LLILLJJLI.getLineCount());
            sbLIZ3.append("content is ");
            sbLIZ3.append((Object) text);
            C2188811AlT.LIZIZ(sbLIZ3);
            final boolean z2 = true;
            int i3 = iLIZLLL - 1;
            this.LLJILJILJ = this.LLILLJJLI.getLayout().getLineBottom(i3) - this.LLILLJJLI.getLayout().getLineTop(0);
            this.LLJIJIL = this.LLILLJJLI.getLayout().getLineBottom(lineCount - 1) - this.LLILLJJLI.getLayout().getLineTop(0);
            this.LLJILLL = this.LLILLJJLI.getLayout().getLineBottom(i3) - this.LLILLJJLI.getLayout().getLineTop(i3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("hhhheight 3 descFullTextHeight: ");
            sbLIZ4.append(this.LLJIJIL);
            sbLIZ4.append("  descTruncatedTextHeight:");
            sbLIZ4.append(this.LLJILJILJ);
            C2188811AlT.LIZIZ(sbLIZ4);
            C1351950lHl.LJIJI(this.LLJILLL, this.LLILZIL);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("hhhheight 3 mToggleLayoutHeight: ");
            sbLIZ5.append(this.LLJILLL);
            C2188811AlT.LIZIZ(sbLIZ5);
            if (text instanceof SpannableString) {
                if (lineEnd == 0) {
                    ((SpannableString) text).length();
                }
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                final SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(SpannableString.valueOf(text));
                this.LLILLJJLI.setLines(LIZLLL());
                SpannableStringBuilder spannableStringBuilder3 = this.LLJZ;
                C0SPY c0spy = null;
                if (spannableStringBuilder3 != null) {
                    spannableStringBuilder3.append(getPostTime());
                    Aweme aweme2 = this.LLJJJJJIL;
                    if (aweme2 == null) {
                        aweme2 = null;
                    }
                    AwemeBizExtKt.setCaptionReturnCount(aweme2, this.LLLFF);
                    Aweme aweme3 = this.LLJJJJJIL;
                    if (aweme3 == null) {
                        aweme3 = null;
                    }
                    AwemeBizExtKt.setCaptionLength(aweme3, this.LLLF);
                    try {
                        lineCount = new StaticLayout(spannableStringBuilder3, this.LLILLJJLI.getPaint(), this.LLILLJJLI.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    spannableStringBuilder2 = spannableStringBuilder3;
                }
                final boolean zIsAdTraffic = AwemeExtKt.isAdTraffic(aweme);
                if (!this.LLJLIL) {
                    C1351950lHl.LJIJJ(this.LLILZIL);
                } else {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C0SPY c0spy2 = this.LLJJJJLIIL;
                    if (c0spy2 == null) {
                        c0spy2 = null;
                    }
                    String str = c0spy2.enterFrom;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    C0SPY c0spy3 = this.LLJJJJLIIL;
                    if (c0spy3 == null) {
                        c0spy3 = null;
                    }
                    String str3 = c0spy3.awemeId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c2344009Gk.LJIIIIZZ("group_id", str3);
                    C0SPY c0spy4 = this.LLJJJJLIIL;
                    if (c0spy4 != null) {
                        c0spy = c0spy4;
                    }
                    String str4 = c0spy.authorUid;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    c2344009Gk.LJIIIIZZ("author_id", str2);
                    c2344009Gk.LJIIIIZZ("local_time_ms", String.valueOf(System.currentTimeMillis()));
                    C20684815ws.LJIILLIIL("see_more_show", c2344009Gk.LIZ);
                    this.LLJJI = true;
                    C1351950lHl.LJIJJLI(this.LLILZIL);
                    C1351950lHl.LJIJJLI(this.LLILZ);
                    this.LLJJ = this.LLILLL.getHeight();
                    AbstractC431930Gwh abstractC431930Gwh = new AbstractC431930Gwh(this, spannableStringBuilder2, z2, zIsAdTraffic) { // from class: X.0SP2
                        public final SpannableStringBuilder LLILLJJLI;
                        public final boolean LLILLL;
                        public final boolean LLILZ;
                        public final WeakReference<C0SPV> LLILZIL;

                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            C0SPV c0spv = this.LLILZIL.get();
                            if (c0spv != null) {
                                if (this.LLILZ) {
                                    Aweme aweme4 = c0spv.LLJJJJJIL;
                                    Aweme aweme5 = null;
                                    if (aweme4 == null) {
                                        aweme4 = null;
                                    }
                                    boolean zLL = C1017070cZd.LL(aweme4);
                                    Aweme aweme6 = c0spv.LLJJJJJIL;
                                    if (aweme6 == null) {
                                        aweme6 = null;
                                    }
                                    if (!AwemeExtKt.isAdTraffic(aweme6) && zLL) {
                                        C1389890mGx c1389890mGx = new C1389890mGx(c0spv.LLILLJJLI);
                                        c1389890mGx.LJIIIZ(2131824738);
                                        c1389890mGx.LJIIJJI();
                                        return;
                                    } else {
                                        C1029590ctp.LIZIZ();
                                        Context context2 = c0spv.getContext();
                                        Aweme aweme7 = c0spv.LLJJJJJIL;
                                        if (aweme7 != null) {
                                            aweme5 = aweme7;
                                        }
                                        C0SQ9.LIZ(context2, aweme5, 1, new InterfaceC1021920chS() { // from class: X.0SP3
                                            @Override // X.InterfaceC1021920chS
                                            public final void LIZ() {
                                            }
                                        });
                                        return;
                                    }
                                }
                                c0spv.LIZIZ(this.LLILLJJLI, this.LLILLL);
                            }
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }

                        {
                            this.LLILLJJLI = spannableStringBuilder2;
                            this.LLILLL = z2;
                            this.LLILZ = zIsAdTraffic;
                            this.LLILZIL = new WeakReference<>(this);
                        }
                    };
                    abstractC431930Gwh.LL = 0;
                    C786410Ut5.q2(spannableStringBuilder, abstractC431930Gwh, 0, spannableStringBuilder.length(), 17);
                    AbstractC431930Gwh abstractC431930Gwh2 = new AbstractC431930Gwh(this, spannableStringBuilder, z, zIsAdTraffic) { // from class: X.0SP2
                        public final SpannableStringBuilder LLILLJJLI;
                        public final boolean LLILLL;
                        public final boolean LLILZ;
                        public final WeakReference<C0SPV> LLILZIL;

                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            C0SPV c0spv = this.LLILZIL.get();
                            if (c0spv != null) {
                                if (this.LLILZ) {
                                    Aweme aweme4 = c0spv.LLJJJJJIL;
                                    Aweme aweme5 = null;
                                    if (aweme4 == null) {
                                        aweme4 = null;
                                    }
                                    boolean zLL = C1017070cZd.LL(aweme4);
                                    Aweme aweme6 = c0spv.LLJJJJJIL;
                                    if (aweme6 == null) {
                                        aweme6 = null;
                                    }
                                    if (!AwemeExtKt.isAdTraffic(aweme6) && zLL) {
                                        C1389890mGx c1389890mGx = new C1389890mGx(c0spv.LLILLJJLI);
                                        c1389890mGx.LJIIIZ(2131824738);
                                        c1389890mGx.LJIIJJI();
                                        return;
                                    } else {
                                        C1029590ctp.LIZIZ();
                                        Context context2 = c0spv.getContext();
                                        Aweme aweme7 = c0spv.LLJJJJJIL;
                                        if (aweme7 != null) {
                                            aweme5 = aweme7;
                                        }
                                        C0SQ9.LIZ(context2, aweme5, 1, new InterfaceC1021920chS() { // from class: X.0SP3
                                            @Override // X.InterfaceC1021920chS
                                            public final void LIZ() {
                                            }
                                        });
                                        return;
                                    }
                                }
                                c0spv.LIZIZ(this.LLILLJJLI, this.LLILLL);
                            }
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }

                        {
                            this.LLILLJJLI = spannableStringBuilder;
                            this.LLILLL = z;
                            this.LLILZ = zIsAdTraffic;
                            this.LLILZIL = new WeakReference<>(this);
                        }
                    };
                    abstractC431930Gwh2.LL = 0;
                    C786410Ut5.q2(spannableStringBuilder2, abstractC431930Gwh2, 0, spannableStringBuilder2.length(), 17);
                }
                this.LLJILJIL = spannableStringBuilder;
                this.LLJI = spannableStringBuilder2.append((CharSequence) "\n");
                LJII(0, spannableStringBuilder, false);
                this.LLILLJJLI.setWidth(i);
                int iMin = Math.min(Integer.MAX_VALUE, lineCount);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("fullLinesCount: ");
                sbLIZ6.append(iMin);
                C2188811AlT.LIZIZ(sbLIZ6);
                HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS111S0100000_11(this, 112));
                return;
            }
            return;
        }
        HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS111S0100000_11(this, 113));
    }

    public final void LJI(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Aweme aweme = this.LLJJJJJIL;
        if (aweme == null) {
            aweme = null;
        }
        if (aweme.getDesc() == null) {
            return;
        }
        boolean zLIZJ = C444960Hcc.LIZJ(context);
        boolean zIsRtl = BidiFormatter.getInstance().isRtl(aweme.getDesc());
        int i2 = 1;
        if (zLIZJ != zIsRtl) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLILLJJLI.getLayoutParams();
            if (z) {
                if (!this.LLJJIJI) {
                    if (z2) {
                        if (this.LLJJIII) {
                            return;
                        }
                    } else if (!this.LLJJIII) {
                        return;
                    }
                }
                this.LLJJIJI = false;
                if (!this.LLJJIII) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.LLJJIII = z3;
                C720770SPb c720770SPb = this.LLILLJJLI;
                if (!zIsRtl) {
                    i2 = 0;
                }
                c720770SPb.setLayoutDirection(i2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLILZIL.getLayoutParams();
                if (zIsRtl) {
                    i = 83;
                } else {
                    i = 85;
                }
                layoutParams2.gravity = i;
                C786410Ut5.d6(this.LLILZIL, layoutParams2);
            } else if (this.LLILLJJLI.getLayoutDirection() != zLIZJ) {
                this.LLJJIJI = true;
                C720770SPb c720770SPb2 = this.LLILLJJLI;
                if (!zLIZJ) {
                    i2 = 0;
                }
                c720770SPb2.setLayoutDirection(i2);
            } else {
                return;
            }
            C720770SPb c720770SPb3 = this.LLILLJJLI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c720770SPb3);
            c720770SPb3.setLayoutParams(layoutParams);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void setDarkMode(boolean z) {
        this.LLJLLIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDesc(java.lang.CharSequence r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SPV.setDesc(java.lang.CharSequence):void");
    }

    public final void setEnableToggle(boolean z) {
        this.LLJLIL = z;
    }

    public final void setExtraBackgroundSpanColor(Integer num) {
        this.LLJJLIIIJLLLLLLLZ = num;
    }

    public final void setMaxLinesWhenFold(int i) {
        this.LLJL = i;
    }

    public final void setShouldShowPhotoDescription(boolean z) {
        this.LLJLLL = z;
    }

    public final void setSpanClickInterceptor(Function0<Unit> function0) {
        this.LLJLL = function0;
    }

    public final void setTextColor(Integer num) {
        this.LLJJL = num;
    }

    public final void setTitle(String str) {
        String title;
        Aweme aweme = this.LLJJJJJIL;
        if (aweme == null) {
            return;
        }
        if (C582980Mtk.LIZIZ(aweme)) {
            Aweme aweme2 = this.LLJJJJJIL;
            if (aweme2 == null) {
                aweme2 = null;
            }
            PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
            if (photoModeImageInfo != null) {
                title = photoModeImageInfo.getTitle();
            } else {
                title = null;
            }
            if (C703302op.LIZ(title)) {
                C786410Ut5.LLLLZLL(this.LL, 0);
                TuxTextView tuxTextView = this.LL;
                if (str == null) {
                    Aweme aweme3 = this.LLJJJJJIL;
                    if (aweme3 == null) {
                        aweme3 = null;
                    }
                    PhotoModeImageInfo photoModeImageInfo2 = aweme3.getPhotoModeImageInfo();
                    if (photoModeImageInfo2 != null) {
                        str = photoModeImageInfo2.getTitle();
                    } else {
                        str = null;
                    }
                }
                tuxTextView.setText(str);
                return;
            }
        }
        C786410Ut5.LLLLZLL(this.LL, 8);
    }

    public final void setUnableClickSpan(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public C0SPV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = "";
        this.LLJ = "";
        this.LLJL = 4;
        this.LLJLIL = true;
        C786410Ut5.LJLLJ(getContext(), R.layout.a3k, this);
        this.LL = (TuxTextView) findViewById(R.id.ewu);
        C720770SPb c720770SPb = (C720770SPb) findViewById(R.id.desc);
        this.LLILLJJLI = c720770SPb;
        C1340350kz3.LIZLLL(c720770SPb);
        c720770SPb.setSpanSize(c720770SPb.getTextSize());
        if (C293960Bfe.LIZ()) {
            C1340350kz3.LIZIZ(c720770SPb);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.tv_toggle);
        this.LLILLL = tuxTextView;
        this.LLILZ = (TuxTextView) findViewById(R.id.zk5);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.y5i);
        this.LLILZIL = linearLayout;
        linearLayout.setLayoutDirection(0);
        this.LLILZLL = (FrameLayout) findViewById(R.id.fmv);
        this.LLJJIJIL = (TuxTextView) findViewById(R.id.asr);
        findViewById(R.id.yhh);
        findViewById(R.id.s_v);
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, tuxTextView, EnumC1341650l19.BUTTON, 0.0f, null, 12);
        C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(this, 49));
        this.LLJJIJIIJIL = (C21279718Pj) findViewById(R.id.q0v);
        this.LLJJJ = (C0QB7) findViewById(R.id.e40);
        this.LLJJJIL = (TuxTextView) findViewById(R.id.e5h);
        this.LLJJJJ = (LinearLayout) findViewById(R.id.e5g);
    }

    public static boolean LIZJ(Aweme aweme, String str) {
        Activity activityLIZIZ;
        String str2 = str;
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (iSearchService.j0(activityLIZIZ, aweme, str2, EnumC667230QFd.SEARCH_HASH_TAG, false, false)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZIZ(SpannableStringBuilder spannableStringBuilder, boolean z) {
        String str;
        int iLIZLLL;
        if (z) {
            str = "spread";
        } else {
            str = "fold";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLIZ);
        Aweme aweme = this.LLJJJJJIL;
        Aweme aweme2 = null;
        if (aweme == null) {
            aweme = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        Aweme aweme3 = this.LLJJJJJIL;
        if (aweme3 != null) {
            aweme2 = aweme3;
        }
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme2));
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("video_detail", c2344009Gk.LIZ);
        if (z) {
            iLIZLLL = Integer.MAX_VALUE;
        } else {
            iLIZLLL = LIZLLL();
        }
        this.LLILLJJLI.setMaxLines(iLIZLLL);
        if (z) {
            C1351950lHl.LJIJJ(this.LLILZ);
            this.LLILLL.setText(2131834549);
        } else {
            C1351950lHl.LJIJJLI(this.LLILZ);
            this.LLILLL.setText(2131825209);
        }
        LJII(0, spannableStringBuilder, z);
        if (this.LLJJ == 0) {
            this.LLJJ = this.LLILLL.getHeight();
        }
    }

    public final void LIZ(Aweme aweme, C0SPY c0spy, String str) throws Throwable {
        C0SPY c0spy2;
        String str2;
        Integer numValueOf;
        String str3;
        Integer num;
        Integer num2;
        Object objLJIILLIIL;
        Fragment fragment;
        Fragment fragmentLIZLLL;
        int length;
        C0SPY c0spy3 = c0spy;
        this.LLJJJJJIL = aweme;
        this.LLJJJJLIIL = c0spy3;
        Integer num3 = null;
        if (c0spy3 == null) {
            c0spy2 = null;
        } else {
            c0spy2 = c0spy3;
        }
        this.LLIZ = c0spy2.eventType;
        if (c0spy3 == null) {
            c0spy3 = null;
        }
        this.LLIZLLLIL = c0spy3.pageType;
        if (this.LLJLLL) {
            str2 = "graphic_detail";
        } else {
            str2 = "";
        }
        this.LLJ = str2;
        this.LLLI = str;
        this.LLILLL.setText(getContext().getString(2131825209));
        this.LLLII = C0SQ4.LIZ(aweme.getCreateTime() * 1000, getContext());
        if (!this.LLJLLL) {
            setTitle(null);
            setDesc(null);
        }
        Aweme aweme2 = this.LLJJJJJIL;
        if (aweme2 == null) {
            aweme2 = null;
        }
        String contentDesc = aweme2.getContentDesc();
        if (contentDesc != null) {
            try {
                JSONArray jSONArray = new JSONArray(contentDesc);
                int length2 = jSONArray.length();
                String[] strArr = new String[length2];
                int length3 = 0;
                for (int i = 0; i < length2; i++) {
                    String string = jSONArray.get(i).toString();
                    strArr[i] = string;
                    length3 += string.length();
                }
                this.LLLFF = length2 - 1;
                this.LLLF = length3;
                if (length2 > 1) {
                    this.LLJZ = new SpannableStringBuilder(TextUtils.join("\n", strArr));
                    this.LLL = strArr;
                }
            } catch (JSONException th) {
            }
        }
        String[] strArr2 = this.LLL;
        Aweme aweme3 = this.LLJJJJJIL;
        if (aweme3 == null) {
            aweme3 = null;
        }
        List<TextExtraStruct> contentDescExtra = aweme3.getContentDescExtra();
        if (strArr2 != null && contentDescExtra != null) {
            int length4 = strArr2.length;
            int[] iArr = new int[length4];
            for (int i2 = 0; i2 < length4; i2++) {
                String str4 = strArr2[i2];
                if (str4 != null) {
                    length = str4.length();
                } else {
                    length = 0;
                }
                iArr[i2] = length;
            }
            ArrayList arrayList = new ArrayList();
            for (TextExtraStruct textExtraStruct : contentDescExtra) {
                int lineIndex = textExtraStruct.getLineIndex();
                int i3 = 0;
                for (int i4 = 0; i4 < lineIndex; i4++) {
                    i3 += iArr[i4];
                }
                int start = textExtraStruct.getStart() + i3 + lineIndex;
                int end = (textExtraStruct.getEnd() + start) - textExtraStruct.getStart();
                TextExtraStruct textExtraStructM271clone = textExtraStruct.m271clone();
                textExtraStructM271clone.setStart(start);
                textExtraStructM271clone.setEnd(end);
                arrayList.add(textExtraStructM271clone);
            }
            this.LLJZIJLIL = arrayList;
        }
        setCollabInfo(aweme);
        Integer num4 = this.LLJJL;
        if (num4 != null) {
            this.LLILLJJLI.setTextColor(num4.intValue());
        }
        C720770SPb c720770SPb = this.LLILLJJLI;
        c720770SPb.setSpanColor(c720770SPb.getCurrentTextColor());
        this.LLILLJJLI.setOnSpanClickListener(new InterfaceC1355720lNq() { // from class: X.0SOu
            /* JADX WARN: Removed duplicated region for block: B:186:0x04b3  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x04c1  */
            /* JADX WARN: Removed duplicated region for block: B:236:0x0598  */
            /* JADX WARN: Removed duplicated region for block: B:246:0x05dc  */
            /* JADX WARN: Removed duplicated region for block: B:460:0x0adc A[PHI: r8
              0x0adc: PHI (r8v11 java.lang.String) = (r8v8 java.lang.String), (r8v12 java.lang.String) binds: [B:459:0x0ada, B:457:0x0ad7] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:462:0x0ae2 A[PHI: r8
              0x0ae2: PHI (r8v10 java.lang.String) = (r8v8 java.lang.String), (r8v11 java.lang.String) binds: [B:459:0x0ada, B:461:0x0ae0] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:475:0x0b3e A[PHI: r8
              0x0b3e: PHI (r8v13 java.lang.String) = (r8v6 java.lang.String), (r8v14 java.lang.String) binds: [B:452:0x0ac7, B:450:0x0ac4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1355720lNq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.ss.android.ugc.aweme.model.TextExtraStruct r26) {
                /*
                    Method dump skipped, instruction units count: 2883
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C720700SOu.LIZ(com.ss.android.ugc.aweme.model.TextExtraStruct):void");
            }
        });
        Aweme aweme4 = this.LLJJJJJIL;
        if (aweme4 == null) {
            aweme4 = null;
        }
        if (!C2093608Ic.LJ(C1017070cZd.LJIL(aweme4))) {
            C21279718Pj c21279718Pj = this.LLJJIJIIJIL;
            C21279518Ph c21279518PhLIZ = C988900bqC.LIZ();
            Aweme aweme5 = this.LLJJJJJIL;
            if (aweme5 == null) {
                aweme5 = null;
            }
            c21279518PhLIZ.LJIIL(C1017070cZd.LJIL(aweme5));
            c21279518PhLIZ.LJIILJJIL(62);
            c21279518PhLIZ.LJIILIIL(c21279718Pj.getResources().getColor(R.color.di));
            c21279518PhLIZ.LIZ(c21279718Pj.getResources().getColor(R.color.ak));
            c21279518PhLIZ.LIZIZ(C0HD5.LIZIZ(c21279718Pj, Float.valueOf(2.0f)));
            c21279518PhLIZ.LIZJ(TextUtils.TruncateAt.END);
            c21279518PhLIZ.LJI();
            c21279518PhLIZ.LJIIJJI(new RelativeLayout.LayoutParams(-2, -2));
            c21279518PhLIZ.LJIIIIZZ(C0HD5.LIZ(c21279718Pj, 5));
            c21279518PhLIZ.LJIIJ(C0HD5.LIZ(c21279718Pj, 1));
            c21279518PhLIZ.LJIIIZ(C0HD5.LIZ(c21279718Pj, 5));
            c21279518PhLIZ.LJII(C0HD5.LIZ(c21279718Pj, 1));
            C21279618Pi c21279618Pi = c21279518PhLIZ.LIZ;
            if (c21279618Pi != null) {
                c21279718Pj.LIZ(c21279618Pi);
            }
            Aweme aweme6 = this.LLJJJJJIL;
            if (aweme6 == null) {
                aweme6 = null;
            }
            List<BrandedContentAccount> brandContentAccounts = aweme6.getBrandContentAccounts();
            if (brandContentAccounts != null) {
                if (brandContentAccounts.size() > 0 && ListProtector.get(brandContentAccounts, 0) != null) {
                    C786410Ut5.O8(c21279718Pj, new ACListenerS115S0200000_11(brandContentAccounts, this, 1));
                }
            } else {
                C786410Ut5.O8(c21279718Pj, new View.OnClickListener() { // from class: X.0SPa
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
            C786410Ut5.LLLLILI(this.LLJJIJIIJIL, 0);
        } else {
            C786410Ut5.LLLLILI(this.LLJJIJIIJIL, 8);
        }
        Aweme aweme7 = this.LLJJJJJIL;
        if (aweme7 == null) {
            aweme7 = null;
        }
        this.LLILLJJLI.getClass();
        this.LLILZLL.getLayoutParams().height = -2;
        if (getContext() != null) {
            LJIIIIZZ(this, aweme7, null, 0, false, 14);
            try {
                if (C444960Hcc.LIZJ(getContext())) {
                    C720770SPb c720770SPb2 = this.LLILLJJLI;
                    if (C431180GvU.LIZJ == null) {
                        C431180GvU.LIZJ = new C431180GvU();
                    }
                    c720770SPb2.setMovementMethod(C431180GvU.LIZJ);
                } else {
                    C720770SPb c720770SPb3 = this.LLILLJJLI;
                    if (C431200GvW.LIZJ == null) {
                        synchronized (C13LE.LIZ(C431230GvZ.class)) {
                            try {
                                if (C431200GvW.LIZJ == null) {
                                    C431200GvW.LIZJ = new C431200GvW();
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    c720770SPb3.setMovementMethod(C431200GvW.LIZJ);
                }
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            }
            if (this.LLLFZ == 0) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
                if (c19egLIZIZ != null) {
                    objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
                } else {
                    objLJIILLIIL = null;
                }
                if (objLJIILLIIL instanceof Fragment) {
                    fragment = (Fragment) objLJIILLIIL;
                } else {
                    fragment = null;
                }
                IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                if (iDetailFeedSafService != null) {
                    fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment);
                } else {
                    fragmentLIZLLL = null;
                }
                ViewTreeObserverOnGlobalLayoutListenerC738840SyY viewTreeObserverOnGlobalLayoutListenerC738840SyY = new ViewTreeObserverOnGlobalLayoutListenerC738840SyY(this, aweme7, 2);
                if (fragmentLIZLLL != null) {
                    SAFExtensionKt.LIZ(viewTreeObserverOnGlobalLayoutListenerC738840SyY, this.LLILLJJLI.getViewTreeObserver(), fragmentLIZLLL);
                } else {
                    C786410Ut5.x3(this.LLILLJJLI.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC738840SyY);
                }
            } else {
                LJFF(aweme7);
            }
        }
        if (C0SD5.LIZIZ(aweme)) {
            if (this.LLJJIJIL.getVisibility() != 0) {
                C786410Ut5.LLLLZLL(this.LLJJIJIL, 0);
                this.LLJJIJIL.setText(C0SD5.LIZ(getContext(), aweme));
                Map<String, String> c2PAMobParamFromAweme = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().parseC2PAMobParamFromAweme(aweme);
                C720800SPe c720800SPeLIZIZ = ((IAIInfoPanelService) ServiceManager.get().getService(IAIInfoPanelService.class)).LIZIZ(aweme);
                if (c720800SPeLIZIZ != null) {
                    c720800SPeLIZIZ.LIZ = this.LLIZ;
                }
                C786410Ut5.h9(this.LLJJIJIL, new ACListenerS48S0400000_11(aweme, this, c720800SPeLIZIZ, c2PAMobParamFromAweme, 0));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", this.LLIZ);
                c2344009Gk.LJII(c2PAMobParamFromAweme);
                AIGCInfo aIGCInfo = aweme.aigcInfo;
                if (aIGCInfo != null) {
                    numValueOf = Integer.valueOf(aIGCInfo.getAIGCLabelType());
                } else {
                    numValueOf = null;
                }
                c2344009Gk.LJ(numValueOf, "aigc_label_type");
                if (C0SD6.LIZ()) {
                    if (c720800SPeLIZIZ != null) {
                        str3 = c720800SPeLIZIZ.LJI;
                    } else {
                        str3 = null;
                    }
                } else {
                    str3 = "";
                }
                c2344009Gk.LJIIIIZZ("aigc_creation_channel", str3);
                if (c720800SPeLIZIZ != null) {
                    num = c720800SPeLIZIZ.LJII;
                } else {
                    num = null;
                }
                c2344009Gk.LJ(num, "moderation_aigc_label_type");
                if (c720800SPeLIZIZ != null) {
                    num2 = c720800SPeLIZIZ.LJIIIIZZ;
                } else {
                    num2 = null;
                }
                c2344009Gk.LJ(num2, "fingerprint_id");
                if (c720800SPeLIZIZ != null) {
                    num3 = c720800SPeLIZIZ.LJIIIZ;
                }
                c2344009Gk.LJ(num3, "invisible_watermark");
                C20684815ws.LJIILLIIL("view_creator_label_aigc", c2344009Gk.LIZ);
                return;
            }
            return;
        }
        C786410Ut5.LLLLZLL(this.LLJJIJIL, 8);
    }

    public final void LJII(int i, CharSequence charSequence, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDescSafely showFull:");
        sbLIZ.append(z);
        sbLIZ.append(" desc:");
        sbLIZ.append((Object) charSequence);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            Aweme aweme = this.LLJJJJJIL;
            Aweme aweme2 = null;
            if (aweme == null) {
                aweme = null;
            }
            String descLanguage = aweme.getDescLanguage();
            Aweme aweme3 = this.LLJJJJJIL;
            if (aweme3 == null) {
                aweme3 = null;
            }
            if (this.LLJZ != null && aweme3.getContentDesc() != null) {
                if (z) {
                    this.LLILLJJLI.LJJJJ(this.LLJZ, descLanguage);
                    Aweme aweme4 = this.LLJJJJJIL;
                    if (aweme4 == null) {
                        aweme4 = null;
                    }
                    LJIIIIZZ(this, aweme4, null, 0, z, 6);
                    return;
                }
            } else if (z) {
                this.LLILLJJLI.LJJJJ(charSequence, descLanguage);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            SpannableStringBuilder endOmitTextAndTime = getEndOmitTextAndTime();
            this.LLILLJJLI.LJJJJ(spannableStringBuilder, descLanguage);
            this.LLILZ.setText(endOmitTextAndTime);
            Aweme aweme5 = this.LLJJJJJIL;
            if (aweme5 != null) {
                aweme2 = aweme5;
            }
            LJIIIIZZ(this, aweme2, Boolean.TRUE, i, false, 8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ(C0SPV c0spv, Aweme aweme, Boolean bool, int i, boolean z, int i2) {
        boolean z2;
        int iIntValue;
        int iLJ;
        float f;
        float f2;
        final int i3 = i;
        final Boolean bool2 = bool;
        if ((i2 & 2) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        c0spv.getClass();
        if (aweme != null) {
            List<? extends TextExtraStruct> textExtra = aweme.getTextExtra();
            if (c0spv.LLJJI && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            List<? extends TextExtraStruct> list = c0spv.LLJZIJLIL;
            if (list != null && z2) {
                textExtra = list;
            }
            if (C301000Br0.LIZIZ && !AwemeExtKt.isAdTraffic(aweme) && textExtra != null) {
                C19719612Di.LJJIIJ(textExtra, AFwS243S0000000_11.get$arr$(619), true);
            }
            if (!AwemeExtKt.isScheduleVideo(aweme)) {
                c0spv.LLILLJJLI.LJJJJIZL(textExtra, null, new C0SQF() { // from class: X.0SPZ
                    @Override // X.C0SQF
                    public final boolean LIZ(TextExtraStruct textExtraStruct) {
                        if (!C11VF.LIZIZ.LIZLLL(textExtraStruct)) {
                            if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                                if (textExtraStruct.getStart() > i3 || textExtraStruct.getEnd() > i3) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return true;
                    }
                });
            }
            ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIJJI((int) c0spv.LLILLJJLI.getTextSize(), aweme, c0spv.LLIZ, new AwS660S0100000_11(c0spv, 3));
            if (textExtra != null && !TextUtils.isEmpty(aweme.getDesc())) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    int end = textExtraStruct.getEnd();
                    Boolean bool3 = Boolean.TRUE;
                    if (!Intrinsics.LJFF(bool2, bool3) || textExtraStruct.getStart() < i3) {
                        if (Intrinsics.LJFF(bool2, bool3) && textExtraStruct.getStart() < i3 && textExtraStruct.getEnd() > i3) {
                            end = i3;
                        }
                        if (c0spv.LJ(textExtraStruct) && ((textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || C11VF.LIZIZ.LJ(textExtraStruct))) {
                            if (C722510SVt.LIZJ()) {
                                iLJ = 0;
                            } else {
                                Integer num = c0spv.LLJJLIIIJLLLLLLLZ;
                                if (num != null) {
                                    iLJ = num.intValue();
                                } else {
                                    iLJ = C1351950lHl.LJ(R.attr.bs, R.color.ak, c0spv.getContext());
                                }
                            }
                            C428830Grh c428830Grh = new C428830Grh(c0spv.getContext(), Math.round(C12ES.LJIIJ(c0spv.getContext()) - C12ES.LIZJ(85.0f, c0spv.getContext())), iLJ, C1351950lHl.LJ(R.attr.a1h, R.color.da, c0spv.getContext()), textExtraStruct, !c0spv.LLJLLIL, null, false, C722510SVt.LIZJ(), null, 1728);
                            if (c428830Grh.getSize(new TextPaint(c0spv.LLILLJJLI.getPaint()), aweme.getDesc(), textExtraStruct.getStart(), end, c0spv.LLILLJJLI.getPaint().getFontMetricsInt()) + c0spv.LLILLJJLI.getPaint().measureText(aweme.getDesc().substring(0, textExtraStruct.getStart())) > 852.0f) {
                                c428830Grh.LLJJIJI = true;
                            }
                            Context context = c0spv.getContext();
                            if (C722510SVt.LIZJ()) {
                                f = 8.0f;
                            } else {
                                f = 12.0f;
                            }
                            c428830Grh.LLJILLL = C12ES.LIZJ(f, context);
                            c428830Grh.LLJJ = C12ES.LIZJ(2.0f, c0spv.getContext());
                            Context context2 = c0spv.getContext();
                            if (C722510SVt.LIZJ()) {
                                f2 = 15.0f;
                            } else {
                                f2 = 13.0f;
                            }
                            c428830Grh.LLJILJIL = C12ES.LIZJ(f2, context2);
                            c0spv.LLILLJJLI.LJJJJI(textExtraStruct.getStart(), end, c428830Grh);
                            if (4 == textExtraStruct.getSubtype()) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("enter_from", c0spv.LLIZ);
                                Aweme aweme2 = c0spv.LLJJJJJIL;
                                if (aweme2 == null) {
                                    aweme2 = null;
                                }
                                c2344009Gk.LJIIIIZZ("group_id", aweme2.getAid());
                                Aweme aweme3 = c0spv.LLJJJJJIL;
                                if (aweme3 == null) {
                                    aweme3 = null;
                                }
                                c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme3));
                                Aweme aweme4 = c0spv.LLJJJJJIL;
                                if (aweme4 == null) {
                                    aweme4 = null;
                                }
                                c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme4));
                                C20684815ws.LJIILLIIL("duet_with_show", c2344009Gk.LIZ);
                            }
                        }
                        if (textExtraStruct.getType() == 1 && textExtraStruct.getSubtype() == 15) {
                            C720770SPb c720770SPb = c0spv.LLILLJJLI;
                            int start = textExtraStruct.getStart();
                            int end2 = textExtraStruct.getEnd();
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c0spv.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = -1;
                            }
                            c720770SPb.LJJJJI(start, end2, new ForegroundColorSpan(iIntValue));
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJIIIIZZ("video_id", aweme.getAid());
                            c2344009Gk2.LJIIIIZZ("challenge_id", textExtraStruct.getCid());
                            C20684815ws.LJIILLIIL("hashtag_removal_video_tag_show", c2344009Gk2.LIZ);
                        }
                    }
                }
            }
            c0spv.LLILLJJLI.setAdHashTag(aweme);
        }
    }
}
