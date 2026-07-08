package X;

import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZX1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem$startAuditLoadingIfNeeded$1", f = "VoiceAssem.kt", l = {852}, m = "invokeSuspend")
public final class C0ZX1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VoiceAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C899820ZRs LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZX1(VoiceAssem voiceAssem, String str, C899820ZRs c899820ZRs, InterfaceC1364105Vn<? super C0ZX1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = voiceAssem;
        this.LLILLL = str;
        this.LLILZ = c899820ZRs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZX1(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("VoiceAssem@7e6f.startAuditLoadingIfNeeded$1");
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
            VoiceAssem.LLLLLZ.getClass();
            long jLongValue = ((Number) C18036074o.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("VoiceAssem@7e6f.startAuditLoadingIfNeeded$1");
                return objLJFF;
            }
        }
        if (Intrinsics.LJFF(this.LLILLJJLI.LLLJIL, this.LLILLL) && ((str = this.LLILZ.LIZIZ.LIZIZ) == null || str.length() == 0)) {
            IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("audit loading timeout, give up, id=");
            sbLIZ.append(this.LLILLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            iMVoiceMessageUtil.getClass();
            IMVoiceMessageUtil.LJIIJ("VoiceAssem", strLIZIZ);
            VoiceAssem voiceAssem = this.LLILLJJLI;
            voiceAssem.LLLJIL = null;
            voiceAssem.xq(this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceAssem@7e6f.startAuditLoadingIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
