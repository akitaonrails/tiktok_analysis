package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374720lsU {
    public static final Context LIZIZ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    public static final String LJII(UrlModel urlModel) {
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null) {
            return (String) C13LP.LJJJLL(urlList);
        }
        return null;
    }

    public static final String LIZ(Bundle bundle, String str) {
        if (bundle == null) {
            return str;
        }
        C2089008Gi c2089008Gi = new C2089008Gi(str);
        for (String str2 : bundle.keySet()) {
            c2089008Gi.LIZLLL(str2, bundle.getString(str2));
        }
        return c2089008Gi.LJ();
    }

    public static final Uri LJFF(Context context, String str) {
        return C2203008k8.LIZ(context, new C0VSJ(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public static final String LIZJ(String str, String str2, String str3, int i, BaseSharePackage baseSharePackage) throws Throwable {
        C1374960lss.LIZ.getClass();
        String str4 = str;
        if (!C10EU.LJIIIIZZ()) {
            if (str != 0) {
                int length = str.length();
                str4 = str;
                if (length != 0) {
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = "";
                    C259800zU c259800zU2 = new C259800zU();
                    c259800zU2.element = str;
                    c259800zU2.element = C1375910luP.LIZ(str2, str, str3, baseSharePackage);
                    C23250099c.LJ(C23271099x.INSTANCE, new C1349605Py(c259800zU, str2, str3, c259800zU2, true, i, null));
                    String strLJJJJJL = C621180OYa.LIZIZ.LJJJJJL(C621180OYa.LIZIZ.LJJII(i, str2, (String) c259800zU2.element), (String) c259800zU2.element);
                    Object obj = c259800zU.element;
                    if (!C703302op.LIZ((String) obj)) {
                        obj = null;
                    }
                    String str5 = (String) obj;
                    str4 = strLJJJJJL;
                    if (str5 != null) {
                        return str5;
                    }
                }
                return str4;
            }
            return "";
        }
        if (str == 0) {
            return "";
        }
        return str4;
    }

    public static AbstractC19483511Kn LJ(String str, String str2, String str3, BaseSharePackage baseSharePackage, int i) {
        BaseSharePackage baseSharePackage2 = baseSharePackage;
        if ((i & 8) != 0) {
            baseSharePackage2 = null;
        }
        return C1374960lss.LIZ(C1374960lss.LIZ, str2, str, str3, 0, baseSharePackage2, 8);
    }

    public static final void LJIIIIZZ(Context context, TokenCert tokenCert, final Function1<? super Boolean, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02) {
        if (Build.VERSION.SDK_INT < 33) {
            final Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ == null && (activityLIZ = C2214201BlK.LJFF()) == null) {
                return;
            }
            String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
            if (activityLIZ instanceof C19EG) {
                C19514711Wn.LIZIZ.LIZIZ(activityLIZ, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArr, 1)).LIZJ(new InterfaceC19515111Wr() { // from class: X.0Heu
                    @Override // X.InterfaceC19515111Wr
                    public final void onCanceled() {
                    }

                    @Override // X.InterfaceC19515111Wr
                    public final void LIZ(C0HWO... c0hwoArr) {
                        for (C0HWO c0hwo : c0hwoArr) {
                            if (c0hwo.LIZIZ != EnumC442280HVy.GRANTED) {
                                Function0<Unit> function03 = function0;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                ShareDependService.LIZ.getClass();
                                ShareDependServiceImpl.LJJJJI().LJJJI(activityLIZ, function1);
                                return;
                            }
                        }
                        Function0<Unit> function04 = function02;
                        if (function04 == null) {
                            return;
                        }
                        function04.invoke();
                    }
                });
            }
        }
    }
}
