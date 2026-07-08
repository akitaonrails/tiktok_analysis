package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.MusicEditResponse;
import com.ss.android.ugc.aweme.services.edit.MusicStripResultConfirmRequest;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10GP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$doRequest$2$2", f = "ReplaceMusicServiceImpl.kt", l = {311}, m = "invokeSuspend")
public final class C10GP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReplaceMusicRequest LLILLJJLI;
    public final /* synthetic */ C15O7<MusicEditResponse> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10GP(ReplaceMusicRequest replaceMusicRequest, C15O7<MusicEditResponse> c15o7, InterfaceC1364105Vn<? super C10GP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = replaceMusicRequest;
        this.LLILLL = c15o7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10GP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        String str;
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.doRequest$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILLJJLI.getItemID());
                long jLongValue2 = 0;
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(C0CHQ.LIZ().getAccountService().getCurrentUserID());
                if (lLJIILIIL2 != null) {
                    jLongValue2 = lLJIILIIL2.longValue();
                }
                MusicEditResponse musicEditResponseLJIIL = this.LLILLL.LJIIL();
                if (musicEditResponseLJIIL == null || (str = musicEditResponseLJIIL.reqId) == null) {
                    str = "";
                }
                MusicStripResultConfirmRequest musicStripResultConfirmRequest = new MusicStripResultConfirmRequest(jLongValue, jLongValue2, false, str);
                C19221010Ho c19221010Ho = InterfaceC19221110Hp.LIZ;
                this.LL = 1;
                c19221010Ho.getClass();
                if (C19221010Ho.LIZ(musicStripResultConfirmRequest, this) == objLJFF) {
                    C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.doRequest$2$2");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("confirm req error: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJFF("ReplaceMusicToolbarScene", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.doRequest$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
