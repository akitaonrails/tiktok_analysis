package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import j27.s;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651020PgC extends C658730Psd {
    public final /* synthetic */ C658550PsL LLJJ;
    public final /* synthetic */ Aweme LLJJI;

    @Override // X.C658730Psd, X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) {
        boolean z;
        ISearchContextAbility iSearchContextAbilityLIZJ = C0Q3E.LIZJ(this.LLJJI);
        boolean z2 = false;
        if (jSONObject.optBoolean("isSuccess")) {
            z = true;
        } else {
            z = false;
        }
        iSearchContextAbilityLIZJ.fe(new C641710PEz(z));
        C1AGP c1agp = C1AGP.LIZ;
        s sVar = this.LLJJ.LLJJIJIL;
        if (jSONObject.optBoolean("isSuccess")) {
            z2 = true;
        }
        c1agp.getClass();
        C1AGP.LJFF(sVar, jSONObject, z2, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C651020PgC(C658550PsL c658550PsL, Aweme aweme) {
        super(0, null, null, null, false, 0.0f, 0, null, false, 1023);
        this.LLJJ = c658550PsL;
        this.LLJJI = aweme;
    }

    @Override // X.C658730Psd, X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        C1AGP c1agp = C1AGP.LIZ;
        s sVar = this.LLJJ.LLJJIJIL;
        c1agp.getClass();
        C1AGP.LJFF(sVar, jSONObject, z, false);
    }
}
