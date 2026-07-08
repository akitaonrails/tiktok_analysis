package X;

import android.widget.ImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0HMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439940HMy {
    public static final C439940HMy LIZ = new C439940HMy();

    public static void LIZ(ImageView imageView, String str, final Function0 function0) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath("tiktok_social_friends_interaction_res"));
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(c0vsj);
            c1331670kl3LJII.LJJI(imageView);
            c1331670kl3LJII.LJJJIL = new InterfaceC658750Psf() { // from class: X.0HMz
                @Override // X.InterfaceC658750Psf
                public final /* synthetic */ void Ck(JSONObject jSONObject) {
                }

                @Override // X.InterfaceC658750Psf
                public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
                    Function0<Unit> function02;
                    if (!z && (function02 = function0) != null) {
                        function02.invoke();
                    }
                }
            };
            c1331670kl3LJII.LJIIJJI();
        }
    }
}
