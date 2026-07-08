package X;

import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215820hkC extends C09AY implements Function1<C1215810hkB, C1215810hkB> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<SignatureExtraInfo> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215820hkC(int i, String str, List list, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1215810hkB invoke(C1215810hkB c1215810hkB) {
        String str = this.LL;
        List<SignatureExtraInfo> list = this.LLILLJJLI;
        int i = this.LLILLL;
        boolean z = this.LLILZ;
        c1215810hkB.getClass();
        return new C1215810hkB(i, str, list, z);
    }
}
