package X;

import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.LoadingAssem;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMImageStudioApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.misc.LoadingAssem$onActualViewCreated$1$3", f = "LoadingAssem.kt", l = {161}, m = "invokeSuspend")
public final class C342910DcP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LoadingAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342910DcP(LoadingAssem loadingAssem, InterfaceC1364105Vn<? super C342910DcP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loadingAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C342910DcP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadingAssem@66c6.onActualViewCreated$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            LoadingAssem loadingAssem = this.LLILLJJLI;
            loadingAssem.getClass();
            C05YD c05ydLIZIZ = C459000HzG.LIZIZ(loadingAssem);
            Object obj2 = new InterfaceC346701Wf() { // from class: X.0DcW
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C342950DcT c342950DcT = (C342950DcT) obj3;
                    EnumC342940DcS enumC342940DcS = c342950DcT.LIZIZ;
                    if (enumC342940DcS == EnumC342940DcS.LOADING && c342950DcT.LIZ) {
                        IMImageStudioApi.LIZ.getClass();
                        IMImageStudioApi iMImageStudioApiLIZ = C342990DcX.LIZ();
                        if (iMImageStudioApiLIZ != null) {
                            iMImageStudioApiLIZ.LIZ(EnumC1489905sP.STICKER_GENERATING, "show");
                        }
                    } else if (enumC342940DcS == EnumC342940DcS.COMPLETED && c342950DcT.LIZ) {
                        IMImageStudioApi.LIZ.getClass();
                        IMImageStudioApi iMImageStudioApiLIZ2 = C342990DcX.LIZ();
                        if (iMImageStudioApiLIZ2 != null) {
                            iMImageStudioApiLIZ2.LIZ(EnumC1489905sP.STICKER_COMPLETE, "show");
                        }
                    } else if (enumC342940DcS == EnumC342940DcS.ERROR && c342950DcT.LIZ) {
                        IMImageStudioApi.LIZ.getClass();
                        IMImageStudioApi iMImageStudioApiLIZ3 = C342990DcX.LIZ();
                        if (iMImageStudioApiLIZ3 != null) {
                            iMImageStudioApiLIZ3.LIZ(EnumC1489905sP.STICKER_FAIL, "show");
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c05ydLIZIZ.collect(obj2, this) == objLJFF) {
                C1C7U.LIZIZ("LoadingAssem@66c6.onActualViewCreated$1$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
