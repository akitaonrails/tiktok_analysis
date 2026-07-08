package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Z1P, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.CreateGroupChatActionKt$updateEnable$1$1", f = "CreateGroupChatAction.kt", l = {}, m = "invokeSuspend")
public final class C0Z1P extends C09AX implements InterfaceC1631620sYq<IMUser, C0Y8T, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ IMUser LL;
    public /* synthetic */ C0Y8T LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z1P(boolean z, InterfaceC1364105Vn<? super C0Z1P> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLIZ;
        boolean zLJ;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMUser iMUser = this.LL;
        C0Y8T c0y8t = this.LLILLJJLI;
        boolean z = false;
        if (iMUser != null) {
            zLIZ = C1228930i5L.LIZ(iMUser);
        } else {
            zLIZ = false;
        }
        if (c0y8t != null) {
            zLJ = C879070Ye9.LJ(c0y8t, false);
        } else {
            zLJ = false;
        }
        if (!this.LLILLL ? zLIZ : !(!zLIZ || zLJ)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(IMUser iMUser, C0Y8T c0y8t, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C0Z1P c0z1p = new C0Z1P(this.LLILLL, interfaceC1364105Vn);
        c0z1p.LL = iMUser;
        c0z1p.LLILLJJLI = c0y8t;
        return c0z1p.invokeSuspend(Unit.LIZ);
    }
}
