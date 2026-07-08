package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.EditorProCaptionsAnchorMaker$1", f = "EditorProCaptionsAnchorMaker.kt", l = {}, m = "invokeSuspend")
public final class C0CSZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0CSZ(InterfaceC1364105Vn<? super C0CSZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProCaptionsAnchorMaker@98b6.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Keva.getRepo("text_sticker_keva");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProCaptionsAnchorMaker@98b6.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0CSZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
