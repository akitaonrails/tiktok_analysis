package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gB4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155600gB4 implements InterfaceC111300bX {
    public final String LL;
    public String LLILLJJLI;
    public final MixCardModel LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155600gB4)) {
            return false;
        }
        C1155600gB4 c1155600gB4 = (C1155600gB4) obj;
        return Intrinsics.LJFF(this.LL, c1155600gB4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1155600gB4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1155600gB4.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixCardInitialData(pageId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardDataJson=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cardDslModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155600gB4() {
        this("", "{}", new MixCardModel(null, null, null, null, null, null, null, 127, null));
    }

    public C1155600gB4(String str, String str2, MixCardModel mixCardModel) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = mixCardModel;
    }
}
