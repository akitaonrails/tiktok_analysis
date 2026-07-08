package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.0O7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614380O7w {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC346201Wa LIZ(int i, String str, final String str2, String str3) {
        C613960O6g c613960O6gLIZ = C613940O6e.LIZ().LIZ(new C0O89(str, str2, i, str3));
        C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(str2) { // from class: X.0O7q
            public final String LIZIZ;
            public final C614260O7k LIZJ;

            @Override // X.InterfaceC614350O7t
            public final String LIZ() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC614210O7f
            public final AbstractC614250O7j LIZIZ() {
                return this.LIZJ;
            }

            {
                this.LIZIZ = str2;
                C614260O7k c614260O7k = C614260O7k.LIZIZ;
                c614260O7k.LIZ = C614270O7l.LIZIZ.LIZ | c614260O7k.LIZ;
                this.LIZJ = c614260O7k;
            }
        });
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.status_code = 0;
        C0O7F.LJFF(c613960O6gLIZ, new C614390O7x(baseResponse));
        return c613960O6gLIZ.LIZIZ();
    }
}
