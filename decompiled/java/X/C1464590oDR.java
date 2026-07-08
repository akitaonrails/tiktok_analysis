package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464590oDR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ IAVTransformService.ITransformCallback<Integer> LLIZLLLIL;
    public final /* synthetic */ IAVTransformService.ITransformProgress LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1464590oDR(String str, String str2, int i, int i2, int i3, int i4, int i5, IAVTransformService.ITransformCallback<Integer> iTransformCallback, IAVTransformService.ITransformProgress iTransformProgress) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = i5;
        this.LLIZLLLIL = iTransformCallback;
        this.LLJ = iTransformProgress;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        new C0VSJ(C1449640npK.LIZ).mkdirs();
        new C0VSJ(C1449640npK.LJIIJ).mkdirs();
        new C0VSJ(C1449640npK.LIZIZ).mkdirs();
        C1464600oDS c1464600oDS = new C1464600oDS();
        c1464600oDS.LIZ = this.LL;
        c1464600oDS.LIZIZ = this.LLILLJJLI;
        c1464600oDS.LJFF = this.LLILLL;
        c1464600oDS.LJI = this.LLILZ;
        c1464600oDS.LIZLLL = this.LLILZIL;
        c1464600oDS.LJ = this.LLILZLL;
        c1464600oDS.LIZJ = this.LLIZ;
        final IAVTransformService.ITransformProgress iTransformProgress = this.LLJ;
        int iConvertVideo2Webp = VEUtils.convertVideo2Webp(c1464600oDS, new C1DP2() { // from class: X.0oDV
            @Override // X.C1DP2
            public final void onProgressChanged(int i) {
                IAVTransformService.ITransformProgress iTransformProgress2 = iTransformProgress;
                if (iTransformProgress2 != null) {
                    iTransformProgress2.update(i);
                }
            }
        });
        IAVTransformService.ITransformCallback<Integer> iTransformCallback = this.LLIZLLLIL;
        if (iTransformCallback != null) {
            iTransformCallback.finish(Integer.valueOf(iConvertVideo2Webp));
        }
        return Unit.LIZ;
    }
}
