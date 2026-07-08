package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeDialog;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.15fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20578915fn extends AbstractC21673619ry<C20578815fm> {
    public final InterfaceC20579515ft LL;
    public final List<EditProfileBadgeModel> LLILLJJLI;
    public final User LLILLL;
    public Integer LLILZ;
    public final String LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<EditProfileBadgeModel> list = this.LLILLJJLI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r2, r0) != false) goto L21;
     */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r4, int r5) {
        /*
            r3 = this;
            X.15fm r4 = (X.C20578815fm) r4
            java.util.List<com.ss.android.ugc.aweme.badge.EditProfileBadgeModel> r0 = r3.LLILLJJLI     // Catch: java.lang.ClassCastException -> L67
            if (r0 == 0) goto L13
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r5, r0)     // Catch: java.lang.ClassCastException -> L67
            com.ss.android.ugc.aweme.badge.EditProfileBadgeModel r1 = (com.ss.android.ugc.aweme.badge.EditProfileBadgeModel) r1     // Catch: java.lang.ClassCastException -> L67
            if (r1 == 0) goto L13
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.LLILLL     // Catch: java.lang.ClassCastException -> L67
            r4.I5(r1, r0)     // Catch: java.lang.ClassCastException -> L67
        L13:
            android.view.View r2 = r4.itemView     // Catch: java.lang.ClassCastException -> L67
            Y.ACListenerS62S0101000_31 r1 = new Y.ACListenerS62S0101000_31     // Catch: java.lang.ClassCastException -> L67
            r0 = 0
            r1.<init>(r3, r5, r0)     // Catch: java.lang.ClassCastException -> L67
            X.C786410Ut5.I7(r1, r2)     // Catch: java.lang.ClassCastException -> L67
            java.lang.Integer r0 = r3.LLILZ     // Catch: java.lang.ClassCastException -> L67
            r1 = 0
            if (r0 == 0) goto L29
            int r0 = r0.intValue()     // Catch: java.lang.ClassCastException -> L67
            if (r0 == r5) goto L45
        L29:
            java.lang.Integer r0 = r3.LLILZ     // Catch: java.lang.ClassCastException -> L67
            if (r0 != 0) goto L60
            java.lang.String r2 = r3.LLILZIL     // Catch: java.lang.ClassCastException -> L67
            java.util.List<com.ss.android.ugc.aweme.badge.EditProfileBadgeModel> r0 = r3.LLILLJJLI     // Catch: java.lang.ClassCastException -> L67
            if (r0 == 0) goto L5d
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)     // Catch: java.lang.ClassCastException -> L67
            com.ss.android.ugc.aweme.badge.EditProfileBadgeModel r0 = (com.ss.android.ugc.aweme.badge.EditProfileBadgeModel) r0     // Catch: java.lang.ClassCastException -> L67
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.getUrl()     // Catch: java.lang.ClassCastException -> L67
        L3f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)     // Catch: java.lang.ClassCastException -> L67
            if (r0 == 0) goto L60
        L45:
            android.view.View r2 = r4.itemView     // Catch: java.lang.ClassCastException -> L67
            r0 = 2130973456(0x7f041310, float:1.7555707E38)
            r2.setBackgroundResource(r0)     // Catch: java.lang.ClassCastException -> L67
            X.15ft r2 = r3.LL     // Catch: java.lang.ClassCastException -> L67
            java.util.List<com.ss.android.ugc.aweme.badge.EditProfileBadgeModel> r0 = r3.LLILLJJLI     // Catch: java.lang.ClassCastException -> L67
            if (r0 == 0) goto L59
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r5, r0)     // Catch: java.lang.ClassCastException -> L67
            com.ss.android.ugc.aweme.badge.EditProfileBadgeModel r1 = (com.ss.android.ugc.aweme.badge.EditProfileBadgeModel) r1     // Catch: java.lang.ClassCastException -> L67
        L59:
            r2.ah(r1)     // Catch: java.lang.ClassCastException -> L67
            goto L5f
        L5d:
            r0 = r1
            goto L3f
        L5f:
            return
        L60:
            android.view.View r1 = r4.itemView     // Catch: java.lang.ClassCastException -> L67
            r0 = 0
            r1.setBackgroundResource(r0)     // Catch: java.lang.ClassCastException -> L67
            return
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20578915fn.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20578815fm c20578815fm = new C20578815fm(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f7u, viewGroup, false));
        try {
            View view = c20578815fm.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c20578815fm.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c20578815fm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C20578815fm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c20578815fm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c20578815fm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C20578815fm.class.getName();
        return c20578815fm;
    }

    public C20578915fn(EditProfileBadgeDialog editProfileBadgeDialog, List list, User user) {
        ProfileBadgeStruct profileBadge;
        Boolean boolValueOf;
        this.LL = editProfileBadgeDialog;
        this.LLILLJJLI = list;
        this.LLILLL = user;
        ProfileBadgeStruct profileBadge2 = user.getProfileBadge();
        if (profileBadge2 != null && profileBadge2.getUrl() != null && (profileBadge = user.getProfileBadge()) != null && Boolean.valueOf(profileBadge.getShouldShow()) != null) {
            ProfileBadgeStruct profileBadge3 = user.getProfileBadge();
            if (profileBadge3 != null) {
                boolValueOf = Boolean.valueOf(profileBadge3.getShouldShow());
            } else {
                boolValueOf = null;
            }
            if (boolValueOf.booleanValue()) {
                ProfileBadgeStruct profileBadge4 = user.getProfileBadge();
                this.LLILZIL = profileBadge4 != null ? profileBadge4.getUrl() : null;
                return;
            }
        }
        this.LLILZ = 0;
        this.LLILZIL = null;
    }
}
