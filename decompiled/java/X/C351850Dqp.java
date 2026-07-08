package X;

import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.asve.editor.nlepro.NLEMusicManagerImpl$setBgms$1$1$1", f = "NLEMusicManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C351850Dqp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VEUtils.VEAudioFileInfo>, Object> {
    public final /* synthetic */ C347660Dk4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351850Dqp(C347660Dk4 c347660Dk4, InterfaceC1364105Vn<? super C351850Dqp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c347660Dk4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351850Dqp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VEUtils.VEAudioFileInfo audioFileInfo;
        C1C7U.LIZ("NLEMusicManagerImpl@358d.setBgms$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.LIZIZ;
        if (str != null) {
            audioFileInfo = VEUtils.getAudioFileInfo(str);
        } else {
            audioFileInfo = null;
        }
        C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgms$1$1$1");
        return audioFileInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VEUtils.VEAudioFileInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
