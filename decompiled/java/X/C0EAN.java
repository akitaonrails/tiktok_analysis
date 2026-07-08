package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EAN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0EAN extends C2217421BqW implements Function2<Boolean, List<? extends ResourceItem>, Unit> {
    public C0EAN(C0EAX c0eax) {
        super(2, c0eax, C0EAX.class, "onFetchItemListFinish", "onFetchItemListFinish(ZLjava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, List<? extends ResourceItem> list) {
        ((C0EAX) this.receiver).h8(bool.booleanValue(), list);
        return Unit.LIZ;
    }
}
