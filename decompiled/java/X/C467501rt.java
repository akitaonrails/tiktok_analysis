package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM$loadCoverBitmap$4", f = "StoryHighlightsCreationVM.kt", l = {545}, m = "invokeSuspend")
public final class C467501rt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C467501rt(Context context, Uri uri, InterfaceC1364105Vn<? super C467501rt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C467501rt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.loadCoverBitmap$4");
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
            C0I2Q c0i2q = C0I2Q.LIZ;
            Context context = this.LLILLJJLI;
            Uri uri = this.LLILLL;
            this.LL = 1;
            c0i2q.getClass();
            obj = C0I2Q.LIZ(context, uri, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.loadCoverBitmap$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.loadCoverBitmap$4");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
