package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.ugctemplate.TemplatePreProcessComponent$restoreNLEModel$2$1", f = "TemplatePreProcessComponent.kt", l = {}, m = "invokeSuspend")
public final class C559230LwX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C559200LwU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C559230LwX(C559200LwU c559200LwU, InterfaceC1364105Vn<? super C559230LwX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c559200LwU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C559230LwX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor2;
        C1C7U.LIZ("TemplatePreProcessComponent@9cde.restoreNLEModel$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1452170ntP value = this.LL.JY0().g().getValue();
        if (value != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value)) != null && (nLEEditor2 = c348100DkmLIZIZ2.LIZ) != null) {
            nLEEditor2.setModel(this.LL.LLJL);
        }
        InterfaceC1452170ntP value2 = this.LL.JY0().g().getValue();
        if (value2 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value2)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            Boolean.valueOf(nLEEditor.commit());
        }
        InterfaceC559500Lwy interfaceC559500LwyD5 = this.LL.d5();
        if (interfaceC559500LwyD5 != null) {
            interfaceC559500LwyD5.Qk(false);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("TemplatePreProcessComponent@9cde.restoreNLEModel$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
