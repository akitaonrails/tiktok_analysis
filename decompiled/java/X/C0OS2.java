package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: renamed from: X.0OS2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OS2 implements C0OT0, InterfaceC619700OSi {
    public final BulletinCommentAbility LIZ;
    public final BulletinCommonAbility LIZIZ;
    public final C0OJU LIZJ;
    public final boolean LIZLLL;
    public final Function0<Integer> LJ;
    public BulletinStyleTextModel LJFF;
    public List<? extends InterfaceC1891350zJl> LJI;
    public final List<C0OS1> LJII = new ArrayList();
    public final List<C0OS4> LJIIIIZZ = new ArrayList();
    public final List<C0OS3> LJIIIZ = new ArrayList();
    public List<? extends AbstractC619610ORz> LJIIJ;
    public final View LJIIJJI;
    public final View LJIIL;
    public final LinearLayout LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final void LJIIZILJ() {
        C786410Ut5.LJJJJJL(this.LJIILIIL);
        for (C0OS1 c0os1 : this.LJII) {
            C0OS5.LIZ.getClass();
            c0os1.LLILLL = null;
            c0os1.LLILZ = null;
            c0os1.LLILZIL = null;
            c0os1.LLILZLL = null;
            c0os1.LLIZ = null;
            c0os1.LLIZLLLIL = null;
            c0os1.LLJ = null;
            c0os1.LLJI = null;
            c0os1.LLJIJIL = null;
            C0OS5.LIZIZ.addLast(c0os1);
        }
        for (C0OS4 c0os4 : this.LJIIIIZZ) {
            C0OS5.LIZ.getClass();
            c0os4.LLILLJJLI = -1;
            c0os4.LLILLL = null;
            c0os4.LLILZ = null;
            c0os4.LLILZIL = null;
            c0os4.LLILZLL = null;
            C0OS5.LIZJ.addLast(c0os4);
        }
        for (C0OS3 c0os3 : this.LJIIIZ) {
            C0OS5.LIZ.getClass();
            c0os3.LLILLL = null;
            c0os3.LLILZ = null;
            c0os3.LLILZIL = null;
            c0os3.LLIZ = null;
            C0OS5.LIZLLL.addLast(c0os3);
        }
        ((ArrayList) this.LJII).clear();
        ((ArrayList) this.LJIIIIZZ).clear();
        ((ArrayList) this.LJIIIZ).clear();
    }

    @Override // X.InterfaceC619700OSi
    public final void LIZIZ() {
        LJIIZILJ();
        this.LJIIJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.List<? extends X.0zJl>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0OS2] */
    @Override // X.InterfaceC619700OSi
    public final void LIZLLL(BulletinBaseItem bulletinBaseItem) {
        BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL;
        List<AbstractC619610ORz> list;
        ?? arrayList;
        ArrayList arrayList2;
        BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL2;
        List<AbstractC619610ORz> list2;
        if (C293310Beb.LIZLLL()) {
            C337180DJs.LIZ(this.LJIIJJI);
            LJIIZILJ();
            this.LJI = null;
            this.LJIIJ = null;
            return;
        }
        if (C293310Beb.LIZJ()) {
            if (bulletinBaseItem != null && (bulletinCommentUIOverviewLJIILIIL2 = bulletinBaseItem.LJIILIIL()) != null && (list2 = bulletinCommentUIOverviewLJIILIIL2.comments) != null) {
                arrayList2 = new ArrayList(list2);
            } else {
                arrayList2 = new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof C0OS0) {
                    arrayList3.add(obj);
                }
            }
            List<? extends AbstractC619610ORz> listLL = C13LP.LL(arrayList3, 2);
            if (listLL.isEmpty()) {
                C337180DJs.LIZ(this.LJIIJJI);
                LJIIZILJ();
                this.LJI = null;
                this.LJIIJ = null;
                return;
            }
            Iterator<? extends AbstractC619610ORz> it2 = listLL.iterator();
            while (it2.hasNext()) {
                ((C0OS0) it2.next()).LLJI = this.LJFF;
            }
            this.LJI = listLL;
            C337180DJs.LIZJ(this.LJIIJJI);
            List<? extends AbstractC619610ORz> list3 = this.LJIIJ;
            if (listLL == list3) {
                return;
            }
            if (LJIILJJIL(list3, listLL)) {
                LJIILLIIL(listLL);
            } else {
                LJIIZILJ();
                LJIILL(listLL);
            }
            this.LJIIJ = listLL;
            return;
        }
        if (bulletinBaseItem != null && (bulletinCommentUIOverviewLJIILIIL = bulletinBaseItem.LJIILIIL()) != null && (list = bulletinCommentUIOverviewLJIILIIL.comments) != null && !list.isEmpty()) {
            if (list == this.LJIIJ) {
                return;
            }
            BulletinCommonAbility bulletinCommonAbility = this.LIZIZ;
            if (bulletinCommonAbility != null && !bulletinCommonAbility.q11()) {
                arrayList = new ArrayList();
                for (AbstractC619610ORz abstractC619610ORz : list) {
                    if (!(abstractC619610ORz instanceof C619580ORw)) {
                        arrayList.add(abstractC619610ORz);
                    }
                }
            } else {
                arrayList = list;
            }
            if (arrayList.isEmpty()) {
                C337180DJs.LIZ(this.LJIIJJI);
                LJIIZILJ();
                this.LJI = null;
                this.LJIIJ = null;
                return;
            }
            for (AbstractC619610ORz abstractC619610ORz2 : arrayList) {
                if ((abstractC619610ORz2 instanceof AbstractC619610ORz) && abstractC619610ORz2 != null) {
                    abstractC619610ORz2.LIZIZ(this.LJFF);
                }
            }
            this.LJI = arrayList;
            C337180DJs.LIZJ(this.LJIIJJI);
            if (LJIILJJIL(this.LJIIJ, arrayList)) {
                LJIILLIIL(arrayList);
            } else {
                LJIIZILJ();
                LJIILL(arrayList);
            }
            this.LJIIJ = list;
            return;
        }
        C337180DJs.LIZ(this.LJIIJJI);
        LJIIZILJ();
        this.LJI = null;
        this.LJIIJ = null;
    }

    @Override // X.InterfaceC619700OSi
    public final void LJI(BulletinBaseItem bulletinBaseItem) {
        Long lValueOf;
        if (bulletinBaseItem instanceof C0OOP) {
            this.LJIIJJI.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0);
            C337180DJs.LIZJ(this.LJIIL);
            return;
        }
        if (bulletinBaseItem instanceof BulletinPhotoItem) {
            this.LJIIJJI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C337180DJs.LIZ(this.LJIIL);
            return;
        }
        if (bulletinBaseItem instanceof C0OOV) {
            Set setLJLIIL = C13LQ.LJLIIL(new Long[]{1L, 3L});
            BulletinCardInfo bulletinCardInfo = ((C0OOV) bulletinBaseItem).LLJJL;
            if (bulletinCardInfo != null) {
                lValueOf = Long.valueOf(bulletinCardInfo.cardType);
            } else {
                lValueOf = null;
            }
            if (C13LP.LJJJJ(lValueOf, setLJLIIL)) {
                this.LJIIJJI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                C337180DJs.LIZJ(this.LJIIL);
                return;
            } else {
                this.LJIIJJI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                C337180DJs.LIZ(this.LJIIL);
                return;
            }
        }
        if (!(bulletinBaseItem instanceof BulletinVoiceItem)) {
            return;
        }
        this.LJIIJJI.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0);
        C337180DJs.LIZJ(this.LJIIL);
    }

    public final void LJIILL(List<?> list) {
        Context context = this.LJIILIIL.getContext();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (obj instanceof C0OS0) {
                C0OS5.LIZ.getClass();
                C0OS5.LIZ(context);
                C0OS1 c0os1PollFirst = C0OS5.LIZIZ.pollFirst();
                if (c0os1PollFirst == null) {
                    c0os1PollFirst = new C0OS1(context);
                    int i3 = C2187451AjH.LIZ;
                }
                LJIIL(i, c0os1PollFirst);
                this.LJIILIIL.addView(c0os1PollFirst);
                c0os1PollFirst.LIZ((C0OS0) obj, this.LIZ, this.LIZIZ, this.LIZLLL, this.LJ.invoke().intValue());
                arrayList.add(c0os1PollFirst);
            } else if (obj instanceof C619590ORx) {
                C0OS5.LIZ.getClass();
                C0OS5.LIZ(context);
                C0OS4 c0os4PollFirst = C0OS5.LIZJ.pollFirst();
                if (c0os4PollFirst == null) {
                    c0os4PollFirst = new C0OS4(context);
                    int i4 = C2187451AjH.LIZ;
                }
                LJIIL(i, c0os4PollFirst);
                this.LJIILIIL.addView(c0os4PollFirst);
                c0os4PollFirst.LIZ((C619590ORx) obj, this.LIZ, this.LIZLLL);
                arrayList2.add(c0os4PollFirst);
            } else if (obj instanceof C619580ORw) {
                C0OS5.LIZ.getClass();
                C0OS5.LIZ(context);
                C0OS3 c0os3PollFirst = C0OS5.LIZLLL.pollFirst();
                if (c0os3PollFirst == null) {
                    c0os3PollFirst = new C0OS3(context);
                    int i5 = C2187451AjH.LIZ;
                }
                LJIIL(i, c0os3PollFirst);
                this.LJIILIIL.addView(c0os3PollFirst);
                c0os3PollFirst.LIZ((C619580ORw) obj, this.LIZ, this.LIZLLL);
                arrayList3.add(c0os3PollFirst);
            }
            i = i2;
        }
        ((ArrayList) this.LJII).clear();
        ((ArrayList) this.LJII).addAll(arrayList);
        ((ArrayList) this.LJIIIIZZ).clear();
        ((ArrayList) this.LJIIIIZZ).addAll(arrayList2);
        ((ArrayList) this.LJIIIZ).clear();
        ((ArrayList) this.LJIIIZ).addAll(arrayList3);
    }

    public final void LJIILLIIL(List<?> list) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            if (obj instanceof C0OS0) {
                C0OS1 c0os1 = (C0OS1) C13LP.LJJJLZIJ(i, this.LJII);
                if (c0os1 != null) {
                    c0os1.LIZ((C0OS0) obj, this.LIZ, this.LIZIZ, this.LIZLLL, this.LJ.invoke().intValue());
                }
                i++;
            } else if (obj instanceof C619590ORx) {
                C0OS4 c0os4 = (C0OS4) C13LP.LJJJLZIJ(i2, this.LJIIIIZZ);
                if (c0os4 != null) {
                    c0os4.LIZ((C619590ORx) obj, this.LIZ, this.LIZLLL);
                }
                i2++;
            } else if (obj instanceof C619580ORw) {
                C0OS3 c0os3 = (C0OS3) C13LP.LJJJLZIJ(i3, this.LJIIIZ);
                if (c0os3 != null) {
                    c0os3.LIZ((C619580ORw) obj, this.LIZ, this.LIZLLL);
                }
                i3++;
            }
        }
    }

    public static void LJIIL(int i, View view) {
        LinearLayout.LayoutParams layoutParams;
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        if (i > 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            iLIZIZ = 0;
        }
        layoutParams.topMargin = iLIZIZ;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final boolean LJIILJJIL(List<?> list, List<?> list2) {
        C19719912Dl c19719912DlLIZ;
        if (list == null || list.size() != list2.size()) {
            return false;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            C19719912Dl c19719912DlLIZ2 = null;
            if (obj != null) {
                c19719912DlLIZ = C13LE.LIZ(obj.getClass());
            } else {
                c19719912DlLIZ = null;
            }
            Object obj2 = ListProtector.get(list2, i);
            if (obj2 != null) {
                c19719912DlLIZ2 = C13LE.LIZ(obj2.getClass());
            }
            if (!Intrinsics.LJFF(c19719912DlLIZ, c19719912DlLIZ2)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC619700OSi
    public final void LJFF(C0OOP c0oop, C0OVA c0ova, boolean z) {
        Integer num;
        BulletinStyleTextModel bulletinStyleTextModel;
        if (c0oop == null || c0ova == null) {
            return;
        }
        if (z) {
            BulletinStyleStruct bulletinStyleStruct = c0oop.LLJILLL;
            if (bulletinStyleStruct != null && (bulletinStyleTextModel = bulletinStyleStruct.textModel) != null) {
                this.LJFF = bulletinStyleTextModel;
            }
        } else {
            this.LJFF = null;
        }
        if (this.LJIIJJI.getVisibility() == 8) {
            return;
        }
        if (z) {
            num = (Integer) this.LJIILL.getValue();
        } else {
            num = (Integer) this.LJIILJJIL.getValue();
        }
        if (num != null) {
            this.LJIIL.setBackgroundColor(num.intValue());
        }
        List<? extends InterfaceC1891350zJl> list = this.LJI;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof AbstractC619610ORz) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbstractC619610ORz) it2.next()).LIZIZ(this.LJFF);
            }
        }
        List<? extends InterfaceC1891350zJl> list2 = this.LJI;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : list2) {
                if (interfaceC1891350zJl2 instanceof AbstractC619610ORz) {
                    arrayList2.add(interfaceC1891350zJl2);
                }
            }
            if (!arrayList2.isEmpty()) {
                this.LJIIJ = null;
                LJIIZILJ();
                LJIILL(arrayList2);
                this.LJIIJ = arrayList2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    @Override // X.InterfaceC619700OSi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r14, java.util.List<? extends X.InterfaceC1891350zJl> r15, int r16) {
        /*
            r13 = this;
            r1 = 0
            if (r14 == 0) goto L28
            com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview r2 = r14.LJIILIIL()
        L7:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            if (r14 == 0) goto L25
            java.lang.String r5 = X.C619000OPq.LIZIZ(r14)
            java.lang.Long r0 = r14.LJJJ()
            if (r0 == 0) goto L26
            java.lang.String r6 = r0.toString()
        L1b:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel r7 = r13.LJFF
            r3 = r15
            com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview r11 = X.C619000OPq.LJIIJ(r2, r3, r4, r5, r6, r7)
            if (r11 != 0) goto L2a
            return
        L25:
            r5 = r1
        L26:
            r6 = r1
            goto L1b
        L28:
            r2 = r1
            goto L7
        L2a:
            if (r14 == 0) goto L30
            com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview r1 = r14.LJIILIIL()
        L30:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r11)
            if (r0 != 0) goto L55
            boolean r0 = r14 instanceof X.C0OOP
            if (r0 == 0) goto L56
            r2 = r14
            X.0OOP r2 = (X.C0OOP) r2
            r3 = 0
            r9 = 0
            r12 = 201326591(0xbffffff, float:9.860761E-32)
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r10 = r9
            X.0OOP r2 = X.C0OOP.LLIIIL(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L4c:
            X.0OJU r1 = r13.LIZJ
            if (r1 == 0) goto L55
            X.0OKA r0 = X.C0OKA.UPDATE
            r1.jZ1(r14, r2, r0)
        L55:
            return
        L56:
            boolean r0 = r14 instanceof com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem
            if (r0 == 0) goto L6d
            r2 = r14
            com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem r2 = (com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem) r2
            r3 = 0
            r9 = 0
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r10 = r9
            com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem r2 = com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem.LLIIIL(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L4c
        L6d:
            boolean r0 = r14 instanceof X.C0OOV
            if (r0 == 0) goto L55
            r0 = r14
            X.0OOV r0 = (X.C0OOV) r0
            r1 = 0
            r7 = 0
            r12 = 50331647(0x2ffffff, float:3.7615817E-37)
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r1
            r9 = r7
            r10 = r7
            X.0OOV r2 = X.C0OOV.LLIIIL(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OS2.LJIIJ(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, java.util.List, int):void");
    }

    public C0OS2(ViewStub viewStub, BulletinCommentAbility bulletinCommentAbility, BulletinCommonAbility bulletinCommonAbility, BulletinListViewModel bulletinListViewModel, boolean z, Function0 function0) {
        ViewGroup viewGroup;
        int iIntValue;
        View viewLJLLLL;
        this.LIZ = bulletinCommentAbility;
        this.LIZIZ = bulletinCommonAbility;
        this.LIZJ = bulletinListViewModel;
        this.LIZLLL = z;
        this.LJ = function0;
        ViewParent parent = viewStub.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            viewStub.setLayoutResource(R.layout.a6k);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            int iIndexOfChild = viewGroup.indexOfChild(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            C786410Ut5.LJJLJLI(viewStub, viewGroup);
            Context context = viewStub.getContext();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setId(R.id.d09);
            C786410Ut5.d6(linearLayout, layoutParams);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            linearLayout.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
            View view = new View(context);
            view.setId(R.id.czo);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C786410Ut5.W5(view, layoutParams2);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            view.setBackgroundColor(iIntValue);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setId(R.id.czv);
            C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.setOrientation(1);
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            linearLayout.addView(view);
            linearLayout.addView(linearLayout2);
            viewGroup.addView(linearLayout, iIndexOfChild);
            viewLJLLLL = linearLayout;
        }
        C786410Ut5.I7(new AbS691S0100000_9(this, 47), viewLJLLLL);
        this.LJIIJJI = viewLJLLLL;
        this.LJIIL = viewLJLLLL.findViewById(R.id.czo);
        this.LJIILIIL = (LinearLayout) viewLJLLLL.findViewById(R.id.czv);
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1731));
        this.LJIILL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1732));
    }
}
