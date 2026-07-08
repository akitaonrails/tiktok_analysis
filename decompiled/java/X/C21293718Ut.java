package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetUserCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetUserComponent;
import com.ss.android.ugc.tools.chat.message.cell.usermessagecell.UserMessageCell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS181S1100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.18Ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21293718Ut implements InterfaceC904590ZeD<EnumC902890ZbT, C910300ZnQ> {
    public final C18V0 LL = new InterfaceC607860Nsm() { // from class: X.18V0
        @Override // X.InterfaceC607860Nsm
        public final InterfaceC1891350zJl LIZ(List list, C869590Y9l c869590Y9l, int i, String str) {
            String str2;
            ArrayList arrayList;
            int size;
            int size2;
            C18V6 c18v6;
            C0YC6 c0yc6;
            String str3;
            C18V5 c18v5;
            List<String> list2;
            String str4;
            VisualPoetUserComponent visualPoetUserComponent;
            List<VisualPoetPictureStructComponent> list3;
            VisualPoetPictureStructComponent visualPoetPictureStructComponent;
            VisualPoetUserComponent visualPoetUserComponent2;
            List<VisualPoetPictureStructComponent> list4;
            VisualPoetUserComponent visualPoetUserComponent3;
            String str5;
            VisualPoetUserComponent visualPoetUserComponent4;
            VisualPoetUserCardTemplate visualPoetUserCardTemplate = (VisualPoetUserCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetUserCardTemplate.class);
            String str6 = "";
            if (visualPoetUserCardTemplate == null || (visualPoetUserComponent4 = visualPoetUserCardTemplate.userContentComponent) == null || (str2 = visualPoetUserComponent4.text) == null) {
                str2 = "";
            }
            C910260ZnM c910260ZnM = new C910260ZnM(c869590Y9l.getUuid(), new C1622006Ws(C452501pT.LIZIZ(new AwS181S1100000_32(c869590Y9l, str2, 1))), new C909930Zmp(c869590Y9l)) { // from class: X.0ZnQ
                public final String LLILZLL;
                public final C1622006Ws<C01GW<List<C18VI>>> LLIZ;
                public final C909930Zmp LLIZLLLIL;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C910300ZnQ)) {
                        return false;
                    }
                    C910300ZnQ c910300ZnQ = (C910300ZnQ) obj;
                    return Intrinsics.LJFF(this.LLILZLL, c910300ZnQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c910300ZnQ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c910300ZnQ.LLIZLLLIL);
                }

                public final int hashCode() {
                    int iHashCode = this.LLILZLL.hashCode() * 31;
                    this.LLIZ.getClass();
                    int i2 = iHashCode * 31;
                    C909930Zmp c909930Zmp = this.LLIZLLLIL;
                    return i2 + (c909930Zmp != null ? c909930Zmp.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UserMessageItem(uuid=");
                    sbLIZ.append(this.LLILZLL);
                    sbLIZ.append(", actions=");
                    sbLIZ.append(this.LLIZ);
                    sbLIZ.append(", message=");
                    sbLIZ.append(this.LLIZLLLIL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.C910260ZnM
                public final C1622006Ws<C01GW<List<C18VI>>> LIZIZ() {
                    return this.LLIZ;
                }

                @Override // X.C910260ZnM
                public final C909930Zmp LIZLLL() {
                    return this.LLIZLLLIL;
                }

                @Override // X.C910260ZnM
                public final String LJI() {
                    return this.LLILZLL;
                }

                {
                    super(str, C18VH.END, null, 12);
                    this.LLILZLL = str;
                    this.LLIZ = c1622006Ws;
                    this.LLIZLLLIL = c909930Zmp;
                }
            };
            String uuid = c869590Y9l.getUuid();
            boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
            if (visualPoetUserCardTemplate != null && (visualPoetUserComponent3 = visualPoetUserCardTemplate.userContentComponent) != null && (str5 = visualPoetUserComponent3.text) != null) {
                str6 = str5;
            }
            C0H93 c0h93 = new C0H93(uuid, zLJJJJIZL, str6);
            this.LIZ.getClass();
            List<C0YC6> attachments = c869590Y9l.getAttachments();
            if (attachments != null) {
                arrayList = new ArrayList();
                for (C0YC6 c0yc62 : attachments) {
                    if (c0yc62.index == 0) {
                        arrayList.add(c0yc62);
                    }
                }
            } else {
                arrayList = null;
            }
            if (visualPoetUserCardTemplate != null && (visualPoetUserComponent2 = visualPoetUserCardTemplate.userContentComponent) != null && (list4 = visualPoetUserComponent2.images) != null) {
                size = list4.size();
            } else {
                size = 0;
            }
            if (arrayList != null) {
                size2 = arrayList.size();
            } else {
                size2 = 0;
            }
            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, Math.max(size, size2));
            ArrayList arrayList2 = new ArrayList();
            C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
            while (it2.LLILLL) {
                int iNextInt = it2.nextInt();
                if (visualPoetUserCardTemplate != null && (visualPoetUserComponent = visualPoetUserCardTemplate.userContentComponent) != null && (list3 = visualPoetUserComponent.images) != null && (visualPoetPictureStructComponent = (VisualPoetPictureStructComponent) C13LP.LJJJLZIJ(iNextInt, list3)) != null) {
                    c18v6 = new C18V6(C18V4.LIZ(visualPoetPictureStructComponent.thumbnail), C18V4.LIZ(visualPoetPictureStructComponent.image), null);
                } else {
                    c18v6 = null;
                }
                if (arrayList != null && (c0yc6 = (C0YC6) C13LP.LJJJLZIJ(iNextInt, arrayList)) != null && (str3 = c0yc6.localPath) != null && (list2 = (c18v5 = new C18V5(Collections.singletonList(str3), new C0L9R(c0yc6.getOriginalWidth(), c0yc6.getOriginalHeight()))).LIZ) != null && (str4 = (String) C13LP.LJJJLL(list2)) != null && C570490MZb.LJ(str4)) {
                    if (c18v6 == null) {
                        c18v6 = new C18V6(null, null, c18v5);
                    } else {
                        c18v6 = new C18V6(c18v6.LIZ, c18v6.LIZIZ, c18v5);
                    }
                } else if (c18v6 != null) {
                }
                arrayList2.add(c18v6);
            }
            if (!arrayList2.isEmpty()) {
                c910260ZnM.LIZ(new C18V3(c869590Y9l.getUuid(), arrayList2, C18V3.LLIZ, C0ZDX.LJJJJIZL(c869590Y9l), null));
            }
            c910260ZnM.LIZ(c0h93);
            if (C13LQ.LJJIJ(c869590Y9l.getMsgStatus(), new int[]{0, 1, 3}) >= 0) {
                c910260ZnM.LIZ(new C18V2(c869590Y9l.getUuid(), c869590Y9l.getMsgStatus(), new C909930Zmp(c869590Y9l)));
            }
            return c910260ZnM;
        }
    };
    public final C898660ZNg LLILLJJLI = new C898660ZNg(new AwS611S0100000_32(this, 14));
    public final EnumC902890ZbT LLILLL = EnumC902890ZbT.USER_PROMPT;
    public final Class<? extends PowerCell<C910300ZnQ>> LLILZ = UserMessageCell.class;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C910300ZnQ> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC904610ZeF
    public final InterfaceC904620ZeG<EnumC902890ZbT> convert() {
        return new C904580ZeC(this);
    }

    @Override // X.InterfaceC904590ZeD
    public final InterfaceC607860Nsm<C910300ZnQ> LLLLIILLL() {
        return this.LL;
    }

    @Override // X.InterfaceC904590ZeD
    public final /* bridge */ /* synthetic */ Enum getInterceptOrdering() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC904590ZeD
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC904590ZeD, X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C910300ZnQ>> getWithCell() {
        return this.LLILZ;
    }

    public static boolean LIZ(C869590Y9l c869590Y9l) {
        VisualPoetUserComponent visualPoetUserComponent;
        if (c869590Y9l.getMsgType() != 1819) {
            return false;
        }
        VisualPoetUserCardTemplate visualPoetUserCardTemplate = (VisualPoetUserCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetUserCardTemplate.class);
        if (visualPoetUserCardTemplate != null) {
            if (!visualPoetUserCardTemplate.userContentInvisible) {
                visualPoetUserComponent = visualPoetUserCardTemplate.userContentComponent;
            }
            return true;
        }
        visualPoetUserComponent = null;
        VisualPoetUserComponent.Companion.getClass();
        if (!Intrinsics.LJFF(visualPoetUserComponent, VisualPoetUserComponent.EMPTY_VISUAL_POET_USER)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC904590ZeD
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (C869590Y9l c869590Y9l : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C869590Y9l c869590Y9l2 = c869590Y9l;
                if (!LIZ(c869590Y9l2)) {
                    arrayList.add(c869590Y9l2);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
