package X;

import Y.AObjectS108S0000000_2;
import com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.service.LyricStickerEffectDownloadServiceImpl$prefetchDistinctDependencies$2", f = "LyricStickerEffectDownloadServiceImpl.kt", l = {333}, m = "invokeSuspend")
public final class C1343905Nt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ LyricStickerEffectDownloadServiceImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343905Nt(List<String> list, LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl, InterfaceC1364105Vn<? super C1343905Nt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = lyricStickerEffectDownloadServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1343905Nt c1343905Nt = new C1343905Nt(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1343905Nt.LLILLJJLI = obj;
        return c1343905Nt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricStickerEffectDownloadServiceImpl@a892.prefetchDistinctDependencies$2");
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
            List listLJJII = C09RB.LJJII(new C08QP(C09RB.LJIJI(C09R4.LIZLLL(C09RB.LJIJI(new C1939607ik(this.LLILLL), AFwS229S0000000_2.get$arr$(618)), new AObjectS108S0000000_2(0)), AFwS229S0000000_2.get$arr$(619)), AFwS229S0000000_2.get$arr$(620)));
            if (listLJJII.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.prefetchDistinctDependencies$2");
                return unit;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : listLJJII) {
                String str = ((C1343805Ns) obj2).LIZ;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            LyricStickerEffectDownloadServiceImpl lyricStickerEffectDownloadServiceImpl = this.LLILZ;
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1343705Nr((List) entry.getValue(), lyricStickerEffectDownloadServiceImpl, (String) entry.getKey(), null), 3));
            }
            this.LL = 1;
            if (C1D9F.LIZ(arrayList2, this) == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.prefetchDistinctDependencies$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerEffectDownloadServiceImpl@a892.prefetchDistinctDependencies$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
