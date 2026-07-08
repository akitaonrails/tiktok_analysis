package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20567215du extends C09AY implements Function0<DisplayMetrics> {
    public C20567215du() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DisplayMetrics invoke() {
        return Resources.getSystem().getDisplayMetrics();
    }
}
