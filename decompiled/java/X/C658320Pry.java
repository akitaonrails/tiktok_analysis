package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658320Pry {
    public int LIZ;
    public Aweme LIZIZ;
    public Integer LIZJ;
    public String LIZLLL = "";
    public final int LJ = 1;
    public final String LJFF = "";
    public final String LJI = "";
    public Function1<? super JSONObject, Unit> LJII;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Ps1, X.0Psd] */
    public final C658350Ps1 LIZ() {
        final int i = this.LIZ;
        final Aweme aweme = this.LIZIZ;
        final Integer num = this.LIZJ;
        final String str = this.LIZLLL;
        final int i2 = this.LJ;
        ?? r1 = new C658730Psd(i, aweme, num, str, i2) { // from class: X.0Ps1
            @Override // X.C658730Psd, X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
                super.Ck(jSONObject);
                Function1<? super JSONObject, Unit> function1 = this.LLJJ.LJII;
                if (function1 != null) {
                    function1.invoke(jSONObject);
                }
            }

            @Override // X.C658730Psd, X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) throws JSONException {
                super.onImageLoaded(z, str2, jSONObject);
                this.LLJJ.getClass();
            }
        };
        r1.LLJIJIL = this.LJFF;
        r1.LLJILJIL = this.LJI;
        return r1;
    }
}
