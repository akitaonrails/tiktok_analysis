package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectUtil$initVM$5$1$2$1$1", f = "TakoMultipleSelectUtil.kt", l = {434}, m = "invokeSuspend")
public final class C1388230mEH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ InterfaceC665370Q7z LLILZIL;
    public final /* synthetic */ Bitmap LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ View LLJI;
    public final /* synthetic */ TakoMultipleSelectVM LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388230mEH(C259800zU<DialogC1389620mGW> c259800zU, Activity activity, InterfaceC665370Q7z interfaceC665370Q7z, Bitmap bitmap, int i, Map<String, String> map, String str, View view, TakoMultipleSelectVM takoMultipleSelectVM, InterfaceC1364105Vn<? super C1388230mEH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = activity;
        this.LLILZIL = interfaceC665370Q7z;
        this.LLILZLL = bitmap;
        this.LLIZ = i;
        this.LLIZLLLIL = map;
        this.LLJ = str;
        this.LLJI = view;
        this.LLJIJIL = takoMultipleSelectVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1388230mEH c1388230mEH = new C1388230mEH(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1388230mEH.LLILLJJLI = obj;
        return c1388230mEH;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022e A[PHI: r2
      0x022e: PHI (r2v3 android.view.ViewGroup) = (r2v1 android.view.ViewGroup), (r2v8 android.view.ViewGroup) binds: [B:35:0x00d2, B:44:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1388230mEH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
