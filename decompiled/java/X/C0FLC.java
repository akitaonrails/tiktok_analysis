package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FLC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FLC extends C2217421BqW implements Function1<User, Unit> {
    public C0FLC(Object obj) {
        super(1, obj, C0FLB.class, "selectUser", "selectUser(Lcom/ss/android/ugc/aweme/profile/model/User;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(User user) throws Throwable {
        User user2 = user;
        C0FLB c0flb = (C0FLB) this.receiver;
        C21410318qb c21410318qbLJIILIIL = c0flb.LJIILIIL();
        if (c21410318qbLJIILIIL != null) {
            c0flb.LJIIJ = true;
            C0FMX.LIZ(c21410318qbLJIILIIL.getSelectionStart(), C2204961BRm.LLJILLL(c21410318qbLJIILIIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNGBXO+rPzzfHDhAfLGdpl2zRAVYG4J8Sq+E9FP10LUN5/HU=", null)));
            C0FMX.LIZIZ(user2, c21410318qbLJIILIIL, false);
            c0flb.LJIIJ = false;
        }
        c0flb.LJIJI(false);
        return Unit.LIZ;
    }
}
