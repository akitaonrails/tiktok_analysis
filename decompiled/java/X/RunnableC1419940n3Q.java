package X;

import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0n3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class RunnableC1419940n3Q implements Runnable {
    public final /* synthetic */ Meta LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function2<Integer, String, Unit> LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC1419940n3Q(Meta meta, String str, boolean z, C1419950n3R c1419950n3R, Function0<Unit> function0, Function2<? super Integer, ? super String, Unit> function2) {
        this.LL = meta;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = function0;
        this.LLILZIL = function2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutCompressMetaTask@be9f.compress$2");
        try {
            Meta meta = this.LL;
            String str = this.LLILLJJLI;
            boolean z = this.LLILLL;
            final Function0<Unit> function0 = this.LLILZ;
            final Function2<Integer, String, Unit> function2 = this.LLILZIL;
            C1419810n3D.LIZ.getClass();
            ((C1419930n3P) C1419810n3D.LJ.getValue()).compressMeta(meta, str, z, new CommonRequestCallback() { // from class: X.0n3V
                @Override // com.bytedance.ies.smartmovie.jni.CommonRequestCallback
                public final void onSuccess(String str2) {
                    function0.invoke();
                }

                @Override // com.bytedance.ies.smartmovie.jni.CommonRequestCallback
                public final void onFailure(int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
                    function2.invoke(Integer.valueOf(i), str2);
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutCompressMetaTask@be9f.compress$2");
    }
}
