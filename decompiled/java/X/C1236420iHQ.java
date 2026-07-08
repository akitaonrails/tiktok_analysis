package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.profile.business.ur.school.datasource.CampusGroup;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iHQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236420iHQ implements Observer<C1231320i9C> {
    public final C1236430iHR LL;
    public C1236440iHS LLILLJJLI;
    public CampusGroup LLILLL;
    public C19EG LLILZ;
    public C19EG LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2845));

    public C1236420iHQ(C1236430iHR c1236430iHR) {
        this.LL = c1236430iHR;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.Integer r3) {
        /*
            r2 = this;
            X.0i70 r0 = X.EnumC1229960i70.CAN_JOIN
            int r1 = r0.getValue()
            if (r3 == 0) goto Le
            int r0 = r3.intValue()
            if (r0 == r1) goto L2a
        Le:
            X.0i70 r0 = X.EnumC1229960i70.FULL
            int r1 = r0.getValue()
            if (r3 == 0) goto L1c
            int r0 = r3.intValue()
            if (r0 == r1) goto L2a
        L1c:
            X.0i70 r0 = X.EnumC1229960i70.NOT_QUALIFIED
            int r1 = r0.getValue()
            if (r3 == 0) goto L4a
            int r0 = r3.intValue()
            if (r0 != r1) goto L4a
        L2a:
            r1 = 0
        L2b:
            X.0iHR r0 = r2.LL
            r0.setButtonVariant(r1)
            X.0i70 r0 = X.EnumC1229960i70.REQUEST_PENDING_APPROVAL
            int r1 = r0.getValue()
            if (r3 == 0) goto L4c
            int r0 = r3.intValue()
            if (r0 != r1) goto L4c
            X.0iHR r1 = r2.LL
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r1)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r1.setAlpha(r0)
            return
        L4a:
            r1 = 1
            goto L2b
        L4c:
            X.0iHR r1 = r2.LL
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1236420iHQ.LIZ(java.lang.Integer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.Integer r4) {
        /*
            r3 = this;
            X.0iHR r2 = r3.LL
            X.0i70 r0 = X.EnumC1229960i70.IN_GROUP
            int r1 = r0.getValue()
            if (r4 == 0) goto L21
            int r0 = r4.intValue()
            if (r0 != r1) goto L21
            X.0iHR r0 = r3.LL
            android.content.Context r1 = r0.getContext()
            r0 = 2131828297(0x7f111e49, float:1.928953E38)
            java.lang.String r0 = r1.getString(r0)
        L1d:
            r2.setText(r0)
            return
        L21:
            X.0i70 r0 = X.EnumC1229960i70.REQUEST_PENDING_APPROVAL
            int r1 = r0.getValue()
            if (r4 == 0) goto L3d
            int r0 = r4.intValue()
            if (r0 != r1) goto L3d
            X.0iHR r0 = r3.LL
            android.content.Context r1 = r0.getContext()
            r0 = 2131828296(0x7f111e48, float:1.9289529E38)
            java.lang.String r0 = r1.getString(r0)
            goto L1d
        L3d:
            X.0i70 r0 = X.EnumC1229960i70.CAN_JOIN
            int r1 = r0.getValue()
            if (r4 == 0) goto L4b
            int r0 = r4.intValue()
            if (r0 == r1) goto L67
        L4b:
            X.0i70 r0 = X.EnumC1229960i70.FULL
            int r1 = r0.getValue()
            if (r4 == 0) goto L59
            int r0 = r4.intValue()
            if (r0 == r1) goto L67
        L59:
            X.0i70 r0 = X.EnumC1229960i70.NOT_QUALIFIED
            int r1 = r0.getValue()
            if (r4 == 0) goto L75
            int r0 = r4.intValue()
            if (r0 != r1) goto L75
        L67:
            X.0iHR r0 = r3.LL
            android.content.Context r1 = r0.getContext()
            r0 = 2131828295(0x7f111e47, float:1.9289527E38)
            java.lang.String r0 = r1.getString(r0)
            goto L1d
        L75:
            java.lang.String r0 = ""
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1236420iHQ.LIZIZ(java.lang.Integer):void");
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C1231320i9C c1231320i9C) {
        String str;
        C1231320i9C c1231320i9C2 = c1231320i9C;
        CampusGroup campusGroup = this.LLILLL;
        if (campusGroup != null) {
            str = campusGroup.conversationId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, c1231320i9C2.LIZIZ)) {
            CampusGroup campusGroup2 = this.LLILLL;
            if (campusGroup2 != null) {
                campusGroup2.setVerifyStatus(Integer.valueOf(c1231320i9C2.LIZ));
            }
            LIZIZ(Integer.valueOf(c1231320i9C2.LIZ));
            LIZ(Integer.valueOf(c1231320i9C2.LIZ));
        }
    }
}
