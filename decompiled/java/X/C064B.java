package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.video.VideoSaveKt$saveVideo$result$1", f = "VideoSave.kt", l = {179}, m = "invokeSuspend")
public final class C064B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064B(String str, boolean z, C238400w2 c238400w2, InterfaceC1364105Vn<? super C064B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C064B(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long jLongValue;
        C1C7U.LIZ("VideoSaveKt@32a8.saveVideo$result$1");
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
            z = false;
            if (str != null && str.length() != 0) {
                Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
                String str2 = this.LLILLJJLI;
                boolean z2 = this.LLILLL;
                this.LL = 1;
                obj = C12FQ.LIZ(applicationContext, str2, this, z2);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("VideoSaveKt@32a8.saveVideo$result$1");
                    return objLJFF;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            C1C7U.LIZIZ("VideoSaveKt@32a8.saveVideo$result$1");
            return boolValueOf;
        }
        C064C c064c = (C064C) obj;
        C238400w2 c238400w2 = this.LLILZ;
        Long l = c064c.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c238400w2.element = jLongValue;
        z = c064c.LIZ;
        Boolean boolValueOf2 = Boolean.valueOf(z);
        C1C7U.LIZIZ("VideoSaveKt@32a8.saveVideo$result$1");
        return boolValueOf2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
