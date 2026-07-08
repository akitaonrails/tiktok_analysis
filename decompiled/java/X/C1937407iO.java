package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.google.gson.h;
import com.google.gson.n;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.07iO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1937407iO extends AbstractC1938007iU {
    public final String LJFF;
    public final C01GW LJI;

    @Override // X.AbstractC1938007iU
    public final boolean LIZJ(SchemaBundle schemaBundle) {
        Matcher matcher;
        String url = schemaBundle.getUrl();
        Pattern pattern = (Pattern) this.LJI.getValue();
        if (pattern != null && (matcher = pattern.matcher(url)) != null) {
            return matcher.find();
        }
        return false;
    }

    public C1937407iO(h hVar, n nVar, int i) {
        super(hVar, nVar, i);
        this.LJFF = nVar.LJJIIZ("regex").LJIL();
        this.LJI = C452501pT.LIZIZ(new AwS547S0100000_3(this, 15));
    }
}
