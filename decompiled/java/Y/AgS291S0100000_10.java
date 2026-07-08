package Y;

import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleCommonAssem;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class AgS291S0100000_10 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS291S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS291S0100000_10 agS291S0100000_10, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Aweme aweme = ((SearchCLASubtitleAssem) agS291S0100000_10.l0).LLJJLIIIJLLLLLLLZ;
        if (aweme != null) {
            SearchCLASubtitleAssem searchCLASubtitleAssem = (SearchCLASubtitleAssem) agS291S0100000_10.l0;
            searchCLASubtitleAssem.cp().xQ2(aweme);
            searchCLASubtitleAssem.ep(aweme);
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS291S0100000_10 agS291S0100000_10, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        SearchCLASubtitleCommonAssem searchCLASubtitleCommonAssem = (SearchCLASubtitleCommonAssem) agS291S0100000_10.l0;
        Aweme aweme = searchCLASubtitleCommonAssem.LLJJJIL;
        if (aweme != null) {
            searchCLASubtitleCommonAssem.zo().xQ2(aweme);
            searchCLASubtitleCommonAssem.Bo(aweme);
        }
        return Unit.LIZ;
    }
}
