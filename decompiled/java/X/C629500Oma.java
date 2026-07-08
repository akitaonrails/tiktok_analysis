package X;

import com.ss.android.ugc.aweme.feed.flexible.FlexibleSheetAssem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Oma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629500Oma extends C09AY implements Function1<C627680Oje, C627680Oje> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ FlexibleSheetAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629500Oma(float f, C013C c013c, int i, FlexibleSheetAssem flexibleSheetAssem) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = c013c;
        this.LLILLL = i;
        this.LLILZ = flexibleSheetAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C627680Oje invoke(C627680Oje c627680Oje) {
        C627680Oje c627680Oje2 = c627680Oje;
        c627680Oje2.LL = this.LL;
        c627680Oje2.LLILLL = this.LLILLJJLI.element;
        C629490OmZ c629490OmZ = c627680Oje2.LLILLJJLI;
        c629490OmZ.LIZJ = this.LLILLL;
        FlexibleSheetAssem flexibleSheetAssem = this.LLILZ;
        c629490OmZ.LIZ = flexibleSheetAssem.LLJJIJIL;
        c629490OmZ.LIZIZ = flexibleSheetAssem.LLJJJ;
        c629490OmZ.LIZLLL = flexibleSheetAssem.Ho();
        C629490OmZ c629490OmZ2 = c627680Oje2.LLILLJJLI;
        FlexibleSheetAssem flexibleSheetAssem2 = this.LLILZ;
        c629490OmZ2.LJ = flexibleSheetAssem2.LLJJJIL;
        c629490OmZ2.LJFF = flexibleSheetAssem2.LLJILJILJ;
        return c627680Oje2;
    }
}
