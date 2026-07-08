package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Orf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632650Orf extends C09AY implements Function1<AbstractC1686410tzD, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632650Orf(boolean z, String str, String str2, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1686410tzD abstractC1686410tzD) {
        String str;
        if (abstractC1686410tzD instanceof C1686390tzB) {
            HashMap map = new HashMap();
            if (this.LL) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            map.put("enter_from", str);
            map.put("music_id", this.LLILLJJLI);
            map.put("group_id", this.LLILLL);
            String str2 = "1";
            map.put("music_new_show", "1");
            map.put("location", "music_tab");
            if (!this.LLILZ) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("highlight", str2);
            C20684815ws.LJIILLIIL("new_release_show", map);
        }
        return Unit.LIZ;
    }
}
