package X;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676950Qgv extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C676950Qgv(String str, Integer num, View view, float f, float f2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = num;
        this.LLILLL = view;
        this.LLILZ = f;
        this.LLILZIL = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" scene=HeaderTranslation scrollY=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" headerHeight=");
        sbLIZ.append(this.LLILLL.getHeight());
        sbLIZ.append(" oldTranslationY=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" newTranslationY=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" viewPagerUserInputEnabled=");
        sbLIZ.append(this.LLILZIL > (-((float) this.LLILLL.getHeight())));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
