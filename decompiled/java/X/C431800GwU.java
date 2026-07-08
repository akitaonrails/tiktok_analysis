package X;

import android.text.Layout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431800GwU extends C09AY implements Function0<Float> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C431790GwT LLILZ;
    public final /* synthetic */ float LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C431800GwU(String str, int i, C118300cf c118300cf, C431790GwT c431790GwT, float f) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = c118300cf;
        this.LLILZ = c431790GwT;
        this.LLILZIL = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(Layout.getDesiredWidth(this.LL, this.LLILLJJLI, this.LLILLL.element, this.LLILZ.getPaint()) + this.LLILZIL);
    }
}
