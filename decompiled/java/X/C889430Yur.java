package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889430Yur implements InterfaceC889560Yv4 {
    public final C878950Ydx LIZ;
    public final Function0<List<InterfaceC888500YtM>> LIZIZ;

    @Override // X.InterfaceC889560Yv4
    public final int LIZLLL() {
        return R.attr.a1h;
    }

    @Override // X.InterfaceC889560Yv4
    public final boolean LJIIIIZZ() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C889430Yur)) {
            return false;
        }
        C889430Yur c889430Yur = (C889430Yur) obj;
        return Intrinsics.LJFF(this.LIZ, c889430Yur.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889430Yur.LIZIZ);
    }

    @Override // X.InterfaceC889560Yv4
    public final String getTag() {
        return "ReadBtnWrapper";
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReadStatusChangeBtnWrapper(curPageKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedListGetter=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC889560Yv4
    public final boolean LJI() {
        List<InterfaceC888500YtM> listInvoke;
        Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
        if (function0 == null || (listInvoke = function0.invoke()) == null) {
            return false;
        }
        if (listInvoke.isEmpty()) {
            return LJIIJ();
        }
        if (C19212010Ec.LIZJ.LIZLLL()) {
            return true;
        }
        if (listInvoke.isEmpty()) {
            return false;
        }
        Iterator<InterfaceC888500YtM> it2 = listInvoke.iterator();
        while (it2.hasNext()) {
            if (C880320YgA.LIZ(it2.next().getSessionUnreadViewState())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC889560Yv4
    public final EnumC885270Yo9 LJIIIZ() {
        List<InterfaceC888500YtM> listInvoke;
        if (this.LIZ.LLILLL == FilterTabType.UNANSWERED && C19212010Ec.LIZJ.LIZLLL()) {
            return EnumC885270Yo9.UNREAD_SELECTED;
        }
        Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
        if (function0 == null || (listInvoke = function0.invoke()) == null || listInvoke.isEmpty()) {
            return LJIIJ() ? EnumC885270Yo9.READ_ALL : EnumC885270Yo9.READ_SELECTED;
        }
        if (C19212010Ec.LIZJ.LIZLLL()) {
            if (!(listInvoke instanceof Collection) || !listInvoke.isEmpty()) {
                Iterator<InterfaceC888500YtM> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    if (C880320YgA.LIZ(it2.next().getSessionUnreadViewState())) {
                    }
                }
            }
            return EnumC885270Yo9.UNREAD_SELECTED;
        }
        return EnumC885270Yo9.READ_SELECTED;
    }

    public final boolean LJIIJ() {
        if (this.LIZ.LLILLL != FilterTabType.ARCHIVE) {
            C889930Yvf c889930Yvf = C889930Yvf.LIZ;
            if ((c889930Yvf.LIZJ() != C05RV.PRO_CREATOR_INBOX || !C286680BLm.LIZ()) && (c889930Yvf.LIZJ() != C05RV.BUSINESS_INBOX || !C286670BLl.LIZ())) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC889560Yv4
    public final String LIZJ() {
        return C889460Yuu.LIZ(this);
    }

    @Override // X.InterfaceC889560Yv4
    public final String getEnterFrom() {
        return C889460Yuu.LIZJ(this);
    }

    @Override // X.InterfaceC889560Yv4
    public final Function0<List<InterfaceC888500YtM>> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC889560Yv4
    public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC889560Yv4
    public final String LJ(Context context) {
        int i = C885300YoC.LIZ[LJIIIZ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return context.getString(2131830295);
            }
            return context.getString(2131830264);
        }
        return context.getString(2131830296);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C889430Yur(C878950Ydx c878950Ydx, Function0<? extends List<? extends InterfaceC888500YtM>> function0) {
        this.LIZ = c878950Ydx;
        this.LIZIZ = function0;
    }

    @Override // X.InterfaceC889560Yv4
    public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
        EnumC885270Yo9 enumC885270Yo9LJIIIZ = LJIIIZ();
        int i = C885300YoC.LIZ[enumC885270Yo9LJIIIZ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                return;
            }
            C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC885270Yo9LJIIIZ.getBatchActionTypeMobValue());
        sbLIZ.append(" click, curPageKey: ");
        sbLIZ.append(this.LIZ);
        C1720106oR.LJI("ReadBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
        IMChatListApi.LJJIII.getClass();
        C885700Yoq.LIZ(C890330YwJ.LIZ().LJJJIL(), C889460Yuu.LIZJ(this), C13BV.INSTANCE, this.LIZ, enumC885270Yo9LJIIIZ, false, awS558S0100000_14, awS558S0100000_142, 33);
    }

    @Override // X.InterfaceC889560Yv4
    public final void LJII(int i, String str) {
        C889460Yuu.LJ(this, str, i);
    }
}
