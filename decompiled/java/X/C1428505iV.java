package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AutoPickTemplateAssetDownloader$downloadData$nleModelFlow$1", f = "AutoPickTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1428505iV extends C09AX implements Function2<Pair<? extends Integer, ? extends NLEModel>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428505iV(String str, InterfaceC1364105Vn<? super C1428505iV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1428505iV c1428505iV = new C1428505iV(this.LLILLJJLI, interfaceC1364105Vn);
        c1428505iV.LL = obj;
        return c1428505iV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AutoPickTemplateAssetDownloader@c432.downloadData$nleModelFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = (Pair) this.LL;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        Object second = pair.getSecond();
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTemplateAssetDownloader -> [diag] nleFlow emit assetId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", progress=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", hasModel=");
        if (second != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoPickTemplateAssetDownloader@c432.downloadData$nleModelFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Integer, ? extends NLEModel> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
