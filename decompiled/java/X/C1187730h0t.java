package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.slash.component.popup.spark.SparkPopupModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0h0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187730h0t extends AbstractC1187110gzt {
    public final Context LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public Boolean LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public String LLJIJIL;
    public final C1187810h11 LLJILJIL;

    @Override // X.AbstractC1187110gzt
    public final void LJ() {
    }

    public C1187730h0t(Context context, String str, InterfaceC1181010gq3 interfaceC1181010gq3) {
        super(interfaceC1181010gq3, str);
        this.LLILZ = context;
        this.LLJILJIL = new C1187810h11();
    }

    @Override // X.AbstractC1187110gzt
    public final void LIZLLL(C1181580gqy c1181580gqy, final InterfaceC1181010gq3 interfaceC1181010gq3, C20656615sK c20656615sK) {
        final SparkPopupModel sparkPopupModel;
        String url;
        String channel;
        Map<String, Object> mapLJ;
        if (this.LLILZ != null && (c1181580gqy instanceof SparkPopupModel) && (url = (sparkPopupModel = (SparkPopupModel) c1181580gqy).getUrl()) != null && url.length() != 0) {
            this.LLJILJIL.LIZ = Long.valueOf(System.currentTimeMillis());
            this.LLJIJIL = sparkPopupModel.getUrl();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(interfaceC1181010gq3.Pu2().LIZJ);
            sbLIZ.append('_');
            sbLIZ.append(this.LL);
            String bundle = null;
            C1192290h8F.LIZ(this, C2188811AlT.LIZIZ(sbLIZ), this.LL, false, null, null, 24);
            C1192290h8F.LIZJ(this, new AwS597S0100000_18(interfaceC1181010gq3, 984));
            this.LLJ = SystemClock.elapsedRealtime();
            this.LLJILJIL.LIZIZ = Long.valueOf(System.currentTimeMillis());
            InterfaceC1187750h0v interfaceC1187750h0vQz = interfaceC1181010gq3.Qz();
            if (interfaceC1187750h0vQz != null) {
                interfaceC1187750h0vQz.LIZLLL("update", c1181580gqy);
            }
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(sparkPopupModel.getUrl());
            SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
            if (sparkSchemaParamLJJJI != null) {
                channel = sparkSchemaParamLJJJI.getChannel();
            } else {
                channel = null;
            }
            this.LLILZLL = channel;
            if (sparkSchemaParamLJJJI != null) {
                bundle = sparkSchemaParamLJJJI.getBundle();
            }
            this.LLIZ = bundle;
            String str = this.LLILZLL;
            if (C123100dR.LIZ(str) && str != null) {
                this.LLIZLLLIL = Boolean.valueOf(C1552050qUV.LJIIZILJ(str));
            }
            sparkContext.lifecycleOwner = interfaceC1181010gq3;
            InterfaceC1187750h0v interfaceC1187750h0vQz2 = interfaceC1181010gq3.Qz();
            if (interfaceC1187750h0vQz2 == null || (mapLJ = interfaceC1187750h0vQz2.LIZJ(this.LL, new C1187790h0z(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, sparkPopupModel.getUrl(), this.LLJ, this.LLJI))) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            sparkContext.LJJLIIIJILLIZJL(mapLJ);
            sparkContext.LJJ(Fragment.class, interfaceC1181010gq3.S8());
            sparkContext.LJJJJZ(new C1209090hZL(this, 7));
            sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0h0u
                @Override // X.AbstractC1537870q7d
                public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                    InterfaceC1187750h0v interfaceC1187750h0vQz3;
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(773));
                    if (this.LLILLJJLI.LLILZIL && (interfaceC1187750h0vQz3 = interfaceC1181010gq3.Qz()) != null) {
                        SparkPopupModel sparkPopupModel2 = sparkPopupModel;
                        C1187730h0t c1187730h0t = this.LLILLJJLI;
                        String str2 = c1187730h0t.LLILZLL;
                        String str3 = c1187730h0t.LLIZ;
                        Boolean bool = c1187730h0t.LLIZLLLIL;
                        String url2 = sparkPopupModel2.getUrl();
                        C1187730h0t c1187730h0t2 = this.LLILLJJLI;
                        interfaceC1187750h0vQz3.LIZIZ(interfaceC1541990qEH, true, "success", sparkPopupModel2, new C1187790h0z(str2, str3, bool, url2, c1187730h0t2.LLJ, c1187730h0t2.LLJI));
                    }
                }

                @Override // X.AbstractC1537870q7d
                public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(772));
                    C1192290h8F.LIZJ(this.LLILLJJLI, AFwS256S0000000_18.get$arr$(997));
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                    LJJZZIII(interfaceC1541990qEH, str2);
                    InterfaceC1187750h0v interfaceC1187750h0vQz3 = interfaceC1181010gq3.Qz();
                    if (interfaceC1187750h0vQz3 != null) {
                        SparkPopupModel sparkPopupModel2 = sparkPopupModel;
                        C1187730h0t c1187730h0t = this.LLILLJJLI;
                        String str4 = c1187730h0t.LLILZLL;
                        String str5 = c1187730h0t.LLIZ;
                        Boolean bool = c1187730h0t.LLIZLLLIL;
                        String url2 = sparkPopupModel2.getUrl();
                        C1187730h0t c1187730h0t2 = this.LLILLJJLI;
                        interfaceC1187750h0vQz3.LIZIZ(interfaceC1541990qEH, false, str3, sparkPopupModel2, new C1187790h0z(str4, str5, bool, url2, c1187730h0t2.LLJ, c1187730h0t2.LLJI));
                    }
                }
            });
            final String businessData = sparkPopupModel.getBusinessData();
            sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0h10
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    C1537910q7h c1537910q7h;
                    if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                        c1537910q7h.LJIJJ = TemplateData.LJIIIIZZ(businessData);
                    }
                }
            });
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0(this) { // from class: X.0hAe
                public final AbstractC1187110gzt LIZ;

                @Override // X.InterfaceC1554220qY0
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILJJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILL(SparkPopup sparkPopup, int i) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIZILJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJI(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJJ(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIFFI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZI() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewAttachedToWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewDetachedFromWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LIZ() {
                    this.LIZ.LIZIZ(Lifecycle.Event.ON_START);
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(778));
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIIZZ() {
                    this.LIZ.LIZIZ(Lifecycle.Event.ON_STOP);
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(777));
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILLIIL() {
                    this.LIZ.LIZIZ(Lifecycle.Event.ON_RESUME);
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(780));
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJ() {
                    this.LIZ.LIZIZ(Lifecycle.Event.ON_PAUSE);
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(779));
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJII() {
                    this.LIZ.LIZIZ(Lifecycle.Event.ON_CREATE);
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(781));
                }

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJI(SparkPopup sparkPopup) {
                    this.LIZ.LIZIZ(Lifecycle.Event.ON_DESTROY);
                    C1180170goh.LIZLLL().LIZ(AFwS206S0000000_18.get$arr$(776));
                }
            });
            this.LLJI = SystemClock.elapsedRealtime();
            this.LLJILJIL.LIZJ = Long.valueOf(System.currentTimeMillis());
            sparkContext.LJJLIIIJJIZ(new C1077430e8z(c20656615sK, 2));
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = this.LLILZ;
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
            InterfaceC1187750h0v interfaceC1187750h0vQz3 = interfaceC1181010gq3.Qz();
            if (interfaceC1187750h0vQz3 != null) {
                interfaceC1187750h0vQz3.LJ(c1181580gqy, new C1187790h0z(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, sparkPopupModel.getUrl(), this.LLJ, this.LLJI));
            }
        }
    }
}
