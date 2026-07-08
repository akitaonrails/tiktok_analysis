package X;

import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OBH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBH extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OBH(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem) {
        super(0);
        this.LL = videoAuthorInfoRelationAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        C0RF0 c0rf0 = this.LL.jm().LIZLLL;
        return Boolean.valueOf(interfaceC706770RnvLJJIIJ.LJJIIJZLJL(c0rf0 != null ? c0rf0.LIZJ : null));
    }
}
