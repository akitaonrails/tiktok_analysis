package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548240qOM implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final WeakReference<InterfaceC1892990zMP> LIZIZ;
    public final SparkContext LIZJ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        InterfaceC1892990zMP interfaceC1892990zMP;
        InterfaceC1892990zMP interfaceC1892990zMP2;
        InterfaceC1892990zMP interfaceC1892990zMP3;
        InterfaceC1892990zMP interfaceC1892990zMP4;
        InterfaceC1892990zMP interfaceC1892990zMP5;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        String showCloseAll = sparkPageSchemaParam != null ? sparkPageSchemaParam.getShowCloseAll() : null;
        if (Intrinsics.LJFF(showCloseAll, "1")) {
            WeakReference<InterfaceC1892990zMP> weakReference = this.LIZIZ;
            if (weakReference != null && (interfaceC1892990zMP5 = weakReference.get()) != null) {
                interfaceC1892990zMP5.LJJJJ(true);
            }
        } else if (Intrinsics.LJFF(showCloseAll, "")) {
            WeakReference<InterfaceC1892990zMP> weakReference2 = this.LIZIZ;
            if (weakReference2 != null && (interfaceC1892990zMP2 = weakReference2.get()) != null) {
                interfaceC1892990zMP2.LJJJJ(false);
            }
            SparkContext sparkContext = this.LIZJ;
            if (sparkContext != null) {
                sparkContext.LJJJJZI(new C1554520qYU(this, 8));
            }
        } else {
            WeakReference<InterfaceC1892990zMP> weakReference3 = this.LIZIZ;
            if (weakReference3 != null && (interfaceC1892990zMP = weakReference3.get()) != null) {
                interfaceC1892990zMP.LJJJJ(false);
            }
        }
        SparkPageSchemaParam sparkPageSchemaParam2 = this.LIZ;
        if (Intrinsics.LJFF(sparkPageSchemaParam2 != null ? Boolean.valueOf(sparkPageSchemaParam2.getHideBackButton()) : null, Boolean.TRUE)) {
            WeakReference<InterfaceC1892990zMP> weakReference4 = this.LIZIZ;
            if (weakReference4 == null || (interfaceC1892990zMP4 = weakReference4.get()) == null) {
                return;
            }
            interfaceC1892990zMP4.LJJII(false);
            return;
        }
        WeakReference<InterfaceC1892990zMP> weakReference5 = this.LIZIZ;
        if (weakReference5 == null || (interfaceC1892990zMP3 = weakReference5.get()) == null) {
            return;
        }
        interfaceC1892990zMP3.LJJII(true);
    }

    public C1548240qOM(SparkPageSchemaParam sparkPageSchemaParam, WeakReference<InterfaceC1892990zMP> weakReference, SparkContext sparkContext) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = weakReference;
        this.LIZJ = sparkContext;
    }
}
