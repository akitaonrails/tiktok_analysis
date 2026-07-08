package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.EditorProAIGCComponent$addErrorWatermarkToImage$2$1", f = "EditorProAIGCComponent.kt", l = {954}, m = "invokeSuspend")
public final class C2486509ol extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TuxIconDrawable LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486509ol(String str, TuxIconDrawable tuxIconDrawable, String str2, Context context, InterfaceC1364105Vn<? super C2486509ol> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = tuxIconDrawable;
        this.LLILZ = str2;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2486509ol(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProAIGCComponent@c6d2.addErrorWatermarkToImage$2$1");
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
            C2486309oj c2486309oj = C2486309oj.LIZ;
            String str = this.LLILLJJLI;
            TuxIconDrawable tuxIconDrawable = this.LLILLL;
            String str2 = this.LLILZ;
            Context context = this.LLILZIL;
            this.LL = 1;
            obj = c2486309oj.LIZIZ(str, tuxIconDrawable, str2, context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditorProAIGCComponent@c6d2.addErrorWatermarkToImage$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EditorProAIGCComponent@c6d2.addErrorWatermarkToImage$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
