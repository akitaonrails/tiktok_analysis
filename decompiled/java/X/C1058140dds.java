package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058140dds implements Serializable {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C1058140dds() {
        this(0, 1, null);
    }

    public final int getColor() {
        return this.LL;
    }

    public final int getColorDark() {
        return this.LLILLL;
    }

    public final int getColorLight() {
        return this.LLILLJJLI;
    }

    public C1058140dds(int i) {
        this.LL = i;
        this.LLILLJJLI = i;
        this.LLILLL = i;
    }

    public final void setColor(int i) {
        this.LL = i;
    }

    public final void setColorDark(int i) {
        this.LLILLL = i;
    }

    public final void setColorLight(int i) {
        this.LLILLJJLI = i;
    }

    public final int getColor(Context context, String str) {
        Configuration configuration;
        int i;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            configuration = resources.getConfiguration();
        } else {
            configuration = null;
        }
        if ((!Intrinsics.LJFF(str, "light") && configuration != null && (configuration.uiMode & 48) == 32) || Intrinsics.LJFF(str, "dark")) {
            i = this.LLILLL;
        } else {
            i = this.LLILLJJLI;
        }
        if (i == 0) {
            return this.LL;
        }
        return i;
    }

    public /* synthetic */ C1058140dds(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ int getColor$default(C1058140dds c1058140dds, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c1058140dds.getColor(context, str);
    }
}
