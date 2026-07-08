package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakCampaignInfo;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.model.StreakEntryInfo;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils;
import org.json.JSONException;

/* JADX INFO: renamed from: X.06Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils", f = "StreakLynxDataUtils.kt", l = {202}, m = "getStreakPetClientDataForPetLynxPanelAndWidget")
public final class C1580306Gr extends AbstractC23140094w {
    public Object LL;
    public StreakData LLILLJJLI;
    public C06H2 LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public Object LLJI;
    public StreakEntryInfo LLJIJIL;
    public StreakPetData LLJILJIL;
    public StreakExtension LLJILJILJ;
    public StreakCampaignInfo LLJILLL;
    public Object LLJJ;
    public Object LLJJI;
    public Object LLJJIII;
    public Object LLJJIJI;
    public boolean LLJJIJIIJIL;
    public /* synthetic */ Object LLJJIJIL;
    public final /* synthetic */ StreakLynxDataUtils LLJJJ;
    public int LLJJJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580306Gr(StreakLynxDataUtils streakLynxDataUtils, InterfaceC1364105Vn<? super C1580306Gr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJJJ = streakLynxDataUtils;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StreakLynxDataUtils@6836.getStreakPetClientDataForPetLynxPanelAndWidget$1");
        this.LLJJIJIL = obj;
        this.LLJJJIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLJJJ.LJ(null, null, null, null, null, null, null, null, false, null, null, null, null, this);
        C1C7U.LIZIZ("StreakLynxDataUtils@6836.getStreakPetClientDataForPetLynxPanelAndWidget$1");
        return objLJ;
    }
}
