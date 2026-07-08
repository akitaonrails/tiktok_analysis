package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl$doPreloadAllPanelEffects$4$1$1$1", f = "LyricEffectPreloadServiceImpl.kt", l = {302}, m = "invokeSuspend")
public final class C1424205ho extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C189200o6<? extends C05WK>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ILyricStickerEffectDownloadService LLILLL;
    public final /* synthetic */ C1424305hp LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424205ho(ILyricStickerEffectDownloadService iLyricStickerEffectDownloadService, C1424305hp c1424305hp, InterfaceC1364105Vn<? super C1424205ho> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iLyricStickerEffectDownloadService;
        this.LLILZ = c1424305hp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1424205ho c1424205ho = new C1424205ho(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1424205ho.LLILLJJLI = obj;
        return c1424205ho;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object objLIZJ;
        C1C7U.LIZ("LyricEffectPreloadServiceImpl@4bee.doPreloadAllPanelEffects$4$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                objLIZJ = ((C189200o6) obj).m10unboximpl();
            } else {
                C155000ia.LIZIZ(obj);
                ILyricStickerEffectDownloadService iLyricStickerEffectDownloadService = this.LLILLL;
                C1424305hp c1424305hp = this.LLILZ;
                String str = c1424305hp.LIZIZ;
                String str2 = c1424305hp.LIZ;
                String str3 = c1424305hp.LIZJ;
                this.LL = 1;
                objLIZJ = iLyricStickerEffectDownloadService.LIZJ(str, str2, str3, null, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.doPreloadAllPanelEffects$4$1$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = C189200o6.m1boximpl(objLIZJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1424305hp c1424305hp2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ITEM-FAIL rid=");
            sbLIZ.append(c1424305hp2.LIZIZ);
            sbLIZ.append(" eid=");
            sbLIZ.append(c1424305hp2.LIZ);
            sbLIZ.append(" cls=");
            sbLIZ.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
            sbLIZ.append(" msg=");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C1426005i6.LIZJ(c1398350mUb, "Anchor.Preload.LyricEffect.PanelAll", C2188811AlT.LIZIZ(sbLIZ));
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.doPreloadAllPanelEffects$4$1$1$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C189200o6<? extends C05WK>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
