package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748920vc2 extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Image LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1748920vc2(float f, float f2, float f3, float f4, int i, String str, String str2, Image image) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
        this.LLILZ = f4;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = image;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        boolean z;
        String str;
        List<String> urls;
        LaneParams laneParams2 = laneParams;
        boolean z2 = false;
        if (Math.abs(this.LL - this.LLILLJJLI) > 0.01d) {
            z = true;
        } else {
            z = false;
        }
        laneParams2.plusAssign("is_diff_scale", Boolean.valueOf(z));
        if (Math.abs(this.LLILLL - this.LLILZ) > 0.01d) {
            z2 = true;
        }
        laneParams2.plusAssign("has_changed", Boolean.valueOf(z2));
        laneParams2.plusAssign("index", Integer.valueOf(this.LLILZIL));
        laneParams2.plusAssign("url", this.LLILZLL);
        laneParams2.plusAssign("img_url", this.LLIZ);
        String strLIZIZ = C1759110vsT.LIZIZ(this.LLILZLL);
        Image image = this.LLIZLLLIL;
        if (image != null && (urls = image.getUrls()) != null) {
            str = (String) C13LP.LJJJLL(urls);
        } else {
            str = null;
        }
        laneParams2.plusAssign("is_diff", Boolean.valueOf(!Intrinsics.LJFF(strLIZIZ, C1759110vsT.LIZIZ(str))));
        return Unit.LIZ;
    }
}
