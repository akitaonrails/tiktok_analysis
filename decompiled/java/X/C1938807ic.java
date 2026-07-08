package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.h;
import com.google.gson.n;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.07ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1938807ic extends AbstractC1938207iW {
    public final String LIZJ;
    public final C01GW LIZLLL;
    public final String LJ;

    @Override // X.AbstractC1938207iW
    public final void LIZIZ(SchemaBundle schemaBundle) {
        schemaBundle.setUrl(((Pattern) this.LIZLLL.getValue()).matcher(schemaBundle.getUrl()).replaceAll(this.LJ));
    }

    public C1938807ic(h hVar, n nVar, int i) {
        super(hVar, i);
        this.LIZJ = nVar.LJJIIZ("pattern").LJIL();
        this.LIZLLL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 0));
        this.LJ = nVar.LJJIIZ("template").LJIL();
    }
}
