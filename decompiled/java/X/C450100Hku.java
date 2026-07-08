package X;

import com.ss.android.ugc.aweme.exp.IMStickerFavPageSizeConfig;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS22S0000100_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450100Hku implements InterfaceC450290HlD {
    public final C450160Hl0 LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final C2252331DDr LIZJ = C09IR.LIZIZ(0, 0, null, 7);
    public final C2252321DDq LIZLLL = C1BNE.LIZ(new C450060Hkq());
    public final C2252321DDq LJ = C1BNE.LIZ(new C450060Hkq());
    public final C2252331DDr LJFF = C09IR.LIZIZ(0, 0, null, 7);
    public final ConcurrentHashMap<Long, InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>>> LJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, List<SetSticker>> LJII = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, List<SetSticker>> LJIIIIZZ;
    public final ConcurrentHashMap<String, C1899307cF> LJIIIZ;
    public volatile boolean LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public long LJIILIIL;

    @Override // X.InterfaceC450290HlD
    public final C05YD<AbstractC450030Hkn<List<StickerSetInfo>>> getAddedStickerSetsFlow() {
        return C09IC.LIZIZ(this.LIZLLL);
    }

    @Override // X.InterfaceC450290HlD
    public final C01S9<AbstractC450200Hl4> getFavouriteStickerUpdateFlow() {
        return C09IC.LIZ(this.LJFF);
    }

    @Override // X.InterfaceC450290HlD
    public final C05YD<AbstractC450030Hkn<List<StickerItem>>> getFavouriteStickersFlow() {
        return C09IC.LIZIZ(this.LJ);
    }

    @Override // X.InterfaceC450290HlD
    public final C05YD<List<StickerItem>> getRecentStickersFlow() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC450290HlD
    public final C01S9<StickerSetInfo> getUseStickerSetFlow() {
        return C09IC.LIZ(this.LIZJ);
    }

    @Override // X.InterfaceC450290HlD
    public final void cleanExpiredTypingRecommendationCache() {
        C19719612Di.LJJIII(this.LJIIIZ.entrySet(), new AwS22S0000100_3(System.currentTimeMillis(), 3), true);
    }

    public C450100Hku(C450160Hl0 c450160Hl0) {
        this.LIZ = c450160Hl0;
        new ConcurrentHashMap();
        this.LJIIIIZZ = new ConcurrentHashMap<>();
        this.LJIIIZ = new ConcurrentHashMap<>();
    }

    public final void LIZIZ(StickerItem stickerItem) {
        C450160Hl0 c450160Hl0 = this.LIZ;
        c450160Hl0.getClass();
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(stickerItem);
        Iterable iterable = (Iterable) c450160Hl0.LIZ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.LJFF(C453560HqU.LIZIZ((StickerItem) obj), C453560HqU.LIZIZ(stickerItem))) {
                arrayList.add(obj);
            }
        }
        c13dvLIZIZ.addAll(arrayList);
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        int i = (int) ((IMStickerFavPageSizeConfig.Config) IMStickerFavPageSizeConfig.LIZIZ.getValue()).refreshCount;
        if (i < 12) {
            i = 12;
        }
        c450160Hl0.LIZ.setValue(C13LP.LL(listLIZ, i));
    }

    @Override // X.InterfaceC450290HlD
    public final void addFavouriteSticker(StickerItem stickerItem) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(stickerItem);
        List list = (List) ((AbstractC450030Hkn) this.LJ.getValue()).LIZ();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.LJFF(C453560HqU.LIZIZ((StickerItem) obj), C453560HqU.LIZIZ(stickerItem))) {
                arrayList.add(obj);
            }
        }
        c13dvLIZIZ.addAll(arrayList);
        this.LJ.setValue(new C450040Hko(C1697820uHc.LIZ(c13dvLIZIZ), this.LJIIL));
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C450120Hkw(this, stickerItem, null), 3);
    }

    @Override // X.InterfaceC450290HlD
    public final void addStickerSet(StickerSetInfo stickerSetInfo) {
        List list = (List) ((AbstractC450030Hkn) this.LIZLLL.getValue()).LIZ();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((StickerSetInfo) it2.next()).setId, stickerSetInfo.setId)) {
                    return;
                }
            }
        }
        List listLJLILLLLZI = C13LP.LJLILLLLZI(stickerSetInfo, list);
        this.LIZLLL.setValue(new C450040Hko(listLJLILLLLZI, false));
        ArrayList arrayList = new ArrayList();
        Iterator it3 = ((ArrayList) listLJLILLLLZI).iterator();
        while (it3.hasNext()) {
            Long l = ((StickerSetInfo) it3.next()).setId;
            if (l != null) {
                arrayList.add(l);
            }
        }
        refreshSetStickers(arrayList, null);
    }

    @Override // X.InterfaceC450290HlD
    public final C05YD<AbstractC450030Hkn<List<SetSticker>>> getSetStickersFlow(long j) {
        InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uPutIfAbsent;
        ConcurrentHashMap<Long, InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>>> concurrentHashMap = this.LJI;
        Long lValueOf = Long.valueOf(j);
        InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uLIZ = concurrentHashMap.get(lValueOf);
        if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (interfaceC332260D0uLIZ = C1BNE.LIZ(new C450060Hkq())))) != null) {
            interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent;
        }
        return C09IC.LIZIZ(interfaceC332260D0uLIZ);
    }

    @Override // X.InterfaceC450290HlD
    public final void removeFavouriteSticker(String str) {
        String string;
        Long l;
        List list = (List) ((AbstractC450030Hkn) this.LJ.getValue()).LIZ();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            String str2 = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                StickerItem stickerItem = (StickerItem) next;
                StickerBase stickerBase = stickerItem.stickerBase;
                if (stickerBase != null && (l = stickerBase.id) != null) {
                    string = l.toString();
                } else {
                    string = null;
                }
                if (!Intrinsics.LJFF(string, str)) {
                    StickerBase stickerBase2 = stickerItem.stickerBase;
                    if (stickerBase2 != null) {
                        str2 = stickerBase2.thirdPartyStickerId;
                    }
                    if (!Intrinsics.LJFF(str2, str)) {
                        arrayList.add(next);
                    }
                }
            } else {
                this.LJ.setValue(new C450040Hko(arrayList, this.LJIIL));
                C23250099c.LIZLLL(this.LIZIZ, null, null, new C450140Hky(this, str, null), 3);
                return;
            }
        }
    }

    @Override // X.InterfaceC450290HlD
    public final List<SetSticker> searchSetStickers(String str) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC450290HlD
    public final void useStickerSet(StickerSetInfo stickerSetInfo) {
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C450130Hkx(this, stickerSetInfo, null), 3);
    }

    @Override // X.InterfaceC450290HlD
    public final Object getFavouriteSticker(String str, InterfaceC1364105Vn<? super StickerItem> interfaceC1364105Vn) {
        String str2;
        Object next;
        String string;
        Long l;
        List list = (List) ((AbstractC450030Hkn) this.LJ.getValue()).LIZ();
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        do {
            str2 = null;
            if (!it2.hasNext()) {
                return null;
            }
            next = it2.next();
            StickerItem stickerItem = (StickerItem) next;
            StickerBase stickerBase = stickerItem.stickerBase;
            if (stickerBase != null && (l = stickerBase.id) != null) {
                string = l.toString();
            } else {
                string = null;
            }
            if (Intrinsics.LJFF(string, str)) {
                break;
            }
            StickerBase stickerBase2 = stickerItem.stickerBase;
            if (stickerBase2 != null) {
                str2 = stickerBase2.thirdPartyStickerId;
            }
        } while (!Intrinsics.LJFF(str2, str));
        return next;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC450290HlD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreFavouriteStickers(java.lang.String r12, X.InterfaceC1364105Vn<? super X.AbstractC450030Hkn<java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem>>> r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C450100Hku.loadMoreFavouriteStickers(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC450290HlD
    public final void refreshSetStickers(List<Long> list, String str) {
        InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uPutIfAbsent;
        if (list.isEmpty()) {
            return;
        }
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            ConcurrentHashMap<Long, InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>>> concurrentHashMap = this.LJI;
            Long lValueOf = Long.valueOf(jLongValue);
            InterfaceC332260D0u<AbstractC450030Hkn<List<SetSticker>>> interfaceC332260D0uLIZ = concurrentHashMap.get(lValueOf);
            if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (interfaceC332260D0uLIZ = C1BNE.LIZ(new C450060Hkq())))) != null) {
                interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent;
            }
            interfaceC332260D0uLIZ.setValue(new C450060Hkq());
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C450090Hkt(list, str, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.ss.android.ugc.aweme.im.common.model.StickerImage] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.im.common.model.StickerBase] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.im.common.model.StickerItem] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.ss.android.ugc.aweme.im.common.model.StickerItem] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.ss.android.ugc.aweme.im.common.model.StickerBase] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC450290HlD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateFavStickerVariant(long r42, int r44) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C450100Hku.updateFavStickerVariant(long, int):void");
    }

    @Override // X.InterfaceC450290HlD
    public final void refreshAddedStickerSets(boolean z, boolean z2, String str) {
        if (this.LJIIJJI && !z2) {
            return;
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C450070Hkr(this, str, null), 3);
    }

    @Override // X.InterfaceC450290HlD
    public final void refreshFavouriteStickers(boolean z, boolean z2, String str) {
        if (this.LJIIJ && !z2) {
            return;
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C450110Hkv(this, str, null), 3);
    }

    @Override // X.InterfaceC450290HlD
    public final void updateAddedStickerSets(List<StickerSetInfo> list, Function0<Unit> function0, Function0<Unit> function02) {
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C450080Hks(list, this, function0, function02, null), 3);
    }

    public static String LIZ(String str, String str2, String str3, String str4) {
        String[] strArr = new String[4];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        if (str4 == null) {
            str4 = "";
        }
        strArr[3] = str4;
        return C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "#", null, null, 0, null, null, 62);
    }

    @Override // X.InterfaceC450290HlD
    public final void addTypingRecommendation(String str, String str2, String str3, String str4, String str5) {
        this.LJIIIZ.put(LIZ(str, str2, str3, str4), new C1899307cF(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1L), str5));
    }

    @Override // X.InterfaceC450290HlD
    public final Object getTypingRecommendation(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super Pair<Long, String>> interfaceC1364105Vn) {
        String strLIZ = LIZ(str, str2, str3, str4);
        C1899307cF c1899307cF = this.LJIIIZ.get(strLIZ);
        if (c1899307cF == null) {
            return null;
        }
        if (c1899307cF.LIZ > System.currentTimeMillis()) {
            return new Pair(C2286608xc.LJFF(c1899307cF.LIZ), c1899307cF.LIZIZ);
        }
        this.LJIIIZ.remove(strLIZ);
        return null;
    }
}
