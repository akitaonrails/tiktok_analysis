package X;

import android.content.MutableContextWrapper;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MiddlePageRawData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MusicSearchHistoryData;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model.MusicSearchHistoryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.ui.SearchMusicMiddleLynxContainer$Companion$preload$2$result$1", f = "SearchMusicMiddleLynxContainer.kt", l = {}, m = "invokeSuspend")
public final class C681530QoJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C681550QoL>, Object> {
    public final /* synthetic */ List<MusicSearchHistory> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C681530QoJ(List<? extends MusicSearchHistory> list, InterfaceC1364105Vn<? super C681530QoJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C681530QoJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMusicMiddleLynxContainer$Companion@8434.preload$2$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C681580QoO c681580QoO = C681580QoO.LIZ;
        List<MusicSearchHistory> list = this.LL;
        c681580QoO.getClass();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<MusicSearchHistory> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new MusicSearchHistoryItem(it2.next().keyword));
        }
        MusicSearchHistoryData musicSearchHistoryData = new MusicSearchHistoryData(arrayList);
        boolean zLIZ = C681430Qo9.LIZ();
        boolean zLJJII = ComplianceServiceProvider.LJI().LJJII();
        String str = C15IK.LJ;
        MiddlePageRawData middlePageRawData = new MiddlePageRawData(musicSearchHistoryData, null, null, false, Boolean.valueOf(zLIZ), Boolean.valueOf(zLJJII), C15IK.LIZ, "change_music_page", str, Boolean.TRUE, null);
        C1227904rF.LIZ.getClass();
        String json = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), middlePageRawData);
        C844470XAv.LIZ.getClass();
        C681550QoL c681550QoL = new C681550QoL(new MutableContextWrapper(C844470XAv.LIZ()), json, C681550QoL.LJI, true);
        C1C7U.LIZIZ("SearchMusicMiddleLynxContainer$Companion@8434.preload$2$result$1");
        return c681550QoL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C681550QoL> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
