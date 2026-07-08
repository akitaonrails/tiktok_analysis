package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05iW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AutoPickTemplateAssetDownloader$downloadData$musicFlow$1", f = "AutoPickTemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1428605iW extends C09AX implements Function2<Pair<? extends Integer, ? extends AVMusic>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428605iW(String str, String str2, InterfaceC1364105Vn<? super C1428605iW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1428605iW c1428605iW = new C1428605iW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1428605iW.LL = obj;
        return c1428605iW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AutoPickTemplateAssetDownloader@c432.downloadData$musicFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = (Pair) this.LL;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        Object second = pair.getSecond();
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTemplateAssetDownloader -> [diag] musicFlow emit assetId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", progress=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", hasMusic=");
        if (second != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoPickTemplateAssetDownloader@c432.downloadData$musicFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Integer, ? extends AVMusic> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
