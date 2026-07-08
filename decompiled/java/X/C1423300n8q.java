package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0n8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423300n8q implements InterfaceC1423460n96<C1419590n2r, C1422880n8A, C1422890n8B> {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ Function0<TemplateCategoryData> LIZIZ;
    public final /* synthetic */ C1423760n9a LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ int LJFF;

    @Override // X.InterfaceC1423460n96
    public final void LIZ(C1422880n8A c1422880n8A) {
        boolean z;
        C1422880n8A c1422880n8A2 = c1422880n8A;
        if (c1422880n8A2.LIZ == EnumC1423060n8S.REFRESH_SAME) {
            z = true;
        } else {
            z = false;
        }
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        int i = c1422880n8A2.LIZIZ;
        String str = c1422880n8A2.LIZJ;
        long jLIZLLL = C1417710mzp.LIZLLL(this.LIZ);
        TemplateCategoryData templateCategoryDataInvoke = this.LIZIZ.invoke();
        C1423760n9a c1423760n9a = this.LIZJ;
        String str2 = c1423760n9a.LIZ;
        String str3 = c1423760n9a.LIZIZ;
        String str4 = c1422880n8A2.LJFF;
        boolean z2 = this.LIZLLL;
        int i2 = this.LJ;
        int i3 = this.LJFF;
        c1419580n2q.getClass();
        C1419580n2q.LJIIJ(z, i, str, jLIZLLL, templateCategoryDataInvoke, z2, i2, i3, str2, str3, str4);
    }

    @Override // X.InterfaceC1423460n96
    public final void LIZIZ(C1422890n8B c1422890n8B, List list) {
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        long jLIZLLL = C1417710mzp.LIZLLL(this.LIZ);
        TemplateCategoryData templateCategoryDataInvoke = this.LIZIZ.invoke();
        C1423760n9a c1423760n9a = this.LIZJ;
        String str = c1423760n9a.LIZ;
        String str2 = c1423760n9a.LIZIZ;
        String str3 = c1422890n8B.LIZIZ;
        boolean z = this.LIZLLL;
        int i = this.LJ;
        int i2 = this.LJFF;
        c1419580n2q.getClass();
        C1419580n2q.LJIIJ(true, 0, null, jLIZLLL, templateCategoryDataInvoke, z, i, i2, str, str2, str3);
    }

    public C1423300n8q(int i, int i2, long j, C1423760n9a c1423760n9a, Function0 function0, boolean z) {
        this.LIZ = j;
        this.LIZIZ = function0;
        this.LIZJ = c1423760n9a;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = i2;
    }
}
