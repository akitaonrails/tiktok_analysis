package X;

import com.ss.android.ugc.aweme.explore.data.ExploreChatGroupStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15T5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15T5 extends C150D {
    public final ExploreChatGroupStruct LL;

    public C15T5(ExploreChatGroupStruct exploreChatGroupStruct) {
        this.LL = exploreChatGroupStruct;
    }

    @Override // X.C150D, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C15T5 c15t5;
        ExploreChatGroupStruct exploreChatGroupStruct;
        Long l = null;
        if ((interfaceC1891350zJl instanceof C15T5) && (c15t5 = (C15T5) interfaceC1891350zJl) != null && (exploreChatGroupStruct = c15t5.LL) != null) {
            l = exploreChatGroupStruct.groupId;
        }
        return Intrinsics.LJFF(l, this.LL.groupId);
    }

    @Override // X.C150D, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C15T5 c15t5;
        ExploreChatGroupStruct exploreChatGroupStruct;
        Long l = null;
        if (interfaceC1891350zJl instanceof C15T5) {
            c15t5 = (C15T5) interfaceC1891350zJl;
        } else {
            c15t5 = null;
        }
        Long l2 = this.LL.groupId;
        if (c15t5 != null && (exploreChatGroupStruct = c15t5.LL) != null) {
            l = exploreChatGroupStruct.groupId;
        }
        return Intrinsics.LJFF(l2, l);
    }
}
