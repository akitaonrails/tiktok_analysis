package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.061l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15407061l implements InterfaceC15414061s {
    public final C15415061t LL;
    public final C15404061i LLILLJJLI;
    public final C062B LLILLL;
    public final C15417061v LLILZ;
    public final List<InterfaceC15414061s> LLILZIL;

    public C15407061l() {
        C15415061t c15415061t = new C15415061t(this);
        this.LL = c15415061t;
        this.LLILLJJLI = new C15404061i();
        this.LLILLL = new C062B(c15415061t);
        this.LLILZ = new C15417061v(c15415061t);
        this.LLILZIL = new ArrayList();
    }

    @Override // X.InterfaceC15414061s
    public final void Ap2(List<IMAIBotInfo> list) {
        C15404061i c15404061i = this.LLILLJJLI;
        c15404061i.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IMAIBotInfo iMAIBotInfo : list) {
            Integer numValueOf = Integer.valueOf(iMAIBotInfo.scene);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(iMAIBotInfo);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            C08I7<Long, IMAIBotInfo> c08i7LIZIZ = c15404061i.LIZ.LIZIZ(Integer.valueOf(iIntValue));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                c08i7LIZIZ.LJ(Long.valueOf(((IMAIBotInfo) it2.next()).id));
            }
        }
    }

    public final void LJ(InterfaceC15414061s interfaceC15414061s) {
        synchronized (this.LLILZIL) {
            try {
                if (((ArrayList) this.LLILZIL).contains(interfaceC15414061s)) {
                    return;
                }
                ((ArrayList) this.LLILZIL).add(interfaceC15414061s);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC15414061s
    public final void ez0(List<IMAIBotInfo> list) {
        List listLLIIII;
        this.LLILLJJLI.LIZ(list);
        synchronized (this.LLILZIL) {
            try {
                listLLIIII = C13LP.LLIIII(this.LLILZIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((InterfaceC15414061s) it2.next()).ez0(list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (((java.lang.Number) r1).longValue() <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005e -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C15412061q
            if (r0 == 0) goto L82
            r4 = r11
            X.061q r4 = (X.C15412061q) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L63
            if (r0 != r3) goto L8b
            java.lang.Object r8 = r4.LL
            java.util.Iterator r8 = (java.util.Iterator) r8
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L61
        L32:
            r7 = 1
        L33:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r6 = r8.next()
            com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo r6 = (com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo) r6
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "delete bot, bot id: "
            r2.append(r0)
            long r0 = r6.id
            r2.append(r0)
            X.C2188811AlT.LIZIZ(r2)
            if (r7 == 0) goto L61
            X.061v r2 = r9.LLILZ
            long r0 = r6.id
            r4.LL = r8
            r4.LLILZ = r3
            java.lang.Object r1 = r2.LIZJ(r0, r4)
            if (r1 != r5) goto L26
            return r5
        L61:
            r7 = 0
            goto L33
        L63:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "try to delete bot by scene, scene="
            r1.append(r0)
            r1.append(r10)
            X.C2188811AlT.LIZIZ(r1)
            X.05vk r0 = X.EnumC1510605vk.CACHE
            java.util.List r0 = r9.LIZLLL(r10, r0)
            if (r0 == 0) goto L93
            java.util.Iterator r8 = r0.iterator()
            goto L32
        L82:
            X.061q r4 = new X.061q
            r4.<init>(r9, r11)
            goto L12
        L88:
            if (r7 != r3) goto L93
            goto L94
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L93:
            r3 = 0
        L94:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15407061l.LIZIZ(int, X.05Vn):java.lang.Object");
    }

    public final IMAIBotInfo LIZJ(long j, EnumC1510605vk enumC1510605vk) {
        IMAIBotInfo iMAIBotInfoLIZIZ;
        C15404061i c15404061i = this.LLILLJJLI;
        Iterator<T> it2 = c15404061i.LIZ.LIZJ().keySet().iterator();
        while (true) {
            IMAIBotInfo iMAIBotInfo = null;
            if (it2.hasNext()) {
                C08I7<Long, IMAIBotInfo> c08i7LIZIZ = c15404061i.LIZ.LIZIZ((Integer) it2.next());
                if (c08i7LIZIZ != null && (iMAIBotInfoLIZIZ = c08i7LIZIZ.LIZIZ(Long.valueOf(j))) != null) {
                    return iMAIBotInfoLIZIZ;
                }
            } else {
                if ((enumC1510605vk == EnumC1510605vk.LOCAL || enumC1510605vk == EnumC1510605vk.NETWORK) && (iMAIBotInfo = (IMAIBotInfo) C23250099c.LJ(C23271099x.INSTANCE, new C15411061p(this, j, null))) != null) {
                    this.LLILLJJLI.LIZ(Collections.singletonList(iMAIBotInfo));
                }
                return iMAIBotInfo;
            }
        }
    }

    public final List<IMAIBotInfo> LIZLLL(int i, EnumC1510605vk enumC1510605vk) {
        Map<Long, IMAIBotInfo> mapLIZJ;
        Collection<IMAIBotInfo> collectionValues;
        int size;
        int i2 = C1510505vj.LIZ[enumC1510605vk.ordinal()];
        List<IMAIBotInfo> listLLIIII = null;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    listLLIIII = (List) C23250099c.LJ(C23271099x.INSTANCE, new C15409061n(this, i, null));
                } else {
                    throw new C1954807lC();
                }
            } else {
                List<IMAIBotInfo> list = (List) C23250099c.LJ(C23271099x.INSTANCE, new C15410061o(this, i, null));
                if (list != null) {
                    this.LLILLJJLI.LIZ(list);
                    listLLIIII = list;
                }
            }
        } else {
            C08I7<Long, IMAIBotInfo> c08i7LIZIZ = this.LLILLJJLI.LIZ.LIZIZ(Integer.valueOf(i));
            if (c08i7LIZIZ != null && (mapLIZJ = c08i7LIZIZ.LIZJ()) != null && (collectionValues = mapLIZJ.values()) != null) {
                listLLIIII = C13LP.LLIIII(collectionValues);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBotInfoByScene, source=");
        sbLIZ.append(enumC1510605vk);
        sbLIZ.append(", size=");
        if (listLLIIII != null) {
            size = listLLIIII.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        C2188811AlT.LIZIZ(sbLIZ);
        return listLLIIII;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r6, boolean r7, X.InterfaceC1364105Vn<? super java.lang.Long> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C15413061r
            if (r0 == 0) goto L3e
            r4 = r8
            X.061r r4 = (X.C15413061r) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L44
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo r3 = (com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo) r3
            if (r3 == 0) goto L2d
            long r0 = r3.id
        L28:
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            return r0
        L2d:
            r0 = 0
            goto L28
        L30:
            X.C155000ia.LIZIZ(r3)
            X.061v r0 = r5.LLILZ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZIZ(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L3e:
            X.061r r4 = new X.061r
            r4.<init>(r5, r8)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15407061l.LIZ(int, boolean, X.05Vn):java.lang.Object");
    }
}
