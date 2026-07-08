package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014660cVk extends AbstractC1023470cjx {
    public final AwemeRawAd LIZ;
    public final AnoleComponentModel LIZIZ;
    public final String LIZJ;
    public final C1023630ckD<?>[] LIZLLL;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZLLL;
    }

    public C1014660cVk(AwemeRawAd awemeRawAd, AnoleComponentModel anoleComponentModel) {
        super(awemeRawAd, anoleComponentModel);
        this.LIZ = awemeRawAd;
        this.LIZIZ = anoleComponentModel;
        this.LIZJ = C1014230cV3.LIZ("scene_anole_format");
        C1014670cVl.LIZ.getClass();
        this.LIZLLL = new C1023630ckD[]{new C1023630ckD<>(C1014670cVl.LIZIZ, new AwS595S0100000_16(this, 365)), new C1023630ckD<>(C1014670cVl.LIZLLL, new AwS595S0100000_16(this, 366)), new C1023630ckD<>(C1014670cVl.LIZJ, new AwS595S0100000_16(this, 367)), new C1023630ckD<>(C1014670cVl.LJ, new AwS595S0100000_16(this, 368)), new C1023630ckD<>(C1014670cVl.LJFF, new AwS595S0100000_16(this, 369)), new C1023630ckD<>(C1014670cVl.LJI, new AwS595S0100000_16(this, 370))};
    }
}
