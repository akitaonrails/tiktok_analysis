package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01jE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C413801jE extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Object[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Object, Object, InterfaceC1364105Vn<Object>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C413801jE(InterfaceC1631620sYq<Object, Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C413801jE> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = this.LLILLJJLI;
            Object[] objArr = (Object[]) this.LLILLL;
            InterfaceC1631620sYq<Object, Object, InterfaceC1364105Vn<Object>, Object> interfaceC1631620sYq = this.LLILZ;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = interfaceC1631620sYq.invoke(obj2, obj3, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, Object[] objArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C413801jE c413801jE = new C413801jE(this.LLILZ, interfaceC1364105Vn);
        c413801jE.LLILLJJLI = interfaceC346701Wf;
        c413801jE.LLILLL = objArr;
        return c413801jE.invokeSuspend(Unit.LIZ);
    }
}
