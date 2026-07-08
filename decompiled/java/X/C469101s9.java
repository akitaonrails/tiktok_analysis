package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01s9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C469101s9 extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C469101s9(int i, Context context, String str, C2252611DEt c2252611DEt) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = c2252611DEt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) throws Throwable {
        File fileLJIIJ = C1533790q13.LJIIJ(c1533790q13);
        if (fileLJIIJ != null) {
            ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
            if (iSocialAvatarDebugService != null) {
                iSocialAvatarDebugService.LJIIIIZZ();
            }
            C0VSJ c0vsj = new C0VSJ(this.LLILLL, fileLJIIJ.getName());
            C08QA.LJIILLIIL(fileLJIIJ, c0vsj, true, 4);
            InterfaceC20236714Gf<String> interfaceC20236714Gf = this.LLILZ;
            String path = c0vsj.getPath();
            C189200o6.m2constructorimpl(path);
            interfaceC20236714Gf.resumeWith(path);
            C474201sy.LIZ.getClass();
            ((C1910890zpH) C474201sy.LIZIZ.getValue()).LIZ("MixStudioShareImageUtil", "Loaded Gecko file");
        } else {
            C474201sy.LIZ.getClass();
            ((C1910890zpH) C474201sy.LIZIZ.getValue()).LIZ("MixStudioShareImageUtil", "Loading CDN file");
            String str = (String) C13LP.LJJJLZIJ(this.LL, (List) C474201sy.LIZJ.getValue());
            if (str == null) {
                InterfaceC20236714Gf<String> interfaceC20236714Gf2 = this.LLILZ;
                int i = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Index Error: ");
                sbLIZ.append(i);
                C098200Yq c098200Yq = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf2.resumeWith(c098200Yq);
            } else {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJIJL(this.LLILLJJLI);
                final InterfaceC20236714Gf<String> interfaceC20236714Gf3 = this.LLILZ;
                final String str2 = this.LLILLL;
                c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.01s8
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) throws Throwable {
                        if (bitmap == null) {
                            InterfaceC20236714Gf<String> interfaceC20236714Gf4 = interfaceC20236714Gf3;
                            C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException("Lighten loading background bitmap is null"));
                            C189200o6.m2constructorimpl(c098200Yq2);
                            interfaceC20236714Gf4.resumeWith(c098200Yq2);
                            return;
                        }
                        try {
                            C0VSJ c0vsj2 = new C0VSJ(str2, "background.webp");
                            C474201sy.LIZIZ(C474201sy.LIZ, bitmap, c0vsj2.getPath(), Bitmap.CompressFormat.WEBP);
                            InterfaceC20236714Gf<String> interfaceC20236714Gf5 = interfaceC20236714Gf3;
                            String path2 = c0vsj2.getPath();
                            C189200o6.m2constructorimpl(path2);
                            interfaceC20236714Gf5.resumeWith(path2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            InterfaceC20236714Gf<String> interfaceC20236714Gf6 = interfaceC20236714Gf3;
                            C098200Yq c098200Yq3 = new C098200Yq(new RuntimeException(e.getMessage()));
                            C189200o6.m2constructorimpl(c098200Yq3);
                            interfaceC20236714Gf6.resumeWith(c098200Yq3);
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        String message;
                        InterfaceC20236714Gf<String> interfaceC20236714Gf4 = interfaceC20236714Gf3;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Lighten loading background image failed: ");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ2.append(message);
                        C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
                        C189200o6.m2constructorimpl(c098200Yq2);
                        interfaceC20236714Gf4.resumeWith(c098200Yq2);
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
