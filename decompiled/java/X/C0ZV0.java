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

/* JADX INFO: renamed from: X.0ZV0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.invitelink.GroupInviteLinkDataSource$resetInviteLink$2", f = "GroupInviteLinkDataSource.kt", l = {103}, m = "invokeSuspend")
public final class C0ZV0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<GroupInviteInfoModel, Unit> LLILZ;
    public final /* synthetic */ Function1<InviteError, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0ZV0(String str, Function1<? super GroupInviteInfoModel, Unit> function1, Function1<? super InviteError, Unit> function12, InterfaceC1364105Vn<? super C0ZV0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZV0(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZJ;
        byte[] byteArray;
        C1C7U.LIZ("GroupInviteLinkDataSource@e36e.resetInviteLink$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                strLIZJ = (String) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            strLIZJ = C0ZV1.LIZJ(this.LLILLL);
            String str = this.LLILLL;
            this.LL = strLIZJ;
            this.LLILLJJLI = 1;
            obj = C1477105qL.LIZJ().getGroupInviteInfo(str, 2, true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupInviteLinkDataSource@e36e.resetInviteLink$2");
                return objLJFF;
            }
        }
        GroupInviteInfoModel groupInviteInfoModel = (GroupInviteInfoModel) obj;
        if (groupInviteInfoModel.getInviteError() == null) {
            Keva keva = (Keva) C0ZV1.LIZIZ.getValue();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ObjectOutputStream(byteArrayOutputStream).writeObject(groupInviteInfoModel);
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                byteArray = new byte[0];
            }
            keva.storeBytes(strLIZJ, byteArray);
            C0ZV2 c0zv2 = C0ZV1.LIZ.get(this.LLILLL);
            if (c0zv2 != null) {
                c0zv2.LIZ();
            }
            this.LLILZ.invoke(groupInviteInfoModel);
        } else {
            this.LLILZIL.invoke(groupInviteInfoModel.getInviteError());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupInviteLinkDataSource@e36e.resetInviteLink$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
