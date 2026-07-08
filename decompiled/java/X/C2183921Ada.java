package X;

import android.view.View;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Ada, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183921Ada implements InterfaceC1554280qY6 {
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;
    public final C1554250qY3 LIZJ;

    public final String LIZ() {
        String realTransitionAnimation = this.LIZ.getRealTransitionAnimation(this.LIZIZ.getContext());
        return Intrinsics.LJFF(realTransitionAnimation, "start") ? !C1545540qK0.LIZIZ(this.LIZIZ.getContext()) ? "left" : "right" : Intrinsics.LJFF(realTransitionAnimation, "end") ? C1545540qK0.LIZIZ(this.LIZIZ.getContext()) ? "left" : "right" : realTransitionAnimation;
    }

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        this.LIZ.getRealTransitionAnimation(this.LIZIZ.getContext());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.AbstractC1911210zpn r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2183921Ada.LIZIZ(X.0zpn, kotlin.jvm.functions.Function0):void");
    }

    public C2183921Ada(SparkPopupSchemaParam sparkPopupSchemaParam, View view, C1554250qY3 c1554250qY3) {
        this.LIZ = sparkPopupSchemaParam;
        this.LIZIZ = view;
        this.LIZJ = c1554250qY3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.AbstractC1911210zpn r8, int r9, kotlin.jvm.functions.Function0<kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2183921Ada.LIZJ(X.0zpn, int, kotlin.jvm.functions.Function0):void");
    }
}
