package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.musicgift.preview.MusicGiftPreviewLyricsLoader$loadLines$3", f = "MusicGiftPreviewLyricsLoader.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C2209708lD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2209908lF>>, Object> {
    public C2209808lE LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209708lD(String str, InterfaceC1364105Vn<? super C2209708lD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2209708lD c2209708lD = new C2209708lD(this.LLILZ, interfaceC1364105Vn);
        c2209708lD.LLILLL = obj;
        return c2209708lD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        C2209808lE c2209808lE;
        C1C7U.LIZ("MusicGiftPreviewLyricsLoader@357d.loadLines$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        Object obj4 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    c2209808lE = this.LL;
                    obj3 = this.LLILLL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                obj3 = this.LLILZ;
                c2209808lE = C2209808lE.LIZ;
                this.LLILLL = obj3;
                this.LL = c2209808lE;
                this.LLILLJJLI = 1;
                c2209808lE.getClass();
                IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
                if (iMusicGiftService != null) {
                    obj = iMusicGiftService.WO(obj3, this);
                } else {
                    obj = null;
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicGiftPreviewLyricsLoader@357d.loadLines$3");
                    return objLJFF;
                }
            }
            String str = (String) obj;
            if (str == null) {
                str = "";
            }
            c2209808lE.getClass();
            List<C2209908lF> listLIZJ = C2209808lE.LIZJ(str);
            if (!listLIZJ.isEmpty()) {
                C2209808lE.LIZIZ.put((String) obj3, listLIZJ);
            }
            C189200o6.m2constructorimpl(listLIZJ);
            obj2 = listLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        if (thM5exceptionOrNullimpl == null) {
            obj4 = obj2;
        } else if (thM5exceptionOrNullimpl instanceof CancellationException) {
            throw thM5exceptionOrNullimpl;
        }
        C1C7U.LIZIZ("MusicGiftPreviewLyricsLoader@357d.loadLines$3");
        return obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C2209908lF>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
