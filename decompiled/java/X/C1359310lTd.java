package X;

import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359310lTd extends C09AY implements Function2<UpvoteStruct, Boolean, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ CarrierType LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ UpvotePublishMobParam LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C19EG LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359310lTd(Function0<Unit> function0, CarrierType carrierType, Map<String, String> map, String str, UpvotePublishMobParam upvotePublishMobParam, boolean z, C19EG c19eg) {
        super(2);
        this.LL = function0;
        this.LLILLJJLI = carrierType;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = upvotePublishMobParam;
        this.LLILZLL = z;
        this.LLIZ = c19eg;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UpvoteStruct upvoteStruct, Boolean bool) {
        boolean z;
        String str;
        boolean z2;
        boolean zBooleanValue = bool.booleanValue();
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        boolean z3 = true;
        if (this.LLILLJJLI == CarrierType.COMMENT) {
            z = true;
            if (zBooleanValue) {
                str = "video_comment";
            } else {
                str = "comment";
            }
        } else {
            z = false;
            str = "video";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LLILLL);
        linkedHashMap.put("remove_repost_type", str);
        C20684815ws.LJIILLIIL("recommend_cancel_success", linkedHashMap);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("itemId:");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mobParam:");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(",  enterFrom:");
        sbLIZ.append(this.LLILZIL.enterFrom);
        sbLIZ.append(", enterMethod:");
        sbLIZ.append(this.LLILZIL.enterMethod);
        sbLIZ.append(", panelSource ");
        sbLIZ.append(this.LLILZIL.panelSource);
        C429430Gsf.LIZ("RepostPublishMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C737190Svt.LIZ.getClass();
        if (C737190Svt.LIZIZ() && Intrinsics.LJFF(this.LLILZIL.enterFrom, "profile_long_press") && !Intrinsics.LJFF(this.LLILZIL.panelSource, "share_panel")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!Intrinsics.LJFF(this.LLILZIL.panelSource, "recommend_panel") && !Intrinsics.LJFF(this.LLILZIL.panelSource, "repost_share_panel")) {
            z3 = false;
        }
        if (!z2 && ((!z3 || this.LLILZLL) && !C0RSD.LIZ())) {
            C1389880mGw c1389880mGw = new C1389880mGw(this.LLIZ);
            c1389880mGw.LJIIIIZZ(2131846357);
            c1389880mGw.LJIIJ();
        } else if (z) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLIZ);
            c1389890mGx.LJIIIZ(2131846394);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
