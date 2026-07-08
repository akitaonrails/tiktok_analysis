package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;

/* JADX INFO: renamed from: X.0nox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449410nox {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C1449430noz LJFF;
    public final String LJI;
    public final EditorProSchemeModel LJII;

    public C1449410nox(String str, String str2, String str3, String str4, String str5, C1449430noz c1449430noz) {
        this(str, str2, str3, str4, str5, c1449430noz, null, null, 128);
    }

    public C1449410nox(String str, String str2, String str3, String str4, String str5, C1449430noz c1449430noz, String str6, EditorProSchemeModel editorProSchemeModel, int i) {
        str4 = (i & 8) != 0 ? C1443560nfW.LJIIIIZZ() : str4;
        str5 = (i & 16) != 0 ? C1443560nfW.LJIIIIZZ() : str5;
        c1449430noz = (i & 32) != 0 ? null : c1449430noz;
        str6 = (i & 64) != 0 ? null : str6;
        editorProSchemeModel = (i & 128) != 0 ? null : editorProSchemeModel;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = c1449430noz;
        this.LJI = str6;
        this.LJII = editorProSchemeModel;
    }
}
