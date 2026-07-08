package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889550Yv3 extends AbstractC891680YyU {
    public Function0<? extends List<? extends InterfaceC888500YtM>> LLIZ;

    @Override // X.AbstractC891680YyU
    public final boolean LIZ(boolean z) {
        return true;
    }

    @Override // X.AbstractC891680YyU
    public List<InterfaceC889560Yv4> getEnabledActionBtnList() {
        final C878950Ydx c878950Ydx;
        InterfaceC879010Ye3 curPageKey = getCurPageKey();
        if (!(curPageKey instanceof C878950Ydx) || (c878950Ydx = (C878950Ydx) curPageKey) == null) {
            return C13BV.INSTANCE;
        }
        final Function0<List<InterfaceC888500YtM>> selectedListGetter = getSelectedListGetter();
        final Function0<List<InterfaceC888500YtM>> selectedListGetter2 = getSelectedListGetter();
        return C1697810uHb.LJIIJJI(C19212010Ec.LIZJ.LJJIJL(c878950Ydx, getSelectedListGetter()), new InterfaceC889560Yv4(this, c878950Ydx, selectedListGetter) { // from class: X.0Yv1
            public final View LIZ;
            public final InterfaceC879010Ye3 LIZIZ;
            public final Function0<List<InterfaceC888500YtM>> LIZJ;

            @Override // X.InterfaceC889560Yv4
            public final int LIZLLL() {
                return R.attr.a1h;
            }

            @Override // X.InterfaceC889560Yv4
            public final boolean LJIIIIZZ() {
                return true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C889530Yv1)) {
                    return false;
                }
                C889530Yv1 c889530Yv1 = (C889530Yv1) obj;
                return Intrinsics.LJFF(this.LIZ, c889530Yv1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889530Yv1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c889530Yv1.LIZJ);
            }

            @Override // X.InterfaceC889560Yv4
            public final String getTag() {
                return "UnarchiveBtnWrapper";
            }

            public final int hashCode() {
                int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
                Function0<List<InterfaceC888500YtM>> function0 = this.LIZJ;
                return iHashCode + (function0 == null ? 0 : function0.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UnarchiveBtnWrapper(btnView=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", curPageKey=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", selectedListGetter=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC889560Yv4
            public final String LIZJ() {
                return C889460Yuu.LIZ(this);
            }

            @Override // X.InterfaceC889560Yv4
            public final boolean LJI() {
                return C889460Yuu.LIZIZ(this);
            }

            @Override // X.InterfaceC889560Yv4
            public final String getEnterFrom() {
                return C889460Yuu.LIZJ(this);
            }

            @Override // X.InterfaceC889560Yv4
            public final Function0<List<InterfaceC888500YtM>> LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC889560Yv4
            public final InterfaceC879010Ye3 LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC889560Yv4
            public final EnumC885270Yo9 LJIIIZ() {
                return EnumC885270Yo9.UNARCHIVE_SELECTED;
            }

            @Override // X.InterfaceC889560Yv4
            public final String LJ(Context context) {
                return context.getString(2131830263);
            }

            @Override // X.InterfaceC889560Yv4
            public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                Integer numValueOf;
                List<InterfaceC888500YtM> listInvoke;
                Function0<List<InterfaceC888500YtM>> function0 = this.LIZJ;
                if (function0 != null && (listInvoke = function0.invoke()) != null) {
                    numValueOf = Integer.valueOf(listInvoke.size());
                } else {
                    numValueOf = null;
                }
                if (C1527905yX.LIZ(numValueOf) > 99) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
                    c1389890mGx.LJIIIZ(2131830281);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
            }

            @Override // X.InterfaceC889560Yv4
            public final void LJII(int i, String str) {
                C889460Yuu.LJ(this, str, i);
            }

            {
                this.LIZ = this;
                this.LIZIZ = c878950Ydx;
                this.LIZJ = selectedListGetter;
            }
        }, new InterfaceC889560Yv4(c878950Ydx, selectedListGetter2) { // from class: X.0Yuv
            public final InterfaceC879010Ye3 LIZ;
            public final Function0<List<InterfaceC888500YtM>> LIZIZ;

            @Override // X.InterfaceC889560Yv4
            public final int LIZLLL() {
                return R.attr.a1l;
            }

            @Override // X.InterfaceC889560Yv4
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // X.InterfaceC889560Yv4
            public final EnumC885270Yo9 LJIIIZ() {
                return null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C889470Yuv)) {
                    return false;
                }
                C889470Yuv c889470Yuv = (C889470Yuv) obj;
                return Intrinsics.LJFF(this.LIZ, c889470Yuv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889470Yuv.LIZIZ);
            }

            @Override // X.InterfaceC889560Yv4
            public final String getTag() {
                return "DeleteBtnWrapper";
            }

            public final int hashCode() {
                int iHashCode = this.LIZ.hashCode() * 31;
                Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                return iHashCode + (function0 == null ? 0 : function0.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ArchiveDeleteBtnWrapper(curPageKey=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", selectedListGetter=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC889560Yv4
            public final String LIZJ() {
                List<InterfaceC888500YtM> listInvoke;
                Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                return (function0 == null || (listInvoke = function0.invoke()) == null || listInvoke.isEmpty()) ? "delete_all" : "delete_selected";
            }

            @Override // X.InterfaceC889560Yv4
            public final boolean LJI() {
                return C889460Yuu.LIZIZ(this);
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
            public final InterfaceC879010Ye3 LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC889560Yv4
            public final String LJ(Context context) {
                return context.getString(2131845354);
            }

            {
                this.LIZ = c878950Ydx;
                this.LIZIZ = selectedListGetter2;
            }

            @Override // X.InterfaceC889560Yv4
            public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                List<InterfaceC888500YtM> listInvoke;
                Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                if (function0 != null && (listInvoke = function0.invoke()) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
                    Iterator<InterfaceC888500YtM> it2 = listInvoke.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getSessionId());
                    }
                    IMChatListApi.LJJIII.getClass();
                    C885700Yoq.LIZIZ(C890330YwJ.LIZ().LJJJIL(), C889460Yuu.LIZJ(this), arrayList, this.LIZ, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                }
            }

            @Override // X.InterfaceC889560Yv4
            public final void LJII(int i, String str) {
                C889460Yuu.LJ(this, str, i);
            }
        });
    }

    @Override // X.AbstractC891680YyU
    public Function0<List<InterfaceC888500YtM>> getSelectedListGetter() {
        return this.LLIZ;
    }

    @Override // X.AbstractC891680YyU
    public void setSelectedListGetter(Function0<? extends List<? extends InterfaceC888500YtM>> function0) {
        this.LLIZ = function0;
    }

    public C889550Yv3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
