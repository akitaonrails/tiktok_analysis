package X;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09NN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.download.TakoImageDownloader$downloadImage$1$1", f = "TakoImageDownloader.kt", l = {}, m = "invokeSuspend")
public final class C09NN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Uri LL;
    public final /* synthetic */ C09NO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09NN(Uri uri, C09NO c09no, InterfaceC1364105Vn<? super C09NN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
        this.LLILLJJLI = c09no;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09NN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageDownloader@2329.downloadImage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Uri uri = this.LL;
        if (uri != null) {
            C09NO c09no = this.LLILLJJLI;
            if (c09no != null) {
                c09no.LIZIZ(uri);
            }
        } else {
            C09NO c09no2 = this.LLILLJJLI;
            if (c09no2 != null) {
                c09no2.onFailure();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageDownloader@2329.downloadImage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
