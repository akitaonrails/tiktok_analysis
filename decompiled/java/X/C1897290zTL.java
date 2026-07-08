package X;

import Y.ACListenerS60S0400000_28;
import Y.ARunnableS23S0101000_12;
import Y.ARunnableS36S0400000_28;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.Body;
import com.bytedance.touchpoint.api.model.Content;
import com.bytedance.touchpoint.api.model.FeedBannerSpecialCardPicture;
import com.bytedance.touchpoint.api.model.FeedButton;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.Request;
import com.bytedance.touchpoint.api.model.SubTitle;
import com.bytedance.touchpoint.api.model.TaskDoneData;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0zTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897290zTL implements InterfaceC690020R4u {
    public boolean LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public View LJFF;
    public LinearLayout LJI;
    public C1322110kVd LJII;
    public ImageView LJIIIIZZ;
    public LinearLayout LJIIIZ;
    public TuxTextView LJIIJ;
    public TuxTextView LJIIJJI;
    public C1295960jpS LJIIL;
    public C197039127h LJIILIIL;
    public C197039127h LJIILJJIL;
    public C1322110kVd LJIILL;
    public TuxTextView LJIILLIIL;
    public C0T8I LJIIZILJ;
    public TuxTextView LJIJ;
    public TuxTextView LJIJI;
    public C1897450zTb LJIJJ;
    public FrameLayout LJIJJLI;
    public ConstraintLayout LJIL;
    public ConstraintLayout LJJ;
    public ConstraintLayout LJJI;
    public TuxTextView LJJIFFI;
    public ReferralFeedBanner LJJII;
    public Context LJJIII;
    public boolean LJJIIZI;
    public ARunnableS36S0400000_28 LJJIJIIJI;
    public int LJJIIJ = -1;
    public String LJJIIJZLJL = "";
    public final int LJJIIZ = 49;
    public final BPEAHandler LJJIJ = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC690020R4u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r14 = this;
            r10 = r14
            boolean r0 = r10.LIZ
            if (r0 == 0) goto Lf
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C1620370sGh.LIZ(r0)
            return
        Lf:
            int r1 = r10.LJJIIJ
            if (r1 >= 0) goto L14
            return
        L14:
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r0 = r10.LJJII
            r7 = 0
            if (r0 == 0) goto L50
            java.util.List<com.bytedance.touchpoint.api.model.FeedBannerSpecialCardPicture> r0 = r0.feedBannerSpecialCardPicture
            if (r0 == 0) goto L50
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            com.bytedance.touchpoint.api.model.FeedBannerSpecialCardPicture r2 = (com.bytedance.touchpoint.api.model.FeedBannerSpecialCardPicture) r2
            if (r2 == 0) goto L50
            com.bytedance.touchpoint.api.model.Animation r9 = r2.animation
            if (r9 == 0) goto L47
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r0 = r10.LJJII
            if (r0 == 0) goto Lae
            int r11 = r0.LIZ
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto Laf
            int r12 = r0.intValue()
        L37:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0zTO r8 = new X.0zTO
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r13, r13, r8, r0)
        L47:
            com.bytedance.touchpoint.api.model.SubTitle r1 = r2.subTitle
            if (r1 == 0) goto L50
            com.bytedance.tux.input.TuxTextView r0 = r10.LJIIJJI
            r10.LJIIL(r1, r0)
        L50:
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r0 = r10.LJJII
            if (r0 == 0) goto Lab
            int r3 = r0.LIZ
            java.lang.Integer r0 = r0.LIZJ
            if (r0 == 0) goto Lac
            int r2 = r0.intValue()
        L5e:
            Y.ACallableS3S0002000_11 r1 = new Y.ACallableS3S0002000_11
            r0 = 1
            r1.<init>(r3, r2, r0)
            X.C15O7.LIZJ(r1)
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r4 = r10.LJJII
            if (r4 == 0) goto Laa
            X.0zOY r6 = X.C1894320zOY.LIZ
            int r8 = r4.LIZ
            r3 = 2
            kotlin.Pair[] r5 = new kotlin.Pair[r3]
            java.lang.String r2 = r10.LJIIIIZZ()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "task_key"
            r1.<init>(r0, r2)
            r5[r7] = r1
            int r0 = r10.LJII()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "vv_cnt"
            r1.<init>(r0, r2)
            r0 = 1
            r5[r0] = r1
            java.util.Map r9 = X.C2097608Jq.LJIIJ(r5)
            r10 = 0
            java.lang.String r13 = ""
            r6.getClass()
            r11 = r10
            r12 = r10
            X.C1894320zOY.LJIJJ(r8, r9, r10, r11, r12, r13)
            Y.ARunnableS23S0101000_12 r1 = new Y.ARunnableS23S0101000_12
            r0 = 35
            r1.<init>(r3, r4, r0)
            X.C13054058y.LIZ(r1)
        Laa:
            return
        Lab:
            r3 = 0
        Lac:
            r2 = 0
            goto L5e
        Lae:
            r11 = 0
        Laf:
            r12 = -1
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897290zTL.LIZLLL():void");
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZIZ() {
        C1295960jpS c1295960jpS = this.LJIIL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LJIIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.clearAnimation();
        }
        ARunnableS36S0400000_28 aRunnableS36S0400000_28 = this.LJJIJIIJI;
        if (aRunnableS36S0400000_28 != null) {
            this.LJJIJ.removeCallbacks(aRunnableS36S0400000_28);
        }
        this.LJJIJIIJI = null;
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZJ() {
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LJFF;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LIZLLL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        this.LIZ = false;
    }

    public final int LJII() {
        List<FeedBannerSpecialCardPicture> list;
        FeedBannerSpecialCardPicture feedBannerSpecialCardPicture;
        Integer num;
        ReferralFeedBanner referralFeedBanner = this.LJJII;
        if (referralFeedBanner == null || (list = referralFeedBanner.feedBannerSpecialCardPicture) == null || (feedBannerSpecialCardPicture = (FeedBannerSpecialCardPicture) C13LP.LJJJLZIJ(this.LJJIIJ, list)) == null || (num = feedBannerSpecialCardPicture.multiShowCount) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String LJIIIIZZ() {
        List<FeedBannerSpecialCardPicture> list;
        FeedBannerSpecialCardPicture feedBannerSpecialCardPicture;
        String str;
        ReferralFeedBanner referralFeedBanner = this.LJJII;
        return (referralFeedBanner == null || (list = referralFeedBanner.feedBannerSpecialCardPicture) == null || (feedBannerSpecialCardPicture = (FeedBannerSpecialCardPicture) C13LP.LJJJLZIJ(this.LJJIIJ, list)) == null || (str = feedBannerSpecialCardPicture.taskKey) == null) ? "" : str;
    }

    @Override // X.InterfaceC690020R4u
    public final boolean isShowing() {
        View view = this.LIZIZ;
        return view != null && view.getVisibility() == 0;
    }

    public static Drawable LJI(int i, String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        gradientDrawable.setColor(C0SVC.LIZIZ(C0SVC.LIZ, str));
        return gradientDrawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0370  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.touchpoint.api.model.ReferralFeedBanner r23, android.content.Context r24) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897290zTL.LJ(com.bytedance.touchpoint.api.model.ReferralFeedBanner, android.content.Context):void");
    }

    public final SpannableString LJFF(int i, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str);
        Matcher matcher = PatternProtector.compile("\\{tux_icon:(.+?)\\}").matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            Context context = this.LJJIII;
            if (context != null) {
                if (strGroup == null) {
                    strGroup = "";
                }
                int iN3 = C786410Ut5.n3(context.getResources(), strGroup, "raw", context.getPackageName());
                if (iN3 != 0) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = iN3;
                    c419910GdJ.LIZIZ = i;
                    c419910GdJ.LIZJ = i;
                    final TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                    ImageSpan imageSpan = new ImageSpan(tuxIconDrawableLIZ) { // from class: X.0GWL
                        public int LL;
                        public int LLILLJJLI;
                        public WeakReference<Drawable> LLILLL;

                        @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
                        public final Drawable getDrawable() {
                            Drawable drawable;
                            WeakReference<Drawable> weakReference = this.LLILLL;
                            if (weakReference == null || (drawable = weakReference.get()) == null) {
                                drawable = super.getDrawable();
                                double intrinsicWidth = ((double) drawable.getIntrinsicWidth()) / ((double) drawable.getIntrinsicHeight());
                                int intrinsicWidth2 = this.LL;
                                if (intrinsicWidth2 <= 0) {
                                    intrinsicWidth2 = drawable.getIntrinsicWidth();
                                }
                                this.LL = intrinsicWidth2;
                                int intrinsicHeight = this.LLILLJJLI;
                                if (intrinsicHeight <= 0) {
                                    intrinsicHeight = drawable.getIntrinsicHeight();
                                }
                                this.LLILLJJLI = intrinsicHeight;
                                if (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight()) {
                                    this.LLILLJJLI = (int) (((double) this.LL) / intrinsicWidth);
                                } else if (drawable.getIntrinsicWidth() < drawable.getIntrinsicHeight()) {
                                    this.LL = (int) (((double) this.LLILLJJLI) * intrinsicWidth);
                                }
                                drawable.setBounds(0, 0, this.LL, this.LLILLJJLI);
                                this.LLILLL = new WeakReference<>(drawable);
                            }
                            return drawable;
                        }

                        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                        public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                            Rect bounds = getDrawable().getBounds();
                            if (fontMetricsInt != null) {
                                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                                int i4 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
                                int iHeight = bounds.height();
                                int i5 = fontMetricsInt2.ascent - ((int) ((iHeight - i4) / 2.0f));
                                fontMetricsInt.ascent = i5;
                                int i6 = iHeight + i5;
                                fontMetricsInt.descent = i6;
                                fontMetricsInt.top = i5;
                                fontMetricsInt.bottom = i6;
                            }
                            return bounds.right;
                        }

                        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                        public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                            canvas.save();
                            int i7 = getDrawable().getBounds().bottom;
                            canvas.translate(f + 0, (i6 - i7) - (((i6 - i4) / 2) - ((i7 - r0.top) / 2)));
                            getDrawable().draw(canvas);
                            canvas.restore();
                        }
                    };
                    tuxIconDrawableLIZ.setBounds(0, 0, i, i);
                    C786410Ut5.p2(spannableString, imageSpan, matcher.start(), matcher.end(), 33);
                }
            }
        }
        return spannableString;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJIIIZ(FeedButton feedButton, ReferralFeedBanner referralFeedBanner) {
        String str;
        String str2;
        final String str3;
        Body body;
        String str4 = feedButton.buttonAction;
        if (str4 != null && str4.length() != 0) {
            String str5 = feedButton.buttonAction;
            final INetworkApi iNetworkApiLIZJ = null;
            switch (str5.hashCode()) {
                case 94756344:
                    if (str5.equals("close")) {
                        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(748));
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0ROY(referralFeedBanner, 1, null), 3);
                        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                        int i = referralFeedBanner.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("click_position", "close");
                        linkedHashMap.put("task_key", LJIIIIZZ());
                        linkedHashMap.put("vv_cnt", String.valueOf(LJII()));
                        c1894320zOY.getClass();
                        C1894320zOY.LJIILJJIL(i, linkedHashMap, null, null, null);
                    }
                    break;
                case 109757538:
                    if (str5.equals("start")) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0ROY(referralFeedBanner, 0, null), 3);
                        C1898110zUf c1898110zUf = C1898110zUf.LL;
                        String str6 = feedButton.taskEventKey;
                        c1898110zUf.getClass();
                        C1898110zUf.LJIILIIL(str6, false);
                        C1894320zOY c1894320zOY2 = C1894320zOY.LIZ;
                        int i2 = referralFeedBanner.LIZ;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("click_position", "confirm");
                        linkedHashMap2.put("task_key", LJIIIIZZ());
                        linkedHashMap2.put("vv_cnt", String.valueOf(LJII()));
                        c1894320zOY2.getClass();
                        C1894320zOY.LJIILJJIL(i2, linkedHashMap2, null, null, null);
                    }
                    break;
                case 684908907:
                    if (str5.equals("jump_link")) {
                        LJIIJ(feedButton, referralFeedBanner);
                    }
                    break;
                case 1095692943:
                    if (str5.equals("request")) {
                        Pair[] pairArr = new Pair[1];
                        Request request = feedButton.request;
                        if (request == null || (body = request.body) == null || (str = body.taskKey) == null) {
                            str = "";
                        }
                        pairArr[0] = new Pair("task_key", str);
                        final Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                        C1894320zOY c1894320zOY3 = C1894320zOY.LIZ;
                        int i3 = referralFeedBanner.LIZ;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("click_position", "confirm");
                        linkedHashMap3.put("task_key", LJIIIIZZ());
                        linkedHashMap3.put("vv_cnt", String.valueOf(LJII()));
                        c1894320zOY3.getClass();
                        C1894320zOY.LJIILJJIL(i3, linkedHashMap3, null, null, null);
                        C13054058y.LIZ(new ARunnableS23S0101000_12(0, referralFeedBanner, 35));
                        try {
                            Request request2 = feedButton.request;
                            if (request2 == null || (str2 = request2.url) == null) {
                                str2 = "";
                            }
                            final String strDecode = Uri.decode(str2);
                            Request request3 = feedButton.request;
                            if (request3 == null || (str3 = request3.method) == null) {
                                str3 = "";
                            }
                            if (strDecode != null && strDecode.length() != 0 && str3.length() != 0) {
                                C197039127h c197039127h = this.LJIILIIL;
                                if (c197039127h != null) {
                                    c197039127h.setLoading(true);
                                }
                                C01GW<C1897600zTq> c01gw = C1897600zTq.LJII;
                                final C1897600zTq c1897600zTqLIZ = C1897460zTc.LIZ();
                                InterfaceC1897220zTE interfaceC1897220zTE = new InterfaceC1897220zTE() { // from class: X.0zTD
                                    @Override // X.InterfaceC1897220zTE
                                    public final void onFail() {
                                        Activity activityLJIILL;
                                        C197039127h c197039127h2 = this.LIZ.LJIILIIL;
                                        if (c197039127h2 != null) {
                                            c197039127h2.setLoading(false);
                                        }
                                        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                                        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                                        if (abstractC1896090zRP != null && (activityLJIILL = abstractC1896090zRP.LJIILL()) != null) {
                                            C1389890mGx c1389890mGx = new C1389890mGx(activityLJIILL);
                                            c1389890mGx.LJIIIZ(2131834522);
                                            c1389890mGx.LJIIJJI();
                                        }
                                        C1896300zRk c1896300zRk = (C1896300zRk) c1619720sFe.LIZ(8);
                                        if (c1896300zRk != null) {
                                            c1896300zRk.LJFF();
                                        }
                                    }

                                    @Override // X.InterfaceC1897220zTE
                                    public final void LIZ(TaskDoneData taskDoneData) {
                                        Activity activityLJIILL;
                                        List<TouchPoint> list;
                                        TouchPoint next;
                                        FeedBannerSpecialCardPicture feedBannerSpecialCardPicture;
                                        SubTitle subTitle;
                                        C197039127h c197039127h2 = this.LIZ.LJIILIIL;
                                        if (c197039127h2 != null) {
                                            c197039127h2.setLoading(false);
                                        }
                                        if (taskDoneData != null && taskDoneData.mactNoClaimable) {
                                            C01GW<FeedTimerPendantManger> c01gw2 = FeedTimerPendantManger.LLJL;
                                            C1893440zN8.LIZ().LJLIL();
                                        }
                                        if (taskDoneData != null && (list = taskDoneData.touchPointData) != null) {
                                            Iterator<TouchPoint> it2 = list.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next = it2.next();
                                                    if (next.touchPointId == 8) {
                                                        break;
                                                    }
                                                } else {
                                                    next = null;
                                                    break;
                                                }
                                            }
                                            TouchPoint touchPoint = next;
                                            if (touchPoint != null) {
                                                C1897290zTL c1897290zTL = this.LIZ;
                                                ReferralFeedBanner referralFeedBanner2 = (ReferralFeedBanner) C20484080s.LIZ(touchPoint.data, ReferralFeedBanner.class);
                                                referralFeedBanner2.LIZ = touchPoint.touchPointId;
                                                referralFeedBanner2.LIZIZ = touchPoint.touchPointName;
                                                int i4 = touchPoint.launchPlanId;
                                                if (i4 == null) {
                                                    i4 = -1;
                                                }
                                                referralFeedBanner2.LIZJ = i4;
                                                String str7 = touchPoint.abVersions;
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                referralFeedBanner2.LIZLLL = str7;
                                                c1897290zTL.LJJII = referralFeedBanner2;
                                                Context context = c1897290zTL.LJJIII;
                                                if (context != null) {
                                                    c1897290zTL.LJ(referralFeedBanner2, context);
                                                    List<FeedBannerSpecialCardPicture> list2 = referralFeedBanner2.feedBannerSpecialCardPicture;
                                                    if (list2 != null && (feedBannerSpecialCardPicture = (FeedBannerSpecialCardPicture) ListProtector.get(list2, c1897290zTL.LJJIIJ)) != null && (subTitle = feedBannerSpecialCardPicture.subTitle) != null) {
                                                        c1897290zTL.LJIIL(subTitle, c1897290zTL.LJIIJJI);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                                        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                                        if (abstractC1896090zRP != null && (activityLJIILL = abstractC1896090zRP.LJIILL()) != null) {
                                            C1389890mGx c1389890mGx = new C1389890mGx(activityLJIILL);
                                            c1389890mGx.LJIIIZ(2131834522);
                                            c1389890mGx.LJIIJJI();
                                        }
                                        C1896300zRk c1896300zRk = (C1896300zRk) c1619720sFe.LIZ(8);
                                        if (c1896300zRk == null) {
                                            return;
                                        }
                                        c1896300zRk.LJFF();
                                    }
                                };
                                c1897600zTqLIZ.getClass();
                                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                                if (interfaceC1897260zTILIZIZ != null) {
                                    iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ();
                                }
                                C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zSN
                                    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[PHI: r3
                                      0x0052: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:21:0x004e, B:22:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
                                    @Override // X.InterfaceC1478005qU
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void subscribe(X.C09AJ<java.lang.Integer> r7) {
                                        /*
                                            r6 = this;
                                            java.lang.String r5 = "TouchPointsAPI@1ef4.dynamicRequest$1"
                                            X.C1C7U.LIZ(r5)
                                            r4 = 0
                                            java.lang.String r1 = r1     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            java.lang.String r1 = r1.toUpperCase(r0)     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            java.lang.String r0 = "GET"
                                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            if (r0 == 0) goto L2b
                                            com.bytedance.touchpoint.api.interfaces.INetworkApi r2 = r2     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            if (r2 == 0) goto L4e
                                            java.lang.String r1 = r3     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            java.util.Map<java.lang.String, java.lang.String> r0 = r4     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            com.google.common.util.concurrent.ListenableFuture r0 = r2.dynamicGet(r1, r0)     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            if (r0 == 0) goto L4e
                                            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            goto L50
                                        L2b:
                                            com.bytedance.touchpoint.api.interfaces.INetworkApi r2 = r2     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            if (r2 == 0) goto L4e
                                            java.lang.String r1 = r3     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            java.util.Map<java.lang.String, java.lang.String> r0 = r4     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            com.google.common.util.concurrent.ListenableFuture r0 = r2.dynamicPost(r1, r0)     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            if (r0 == 0) goto L4e
                                            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L45 java.lang.InterruptedException -> L4a
                                            goto L50
                                        L40:
                                            r0 = move-exception
                                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                            goto L4e
                                        L45:
                                            r0 = move-exception
                                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                            goto L4e
                                        L4a:
                                            r0 = move-exception
                                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                        L4e:
                                            r3 = r4
                                            goto L52
                                        L50:
                                            if (r3 != 0) goto L5f
                                        L52:
                                            kotlin.jvm.internal.AwS572S0100000_28 r2 = new kotlin.jvm.internal.AwS572S0100000_28
                                            r1 = r7
                                            X.11Ke r1 = (X.C19482611Ke) r1
                                            r0 = 865(0x361, float:1.212E-42)
                                            r2.<init>(r1, r0)
                                            X.C01U6.LIZIZ(r2)
                                        L5f:
                                            java.lang.Class<com.bytedance.touchpoint.api.model.TaskDoneReponse> r0 = com.bytedance.touchpoint.api.model.TaskDoneReponse.class
                                            java.lang.Object r1 = X.C20484080s.LIZ(r3, r0)     // Catch: java.lang.Exception -> L6a
                                            com.bytedance.touchpoint.api.model.TaskDoneReponse r1 = (com.bytedance.touchpoint.api.model.TaskDoneReponse) r1     // Catch: java.lang.Exception -> L6a
                                            if (r1 == 0) goto L6e
                                            goto L7b
                                        L6a:
                                            r0 = move-exception
                                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                        L6e:
                                            kotlin.jvm.internal.AwS572S0100000_28 r1 = new kotlin.jvm.internal.AwS572S0100000_28
                                            X.11Ke r7 = (X.C19482611Ke) r7
                                            r0 = 866(0x362, float:1.214E-42)
                                            r1.<init>(r7, r0)
                                            X.C01U6.LIZIZ(r1)
                                            goto L87
                                        L7b:
                                            X.0zTq r0 = r5
                                            r0.LIZLLL = r1
                                            r0 = 1
                                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                            r7.onNext(r0)
                                        L87:
                                            X.C1C7U.LIZIZ(r5)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C1896690zSN.subscribe(X.09AJ):void");
                                    }
                                }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336410ks(interfaceC1897220zTE, c1897600zTqLIZ, 5));
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            return;
                        }
                    }
                    break;
            }
            return;
        }
        LJIIJ(feedButton, referralFeedBanner);
    }

    public final void LJIIJ(FeedButton feedButton, ReferralFeedBanner referralFeedBanner) {
        boolean z;
        String str = feedButton.jumpLink;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(749));
            C13054058y.LIZ(new ARunnableS23S0101000_12(1, referralFeedBanner, 35));
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i = referralFeedBanner.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("click_position", "close");
            linkedHashMap.put("task_key", LJIIIIZZ());
            linkedHashMap.put("vv_cnt", String.valueOf(LJII()));
            c1894320zOY.getClass();
            C1894320zOY.LJIILJJIL(i, linkedHashMap, null, null, null);
            return;
        }
        C13054058y.LIZ(new ARunnableS23S0101000_12(0, referralFeedBanner, 35));
        Context context = this.LJJIII;
        if (context != null) {
            C1893580zNM.LJ(C1893580zNM.LIZ, context, Integer.valueOf(referralFeedBanner.LIZ), feedButton.jumpLink, referralFeedBanner.LIZIZ, false, referralFeedBanner.LJ, null, null, 192);
        }
        C1894320zOY c1894320zOY2 = C1894320zOY.LIZ;
        int i2 = referralFeedBanner.LIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("click_position", "confirm");
        linkedHashMap2.put("task_key", LJIIIIZZ());
        linkedHashMap2.put("vv_cnt", String.valueOf(LJII()));
        c1894320zOY2.getClass();
        C1894320zOY.LJIILJJIL(i2, linkedHashMap2, null, null, null);
    }

    public final void LJIIL(SubTitle subTitle, TuxTextView tuxTextView) {
        Content content;
        Context context;
        AbstractC1896090zRP abstractC1896090zRP;
        Context contextLJIIJJI;
        int iN3;
        String str;
        if (tuxTextView != null && (content = subTitle.content) != null && content.text != null) {
            tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            Content content2 = subTitle.content;
            if (content2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(content2.text);
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                tuxTextView.setTextColor(C0SVC.LIZIZ(C0SVC.LIZ, content2.color));
            }
            String str2 = subTitle.iconName;
            boolean z = false;
            if (str2 != null && (context = this.LJJIII) != null && str2.length() != 0 && (abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0)) != null && (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) != null && (iN3 = C786410Ut5.n3(contextLJIIJJI.getResources(), str2, "raw", contextLJIIJJI.getPackageName())) != 0) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = iN3;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
                C0SVC c0svc = C0SVC.LIZ;
                Content content3 = subTitle.content;
                if (content3 == null || (str = content3.color) == null) {
                    str = "";
                }
                c419910GdJ.LIZLLL = Integer.valueOf(C0SVC.LIZIZ(c0svc, str));
                tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(c419910GdJ.LIZ(context), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            Long l = subTitle.expireTime;
            if (l != null) {
                long jLongValue = l.longValue();
                C238400w2 c238400w2 = new C238400w2();
                Long lValueOf = Long.valueOf(jLongValue - (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                long jLongValue2 = 0;
                if (lValueOf.longValue() > 0) {
                    z = true;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    jLongValue2 = lValueOf.longValue();
                }
                c238400w2.element = jLongValue2;
                ARunnableS36S0400000_28 aRunnableS36S0400000_28 = new ARunnableS36S0400000_28(c238400w2, tuxTextView, subTitle, this, 5);
                this.LJJIJIIJI = aRunnableS36S0400000_28;
                C786410Ut5.LJJZZIII(this.LJJIJ, aRunnableS36S0400000_28);
            }
        }
    }

    public final void LJIIJJI(FeedButton feedButton, C197039127h c197039127h, ReferralFeedBanner referralFeedBanner, Context context) {
        if (c197039127h != null && feedButton != null) {
            c197039127h.setText(feedButton.content.text);
            c197039127h.setTextColor(C0SVC.LIZIZ(C0SVC.LIZ, feedButton.content.color));
            String str = feedButton.bgColor;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                c197039127h.setBackground(LJI(8, str));
            }
            C786410Ut5.U8(c197039127h, new ACListenerS60S0400000_28(referralFeedBanner, context, this, feedButton, 7));
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                abstractC1896090zRP.LJ(c197039127h);
            }
        }
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZ(ViewStub viewStub, String str, Context context, int i, View view, View view2, View view3, View view4, String str2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        ViewGroup.LayoutParams layoutParams2;
        new C691600RAw(i, str2);
        LIZJ();
        if (context == null) {
            return;
        }
        this.LJJIII = context;
        viewStub.setLayoutResource(R.layout.fwz);
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = view3;
        this.LJFF = view4;
        this.LJJIIJ = i;
        this.LJJIIJZLJL = str2;
        View view5 = this.LIZIZ;
        if (view5 == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LIZIZ = viewLJLLLL;
            if (viewLJLLLL != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0zTj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                    }
                }, viewLJLLLL);
            }
            View view6 = this.LIZIZ;
            if (view6 != null) {
                view6.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0zTk
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view7) {
                        return true;
                    }
                });
            }
            View view7 = this.LIZIZ;
            if (view7 != null) {
                this.LJI = (LinearLayout) view7.findViewById(R.id.ni4);
                this.LJII = (C1322110kVd) view7.findViewById(R.id.vd6);
                this.LJIIIIZZ = (ImageView) view7.findViewById(R.id.xvu);
                this.LJIIIZ = (LinearLayout) view7.findViewById(R.id.nbd);
                this.LJIILIIL = (C197039127h) view7.findViewById(R.id.vtd);
                this.LJIILJJIL = (C197039127h) view7.findViewById(R.id.vtc);
                this.LJIIJ = (TuxTextView) view7.findViewById(R.id.tv_title);
                this.LJIIJJI = (TuxTextView) view7.findViewById(R.id.tv_sub_title);
                this.LJIIL = (C1295960jpS) view7.findViewById(R.id.emt);
                this.LJIILL = (C1322110kVd) view7.findViewById(R.id.vd5);
                this.LJIILLIIL = (TuxTextView) view7.findViewById(R.id.zy7);
                this.LJIIZILJ = (C0T8I) view7.findViewById(R.id.s8q);
                this.LJIJJLI = (FrameLayout) view7.findViewById(R.id.chs);
                view7.findViewById(R.id.vtb);
                this.LJIL = (ConstraintLayout) view7.findViewById(R.id.s8s);
                this.LJJ = (ConstraintLayout) view7.findViewById(R.id.or8);
                this.LJIJ = (TuxTextView) view7.findViewById(R.id.tv_reward_title);
                this.LJIJI = (TuxTextView) view7.findViewById(R.id.tv_reward_subtitle);
                this.LJJI = (ConstraintLayout) view7.findViewById(R.id.dyf);
                this.LJIJJ = new C1897450zTb((TuxTextView) view7.findViewById(R.id.xyx), (ImageView) view7.findViewById(R.id.xyj));
                this.LJJIFFI = (TuxTextView) view7.findViewById(R.id.zhs);
            }
            Context context2 = this.LJJIII;
            if (context2 != null && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                int i3 = displayMetrics.heightPixels;
                float fLJIIJJI = C12ES.LJIIJJI(context2) + 0.0f;
                float fLIZJ = C12ES.LIZJ(58.0f, context2);
                if (C12ES.LJIILJJIL((i3 - fLJIIJJI) - fLIZJ, context2) <= 360) {
                    i2 = 16;
                } else {
                    i2 = 32;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                LinearLayout linearLayout = this.LJI;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
                if (linearLayout != null) {
                    layoutParams = linearLayout.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = (int) (fLJIIJJI + fLIZJ);
                    }
                } else {
                    marginLayoutParams = null;
                }
                LinearLayout linearLayout2 = this.LJI;
                if (linearLayout2 != null) {
                    C786410Ut5.d6(linearLayout2, marginLayoutParams);
                }
                LinearLayout linearLayout3 = this.LJIIIZ;
                if (linearLayout3 != null) {
                    linearLayout3.setPadding(linearLayout3.getPaddingLeft(), iLIZIZ, linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
                    ConstraintLayout constraintLayout = this.LJIL;
                    if (constraintLayout != null) {
                        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), iLIZIZ);
                    }
                }
                View view8 = this.LIZIZ;
                if (view8 != null) {
                    height = view8.getHeight();
                } else {
                    height = 0;
                }
                if (height >= i3) {
                    FrameLayout frameLayout = this.LJIJJLI;
                    if (frameLayout != null) {
                        layoutParams2 = frameLayout.getLayoutParams();
                    } else {
                        layoutParams2 = null;
                    }
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LJJIIZ)));
                    }
                    new AwS550S0100000_6(marginLayoutParams2, 1530);
                    FrameLayout frameLayout2 = this.LJIJJLI;
                    if (frameLayout2 != null) {
                        C786410Ut5.a6(frameLayout2, marginLayoutParams2);
                    }
                }
                if (!this.LJJIIZI && C0SKB.LIZ()) {
                    TuxTextView tuxTextView = this.LJIIJ;
                    if (tuxTextView != null) {
                        tuxTextView.setTuxFont(33);
                    }
                    TuxTextView tuxTextView2 = this.LJIIJ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setMaxLines(2);
                    }
                    TuxTextView tuxTextView3 = this.LJIIJJI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setMaxLines(1);
                    }
                    ImageView imageView = this.LJIIIIZZ;
                    if (imageView != null) {
                        C786410Ut5.LJZI(8, imageView);
                    }
                    this.LJJIIZI = true;
                }
            }
        } else {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        C0T82.LIZJ(this.LJJIIJZLJL);
        ReferralFeedBanner referralFeedBannerLJII = C0T82.LIZJ(this.LJJIIJZLJL).LJII(str);
        if (referralFeedBannerLJII == null) {
            C1620370sGh.LIZIZ(301, 10, "special referralFeedBanner null");
            this.LIZ = true;
        } else {
            this.LJJII = referralFeedBannerLJII;
            LJ(referralFeedBannerLJII, context);
        }
    }
}
