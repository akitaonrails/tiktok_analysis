package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.SearchVideoForLynx$SearchVideoImageMonitorListener$1;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import j27.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651010PgB extends C658730Psd {
    public C661440Px0 LLJJ;
    public final Function1<? super String, Unit> LLJJI;

    @Override // X.C658730Psd, X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) {
        s sVar;
        Aweme mAweme;
        ISearchContextAbility iSearchContextAbilityLIZJ;
        boolean z;
        C661440Px0 c661440Px0 = this.LLJJ;
        boolean z2 = false;
        if (c661440Px0 != null && (mAweme = c661440Px0.getMAweme()) != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(mAweme)) != null) {
            if (jSONObject.optBoolean("isSuccess")) {
                z = true;
            } else {
                z = false;
            }
            iSearchContextAbilityLIZJ.fe(new C641710PEz(z));
        }
        C1AGP c1agp = C1AGP.LIZ;
        C661440Px0 c661440Px02 = this.LLJJ;
        if (c661440Px02 != null) {
            sVar = c661440Px02.LLJLL;
        } else {
            sVar = null;
        }
        if (jSONObject.optBoolean("isSuccess")) {
            z2 = true;
        }
        c1agp.getClass();
        C1AGP.LJFF(sVar, jSONObject, z2, true);
        if (C07G9.LIZIZ) {
            this.LLJJI.invoke("coverload");
        }
    }

    public C651010PgB(C661440Px0 c661440Px0, AwS589S0100000_10 awS589S0100000_10) {
        Context context;
        super(0, null, null, null, false, 0.0f, 0, null, false, 1023);
        this.LLJJ = c661440Px0;
        this.LLJJI = awS589S0100000_10;
        if (c661440Px0 != null) {
            context = c661440Px0.getContext();
        } else {
            context = null;
        }
        C1205850hU7.LIZ(context, C1201120hMU.LIZ().leakOptSearch, new SearchVideoForLynx$SearchVideoImageMonitorListener$1(this), new AwS589S0100000_10(this, 160));
    }

    @Override // X.C658730Psd, X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        s sVar;
        C1AGP c1agp = C1AGP.LIZ;
        C661440Px0 c661440Px0 = this.LLJJ;
        if (c661440Px0 != null) {
            sVar = c661440Px0.LLJLL;
        } else {
            sVar = null;
        }
        c1agp.getClass();
        C1AGP.LJFF(sVar, jSONObject, z, false);
    }
}
