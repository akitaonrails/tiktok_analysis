package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09MD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.keyframe.util.SearchThumbImageLoadUtil$loadImagesFromThumb$3", f = "SearchThumbImageLoadUtil.kt", l = {148}, m = "invokeSuspend")
public final class C09MD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public BigThumb LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ List<SearchKeyFramePoint> LLIZLLLIL;
    public final /* synthetic */ BigThumb LLJ;
    public final /* synthetic */ Map<SearchKeyFramePoint, C05XL<Bitmap>> LLJI;
    public final /* synthetic */ LifecycleOwner LLJIJIL;
    public final /* synthetic */ String LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09MD(List<SearchKeyFramePoint> list, BigThumb bigThumb, Map<SearchKeyFramePoint, ? extends C05XL<Bitmap>> map, LifecycleOwner lifecycleOwner, String str, InterfaceC1364105Vn<? super C09MD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = list;
        this.LLJ = bigThumb;
        this.LLJI = map;
        this.LLJIJIL = lifecycleOwner;
        this.LLJILJIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09MD c09md = new C09MD(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c09md.LLIZ = obj;
        return c09md;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x0325 -> B:6:0x0031). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09MD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
