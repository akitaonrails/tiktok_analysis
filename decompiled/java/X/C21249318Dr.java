package X;

import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Dr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21249318Dr extends C09AY implements Function1<String, PageInfoStack> {
    public C21249318Dr() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PageInfoStack invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        PageInfoStack.Companion.getClass();
        PageInfoStack pageInfoStack = new PageInfoStack();
        pageInfoStack.parse(str2);
        return pageInfoStack;
    }
}
