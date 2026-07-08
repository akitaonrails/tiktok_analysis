package X;

import android.graphics.Typeface;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FK6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FK6 extends C2217421BqW implements Function1<String, Typeface> {
    public C0FK6(C0FKI c0fki) {
        super(1, c0fki, C0FKI.class, "getTypefaceByName", "getTypefaceByName(Ljava/lang/String;)Landroid/graphics/Typeface;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Typeface invoke(String str) {
        return ((C0FKI) this.receiver).LIZ(str);
    }
}
