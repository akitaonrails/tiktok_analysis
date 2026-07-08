package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14vJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20420314vJ extends C485900J3s {
    public final Function0<Long> LL;
    public final Function0<String> LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final List<C20420514vL> LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C20420314vJ(ViewGroup viewGroup, InterfaceC20420614vM interfaceC20420614vM, C20420414vK c20420414vK, Function0 function0, Function0 function02, Function0 function03) {
        super(R.layout.hat, viewGroup);
        this.LL = function0;
        this.LLILLJJLI = function02;
        this.LLILLL = function03;
        List<C20420514vL> listLJIIJJI = C1697810uHb.LJIIJJI(this.itemView.findViewById(R.id.f4b), this.itemView.findViewById(R.id.f4c), this.itemView.findViewById(R.id.f4d), this.itemView.findViewById(R.id.f4f), this.itemView.findViewById(R.id.f4g), this.itemView.findViewById(R.id.f4h));
        this.LLILZ = listLJIIJJI;
        for (C20420514vL c20420514vL : listLJIIJJI) {
            c20420514vL.setCoverViewListener(interfaceC20420614vM);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c20420514vL.getLayoutParams();
            marginLayoutParams.width = c20420414vK.LIZJ;
            marginLayoutParams.height = c20420414vK.LIZLLL;
            marginLayoutParams.setMarginStart(c20420414vK.LIZ);
            marginLayoutParams.topMargin = c20420414vK.LIZIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20420514vL);
            c20420514vL.setLayoutParams(marginLayoutParams);
            c20420514vL.setPlaybookIdGetter(this.LL);
            c20420514vL.setEditTypeGetter(this.LLILLJJLI);
            c20420514vL.setAIGenerate(this.LLILLL);
        }
    }
}
