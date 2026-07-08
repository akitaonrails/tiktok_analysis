package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonContent;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718650SGx implements C0SH7 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public C345700Dgu LIZ;
    public CharSequence LIZIZ;
    public BannerCommonStruct LIZJ;
    public Aweme LIZLLL;
    public volatile InterfaceC718660SGy LJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C718650SGx.class, "feedBottomBannerRecommendService", "getFeedBottomBannerRecommendService()Lcom/ss/android/ugc/aweme/search/IFeedBottomBannerRecommendService;", 0);
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

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
    @Override // X.C0SH7
    public final View LIZ(Context context) {
        C0GUJ c0guj = new C0GUJ(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0guj);
        c0guj.setLayoutParams(marginLayoutParams);
        c0guj.setOrientation(0);
        c0guj.setGravity(17);
        C345700Dgu c345700Dgu = this.LIZ;
        if (c345700Dgu != null) {
            Function1<View, Unit> function1 = c345700Dgu.LIZIZ;
            if (function1 != null) {
                function1.invoke(c0guj);
            }
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
            tuxTextView.setTuxFont(62);
            tuxTextView.setTextColorRes(R.attr.ee);
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setGravity(17);
            tuxTextView.setText(c345700Dgu.LIZ);
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(-2, -2));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
            Integer numValueOf = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZLLL = numValueOf;
            c419910GdJ.LJ = numValueOf;
            tuxIconView.setTuxIcon(c419910GdJ);
            InterfaceC718660SGy interfaceC718660SGy = this.LJ;
            if (interfaceC718660SGy == null) {
                synchronized (this) {
                    interfaceC718660SGy = this.LJ;
                    if (interfaceC718660SGy == null) {
                        interfaceC718660SGy = (InterfaceC718660SGy) C1807670x8n.n();
                        this.LJ = interfaceC718660SGy;
                    }
                }
            }
            if (interfaceC718660SGy.LIZ(context, this.LIZLLL, this.LIZJ, this.LIZIZ, c345700Dgu.LIZ)) {
                c0guj.addView(tuxTextView);
            }
            c0guj.addView(tuxIconView);
        }
        return c0guj;
    }

    public static void LIZIZ(C718650SGx c718650SGx, Aweme aweme, BannerCommonStruct bannerCommonStruct, BannerCommonUIStruct bannerCommonUIStruct, Function1 function1) {
        String str;
        List<BannerCommonText> list;
        BannerCommonText bannerCommonText;
        String str2;
        List<BannerCommonAction> list2;
        BannerCommonAction bannerCommonAction;
        BannerCommonTailAction bannerCommonTailAction = bannerCommonUIStruct.tailAction;
        String str3 = "";
        if (bannerCommonTailAction == null || (list2 = bannerCommonTailAction.actions) == null || (bannerCommonAction = (BannerCommonAction) C13LP.LJJJLL(list2)) == null || (str = bannerCommonAction.text) == null) {
            str = "";
        }
        BannerCommonContent bannerCommonContent = bannerCommonUIStruct.content;
        if (bannerCommonContent != null && (list = bannerCommonContent.bannerTexts) != null && (bannerCommonText = (BannerCommonText) C13LP.LJJJLL(list)) != null && (str2 = bannerCommonText.textBody) != null) {
            str3 = str2;
        }
        c718650SGx.LIZIZ = str3;
        c718650SGx.LIZ = new C345700Dgu(str, function1, null);
        c718650SGx.LIZJ = bannerCommonStruct;
        c718650SGx.LIZLLL = aweme;
    }
}
