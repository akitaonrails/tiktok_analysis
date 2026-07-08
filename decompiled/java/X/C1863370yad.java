package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863370yad implements InterfaceC1891350zJl {
    public final ConversationInfo LL;
    public final EnumC429110Gs9 LLILLJJLI;
    public final boolean LLILLL;
    public boolean LLILZ;
    public final Function1<ConversationInfo, Unit> LLILZIL;
    public final Function2<Context, ConversationInfo, Unit> LLILZLL;
    public final InterfaceC1631620sYq<Context, View, ConversationInfo, Unit> LLIZ;

    public C1863370yad() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1863370yad)) {
            return false;
        }
        C1863370yad c1863370yad = (C1863370yad) obj;
        return Intrinsics.LJFF(this.LL, c1863370yad.LL) && this.LLILLJJLI == c1863370yad.LLILLJJLI && this.LLILLL == c1863370yad.LLILLL && this.LLILZ == c1863370yad.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1863370yad.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1863370yad.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1863370yad.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Function1<ConversationInfo, Unit> function1 = this.LLILZIL;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function2<Context, ConversationInfo, Unit> function2 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        InterfaceC1631620sYq<Context, View, ConversationInfo, Unit> interfaceC1631620sYq = this.LLIZ;
        return iHashCode3 + (interfaceC1631620sYq != null ? interfaceC1631620sYq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSubConversationItem(conversation=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isHidden=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onShow=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onLongClick=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1863370yad c1863370yad;
        if (interfaceC1891350zJl instanceof C1863370yad) {
            c1863370yad = (C1863370yad) interfaceC1891350zJl;
        } else {
            c1863370yad = null;
        }
        if (c1863370yad == null || !areItemTheSame(c1863370yad) || this.LLILZ != c1863370yad.LLILZ || this.LLILLJJLI != c1863370yad.LLILLJJLI || !Intrinsics.LJFF(this.LL.conversationTitle, c1863370yad.LL.conversationTitle)) {
            return false;
        }
        ConversationInfo conversationInfo = this.LL;
        long j = conversationInfo.unreadCount;
        ConversationInfo conversationInfo2 = c1863370yad.LL;
        if (j != conversationInfo2.unreadCount || !Intrinsics.LJFF(conversationInfo.relatedVideo, conversationInfo2.relatedVideo)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1863370yad c1863370yad;
        if (interfaceC1891350zJl instanceof C1863370yad) {
            c1863370yad = (C1863370yad) interfaceC1891350zJl;
        } else {
            c1863370yad = null;
        }
        if (c1863370yad == null || !Intrinsics.LJFF(this.LL.conversationId, c1863370yad.LL.conversationId) || !Intrinsics.LJFF(this.LL.subConversationId, c1863370yad.LL.subConversationId)) {
            return false;
        }
        return true;
    }

    public C1863370yad(ConversationInfo conversationInfo, EnumC429110Gs9 enumC429110Gs9, boolean z, Function1 function1, Function2 function2, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LL = conversationInfo;
        this.LLILLJJLI = enumC429110Gs9;
        this.LLILLL = false;
        this.LLILZ = z;
        this.LLILZIL = function1;
        this.LLILZLL = function2;
        this.LLIZ = interfaceC1631620sYq;
    }
}
