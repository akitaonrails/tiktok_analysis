package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel.MusicSearchTrendingVM;
import com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qoj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel.MusicSearchTrendingVM$updateSearchMusicTrendingList$2", f = "MusicSearchTrendingVM.kt", l = {53, 64}, m = "invokeSuspend")
public final class C681790Qoj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ ArrayList<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ MusicSearchTrendingVM LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C681790Qoj(boolean z, ArrayList<String> arrayList, String str, MusicSearchTrendingVM musicSearchTrendingVM, InterfaceC1364105Vn<? super C681790Qoj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = arrayList;
        this.LLILZIL = str;
        this.LLILZLL = musicSearchTrendingVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C681790Qoj c681790Qoj = new C681790Qoj(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c681790Qoj.LLILLJJLI = obj;
        return c681790Qoj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        Object c098200Yq;
        long jLongValue;
        Object c098200Yq2;
        String str;
        Object objLIZJ = obj;
        C1C7U.LIZ("MusicSearchTrendingVM@122.updateSearchMusicTrendingList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZJ);
                    str = (String) objLIZJ;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZJ);
                str = (String) objLIZJ;
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            Object obj2 = null;
            if (ComplianceServiceProvider.LJI().LJJII()) {
                numLJ = C2286608xc.LJ(1);
            } else {
                numLJ = null;
            }
            if (this.LLILLL) {
                String str2 = C15IK.LJ;
                try {
                    IEditVideoInfoService iEditVideoInfoService = (IEditVideoInfoService) PluggableExtentionKt.pluggableSpi$default(IEditVideoInfoService.class, false, false, false, 14, null);
                    if (iEditVideoInfoService != null) {
                        c098200Yq = iEditVideoInfoService.getVideoLength(str2);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Long l = (Long) c098200Yq;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                try {
                    C1227904rF.LIZ.getClass();
                    c098200Yq2 = C1227904rF.LIZLLL().LJIILL(C0XED.LJ(C526890KlT.LIZIZ));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq2 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj2 = c098200Yq2;
                }
                InterfaceC681800Qok.LIZ.getClass();
                InterfaceC681800Qok value = C681860Qoq.LIZIZ.getValue();
                String str3 = C15IK.LJIIJJI;
                String str4 = C15IK.LJIIJ;
                String str5 = C15IK.LJIIIZ;
                Long lLJFF = C2286608xc.LJFF(jLongValue);
                this.LL = 1;
                objLIZJ = value.LIZ(0, 10, "music_search_yml", "music_search_yml", "1", 0, str2, str3, str4, str5, lLJFF, (String) obj2, numLJ, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("MusicSearchTrendingVM@122.updateSearchMusicTrendingList$2");
                    return objLJFF;
                }
                str = (String) objLIZJ;
            } else {
                C1227904rF.LIZ.getClass();
                try {
                    String strLJIILL = C1227904rF.LIZLLL().LJIILL(this.LLILZ);
                    C0QPW.LIZ.getClass();
                    C0QPW c0qpw = C0QPX.LIZIZ;
                    String str6 = this.LLILZIL;
                    this.LL = 2;
                    objLIZJ = c0qpw.LIZJ(1, "music_create", strLJIILL, "100011", numLJ, str6, this);
                    if (objLIZJ == objLJFF) {
                        C1C7U.LIZIZ("MusicSearchTrendingVM@122.updateSearchMusicTrendingList$2");
                        return objLJFF;
                    }
                    str = (String) objLIZJ;
                } catch (Throwable th5) {
                    th = th5;
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILZLL.setState(new AwS589S0100000_10(th, 172));
                }
            }
            TryCatchGuardChecker.doCheck(th);
            this.LLILZLL.setState(new AwS589S0100000_10(th, 172));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicSearchTrendingVM@122.updateSearchMusicTrendingList$2");
            return unit;
        }
        this.LLILZLL.setState(new AwS61S1000000_10(str, 3));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicSearchTrendingVM@122.updateSearchMusicTrendingList$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
