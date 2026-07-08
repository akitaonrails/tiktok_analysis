package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.im.common.model.InviteError;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.invitelink.GroupInviteLinkDataSource$fetchGroupInviteLink$4", f = "GroupInviteLinkDataSource.kt", l = {67}, m = "invokeSuspend")
public final class C900670ZUz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<GroupInviteInfoModel, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<InviteError, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C900670ZUz(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
        this.LLILZ = str2;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C900670ZUz(this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn, this.LLILLL, this.LLILZIL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        byte[] byteArray;
        C1C7U.LIZ("GroupInviteLinkDataSource@e36e.fetchGroupInviteLink$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = C1477105qL.LIZIZ(str, 2, this, 4);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupInviteLinkDataSource@e36e.fetchGroupInviteLink$4");
                return objLJFF;
            }
        }
        GroupInviteInfoModel groupInviteInfoModel = (GroupInviteInfoModel) obj;
        if (groupInviteInfoModel.getInviteError() == null) {
            this.LLILLL.invoke(groupInviteInfoModel);
            Keva keva = (Keva) C0ZV1.LIZIZ.getValue();
            String str2 = this.LLILZ;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ObjectOutputStream(byteArrayOutputStream).writeObject(groupInviteInfoModel);
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                byteArray = new byte[0];
            }
            keva.storeBytes(str2, byteArray);
        } else {
            this.LLILZIL.invoke(groupInviteInfoModel.getInviteError());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupInviteLinkDataSource@e36e.fetchGroupInviteLink$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
