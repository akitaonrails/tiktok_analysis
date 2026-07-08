package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176900gjQ {
    public final Context LIZ;
    public final InterfaceC1177250gjz LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final EnumC1175760gha LIZLLL;
    public final Function1<PoiGeneralCard, Unit> LJ;
    public float LJIIL;
    public final ConcurrentHashMap<String, C1176790gjF> LJFF = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C1177000gja> LJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC1177040gje> LJII = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C1177000gja> LJIIIIZZ = new ConcurrentHashMap<>();
    public final C1177460gkK LJIIIZ = new C1177460gkK();
    public final List<C09AE> LJIIJ = new ArrayList();
    public final C1DEV LJIIJJI = C2191201ApK.LIZ();
    public final AwS597S0100000_18 LJIILIIL = new AwS597S0100000_18(this, 729);

    public final int LIZ() {
        Collection<C1177000gja> collectionValues = this.LJI.values();
        int i = 0;
        if (!collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (((C1177000gja) it2.next()).LJI && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public final int LIZIZ() {
        Collection<C1177000gja> collectionValues = this.LJI.values();
        int i = 0;
        if (!collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if ((!((C1177000gja) it2.next()).LJI) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public final void LIZLLL() {
        Iterator it2 = ((ArrayList) this.LJIIJ).iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
        ((ArrayList) this.LJIIJ).clear();
    }

    public final int LJIIIZ() {
        return this.LIZLLL == EnumC1175760gha.ACC_NEARBY ? ((Number) C262210APj.LIZ.getValue()).intValue() : ((Number) C262200APi.LIZ.getValue()).intValue();
    }

    public final int LJIIJ() {
        return this.LIZLLL == EnumC1175760gha.ACC_NEARBY ? ((Number) C262220APk.LIZ.getValue()).intValue() : ((Number) C262250APn.LIZ.getValue()).intValue();
    }

    public final void LJ() {
        LIZLLL();
        this.LJIIIZ.LIZIZ();
        LJIIJJI(null);
        this.LJIIL = 0.0f;
        Iterator<T> it2 = this.LJFF.values().iterator();
        while (it2.hasNext()) {
            C0CNO.LIZLLL(0L, new AwS562S0100000_18((C1176790gjF) it2.next(), 2472));
        }
        this.LJFF.clear();
        this.LJI.clear();
    }

    public final void LJIIJJI(List<C1176630giz> list) {
        String poiId;
        String poiId2;
        if (list != null && !list.isEmpty()) {
            Iterator<Map.Entry<String, InterfaceC1177040gje>> it2 = this.LJII.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, InterfaceC1177040gje> next = it2.next();
                String key = next.getKey();
                InterfaceC1177040gje value = next.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<C1176630giz> it3 = list.iterator();
                    while (it3.hasNext()) {
                        PoiGeneralCard poiGeneralCard = it3.next().card;
                        if (poiGeneralCard != null) {
                            poiId2 = poiGeneralCard.getPoiId();
                        } else {
                            poiId2 = null;
                        }
                        if (Intrinsics.LJFF(poiId2, key)) {
                            break;
                        }
                    }
                }
                C0CNO.LIZLLL(0L, new AwS562S0100000_18(value, 2474));
                it2.remove();
            }
            Iterator<Map.Entry<String, C1177000gja>> it4 = this.LJIIIIZZ.entrySet().iterator();
            while (it4.hasNext()) {
                String key2 = it4.next().getKey();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<C1176630giz> it5 = list.iterator();
                    while (it5.hasNext()) {
                        PoiGeneralCard poiGeneralCard2 = it5.next().card;
                        if (poiGeneralCard2 != null) {
                            poiId = poiGeneralCard2.getPoiId();
                        } else {
                            poiId = null;
                        }
                        if (Intrinsics.LJFF(poiId, key2)) {
                            break;
                        }
                    }
                }
                it4.remove();
            }
            return;
        }
        Iterator<Map.Entry<String, InterfaceC1177040gje>> it6 = this.LJII.entrySet().iterator();
        while (it6.hasNext()) {
            C0CNO.LIZLLL(0L, new AwS562S0100000_18(it6.next(), (Map.Entry<String, ? extends InterfaceC1177040gje>) 2473));
        }
        this.LJII.clear();
        this.LJIIIIZZ.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(String str, List list) {
        ArrayList arrayList;
        Object next;
        String poiId;
        List list2 = list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMarker highlightPoi:");
        sbLIZ.append(str);
        sbLIZ.append("，cards size:");
        sbLIZ.append(C1175120ggY.LIZJ(Integer.valueOf(list2.size())));
        C2188811AlT.LIZIZ(sbLIZ);
        LIZLLL();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            PoiGeneralCard poiGeneralCard = ((C1176630giz) it2.next()).card;
            if (poiGeneralCard != null && (poiId = poiGeneralCard.getPoiId()) != null) {
                arrayList2.add(poiId);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        Iterator<Map.Entry<String, C1176790gjF>> it3 = this.LJFF.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<String, C1176790gjF> next2 = it3.next();
            String key = next2.getKey();
            C1176790gjF value = next2.getValue();
            if (!setLLIIJI.contains(key)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("remove marker poiId:");
                sbLIZ2.append(value.LIZ.getTag());
                sbLIZ2.append(", because resetState");
                C2188811AlT.LIZIZ(sbLIZ2);
                value.LIZ.remove();
                it3.remove();
            }
        }
        Iterator<Map.Entry<String, C1177000gja>> it4 = this.LJI.entrySet().iterator();
        while (it4.hasNext()) {
            if (!setLLIIJI.contains(it4.next().getKey())) {
                it4.remove();
            }
        }
        LJIIJJI(list2);
        for (Map.Entry<String, C1176790gjF> entry : this.LJFF.entrySet()) {
            String key2 = entry.getKey();
            C1176790gjF value2 = entry.getValue();
            if (value2.LIZIZ) {
                C0CNO.LIZLLL(0L, new AwS562S0100000_18(value2, 2476));
                this.LJI.remove(key2);
            } else {
                this.LJII.put(key2, value2.LIZ);
            }
        }
        this.LJIIIIZZ.putAll(this.LJI);
        this.LJFF.clear();
        this.LJI.clear();
        this.LJIIIZ.LIZIZ();
        boolean z = false;
        int i = 1;
        if (C123100dR.LIZ(str)) {
            arrayList = new ArrayList(list2);
            Iterator it5 = list2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next3 = it5.next();
                if (Intrinsics.LJFF(((C1176630giz) next3).card.getPoiId(), str)) {
                    if (next3 != null) {
                        arrayList.remove(next3);
                        ListProtector.add(arrayList, 0, next3);
                        Iterator it6 = list2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            Object next4 = it6.next();
                            if (((C1176630giz) next4).uiStyle == EnumC1153700g80.CENTER_PIN_STYLE) {
                                if (next4 != null) {
                                    arrayList.remove(next4);
                                    ListProtector.add(arrayList, 1, next4);
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            Iterator<T> it7 = this.LJIIIIZZ.values().iterator();
            while (true) {
                if (it7.hasNext()) {
                    next = it7.next();
                    if (((C1177000gja) next).LJII) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1177000gja c1177000gja = (C1177000gja) next;
            if (c1177000gja != null && !Intrinsics.LJFF(c1177000gja.LIZ, str)) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next5 = it8.next();
                    if (Intrinsics.LJFF(((C1176630giz) next5).card.getPoiId(), c1177000gja.LIZ)) {
                        if (next5 != null) {
                            arrayList.remove(next5);
                            if (z) {
                                i = 2;
                            }
                            ListProtector.add(arrayList, i, next5);
                        }
                    }
                }
            }
        } else {
            Iterator it9 = list2.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next6 = it9.next();
                if (((C1176630giz) next6).uiStyle == EnumC1153700g80.CENTER_PIN_STYLE) {
                    if (next6 != null) {
                        arrayList = new ArrayList(list2);
                        Iterator it10 = list2.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                break;
                            }
                            Object next7 = it10.next();
                            if (((C1176630giz) next7).uiStyle == EnumC1153700g80.CENTER_PIN_STYLE) {
                                if (next7 != null) {
                                    arrayList.remove(next7);
                                    ListProtector.add(arrayList, 0, next7);
                                }
                            }
                        }
                    }
                }
            }
            C817403Hg c817403Hg = new C817403Hg();
            float size = list2.size() + this.LJIIL;
            c817403Hg.element = size;
            this.LJIIL = size;
            ((ArrayList) this.LJIIJ).add(C23250099c.LIZLLL(this.LIZJ, C0PEM.LIZJ, null, new C1176910gjR(list2, this, str, c817403Hg, null), 2));
        }
        list2 = arrayList;
        C817403Hg c817403Hg2 = new C817403Hg();
        float size2 = list2.size() + this.LJIIL;
        c817403Hg2.element = size2;
        this.LJIIL = size2;
        ((ArrayList) this.LJIIJ).add(C23250099c.LIZLLL(this.LIZJ, C0PEM.LIZJ, null, new C1176910gjR(list2, this, str, c817403Hg2, null), 2));
    }

    public static final void LJII(C1176900gjQ c1176900gjQ, C1177000gja c1177000gja, Bitmap bitmap) {
        if (bitmap == null) {
            c1176900gjQ.LJI.remove(c1177000gja.LIZ);
            return;
        }
        if (c1177000gja.LJI && c1176900gjQ.LIZ() > c1176900gjQ.LJIIIZ()) {
            c1176900gjQ.LJI.remove(c1177000gja.LIZ);
        } else if (!c1177000gja.LJI && c1176900gjQ.LIZIZ() > c1176900gjQ.LJIIJ()) {
            c1176900gjQ.LJI.remove(c1177000gja.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1176630giz r20, boolean r21, float r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1176900gjQ.LIZJ(X.0giz, boolean, float, X.05Vn):java.lang.Object");
    }

    public C1176900gjQ(Context context, InterfaceC1177250gjz interfaceC1177250gjz, InterfaceC497601wk interfaceC497601wk, EnumC1175760gha enumC1175760gha, AwS597S0100000_18 awS597S0100000_18) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1177250gjz;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = enumC1175760gha;
        this.LJ = awS597S0100000_18;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C1177390gkD r10, X.C1176630giz r11, boolean r12, float r13, X.InterfaceC1364105Vn<? super kotlin.Pair<X.C1177000gja, java.lang.Boolean>> r14) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1176900gjQ.LJIIIIZZ(X.0gkD, X.0giz, boolean, float, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C1177390gkD r23, X.C1176630giz r24, X.C1177000gja r25, boolean r26, float r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1176900gjQ.LJFF(X.0gkD, X.0giz, X.0gja, boolean, float, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJI(float r6, android.graphics.Bitmap r7, X.C1176900gjQ r8, X.C1176630giz r9, X.C1177000gja r10, X.InterfaceC1364105Vn r11, boolean r12) {
        /*
            boolean r0 = r11 instanceof X.C1176960gjW
            if (r0 == 0) goto L24
            r4 = r11
            X.0gjW r4 = (X.C1176960gjW) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            X.0gjQ r8 = r4.LLILLJJLI
            X.0giz r9 = r4.LL
            goto L2a
        L24:
            X.0gjW r4 = new X.0gjW
            r4.<init>(r11)
            goto L12
        L2a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L60
            goto L73
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r3)
            if (r7 != 0) goto L3e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> L5e
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> L5e
            X.0gjY r5 = new X.0gjY     // Catch: java.lang.Exception -> L5e
            if (r12 == 0) goto L48
            r12 = 1
            goto L49
        L48:
            r12 = 0
        L49:
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L5e
            r4.LL = r9     // Catch: java.lang.Exception -> L5c
            r4.LLILLJJLI = r8     // Catch: java.lang.Exception -> L5a
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L5a
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)     // Catch: java.lang.Exception -> L5a
            if (r0 != r2) goto L73
            return r2
        L5a:
            r0 = move-exception
            goto L61
        L5c:
            r0 = move-exception
            goto L61
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0gja> r1 = r8.LJI
            com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard r0 = r9.card
            java.lang.String r0 = r0.getPoiId()
            if (r0 != 0) goto L70
            java.lang.String r0 = ""
        L70:
            r1.remove(r0)
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1176900gjQ.LJI(float, android.graphics.Bitmap, X.0gjQ, X.0giz, X.0gja, X.05Vn, boolean):java.lang.Object");
    }
}
