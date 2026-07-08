package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.apm.agent.instrumentation.HttpInstrumentation;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.map.DynamicMapUtilsKt$downloadImage$2", f = "DynamicMapUtils.kt", l = {}, m = "invokeSuspend")
public final class C2156808cg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156808cg(String str, InterfaceC1364105Vn<? super C2156808cg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2156808cg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        C1C7U.LIZ("DynamicMapUtilsKt@a976.downloadImage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        URLConnection uRLConnectionOpenConnection = HttpInstrumentation.openConnection(C2204961BRm.e0(new URL(this.LL), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHD3SLzZytmTbfSzRKEv04kd042a7Y=", null)));
        uRLConnectionOpenConnection.setDoInput(true);
        uRLConnectionOpenConnection.connect();
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
        C1C7U.LIZIZ("DynamicMapUtilsKt@a976.downloadImage$2");
        return bitmapDecodeStream;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
