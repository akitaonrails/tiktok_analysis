package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965650bEh extends C09AY implements Function0<LayoutInfo> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965650bEh(C965340bEC c965340bEC) {
        super(0);
        this.LL = c965340bEC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayoutInfo invoke() {
        String strLLIIIILZ = this.LL.LLJLILLLLZIIL().LLIIIILZ();
        String layoutName = this.LL.LLJLILLLLZIIL().LJJJJZ().getLayoutName();
        Layout layoutLJJLIIIJLLLLLLLZ = this.LL.LLJLILLLLZIIL().LJJLIIIJLLLLLLLZ();
        String str = layoutLJJLIIIJLLLLLLLZ != null ? layoutLJJLIIIJLLLLLLLZ.layoutId : null;
        Layout layoutLJJLIIIJLLLLLLLZ2 = this.LL.LLJLILLLLZIIL().LJJLIIIJLLLLLLLZ();
        int i = layoutLJJLIIIJLLLLLLLZ2 != null ? layoutLJJLIIIJLLLLLLLZ2.version : 0;
        Layout layoutLJJLIIIJLLLLLLLZ3 = this.LL.LLJLILLLLZIIL().LJJLIIIJLLLLLLLZ();
        return new LayoutInfo(strLLIIIILZ, layoutName, str, i, layoutLJJLIIIJLLLLLLLZ3 != null ? layoutLJJLIIIJLLLLLLLZ3.isFloatType() : false, new C966620bGG(this.LL));
    }
}
