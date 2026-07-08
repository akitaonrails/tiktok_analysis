package X;

import Y.ACListenerS157S0100000_23;
import android.view.View;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0qLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546700qLs implements InterfaceC1554280qY6 {
    public final SparkFragment LIZ;
    public final SparkPopupSchemaParam LIZIZ;
    public final View LIZJ;
    public final Function0<Unit> LIZLLL;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        C786410Ut5.I7(new ACListenerS157S0100000_23(this, 1), this.LIZJ);
    }

    public C1546700qLs(SparkFragment sparkFragment, SparkPopupSchemaParam sparkPopupSchemaParam, View view, AwS567S0100000_23 awS567S0100000_23) {
        this.LIZ = sparkFragment;
        this.LIZIZ = sparkPopupSchemaParam;
        this.LIZJ = view;
        this.LIZLLL = awS567S0100000_23;
    }
}
