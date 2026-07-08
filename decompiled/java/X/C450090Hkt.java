package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSet;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetDetailListResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.repo.BasicStickerRepository$refreshSetStickers$2", f = "BasicStickerRepository.kt", l = {226}, m = "invokeSuspend")
public final class C450090Hkt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<Long> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C450100Hku LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450090Hkt(List<Long> list, String str, C450100Hku c450100Hku, InterfaceC1364105Vn<? super C450090Hkt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = c450100Hku;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C450090Hkt c450090Hkt = new C450090Hkt(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c450090Hkt.LLILLJJLI = obj;
        return c450090Hkt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uPutIfAbsent;
        String upperCase;
        InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uPutIfAbsent2;
        Long l;
        InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uPutIfAbsent3;
        Object objLJIIJ = obj;
        C1C7U.LIZ("BasicStickerRepository@45d8.refreshSetStickers$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJIIJ);
            } else {
                C155000ia.LIZIZ(objLJIIJ);
                List<Long> list = this.LLILLL;
                String str = this.LLILZ;
                InterfaceC045100Ef interfaceC045100EfLIZ = C452670Hp3.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                this.LL = 1;
                objLJIIJ = interfaceC045100EfLIZ.LJIIJ(strLIZIZ, str, this);
                if (objLJIIJ == objLJFF) {
                    C1C7U.LIZIZ("BasicStickerRepository@45d8.refreshSetStickers$2");
                    return objLJFF;
                }
            }
            c098200Yq = (StickerSetDetailListResponse) objLJIIJ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        List<Long> list2 = this.LLILLL;
        C450100Hku c450100Hku = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            List<StickerSet> stickerSetList = ((StickerSetDetailListResponse) c098200Yq).getStickerSetList();
            if (stickerSetList == null) {
                stickerSetList = C13BV.INSTANCE;
            }
            for (StickerSet stickerSet : stickerSetList) {
                StickerSetInfo stickerSetInfo = stickerSet.info;
                if (stickerSetInfo != null && (l = stickerSetInfo.setId) != null) {
                    long jLongValue = l.longValue();
                    Object obj2 = stickerSet.stickers;
                    if (obj2 == null) {
                        obj2 = C13BV.INSTANCE;
                    }
                    concurrentHashMap.put(C2286608xc.LJFF(jLongValue), obj2);
                    ConcurrentHashMap<Long, InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>>> concurrentHashMap2 = c450100Hku.LJI;
                    Long lLJFF = C2286608xc.LJFF(jLongValue);
                    InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uLIZ = concurrentHashMap2.get(lLJFF);
                    if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent3 = concurrentHashMap2.putIfAbsent(lLJFF, (interfaceC332260D0uLIZ = C1BNE.LIZ(new C450060Hkq())))) != null) {
                        interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent3;
                    }
                    interfaceC332260D0uLIZ.setValue(new C450040Hko(obj2, false));
                }
            }
            Iterator<Long> it2 = list2.iterator();
            while (it2.hasNext()) {
                long jLongValue2 = it2.next().longValue();
                Object obj3 = concurrentHashMap.get(C2286608xc.LJFF(jLongValue2));
                if (obj3 == null) {
                    ConcurrentHashMap<Long, InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>>> concurrentHashMap3 = c450100Hku.LJI;
                    Long lLJFF2 = C2286608xc.LJFF(jLongValue2);
                    InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uLIZ2 = concurrentHashMap3.get(lLJFF2);
                    if (interfaceC332260D0uLIZ2 == null && (interfaceC332260D0uPutIfAbsent2 = concurrentHashMap3.putIfAbsent(lLJFF2, (interfaceC332260D0uLIZ2 = C1BNE.LIZ(new C450060Hkq())))) != null) {
                        interfaceC332260D0uLIZ2 = interfaceC332260D0uPutIfAbsent2;
                    }
                    interfaceC332260D0uLIZ2.setValue(new C450040Hko(C13BV.INSTANCE, false));
                } else {
                    c450100Hku.LJII.put(C2286608xc.LJFF(jLongValue2), (List<SetSticker>) obj3);
                }
            }
            c450100Hku.LJIIIIZZ.clear();
            for (SetSticker setSticker : (ArrayList) C15438062q.LJIJJLI(c450100Hku.LJII.values())) {
                String name = setSticker.getName();
                if (name != null && (upperCase = name.toUpperCase(Locale.ROOT)) != null) {
                    ConcurrentHashMap<String, List<SetSticker>> concurrentHashMap4 = c450100Hku.LJIIIIZZ;
                    List<SetSticker> list3 = concurrentHashMap4.get(upperCase);
                    if (list3 == null) {
                        list3 = C13BV.INSTANCE;
                    }
                    concurrentHashMap4.put(upperCase, C13LP.LJLILLLLZI(setSticker, list3));
                }
            }
        }
        List<Long> list4 = this.LLILLL;
        C450100Hku c450100Hku2 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            Iterator<Long> it3 = list4.iterator();
            while (it3.hasNext()) {
                long jLongValue3 = it3.next().longValue();
                ConcurrentHashMap<Long, InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>>> concurrentHashMap5 = c450100Hku2.LJI;
                Long lLJFF3 = C2286608xc.LJFF(jLongValue3);
                InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uLIZ3 = concurrentHashMap5.get(lLJFF3);
                if (interfaceC332260D0uLIZ3 == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap5.putIfAbsent(lLJFF3, (interfaceC332260D0uLIZ3 = C1BNE.LIZ(new C450060Hkq())))) != null) {
                    interfaceC332260D0uLIZ3 = interfaceC332260D0uPutIfAbsent;
                }
                interfaceC332260D0uLIZ3.setValue(new C450050Hkp(thM5exceptionOrNullimpl));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasicStickerRepository@45d8.refreshSetStickers$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
