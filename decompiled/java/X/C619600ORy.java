package X;

import Y.ARunnableS78S0200000_9;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.bpea.transmit.hook.HandlerHook;
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
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: renamed from: X.0ORy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619600ORy implements C0OT0, InterfaceC619700OSi {
    public final BulletinCommentAbility LIZ;
    public final C0OJU LIZIZ;
    public final BulletinCommonAbility LIZJ;
    public final InterfaceC665370Q7z LIZLLL;
    public BulletinStyleTextModel LJ;
    public List<? extends InterfaceC1891350zJl> LJFF;
    public final View LJI;
    public final C01GW LJII;

    @Override // X.InterfaceC619700OSi
    public final void LIZIZ() {
    }

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    @Override // X.InterfaceC619700OSi
    public final void LIZLLL(BulletinBaseItem bulletinBaseItem) {
        ArrayList arrayList;
        BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL;
        List<AbstractC619610ORz> list;
        if (C293310Beb.LIZLLL()) {
            C337180DJs.LIZ(this.LJI);
            this.LJFF = null;
            return;
        }
        if (bulletinBaseItem != null && (bulletinCommentUIOverviewLJIILIIL = bulletinBaseItem.LJIILIIL()) != null && (list = bulletinCommentUIOverviewLJIILIIL.comments) != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        if (C293310Beb.LIZJ()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof C0OS0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C13LP.LL(arrayList2, 2));
            if (arrayList3.isEmpty()) {
                C337180DJs.LIZ(this.LJI);
                this.LJFF = null;
                return;
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((C0OS0) it2.next()).LLJI = this.LJ;
            }
            this.LJFF = arrayList3;
            C337180DJs.LIZJ(this.LJI);
            HandlerHook.viewPostDelay(this.LJI, new ARunnableS78S0200000_9(this, arrayList3, 58), 50L);
            return;
        }
        BulletinCommonAbility bulletinCommonAbility = this.LIZJ;
        if (bulletinCommonAbility != null && !bulletinCommonAbility.q11()) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!(obj2 instanceof C619580ORw)) {
                    arrayList4.add(obj2);
                }
            }
            arrayList = new ArrayList(arrayList4);
        }
        if (arrayList.isEmpty()) {
            C337180DJs.LIZ(this.LJI);
            this.LJFF = null;
            return;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((AbstractC619610ORz) it3.next()).LIZIZ(this.LJ);
        }
        this.LJFF = arrayList;
        C337180DJs.LIZJ(this.LJI);
        HandlerHook.viewPostDelay(this.LJI, new ARunnableS78S0200000_9(this, arrayList, 59), 50L);
    }

    @Override // X.InterfaceC619700OSi
    public final void LJI(BulletinBaseItem bulletinBaseItem) {
        Long lValueOf;
        if (bulletinBaseItem instanceof C0OOP) {
            this.LJI.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0);
            C337180DJs.LIZJ(this.LJI.findViewById(R.id.czo));
            return;
        }
        if (bulletinBaseItem instanceof BulletinPhotoItem) {
            this.LJI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C337180DJs.LIZ(this.LJI.findViewById(R.id.czo));
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
                this.LJI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                C337180DJs.LIZJ(this.LJI.findViewById(R.id.czo));
                return;
            } else {
                this.LJI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                C337180DJs.LIZ(this.LJI.findViewById(R.id.czo));
                return;
            }
        }
        if (!(bulletinBaseItem instanceof BulletinVoiceItem)) {
            return;
        }
        this.LJI.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0);
        C337180DJs.LIZJ(this.LJI.findViewById(R.id.czo));
    }

    @Override // X.InterfaceC619700OSi
    public final void LJFF(C0OOP c0oop, C0OVA c0ova, boolean z) {
        BulletinStyleTextModel bulletinStyleTextModel;
        if (c0oop == null || c0ova == null) {
            return;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, C1385040m98.LIZ(this.LJI.getContext(), z));
        if (z) {
            BulletinStyleStruct bulletinStyleStruct = c0oop.LLJILLL;
            if (bulletinStyleStruct != null && (bulletinStyleTextModel = bulletinStyleStruct.textModel) != null) {
                this.LJ = bulletinStyleTextModel;
            }
        } else {
            this.LJ = null;
        }
        if (numLIZJ != null) {
            this.LJI.findViewById(R.id.czo).setBackgroundColor(numLIZJ.intValue());
        }
        List<? extends InterfaceC1891350zJl> list = this.LJFF;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof AbstractC619610ORz) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbstractC619610ORz) it2.next()).LIZIZ(this.LJ);
            }
        }
        List<? extends InterfaceC1891350zJl> list2 = this.LJFF;
        if (list2 != null) {
            ((ViewOnAttachStateChangeListenerC20604515jv) this.LJII.getValue()).getState().LJIILL(list2, null);
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
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel r7 = r13.LJ
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
            X.0OJU r1 = r13.LIZIZ
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
        throw new UnsupportedOperationException("Method not decompiled: X.C619600ORy.LJIIJ(com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, java.util.List, int):void");
    }

    public C619600ORy(ViewStub viewStub, BulletinCommentAbility bulletinCommentAbility, BulletinListViewModel bulletinListViewModel, BulletinCommonAbility bulletinCommonAbility, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = bulletinCommentAbility;
        this.LIZIZ = bulletinListViewModel;
        this.LIZJ = bulletinCommonAbility;
        this.LIZLLL = interfaceC665370Q7z;
        viewStub.setLayoutResource(R.layout.a6k);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        C786410Ut5.I7(new AbS691S0100000_9(this, 46), viewLJLLLL);
        this.LJI = viewLJLLLL;
        this.LJII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1729));
    }
}
