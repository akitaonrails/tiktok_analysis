package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E1D, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E1D extends C09AY implements Function1<C0EDQ, Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E1D(String str, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C0EDQ c0edq) {
        String resourceId;
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        ResourceItem resourceItem = c0edq.LIZ;
        if (z) {
            resourceId = resourceItem.getEffectId();
        } else {
            resourceId = resourceItem.getResourceId();
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, resourceId));
    }
}
