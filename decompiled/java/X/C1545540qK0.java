package X;

import android.content.Context;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545540qK0 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Context context) {
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static Integer[] LIZ(SparkPopupSchemaParam sparkPopupSchemaParam, Context context) {
        int marginTop;
        boolean z;
        int marginBottom;
        int marginLeft;
        boolean z2;
        int marginRight;
        int marginStart;
        int marginEnd;
        if (sparkPopupSchemaParam.getMarginTop() > 0) {
            marginTop = sparkPopupSchemaParam.getMarginTop();
            z = true;
        } else {
            marginTop = 0;
            z = false;
        }
        if (sparkPopupSchemaParam.getMarginBottom() > 0) {
            marginBottom = sparkPopupSchemaParam.getMarginBottom();
            z = true;
        } else {
            marginBottom = 0;
        }
        if (sparkPopupSchemaParam.getMarginLeft() > 0) {
            marginLeft = sparkPopupSchemaParam.getMarginLeft();
            z2 = true;
        } else {
            marginLeft = 0;
            z2 = false;
        }
        if (sparkPopupSchemaParam.getMarginRight() > 0) {
            marginRight = sparkPopupSchemaParam.getMarginRight();
            z2 = true;
        } else {
            marginRight = 0;
        }
        boolean zLIZIZ = LIZIZ(context);
        if (sparkPopupSchemaParam.getMarginStart() > 0) {
            marginStart = sparkPopupSchemaParam.getMarginStart();
            z2 = true;
        } else {
            marginStart = 0;
        }
        if (sparkPopupSchemaParam.getMarginEnd() > 0) {
            marginEnd = sparkPopupSchemaParam.getMarginEnd();
        } else {
            marginEnd = 0;
            if (!z2) {
                if (z) {
                    if (!Intrinsics.LJFF(sparkPopupSchemaParam.getGravity(), "bottom")) {
                        marginBottom = 0;
                    }
                }
                return new Integer[]{Integer.valueOf(marginLeft), Integer.valueOf(marginTop), Integer.valueOf(marginRight), Integer.valueOf(marginBottom), Integer.valueOf(marginStart), Integer.valueOf(marginEnd)};
            }
            marginTop = 0;
            marginLeft = 0;
            marginRight = 0;
            return new Integer[]{Integer.valueOf(marginLeft), Integer.valueOf(marginTop), Integer.valueOf(marginRight), Integer.valueOf(marginBottom), Integer.valueOf(marginStart), Integer.valueOf(marginEnd)};
        }
        if (!z) {
            if (Intrinsics.LJFF(sparkPopupSchemaParam.getGravity(), "left") || ((Intrinsics.LJFF(sparkPopupSchemaParam.getGravity(), "start") && !zLIZIZ) || (Intrinsics.LJFF(sparkPopupSchemaParam.getGravity(), "end") && zLIZIZ))) {
                marginTop = 0;
                marginBottom = 0;
                marginRight = 0;
            } else {
                if (Intrinsics.LJFF(sparkPopupSchemaParam.getGravity(), "right") || Intrinsics.LJFF(sparkPopupSchemaParam.getGravity(), "start") || Intrinsics.LJFF(sparkPopupSchemaParam.getGravity(), "end")) {
                    marginTop = 0;
                    marginBottom = 0;
                    marginLeft = 0;
                }
                marginBottom = 0;
                marginTop = 0;
                marginLeft = 0;
                marginRight = 0;
            }
        }
        return new Integer[]{Integer.valueOf(marginLeft), Integer.valueOf(marginTop), Integer.valueOf(marginRight), Integer.valueOf(marginBottom), Integer.valueOf(marginStart), Integer.valueOf(marginEnd)};
    }
}
