package X;

import android.content.Context;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.ImageDisplayStrategy$1$isAnimated$1", f = "ImageDisplayStrategy.kt", l = {73}, m = "invokeSuspend")
public final class C2219108mj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2219108mj(String str, Context context, InterfaceC1364105Vn<? super C2219108mj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2219108mj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJFF;
        C1C7U.LIZ("ImageDisplayStrategy@7ac6.<init>$1$isAnimated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            if (str != null) {
                Context context = this.LLILLL;
                C2219308ml c2219308ml = C2219308ml.LIZ;
                this.LL = 1;
                obj = c2219308ml.LIZIZ(context, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ImageDisplayStrategy@7ac6.<init>$1$isAnimated$1");
                    return objLJFF;
                }
            } else {
                zLJFF = false;
                Boolean boolValueOf = Boolean.valueOf(zLJFF);
                C1C7U.LIZIZ("ImageDisplayStrategy@7ac6.<init>$1$isAnimated$1");
                return boolValueOf;
            }
        }
        InputStream inputStream = (InputStream) obj;
        Boolean bool = null;
        Throwable th = null;
        if (inputStream != null) {
            try {
                Boolean boolValueOf2 = Boolean.valueOf(C2219308ml.LIZ(inputStream));
                C2107108Nh.LIZ(inputStream, null);
                bool = boolValueOf2;
            } finally {
            }
        }
        zLJFF = Intrinsics.LJFF(bool, true);
        Boolean boolValueOf3 = Boolean.valueOf(zLJFF);
        C1C7U.LIZIZ("ImageDisplayStrategy@7ac6.<init>$1$isAnimated$1");
        return boolValueOf3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
