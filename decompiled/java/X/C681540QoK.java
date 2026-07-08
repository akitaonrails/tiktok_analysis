package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MiddlePageRawData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MusicSearchHistoryData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MusicSearchTrendingData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.ui.LynxMiddlePageContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.ui.LynxMiddlePageContentAssem$updateData$1", f = "LynxMiddlePageContentAssem.kt", l = {}, m = "invokeSuspend")
public final class C681540QoK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ MusicSearchTrendingData LLILLJJLI;
    public final /* synthetic */ LynxMiddlePageContentAssem LLILLL;
    public final /* synthetic */ MusicSearchHistoryData LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ EnumC681560QoM LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C681540QoK(boolean z, MusicSearchTrendingData musicSearchTrendingData, LynxMiddlePageContentAssem lynxMiddlePageContentAssem, MusicSearchHistoryData musicSearchHistoryData, String str, EnumC681560QoM enumC681560QoM, InterfaceC1364105Vn<? super C681540QoK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = musicSearchTrendingData;
        this.LLILLL = lynxMiddlePageContentAssem;
        this.LLILZ = musicSearchHistoryData;
        this.LLILZIL = str;
        this.LLILZLL = enumC681560QoM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C681540QoK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MusicSearchTrendingData musicSearchTrendingData;
        MusicSearchTrendingData musicSearchTrendingData2;
        Boolean boolValueOf;
        C1C7U.LIZ("LynxMiddlePageContentAssem@635b.updateData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            musicSearchTrendingData = null;
            musicSearchTrendingData2 = this.LLILLJJLI;
        } else {
            musicSearchTrendingData = this.LLILLJJLI;
            musicSearchTrendingData2 = null;
        }
        boolean zNo = this.LLILLL.No();
        boolean zBooleanValue = ((Boolean) this.LLILLL.LLJIJIL.getValue()).booleanValue();
        boolean zLJJII = ComplianceServiceProvider.LJI().LJJII();
        String str = C15IK.LJ;
        String str2 = C15IK.LIZ;
        String strVQ2 = ((ChooseSearchMusicStateViewModel) this.LLILLL.LLJI.getValue()).vQ2();
        C681550QoL c681550QoL = this.LLILLL.LLJILJIL;
        if (c681550QoL != null) {
            boolValueOf = Boolean.valueOf(c681550QoL.LIZ);
        } else {
            boolValueOf = null;
        }
        MiddlePageRawData middlePageRawData = new MiddlePageRawData(this.LLILZ, musicSearchTrendingData, musicSearchTrendingData2, zNo, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zLJJII), str2, strVQ2, str, boolValueOf, this.LLILZIL);
        C1227904rF.LIZ.getClass();
        String json = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), middlePageRawData);
        C681550QoL c681550QoL2 = this.LLILLL.LLJILJIL;
        if (c681550QoL2 != null) {
            EnumC681560QoM enumC681560QoM = this.LLILZLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('_');
            sbLIZ.append(this.LLILZLL.getProcessorName());
            sbLIZ.append('_');
            sbLIZ.append(this.LLILZIL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1D66 c1d66 = c681550QoL2.LIZIZ;
            String processorName = enumC681560QoM.getProcessorName();
            c1d66.getClass();
            c1d66.LJ(C651070PgH.class, new C651070PgH(processorName));
            c1d66.LJ(C651050PgF.class, new C651050PgF(strLIZIZ));
            c1d66.LJII(json, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LynxMiddlePageContentAssem@635b.updateData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
