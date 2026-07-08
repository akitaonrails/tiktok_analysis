package X;

import android.view.View;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20262614Qe implements InterfaceC1911280zpu {
    public final List<InterfaceC1911280zpu> LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C20262614Qe(List<? extends InterfaceC1911280zpu> list) {
        this.LL = list;
    }

    @Override // X.InterfaceC658750Psf
    public final void Ck(JSONObject jSONObject) {
        LIZ(new AwS609S0100000_30(jSONObject, 130));
    }

    public final void LIZ(Function1<? super InterfaceC1911280zpu, Unit> function1) {
        for (InterfaceC1911280zpu interfaceC1911280zpu : this.LL) {
            if (interfaceC1911280zpu != null) {
                function1.invoke(interfaceC1911280zpu);
            }
        }
    }

    @Override // X.InterfaceC1911280zpu
    public final void LLJJLIIIJLLLLLLLZ(View view) {
        LIZ(new AwS609S0100000_30(view, 132));
    }

    @Override // X.InterfaceC1911280zpu
    public final void Oc(View view) {
        LIZ(new AwS609S0100000_30(view, 131));
    }

    @Override // X.InterfaceC658750Psf
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        LIZ(new C20262714Qf(jSONObject, str, z));
    }

    @Override // X.InterfaceC1911280zpu
    public final void qf(View view, Map<String, ? extends Object> map, Object obj) {
        LIZ(new AwS239S0300000_30(view, (View) map, (Map<String, ? extends Object>) obj, (Object) 7));
    }
}
