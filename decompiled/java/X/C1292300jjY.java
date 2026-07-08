package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292300jjY extends C09AY implements Function1<C1549320qQ6, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ File LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1292290jjX LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1292300jjY(String str, String str2, File file, String str3, C1292290jjX c1292290jjX) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = file;
        this.LLILZ = str3;
        this.LLILZIL = c1292290jjX;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1549320qQ6 c1549320qQ6) {
        String absolutePath;
        c1549320qQ6.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyPreparedSource: stage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", src=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", extractDir=");
        File file = this.LLILLL;
        if (file != null) {
            absolutePath = file.getAbsolutePath();
        } else {
            absolutePath = null;
        }
        sbLIZ.append(absolutePath);
        sbLIZ.append(", zip=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", autoPlay=");
        sbLIZ.append(this.LLILZIL.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
