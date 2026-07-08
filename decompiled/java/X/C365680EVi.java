package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365680EVi implements InterfaceC365760EVq {
    public final /* synthetic */ List<ResourceItem> LIZ;
    public final /* synthetic */ Function1<List<? extends ResourceItem>, Unit> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C365680EVi(List<ResourceItem> list, Function1<? super List<? extends ResourceItem>, Unit> function1) {
        this.LIZ = list;
        this.LIZIZ = function1;
    }

    @Override // X.InterfaceC365760EVq
    public final void LIZ(C365690EVj c365690EVj, List<? extends ResourceItem> list) {
        if (c365690EVj == null || (!Intrinsics.LJFF(c365690EVj.LIZ, Boolean.FALSE) && (c365690EVj == null || !Intrinsics.LJFF(c365690EVj.LIZIZ, Boolean.FALSE)))) {
            this.LIZ.addAll(list);
            this.LIZIZ.invoke(this.LIZ);
        }
        C365730EVn.LIZ.LJFF(this);
    }
}
