package X;

import java.util.List;

/* JADX INFO: renamed from: X.0yof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872070yof extends AbstractC1871160ynC {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public String LIZ;
    public String LIZIZ;
    public InterfaceC1871820yoG LIZJ;
    public String LIZLLL;
    public InterfaceC1107590evd LJ;
    public InterfaceC1107590evd LJFF;
    public boolean LJI;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public int LJIIIZ;
    public C1872100yoi LJIIJ;
    public boolean LJIIJJI;
    public C1872110yoj LJIIL;
    public Long LJIILIIL;

    public final String LIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final String getUrl() {
        String str = this.LIZ;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // X.AbstractC1871160ynC
    public final List<String> provideParamList() {
        return C1697810uHb.LJIIJJI("url", "method", "body", "params", "header", "bodyType", "disableRedirect", "addCommonParams", "needCommonParams", "jsonFormatOption", "timeoutInterval");
    }
}
