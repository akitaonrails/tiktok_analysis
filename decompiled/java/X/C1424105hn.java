package X;

import com.ss.android.ugc.gamora.editor.lyric.api.ILyricStickerEffectDownloadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.preload.LyricEffectPreloadServiceImpl$doPreloadAllPanelEffects$4$1", f = "LyricEffectPreloadServiceImpl.kt", l = {314}, m = "invokeSuspend")
public final class C1424105hn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C1424305hp> LLILLL;
    public final /* synthetic */ ILyricStickerEffectDownloadService LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424105hn(List<C1424305hp> list, ILyricStickerEffectDownloadService iLyricStickerEffectDownloadService, InterfaceC1364105Vn<? super C1424105hn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = iLyricStickerEffectDownloadService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1424105hn c1424105hn = new C1424105hn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1424105hn.LLILLJJLI = obj;
        return c1424105hn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricEffectPreloadServiceImpl@4bee.doPreloadAllPanelEffects$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<C1424305hp> list = this.LLILLL;
            ILyricStickerEffectDownloadService iLyricStickerEffectDownloadService = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1424305hp> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1424205ho(iLyricStickerEffectDownloadService, it2.next(), null), 3));
            }
            this.LL = 1;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.doPreloadAllPanelEffects$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricEffectPreloadServiceImpl@4bee.doPreloadAllPanelEffects$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
