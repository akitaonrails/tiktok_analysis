package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EL2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$loaderReShowData$1$5", f = "EditorProLoaderComponent.kt", l = {}, m = "invokeSuspend")
public final class C0EL2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0ELH LL;
    public final /* synthetic */ C351780Dqi LLILLJJLI;
    public final /* synthetic */ C0ELA LLILLL;
    public final /* synthetic */ C0EL0 LLILZ;
    public final /* synthetic */ C0EL8 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EL2(C0ELH c0elh, C351780Dqi c351780Dqi, C0ELA c0ela, C0EL0 c0el0, C0EL8 c0el8, InterfaceC1364105Vn<? super C0EL2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0elh;
        this.LLILLJJLI = c351780Dqi;
        this.LLILLL = c0ela;
        this.LLILZ = c0el0;
        this.LLILZIL = c0el8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EL2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0EHJ c0ehj;
        C1C7U.LIZ("EditorProLoaderComponent@12f.loaderReShowData$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setEditModel(this.LL.LIZJ);
        if (C301680Bs6.LIZ()) {
            VideoPublishEditModel videoPublishEditModel = this.LL.LIZJ;
            C351780Dqi c351780Dqi = this.LLILLJJLI;
            c0ehj = new C0EHJ(c351780Dqi.LIZIZ, videoPublishEditModel, c351780Dqi.LIZ);
        } else {
            if (((Boolean) C0B9B.LIZ.getValue()).booleanValue()) {
                C0E1T.LIZ().setEditModel(this.LLILLJJLI.LIZ);
            }
            C351780Dqi c351780Dqi2 = this.LLILLJJLI;
            VideoPublishEditModel videoPublishEditModel2 = c351780Dqi2.LIZ;
            c0ehj = new C0EHJ(c351780Dqi2.LIZIZ, videoPublishEditModel2, videoPublishEditModel2);
        }
        C0ELA c0ela = this.LLILLL;
        C0EHI c0ehi = c0ela.LLJILJILJ;
        if (c0ehi == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EditorProLoaderComponent@12f.loaderReShowData$1$5");
            return unit;
        }
        C0ELH c0elh = this.LL;
        C0ELJ c0elj = c0elh.LIZLLL;
        boolean z = c0elh.LJ;
        c0ela.LLJILJIL.setValue(new C0EHI(c0ehj, c0ehi.LIZIZ, c0ehi.LIZJ, this.LLILZ, c0elj, z, this.LLILZIL));
        MutableLiveData<Unit> mutableLiveData = this.LLILLL.LLJILLL;
        Unit unit2 = Unit.LIZ;
        mutableLiveData.setValue(unit2);
        C1C7U.LIZIZ("EditorProLoaderComponent@12f.loaderReShowData$1$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
