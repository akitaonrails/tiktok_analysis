package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ShareCommentCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseShareCommentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ShareRepostComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900360ZTu implements C1DW6, InterfaceC1608000rwk {
    public final String LL;
    public final Aweme LLILLJJLI;
    public final Boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final List<C869590Y9l> LLIZ;
    public C900390ZTx LLJ;
    public int LLJI;
    public final long LLJIJIL;
    public InterfaceC594490NTj LLJILLL;
    public final int[] LLJJ;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(357));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(358));
    public boolean LLJILJIL = true;
    public boolean LLJILJILJ = true;

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LJFF() {
        return true;
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
        C900390ZTx c900390ZTx = this.LLJ;
        if (c900390ZTx != null) {
            c900390ZTx.LIZ().LJI();
        }
        LJIIJ().clear();
        this.LLJI = 0;
        this.LLJILLL = null;
    }

    public final HashSet<String> LJIIIZ() {
        return (HashSet) this.LLILZLL.getValue();
    }

    public final List<C869590Y9l> LJIIJ() {
        return (List) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1608000rwk
    public final void refresh() {
        boolean z = true;
        if (this.LLJI != 0) {
            return;
        }
        List listLJIIJJI = LJIIJJI(1, this.LLJIJIL);
        if ((!(!listLJIIJJI.isEmpty()) || !(!LJIIJ().isEmpty()) || LJIIJ().indexOf(C13LP.LJJLIIIJJI(listLJIIJJI)) >= LJIIJ().size() - 1) && !this.LLILZIL) {
            z = false;
        }
        InterfaceC594490NTj interfaceC594490NTj = this.LLJILLL;
        if (interfaceC594490NTj != null) {
            interfaceC594490NTj.LIZ(LJIIL(listLJIIJJI, z));
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
        return this.LLJIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.C869590Y9l> LJII(java.util.List<? extends X.C869590Y9l> r11) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C900360ZTu.LJII(java.util.List):java.util.List");
    }

    @Override // X.InterfaceC1608000rwk
    public final void LIZJ(long j) {
        if (this.LLJI == 0 && this.LLILZ) {
            List listLJIIJJI = LJIIJJI(3, j);
            if (!listLJIIJJI.isEmpty()) {
                InterfaceC594490NTj interfaceC594490NTj = this.LLJILLL;
                if (interfaceC594490NTj != null) {
                    interfaceC594490NTj.LIZJ(LJIIL(listLJIIJJI, true));
                    return;
                }
                return;
            }
            if (this.LLJILJIL) {
                this.LLJI = 3;
                C900390ZTx c900390ZTx = this.LLJ;
                if (c900390ZTx != null) {
                    c900390ZTx.LIZ().LJJJI();
                    return;
                }
                return;
            }
            InterfaceC594490NTj interfaceC594490NTj2 = this.LLJILLL;
            if (interfaceC594490NTj2 != null) {
                interfaceC594490NTj2.LIZJ(LJIIL(null, false));
            }
        }
    }

    @Override // X.InterfaceC1608000rwk
    public final void LJ(C1607990rwj c1607990rwj) {
        C900390ZTx c900390ZTxLIZ = C900380ZTw.LIZ(this.LL, this.LLJJ, 7, this.LLIZ, false, 48);
        c900390ZTxLIZ.LIZ().LJJJIL(this);
        this.LLJ = c900390ZTxLIZ;
        List<C869590Y9l> list = this.LLIZ;
        LJIIJ().clear();
        if (list != null && !((ArrayList) list).isEmpty()) {
            LJIIJ().addAll(C13LP.LJLJJLL(list));
        }
        this.LLJILJILJ = true;
        this.LLJILJIL = true;
        this.LLJILLL = c1607990rwj;
    }

    @Override // X.InterfaceC1608000rwk
    public final void deleteItem(String str) {
        LJIIIZ().add(str);
    }

    @Override // X.InterfaceC1608000rwk
    public final void LIZIZ(long j, boolean z) {
        if (this.LLJI == 0 && this.LLILZ) {
            List listLJIIJJI = LJIIJJI(2, j);
            if (!listLJIIJJI.isEmpty()) {
                InterfaceC594490NTj interfaceC594490NTj = this.LLJILLL;
                if (interfaceC594490NTj != null) {
                    interfaceC594490NTj.LIZIZ(LJIIL(listLJIIJJI, true));
                    return;
                }
                return;
            }
            if (C300800Bqg.LIZ() && z) {
                InterfaceC594490NTj interfaceC594490NTj2 = this.LLJILLL;
                if (interfaceC594490NTj2 != null) {
                    interfaceC594490NTj2.LIZIZ(LJIIL(null, false));
                    return;
                }
                return;
            }
            if (this.LLJILJILJ) {
                this.LLJI = 2;
                C900390ZTx c900390ZTx = this.LLJ;
                if (c900390ZTx != null) {
                    c900390ZTx.LIZ().LJJIII();
                    return;
                }
                return;
            }
            InterfaceC594490NTj interfaceC594490NTj3 = this.LLJILLL;
            if (interfaceC594490NTj3 != null) {
                interfaceC594490NTj3.LIZIZ(LJIIL(null, false));
            }
        }
    }

    public final List LJIIJJI(int i, long j) {
        int iMin;
        if (LJIIJ().size() <= 0) {
            return new ArrayList();
        }
        int iMin2 = 0;
        for (C869590Y9l c869590Y9l : LJIIJ()) {
            int i2 = iMin2 + 1;
            if (iMin2 >= 0) {
                if (c869590Y9l.getIndex() == j) {
                    int size = LJIIJ().size();
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3 && iMin2 != size - 1) {
                                iMin = iMin2 + 1;
                                iMin2 = Math.min(iMin + 7, size);
                            }
                        } else if (iMin2 != 0) {
                            iMin = Math.max(0, iMin2 - 7);
                        }
                        return new ArrayList();
                    }
                    int iMax = Math.max(0, iMin2 - 3);
                    iMin2 = Math.min(iMax + 7, size);
                    iMin = Math.min(iMax, Math.max(0, iMin2 - 7));
                    if (iMin >= 0 && iMin2 >= 0) {
                        return LJIIJ().subList(iMin, iMin2);
                    }
                    return new ArrayList();
                }
                iMin2 = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new ArrayList();
    }

    public final C597250Nbf LJIIL(List<? extends C869590Y9l> list, boolean z) {
        Integer numValueOf;
        C912500Zqy c912500Zqy;
        String itemId;
        Aweme awemeLIZJ;
        BaseShareCommentComponent baseShareCommentComponent;
        String string;
        String str;
        DynamicInfoComponent dynamicInfoComponent;
        DynamicCardClientInfoComponent dynamicCardClientInfoComponent;
        ShareRepostComponent shareRepostComponent;
        Long l;
        String string2;
        AwemeCardTemplate awemeCardTemplate;
        VideoCoverComponent videoCoverComponent;
        String str2;
        String awemeId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("packResponse: ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
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
                if (msgType != 8 && msgType != 11) {
                    if (msgType != 40) {
                        if (msgType != 1809) {
                            if (msgType != 1817) {
                                String str3 = "";
                                if (msgType != 2000) {
                                    if (msgType != 1802) {
                                        if (msgType != 1803) {
                                            if (msgType != 1811) {
                                                if (msgType == 1812 && (awemeLIZJ = C911220Zou.LIZJ(c869590Y9l2)) != null) {
                                                    String aid = awemeLIZJ.getAid();
                                                    if (aid != null) {
                                                        str3 = aid;
                                                    }
                                                    c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), str3, awemeLIZJ);
                                                }
                                            } else {
                                                ShareCommentCardTemplate shareCommentCardTemplate = (ShareCommentCardTemplate) C0Z2Z.LIZ(c869590Y9l2, ShareCommentCardTemplate.class);
                                                if (shareCommentCardTemplate != null && (baseShareCommentComponent = shareCommentCardTemplate.baseShareComment) != null && (string = Long.valueOf(baseShareCommentComponent.itemId).toString()) != null && string.length() != 0 && !LJIIIZ().contains(string)) {
                                                    c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), string, null);
                                                }
                                            }
                                        } else {
                                            Aweme awemeLJ = C911220Zou.LJ(c869590Y9l2, this.LLILLL);
                                            c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), awemeLJ.getAid(), awemeLJ);
                                        }
                                    } else {
                                        Aweme awemeLIZLLL = C911220Zou.LIZLLL(c869590Y9l2, this.LLILLL);
                                        c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), awemeLIZLLL.getAid(), awemeLIZLLL);
                                    }
                                    arrayList2.add(c912500Zqy);
                                } else if (Intrinsics.LJFF(c869590Y9l2.getScene(), "ci_share_collaborative_collection")) {
                                    DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l2, DynamicCardTemplate.class);
                                    if (dynamicCardTemplate != null && (dynamicInfoComponent = dynamicCardTemplate.dynamicInfo) != null && (dynamicCardClientInfoComponent = dynamicInfoComponent.dynamicCardClientInfo) != null) {
                                        str = dynamicCardClientInfoComponent.resourceId;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        str3 = str;
                                    }
                                    c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), str3, null);
                                    arrayList2.add(c912500Zqy);
                                }
                            } else {
                                ShareRepostCardTemplate shareRepostCardTemplate = (ShareRepostCardTemplate) C0Z2Z.LIZ(c869590Y9l2, ShareRepostCardTemplate.class);
                                if (shareRepostCardTemplate != null && (shareRepostComponent = shareRepostCardTemplate.shareRepost) != null && (l = shareRepostComponent.itemId) != null && (string2 = l.toString()) != null && string2.length() != 0 && !LJIIIZ().contains(string2)) {
                                    c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), string2, null);
                                    arrayList2.add(c912500Zqy);
                                }
                            }
                        } else if (!Intrinsics.LJFF(c869590Y9l2.getScene(), "share_video_story") && !Intrinsics.LJFF(c869590Y9l2.getScene(), "share_highlight_story") && !Intrinsics.LJFF(c869590Y9l2.getScene(), "share_highlight_story_collection") && (awemeCardTemplate = (AwemeCardTemplate) C0Z2Z.LIZ(c869590Y9l2, AwemeCardTemplate.class)) != null && (videoCoverComponent = awemeCardTemplate.baseVideoComponent) != null && (str2 = videoCoverComponent.id) != null && str2.length() != 0 && !LJIIIZ().contains(str2)) {
                            c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), str2, null);
                            arrayList2.add(c912500Zqy);
                        }
                    } else {
                        CommentContent commentContent = (CommentContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l2, CommentContent.class);
                        if (commentContent != null && (awemeId = commentContent.getAwemeId()) != null && awemeId.length() != 0 && !LJIIIZ().contains(awemeId)) {
                            c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), awemeId, null);
                            arrayList2.add(c912500Zqy);
                        }
                    }
                } else {
                    ShareAwemeContent shareAwemeContent = (ShareAwemeContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l2, ShareAwemeContent.class);
                    if (shareAwemeContent != null && (itemId = shareAwemeContent.getItemId()) != null && itemId.length() != 0 && !LJIIIZ().contains(itemId)) {
                        c912500Zqy = new C912500Zqy(c869590Y9l2.getIndex(), itemId, null);
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
        Integer numValueOf;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadOlder ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", cache size ");
        sbLIZ.append(LJIIJ().size());
        sbLIZ.append(", result ");
        sbLIZ.append(enumC872590YKz);
        C2188811AlT.LIZIZ(sbLIZ);
        if (enumC872590YKz != EnumC872590YKz.SUCCESS) {
            return;
        }
        if (list != null && !list.isEmpty() && list.size() >= 7) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJILJ = z;
        List<? extends C869590Y9l> listLJLJJLL = C13LP.LJLJJLL(LJII(list));
        if (listLJLJJLL != null && !listLJLJJLL.isEmpty()) {
            LJIIJ().addAll(0, listLJLJJLL);
        }
        InterfaceC594490NTj interfaceC594490NTj = this.LLJILLL;
        if (interfaceC594490NTj != null) {
            interfaceC594490NTj.LIZIZ(LJIIL(listLJLJJLL, this.LLJILJILJ));
        }
        this.LLJI = 0;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        if (list.isEmpty()) {
            return;
        }
        List<? extends C869590Y9l> listLJLJJLL = C13LP.LJLJJLL(LJII(list));
        if (listLJLJJLL != null && !listLJLJJLL.isEmpty()) {
            LJIIJ().addAll(0, listLJLJJLL);
        }
        InterfaceC594490NTj interfaceC594490NTj = this.LLJILLL;
        if (interfaceC594490NTj != null) {
            interfaceC594490NTj.LIZIZ(LJIIL(listLJLJJLL, this.LLJILJILJ));
        }
        this.LLJI = 0;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadNewer ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", cache size ");
        sbLIZ.append(LJIIJ().size());
        sbLIZ.append(", success ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            if (C300800Bqg.LIZ()) {
                this.LLJI = 0;
                InterfaceC594490NTj interfaceC594490NTj = this.LLJILLL;
                if (interfaceC594490NTj != null) {
                    interfaceC594490NTj.LIZJ(LJIIL(C13BV.INSTANCE, false));
                    return;
                }
                return;
            }
            InterfaceC594490NTj interfaceC594490NTj2 = this.LLJILLL;
            if (interfaceC594490NTj2 != null) {
                interfaceC594490NTj2.LIZJ(LJIIL(C13BV.INSTANCE, false));
            }
            this.LLJI = 0;
            return;
        }
        boolean z2 = true;
        if (list == null || list.isEmpty() || list.size() <= 7) {
            z2 = false;
        }
        this.LLJILJIL = z2;
        List<C869590Y9l> listLJII = LJII(list);
        if (!((ArrayList) listLJII).isEmpty()) {
            LJIIJ().addAll(listLJII);
        }
        InterfaceC594490NTj interfaceC594490NTj3 = this.LLJILLL;
        if (interfaceC594490NTj3 != null) {
            interfaceC594490NTj3.LIZJ(LJIIL(listLJII, this.LLJILJIL));
        }
        this.LLJI = 0;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGetMessage: ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        sbLIZ.append("  ");
        sbLIZ.append(c0y7p);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onQueryMessage: ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateMessage: ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C900360ZTu(String str, C869590Y9l c869590Y9l, Aweme aweme, Boolean bool, boolean z, List<? extends C869590Y9l> list, boolean z2) {
        int[] iArr;
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = bool;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLJIJIL = c869590Y9l.getIndex();
        if (C1171750gb7.LIZ()) {
            iArr = new int[]{8, 11, 1809, 1802, 1803, 2000};
        } else {
            iArr = new int[]{8, 11, 1809, 1802, 1803};
        }
        this.LLJJ = iArr;
        this.LLIZ = LJII(list);
    }
}
