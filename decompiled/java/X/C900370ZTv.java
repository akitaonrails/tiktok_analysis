package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.IUnavailableMessageCheck;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900370ZTv implements C1DW6, InterfaceC1608000rwk {
    public final String LL;
    public final Aweme LLILLJJLI;
    public final Boolean LLILLL;
    public final List<C869590Y9l> LLILZLL;
    public C900390ZTx LLIZLLLIL;
    public int LLJ;
    public final long LLJI;
    public InterfaceC594490NTj LLJILJILJ;
    public final int[] LLJILLL;
    public final IUnavailableMessageCheck LLJJ;
    public final boolean LLILZ = true;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(386));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(746));
    public boolean LLJIJIL = true;
    public boolean LLJILJIL = true;

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
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
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    @Override // X.InterfaceC1608000rwk
    public final void LJI() {
        C900390ZTx c900390ZTx = this.LLIZLLLIL;
        if (c900390ZTx != null) {
            c900390ZTx.LIZ().LJI();
        }
        LJIIIZ().clear();
        this.LLJ = 0;
        this.LLJILJILJ = null;
    }

    public final List<C869590Y9l> LJIIIZ() {
        return (List) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1608000rwk
    public final void refresh() {
        if (this.LLJ != 0) {
            return;
        }
        List listLJIIJ = LJIIJ(1, this.LLJI);
        InterfaceC594490NTj interfaceC594490NTj = this.LLJILJILJ;
        if (interfaceC594490NTj != null) {
            interfaceC594490NTj.LIZ(LJIIJJI(listLJIIJ, true));
        }
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LIZLLL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1608000rwk
    public final Aweme LJIIIIZZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1608000rwk
    public final long getStartIndex() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1608000rwk
    public final void LIZJ(long j) {
        if (this.LLJ == 0 && this.LLILZ) {
            List listLJIIJ = LJIIJ(3, j);
            if (!listLJIIJ.isEmpty()) {
                InterfaceC594490NTj interfaceC594490NTj = this.LLJILJILJ;
                if (interfaceC594490NTj != null) {
                    interfaceC594490NTj.LIZJ(LJIIJJI(listLJIIJ, true));
                    return;
                }
                return;
            }
            if (this.LLJIJIL) {
                this.LLJ = 3;
                C900390ZTx c900390ZTx = this.LLIZLLLIL;
                if (c900390ZTx != null) {
                    c900390ZTx.LIZ().LJJIII();
                    return;
                }
                return;
            }
            InterfaceC594490NTj interfaceC594490NTj2 = this.LLJILJILJ;
            if (interfaceC594490NTj2 != null) {
                interfaceC594490NTj2.LIZJ(LJIIJJI(null, false));
            }
        }
    }

    @Override // X.InterfaceC1608000rwk
    public final void LJ(C1607990rwj c1607990rwj) {
        C900390ZTx c900390ZTxLIZ = C900380ZTw.LIZ(this.LL, this.LLJILLL, 7, this.LLILZLL, false, 48);
        c900390ZTxLIZ.LIZ().LJJJIL(this);
        this.LLIZLLLIL = c900390ZTxLIZ;
        List<C869590Y9l> list = this.LLILZLL;
        LJIIIZ().clear();
        if (list != null && !((ArrayList) list).isEmpty()) {
            LJIIIZ().addAll(list);
        }
        this.LLJILJIL = true;
        this.LLJIJIL = true;
        this.LLJILJILJ = c1607990rwj;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C869590Y9l> LJII(java.util.List<? extends X.C869590Y9l> r11) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C900370ZTv.LJII(java.util.List):java.util.List");
    }

    @Override // X.InterfaceC1608000rwk
    public final void deleteItem(String str) {
        ((HashSet) this.LLILZIL.getValue()).add(str);
    }

    @Override // X.InterfaceC1608000rwk
    public final void LIZIZ(long j, boolean z) {
        if (this.LLJ == 0 && this.LLILZ) {
            List listLJIIJ = LJIIJ(2, j);
            if (!listLJIIJ.isEmpty()) {
                InterfaceC594490NTj interfaceC594490NTj = this.LLJILJILJ;
                if (interfaceC594490NTj != null) {
                    interfaceC594490NTj.LIZIZ(LJIIJJI(listLJIIJ, true));
                    return;
                }
                return;
            }
            if (C300800Bqg.LIZ() && z) {
                InterfaceC594490NTj interfaceC594490NTj2 = this.LLJILJILJ;
                if (interfaceC594490NTj2 != null) {
                    interfaceC594490NTj2.LIZIZ(LJIIJJI(null, false));
                    return;
                }
                return;
            }
            if (this.LLJILJIL) {
                this.LLJ = 2;
                C900390ZTx c900390ZTx = this.LLIZLLLIL;
                if (c900390ZTx != null) {
                    c900390ZTx.LIZ().LJJJI();
                    return;
                }
                return;
            }
            InterfaceC594490NTj interfaceC594490NTj3 = this.LLJILJILJ;
            if (interfaceC594490NTj3 != null) {
                interfaceC594490NTj3.LIZIZ(LJIIJJI(null, false));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJIIJ(int r8, long r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.LJIIIZ()
            int r0 = r0.size()
            if (r0 > 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L10:
            java.util.List r0 = r7.LJIIIZ()
            java.util.Iterator r6 = r0.iterator()
            r3 = 0
            r4 = 0
        L1a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r6.next()
            int r5 = r4 + 1
            if (r4 < 0) goto L8d
            X.0Y9l r0 = (X.C869590Y9l) r0
            long r1 = r0.getIndex()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L85
            java.util.List r0 = r7.LJIIIZ()
            int r2 = r0.size()
            r0 = 1
            if (r8 == r0) goto L66
            r0 = 2
            if (r8 == r0) goto L5c
            r0 = 3
            if (r8 != r0) goto L87
            int r0 = r2 + (-1)
            if (r4 == r0) goto L87
            int r1 = r4 + 1
            int r0 = r1 + 7
            int r2 = java.lang.Math.min(r0, r2)
        L4f:
            if (r1 < 0) goto L87
        L51:
            if (r2 < 0) goto L87
            java.util.List r0 = r7.LJIIIZ()
            java.util.List r0 = r0.subList(r1, r2)
            return r0
        L5c:
            if (r4 == 0) goto L87
            int r0 = r4 + (-7)
            int r1 = java.lang.Math.max(r3, r0)
            r2 = r4
            goto L4f
        L66:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LLILLJJLI
            if (r0 != 0) goto L6e
            int r2 = r4 + 1
            r1 = r4
            goto L51
        L6e:
            int r0 = r4 + (-3)
            int r1 = java.lang.Math.max(r3, r0)
            int r0 = r1 + 7
            int r2 = java.lang.Math.min(r0, r2)
            int r0 = r2 + (-7)
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = java.lang.Math.min(r1, r0)
            goto L4f
        L85:
            r4 = r5
            goto L1a
        L87:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L8d:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L92:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C900370ZTv.LJIIJ(int, long):java.util.List");
    }

    public final C597250Nbf LJIIJJI(List<? extends C869590Y9l> list, boolean z) {
        Aweme awemeLJIILJJIL;
        C912500Zqy c912500Zqy;
        AwemeCardTemplate awemeCardTemplate;
        VideoCoverComponent videoCoverComponent;
        String str;
        Aweme awemeLJIILIIL;
        Aweme awemeLJIJ;
        if (list != null && !list.isEmpty()) {
            ArrayList<C869590Y9l> arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : list) {
                if (!C0ZDX.LJJJJZ(c869590Y9l)) {
                    arrayList.add(c869590Y9l);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C869590Y9l c869590Y9l2 : arrayList) {
                int msgType = c869590Y9l2.getMsgType();
                if (msgType != 1802) {
                    if (msgType != 1803) {
                        if (msgType != 1809) {
                            if (msgType == 1812) {
                                IMCameraBridgeApi.LIZ.getClass();
                                IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
                                if (iMCameraBridgeApiLIZ != null && (awemeLJIILJJIL = iMCameraBridgeApiLIZ.LJIILJJIL(c869590Y9l2)) != null) {
                                    String aid = awemeLJIILJJIL.getAid();
                                    if (aid == null) {
                                        aid = "";
                                    }
                                    c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), aid, awemeLJIILJJIL);
                                    arrayList2.add(c912500Zqy);
                                }
                            }
                        } else if (!Intrinsics.LJFF(c869590Y9l2.getScene(), "share_video_story") && (awemeCardTemplate = (AwemeCardTemplate) C0Z2Z.LIZ(c869590Y9l2, AwemeCardTemplate.class)) != null && (videoCoverComponent = awemeCardTemplate.baseVideoComponent) != null && (str = videoCoverComponent.id) != null && str.length() != 0 && !((HashSet) this.LLILZIL.getValue()).contains(str)) {
                            c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), str, null);
                            arrayList2.add(c912500Zqy);
                        }
                    } else {
                        IMCameraBridgeApi.LIZ.getClass();
                        IMCameraBridgeApi iMCameraBridgeApiLIZ2 = C461620I8i.LIZ();
                        if (iMCameraBridgeApiLIZ2 != null && (awemeLJIILIIL = iMCameraBridgeApiLIZ2.LJIILIIL(c869590Y9l2, this.LLILLL)) != null) {
                            c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), awemeLJIILIIL.getAid(), awemeLJIILIIL);
                            arrayList2.add(c912500Zqy);
                        }
                    }
                } else {
                    IMCameraBridgeApi.LIZ.getClass();
                    IMCameraBridgeApi iMCameraBridgeApiLIZ3 = C461620I8i.LIZ();
                    if (iMCameraBridgeApiLIZ3 != null && (awemeLJIJ = iMCameraBridgeApiLIZ3.LJIJ(c869590Y9l2, this.LLILLL)) != null) {
                        c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), awemeLJIJ.getAid(), awemeLJIJ);
                        arrayList2.add(c912500Zqy);
                    }
                }
            }
            return new C597250Nbf(arrayList2, z);
        }
        return new C597250Nbf(C13BV.INSTANCE, z);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
        if (enumC872590YKz != EnumC872590YKz.SUCCESS) {
            this.LLJIJIL = false;
            InterfaceC594490NTj interfaceC594490NTj = this.LLJILJILJ;
            if (interfaceC594490NTj != null) {
                interfaceC594490NTj.LIZJ(LJIIJJI(null, false));
            }
            this.LLJ = 0;
            return;
        }
        boolean z = true;
        if (list == null || list.isEmpty() || !(!list.isEmpty()) || list.size() < 7) {
            z = false;
        }
        this.LLJIJIL = z;
        List<C869590Y9l> listLJII = LJII(list);
        if (!((ArrayList) listLJII).isEmpty()) {
            LJIIIZ().addAll(listLJII);
        }
        InterfaceC594490NTj interfaceC594490NTj2 = this.LLJILJILJ;
        if (interfaceC594490NTj2 != null) {
            interfaceC594490NTj2.LIZJ(LJIIJJI(listLJII, this.LLJIJIL));
        }
        this.LLJ = 0;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        if (list.isEmpty()) {
            return;
        }
        List<C869590Y9l> listLJII = LJII(list);
        if (!((ArrayList) listLJII).isEmpty()) {
            LJIIIZ().addAll(listLJII);
        }
        InterfaceC594490NTj interfaceC594490NTj = this.LLJILJILJ;
        if (interfaceC594490NTj != null) {
            interfaceC594490NTj.LIZIZ(LJIIJJI(listLJII, this.LLJILJIL));
        }
        this.LLJ = 0;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
        if (!z) {
            this.LLJILJIL = false;
            if (C300800Bqg.LIZ()) {
                this.LLJ = 0;
                InterfaceC594490NTj interfaceC594490NTj = this.LLJILJILJ;
                if (interfaceC594490NTj != null) {
                    interfaceC594490NTj.LIZIZ(LJIIJJI(C13BV.INSTANCE, false));
                    return;
                }
                return;
            }
            InterfaceC594490NTj interfaceC594490NTj2 = this.LLJILJILJ;
            if (interfaceC594490NTj2 != null) {
                interfaceC594490NTj2.LIZIZ(LJIIJJI(C13BV.INSTANCE, false));
            }
            this.LLJ = 0;
            return;
        }
        boolean z2 = true;
        if (list == null || list.isEmpty() || !(!list.isEmpty()) || list.size() < 7) {
            z2 = false;
        }
        this.LLJILJIL = z2;
        List<C869590Y9l> listLJII = LJII(list);
        if (!((ArrayList) listLJII).isEmpty()) {
            LJIIIZ().addAll(0, listLJII);
        }
        InterfaceC594490NTj interfaceC594490NTj3 = this.LLJILJILJ;
        if (interfaceC594490NTj3 != null) {
            interfaceC594490NTj3.LIZIZ(LJIIJJI(listLJII, this.LLJILJIL));
        }
        this.LLJ = 0;
    }

    public C900370ZTv(String str, C869590Y9l c869590Y9l, Aweme aweme, Boolean bool, List list) {
        int[] iArr;
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = bool;
        this.LLJI = c869590Y9l.getIndex();
        if (c869590Y9l.getMsgType() == 1809) {
            iArr = new int[]{1809};
        } else {
            iArr = new int[]{1802, 1803, 1812};
        }
        this.LLJILLL = iArr;
        this.LLJJ = (IUnavailableMessageCheck) PluggableExtentionKt.pluggableSpiForReal(IUnavailableMessageCheck.class);
        this.LLILZLL = LJII(list);
    }
}
