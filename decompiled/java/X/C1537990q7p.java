package X;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0q7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537990q7p extends C09AY implements Function1<C1532310pyf, C1289590jfB<String>> {
    public final /* synthetic */ C259800zU<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537990q7p(C259800zU<String> c259800zU) {
        super(1);
        this.LL = c259800zU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final C1289590jfB<String> invoke(C1532310pyf c1532310pyf) {
        Object obj;
        String strLJFF;
        T string;
        C1532310pyf c1532310pyf2 = c1532310pyf;
        AbstractC1532350pyj<?> abstractC1532350pyjLJII = c1532310pyf2.LJII();
        if (abstractC1532350pyjLJII != null) {
            obj = abstractC1532350pyjLJII.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof File) {
            strLJFF = ((File) obj).getAbsolutePath();
        } else {
            strLJFF = c1532310pyf2.LJFF();
        }
        C259800zU<String> c259800zU = this.LL;
        if (strLJFF != null) {
            if (!Intrinsics.LJFF(c1532310pyf2.LJIIJJI, "assets") && !u.LJJIIJZLJL(strLJFF, "offline", false)) {
                C1537890q7f.LIZ.getClass();
                string = Uri.fromFile(new C0VSJ(strLJFF)).toString();
            } else {
                C1537890q7f.LIZ.getClass();
                string = new Uri.Builder().scheme("asset").authority("").path(strLJFF).build().toString();
            }
        } else {
            string = 0;
        }
        c259800zU.element = string;
        return null;
    }
}
