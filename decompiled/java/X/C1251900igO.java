package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2;
import com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell;
import com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0igO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251900igO extends RecyclerView.ViewHolder implements InterfaceC1259240isE {
    public final View LL;
    public List<UserProfileGuideDataV2> LLILLJJLI;
    public final List<GuideCardBaseProtocol> LLILLL;
    public final C01GW LLILZ;

    public final void I5() {
        GuideCardBaseProtocol guideCardBaseProtocol;
        GuideCardBaseProtocol next;
        List<UserProfileGuideDataV2> list = this.LLILLJJLI;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (UserProfileGuideDataV2 userProfileGuideDataV2 : list) {
                List<GuideCardBaseProtocol> list2 = this.LLILLL;
                if (list2 != null) {
                    Iterator<GuideCardBaseProtocol> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.getName(), userProfileGuideDataV2.getName())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    guideCardBaseProtocol = next;
                } else {
                    guideCardBaseProtocol = null;
                }
                arrayList.add(new C1251870igL(userProfileGuideDataV2, guideCardBaseProtocol));
            }
            ((ViewOnAttachStateChangeListenerC20604515jv) this.LLILZ.getValue()).getState().LJIILL(arrayList, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    @Override // X.InterfaceC1259240isE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U4(com.ss.android.ugc.aweme.profile.model.User r8) {
        /*
            r7 = this;
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r5 = 1
            if (r8 == 0) goto L7a
            java.util.List r0 = r8.getUserProfileGuideV2()
            if (r0 == 0) goto L4e
            java.util.Iterator r6 = r0.iterator()
        L12:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r6.next()
            com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2 r0 = (com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2) r0
            java.lang.String r3 = r0.getName()
            java.lang.String r1 = "add_bio"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r8.signature
            boolean r0 = X.C736460Sui.LIZIZ(r0)
            if (r0 == 0) goto L12
            r4.add(r1)
            goto L12
        L36:
            java.lang.String r2 = "add_avatar"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r2)
            if (r0 == 0) goto L12
            java.util.List<java.lang.String> r1 = r8.boldFields
            if (r1 == 0) goto L12
            java.lang.String r0 = "photo"
            boolean r0 = r1.contains(r0)
            if (r0 != r5) goto L12
            r4.add(r2)
            goto L12
        L4e:
            java.util.List r0 = r8.getUserProfileGuideV2()
            if (r0 == 0) goto L7a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2 r0 = (com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2) r0
            java.lang.String r0 = r0.getName()
            boolean r0 = X.C13LP.LJJJJ(r0, r4)
            r0 = r0 ^ 1
            if (r0 == 0) goto L5d
            r3.add(r1)
            goto L5d
        L7a:
            r3 = 0
        L7b:
            r7.LLILLJJLI = r3
            r7.I5()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251900igO.U4(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public C1251900igO(View view, List list, List list2, InterfaceC1259540isi interfaceC1259540isi) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3356));
        this.LLILZ = c01gwLIZIZ;
        interfaceC1259540isi.Zx(this);
        ((ViewOnAttachStateChangeListenerC20604515jv) c01gwLIZIZ.getValue()).LJIILJJIL(GuideCardCell.class);
        ((RecyclerView) c01gwLIZIZ.getValue()).setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        ((RecyclerView) c01gwLIZIZ.getValue()).addItemDecoration(new C1077180e8a(1));
        ((RecyclerView) c01gwLIZIZ.getValue()).addOnScrollListener(new AbstractC1585810rMx() { // from class: X.08tE
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    C20684815ws.LJIILLIIL("profile_empty_guide_slide", new C0LAB().LIZ);
                }
            }
        });
    }
}
