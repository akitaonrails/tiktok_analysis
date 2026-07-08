package X;

import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.raven.component.builtin.myna.MynaRavenUIAssem;
import com.bytedance.hybrid.spark.raven.component.builtin.myna.RavenMynaModule;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161960gLK extends C09AY implements Function0<String> {
    public final /* synthetic */ RavenMynaModule LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ FrameLayout LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ MynaRavenUIAssem LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161960gLK(RavenMynaModule ravenMynaModule, boolean z, FrameLayout frameLayout, String str, MynaRavenUIAssem mynaRavenUIAssem, boolean z2) {
        super(0);
        this.LL = ravenMynaModule;
        this.LLILLJJLI = z;
        this.LLILLL = frameLayout;
        this.LLILZ = str;
        this.LLILZIL = mynaRavenUIAssem;
        this.LLILZLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LL.instanceId);
        sbLIZ.append("] genMynaView: path=");
        sbLIZ.append(this.LLILLJJLI ? "DATA_ONLY" : "REBUILD");
        sbLIZ.append(" curH=");
        sbLIZ.append(this.LLILLL.getMeasuredHeight());
        sbLIZ.append(" minH=");
        sbLIZ.append(this.LLILLL.getMinimumHeight());
        sbLIZ.append(" presetH=");
        sbLIZ.append(this.LL.getHeight());
        sbLIZ.append("dp templateKey=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" lastKey=");
        sbLIZ.append(this.LLILZIL.LLJJJ);
        sbLIZ.append(" sameInst=");
        sbLIZ.append(this.LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
