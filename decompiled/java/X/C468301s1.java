package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.detail.keyframe.util.TakoKeyframeImageLoadUtil$loadImagesFromThumb$3", f = "TakoKeyframeImageLoadUtil.kt", l = {82}, m = "invokeSuspend")
public final class C468301s1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LifecycleOwner LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public TakoKeyFramePoint LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ List<TakoKeyFramePoint> LLIZ;
    public final /* synthetic */ LifecycleOwner LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Map<TakoKeyFramePoint, C05XL<Bitmap>> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C468301s1(List<TakoKeyFramePoint> list, LifecycleOwner lifecycleOwner, String str, Map<TakoKeyFramePoint, ? extends C05XL<Bitmap>> map, InterfaceC1364105Vn<? super C468301s1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = list;
        this.LLIZLLLIL = lifecycleOwner;
        this.LLJ = str;
        this.LLJI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C468301s1(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0023, code lost:
    
        if (r14 != r10) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C468301s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
