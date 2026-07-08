package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.photo.text.AwemeListFragmentHelper$Companion$captureMobEvent$1", f = "AwemeListFragmentHelper.kt", l = {}, m = "invokeSuspend")
public final class C784940Uqi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RecyclerView LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ C1259360isQ LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ User LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C784940Uqi(RecyclerView recyclerView, Activity activity, Aweme aweme, C1259360isQ c1259360isQ, View view, int i, User user, InterfaceC1364105Vn<? super C784940Uqi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = recyclerView;
        this.LLILLJJLI = activity;
        this.LLILLL = aweme;
        this.LLILZ = c1259360isQ;
        this.LLILZIL = view;
        this.LLILZLL = i;
        this.LLIZ = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C784940Uqi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? arrayList;
        ?? arrayList2;
        float fHeight;
        boolean z;
        int fansCount;
        int followerCount;
        int i;
        C1C7U.LIZ("AwemeListFragmentHelper$Companion@d6db.captureMobEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RecyclerView recyclerView = this.LL;
        Rect rect = new Rect();
        recyclerView.getGlobalVisibleRect(rect);
        int i2 = rect.top;
        int iXS = AwemeListFragmentImpl.XS(this.LLILLJJLI);
        C844470XAv.LIZ.getClass();
        int iLJIIJ = C12ES.LJIIJ(C844470XAv.LIZ());
        int childCount = this.LL.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            RecyclerView recyclerView2 = this.LL;
            RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i3));
            if (childViewHolder != null && (childViewHolder instanceof C1259780it6)) {
                C1259780it6 c1259780it6 = (C1259780it6) childViewHolder;
                Aweme aweme = c1259780it6.LL;
                if (Intrinsics.LJFF(aweme.getAid(), this.LLILLL.getAid())) {
                    C1259360isQ c1259360isQ = this.LLILZ;
                    RecyclerView recyclerView3 = this.LL;
                    if (c1259360isQ != null && recyclerView3 != null) {
                        Rect rect2 = new Rect();
                        recyclerView3.getGlobalVisibleRect(rect2);
                        arrayList = new ArrayList();
                        int childCount2 = recyclerView3.getChildCount();
                        int iMax = 0;
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            RecyclerView.ViewHolder childViewHolder2 = recyclerView3.getChildViewHolder(recyclerView3.getChildAt(i4));
                            if (childViewHolder2 != null) {
                                iMax = Math.max(childViewHolder2.itemView.getHeight(), iMax);
                            }
                        }
                        int childCount3 = recyclerView3.getChildCount();
                        for (int i5 = 0; i5 < childCount3; i5++) {
                            RecyclerView.ViewHolder childViewHolder3 = recyclerView3.getChildViewHolder(recyclerView3.getChildAt(i5));
                            if (childViewHolder3 != null && (childViewHolder3 instanceof C1259780it6)) {
                                View view = childViewHolder3.itemView;
                                int i6 = rect2.top;
                                int i7 = rect2.bottom;
                                Rect rect3 = new Rect();
                                view.getGlobalVisibleRect(rect3);
                                if (rect3.top >= i6 && rect3.bottom <= i7 && rect3.height() >= iMax * 0.65f) {
                                    arrayList.add(((AbstractC1620180sGO) childViewHolder3).LL);
                                }
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    C1259360isQ c1259360isQ2 = this.LLILZ;
                    RecyclerView recyclerView4 = this.LL;
                    if (c1259360isQ2 != null && recyclerView4 != null) {
                        Rect rect4 = new Rect();
                        recyclerView4.getGlobalVisibleRect(rect4);
                        arrayList2 = new ArrayList();
                        int childCount4 = recyclerView4.getChildCount();
                        int iMax2 = 0;
                        for (int i8 = 0; i8 < childCount4; i8++) {
                            RecyclerView.ViewHolder childViewHolder4 = recyclerView4.getChildViewHolder(recyclerView4.getChildAt(i8));
                            if (childViewHolder4 != null) {
                                iMax2 = Math.max(childViewHolder4.itemView.getHeight(), iMax2);
                            }
                        }
                        int childCount5 = recyclerView4.getChildCount();
                        for (int i9 = 0; i9 < childCount5; i9++) {
                            RecyclerView.ViewHolder childViewHolder5 = recyclerView4.getChildViewHolder(recyclerView4.getChildAt(i9));
                            if (childViewHolder5 != null && (childViewHolder5 instanceof C1259780it6)) {
                                View view2 = childViewHolder5.itemView;
                                int i10 = rect4.top;
                                int i11 = rect4.bottom;
                                Rect rect5 = new Rect();
                                view2.getGlobalVisibleRect(rect5);
                                if (i11 - i10 >= iMax2 && rect5.top >= i10 && rect5.bottom <= i11 && rect5.height() >= iMax2 * 0.65f && (rect5.top == i10 || rect5.height() >= ((double) iMax2) * 0.95d)) {
                                    arrayList2.add(((AbstractC1620180sGO) childViewHolder5).LL);
                                }
                            }
                        }
                    } else {
                        arrayList2 = C13BV.INSTANCE;
                    }
                    Set setLJJL = C13LP.LJJL(arrayList, arrayList2);
                    int layoutPosition = c1259780it6.getLayoutPosition();
                    int height = this.LLILZIL.getHeight();
                    View view3 = this.LLILZIL;
                    Rect rect6 = new Rect();
                    view3.getGlobalVisibleRect(rect6);
                    int i12 = rect6.top;
                    View view4 = this.LLILZIL;
                    Rect rect7 = new Rect();
                    view4.getGlobalVisibleRect(rect7);
                    int i13 = rect7.bottom;
                    View view5 = this.LLILZIL;
                    Rect rect8 = new Rect();
                    view5.getGlobalVisibleRect(rect8);
                    int i14 = rect8.right;
                    View view6 = this.LLILZIL;
                    Rect rect9 = new Rect();
                    view6.getGlobalVisibleRect(rect9);
                    int i15 = rect9.left;
                    long playCount = aweme.getStatistics().getPlayCount();
                    long createTime = aweme.getCreateTime();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(setLJJL, 10));
                    Iterator it2 = setLJJL.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Long.valueOf(((Aweme) it2.next()).getStatistics().getPlayCount()));
                    }
                    int size = arrayList.size();
                    C1259360isQ c1259360isQ3 = this.LLILZ;
                    RecyclerView recyclerView5 = this.LL;
                    View view7 = this.LLILZIL;
                    if (c1259360isQ3 != null && recyclerView5 != null) {
                        Rect rect10 = new Rect();
                        Rect rect11 = new Rect();
                        view7.getGlobalVisibleRect(rect10);
                        recyclerView5.getGlobalVisibleRect(rect11);
                        int childCount6 = recyclerView5.getChildCount();
                        int iMax3 = 0;
                        for (int i16 = 0; i16 < childCount6; i16++) {
                            RecyclerView.ViewHolder childViewHolder6 = recyclerView5.getChildViewHolder(recyclerView5.getChildAt(i16));
                            if (childViewHolder6 != null) {
                                iMax3 = Math.max(childViewHolder6.itemView.getHeight(), iMax3);
                            }
                        }
                        fHeight = 1 - (rect10.height() / iMax3);
                        if (rect10.bottom == rect11.bottom) {
                            fHeight = -fHeight;
                        }
                    } else {
                        fHeight = -2.0f;
                    }
                    boolean z2 = true;
                    if (aweme.getIsTop() == 1 && this.LLILZLL == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    View view8 = c1259780it6.LLJJL;
                    if (view8 == null || view8.getVisibility() != 0) {
                        z2 = false;
                    }
                    User user = this.LLIZ;
                    if (user != null) {
                        fansCount = user.getFansCount();
                    } else {
                        fansCount = 0;
                    }
                    User user2 = this.LLIZ;
                    if (user2 != null) {
                        followerCount = user2.getFollowerCount();
                    } else {
                        followerCount = 0;
                    }
                    User user3 = this.LLIZ;
                    if (user3 != null) {
                        i = user3.verificationBadgeType;
                    } else {
                        i = 0;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_height", height);
                        jSONObject.put("video_top_border", i12);
                        jSONObject.put("video_bottom_border", i13);
                        jSONObject.put("video_right_border", i14);
                        jSONObject.put("video_left_border", i15);
                        jSONObject.put("list_top_border", i2);
                        jSONObject.put("list_bottom_border", iXS);
                        jSONObject.put("screen_height", iXS);
                        jSONObject.put("screen_width", iLJIIJ);
                        jSONObject.put("author_fan_count", fansCount);
                        jSONObject.put("author_follower_count", followerCount);
                        jSONObject.put("verification_badge_type", i);
                        jSONObject.put("is_pinned", z);
                        jSONObject.put("adapter_position", layoutPosition);
                        jSONObject.put("play_count", playCount);
                        jSONObject.put("play_counts", arrayList3);
                        jSONObject.put("creation_time", createTime);
                        jSONObject.put("number_of_visible_video_thumbnails", size);
                        jSONObject.put("occlusion", Float.valueOf(fHeight));
                        jSONObject.put("just_watched", z2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C20684815ws.LJIJJ("profile_click_behavior_event", jSONObject);
                }
            }
            i3++;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeListFragmentHelper$Companion@d6db.captureMobEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
