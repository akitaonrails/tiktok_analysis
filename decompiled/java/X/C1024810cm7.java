package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.EditorProCaptionsAnchorMaker$whenMyAnchorShown$1$1", f = "EditorProCaptionsAnchorMaker.kt", l = {}, m = "invokeSuspend")
public final class C1024810cm7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1066440drG LL;
    public final /* synthetic */ AnchorCommonStruct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024810cm7(C1066440drG c1066440drG, AnchorCommonStruct anchorCommonStruct, InterfaceC1364105Vn<? super C1024810cm7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1066440drG;
        this.LLILLJJLI = anchorCommonStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1024810cm7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProCaptionsAnchorMaker@98b6.whenMyAnchorShown$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1066440drG c1066440drG = this.LL;
        String schema = this.LLILLJJLI.getSchema();
        c1066440drG.getClass();
        String strLIZIZ = C018G.LIZIZ(schema, "captions_landing_page_video");
        if (strLIZIZ != null) {
            C582130MsN.LIZ().LJ().getClass();
            C1482860ogu c1482860ogu = C1014030cUj.LIZ;
            C1482580ogS c1482580ogS = new C1482580ogS();
            c1482580ogS.LIZ = strLIZIZ;
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZIZ(strLIZIZ);
            C1482580ogS c1482580ogSLIZ = c1058540deW.LIZ();
            c1482580ogSLIZ.getClass();
            c1482860ogu.LJIILLIIL(512, Collections.singletonList(new C1484680ojq(c1482580ogSLIZ).LIZ()));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProCaptionsAnchorMaker@98b6.whenMyAnchorShown$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
