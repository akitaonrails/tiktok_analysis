package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Ioz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478110Ioz {
    public LinearLayoutManager LIZ;
    public List<? extends FeedItem> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(298));
    public final Map<Integer, AbstractC478120Ip0> LIZLLL;

    public C478110Ioz(EnumC477350Inl enumC477350Inl) {
        LinkedHashMap linkedHashMap;
        int i = C477360Inm.LIZ[enumC477350Inl.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    linkedHashMap = new LinkedHashMap();
                    new AbstractC478120Ip0() { // from class: X.0Ip2
                        @Override // X.AbstractC478120Ip0
                        public final EnumC478160Ip4 LIZIZ() {
                            return EnumC478160Ip4.DEFAULT;
                        }

                        @Override // X.AbstractC478120Ip0
                        public final AbstractC478270IpF LIZ(Context context) {
                            return new C478300IpI(context);
                        }
                    }.LIZJ(linkedHashMap);
                } else {
                    throw new C1954807lC();
                }
            } else {
                linkedHashMap = new LinkedHashMap();
            }
        } else {
            linkedHashMap = new LinkedHashMap();
            new AbstractC478120Ip0() { // from class: X.0Ip8
                @Override // X.AbstractC478120Ip0
                public final EnumC478160Ip4 LIZIZ() {
                    return EnumC478160Ip4.ROOM;
                }

                @Override // X.AbstractC478120Ip0
                public final AbstractC478270IpF LIZ(final Context context) {
                    return new AbstractC478270IpF(context) { // from class: X.0IpG
                        public TextView LJ;

                        @Override // X.AbstractC478270IpF
                        public final int LIZJ() {
                            return R.layout.hmq;
                        }

                        @Override // X.AbstractC478270IpF
                        public final void LJ() {
                            View view = this.LIZIZ;
                            TextView textView = view != null ? (TextView) view.findViewById(R.id.igw) : null;
                            this.LJ = textView;
                            if (textView != null) {
                                textView.setText(C497740JfY.LJIJI(2131856122));
                            }
                            TextView textView2 = this.LJ;
                            if (textView2 != null) {
                                C500260Jjc.LJLJJL(this.LIZJ, textView2);
                            }
                            AbstractC478270IpF.LIZ(this.LJ);
                        }
                    };
                }
            }.LIZJ(linkedHashMap);
            new AbstractC478120Ip0() { // from class: X.0Ip6
                @Override // X.AbstractC478120Ip0
                public final EnumC478160Ip4 LIZIZ() {
                    return EnumC478160Ip4.FREQUENTLY;
                }

                @Override // X.AbstractC478120Ip0
                public final AbstractC478270IpF LIZ(final Context context) {
                    return new AbstractC478270IpF(context) { // from class: X.0IpJ
                        public C16F5 LJ;

                        @Override // X.AbstractC478270IpF
                        public final int LIZJ() {
                            return R.layout.hmo;
                        }

                        @Override // X.AbstractC478270IpF
                        public final void LJ() {
                            View view = this.LIZIZ;
                            C16F5 c16f5 = view != null ? (C16F5) view.findViewById(R.id.ilg) : null;
                            this.LJ = c16f5;
                            if (c16f5 != null) {
                                C500260Jjc.LJLJJL(this.LIZJ, c16f5);
                            }
                            AbstractC478270IpF.LIZ(this.LJ);
                        }
                    };
                }
            }.LIZJ(linkedHashMap);
            new AbstractC478120Ip0() { // from class: X.0Ip9
                @Override // X.AbstractC478120Ip0
                public final EnumC478160Ip4 LIZIZ() {
                    return EnumC478160Ip4.U_MAY_KNOW;
                }

                @Override // X.AbstractC478120Ip0
                public final AbstractC478270IpF LIZ(final Context context) {
                    return new AbstractC478270IpF(context) { // from class: X.0IpH
                        public TextView LJ;

                        @Override // X.AbstractC478270IpF
                        public final int LIZJ() {
                            return R.layout.hmr;
                        }

                        @Override // X.AbstractC478270IpF
                        public final void LJ() {
                            View view = this.LIZIZ;
                            TextView textView = view != null ? (TextView) view.findViewById(R.id.u_may_know_title) : null;
                            this.LJ = textView;
                            if (textView != null) {
                                textView.setText(C497740JfY.LJIJI(2131856825));
                            }
                            TextView textView2 = this.LJ;
                            if (textView2 != null) {
                                C500260Jjc.LJLJJL(this.LIZJ, textView2);
                            }
                            AbstractC478270IpF.LIZ(this.LJ);
                        }
                    };
                }
            }.LIZJ(linkedHashMap);
            new AbstractC478120Ip0() { // from class: X.0Ip5
                @Override // X.AbstractC478120Ip0
                public final EnumC478160Ip4 LIZIZ() {
                    return EnumC478160Ip4.LIVE_EVENT;
                }

                @Override // X.AbstractC478120Ip0
                public final AbstractC478270IpF LIZ(final Context context) {
                    return new AbstractC478270IpF(context) { // from class: X.0IpK
                        public TextView LJ;

                        @Override // X.AbstractC478270IpF
                        public final int LIZJ() {
                            return R.layout.hmn;
                        }

                        @Override // X.AbstractC478270IpF
                        public final void LJ() {
                            View view = this.LIZIZ;
                            TextView textView = view != null ? (TextView) view.findViewById(R.id.heq) : null;
                            this.LJ = textView;
                            if (textView != null) {
                                C500260Jjc.LJLJJL(this.LIZJ, textView);
                            }
                            AbstractC478270IpF.LIZ(this.LJ);
                        }
                    };
                }
            }.LIZJ(linkedHashMap);
            new AbstractC478120Ip0() { // from class: X.0Ip7
                @Override // X.AbstractC478120Ip0
                public final EnumC478160Ip4 LIZIZ() {
                    return EnumC478160Ip4.GO_LIVE;
                }

                @Override // X.AbstractC478120Ip0
                public final AbstractC478270IpF LIZ(final Context context) {
                    return new AbstractC478270IpF(context) { // from class: X.0IpC
                        @Override // X.AbstractC478270IpF
                        public final int LIZJ() {
                            return R.layout.hmp;
                        }
                    };
                }
            }.LIZJ(linkedHashMap);
            new AbstractC478120Ip0() { // from class: X.0Ip3
                @Override // X.AbstractC478120Ip0
                public final EnumC478160Ip4 LIZIZ() {
                    return EnumC478160Ip4.MULTI_GUEST_APPLY;
                }

                @Override // X.AbstractC478120Ip0
                public final AbstractC478270IpF LIZ(Context context) {
                    return new C478300IpI(context);
                }
            }.LIZJ(linkedHashMap);
        }
        this.LIZLLL = linkedHashMap;
    }

    public final void LIZ(int i) {
        int iFindFirstVisibleItemPosition;
        int i2;
        int x;
        View viewFindViewByPosition;
        View viewFindViewByPosition2;
        int i3;
        boolean z;
        int x2;
        View viewFindViewByPosition3;
        View viewFindViewByPosition4;
        LinearLayoutManager linearLayoutManager = this.LIZ;
        int iFindLastVisibleItemPosition = -1;
        if (linearLayoutManager != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        } else {
            iFindFirstVisibleItemPosition = -1;
        }
        LinearLayoutManager linearLayoutManager2 = this.LIZ;
        if (linearLayoutManager2 != null) {
            iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        }
        for (AbstractC478120Ip0 abstractC478120Ip0 : (Set) this.LIZJ.getValue()) {
            LinearLayoutManager linearLayoutManager3 = this.LIZ;
            AbstractC478270IpF abstractC478270IpF = abstractC478120Ip0.LIZIZ;
            if (abstractC478270IpF != null) {
                C478250IpD c478250IpD = (C478250IpD) abstractC478120Ip0.LIZJ.getValue();
                int i4 = 6;
                if (abstractC478120Ip0.LIZ) {
                    C478230IpB c478230IpB = (C478230IpB) c478250IpD.LIZIZ.getValue();
                    c478230IpB.getClass();
                    if (linearLayoutManager3 != null && iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0) {
                        int i5 = c478230IpB.LIZ;
                        if (i5 >= 0 && (i2 = c478230IpB.LIZIZ) >= 0) {
                            if (i5 > iFindLastVisibleItemPosition) {
                                abstractC478270IpF.LIZLLL(false);
                            } else if (i2 < iFindFirstVisibleItemPosition) {
                                abstractC478270IpF.LIZLLL(false);
                            } else {
                                if (!LiveSkylightStyleSetting.INSTANCE.enableStyleV2()) {
                                    i4 = 19;
                                }
                                int iLIZ = C439101nJ.LIZ(i4);
                                View view = abstractC478270IpF.LIZLLL;
                                if (view != null) {
                                    x = (int) view.getX();
                                } else {
                                    x = 0;
                                }
                                int i6 = iLIZ - x;
                                if (i <= 0) {
                                    c478230IpB.LJFF = false;
                                    if (!c478230IpB.LJ && (viewFindViewByPosition = linearLayoutManager3.findViewByPosition(c478230IpB.LIZ)) != null) {
                                        c478230IpB.LIZ(viewFindViewByPosition);
                                        if (c478230IpB.LIZJ[0] + viewFindViewByPosition.getWidth() >= c478230IpB.LIZIZ() - i6) {
                                            abstractC478270IpF.LJFF();
                                            c478230IpB.LJ = true;
                                        }
                                    }
                                } else {
                                    c478230IpB.LJ = false;
                                    View viewFindViewByPosition5 = linearLayoutManager3.findViewByPosition(c478230IpB.LIZ);
                                    if (viewFindViewByPosition5 != null) {
                                        c478230IpB.LIZ(viewFindViewByPosition5);
                                        if (c478230IpB.LIZJ[0] + viewFindViewByPosition5.getWidth() < c478230IpB.LIZIZ() - viewFindViewByPosition5.getWidth()) {
                                            abstractC478270IpF.LIZLLL(false);
                                        }
                                    }
                                    if (!c478230IpB.LJFF && (viewFindViewByPosition2 = linearLayoutManager3.findViewByPosition(c478230IpB.LIZIZ)) != null) {
                                        c478230IpB.LIZ(viewFindViewByPosition2);
                                        float width = c478230IpB.LIZJ[0] + viewFindViewByPosition2.getWidth();
                                        if (width < c478230IpB.LIZIZ() && width > c478230IpB.LIZIZ() - viewFindViewByPosition2.getWidth()) {
                                            abstractC478270IpF.LJFF();
                                            c478230IpB.LJFF = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            abstractC478270IpF.LIZLLL(false);
                        }
                    } else {
                        abstractC478270IpF.LIZLLL(false);
                    }
                } else {
                    C478220IpA c478220IpA = (C478220IpA) c478250IpD.LIZ.getValue();
                    c478220IpA.getClass();
                    if (linearLayoutManager3 != null && iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0) {
                        int i7 = c478220IpA.LIZ;
                        if (i7 >= 0 && (i3 = c478220IpA.LIZIZ) >= 0) {
                            if (i7 > iFindLastVisibleItemPosition) {
                                abstractC478270IpF.LIZLLL(false);
                            } else if (i3 < iFindFirstVisibleItemPosition) {
                                abstractC478270IpF.LIZLLL(false);
                            } else {
                                if (i >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!LiveSkylightStyleSetting.INSTANCE.enableStyleV2()) {
                                    i4 = 19;
                                }
                                int iLIZ2 = C439101nJ.LIZ(i4);
                                View view2 = abstractC478270IpF.LIZLLL;
                                if (view2 != null) {
                                    x2 = (int) view2.getX();
                                } else {
                                    x2 = 0;
                                }
                                int i8 = iLIZ2 + x2;
                                if (z) {
                                    c478220IpA.LJFF = false;
                                    if (!c478220IpA.LJ && (viewFindViewByPosition3 = linearLayoutManager3.findViewByPosition(c478220IpA.LIZ)) != null) {
                                        c478220IpA.LIZ(viewFindViewByPosition3);
                                        if (c478220IpA.LIZJ[0] <= i8) {
                                            abstractC478270IpF.LJFF();
                                            c478220IpA.LJ = true;
                                        }
                                    }
                                } else {
                                    c478220IpA.LJ = false;
                                    View viewFindViewByPosition6 = linearLayoutManager3.findViewByPosition(c478220IpA.LIZ);
                                    if (viewFindViewByPosition6 != null) {
                                        c478220IpA.LIZ(viewFindViewByPosition6);
                                        if (c478220IpA.LIZJ[0] > viewFindViewByPosition6.getWidth()) {
                                            abstractC478270IpF.LIZLLL(false);
                                        }
                                    }
                                    if (!c478220IpA.LJFF && (viewFindViewByPosition4 = linearLayoutManager3.findViewByPosition(c478220IpA.LIZIZ)) != null) {
                                        c478220IpA.LIZ(viewFindViewByPosition4);
                                        int i9 = c478220IpA.LIZJ[0];
                                        if (i9 >= 0 && i9 <= viewFindViewByPosition4.getWidth()) {
                                            abstractC478270IpF.LJFF();
                                            c478220IpA.LJFF = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            abstractC478270IpF.LIZLLL(false);
                        }
                    } else {
                        abstractC478270IpF.LIZLLL(false);
                    }
                }
            }
        }
    }

    public final void LIZIZ(List<? extends FeedItem> list) {
        int i;
        int i2;
        View viewLIZIZ;
        this.LIZIZ = list;
        ((Set) this.LIZJ.getValue()).clear();
        for (Map.Entry<Integer, AbstractC478120Ip0> entry : this.LIZLLL.entrySet()) {
            AbstractC478120Ip0 value = entry.getValue();
            EnumC478160Ip4 enumC478160Ip4LIZIZ = value.LIZIZ();
            if (list != null) {
                Iterator<? extends FeedItem> it2 = list.iterator();
                int i3 = 0;
                i = -1;
                i2 = -1;
                while (true) {
                    if (it2.hasNext()) {
                        FeedItem next = it2.next();
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            FeedItem feedItem = next;
                            int i5 = feedItem.type;
                            Integer startGapType = enumC478160Ip4LIZIZ.getStartGapType();
                            if (startGapType == null || i5 != startGapType.intValue()) {
                                if (feedItem.type == enumC478160Ip4LIZIZ.getFeedType()) {
                                    if (i2 < 0) {
                                        i2 = i3;
                                    }
                                    i = i3;
                                } else if (i >= 0 && feedItem.type != enumC478160Ip4LIZIZ.getFeedType()) {
                                    break;
                                }
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        i3 = -1;
                        if (list != null) {
                            break;
                        }
                    }
                }
                if (!LiveSkylightStyleSetting.INSTANCE.enableStyleV2() && i3 >= 0) {
                    list.size();
                }
            } else {
                i = -1;
                i2 = -1;
            }
            C478250IpD c478250IpD = (C478250IpD) value.LIZJ.getValue();
            C478130Ip1 c478130Ip1 = (C478130Ip1) c478250IpD.LIZ.getValue();
            c478130Ip1.getClass();
            c478130Ip1.LIZ = i2;
            c478130Ip1.LIZIZ = i;
            C478130Ip1 c478130Ip12 = (C478130Ip1) c478250IpD.LIZIZ.getValue();
            c478130Ip12.getClass();
            c478130Ip12.LIZ = i2;
            c478130Ip12.LIZIZ = i;
            if (i2 >= 0 && i2 <= i) {
                ((Set) this.LIZJ.getValue()).add(entry.getValue());
            } else {
                AbstractC478270IpF abstractC478270IpF = entry.getValue().LIZIZ;
                if (abstractC478270IpF != null && (viewLIZIZ = abstractC478270IpF.LIZIZ()) != null && viewLIZIZ.getVisibility() == 0) {
                    C786410Ut5.LJLLLLLL(4, viewLIZIZ);
                }
            }
        }
        LIZ(0);
    }
}
