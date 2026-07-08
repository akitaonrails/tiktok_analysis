package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.MusicBeatGenerator$fetchAlgorithmModel2$2", f = "MusicBeatGenerator.kt", l = {}, m = "invokeSuspend")
public final class C355300DwO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C355300DwO(InterfaceC1364105Vn<? super C355300DwO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355300DwO(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicBeatGenerator@9595.fetchAlgorithmModel2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strFindResourceUri = C13Q5.LIZ().LIZLLL().findResourceUri("bt_espresso_mobile_offline");
        if (strFindResourceUri == null) {
            strFindResourceUri = "";
        }
        C1C7U.LIZIZ("MusicBeatGenerator@9595.fetchAlgorithmModel2$2");
        return strFindResourceUri;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return new C355300DwO(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
