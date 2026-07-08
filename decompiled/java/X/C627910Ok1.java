package X;

import android.os.Message;
import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ok1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creativedetail.view.CreativeToolAwemeModel$fetchList$1", f = "CreativeToolAwemeModel.kt", l = {80}, m = "invokeSuspend")
public final class C627910Ok1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C627900Ok0 LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C627910Ok1(int i, String str, long j, C627900Ok0 c627900Ok0, long j2, InterfaceC1364105Vn<? super C627910Ok1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = c627900Ok0;
        this.LLILZLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C627910Ok1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreativeToolAwemeModel@8e7a.fetchList$1");
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
            C627770Ojn c627770Ojn = InterfaceC627760Ojm.LIZ;
            int i2 = this.LLILLJJLI;
            String str = this.LLILLL;
            long j = this.LLILZ;
            c627770Ojn.getClass();
            C0CHQ.LIZ().getApplicationService();
            C19221910Hx.LIZIZ();
            C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C627920Ok2(i2, j, str));
            C0O4P<CreativeToolDetailListModel> value = C627770Ojn.LIZJ.getValue();
            AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(60);
            AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(867);
            Intrinsics.LJFF(CreativeToolDetailListModel.class, C627950Ok5.class);
            c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C627950Ok5.class, CreativeToolDetailListModel.class)));
            C0O7F.LIZIZ(c613960O6gLIZIZ, C0O3P.NetWhenCacheMiss);
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
            final C627900Ok0 c627900Ok0 = this.LLILZIL;
            final int i3 = this.LLILLJJLI;
            final String str2 = this.LLILLL;
            final long j2 = this.LLILZLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0Ok3
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    String message;
                    C0O7A c0o7a = (C0O7A) obj2;
                    if (c0o7a instanceof C0O79) {
                        CreativeToolDetailListModel creativeToolDetailListModel = ((C627950Ok5) ((C0O79) c0o7a).LJ).LIZ;
                        if (creativeToolDetailListModel != null) {
                            C627900Ok0 c627900Ok02 = c627900Ok0;
                            Message message2 = new Message();
                            message2.obj = creativeToolDetailListModel;
                            c627900Ok02.mHandler.sendMessage(message2);
                        }
                    } else if (c0o7a instanceof C0O78) {
                        Message message3 = new Message();
                        C614090O6t c614090O6t = ((C0O78) c0o7a).LJFF;
                        message3.obj = c614090O6t;
                        C627900Ok0 c627900Ok03 = c627900Ok0;
                        int i4 = i3;
                        String str3 = str2;
                        if (str3 == null) {
                            str3 = "";
                        }
                        long j3 = j2;
                        long j4 = c627900Ok03.LLILZLL;
                        if (c614090O6t != null) {
                            message = c614090O6t.getMessage();
                        } else {
                            message = null;
                        }
                        c627900Ok03.getClass();
                        C627900Ok0.LJIIJJI(i4, str3, j3, j4, false, "List", message, null);
                        Boolean.valueOf(c627900Ok0.mHandler.sendMessage(message3));
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("CreativeToolAwemeModel@8e7a.fetchList$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreativeToolAwemeModel@8e7a.fetchList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
