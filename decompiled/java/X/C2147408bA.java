package X;

import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2147408bA extends C09AY implements Function0<List<? extends String>> {
    public final /* synthetic */ ForceBackFYPViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147408bA(ForceBackFYPViewModel forceBackFYPViewModel) {
        super(0);
        this.LL = forceBackFYPViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        String strTag;
        List<InterfaceC1583870rJp> listLLIIII = C13LP.LLIIII(this.LL.LL.lZ1(false));
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1583870rJp interfaceC1583870rJp : listLLIIII) {
            if ((!Intrinsics.LJFF(interfaceC1583870rJp.tag(), "For You")) && (strTag = interfaceC1583870rJp.tag()) != null) {
                arrayList.add(strTag);
            }
        }
        return arrayList;
    }
}
