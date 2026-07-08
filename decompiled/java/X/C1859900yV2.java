package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchMarkdownService;

/* JADX INFO: renamed from: X.0yV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859900yV2 implements ISearchMarkdownService {
    public static final C1859900yV2 LIZIZ = new C1859900yV2();
    public final /* synthetic */ ISearchMarkdownService LIZ = (ISearchMarkdownService) ServiceManager.get().getService(ISearchMarkdownService.class);

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final C21419418s4 LIZ(Context context) {
        return this.LIZ.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final String LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final void LIZJ(CharSequence charSequence, InterfaceC342000Daw interfaceC342000Daw, int i, int i2, StringBuilder sb, boolean z) {
        this.LIZ.LIZJ(charSequence, interfaceC342000Daw, i, i2, sb, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final void LIZLLL(Context context) {
        this.LIZ.LIZLLL(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final C21408418qI LJ(Context context, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8, int i9) {
        return this.LIZ.LJ(context, i, i2, i3, f, i4, i5, i6, i7, i8, i9);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final void LJFF(Context context, C1860130yVP c1860130yVP, int i, int i2) {
        this.LIZ.LJFF(context, c1860130yVP, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final Bitmap LJI(Context context) {
        return this.LIZ.LJI(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final C21408418qI LJII(int i, Context context) {
        return this.LIZ.LJII(i, context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchMarkdownService
    public final void LJIIIIZZ(C1860130yVP c1860130yVP, String str, C21419418s4 c21419418s4, InterfaceC328600CuQ interfaceC328600CuQ, InterfaceC328600CuQ interfaceC328600CuQ2, C0R20 c0r20, InterfaceC328580CuO interfaceC328580CuO, C0GV2 c0gv2, C0GV3 c0gv3) {
        this.LIZ.LJIIIIZZ(c1860130yVP, str, c21419418s4, interfaceC328600CuQ, interfaceC328600CuQ2, c0r20, interfaceC328580CuO, c0gv2, c0gv3);
    }
}
