package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0Ydq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878880Ydq implements InterfaceC878620YdQ {
    public final ConcurrentHashMap<String, C0Y9G> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C0Y9G> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C0Y9G> LIZLLL = new ConcurrentHashMap<>();
    public final CopyOnWriteArraySet<InterfaceC2195108ir> LJ = new CopyOnWriteArraySet<>();
    public final C054G LJFF;
    public final C01GW LJI;
    public final C1DEK LJII;

    @Override // X.InterfaceC878620YdQ
    public final void getType() {
    }

    @Override // X.InterfaceC878620YdQ
    public final C879580Yey LJII() {
        return new C879580Yey("message_request_spam");
    }

    @Override // X.InterfaceC878620YdQ
    public final void clear() {
        this.LJ.clear();
        this.LIZ.clear();
        this.LIZJ.clear();
        C878890Ydr.LIZ = null;
        EventBus.LIZLLL().LJJI(this);
        this.LJII.LJIIJJI(null);
        C2296808zG.LIZJ(this.LJFF, null);
    }

    public C878880Ydq() {
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        this.LJFF = c054gLIZ;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 159));
        this.LJI = c01gwLIZIZ;
        C1DEK c1dekLIZ = C095G.LIZ(-1, null, 6);
        this.LJII = c1dekLIZ;
        C878890Ydr.LIZ = new WeakReference<>(c01gwLIZIZ.getValue());
        EventBus.LIZLLL().LJIJJ(this);
        C09IC.LJJI(c054gLIZ, new C861640Xr8(new C2195008iq(this, null), C09IC.LJIILIIL(C09IC.LJIIL(c1dekLIZ), 300L)));
    }

    public final void LIZIZ(String str) {
        this.LIZ.remove(str);
        this.LIZJ.remove(String.valueOf(C0YNP.LJII(str)));
    }

    @Override // X.InterfaceC878620YdQ
    public final void LJFF(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LIZIZ((String) it2.next());
        }
        this.LJII.LJIIIIZZ(Unit.LIZ);
    }

    @Override // X.InterfaceC878620YdQ
    public final void LJI(InterfaceC2195108ir interfaceC2195108ir) {
        this.LJ.remove(interfaceC2195108ir);
    }

    @Override // X.InterfaceC878620YdQ
    public final boolean LJIIIIZZ(C877540Ybg c877540Ybg) {
        if (C0CYO.LIZJ.LJIIIIZZ() && c877540Ybg.LIZ.LLILLL == EnumC880520YgU.ALL_WITHOUT_STORY_REACTIONS) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC878620YdQ
    public final void LJIIIZ(List<C0Y9G> list) {
        ConcurrentHashMap<String, C0Y9G> concurrentHashMap = this.LIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C0Y9G c0y9g : list) {
            linkedHashMap.put(c0y9g.LIZ, c0y9g);
        }
        concurrentHashMap.putAll(linkedHashMap);
        this.LJII.LJIIIIZZ(Unit.LIZ);
        if (this.LIZ.size() == 1) {
            this.LIZLLL.putAll(this.LIZ);
        }
    }

    @Override // X.InterfaceC878620YdQ
    public final void LJIIJ(InterfaceC2195108ir interfaceC2195108ir) {
        this.LJ.add(interfaceC2195108ir);
    }

    @Override // X.InterfaceC878620YdQ
    public final C879540Yeu<?> LJIIL(C877540Ybg c877540Ybg) {
        if (this.LIZ.values().size() <= 1) {
            this.LIZIZ.putAll(this.LIZ);
            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(this.LIZLLL);
            this.LIZLLL.clear();
            if (true ^ mapLJIIZILJ.isEmpty()) {
                C1729806q0.LIZ(c877540Ybg.LIZ, new C2194908ip(this, mapLJIIZILJ, null));
            }
            return null;
        }
        Map mapLJIIZILJ2 = C2097608Jq.LJIIZILJ(this.LIZIZ);
        this.LIZIZ.clear();
        if (true ^ mapLJIIZILJ2.isEmpty()) {
            C1729806q0.LIZ(c877540Ybg.LIZ, new C2194908ip(this, mapLJIIZILJ2, null));
        }
        return new C879540Yeu<>(C878900Yds.INSTANCE, LJII(), C13LP.LLIIII(this.LIZ.values()));
    }

    @C14EU
    public final void onUserUpdate(C1434905jX c1434905jX) {
        if (!Intrinsics.LJFF(this.LIZJ.get(String.valueOf(c1434905jX.LIZ)), Boolean.valueOf(c1434905jX.LIZJ.isBlock()))) {
            this.LIZJ.put(String.valueOf(c1434905jX.LIZ), Boolean.valueOf(c1434905jX.LIZJ.isBlock()));
            C0Y9G c0y9g = this.LIZ.get(C0YNP.LJ(c1434905jX.LIZ));
            if (c0y9g != null && c0y9g.LIZLLL > 0 && !c0y9g.LJII) {
                this.LJII.LJIIIIZZ(Unit.LIZ);
            }
        }
    }

    @Override // X.InterfaceC878620YdQ
    public final void setDataSource(List<C0Y9G> list) {
        this.LIZ.clear();
        ConcurrentHashMap<String, C0Y9G> concurrentHashMap = this.LIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C0Y9G c0y9g : list) {
            linkedHashMap.put(c0y9g.LIZ, c0y9g);
        }
        concurrentHashMap.putAll(linkedHashMap);
        this.LIZJ.clear();
        this.LJII.LJIIIIZZ(Unit.LIZ);
        if (this.LIZ.size() == 1) {
            this.LIZLLL.putAll(this.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<X.C0Y9G> r24, X.InterfaceC1364105Vn<? super java.lang.Long> r25) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C878880Ydq.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC878620YdQ
    public final void LJIIJJI(C877540Ybg c877540Ybg, C0Y8T c0y8t) {
        if (!LJIIIIZZ(c877540Ybg)) {
            return;
        }
        C0Y9G c0y9gLIZ = C0Y9H.LIZ(c0y8t);
        String strLIZ = C878890Ydr.LIZ(c0y8t);
        if (Intrinsics.LJFF(strLIZ, "1")) {
            this.LIZ.put(c0y8t.getConversationId(), c0y9gLIZ);
        } else if (Intrinsics.LJFF(strLIZ, CardStruct.IStatusCode.DEFAULT)) {
            LIZIZ(c0y8t.getConversationId());
        } else if (C878890Ydr.LIZIZ(c0y8t)) {
            this.LIZ.put(c0y8t.getConversationId(), c0y9gLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUpdateConversation: ");
            sbLIZ.append(c0y8t.getConversationId());
            sbLIZ.append(", is story reactions");
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            LIZIZ(c0y8t.getConversationId());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUpdateConversation: ");
            sbLIZ2.append(c0y8t.getConversationId());
            sbLIZ2.append(", is not story reactions");
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LJII.LJIIIIZZ(Unit.LIZ);
    }
}
