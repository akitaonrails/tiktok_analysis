package X;

import com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo;
import com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1BFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$updateLocalCache$1", f = "IMContactManager.kt", l = {}, m = "invokeSuspend")
public final class C2201791BFh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<IMUserProfileInfo> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201791BFh(List<IMUserProfileInfo> list, boolean z, InterfaceC1364105Vn<? super C2201791BFh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2201791BFh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.updateLocalCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<IMUserProfileInfo> list = this.LL;
        boolean z = this.LLILLJJLI;
        for (IMUserProfileInfo iMUserProfileInfo : list) {
            if (z) {
                C1BG1.LIZ.getClass();
                ((InterfaceC1710106mp) C1BG1.LJIIIIZZ.getValue()).LJFF(C2201841BFm.LIZ(iMUserProfileInfo));
            }
            SharePermission sharePermission = iMUserProfileInfo.sharePermission;
            if (sharePermission != null) {
                C1BG1.LIZ.getClass();
                IShareStatusKeva iShareStatusKeva = (IShareStatusKeva) C1BG1.LJIIJ.getValue();
                if (iShareStatusKeva != null) {
                    iShareStatusKeva.LIZ(sharePermission.getUserShareStatus(), String.valueOf(sharePermission.getUserId()));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMContactManager@fb8a.updateLocalCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
