package Y;

import X.C0S1B;
import X.C1609550rzF;
import X.InterfaceC438160HGc;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarSocialFragment;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public class AObserverS23S0310000_24 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS23S0310000_24 aObserverS23S0310000_24, Object obj) {
        List<String> list = (List) obj;
        if (((User) aObserverS23S0310000_24.l0).getUid() != null) {
            if (aObserverS23S0310000_24.z3) {
                C0S1B.LIZ(((C1609550rzF) aObserverS23S0310000_24.l1).LLILLJJLI, ((User) aObserverS23S0310000_24.l0).getUid(), (User) aObserverS23S0310000_24.l0, ((StoryThoughtAvatarSocialFragment) aObserverS23S0310000_24.l2).getViewLifecycleOwner(), false, null, 56);
                return;
            }
            InterfaceC438160HGc socialAvatarAbility = ((C1609550rzF) aObserverS23S0310000_24.l1).LLILLJJLI.getSocialAvatarAbility();
            if (socialAvatarAbility == null) {
                return;
            }
            socialAvatarAbility.LIZLLL(list, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$1(Y.AObserverS23S0310000_24 r5, java.lang.Object r6) {
        /*
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r0 = r5.l0
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.Object r1 = r6.get(r0)
            X.0r8A r1 = (X.C1576640r8A) r1
            boolean r0 = r5.z3
            r3 = 0
            if (r0 == 0) goto L5f
            if (r1 == 0) goto L2e
            java.lang.String r4 = r1.LJI
        L15:
            boolean r0 = r1.LJIIIIZZ
            if (r0 != 0) goto L2e
            java.lang.Object r2 = r5.l1
            X.0hjA r2 = (X.C1215180hjA) r2
            if (r2 == 0) goto L2e
            boolean r1 = r5.z3
            java.lang.Object r0 = r5.l2
            com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel r0 = (com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel) r0
            com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel r0 = r0.LLILLL
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.subtitle
        L2b:
            r2.LIZ(r4, r0, r1)
        L2e:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.Object r0 = r5.l2
            com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel r0 = (com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel) r0
            com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel r0 = r0.LLILLL
            if (r0 == 0) goto L5b
            java.lang.String r1 = r0.iapID
        L3d:
            java.lang.String r0 = "iap_id"
            r2.LJIIIIZZ(r0, r1)
            java.lang.Object r0 = r5.l2
            com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel r0 = (com.ss.android.ugc.aweme.paid.content.consumption.PaidContentCustomAnchorViewModel) r0
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r0.LLILLJJLI
            if (r0 == 0) goto L4e
            java.lang.String r3 = r0.getId()
        L4e:
            java.lang.String r0 = "anchor_id"
            r2.LJIIIIZZ(r0, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "paid_content_anchor_prefetch_price"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L5b:
            r1 = r3
            goto L3d
        L5d:
            r0 = r3
            goto L2b
        L5f:
            if (r1 == 0) goto L6e
            java.lang.String r0 = r1.LIZLLL
        L63:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L70
            if (r1 == 0) goto L2e
            java.lang.String r4 = r1.LIZLLL
            goto L15
        L6e:
            r0 = r3
            goto L63
        L70:
            if (r1 == 0) goto L2e
            java.lang.String r4 = r1.LIZIZ
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS23S0310000_24.onChanged$1(Y.AObserverS23S0310000_24, java.lang.Object):void");
    }

    public AObserverS23S0310000_24(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
