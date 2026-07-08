package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0Mir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutImageEditHelper$startImageAutoCut$1$1$onCancel$1", f = "AutoCutImageEditHelper.kt", l = {}, m = "invokeSuspend")
public final class C576230Mir extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AutoCutModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C576230Mir(AutoCutModel autoCutModel, InterfaceC1364105Vn<? super C576230Mir> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = autoCutModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C576230Mir(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutImageEditHelper@4c33.startImageAutoCut$1$1$onCancel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (AutoCutMediaModel autoCutMediaModel : this.LL.mediaList) {
            if (C23181096l.LIZ()) {
                s sVar = s.LIZ;
                String str = autoCutMediaModel.filePath;
                sVar.getClass();
                if (a0.LJJIIZI(str, EnumC20228214Cy.SMART_MOVIE.getNameSpace(), false)) {
                }
            }
            C2286708xd.LJIJ(autoCutMediaModel.filePath);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutImageEditHelper@4c33.startImageAutoCut$1$1$onCancel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
