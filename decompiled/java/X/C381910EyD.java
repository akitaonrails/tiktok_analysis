package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.GenAIEffectI2VHandler$startTask$1$submission$1", f = "GenAIEffectI2VHandler.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C381910EyD extends C09AX implements InterfaceC1631620sYq<String, C381540Exc, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C381600Exi LLILLL;
    public final /* synthetic */ InterfaceC382380Eyy LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381910EyD(C381600Exi c381600Exi, InterfaceC382380Eyy interfaceC382380Eyy, InterfaceC1364105Vn<? super C381910EyD> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c381600Exi;
        this.LLILZ = interfaceC382380Eyy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("GenAIEffectI2VHandler@edfc.startTask$1$submission$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            str = (String) this.LLILLJJLI;
            Function2<String, InterfaceC1364105Vn<? super Boolean>, Object> function2 = this.LLILLL.LJIJJ;
            if (function2 != null) {
                this.LLILLJJLI = str;
                this.LL = 1;
                obj = function2.invoke(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GenAIEffectI2VHandler@edfc.startTask$1$submission$1");
                    return objLJFF;
                }
            }
            this.LLILZ.LIZ(str);
            z = true;
            Boolean boolValueOf = Boolean.valueOf(z);
            C1C7U.LIZIZ("GenAIEffectI2VHandler@edfc.startTask$1$submission$1");
            return boolValueOf;
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILZ.LIZ(str);
            z = true;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z);
        C1C7U.LIZIZ("GenAIEffectI2VHandler@edfc.startTask$1$submission$1");
        return boolValueOf2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(String str, C381540Exc c381540Exc, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C381910EyD c381910EyD = new C381910EyD(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c381910EyD.LLILLJJLI = str;
        return c381910EyD.invokeSuspend(Unit.LIZ);
    }
}
