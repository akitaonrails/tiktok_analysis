package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.im.core.model.DeleteMsgRequest;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868200Y4c implements C0YJ5 {
    public final Set<InterfaceC868420Y4y> LIZ = new CopyOnWriteArraySet();
    public final Set<InterfaceC868050Y3n> LIZIZ = new CopyOnWriteArraySet();
    public final Set<InterfaceC868380Y4u> LIZJ = new CopyOnWriteArraySet();
    public final Map<String, List<InterfaceC868050Y3n>> LIZLLL = new ConcurrentHashMap();
    public final Map<String, List<InterfaceC868420Y4y>> LJ = new ConcurrentHashMap();
    public final Set<InterfaceC864720Xw6> LJFF;
    public final Set<InterfaceC871950YIn> LJI;
    public final Set<InterfaceC871960YIo> LJII;
    public final Set<InterfaceC870420YCq> LJIIIIZZ;
    public final Set<InterfaceC870660YDo> LJIIIZ;
    public final Set<InterfaceC871940YIm> LJIIJ;
    public final Set<C0YD0> LJIIJJI;
    public final Set<InterfaceC868390Y4v> LJIIL;
    public final Set<InterfaceC870020YBc> LJIILIIL;
    public final C0YEM LJIILJJIL;

    @Override // X.C0YJ5
    public final void LJFF() {
        ((CopyOnWriteArraySet) this.LJIILIIL).remove(C06A9.LIZ);
    }

    public final void LJIILJJIL() {
        this.LJIILJJIL.LJIIZILJ().getDomain().LIZJ().LLLI();
        if (this.LJIILJJIL.LJIIIZ().LJJLIIIIJ.LJIILIIL.isEnabled()) {
            C0YCE c0yceLJIJI = this.LJIILJJIL.LJIIZILJ().getDomain().LIZLLL().LJIJI();
            C23250099c.LIZLLL(c0yceLJIJI.LIZIZ.LIZJ(), null, null, new C0YCD(c0yceLJIJI, null), 3);
        }
        C0Y5P c0y5pLIZLLL = this.LJIILJJIL.LJIIZILJ().LIZIZ().LIZLLL();
        if (c0y5pLIZLLL.LIZ.LJIILL().LIZ.LIZJ.invoke().enableDeferredMigration) {
            C23250099c.LIZLLL(c0y5pLIZLLL.LIZ.LIZJ(), c0y5pLIZLLL.LIZ.LJIIIIZZ().LIZIZ(), null, new C0Y51(c0y5pLIZLLL, null), 2);
        } else {
            C868780Y6i.LJ(c0y5pLIZLLL.LIZ.LIZLLL(), "DeferredMigrationManager", "Deferred migration disabled, skipping", 4);
        }
    }

    public C868200Y4c(C0YEM c0yem) {
        this.LJIILJJIL = c0yem;
        new ConcurrentHashMap();
        this.LJFF = new CopyOnWriteArraySet();
        this.LJI = new CopyOnWriteArraySet();
        this.LJII = new CopyOnWriteArraySet();
        this.LJIIIZ = new CopyOnWriteArraySet();
        this.LJIIJ = new CopyOnWriteArraySet();
        this.LJIIJJI = new CopyOnWriteArraySet();
        this.LJIIIIZZ = new CopyOnWriteArraySet();
        this.LJIIL = new CopyOnWriteArraySet();
        this.LJIILIIL = new CopyOnWriteArraySet();
    }

    @Override // X.C0YJ5
    public final void LIZ(InterfaceC868380Y4u interfaceC868380Y4u) {
        ((CopyOnWriteArraySet) this.LIZJ).remove(interfaceC868380Y4u);
    }

    @Override // X.C0YJ5
    public final void LIZIZ(InterfaceC870420YCq interfaceC870420YCq) {
        if (interfaceC870420YCq != null) {
            ((CopyOnWriteArraySet) this.LJIIIIZZ).remove(interfaceC870420YCq);
        }
    }

    @Override // X.C0YJ5
    public final void LIZJ(InterfaceC871940YIm interfaceC871940YIm) {
        if (interfaceC871940YIm != null) {
            ((CopyOnWriteArraySet) this.LJIIJ).add(interfaceC871940YIm);
        }
    }

    @Override // X.C0YJ5
    public final void LIZLLL(InterfaceC870420YCq interfaceC870420YCq) {
        if (interfaceC870420YCq != null) {
            ((CopyOnWriteArraySet) this.LJIIIIZZ).add(interfaceC870420YCq);
        }
    }

    @Override // X.C0YJ5
    public final void LJI(InterfaceC868380Y4u interfaceC868380Y4u) {
        if (interfaceC868380Y4u != null) {
            ((CopyOnWriteArraySet) this.LIZJ).add(interfaceC868380Y4u);
        }
    }

    @Override // X.C0YJ5
    public final void LJIIIZ(InterfaceC870020YBc interfaceC870020YBc) {
        if (interfaceC870020YBc != null) {
            ((CopyOnWriteArraySet) this.LJIILIIL).add(interfaceC870020YBc);
        }
    }

    @Override // X.C0YJ5
    public final void LJIIJ(InterfaceC868420Y4y interfaceC868420Y4y) {
        if (interfaceC868420Y4y != null) {
            ((CopyOnWriteArraySet) this.LIZ).add(interfaceC868420Y4y);
        }
    }

    @Override // X.C0YJ5
    public final void LJIIJJI(C1504005ug c1504005ug) {
        ((CopyOnWriteArraySet) this.LJIIJ).remove(c1504005ug);
    }

    public final void LJIJI(final C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && !TextUtils.isEmpty(c869590Y9l.getConversationId())) {
            LJIIZILJ(c869590Y9l.getConversationId(), new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4k
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                    interfaceC868420Y4y.mf(c869590Y9l);
                }
            });
        }
    }

    public final void LJIJJLI(boolean z) {
        int iIntValue;
        if (z) {
            final C0Y2J c0y2jLIZJ = this.LJIILJJIL.LJIIZILJ().LIZLLL().LIZJ();
            if (c0y2jLIZJ.LIZIZ == null) {
                c0y2jLIZJ.LIZJ.LIZLLL().LJI("WaitDelCon trigger, store null");
            } else if (SystemClock.uptimeMillis() - c0y2jLIZJ.LIZ <= 30000) {
                c0y2jLIZJ.LIZJ.LIZLLL().LJI("WaitDelCon trigger, time limit");
            } else {
                c0y2jLIZJ.LIZ = SystemClock.uptimeMillis();
                Map<String, DeleteConversationRequest> mapLIZ = c0y2jLIZJ.LIZIZ.LIZ();
                C868780Y6i c868780Y6iLIZLLL = c0y2jLIZJ.LIZJ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WaitDelCon trigger, map:");
                sbLIZ.append(mapLIZ.size());
                sbLIZ.append(", mode:");
                sbLIZ.append(c0y2jLIZJ.LIZLLL);
                c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                for (Map.Entry<String, DeleteConversationRequest> entry : mapLIZ.entrySet()) {
                    final String key = entry.getKey();
                    final DeleteConversationRequest value = entry.getValue();
                    if (value == null) {
                        C868780Y6i c868780Y6iLIZLLL2 = c0y2jLIZJ.LIZJ.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("WaitDelCon trigger, invalid request, cid:");
                        sbLIZ2.append(key);
                        c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                    } else if (c0y2jLIZJ.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJFF(value.inboxType, key)) {
                        C868780Y6i c868780Y6iLIZLLL3 = c0y2jLIZJ.LIZJ.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("WaitDelCon trigger, cid:");
                        sbLIZ3.append(key);
                        sbLIZ3.append(" conversation waiting to create");
                        c868780Y6iLIZLLL3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
                    } else {
                        c0y2jLIZJ.LIZJ.LJIIZILJ().LIZLLL().LIZ().LJJLIL(key, new InterfaceC863600XuI<C0Y8T>() { // from class: X.0Y2E
                            @Override // X.InterfaceC863600XuI
                            public final void LIZIZ(C0YMW c0ymw) {
                                new C0Y2D(c0y2jLIZJ.LIZJ).LJIILJJIL(value);
                            }

                            @Override // X.InterfaceC863600XuI
                            public final void onSuccess(C0Y8T c0y8t) {
                                if (c0y8t == null) {
                                    new C0Y2D(c0y2jLIZJ.LIZJ).LJIILJJIL(value);
                                    return;
                                }
                                C868780Y6i c868780Y6iLIZLLL4 = c0y2jLIZJ.LIZJ.LIZLLL();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("WaitDelCon trigger, cid:");
                                sbLIZ4.append(key);
                                sbLIZ4.append(" conversation ever created after deleted");
                                c868780Y6iLIZLLL4.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        });
                    }
                }
            }
            C0Y2S c0y2sLJIIIIZZ = this.LJIILJJIL.LJIIZILJ().getMessage().LJIIIIZZ();
            if (c0y2sLJIIIIZZ.LIZIZ == null) {
                c0y2sLJIIIIZZ.LIZJ.LIZLLL().LJI("WaitDelCon trigger, store null");
            } else if (SystemClock.uptimeMillis() - c0y2sLJIIIIZZ.LIZ <= 30000) {
                c0y2sLJIIIIZZ.LIZJ.LIZLLL().LJI("WaitDelCon trigger, time limit");
            } else {
                c0y2sLJIIIIZZ.LIZ = SystemClock.uptimeMillis();
                Map<Long, DeleteMsgRequest> mapLIZ2 = c0y2sLJIIIIZZ.LIZIZ.LIZ();
                C868780Y6i c868780Y6iLIZLLL4 = c0y2sLJIIIIZZ.LIZJ.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("WaitDelCon trigger, map:");
                sbLIZ4.append(mapLIZ2.size());
                sbLIZ4.append(", mode:");
                sbLIZ4.append(c0y2sLJIIIIZZ.LIZLLL);
                c868780Y6iLIZLLL4.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
                for (Map.Entry<Long, DeleteMsgRequest> entry2 : mapLIZ2.entrySet()) {
                    Long key2 = entry2.getKey();
                    DeleteMsgRequest value2 = entry2.getValue();
                    if (value2 == null) {
                        C868780Y6i c868780Y6iLIZLLL5 = c0y2sLJIIIIZZ.LIZJ.LIZLLL();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("WaitDelCon trigger, invalid request, msgId:");
                        sbLIZ5.append(key2);
                        c868780Y6iLIZLLL5.LJI(C2188811AlT.LIZIZ(sbLIZ5));
                    } else {
                        C0YEM c0yem = c0y2sLJIIIIZZ.LIZJ;
                        C864930XwR c864930XwR = new C864930XwR(c0yem, null, value2.isStranger);
                        c864930XwR.LJ = value2.isStranger;
                        c864930XwR.LJI = value2.retryTimes.intValue();
                        c864930XwR.LJFF = value2.userDelTime.longValue();
                        Integer num = value2.inboxType;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        C868780Y6i c868780Y6iLIZLLL6 = c0yem.LIZLLL();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("DeleteMsgHandlerretryDeleteReq, cid:");
                        sbLIZ6.append(value2.conversationId);
                        sbLIZ6.append(", retryTimes:");
                        sbLIZ6.append(c864930XwR.LJI);
                        sbLIZ6.append(", userDelTime:");
                        sbLIZ6.append(c864930XwR.LJFF);
                        c868780Y6iLIZLLL6.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ6));
                        if (value2.isStranger) {
                            C1ES0 c1es0 = new C1ES0();
                            c1es0.LJJJJL = value2.toStrangeMsgReqBody();
                            RequestBody requestBodyLIZIZ = c1es0.build();
                            c864930XwR.LJIIIIZZ = requestBodyLIZIZ;
                            c864930XwR.LJII = iIntValue;
                            c864930XwR.LJIIIZ(iIntValue, requestBodyLIZIZ, null, new Object[0]);
                        } else {
                            C1ES0 c1es02 = new C1ES0();
                            c1es02.LJJIJL = value2.toMsgReqBody();
                            RequestBody requestBodyLIZIZ2 = c1es02.build();
                            c864930XwR.LJIIIIZZ = requestBodyLIZIZ2;
                            c864930XwR.LJII = iIntValue;
                            c864930XwR.LJIIIZ(iIntValue, requestBodyLIZIZ2, null, new Object[0]);
                        }
                    }
                }
            }
            C870880YEk c870880YEkLIZJ = this.LJIILJJIL.LJIIZILJ().LJFF().LIZJ();
            c870880YEkLIZJ.getClass();
            c870880YEkLIZJ.LIZJ = SystemClock.uptimeMillis();
        }
    }

    public final void LJIL(int i) {
        int length;
        C868780Y6i c868780Y6iLIZLLL = this.LJIILJJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInitEnd:");
        sbLIZ.append(i);
        sbLIZ.append(" type ");
        sbLIZ.append(this.LJIILJJIL.LJIIIZ().LJJJLIIL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        ((CopyOnWriteArraySet) this.LJIILJJIL.LJIIZILJ().getDomain().LIZIZ.LJIIJ).add(Integer.valueOf(i));
        if (i == 0) {
            int i2 = this.LJIILJJIL.LJIIIZ().LJJJLIIL;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.LJIILJJIL.LJIIJJI().LIZJ(new C914050ZtT(this, 1), null, false, this.LJIILJJIL.LJIIL().LIZJ());
                }
            } else {
                this.LJIILJJIL.LJIIJJI().LIZJ(new C914050ZtT(this, 2), null, false, this.LJIILJJIL.LJIIL().LIZJ());
            }
        }
        C870830YEf c870830YEfLJIIIZ = this.LJIILJJIL.LJIIIZ();
        int[] iArr = c870830YEfLJIIIZ.LJIIJJI;
        if (iArr == null && (iArr = c870830YEfLJIIIZ.LJIIJ) == null) {
            length = 0;
        } else {
            length = iArr.length;
        }
        if (length == ((CopyOnWriteArraySet) this.LJIILJJIL.LJIIZILJ().getDomain().LIZIZ.LJIIJ).size()) {
            this.LJIILJJIL.LIZLLL().LJIIJJI("all inbox init end");
            this.LJIILJJIL.LIZLLL().LIZIZ("startRepair");
            if (this.LJIILJJIL.LJIIIZ().LJJLIIIIJ.LJJJJIZL) {
                this.LJIILJJIL.LJIIJJI().LIZJ(new C914050ZtT(this, 3), null, false, this.LJIILJJIL.LJIIL().LIZJ());
            } else {
                LJIILJJIL();
            }
        }
    }

    public final void LJJ(final List<C0YAE> list) {
        if (list != null && !list.isEmpty()) {
            InterfaceC864490Xvj<InterfaceC868380Y4u> interfaceC864490Xvj = new InterfaceC864490Xvj<InterfaceC868380Y4u>() { // from class: X.0Y4m
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868380Y4u interfaceC868380Y4u) {
                    interfaceC868380Y4u.LIZ(list);
                }
            };
            Iterator it2 = ((CopyOnWriteArraySet) this.LIZJ).iterator();
            while (it2.hasNext()) {
                interfaceC864490Xvj.invoke(it2.next());
            }
        }
    }

    @Override // X.C0YJ5
    public final void LJII(String str, InterfaceC868420Y4y interfaceC868420Y4y) {
        List list = (List) ((ConcurrentHashMap) this.LJ).get(str);
        if (list != null) {
            list.remove(interfaceC868420Y4y);
            ((ConcurrentHashMap) this.LJ).put(str, list);
        }
    }

    @Override // X.C0YJ5
    public final void LJIIIIZZ(String str, InterfaceC868050Y3n interfaceC868050Y3n) {
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (list != null) {
            list.remove(interfaceC868050Y3n);
            ((ConcurrentHashMap) this.LIZLLL).put(str, list);
        }
    }

    @Override // X.C0YJ5
    public final void LJIIL(String str, InterfaceC868420Y4y interfaceC868420Y4y) {
        List arrayList = (List) ((ConcurrentHashMap) this.LJ).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(interfaceC868420Y4y)) {
            arrayList.add(interfaceC868420Y4y);
        }
        ((ConcurrentHashMap) this.LJ).put(str, arrayList);
    }

    @Override // X.C0YJ5
    public final void LJIILIIL(String str, InterfaceC868050Y3n interfaceC868050Y3n) {
        List arrayList = (List) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(interfaceC868050Y3n)) {
            int i = 0;
            while (i < arrayList.size() && (ListProtector.get(arrayList, i) == null || interfaceC868050Y3n.LLLIIII() >= ((InterfaceC868050Y3n) ListProtector.get(arrayList, i)).LLLIIII())) {
                i++;
            }
            ListProtector.add(arrayList, i, interfaceC868050Y3n);
        }
        ((ConcurrentHashMap) this.LIZLLL).put(str, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILL(String str, InterfaceC864490Xvj<InterfaceC868050Y3n> interfaceC864490Xvj) {
        Collection collection = (Collection) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (collection != null) {
            for (Object obj : new ArrayList(collection)) {
                if (obj != null) {
                    interfaceC864490Xvj.invoke(obj);
                }
            }
        }
        Iterator it2 = ((CopyOnWriteArraySet) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            interfaceC864490Xvj.invoke(it2.next());
        }
    }

    public final void LJIILLIIL(int i, boolean z) {
        int length;
        C868780Y6i c868780Y6iLIZLLL = this.LJIILJJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleInitMessageEnd:");
        sbLIZ.append(i);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        C871360YGg c871360YGg = this.LJIILJJIL.LJIIZILJ().getDomain().LIZLLL;
        ((ConcurrentHashMap) this.LJIILJJIL.LJIIZILJ().getDomain().LIZIZ.LJIIIZ).put(Integer.valueOf(i), Boolean.valueOf(z));
        C870830YEf c870830YEfLJIIIZ = this.LJIILJJIL.LJIIIZ();
        int[] iArr = c870830YEfLJIIIZ.LJIIJJI;
        if (iArr == null) {
            iArr = c870830YEfLJIIIZ.LJIIJ;
        }
        if (iArr == null) {
            length = 0;
        } else {
            length = iArr.length;
        }
        if (length == ((ConcurrentHashMap) this.LJIILJJIL.LJIIZILJ().getDomain().LIZIZ.LJIIIZ).size()) {
            this.LJIILJJIL.LJIILLIIL();
            this.LJIILJJIL.LIZLLL().LJIIJJI("all inbox message init end");
            C0YMI c0ymi = C0YMI.COMPLETED;
            c871360YGg.getClass();
            c871360YGg.LJ(InterfaceC871310YGb.LIZIZ, new C868150Y3x(c0ymi));
            C0YCR c0ycrLJIILIIL = this.LJIILJJIL.LJIILIIL();
            if (!c0ycrLJIILIIL.LJIJ) {
                C23250099c.LIZLLL(c0ycrLJIILIIL.LJIJJLI, null, null, new C0Y5U(c0ycrLJIILIIL, null), 3);
            }
            this.LJIILJJIL.LJIIZILJ().getDomain().LIZJ().LJLLLLLL();
        }
        List list = (List) ((ConcurrentHashMap) this.LJIILJJIL.LJIIZILJ().getDomain().LIZIZ.LJIIIIZZ).get(Integer.valueOf(i));
        if (list != null && !list.isEmpty()) {
            return;
        }
        LJIL(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIZILJ(String str, InterfaceC864490Xvj<InterfaceC868420Y4y> interfaceC864490Xvj) {
        Collection collection = (Collection) ((ConcurrentHashMap) this.LJ).get(str);
        if (collection != null) {
            for (Object obj : new ArrayList(collection)) {
                if (obj != null) {
                    interfaceC864490Xvj.invoke(obj);
                }
            }
        }
        Iterator it2 = ((CopyOnWriteArraySet) this.LIZ).iterator();
        while (it2.hasNext()) {
            interfaceC864490Xvj.invoke(it2.next());
        }
    }

    public final void LJIJ(final C869590Y9l c869590Y9l, final int i) {
        if (c869590Y9l != null && !TextUtils.isEmpty(c869590Y9l.getConversationId())) {
            LJIIZILJ(c869590Y9l.getConversationId(), new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4o
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                    interfaceC868420Y4y.Jk(c869590Y9l, i);
                }
            });
        }
    }

    public final void LJJIIJZLJL(C0Y3I c0y3i, List<C869590Y9l> list) {
        LJJIIZ(c0y3i, list, new HashMap(), -1);
    }

    @Override // X.C0YJ5
    public final void LJ(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        c0yc9.LIZIZ();
        LJJIII(i, c0yc9, c869590Y9l);
    }

    public final void LJJI(String str, final List<C869590Y9l> list, final EnumC872590YKz enumC872590YKz) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJIIZILJ(str, new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4l
            @Override // X.InterfaceC864490Xvj
            public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                interfaceC868420Y4y.Us(list, enumC872590YKz);
            }
        });
    }

    public final void LJJIII(final int i, final C0YC9 c0yc9, final C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && !TextUtils.isEmpty(c869590Y9l.getConversationId())) {
            if (c0yc9 != null) {
                c0yc9.LIZIZ();
            }
            LJIIZILJ(c869590Y9l.getConversationId(), new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4i
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                    InterfaceC868420Y4y interfaceC868420Y4y2 = interfaceC868420Y4y;
                    C0YC9 c0yc92 = c0yc9;
                    if (c0yc92 != null) {
                        c0yc92.LIZIZ();
                    }
                    interfaceC868420Y4y2.Ip(i, c0yc9, c869590Y9l);
                }
            });
        }
    }

    public final void LJIJJ(String str, List<C869590Y9l> list, final int i, final C0Y7P c0y7p) {
        if (list != null && !list.isEmpty() && str != null && !str.isEmpty()) {
            final ArrayList arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : list) {
                if (c869590Y9l != null && c869590Y9l.getSvrStatus() == 0) {
                    arrayList.add(c869590Y9l);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            LJIIZILJ(str, new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4j
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                    interfaceC868420Y4y.d5(arrayList, i, c0y7p);
                }
            });
        }
    }

    public final void LJJII(int i, String str, Map map, long j) {
        for (InterfaceC868390Y4v interfaceC868390Y4v : (CopyOnWriteArraySet) this.LJIIL) {
            if (interfaceC868390Y4v != null) {
                interfaceC868390Y4v.LIZ();
            }
        }
    }

    public final void LJJIIZ(C0Y3I c0y3i, List<C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        if (list != null && !list.isEmpty()) {
            LJJIIJ(c0y3i, ((C869590Y9l) ListProtector.get(list, 0)).getConversationId(), list, map, i);
        }
    }

    public final void LJJIIJ(final C0Y3I c0y3i, String str, final List<C869590Y9l> list, final Map<String, Map<String, String>> map, final int i) {
        if (list != null && !list.isEmpty() && str != null && !str.isEmpty()) {
            LJIIZILJ(str, new InterfaceC864490Xvj<InterfaceC868420Y4y>() { // from class: X.0Y4g
                @Override // X.InterfaceC864490Xvj
                public final void invoke(InterfaceC868420Y4y interfaceC868420Y4y) {
                    C0Y3I c0y3i2 = c0y3i;
                    c0y3i2.getClass();
                    interfaceC868420Y4y.gb(c0y3i2, list, map, i);
                }
            });
        }
    }

    public final void LJJIFFI(long j, String str, int i, boolean z, boolean z2, Map map) {
        for (InterfaceC868390Y4v interfaceC868390Y4v : (CopyOnWriteArraySet) this.LJIIL) {
            if (interfaceC868390Y4v != null) {
                interfaceC868390Y4v.LIZIZ();
            }
        }
    }
}
