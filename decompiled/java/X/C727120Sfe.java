package X;

import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: renamed from: X.0Sfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727120Sfe extends C09AY implements Function1<C727510SgH, Unit> {
    public final /* synthetic */ UserStory LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C727100Sfc LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C727120Sfe(UserStory userStory, String str, C727100Sfc c727100Sfc, String str2) {
        super(1);
        this.LL = userStory;
        this.LLILLJJLI = str;
        this.LLILLL = c727100Sfc;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C727510SgH c727510SgH) {
        String string;
        String str;
        EnumC727500SgG enumC727500SgG;
        C727510SgH c727510SgH2 = c727510SgH;
        this.LL.setAllViewed(true);
        if (C729510SjV.LJIILJJIL(this.LLILLJJLI) && !this.LL.getAllViewed() && !this.LL.getFakeAwemeShell()) {
            C727870Sgr.LIZIZ(AFwS243S0000000_11.get$arr$(7));
        } else {
            C728090ShD.LIZ.LJI(this.LLILLJJLI);
        }
        if (!c727510SgH2.LIZIZ) {
            HashMap<String, String> map = new HashMap<>();
            String str2 = this.LLILZ;
            C727140Sfg c727140Sfg = c727510SgH2.LIZJ;
            EnumC727500SgG enumC727500SgG2 = null;
            if (c727140Sfg != null && (enumC727500SgG = c727140Sfg.LIZ) != null) {
                string = enumC727500SgG.toString();
            } else {
                string = null;
            }
            map.put("errorId", string);
            if (c727510SgH2.LIZJ != null) {
                str = "aid is not in storyLiteMetadata";
            } else {
                str = null;
            }
            map.put("errorMsg", str);
            map.put("enter_from", str2);
            C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
            C0N5H c0n5h = C0N5H.STORY_STATUS_CHANGE_MONITOR;
            C727140Sfg c727140Sfg2 = c727510SgH2.LIZJ;
            if (c727140Sfg2 != null) {
                enumC727500SgG2 = c727140Sfg2.LIZ;
            }
            c1605650rsx.LJIIIZ(map, c0n5h, enumC727500SgG2);
        }
        C727100Sfc c727100Sfc = this.LLILLL;
        UserStory userStory = this.LL;
        String str3 = this.LLILLJJLI;
        c727100Sfc.getClass();
        C727100Sfc.LIZLLL(userStory, str3);
        return Unit.LIZ;
    }
}
