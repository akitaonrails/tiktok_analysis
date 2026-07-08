package X;

import Y.ARunnableS102S0100000_2;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1754506tz implements InterfaceC1755906uD {
    public final C1758406uc LIZIZ;
    public final InterfaceC1755906uD LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public String LJI;
    public final HashSet<String> LJII;
    public boolean LJIIIIZZ;
    public Boolean LJIIIZ;
    public AnonymousClass0956 LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;

    @Override // X.InterfaceC1755906uD
    public final void LIZ(C1DW6 c1dw6) {
        this.LIZJ.LIZ(c1dw6);
    }

    @Override // X.InterfaceC1755906uD
    public final Object LIZIZ(C912530Zr1 c912530Zr1) {
        return this.LIZJ.LIZIZ(c912530Zr1);
    }

    @Override // X.InterfaceC1755906uD
    public final void LIZJ(long j) {
        this.LIZJ.LIZJ(j);
    }

    @Override // X.InterfaceC1755906uD
    public final void LJ() {
        this.LIZJ.LJ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJFF(C1DW6 c1dw6) {
        this.LIZJ.LJFF(c1dw6);
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJI() {
        return this.LIZJ.LJI();
    }

    @Override // X.InterfaceC1755906uD
    public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
        return this.LIZJ.LJII(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1755906uD
    public final C869590Y9l LJIIIIZZ() {
        return this.LIZJ.LJIIIIZZ();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJIIIZ() {
        return this.LIZJ.LJIIIZ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIJ() {
        this.LIZJ.LJIIJ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIJJI(int i) {
        this.LIZJ.LJIIJJI(i);
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIL() {
        this.LIZJ.LJIIL();
    }

    @Override // X.InterfaceC1755906uD
    public final C869590Y9l LJIILJJIL() {
        return this.LIZJ.LJIILJJIL();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJIJ() {
        return this.LIZJ.LJIJ();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJJJJI() {
        return this.LIZJ.LJJJJI();
    }

    @Override // X.InterfaceC1755906uD
    public final int LJJJJIZL() {
        return this.LIZJ.LJJJJIZL();
    }

    @Override // X.InterfaceC1755906uD
    public final String getConversationId() {
        return this.LIZJ.getConversationId();
    }

    @Override // X.InterfaceC1755906uD
    public final void refresh() {
        this.LIZJ.refresh();
    }

    @Override // X.InterfaceC1755906uD
    public final void resume() {
        this.LIZJ.resume();
    }

    @Override // X.InterfaceC1755906uD
    public final void stop() {
        this.LIZJ.stop();
    }

    public final C869590Y9l LJIILL() {
        return (C869590Y9l) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJJIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJIIJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZJ.LJJIZ();
    }

    @Override // X.InterfaceC1755906uD
    public final List<C869590Y9l> LIZLLL() {
        int i;
        boolean z = C0C64.LJIILLIIL().LJIJ(31744, 0, "im_social_avatar_entrance_debug_skip_checks", true) == 1;
        IMSocialAvatarStatus value = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLI(this.LIZJ.getConversationId(), false).getValue();
        boolean zLJFF = Intrinsics.LJFF(value, C1754806u2.INSTANCE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMessageList conv=");
        sbLIZ.append(this.LIZJ.getConversationId());
        sbLIZ.append(" status=");
        sbLIZ.append(value);
        sbLIZ.append(" isNotAvailable=");
        sbLIZ.append(zLJFF);
        sbLIZ.append(" canShow=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" skipChecks=");
        sbLIZ.append(z);
        sbLIZ.append(" thread=");
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z && !zLJFF) {
            this.LJFF = false;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getMessageList disable entrance: status != NotAvailable (status=");
            sbLIZ2.append(value);
            sbLIZ2.append(')');
            C2188811AlT.LIZIZ(sbLIZ2);
            return this.LIZJ.LIZLLL();
        }
        List<C869590Y9l> listLIZLLL = this.LIZJ.LIZLLL();
        if (!z) {
            if (!this.LIZJ.LJJJJI() || this.LJ) {
                return listLIZLLL;
            }
            if (!(listLIZLLL instanceof Collection) || !listLIZLLL.isEmpty()) {
                Iterator<C869590Y9l> it2 = listLIZLLL.iterator();
                while (it2.hasNext()) {
                    if (!(it2.next() instanceof FakeMessage)) {
                    }
                }
            }
            return listLIZLLL;
        }
        if (!this.LJFF) {
            return listLIZLLL;
        }
        LJIILL().setConversationId(this.LIZJ.getConversationId());
        int i2 = -1;
        if (!(this.LJI.length() == 0)) {
            Iterator<C869590Y9l> it3 = listLIZLLL.iterator();
            i = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.LJFF(it3.next().getUuid(), this.LJI)) {
                    break;
                }
                i++;
            }
        } else {
            C1419505h3.LIZ.getClass();
            if (C1419505h3.LIZLLL) {
                ((C1674906h9) this.LJIIL.getValue()).LIZ.storeBoolean("sa_intro_card_shown", false);
            }
            i = 0;
        }
        if (!z || (i >= 0 && i < listLIZLLL.size())) {
            i2 = i;
        } else if (!listLIZLLL.isEmpty()) {
            i2 = 0;
        }
        if (i2 >= 0) {
            if (!z) {
                C1419505h3.LIZ.getClass();
                if (C1419505h3.LIZLLL && !((C1674906h9) this.LJIIL.getValue()).LIZ.getBoolean("sa_intro_card_shown", false) && !Intrinsics.LJFF(this.LJIIIZ, Boolean.TRUE)) {
                    if (!Intrinsics.LJFF(this.LJIIIZ, Boolean.FALSE) && !this.LJIIIIZZ) {
                        this.LJIIIIZZ = true;
                        AnonymousClass0956 anonymousClass0956 = this.LJIIJ;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        this.LJIIJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C1701106lN(this, null), 2);
                    }
                }
            }
            C1419505h3.LIZ.getClass();
            if (C1419505h3.LIZLLL && !((C1674906h9) this.LJIIL.getValue()).LIZ.getBoolean("sa_intro_card_shown", false)) {
                ((C1674906h9) this.LJIIL.getValue()).LIZ.storeBoolean("sa_intro_card_shown", true);
            }
            C869590Y9l c869590Y9l = (C869590Y9l) ListProtector.get(listLIZLLL, i2);
            this.LJI = c869590Y9l.getUuid();
            C869590Y9l c869590Y9lLJIILL = LJIILL();
            c869590Y9lLJIILL.getLocalExt().put("anchor_msg_id", this.LJI);
            c869590Y9lLJIILL.setCreatedAt(c869590Y9l.getCreatedAt());
            c869590Y9lLJIILL.setOrderIndex(c869590Y9l.getOrderIndex());
            c869590Y9lLJIILL.setIndex(c869590Y9l.getIndex());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getMessageList show entrance card at index=");
            sbLIZ3.append(i2);
            sbLIZ3.append(" anchorMsgUUID=");
            sbLIZ3.append(this.LJI);
            sbLIZ3.append(" skipChecks=");
            sbLIZ3.append(z);
            C2188811AlT.LIZIZ(sbLIZ3);
            ArrayList arrayList = new ArrayList(listLIZLLL);
            ListProtector.add(arrayList, i2, LJIILL());
            return arrayList;
        }
        return listLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.util.List<? extends X.C869590Y9l> r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1754506tz.LJIILIIL(java.util.List):void");
    }

    public C1754506tz(C1758406uc c1758406uc, InterfaceC1755906uD interfaceC1755906uD) {
        boolean z;
        this.LIZIZ = c1758406uc;
        this.LIZJ = interfaceC1755906uD;
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        this.LIZLLL = c454640HsE.LIZIZ().getImSocialAvatarService().LJJJJZI();
        if (!c1758406uc.LJ && c454640HsE.LIZIZ().getImSocialAvatarService().LJIIIZ(interfaceC1755906uD.getConversationId())) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        this.LJI = c454640HsE.LIZIZ().getImSocialAvatarService().LJJJJJL();
        this.LJII = new HashSet<>();
        this.LJIIJJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(965));
        this.LJIIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(964));
        C1DW7 c1dw7 = new C1DW7(new C1DW6() { // from class: X.06lP
            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void LLILZ(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Re(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
            }

            @Override // X.C1DW6
            public final void VD0(C1DW6 c1dw6) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void mf(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void nc(List<? extends C869590Y9l> list) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void ns(String str) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void su(C869590Y9l c869590Y9l, boolean z2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void u6(List<C869590Y9l> list, boolean z2) {
            }

            @Override // X.C1DW6
            public final void yf1(C1DW6 c1dw6) {
            }

            public final void LIZ(C869590Y9l c869590Y9l) {
                if (c869590Y9l != null && this.LL.LJII.add(c869590Y9l.getUuid()) && !Intrinsics.LJFF(c869590Y9l.getLocalExt().get("enter_method"), "suggested_sticker")) {
                    if (Intrinsics.LJFF(this.LL.LJIILL().getLocalExt().get("dismiss"), "true")) {
                        this.LL.LJ = true;
                    }
                    C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(this.LL, 54));
                }
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Jk(C869590Y9l c869590Y9l, int i) {
                if (!(c869590Y9l instanceof FakeMessage)) {
                    LIZ(c869590Y9l);
                }
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
                LIZ(c869590Y9l);
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
                if (list != null) {
                    Iterator<C869590Y9l> it2 = list.iterator();
                    while (it2.hasNext()) {
                        LIZ(it2.next());
                    }
                }
                C1754506tz c1754506tz = this.LL;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                c1754506tz.LJIILIIL(list);
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void a(int i, String str, List list, Long l) {
                List<? extends C869590Y9l> listLL;
                C1754506tz c1754506tz = this.LL;
                if (list == null || (listLL = C13LP.LL(list, 10)) == null) {
                    listLL = C13BV.INSTANCE;
                }
                c1754506tz.LJIILIIL(listLL);
            }
        });
        this.LJIILIIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(963));
        interfaceC1755906uD.LIZ(c1dw7);
    }
}
