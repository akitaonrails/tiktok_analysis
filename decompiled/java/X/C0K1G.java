package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SOPBriefInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SOPLBriefInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SubOnlyPlaylistsBriefInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SubOnlyPostsBriefInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS285S0300000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.text.a0;
import webcast.api.pgc_sub.PGCSubSpaceInfo;

/* JADX INFO: renamed from: X.0K1G, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1G extends C0K1I<C0K0S> {
    public final Function0<Unit> LLILLJJLI;
    public final LinearLayout LLILLL;
    public final ImageView LLILZ;
    public final ViewGroup LLILZIL;
    public final TextView LLILZLL;
    public final C197039127h LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    @Override // X.AbstractC339560DSw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(X.InterfaceC339570DSx r9) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K1G.I5(X.0DSx):void");
    }

    public C0K1G(View view, Function0<Unit> function0) {
        super(view);
        this.LLILLJJLI = function0;
        this.LLILLL = (LinearLayout) view.findViewById(R.id.q8y);
        this.LLILZ = (ImageView) view.findViewById(R.id.cto);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.uj7);
        this.LLILZLL = (TextView) view.findViewById(R.id.ujc);
        this.LLIZ = (C197039127h) view.findViewById(R.id.qg2);
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [X.0K1J] */
    public final C510550K0n R5(C510630K0v c510630K0v, C0K0S c0k0s) {
        FrameLayout extraBottomContainer;
        ArrayList arrayList;
        List<SOPLBriefInfo> list;
        FrameLayout extraBottomContainer2;
        final ArrayList arrayList2;
        ArrayList arrayList3;
        final Long lValueOf;
        final String secUid;
        List<SOVBriefInfo> list2;
        int i;
        int i2;
        List<SOPBriefInfo> list3;
        int i3;
        int i4;
        FrameLayout extraBottomContainer3;
        SpaceActivityIndicator spaceActivityIndicator;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C510550K0n c510550K0n = new C510550K0n(this.itemView.getContext(), null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) C511520K4g.LIZ(8.0f);
        layoutParams.bottomMargin = (int) C511520K4g.LIZ(8.0f);
        layoutParams.setMarginStart((int) C511520K4g.LIZ(16.0f));
        boolean z = c510630K0v instanceof C510560K0o;
        if (z && ((i5 = ((C510560K0o) c510630K0v).LJI) == 1 || i5 == 3)) {
            layoutParams.setMarginEnd((int) C511520K4g.LIZ(0.0f));
            ViewGroup.LayoutParams layoutParams2 = c510550K0n.getIconArrow().getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMarginEnd((int) C511520K4g.LIZ(16.0f));
            }
            C786410Ut5.c6(c510550K0n.getIconArrow(), layoutParams2);
        } else {
            layoutParams.setMarginEnd((int) C511520K4g.LIZ(16.0f));
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c510550K0n);
        c510550K0n.setLayoutParams(layoutParams);
        C417410GYh icon = c510550K0n.getIcon();
        ViewGroup.LayoutParams layoutParams3 = icon.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.width = (int) C511520K4g.LIZ(44.0f);
            layoutParams3.height = (int) C511520K4g.LIZ(44.0f);
            C786410Ut5.W5(icon, layoutParams3);
            c510550K0n.setUIData(c510630K0v);
            if (z) {
                C510560K0o c510560K0o = (C510560K0o) c510630K0v;
                if (c510560K0o.LJI == 2 && (extraBottomContainer3 = c510550K0n.getExtraBottomContainer()) != null) {
                    extraBottomContainer3.setClipToPadding(false);
                    PGCSubSpaceInfo pGCSubSpaceInfo = c510560K0o.LIZIZ.spaceInfo;
                    if (pGCSubSpaceInfo != null && (spaceActivityIndicator = pGCSubSpaceInfo.spaceActivityIndicator) != null && (!spaceActivityIndicator.spaceActivityInfoList.isEmpty())) {
                        C0K1P c0k1p = new C0K1P(c510550K0n.getContext(), null, 6);
                        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, -2);
                        c0k1p.LIZIZ(new C0K1Q() { // from class: X.0K1U
                        }, true);
                        c0k1p.LIZJ(spaceActivityIndicator, AFwS193S0000000_7.get$arr$(310));
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0k1p);
                        c0k1p.setLayoutParams(layoutParams4);
                        extraBottomContainer3.setClipToPadding(false);
                        extraBottomContainer3.addView(c0k1p);
                    }
                }
                if (c510560K0o.LJI == 1 && (extraBottomContainer2 = c510550K0n.getExtraBottomContainer()) != null) {
                    final C0DLW c0dlw = new C0DLW(c510550K0n.getContext());
                    ViewGroup.LayoutParams layoutParams5 = new ViewGroup.LayoutParams(-1, -2);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0dlw);
                    c0dlw.setLayoutParams(layoutParams5);
                    SubOnlyPostsBriefInfo subOnlyPostsBriefInfo = c510560K0o.LIZIZ.subOnlyPostsBriefInfo;
                    if (subOnlyPostsBriefInfo != null && (list3 = subOnlyPostsBriefInfo.sopBriefInfo) != null) {
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                        for (SOPBriefInfo sOPBriefInfo : list3) {
                            if (!C0K7G.LIZIZ() && C0K7G.LIZ()) {
                                i3 = 90;
                            } else {
                                i3 = 109;
                            }
                            if (!C0K7G.LIZIZ() && C0K7G.LIZ()) {
                                i4 = 124;
                            } else {
                                i4 = 150;
                            }
                            arrayList2.add(new C0K1K(null, sOPBriefInfo, i3, i4, c510560K0o.LIZIZ));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = c510560K0o.LIZIZ.subOnlyVideosBriefInfo;
                    if (subOnlyVideosBriefInfo != null && (list2 = subOnlyVideosBriefInfo.sovBriefInfo) != null) {
                        arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        for (SOVBriefInfo sOVBriefInfo : list2) {
                            if (!C0K7G.LIZIZ() && C0K7G.LIZ()) {
                                i = 90;
                            } else {
                                i = 109;
                            }
                            if (!C0K7G.LIZIZ() && C0K7G.LIZ()) {
                                i2 = 124;
                            } else {
                                i2 = 150;
                            }
                            arrayList3.add(new C0K1K(sOVBriefInfo, null, i, i2, c510560K0o.LIZIZ));
                        }
                    } else {
                        arrayList3 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = arrayList3;
                    }
                    User user = c510560K0o.LIZIZ.anchorDetail;
                    if (user != null) {
                        lValueOf = Long.valueOf(user.getId());
                    } else {
                        lValueOf = null;
                    }
                    User user2 = c510560K0o.LIZIZ.anchorDetail;
                    if (user2 != null) {
                        secUid = user2.getSecUid();
                    } else {
                        secUid = null;
                    }
                    if (arrayList2 != null) {
                        c0dlw.LL.setAdapter(new C0K1L(new C0K1V() { // from class: X.0K1J
                            @Override // X.C0K1V
                            public final void LIZ(int i6) {
                                String str;
                                String str2;
                                SOVBriefInfo sOVBriefInfo2 = ((C0K1K) ListProtector.get(arrayList2, i6)).LIZ;
                                if (sOVBriefInfo2 != null && (str2 = sOVBriefInfo2.awemeId) != null) {
                                    C0DLW c0dlw2 = c0dlw;
                                    Long l = lValueOf;
                                    String str3 = secUid;
                                    C0K1Z c0k1z = C0K1Z.LIZ;
                                    Context context = c0dlw2.getContext();
                                    c0k1z.getClass();
                                    C0K1Z.LIZIZ(context, l, str2, str3);
                                }
                                SOPBriefInfo sOPBriefInfo2 = ((C0K1K) ListProtector.get(arrayList2, i6)).LIZIZ;
                                if (sOPBriefInfo2 != null && (str = sOPBriefInfo2.awemeId) != null) {
                                    C0DLW c0dlw3 = c0dlw;
                                    Long l2 = lValueOf;
                                    String str4 = secUid;
                                    C0K1Z c0k1z2 = C0K1Z.LIZ;
                                    Context context2 = c0dlw3.getContext();
                                    c0k1z2.getClass();
                                    C0K1Z.LIZIZ(context2, l2, str, str4);
                                }
                            }
                        }, arrayList2, lValueOf));
                    }
                    extraBottomContainer2.addView(c0dlw);
                }
                if (c510560K0o.LJI == 3 && (extraBottomContainer = c510550K0n.getExtraBottomContainer()) != null) {
                    C06ST c06st = new C06ST(c510550K0n.getContext());
                    ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -2);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c06st);
                    c06st.setLayoutParams(layoutParams6);
                    SubOnlyPlaylistsBriefInfo subOnlyPlaylistsBriefInfo = c510560K0o.LIZIZ.subOnlyPlaylistsBriefInfo;
                    if (subOnlyPlaylistsBriefInfo != null && (list = subOnlyPlaylistsBriefInfo.soplBriefInfo) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<SOPLBriefInfo> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new C0K1M(it2.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    AwS621S0100000_7 awS621S0100000_7 = new AwS621S0100000_7(c510560K0o, 121);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        c06st.LL.setAdapter(new C0K1N(arrayList, awS621S0100000_7));
                    } else {
                        c06st.LL.setAdapter(null);
                    }
                    extraBottomContainer.addView(c06st);
                }
            }
            String strValueOf = String.valueOf(c510630K0v.hashCode());
            AwS285S0300000_7 awS285S0300000_7 = new AwS285S0300000_7(c0k0s, c510630K0v, this, 1);
            if (a0.LJJJIL(strValueOf)) {
                strValueOf = String.valueOf(c510550K0n.hashCode());
            }
            HandlerHook.viewPost(c510550K0n, new RunnableC170100l1(c510550K0n, strValueOf, awS285S0300000_7));
            return c510550K0n;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
