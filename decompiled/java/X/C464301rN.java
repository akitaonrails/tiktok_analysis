package X;

import android.view.View;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.image.ImagePostKt$imagePost$1", f = "ImagePost.kt", l = {28}, m = "invokeSuspend")
public final class C464301rN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ List<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C464301rN(View view, List<String> list, String str, Map<String, String> map, boolean z, List<String> list2, InterfaceC1364105Vn<? super C464301rN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = map;
        this.LLILZLL = z;
        this.LLIZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C464301rN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImagePostKt@2b52.imagePost$1");
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
            View view = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            String str = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            boolean z = this.LLILZLL;
            List<String> list2 = this.LLIZ;
            this.LL = 1;
            if (C12FK.LIZIZ(view, list, str, map, z, list2, this) == objLJFF) {
                C1C7U.LIZIZ("ImagePostKt@2b52.imagePost$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImagePostKt@2b52.imagePost$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
