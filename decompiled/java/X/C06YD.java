package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06YD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06YD implements InterfaceC1755206u6, InterfaceC1602006Pa {
    public final String LIZ;
    public final String LIZIZ;
    public final ConcurrentHashMap<Integer, FakeMessage> LIZJ = new ConcurrentHashMap<>();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1117));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1116));
    public boolean LJFF;
    public Boolean LJI;
    public boolean LJII;
    public Boolean LJIIIIZZ;
    public C1DW6 LJIIIZ;
    public C1755106u5 LJIIJ;
    public AnonymousClass0956 LJIIJJI;
    public AnonymousClass0956 LJIIL;

    @Override // X.InterfaceC1602006Pa
    public final void LIZIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06Y8(this, null), 3);
    }

    @Override // X.InterfaceC1755206u6
    public final List<C869590Y9l> LIZJ() {
        List<C869590Y9l> listLLIIII = C13LP.LLIIII(this.LIZJ.values());
        C1419505h3.LIZ.getClass();
        if (C1419505h3.LIZLLL) {
            FakeMessage fakeMessage = this.LIZJ.get(1);
            if (fakeMessage != null) {
                long j = ((C1674906h9) this.LJ.getValue()).LIZ.getLong("streak_reminder_last_allowed_order", 0L);
                if (!C06RG.LIZ(EnumC1641806bo.STREAK_COUNTDOWN) || fakeMessage.getOrderIndex() == j) {
                    this.LJFF = true;
                    this.LJI = Boolean.TRUE;
                } else if (!this.LJFF) {
                    this.LJFF = true;
                    AnonymousClass0956 anonymousClass0956 = this.LJIIJJI;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    this.LJIIJJI = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C06YC(this, fakeMessage, null), 2);
                }
            }
            FakeMessage fakeMessage2 = this.LIZJ.get(2);
            if (fakeMessage2 != null) {
                long j2 = ((C1674906h9) this.LJ.getValue()).LIZ.getLong("streak_continue_last_allowed_order", 0L);
                if (!C06RG.LIZ(EnumC1670906gV.STREAKS_PROGRESS) || fakeMessage2.getOrderIndex() == j2) {
                    this.LJII = true;
                    this.LJIIIIZZ = Boolean.TRUE;
                } else if (!this.LJII) {
                    this.LJII = true;
                    AnonymousClass0956 anonymousClass09562 = this.LJIIL;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    this.LJIIL = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C06YE(this, fakeMessage2, null), 2);
                }
            }
            if (!Intrinsics.LJFF(this.LJI, Boolean.TRUE)) {
                ArrayList arrayList = new ArrayList();
                for (C869590Y9l c869590Y9l : listLLIIII) {
                    if (!Intrinsics.LJFF(c869590Y9l.getLocalExt().get("streak_inline_type"), "1")) {
                        arrayList.add(c869590Y9l);
                    }
                }
                listLLIIII = arrayList;
            }
            if (!Intrinsics.LJFF(this.LJIIIIZZ, Boolean.TRUE)) {
                ArrayList arrayList2 = new ArrayList();
                for (C869590Y9l c869590Y9l2 : listLLIIII) {
                    if (!Intrinsics.LJFF(c869590Y9l2.getLocalExt().get("streak_inline_type"), "2")) {
                        arrayList2.add(c869590Y9l2);
                    }
                }
                return arrayList2;
            }
        }
        return listLLIIII;
    }

    @Override // X.InterfaceC1755206u6
    public final void LJI() {
        ((CopyOnWriteArraySet) C06PZ.LIZ.getValue()).remove(this);
        this.LJIIIZ = null;
        AnonymousClass0956 anonymousClass0956 = this.LJIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJIIJJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC1755206u6
    public final void refresh() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06Y8(this, null), 3);
    }

    @Override // X.InterfaceC1755206u6
    public final void LIZ(C1DW6 c1dw6) {
        ((CopyOnWriteArraySet) C06PZ.LIZ.getValue()).add(this);
        this.LJIIIZ = c1dw6;
    }

    public C06YD(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
