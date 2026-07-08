package X;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TLF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0TLF extends C2217421BqW implements Function1<File, C1292030jj7<C1294720jnS>> {
    public C0TLF(Object obj) {
        super(1, obj, C740100T1k.class, "createJsonCompositionTask", "createJsonCompositionTask(Ljava/io/File;)Lcom/airbnb/lottie/LottieTask;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1292030jj7<C1294720jnS> invoke(File file) {
        C740100T1k c740100T1k = (C740100T1k) this.receiver;
        c740100T1k.getClass();
        C0VSP c0vsp = new C0VSP(file);
        C1529660puO c1529660puO = c740100T1k.LIZ;
        c1529660puO.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1529660puO.LIZ);
        sbLIZ.append(':');
        sbLIZ.append(c1529660puO.LIZIZ);
        return C1294250jmh.LJ(c0vsp, C2188811AlT.LIZIZ(sbLIZ));
    }
}
