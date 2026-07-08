package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12Zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19777612Zq extends C19777212Zm {
    public C19777612Zq(C12Z4 c12z4) {
        super(c12z4);
    }

    public final Pair<C19784612ay, Boolean> LJIIIIZZ(String str) throws Throwable {
        C12Z5 c12z5LJJJLIIL;
        String str2;
        C19784612ay c19784612ay;
        C19820112gh.LIZ();
        if (this.LIZ.LJI.LJIJI(null, C19817012gC.LJJZ)) {
            LIZJ();
            if (C19803112dx.LJJLIIIJLLLLLLLZ(str)) {
                LJIILJJIL().LJIILIIL.LIZJ("sgtm feature flag enabled.");
                C12Z5 c12z5LJJJLIIL2 = LJI().LJJJLIIL(str);
                if (c12z5LJJJLIIL2 != null) {
                    String strLJI = c12z5LJJJLIIL2.LJI();
                    C19779712aB c19779712aBLJJIFFI = LJII().LJJIFFI(str);
                    if (c19779712aBLJJIFFI != null && (c12z5LJJJLIIL = LJI().LJJJLIIL(str)) != null && ((c19779712aBLJJIFFI.LJJIJIIJIL() && c19779712aBLJJIFFI.LJJIIZI().LJJI() == 100) || LIZJ().LJJLIIIJJIZ(str, c12z5LJJJLIIL.LJIIJ()) || (!TextUtils.isEmpty(strLJI) && strLJI.hashCode() % 100 < c19779712aBLJJIFFI.LJJIIZI().LJJI()))) {
                        c12z5LJJJLIIL2.LIZ.LJIIL().LJ();
                        if (c12z5LJJJLIIL2.LJIJJLI) {
                            LJIILJJIL().LJIILIIL.LIZJ("sgtm upload enabled in manifest.");
                            C19779712aB c19779712aBLJJIFFI2 = LJII().LJJIFFI(c12z5LJJJLIIL2.LJFF());
                            if (c19779712aBLJJIFFI2 != null && c19779712aBLJJIFFI2.LJJIJIIJIL()) {
                                String str3 = c19779712aBLJJIFFI2.LJJIIZI().zzf;
                                if (!TextUtils.isEmpty(str3)) {
                                    String str4 = c19779712aBLJJIFFI2.LJJIIZI().zzg;
                                    C19811612fK c19811612fK = LJIILJJIL().LJIILIIL;
                                    if (TextUtils.isEmpty(str4)) {
                                        str2 = "Y";
                                    } else {
                                        str2 = "N";
                                    }
                                    c19811612fK.LIZIZ(str3, "sgtm configured with upload_url, server_info", str2);
                                    if (TextUtils.isEmpty(str4)) {
                                        c19784612ay = new C19784612ay(str3);
                                    } else {
                                        HashMap map = new HashMap();
                                        map.put("x-sgtm-server-info", str4);
                                        if (!TextUtils.isEmpty(c12z5LJJJLIIL2.LJIIJ())) {
                                            map.put("x-gtm-server-preview", c12z5LJJJLIIL2.LJIIJ());
                                        }
                                        c19784612ay = new C19784612ay(str3, map);
                                    }
                                    return Pair.create(c19784612ay, Boolean.FALSE);
                                }
                            }
                        }
                    }
                }
                return Pair.create(new C19784612ay(LJIIIZ(str)), Boolean.TRUE);
            }
        }
        return Pair.create(new C19784612ay(LJIIIZ(str)), Boolean.TRUE);
    }

    public final String LJIIIZ(String str) throws Throwable {
        String strLJJIIJZLJL = LJII().LJJIIJZLJL(str);
        if (!TextUtils.isEmpty(strLJJIIJZLJL)) {
            Uri uri = UriProtector.parse(C19817012gC.LJIIZILJ.LIZ(null));
            Uri.Builder builderBuildUpon = uri.buildUpon();
            String authority = uri.getAuthority();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJIIJZLJL);
            sbLIZ.append(e3.d);
            sbLIZ.append(authority);
            builderBuildUpon.authority(C2188811AlT.LIZIZ(sbLIZ));
            return builderBuildUpon.build().toString();
        }
        return C19817012gC.LJIIZILJ.LIZ(null);
    }
}
