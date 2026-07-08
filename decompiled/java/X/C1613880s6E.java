package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel;
import com.ss.android.ugc.aweme.paid.content.consumption.SeriesAnchorEntrancePreloadTask;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0s6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613880s6E extends AbstractC707180Roa implements FcpStandardPreloadProtocol {
    public final PaidContentCustomAnchorViewModel LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final C1613930s6J LLIZ;

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        return null;
    }

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
        C1215180hjA c1215180hjA;
        C1613930s6J c1613930s6J = this.LLIZ;
        if (c1613930s6J != null && (c1215180hjA = c1613930s6J.LIZIZ) != null) {
            C03DZ.LIZ(c1215180hjA.getAnchorSubtitleFlowFromXml());
            C03DZ.LIZJ(c1215180hjA.getAnchorDescFromXml());
        }
        this.LLILZIL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        return C2097908Jt.LIZJ(new Pair(SeriesAnchorEntrancePreloadTask.class, new AwS568S0100000_24(this, 826)));
    }

    public final boolean getHasAnim() {
        return this.LLILZIL;
    }

    public final boolean getHasInit() {
        return this.LLILZLL;
    }

    public final PaidContentCustomAnchorViewModel getViewModel() {
        return this.LLILZ;
    }

    public C1613880s6E(Context context) {
        super(context);
        this.LLILZ = new PaidContentCustomAnchorViewModel();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LLIZ = new C1613930s6J(this);
    }

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        this.LLILZIL = false;
        return true;
    }

    @Override // X.AbstractC707180Roa
    public final void LJIIL(double d) {
        C1215180hjA c1215180hjA;
        this.LLILLJJLI = d;
        this.LLILZ.LLJ = d;
        if (!this.LLILZIL && d >= 2.0d) {
            this.LLILZIL = true;
            C1613930s6J c1613930s6J = this.LLIZ;
            if (c1613930s6J != null && (c1215180hjA = c1613930s6J.LIZIZ) != null) {
                c1215180hjA.LIZIZ();
            }
        }
    }

    public final void setHasAnim(boolean z) {
        this.LLILZIL = z;
    }

    public final void setHasInit(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC713230RyL
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        Aweme awemeLJJLIIIJJIZ;
        String id;
        String aid;
        String uid;
        Boolean boolValueOf;
        String groupId;
        User author;
        PaidContentCustomAnchorViewModel paidContentCustomAnchorViewModel = this.LLILZ;
        Context context = getContext();
        PaidContentAnchorExtraModel paidContentAnchorExtraModel = paidContentCustomAnchorViewModel.LLILLL;
        if (paidContentAnchorExtraModel != null) {
            InterfaceC1392640mLO interfaceC1392640mLO = paidContentCustomAnchorViewModel.LL;
            String strCf = null;
            if (interfaceC1392640mLO != null) {
                awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ = null;
            }
            String str = paidContentCustomAnchorViewModel.LLILZLL;
            if (str != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
                smartRouteBuildRoute.withParam("entry_source", EnumC1612760s4Q.ANCHOR);
                AnchorCommonStruct anchorCommonStruct = paidContentCustomAnchorViewModel.LLILLJJLI;
                if (anchorCommonStruct != null) {
                    id = anchorCommonStruct.getId();
                } else {
                    id = null;
                }
                smartRouteBuildRoute.withParam("anchor_id", id);
                if (awemeLJJLIIIJJIZ != null) {
                    aid = awemeLJJLIIIJJIZ.getAid();
                } else {
                    aid = null;
                }
                smartRouteBuildRoute.withParam("anchor_video_id", aid);
                if (awemeLJJLIIIJJIZ != null && (author = awemeLJJLIIIJJIZ.getAuthor()) != null) {
                    uid = author.getUid();
                } else {
                    uid = null;
                }
                smartRouteBuildRoute.withParam("anchor_author_id", uid);
                String str2 = paidContentAnchorExtraModel.seriesAnchorType;
                if (str2 == null) {
                    str2 = "default_anchor_type";
                }
                smartRouteBuildRoute.withParam("series_anchor_type", str2);
                if (awemeLJJLIIIJJIZ != null) {
                    boolValueOf = Boolean.valueOf(awemeLJJLIIIJJIZ.isPaidContent);
                } else {
                    boolValueOf = null;
                }
                smartRouteBuildRoute.withParam("is_intro_or_preview", boolValueOf);
                if (awemeLJJLIIIJJIZ != null) {
                    groupId = awemeLJJLIIIJJIZ.getGroupId();
                } else {
                    groupId = null;
                }
                smartRouteBuildRoute.withParam("anchor_group_id", groupId);
                smartRouteBuildRoute.withParam("resume_timestamp", (long) (paidContentCustomAnchorViewModel.LLJ * ((double) LSPassThroughRecordSizeConfig.DEFAULT)));
                smartRouteBuildRoute.withParam("anchor_number", paidContentCustomAnchorViewModel.LLILZ);
                InterfaceC1392640mLO interfaceC1392640mLO2 = paidContentCustomAnchorViewModel.LL;
                if (interfaceC1392640mLO2 != null) {
                    strCf = interfaceC1392640mLO2.Cf();
                }
                smartRouteBuildRoute.withParam("enter_from", strCf);
                smartRouteBuildRoute.withParam("component_preload_scene", "anchor");
                smartRouteBuildRoute.withParam("source_video_type", C718180SFc.LJ(awemeLJJLIIIJJIZ));
                smartRouteBuildRoute.open();
            }
        }
    }

    @Override // X.InterfaceC713230RyL
    public final void LJIIIIZZ(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, int i, Function0 function0) {
        if (!this.LLILZLL) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1613890s6F(this, anchorCommonStruct, interfaceC1392640mLO, false, i, null), 2);
            this.LLILZLL = true;
        }
        InterfaceC665370Q7z interfaceC665370Q7zK0 = interfaceC1392640mLO.k0();
        if (interfaceC665370Q7zK0 != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zK0, FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
    }
}
