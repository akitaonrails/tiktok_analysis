package X;

import Y.ACListenerS111S0200000_7;
import Y.ACListenerS142S0100000_7;
import Y.AfS143S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.SubAdminPermission;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510430K0b extends C0K1I<C510470K0f> {
    public final LinearLayout LLILLJJLI;
    public final TextView LLILLL;
    public final ImageView LLILZ;
    public final ImageView LLILZIL;
    public final ViewGroup LLILZLL;
    public final TextView LLIZ;
    public boolean LLIZLLLIL;

    public C510430K0b(View view) {
        super(view);
        this.LLILLJJLI = (LinearLayout) view.findViewById(R.id.q8y);
        this.LLILLL = (TextView) view.findViewById(R.id.zgp);
        this.LLILZ = (ImageView) view.findViewById(R.id.zgq);
        this.LLILZIL = (ImageView) view.findViewById(R.id.cto);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.uj7);
        this.LLIZ = (TextView) view.findViewById(R.id.ujc);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        Boolean boolValueOf;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        SubscriptionSceneContext subscriptionSceneContext;
        final C510470K0f c510470K0f = (C510470K0f) interfaceC339570DSx;
        P5(c510470K0f);
        final PGCGetSubPrivilegeDetailResponse.Data data = c510470K0f.LIZLLL;
        final SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = c510470K0f.LJ;
        if (subscriptionPrivilegeDetailFragment2 != null) {
            ImageView imageView = this.LLILZIL;
            if (imageView != null) {
                C786410Ut5.Q7(imageView, new ACListenerS142S0100000_7(subscriptionPrivilegeDetailFragment2, 330));
            }
            SubAdminPermission subAdminPermission = data.adminPermission;
            if (subAdminPermission != null) {
                boolValueOf = Boolean.valueOf(subAdminPermission.allowPinPerk);
            } else {
                boolValueOf = null;
            }
            if (C0K51.LJI(boolValueOf) && (subscriptionPrivilegeDetailFragment = c510470K0f.LJ) != null && (subscriptionSceneContext = subscriptionPrivilegeDetailFragment.LLJJI) != null && subscriptionSceneContext.isInLiveRoom && !Intrinsics.LJFF(c510470K0f.LJIIIIZZ, "others_homepage")) {
                ImageView imageView2 = this.LLILZ;
                if (imageView2 != null) {
                    C786410Ut5.LJLLLLLL(0, imageView2);
                }
                TextView textView = this.LLILLL;
                if (textView != null) {
                    C786410Ut5.LJLLLLLL(0, textView);
                }
                TextView textView2 = this.LLILLL;
                if (textView2 != null) {
                    C786410Ut5.T7(textView2, new ACListenerS111S0200000_7(subscriptionPrivilegeDetailFragment2, this, 82));
                }
            }
            C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0K0U
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:101:0x0218 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01e1  */
                @Override // X.InterfaceC1478005qU
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void subscribe(X.C09AJ<java.util.List<X.C510550K0n>> r23) {
                    /*
                        Method dump skipped, instruction units count: 551
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0K0U.subscribe(X.09AJ):void");
                }
            }).LJIILIIL(new C0UJ2()).LJJLL(new AfS143S0200000_7((Object) this, (EmoteModel) subscriptionPrivilegeDetailFragment2, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 47), new C09JN() { // from class: X.00PJ
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("CustomizedPerksItemViewHolder@12a2.onBindViewHolder$5");
                    C1C7U.LIZIZ("CustomizedPerksItemViewHolder@12a2.onBindViewHolder$5");
                }
            });
        }
    }

    @Override // X.C0K1I
    public final Map N5(C510480K0g c510480K0g) {
        SubPackagePrivilege subPackagePrivilegeUS;
        List<SubCustomizedBenefit> list;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c510480K0g.LJ;
        boolean z = false;
        if (subscriptionPrivilegeDetailFragment != null && (subPackagePrivilegeUS = subscriptionPrivilegeDetailFragment.uS()) != null && (list = subPackagePrivilegeUS.customizedBenefits) != null) {
            ArrayList arrayList = new ArrayList();
            for (SubCustomizedBenefit subCustomizedBenefit : list) {
                if (subCustomizedBenefit.benefitType != 2) {
                    arrayList.add(subCustomizedBenefit);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((SubCustomizedBenefit) it2.next()).perkTags.isEmpty()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return C2097908Jt.LIZJ(new Pair("is_perks_rare", String.valueOf(C0K51.LJIILIIL(Boolean.valueOf(z)))));
    }
}
