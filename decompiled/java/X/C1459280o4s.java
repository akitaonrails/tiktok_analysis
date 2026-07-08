package X;

import android.app.Activity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459280o4s extends C09AY implements Function1<C1459370o51, C1459370o51> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ AbstractC1459270o4r LLILZ;
    public final /* synthetic */ C817403Hg LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C013C LLIZ;
    public final /* synthetic */ C013C LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1459280o4s(Activity activity, C118300cf c118300cf, C118300cf c118300cf2, AbstractC1459270o4r abstractC1459270o4r, C817403Hg c817403Hg, boolean z, C013C c013c, C013C c013c2) {
        super(1);
        this.LL = activity;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = c118300cf2;
        this.LLILZ = abstractC1459270o4r;
        this.LLILZIL = c817403Hg;
        this.LLILZLL = z;
        this.LLIZ = c013c;
        this.LLIZLLLIL = c013c2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1459370o51 invoke(C1459370o51 c1459370o51) {
        boolean z;
        C1459370o51 c1459370o512 = c1459370o51;
        String string = this.LL.getString(this.LLILLJJLI.element);
        String string2 = this.LL.getString(this.LLILLL.element);
        AbstractC1459270o4r abstractC1459270o4r = this.LLILZ;
        int i = abstractC1459270o4r.LLJLLIL;
        int i2 = abstractC1459270o4r.LLJLL;
        int i3 = (int) (this.LLILZIL.element * 100);
        if (abstractC1459270o4r.U5()) {
            z = this.LLILZLL;
        } else {
            z = this.LLIZ.element;
        }
        return C1459370o51.LIZ(c1459370o512, i, i2, i3, this.LLILZLL, z, this.LLIZLLLIL.element, true, string, string2, null, 1536);
    }
}
