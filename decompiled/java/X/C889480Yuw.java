package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889480Yuw extends AbstractC891680YyU {
    public Function0<? extends List<? extends InterfaceC888500YtM>> LLIZ;

    private final C878950Ydx getCurInboxPageKey() {
        InterfaceC879010Ye3 curPageKey = getCurPageKey();
        if (curPageKey instanceof C878950Ydx) {
            return (C878950Ydx) curPageKey;
        }
        return null;
    }

    @Override // X.AbstractC891680YyU
    public List<InterfaceC889560Yv4> getEnabledActionBtnList() {
        InterfaceC889560Yv4 interfaceC889560Yv4;
        final C878950Ydx curInboxPageKey = getCurInboxPageKey();
        if (curInboxPageKey == null) {
            return C13BV.INSTANCE;
        }
        int i = C880560YgY.LIZIZ[C889930Yvf.LIZ.LIZJ().ordinal()];
        if (i == 1) {
            switch (C880560YgY.LIZ[curInboxPageKey.LLILLL.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter = getSelectedListGetter();
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter2 = getSelectedListGetter();
                    return C1697810uHb.LJIIJJI(new C889430Yur(curInboxPageKey, getSelectedListGetter()), new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter) { // from class: X.0Yux
                        public final C878950Ydx LIZ;
                        public final Function0<List<InterfaceC888500YtM>> LIZIZ;

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
                            if (!(obj instanceof C889490Yux)) {
                                return false;
                            }
                            C889490Yux c889490Yux = (C889490Yux) obj;
                            return Intrinsics.LJFF(this.LIZ, c889490Yux.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889490Yux.LIZIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String getTag() {
                            return "StarBtnWrapper";
                        }

                        public final int hashCode() {
                            int iHashCode = this.LIZ.hashCode() * 31;
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            return iHashCode + (function0 == null ? 0 : function0.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("StarBtnWrapper(curPageKey=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", selectedListGetter=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final EnumC885270Yo9 LJIIIZ() {
                            List<InterfaceC888500YtM> listInvoke;
                            C0Z86 c0z86;
                            if (this.LIZ.LLILLL == FilterTabType.STARRED) {
                                return EnumC885270Yo9.UNSTAR_SELECTED;
                            }
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            if (function0 != null && (listInvoke = function0.invoke()) != null && (!listInvoke.isEmpty())) {
                                if (!listInvoke.isEmpty()) {
                                    for (InterfaceC888500YtM interfaceC888500YtM : listInvoke) {
                                        if (!(interfaceC888500YtM instanceof C0Z86) || (c0z86 = (C0Z86) interfaceC888500YtM) == null || c0z86.getShowStarIcon()) {
                                        }
                                    }
                                }
                                return EnumC885270Yo9.UNSTAR_SELECTED;
                            }
                            return EnumC885270Yo9.STAR_SELECTED;
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
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String LJ(Context context) {
                            if (LJIIIZ() == EnumC885270Yo9.UNSTAR_SELECTED) {
                                return context.getString(2131845353);
                            }
                            return context.getString(2131845268);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                            C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i2, String str) {
                            C889460Yuu.LJ(this, str, i2);
                        }
                    }, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter2) { // from class: X.0Yut
                        public final C878950Ydx LIZ;
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
                            if (!(obj instanceof C889450Yut)) {
                                return false;
                            }
                            C889450Yut c889450Yut = (C889450Yut) obj;
                            return Intrinsics.LJFF(this.LIZ, c889450Yut.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889450Yut.LIZIZ);
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
                            sbLIZ.append("DeleteBtnWrapper(curPageKey=");
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

                        public final boolean LJIIJ() {
                            Function0<List<InterfaceC888500YtM>> function0;
                            List<InterfaceC888500YtM> listInvoke;
                            return this.LIZ.LLILLL == FilterTabType.SPAM && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && (function0 = this.LIZIZ) != null && (listInvoke = function0.invoke()) != null && listInvoke.isEmpty();
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final boolean LJI() {
                            return LJIIJ() || C889460Yuu.LIZIZ(this);
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
                            if (LJIIJ()) {
                                return context.getString(2131845345);
                            }
                            return context.getString(2131845354);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
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
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("DELETE click, curPageKey: ");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(" list: ");
                                sbLIZ.append(arrayList);
                                C1720106oR.LJI("DeleteBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                                IMChatListApi.LJJIII.getClass();
                                InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                                C878950Ydx c878950Ydx = this.LIZ;
                                C885700Yoq.LIZIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, arrayList, c878950Ydx, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                            }
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i2, String str) {
                            C889460Yuu.LJ(this, str, i2);
                        }
                    });
                case 8:
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter3 = getSelectedListGetter();
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter4 = getSelectedListGetter();
                    return C1697810uHb.LJIIJJI(new C889430Yur(curInboxPageKey, getSelectedListGetter()), new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter3) { // from class: X.0Yux
                        public final C878950Ydx LIZ;
                        public final Function0<List<InterfaceC888500YtM>> LIZIZ;

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
                            if (!(obj instanceof C889490Yux)) {
                                return false;
                            }
                            C889490Yux c889490Yux = (C889490Yux) obj;
                            return Intrinsics.LJFF(this.LIZ, c889490Yux.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889490Yux.LIZIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String getTag() {
                            return "StarBtnWrapper";
                        }

                        public final int hashCode() {
                            int iHashCode = this.LIZ.hashCode() * 31;
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            return iHashCode + (function0 == null ? 0 : function0.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("StarBtnWrapper(curPageKey=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", selectedListGetter=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final EnumC885270Yo9 LJIIIZ() {
                            List<InterfaceC888500YtM> listInvoke;
                            C0Z86 c0z86;
                            if (this.LIZ.LLILLL == FilterTabType.STARRED) {
                                return EnumC885270Yo9.UNSTAR_SELECTED;
                            }
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            if (function0 != null && (listInvoke = function0.invoke()) != null && (!listInvoke.isEmpty())) {
                                if (!listInvoke.isEmpty()) {
                                    for (InterfaceC888500YtM interfaceC888500YtM : listInvoke) {
                                        if (!(interfaceC888500YtM instanceof C0Z86) || (c0z86 = (C0Z86) interfaceC888500YtM) == null || c0z86.getShowStarIcon()) {
                                        }
                                    }
                                }
                                return EnumC885270Yo9.UNSTAR_SELECTED;
                            }
                            return EnumC885270Yo9.STAR_SELECTED;
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
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String LJ(Context context) {
                            if (LJIIIZ() == EnumC885270Yo9.UNSTAR_SELECTED) {
                                return context.getString(2131845353);
                            }
                            return context.getString(2131845268);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter3;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                            C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i2, String str) {
                            C889460Yuu.LJ(this, str, i2);
                        }
                    }, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter4) { // from class: X.0Yut
                        public final C878950Ydx LIZ;
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
                            if (!(obj instanceof C889450Yut)) {
                                return false;
                            }
                            C889450Yut c889450Yut = (C889450Yut) obj;
                            return Intrinsics.LJFF(this.LIZ, c889450Yut.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889450Yut.LIZIZ);
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
                            sbLIZ.append("DeleteBtnWrapper(curPageKey=");
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

                        public final boolean LJIIJ() {
                            Function0<List<InterfaceC888500YtM>> function0;
                            List<InterfaceC888500YtM> listInvoke;
                            return this.LIZ.LLILLL == FilterTabType.SPAM && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && (function0 = this.LIZIZ) != null && (listInvoke = function0.invoke()) != null && listInvoke.isEmpty();
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final boolean LJI() {
                            return LJIIJ() || C889460Yuu.LIZIZ(this);
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
                            if (LJIIJ()) {
                                return context.getString(2131845345);
                            }
                            return context.getString(2131845354);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter4;
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
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("DELETE click, curPageKey: ");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(" list: ");
                                sbLIZ.append(arrayList);
                                C1720106oR.LJI("DeleteBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                                IMChatListApi.LJJIII.getClass();
                                InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                                C878950Ydx c878950Ydx = this.LIZ;
                                C885700Yoq.LIZIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, arrayList, c878950Ydx, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                            }
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i2, String str) {
                            C889460Yuu.LJ(this, str, i2);
                        }
                    });
                case BdTuring.TYPE_ECAF /* 9 */:
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter5 = getSelectedListGetter();
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter6 = getSelectedListGetter();
                    return C1697810uHb.LJIIJJI(new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter5) { // from class: X.0Yus
                        public final C878950Ydx LIZ;
                        public final Function0<List<InterfaceC888500YtM>> LIZIZ;

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
                            if (!(obj instanceof C889440Yus)) {
                                return false;
                            }
                            C889440Yus c889440Yus = (C889440Yus) obj;
                            return Intrinsics.LJFF(this.LIZ, c889440Yus.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889440Yus.LIZIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String getTag() {
                            return "UnspamBtnWrapper";
                        }

                        public final int hashCode() {
                            int iHashCode = this.LIZ.hashCode() * 31;
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            return iHashCode + (function0 == null ? 0 : function0.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("UnspamBtnWrapper(curPageKey=");
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
                            return !(function0 == null || (listInvoke = function0.invoke()) == null || !listInvoke.isEmpty()) || C889460Yuu.LIZIZ(this);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final EnumC885270Yo9 LJIIIZ() {
                            List<InterfaceC888500YtM> listInvoke;
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            return (function0 == null || (listInvoke = function0.invoke()) == null || listInvoke.isEmpty()) ? EnumC885270Yo9.UNSPAM_ALL : EnumC885270Yo9.UNSPAM_SELECTED;
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
                            if (LJIIIZ() == EnumC885270Yo9.UNSPAM_ALL) {
                                return context.getString(2131845347);
                            }
                            return context.getString(2131845346);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter5;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                            EnumC885270Yo9 enumC885270Yo9LJIIIZ = LJIIIZ();
                            if (enumC885270Yo9LJIIIZ == EnumC885270Yo9.UNSPAM_SELECTED) {
                                C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                                return;
                            }
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(enumC885270Yo9LJIIIZ.getBatchActionTypeMobValue());
                            sbLIZ.append(" click, curPageKey: ");
                            sbLIZ.append(this.LIZ);
                            C1720106oR.LJI("UnspamBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                            IMChatListApi.LJJIII.getClass();
                            InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                            C878950Ydx c878950Ydx = this.LIZ;
                            C885700Yoq.LIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, C13BV.INSTANCE, c878950Ydx, EnumC885270Yo9.UNSPAM_ALL, true, awS558S0100000_14, awS558S0100000_142, 33);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i2, String str) {
                            C889460Yuu.LJ(this, str, i2);
                        }
                    }, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter6) { // from class: X.0Yut
                        public final C878950Ydx LIZ;
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
                            if (!(obj instanceof C889450Yut)) {
                                return false;
                            }
                            C889450Yut c889450Yut = (C889450Yut) obj;
                            return Intrinsics.LJFF(this.LIZ, c889450Yut.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889450Yut.LIZIZ);
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
                            sbLIZ.append("DeleteBtnWrapper(curPageKey=");
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

                        public final boolean LJIIJ() {
                            Function0<List<InterfaceC888500YtM>> function0;
                            List<InterfaceC888500YtM> listInvoke;
                            return this.LIZ.LLILLL == FilterTabType.SPAM && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && (function0 = this.LIZIZ) != null && (listInvoke = function0.invoke()) != null && listInvoke.isEmpty();
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final boolean LJI() {
                            return LJIIJ() || C889460Yuu.LIZIZ(this);
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
                            if (LJIIJ()) {
                                return context.getString(2131845345);
                            }
                            return context.getString(2131845354);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter6;
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
                                int i2 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("DELETE click, curPageKey: ");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(" list: ");
                                sbLIZ.append(arrayList);
                                C1720106oR.LJI("DeleteBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                                IMChatListApi.LJJIII.getClass();
                                InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                                C878950Ydx c878950Ydx = this.LIZ;
                                C885700Yoq.LIZIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, arrayList, c878950Ydx, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                            }
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i2, String str) {
                            C889460Yuu.LJ(this, str, i2);
                        }
                    });
                default:
                    return C13BV.INSTANCE;
            }
        }
        if (i != 2) {
            if (i == 3) {
                return C13BV.INSTANCE;
            }
            throw new C1954807lC();
        }
        IMChatListApi.LJJIII.getClass();
        if (C890330YwJ.LIZ().LJJIII()) {
            final Function0<List<InterfaceC888500YtM>> selectedListGetter7 = getSelectedListGetter();
            interfaceC889560Yv4 = new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter7) { // from class: X.0Yv2
                public final C878950Ydx LIZ;
                public final Function0<List<InterfaceC888500YtM>> LIZIZ;

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
                    if (!(obj instanceof C889540Yv2)) {
                        return false;
                    }
                    C889540Yv2 c889540Yv2 = (C889540Yv2) obj;
                    return Intrinsics.LJFF(this.LIZ, c889540Yv2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889540Yv2.LIZIZ);
                }

                @Override // X.InterfaceC889560Yv4
                public final String getTag() {
                    return "ArchiveBtnWrapper";
                }

                public final int hashCode() {
                    int iHashCode = this.LIZ.hashCode() * 31;
                    Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                    return iHashCode + (function0 == null ? 0 : function0.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ArchiveBtnWrapper(curPageKey=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", selectedListGetter=");
                    sbLIZ.append(this.LIZIZ);
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
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC889560Yv4
                public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC889560Yv4
                public final EnumC885270Yo9 LJIIIZ() {
                    return EnumC885270Yo9.ARCHIVE_SELECTED;
                }

                @Override // X.InterfaceC889560Yv4
                public final String LJ(Context context) {
                    return context.getString(2131830293);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = curInboxPageKey;
                    this.LIZIZ = selectedListGetter7;
                }

                @Override // X.InterfaceC889560Yv4
                public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                    C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                }

                @Override // X.InterfaceC889560Yv4
                public final void LJII(int i2, String str) {
                    C889460Yuu.LJ(this, str, i2);
                }
            };
        } else {
            final Function0<List<InterfaceC888500YtM>> selectedListGetter8 = getSelectedListGetter();
            interfaceC889560Yv4 = new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter8) { // from class: X.0Yv0
                public final C878950Ydx LIZ;
                public final Function0<List<InterfaceC888500YtM>> LIZIZ;

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
                    if (!(obj instanceof C889520Yv0)) {
                        return false;
                    }
                    C889520Yv0 c889520Yv0 = (C889520Yv0) obj;
                    return Intrinsics.LJFF(this.LIZ, c889520Yv0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889520Yv0.LIZIZ);
                }

                @Override // X.InterfaceC889560Yv4
                public final String getTag() {
                    return "SecondaryBtnWrapper";
                }

                public final int hashCode() {
                    int iHashCode = this.LIZ.hashCode() * 31;
                    Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                    return iHashCode + (function0 == null ? 0 : function0.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SecondaryBtnWrapper(curPageKey=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", selectedListGetter=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC889560Yv4
                public final EnumC885270Yo9 LJIIIZ() {
                    return this.LIZ.LLILLL == FilterTabType.SPAM ? EnumC885270Yo9.SECONDARY_UNSPAM : EnumC885270Yo9.SECONDARY_SELECTED;
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
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC889560Yv4
                public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC889560Yv4
                public final String LJ(Context context) {
                    return context.getString(C890100Yvw.LIZIZ.LJIIIZ());
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = curInboxPageKey;
                    this.LIZIZ = selectedListGetter8;
                }

                @Override // X.InterfaceC889560Yv4
                public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                    C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                }

                @Override // X.InterfaceC889560Yv4
                public final void LJII(int i2, String str) {
                    C889460Yuu.LJ(this, str, i2);
                }
            };
        }
        int i2 = C880560YgY.LIZ[curInboxPageKey.LLILLL.ordinal()];
        if (i2 != 2 && i2 != 3) {
            switch (i2) {
                case 8:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 14:
                case 15:
                case 16:
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter9 = getSelectedListGetter();
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter10 = getSelectedListGetter();
                    return C1697810uHb.LJIIJJI(new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter9) { // from class: X.0Yut
                        public final C878950Ydx LIZ;
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
                            if (!(obj instanceof C889450Yut)) {
                                return false;
                            }
                            C889450Yut c889450Yut = (C889450Yut) obj;
                            return Intrinsics.LJFF(this.LIZ, c889450Yut.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889450Yut.LIZIZ);
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
                            sbLIZ.append("DeleteBtnWrapper(curPageKey=");
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

                        public final boolean LJIIJ() {
                            Function0<List<InterfaceC888500YtM>> function0;
                            List<InterfaceC888500YtM> listInvoke;
                            return this.LIZ.LLILLL == FilterTabType.SPAM && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && (function0 = this.LIZIZ) != null && (listInvoke = function0.invoke()) != null && listInvoke.isEmpty();
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final boolean LJI() {
                            return LJIIJ() || C889460Yuu.LIZIZ(this);
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
                            if (LJIIJ()) {
                                return context.getString(2131845345);
                            }
                            return context.getString(2131845354);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter9;
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
                                int i22 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("DELETE click, curPageKey: ");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(" list: ");
                                sbLIZ.append(arrayList);
                                C1720106oR.LJI("DeleteBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                                IMChatListApi.LJJIII.getClass();
                                InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                                C878950Ydx c878950Ydx = this.LIZ;
                                C885700Yoq.LIZIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, arrayList, c878950Ydx, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                            }
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i22, String str) {
                            C889460Yuu.LJ(this, str, i22);
                        }
                    }, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter10) { // from class: X.0Yuz
                        public final C878950Ydx LIZ;
                        public final Function0<List<InterfaceC888500YtM>> LIZIZ;

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
                            if (!(obj instanceof C889510Yuz)) {
                                return false;
                            }
                            C889510Yuz c889510Yuz = (C889510Yuz) obj;
                            return Intrinsics.LJFF(this.LIZ, c889510Yuz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889510Yuz.LIZIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String getTag() {
                            return "PrimaryBtnWrapper";
                        }

                        public final int hashCode() {
                            int iHashCode = this.LIZ.hashCode() * 31;
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            return iHashCode + (function0 == null ? 0 : function0.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("PrimaryBtnWrapper(curPageKey=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", selectedListGetter=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final EnumC885270Yo9 LJIIIZ() {
                            return this.LIZ.LLILLL == FilterTabType.SPAM ? EnumC885270Yo9.PRIMARY_UNSPAM : EnumC885270Yo9.PRIMARY_SELECTED;
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
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String LJ(Context context) {
                            return context.getString(C890100Yvw.LIZIZ.LJIIIIZZ());
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter10;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                            C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i3, String str) {
                            C889460Yuu.LJ(this, str, i3);
                        }
                    }, interfaceC889560Yv4);
                case 19:
                    if (C286680BLm.LIZ()) {
                        final Function0<List<InterfaceC888500YtM>> selectedListGetter11 = getSelectedListGetter();
                        final Function0<List<InterfaceC888500YtM>> selectedListGetter12 = getSelectedListGetter();
                        return C1697810uHb.LJIIJJI(new C889430Yur(curInboxPageKey, getSelectedListGetter()), new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter11) { // from class: X.0Yuz
                            public final C878950Ydx LIZ;
                            public final Function0<List<InterfaceC888500YtM>> LIZIZ;

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
                                if (!(obj instanceof C889510Yuz)) {
                                    return false;
                                }
                                C889510Yuz c889510Yuz = (C889510Yuz) obj;
                                return Intrinsics.LJFF(this.LIZ, c889510Yuz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889510Yuz.LIZIZ);
                            }

                            @Override // X.InterfaceC889560Yv4
                            public final String getTag() {
                                return "PrimaryBtnWrapper";
                            }

                            public final int hashCode() {
                                int iHashCode = this.LIZ.hashCode() * 31;
                                Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                                return iHashCode + (function0 == null ? 0 : function0.hashCode());
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("PrimaryBtnWrapper(curPageKey=");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(", selectedListGetter=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            @Override // X.InterfaceC889560Yv4
                            public final EnumC885270Yo9 LJIIIZ() {
                                return this.LIZ.LLILLL == FilterTabType.SPAM ? EnumC885270Yo9.PRIMARY_UNSPAM : EnumC885270Yo9.PRIMARY_SELECTED;
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
                                return this.LIZIZ;
                            }

                            @Override // X.InterfaceC889560Yv4
                            public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                                return this.LIZ;
                            }

                            @Override // X.InterfaceC889560Yv4
                            public final String LJ(Context context) {
                                return context.getString(C890100Yvw.LIZIZ.LJIIIIZZ());
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.LIZ = curInboxPageKey;
                                this.LIZIZ = selectedListGetter11;
                            }

                            @Override // X.InterfaceC889560Yv4
                            public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                                C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                            }

                            @Override // X.InterfaceC889560Yv4
                            public final void LJII(int i3, String str) {
                                C889460Yuu.LJ(this, str, i3);
                            }
                        }, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter12) { // from class: X.0Yut
                            public final C878950Ydx LIZ;
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
                                if (!(obj instanceof C889450Yut)) {
                                    return false;
                                }
                                C889450Yut c889450Yut = (C889450Yut) obj;
                                return Intrinsics.LJFF(this.LIZ, c889450Yut.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889450Yut.LIZIZ);
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
                                sbLIZ.append("DeleteBtnWrapper(curPageKey=");
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

                            public final boolean LJIIJ() {
                                Function0<List<InterfaceC888500YtM>> function0;
                                List<InterfaceC888500YtM> listInvoke;
                                return this.LIZ.LLILLL == FilterTabType.SPAM && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && (function0 = this.LIZIZ) != null && (listInvoke = function0.invoke()) != null && listInvoke.isEmpty();
                            }

                            @Override // X.InterfaceC889560Yv4
                            public final boolean LJI() {
                                return LJIIJ() || C889460Yuu.LIZIZ(this);
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
                                if (LJIIJ()) {
                                    return context.getString(2131845345);
                                }
                                return context.getString(2131845354);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                this.LIZ = curInboxPageKey;
                                this.LIZIZ = selectedListGetter12;
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
                                    int i22 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("DELETE click, curPageKey: ");
                                    sbLIZ.append(this.LIZ);
                                    sbLIZ.append(" list: ");
                                    sbLIZ.append(arrayList);
                                    C1720106oR.LJI("DeleteBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                                    IMChatListApi.LJJIII.getClass();
                                    InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                                    C878950Ydx c878950Ydx = this.LIZ;
                                    C885700Yoq.LIZIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, arrayList, c878950Ydx, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                                }
                            }

                            @Override // X.InterfaceC889560Yv4
                            public final void LJII(int i22, String str) {
                                C889460Yuu.LJ(this, str, i22);
                            }
                        });
                    }
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter13 = getSelectedListGetter();
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter14 = getSelectedListGetter();
                    final Function0<List<InterfaceC888500YtM>> selectedListGetter15 = getSelectedListGetter();
                    return C1697810uHb.LJIIJJI(new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter13) { // from class: X.0Yuy
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
                            if (!(obj instanceof C889500Yuy)) {
                                return false;
                            }
                            C889500Yuy c889500Yuy = (C889500Yuy) obj;
                            return Intrinsics.LJFF(this.LIZ, c889500Yuy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889500Yuy.LIZIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String getTag() {
                            return "MuteBtnWrapper";
                        }

                        public final int hashCode() {
                            int iHashCode = this.LIZ.hashCode() * 31;
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            return iHashCode + (function0 == null ? 0 : function0.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("MuteBtnWrapper(curPageKey=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", selectedListGetter=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final EnumC885270Yo9 LJIIIZ() {
                            List<InterfaceC888500YtM> listInvoke;
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            if (function0 != null && (listInvoke = function0.invoke()) != null && !listInvoke.isEmpty()) {
                                if (!listInvoke.isEmpty()) {
                                    Iterator<InterfaceC888500YtM> it2 = listInvoke.iterator();
                                    while (it2.hasNext()) {
                                        if (!it2.next().isMute()) {
                                        }
                                    }
                                }
                                return EnumC885270Yo9.UNMUTE_SELECTED;
                            }
                            return EnumC885270Yo9.MUTE_SELECTED;
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
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String LJ(Context context) {
                            if (LJIIIZ() == EnumC885270Yo9.MUTE_SELECTED) {
                                return context.getString(2131845316);
                            }
                            return context.getString(2131830236);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter13;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                            C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i3, String str) {
                            C889460Yuu.LJ(this, str, i3);
                        }
                    }, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter14) { // from class: X.0Yuz
                        public final C878950Ydx LIZ;
                        public final Function0<List<InterfaceC888500YtM>> LIZIZ;

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
                            if (!(obj instanceof C889510Yuz)) {
                                return false;
                            }
                            C889510Yuz c889510Yuz = (C889510Yuz) obj;
                            return Intrinsics.LJFF(this.LIZ, c889510Yuz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889510Yuz.LIZIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String getTag() {
                            return "PrimaryBtnWrapper";
                        }

                        public final int hashCode() {
                            int iHashCode = this.LIZ.hashCode() * 31;
                            Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                            return iHashCode + (function0 == null ? 0 : function0.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("PrimaryBtnWrapper(curPageKey=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", selectedListGetter=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final EnumC885270Yo9 LJIIIZ() {
                            return this.LIZ.LLILLL == FilterTabType.SPAM ? EnumC885270Yo9.PRIMARY_UNSPAM : EnumC885270Yo9.PRIMARY_SELECTED;
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
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final String LJ(Context context) {
                            return context.getString(C890100Yvw.LIZIZ.LJIIIIZZ());
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter14;
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                            C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i3, String str) {
                            C889460Yuu.LJ(this, str, i3);
                        }
                    }, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter15) { // from class: X.0Yut
                        public final C878950Ydx LIZ;
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
                            if (!(obj instanceof C889450Yut)) {
                                return false;
                            }
                            C889450Yut c889450Yut = (C889450Yut) obj;
                            return Intrinsics.LJFF(this.LIZ, c889450Yut.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889450Yut.LIZIZ);
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
                            sbLIZ.append("DeleteBtnWrapper(curPageKey=");
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

                        public final boolean LJIIJ() {
                            Function0<List<InterfaceC888500YtM>> function0;
                            List<InterfaceC888500YtM> listInvoke;
                            return this.LIZ.LLILLL == FilterTabType.SPAM && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && (function0 = this.LIZIZ) != null && (listInvoke = function0.invoke()) != null && listInvoke.isEmpty();
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final boolean LJI() {
                            return LJIIJ() || C889460Yuu.LIZIZ(this);
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
                            if (LJIIJ()) {
                                return context.getString(2131845345);
                            }
                            return context.getString(2131845354);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LIZ = curInboxPageKey;
                            this.LIZIZ = selectedListGetter15;
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
                                int i22 = C2187451AjH.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("DELETE click, curPageKey: ");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(" list: ");
                                sbLIZ.append(arrayList);
                                C1720106oR.LJI("DeleteBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                                IMChatListApi.LJJIII.getClass();
                                InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                                C878950Ydx c878950Ydx = this.LIZ;
                                C885700Yoq.LIZIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, arrayList, c878950Ydx, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                            }
                        }

                        @Override // X.InterfaceC889560Yv4
                        public final void LJII(int i22, String str) {
                            C889460Yuu.LJ(this, str, i22);
                        }
                    });
                default:
                    return C13BV.INSTANCE;
            }
        }
        if (C286680BLm.LIZ()) {
            final Function0<List<InterfaceC888500YtM>> selectedListGetter16 = getSelectedListGetter();
            return C1697810uHb.LJIIJJI(new C889430Yur(curInboxPageKey, getSelectedListGetter()), interfaceC889560Yv4, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter16) { // from class: X.0Yut
                public final C878950Ydx LIZ;
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
                    if (!(obj instanceof C889450Yut)) {
                        return false;
                    }
                    C889450Yut c889450Yut = (C889450Yut) obj;
                    return Intrinsics.LJFF(this.LIZ, c889450Yut.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889450Yut.LIZIZ);
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
                    sbLIZ.append("DeleteBtnWrapper(curPageKey=");
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

                public final boolean LJIIJ() {
                    Function0<List<InterfaceC888500YtM>> function0;
                    List<InterfaceC888500YtM> listInvoke;
                    return this.LIZ.LLILLL == FilterTabType.SPAM && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && (function0 = this.LIZIZ) != null && (listInvoke = function0.invoke()) != null && listInvoke.isEmpty();
                }

                @Override // X.InterfaceC889560Yv4
                public final boolean LJI() {
                    return LJIIJ() || C889460Yuu.LIZIZ(this);
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
                    if (LJIIJ()) {
                        return context.getString(2131845345);
                    }
                    return context.getString(2131845354);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = curInboxPageKey;
                    this.LIZIZ = selectedListGetter16;
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
                        int i22 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DELETE click, curPageKey: ");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(" list: ");
                        sbLIZ.append(arrayList);
                        C1720106oR.LJI("DeleteBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                        IMChatListApi.LJJIII.getClass();
                        InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                        C878950Ydx c878950Ydx = this.LIZ;
                        C885700Yoq.LIZIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, arrayList, c878950Ydx, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                    }
                }

                @Override // X.InterfaceC889560Yv4
                public final void LJII(int i22, String str) {
                    C889460Yuu.LJ(this, str, i22);
                }
            });
        }
        final Function0<List<InterfaceC888500YtM>> selectedListGetter17 = getSelectedListGetter();
        final Function0<List<InterfaceC888500YtM>> selectedListGetter18 = getSelectedListGetter();
        return C1697810uHb.LJIIJJI(new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter17) { // from class: X.0Yuy
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
                if (!(obj instanceof C889500Yuy)) {
                    return false;
                }
                C889500Yuy c889500Yuy = (C889500Yuy) obj;
                return Intrinsics.LJFF(this.LIZ, c889500Yuy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889500Yuy.LIZIZ);
            }

            @Override // X.InterfaceC889560Yv4
            public final String getTag() {
                return "MuteBtnWrapper";
            }

            public final int hashCode() {
                int iHashCode = this.LIZ.hashCode() * 31;
                Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                return iHashCode + (function0 == null ? 0 : function0.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MuteBtnWrapper(curPageKey=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", selectedListGetter=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC889560Yv4
            public final EnumC885270Yo9 LJIIIZ() {
                List<InterfaceC888500YtM> listInvoke;
                Function0<List<InterfaceC888500YtM>> function0 = this.LIZIZ;
                if (function0 != null && (listInvoke = function0.invoke()) != null && !listInvoke.isEmpty()) {
                    if (!listInvoke.isEmpty()) {
                        Iterator<InterfaceC888500YtM> it2 = listInvoke.iterator();
                        while (it2.hasNext()) {
                            if (!it2.next().isMute()) {
                            }
                        }
                    }
                    return EnumC885270Yo9.UNMUTE_SELECTED;
                }
                return EnumC885270Yo9.MUTE_SELECTED;
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
                return this.LIZIZ;
            }

            @Override // X.InterfaceC889560Yv4
            public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC889560Yv4
            public final String LJ(Context context) {
                if (LJIIIZ() == EnumC885270Yo9.MUTE_SELECTED) {
                    return context.getString(2131845316);
                }
                return context.getString(2131830236);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = curInboxPageKey;
                this.LIZIZ = selectedListGetter17;
            }

            @Override // X.InterfaceC889560Yv4
            public final void LJFF(AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
                C889460Yuu.LIZLLL(this, awS558S0100000_14, awS558S0100000_142);
            }

            @Override // X.InterfaceC889560Yv4
            public final void LJII(int i3, String str) {
                C889460Yuu.LJ(this, str, i3);
            }
        }, interfaceC889560Yv4, new InterfaceC889560Yv4(curInboxPageKey, selectedListGetter18) { // from class: X.0Yut
            public final C878950Ydx LIZ;
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
                if (!(obj instanceof C889450Yut)) {
                    return false;
                }
                C889450Yut c889450Yut = (C889450Yut) obj;
                return Intrinsics.LJFF(this.LIZ, c889450Yut.LIZ) && Intrinsics.LJFF(this.LIZIZ, c889450Yut.LIZIZ);
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
                sbLIZ.append("DeleteBtnWrapper(curPageKey=");
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

            public final boolean LJIIJ() {
                Function0<List<InterfaceC888500YtM>> function0;
                List<InterfaceC888500YtM> listInvoke;
                return this.LIZ.LLILLL == FilterTabType.SPAM && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && (function0 = this.LIZIZ) != null && (listInvoke = function0.invoke()) != null && listInvoke.isEmpty();
            }

            @Override // X.InterfaceC889560Yv4
            public final boolean LJI() {
                return LJIIJ() || C889460Yuu.LIZIZ(this);
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
                if (LJIIJ()) {
                    return context.getString(2131845345);
                }
                return context.getString(2131845354);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = curInboxPageKey;
                this.LIZIZ = selectedListGetter18;
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
                    int i22 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DELETE click, curPageKey: ");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(" list: ");
                    sbLIZ.append(arrayList);
                    C1720106oR.LJI("DeleteBtnWrapper", C2188811AlT.LIZIZ(sbLIZ));
                    IMChatListApi.LJJIII.getClass();
                    InterfaceC884180YmO interfaceC884180YmOLJJJIL = C890330YwJ.LIZ().LJJJIL();
                    C878950Ydx c878950Ydx = this.LIZ;
                    C885700Yoq.LIZIZ(interfaceC884180YmOLJJJIL, c878950Ydx.LLILLJJLI, arrayList, c878950Ydx, awS558S0100000_14, awS558S0100000_142, arrayList.isEmpty());
                }
            }

            @Override // X.InterfaceC889560Yv4
            public final void LJII(int i22, String str) {
                C889460Yuu.LJ(this, str, i22);
            }
        });
    }

    @Override // X.AbstractC891680YyU
    public Function0<List<InterfaceC888500YtM>> getSelectedListGetter() {
        return this.LLIZ;
    }

    @Override // X.AbstractC891680YyU
    public final boolean LIZ(boolean z) {
        FilterTabType filterTabType;
        List<InterfaceC888500YtM> listInvoke;
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        C05RV c05rvLIZJ = c889930Yvf.LIZJ();
        if (c05rvLIZJ != C05RV.PRO_CREATOR_INBOX || !C286680BLm.LIZ()) {
            C05RV c05rvLIZJ2 = c889930Yvf.LIZJ();
            C05RV c05rv = C05RV.BUSINESS_INBOX;
            if (c05rvLIZJ2 != c05rv || !C286670BLl.LIZ()) {
                Function0<List<InterfaceC888500YtM>> selectedListGetter = getSelectedListGetter();
                if (selectedListGetter != null && (listInvoke = selectedListGetter.invoke()) != null && listInvoke.size() > 0) {
                    return true;
                }
                if (!z) {
                    C878950Ydx curInboxPageKey = getCurInboxPageKey();
                    if (curInboxPageKey != null) {
                        filterTabType = curInboxPageKey.LLILLL;
                    } else {
                        filterTabType = null;
                    }
                    if (filterTabType == FilterTabType.SPAM && c05rvLIZJ == c05rv) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }
        if (!z) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC891680YyU
    public void setSelectedListGetter(Function0<? extends List<? extends InterfaceC888500YtM>> function0) {
        this.LLIZ = function0;
    }

    public C889480Yuw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
