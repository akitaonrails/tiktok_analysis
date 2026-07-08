package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS113S0101000_5;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0FDX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.template.ui.CaptionTemplateListComponent$onTemplateClick$3$1", f = "CaptionTemplateListComponent.kt", l = {208}, m = "invokeSuspend")
public final class C0FDX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FDW LLILLJJLI;
    public final /* synthetic */ CaptionTemplateData LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0FDZ LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDX(C0FDW c0fdw, CaptionTemplateData captionTemplateData, int i, C0FDZ c0fdz, String str, InterfaceC1364105Vn<? super C0FDX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0fdw;
        this.LLILLL = captionTemplateData;
        this.LLILZ = i;
        this.LLILZIL = c0fdz;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FDX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("CaptionTemplateListComponent@1430.onTemplateClick$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0FDW c0fdw = this.LLILLJJLI;
            C0FDM c0fdm = c0fdw.LLJJIJIIJIL;
            CaptionTemplateData captionTemplateData = this.LLILLL;
            AwS113S0101000_5 awS113S0101000_5 = new AwS113S0101000_5(c0fdw, this.LLILZ, 4);
            this.LL = 1;
            objLIZ = c0fdm.LIZ(captionTemplateData, awS113S0101000_5, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CaptionTemplateListComponent@1430.onTemplateClick$3$1");
                return objLJFF;
            }
        }
        C0FDW c0fdw2 = this.LLILLJJLI;
        int i2 = this.LLILZ;
        C0FDZ c0fdz = this.LLILZIL;
        String str = this.LLILZLL;
        CaptionTemplateData captionTemplateData2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(objLIZ)) {
            for (Pair pair : (List) objLIZ) {
                ((ConcurrentHashMap) C365460EUm.LIZ).put(pair.getFirst(), pair.getSecond());
            }
            c0fdw2.R5(i2, EnumC1641420soe.DOWNLOAD_SUCCESS, 0);
            if (c0fdw2.n5(c0fdz)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CaptionTemplateListComponent@1430.onTemplateClick$3$1");
                return unit;
            }
            if (Intrinsics.LJFF(str, c0fdz.LIZ)) {
                c0fdw2.E5();
            } else {
                c0fdw2.H4(captionTemplateData2, true);
            }
        }
        C0FDW c0fdw3 = this.LLILLJJLI;
        int i3 = this.LLILZ;
        if (C189200o6.m5exceptionOrNullimpl(objLIZ) != null) {
            C1627000sRO.LIZIZ(c0fdw3.LLJILLL.getSceneContext(), true);
            c0fdw3.H5();
            c0fdw3.R5(i3, EnumC1641420soe.DOWNLOAD_FAILED, 0);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CaptionTemplateListComponent@1430.onTemplateClick$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
