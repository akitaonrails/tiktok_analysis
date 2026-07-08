package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorSearchPageAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContentPageContainerVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223500hwa extends C09AY implements Function0<List<? extends C1224840hyk>> {
    public final /* synthetic */ SelectorSearchPageAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223500hwa(SelectorSearchPageAssem selectorSearchPageAssem) {
        super(0);
        this.LL = selectorSearchPageAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C1224840hyk> invoke() {
        AssemVMLazy assemVMLazy = this.LL.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SelectorSearchPageAssem.LLJJIJIIJIL;
        Map<String, List<C1224840hyk>> map = ((SelectorContentPageContainerVM) assemVMLazy.getValue()).LLILZIL;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList);
        }
        return arrayList;
    }
}
