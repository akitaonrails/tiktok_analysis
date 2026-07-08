package X;

import Y.ACListenerS121S0200000_18;
import Y.ATListenerS451S0100000_18;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate;
import com.ss.android.ugc.aweme.poi.reviews.tab.ui.PoiNotifyAnchorTextChangeAbility;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0hD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195290hD5 extends ConstraintLayout implements InterfaceC1197120hG2, PoiNotifyAnchorTextChangeAbility {
    public final /* synthetic */ PoiAnchorMakerDelegate LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final AnchorCommonStruct LLILZIL;
    public final C1195320hD8 LLILZLL;
    public final InterfaceC1195340hDA LLIZ;
    public final C1188820h2e LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC1197120hG2
    public final String LIZLLL() {
        return this.LL.LIZLLL();
    }

    @Override // X.InterfaceC1197120hG2
    public final String LJJIZ() {
        return this.LL.LJJIZ();
    }

    @Override // X.InterfaceC1197120hG2
    public final void LJJLL(Aweme aweme, String str, String str2, boolean z, String str3, C2344009Gk c2344009Gk, PageFinder pageFinder, Function1<? super C2344009Gk, Unit> function1) {
        this.LL.LJJLL(aweme, str, str2, z, str3, c2344009Gk, pageFinder, function1);
    }

    @Override // X.InterfaceC1197120hG2
    public final String LLIL(int i) {
        return this.LL.LLIL(i);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLJJIJI(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol) {
        this.LL.LLJJIJI(interfaceC665370Q7z, fcpStandardPreloadProtocol);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLJJJJ(Aweme aweme, String str, String str2, String str3, boolean z, boolean z2, String str4, C2344009Gk c2344009Gk, Function1<? super C2344009Gk, Unit> function1) {
        this.LL.LLJJJJ(aweme, str, str2, str3, z, z2, str4, c2344009Gk, function1);
    }

    @Override // X.InterfaceC1197120hG2
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> LLJJJJLIIL(Aweme aweme, String str) {
        return this.LL.LLJJJJLIIL(aweme, str);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLFFI(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LL.LLLFFI(i, i2, i3, i4, i5, i6);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLIL(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol) {
        this.LL.LLLIL(interfaceC665370Q7z, fcpStandardPreloadProtocol);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLILZLLLI(Aweme aweme, String str, String str2, boolean z) {
        this.LL.LLLILZLLLI(aweme, str, str2, z);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLIZZ(Aweme aweme) {
        this.LL.LLLIZZ(aweme);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLLIIL(Context context, View view, Aweme aweme, String str, String str2, C2344009Gk c2344009Gk, boolean z, String str3, String str4, String str5, boolean z2, EnumC1188920h2o enumC1188920h2o, String str6, Function1<? super C2344009Gk, Unit> function1) {
        this.LL.LLLLIIL(context, view, aweme, str, str2, c2344009Gk, z, str3, str4, str5, z2, enumC1188920h2o, str6, function1);
    }

    private final C2344009Gk getShowEventMapBuilder() {
        AnchorCommonStruct anchorCommonStruct = this.LLILZIL;
        if (anchorCommonStruct != null && C04UD.LIZ()) {
            return C1065330dpT.LJII(anchorCommonStruct, this.LLILLJJLI, this.LLILLL);
        }
        return null;
    }

    private final InterfaceC1195340hDA getStrategy() {
        List<AnchorCommonStruct> anchors = this.LLILLJJLI.getAnchors();
        return (anchors == null || anchors.size() == 0 || C0XQ7.LJFF().LIZJ(AwemeExtKt.getAuthorUid(this.LLILLJJLI)) || this.LLILLJJLI.getPoiDataStruct() == null) ? new C1189090h35(this) : new C1195300hD6(this, this.LLILZLL);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLZ() {
        this.LL.getClass();
    }

    public final C2344009Gk getClickEventMapBuilder() {
        AnchorCommonStruct anchorCommonStruct = this.LLILZIL;
        if (anchorCommonStruct != null && C04UD.LIZ()) {
            return C1065330dpT.LJI(anchorCommonStruct, this.LLILLJJLI, this.LLILLL);
        }
        return null;
    }

    public final C2344009Gk getDetailEventMapBuilder() {
        AnchorCommonStruct anchorCommonStruct = this.LLILZIL;
        if (anchorCommonStruct != null && C04UD.LIZ()) {
            return C1065330dpT.LJFF(anchorCommonStruct, this.LLILLJJLI, this.LLILLL);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.tab.ui.PoiNotifyAnchorTextChangeAbility
    public final void lQ0() {
        ((TextView) findViewById(R.id.th8)).setText(C20642515q3.LJI(2131844774));
        C786410Ut5.LLLLZLL((TuxTextView) findViewById(R.id.th8), 0);
        C786410Ut5.LJZL(8, (LinearLayout) findViewById(R.id.x1q));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        CommentService commentService;
        InterfaceC665370Q7z interfaceC665370Q7zLJIILL;
        super.onAttachedToWindow();
        C622680Oba.LIZJ(this);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ == null || (commentService = (CommentService) PluggableExtentionKt.pluggableSpi$default(CommentService.class, false, false, false, 14, null)) == null || (interfaceC665370Q7zLJIILL = commentService.LJIILL(c19egLIZIZ)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLJIILL, this, PoiNotifyAnchorTextChangeAbility.class, null, null);
        this.LLJI = Intrinsics.LJFF(interfaceC665370Q7zLJIILL, C1558360qeg.LJI(c19egLIZIZ, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C19EG c19egLIZIZ;
        CommentService commentService;
        InterfaceC665370Q7z interfaceC665370Q7zLJIILL;
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
        if (!C301010Br1.LIZ() || (c19egLIZIZ = C1388190mED.LIZIZ(getContext())) == null || (commentService = (CommentService) PluggableExtentionKt.pluggableSpi$default(CommentService.class, false, false, false, 14, null)) == null || (interfaceC665370Q7zLJIILL = commentService.LJIILL(c19egLIZIZ)) == null) {
            return;
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLJIILL, PoiNotifyAnchorTextChangeAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.tab.ui.PoiNotifyAnchorTextChangeAbility
    public final void iw1(boolean z) {
        if (z) {
            this.LLJ = "reviews";
        } else {
            this.LLJ = "comment";
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiCommentAnchorShowEvent(C735520StC c735520StC) {
        String str;
        String str2;
        PoiAnchorInfo poiAnchorInfo;
        AnchorCommonStruct anchorCommonStruct;
        if (Intrinsics.LJFF(c735520StC.LIZ, this.LLILLJJLI.getAid())) {
            this.LLIZ.LIZ();
            C2344009Gk showEventMapBuilder = getShowEventMapBuilder();
            String logExtra = null;
            if (showEventMapBuilder != null) {
                C1188720h2U c1188720h2U = C1188720h2U.LIZ;
                List<AnchorCommonStruct> anchors = this.LLILLJJLI.getAnchors();
                if (anchors != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(anchors)) != null) {
                    logExtra = anchorCommonStruct.getLogExtra();
                }
                c1188720h2U.getClass();
                C1189060h32.LJJIFFI(showEventMapBuilder, "comment_main_anchor_type", C1188720h2U.LIZ(logExtra));
            } else {
                showEventMapBuilder = null;
            }
            Aweme aweme = this.LLILLJJLI;
            String str3 = this.LLILLL;
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (poiAnchorInfo = poiDataStruct.commentAnchor) == null || (str = poiAnchorInfo.trackInfo) == null) {
                str = "";
            }
            LJJLL(aweme, "comment_anchor", str3, true, str, showEventMapBuilder, PageFinder.via((View) this), new AwS597S0100000_18(showEventMapBuilder, 237));
            if (C04UD.LIZ()) {
                C20684815ws.LJIJ("multi_anchor_entrance_show", C1065330dpT.LIZLLL(showEventMapBuilder));
            }
            PoiDataStruct poiDataStruct2 = this.LLILLJJLI.getPoiDataStruct();
            if (poiDataStruct2 != null && poiDataStruct2.isProductAnchor()) {
                str2 = "product";
            } else {
                str2 = "poi";
            }
            C1195370hDD c1195370hDD = C1195370hDD.LIZ;
            C1195320hD8 c1195320hD8 = this.LLILZLL;
            c1195370hDD.getClass();
            c1195370hDD.LIZJ("poi_anchor_comment_show", new AwS132S1100000_18(c1195320hD8, str2, 0));
        }
    }

    public C1195290hD5(Context context, Aweme aweme, String str, AwS255S0300000_11 awS255S0300000_11) {
        AnchorCommonStruct next;
        super(context);
        this.LL = new PoiAnchorMakerDelegate();
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = awS255S0300000_11;
        this.LLILZLL = new C1195320hD8();
        this.LLIZ = getStrategy();
        this.LLIZLLLIL = new C1188820h2e(EnumC1188880h2k.COMMENT_ANCHOR);
        this.LLJ = "comment";
        LLLILZLLLI(aweme, "comment", str, false);
        Iterator<AnchorCommonStruct> it2 = aweme.getAnchors().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getType() == EnumC1430380nKG.POI.getTYPE()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct = next;
        this.LLILZIL = anchorCommonStruct;
        C1195320hD8 c1195320hD8 = this.LLILZLL;
        c1195320hD8.LIZ = null;
        c1195320hD8.LIZIZ = null;
        c1195320hD8.LIZJ = null;
        c1195320hD8.LIZLLL = null;
        c1195320hD8.LJ = null;
        if (anchorCommonStruct != null && C04UD.LIZ()) {
            C1065330dpT.LJII(anchorCommonStruct, this.LLILLJJLI, this.LLILLL);
            C1065330dpT.LJI(anchorCommonStruct, this.LLILLJJLI, this.LLILLL);
            C1065330dpT.LJFF(anchorCommonStruct, this.LLILLJJLI, this.LLILLL);
        }
        if (!C0CNZ.LIZIZ() || C20673215v0.LJFF(context, context, R.layout.e2c, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e2c, this, true);
        }
        this.LLIZ.LIZIZ(this.LLILLJJLI, this);
        View.OnClickListener aCListenerS121S0200000_18 = new ACListenerS121S0200000_18(this, context, 79);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS121S0200000_18) : aCListenerS121S0200000_18);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        setOnTouchListener(new ATListenerS451S0100000_18(this, 15));
    }
}
