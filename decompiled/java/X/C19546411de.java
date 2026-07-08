package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.svc.StreamVoiceChanger$startVoiceChangeByStream$2$1", f = "StreamVoiceChanger.kt", l = {}, m = "invokeSuspend")
public final class C19546411de extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19546311dd LL;
    public final /* synthetic */ List<C19536311c1> LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ InterfaceC1219340hps LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19546411de(C19546311dd c19546311dd, List<C19536311c1> list, Effect effect, InterfaceC1219340hps interfaceC1219340hps, String str, InterfaceC1364105Vn<? super C19546411de> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19546311dd;
        this.LLILLJJLI = list;
        this.LLILLL = effect;
        this.LLILZ = interfaceC1219340hps;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19546411de(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19546411de.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
