package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160450gIt extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C18Z8 LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ RavenFragment<CONTEXT> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160450gIt(String str, C18Z8 c18z8, C118300cf c118300cf, int i, int i2, boolean z, int i3, String str2, RavenFragment<CONTEXT> ravenFragment) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c18z8;
        this.LLILLL = c118300cf;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = z;
        this.LLIZ = i3;
        this.LLIZLLLIL = str2;
        this.LLJ = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement restore next preDraw source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" visibility=");
        sbLIZ.append(this.LLILLJJLI.getVisibility());
        sbLIZ.append(" attempt=");
        sbLIZ.append(this.LLILLL.element);
        sbLIZ.append('/');
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" requiredChildCount=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" ready=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(" adapterCount=");
        AbstractC21673619ry adapter = this.LLILLJJLI.getAdapter();
        sbLIZ.append(adapter != null ? Integer.valueOf(adapter.getItemCount()) : null);
        sbLIZ.append(" childCount=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(" handlers=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJ.fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
