package Y;

import X.C013C;
import X.C09JN;
import X.C0H4W;
import X.C118300cf;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C1C7U;
import X.C2255108sX;
import X.C416760GVu;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C497740JfY;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC424310GkP;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.widget.GameLiveBillboardWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageContentAbility;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.favorites.business.collection.CollaborativeUser;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.GamePreviewBillboardWidget;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.DataInsightsMetric;
import com.ss.android.ugc.aweme.model.DataPoint;
import com.ss.android.ugc.aweme.model.InsightTypeResponse;
import com.ss.android.ugc.aweme.music.v2.assem.MusicHeaderBackgroundAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class AfS142S0200000_6 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS142S0200000_6 afS142S0200000_6, Object obj) {
        C1C7U.LIZ("GameLiveBillboardWidget@ac83.showGameBillboardView$2$2");
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            GameLiveBillboardWidget gameLiveBillboardWidget = (GameLiveBillboardWidget) afS142S0200000_6.l0;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) afS142S0200000_6.l1;
            drawable.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.3f), (int) C497740JfY.LIZIZ(16.0f));
            C416760GVu c416760GVu = new C416760GVu(drawable);
            gameLiveBillboardWidget.LLIZLLLIL = c416760GVu;
            C786410Ut5.q2(spannableStringBuilder, c416760GVu, 0, 1, 33);
            gameLiveBillboardWidget.z1().setText(spannableStringBuilder);
        }
        C1C7U.LIZIZ("GameLiveBillboardWidget@ac83.showGameBillboardView$2$2");
    }

    public static final void accept$1(AfS142S0200000_6 afS142S0200000_6, Object obj) {
        DataInsightsMetric dataInsightsMetric;
        List<DataPoint> list;
        C1C7U.LIZ("AnalyticsDetailPanel@358c.getInsightsDataForGraph$1");
        InsightTypeResponse insightTypeResponse = (InsightTypeResponse) obj;
        String str = ((AnalyticsDetailPanel) afS142S0200000_6.l0).A0;
        if (Intrinsics.LJFF(str, "retention")) {
            dataInsightsMetric = insightTypeResponse.videoRetentionRateHistory;
        } else {
            if (Intrinsics.LJFF(str, "likes")) {
                dataInsightsMetric = insightTypeResponse.videoLikeRateHistory;
            }
            C1C7U.LIZIZ("AnalyticsDetailPanel@358c.getInsightsDataForGraph$1");
        }
        if (dataInsightsMetric != null && (list = dataInsightsMetric.dataPoints) != null) {
            InterfaceC424310GkP interfaceC424310GkP = (InterfaceC424310GkP) afS142S0200000_6.l1;
            AnalyticsDetailPanel analyticsDetailPanel = (AnalyticsDetailPanel) afS142S0200000_6.l0;
            interfaceC424310GkP.setPoints(list);
            analyticsDetailPanel.L0(list);
        }
        C1C7U.LIZIZ("AnalyticsDetailPanel@358c.getInsightsDataForGraph$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$2(Y.AfS142S0200000_6 r8, java.lang.Object r9) {
        /*
            java.lang.String r7 = "AnalyticsDetailPanel@358c.getInsightsDataForGraphV2$1"
            X.C1C7U.LIZ(r7)
            com.ss.android.ugc.aweme.model.InsightTypeResponseV2 r9 = (com.ss.android.ugc.aweme.model.InsightTypeResponseV2) r9
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel r0 = (com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel) r0
            java.lang.String r1 = r0.C0
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r3 = "likes"
            java.lang.String r2 = "retention"
            if (r0 == 0) goto L67
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel r0 = (com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel) r0
            java.lang.String r1 = r0.A0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.model.InsighRetentionRateList r0 = r9.videoRetentionRateHistory
            if (r0 == 0) goto L9d
            java.util.List<com.ss.android.ugc.aweme.model.InsightRetentionRatePair> r1 = r0.value
        L2b:
            if (r1 == 0) goto L9d
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L3c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r5.next()
            com.ss.android.ugc.aweme.model.InsightRetentionRatePair r1 = (com.ss.android.ugc.aweme.model.InsightRetentionRatePair) r1
            com.ss.android.ugc.aweme.model.DataPoint r4 = new com.ss.android.ugc.aweme.model.DataPoint
            java.lang.String r0 = r1.timestamp
            float r3 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)
            double r1 = r1.value
            float r0 = (float) r1
            r4.<init>(r3, r0)
            r6.add(r4)
            goto L3c
        L5a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.model.InsighRetentionRateList r0 = r9.videoLikeDistributionHistory
            if (r0 == 0) goto L9d
            java.util.List<com.ss.android.ugc.aweme.model.InsightRetentionRatePair> r1 = r0.value
            goto L2b
        L67:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel r0 = (com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel) r0
            java.lang.String r1 = r0.A0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.model.InsightRealtimeEngagementList r0 = r9.videoRetentionRateRealtime
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.model.InsightEngagementList r0 = r0.value
            if (r0 == 0) goto L9d
            java.util.List<com.ss.android.ugc.aweme.model.InsightRetentionRatePair> r1 = r0.list
            goto L2b
        L7e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.model.InsightRealtimeEngagementList r0 = r9.videoLikeDistributionRealtime
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.model.InsightEngagementList r0 = r0.value
            if (r0 == 0) goto L9d
            java.util.List<com.ss.android.ugc.aweme.model.InsightRetentionRatePair> r1 = r0.list
            goto L2b
        L8f:
            java.lang.Object r1 = r8.l1
            X.0GkP r1 = (X.InterfaceC424310GkP) r1
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel r0 = (com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel) r0
            r1.setPoints(r6)
            r0.L0(r6)
        L9d:
            X.C1C7U.LIZIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS142S0200000_6.accept$2(Y.AfS142S0200000_6, java.lang.Object):void");
    }

    public static final void accept$3(AfS142S0200000_6 afS142S0200000_6, Object obj) {
        User currentUser;
        String str;
        String uid;
        C1C7U.LIZ("CollectionContentAssem$HeaderVH@7b75.onBindItemView$1$2");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(((TuxTextView) afS142S0200000_6.l0).getResources(), (Bitmap) obj);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        CollaborativeUser collaborativeUser = null;
        if (C0H4W.LIZ()) {
            ((TuxTextView) afS142S0200000_6.l0).setCompoundDrawables(null, null, bitmapDrawable, null);
        } else {
            ((TuxTextView) afS142S0200000_6.l0).setCompoundDrawables(bitmapDrawable, null, null, null);
        }
        ((TuxTextView) afS142S0200000_6.l0).setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUser = iUserService.getCurrentUser();
        } else {
            currentUser = null;
        }
        List<CollaborativeUser> list = ((CollectionContentAssem) afS142S0200000_6.l1).Lo().collaborativeUserList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (CollaborativeUser collaborativeUser2 : list) {
                String str2 = collaborativeUser2.uid;
                if (currentUser != null) {
                    uid = currentUser.getUid();
                } else {
                    uid = null;
                }
                if (!Intrinsics.LJFF(str2, uid)) {
                    arrayList.add(collaborativeUser2);
                }
            }
            collaborativeUser = (CollaborativeUser) C13LP.LJJJLZIJ(0, arrayList);
        }
        TuxTextView tuxTextView = (TuxTextView) afS142S0200000_6.l0;
        Context context = tuxTextView.getContext();
        Object[] objArr = new Object[1];
        if (collaborativeUser == null || (str = collaborativeUser.name) == null) {
            str = "";
        }
        objArr[0] = str;
        tuxTextView.setText(context.getString(2131847927, objArr));
        C1C7U.LIZIZ("CollectionContentAssem$HeaderVH@7b75.onBindItemView$1$2");
    }

    public static final void accept$4(AfS142S0200000_6 afS142S0200000_6, Object obj) {
        boolean z;
        C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showAt$1");
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        C013C c013c = (C013C) afS142S0200000_6.l0;
        List<CollectionDetail> list = collectionListResponse.items;
        int size = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        c013c.element = !z;
        if (((C013C) afS142S0200000_6.l0).element) {
            C118300cf c118300cf = (C118300cf) afS142S0200000_6.l1;
            List<CollectionDetail> list2 = collectionListResponse.items;
            if (list2 != null) {
                size = list2.size();
            }
            c118300cf.element = size;
        }
        C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showAt$1");
    }

    public static final void accept$5(AfS142S0200000_6 afS142S0200000_6, Object obj) {
        boolean z;
        C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showToastWithoutContentView$1");
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        C013C c013c = (C013C) afS142S0200000_6.l0;
        List<CollectionDetail> list = collectionListResponse.items;
        int size = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        c013c.element = !z;
        if (((C013C) afS142S0200000_6.l0).element) {
            C118300cf c118300cf = (C118300cf) afS142S0200000_6.l1;
            List<CollectionDetail> list2 = collectionListResponse.items;
            if (list2 != null) {
                size = list2.size();
            }
            c118300cf.element = size;
        }
        C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showToastWithoutContentView$1");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void accept$6(AfS142S0200000_6 afS142S0200000_6, Object obj) {
        float f;
        DetailPageContentAbility detailPageContentAbility;
        C1C7U.LIZ("MusicHeaderBackgroundAssem@a0fc.getMainColorAndSetBackground$ignore$2");
        Color.colorToHSV(((Integer) obj).intValue(), new float[3]);
        float f2 = 0.9f;
        int iHSVToColor = Color.HSVToColor(new float[]{(((int) r5[0]) + 345) % 360, 0.45f, 0.9f});
        int iHSVToColor2 = Color.HSVToColor(new float[]{(((int) r5[0]) + 375) % 360, 0.45f, 0.9f});
        boolean zLIZIZ = C444960Hcc.LIZIZ();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{iHSVToColor, 0});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(1);
        gradientDrawable.setAlpha(128);
        if (zLIZIZ) {
            f = 0.74f;
        } else {
            f = 0.26f;
        }
        gradientDrawable.setGradientCenter(f, -0.25f);
        gradientDrawable.setGradientRadius(((View) afS142S0200000_6.l0).getMeasuredWidth() * 0.68f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColors(new int[]{iHSVToColor2, 0});
        gradientDrawable2.setShape(0);
        gradientDrawable2.setAlpha(60);
        gradientDrawable2.setGradientType(1);
        if (zLIZIZ) {
            f2 = 0.100000024f;
        }
        gradientDrawable2.setGradientCenter(f2, 0.0f);
        gradientDrawable2.setGradientRadius(((View) afS142S0200000_6.l0).getMeasuredWidth() * 0.53f);
        ((View) afS142S0200000_6.l0).setBackgroundDrawable(new LayerDrawable(new GradientDrawable[]{gradientDrawable2, gradientDrawable}));
        Fragment fragmentLJI = C724240Sb0.LJI((MusicHeaderBackgroundAssem) afS142S0200000_6.l1);
        View viewIh2 = null;
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            MusicHeaderBackgroundAssem musicHeaderBackgroundAssem = (MusicHeaderBackgroundAssem) afS142S0200000_6.l1;
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, PageHeaderScrollAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, musicHeaderBackgroundAssem, PageHeaderScrollAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(musicHeaderBackgroundAssem);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(musicHeaderBackgroundAssem);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, PageHeaderScrollAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
                    }
                }
            }
        }
        MusicHeaderBackgroundAssem musicHeaderBackgroundAssem2 = (MusicHeaderBackgroundAssem) afS142S0200000_6.l1;
        musicHeaderBackgroundAssem2.getClass();
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(musicHeaderBackgroundAssem2);
            if (fragmentLJI2 != null && (detailPageContentAbility = (DetailPageContentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), DetailPageContentAbility.class, null)) != null) {
                viewIh2 = detailPageContentAbility.Ih2();
            }
            int[] iArr = new int[2];
            if (viewIh2 != null) {
                viewIh2.getLocationOnScreen(iArr);
            }
            int i = iArr[1];
            if (i != 0) {
                ViewGroup.LayoutParams layoutParams = musicHeaderBackgroundAssem2.getContentView().getLayoutParams();
                layoutParams.height = i;
                C786410Ut5.W5(musicHeaderBackgroundAssem2.getContentView(), layoutParams);
            }
        }
        C1C7U.LIZIZ("MusicHeaderBackgroundAssem@a0fc.getMainColorAndSetBackground$ignore$2");
    }

    public static final void accept$7(AfS142S0200000_6 afS142S0200000_6, Object obj) {
        C1C7U.LIZ("GamePreviewBillboardWidget@eef6.showGameBillboardView$1$2$2");
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            GamePreviewBillboardWidget gamePreviewBillboardWidget = (GamePreviewBillboardWidget) afS142S0200000_6.l0;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) afS142S0200000_6.l1;
            drawable.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.3f), (int) C497740JfY.LIZIZ(16.0f));
            C416760GVu c416760GVu = new C416760GVu(drawable);
            gamePreviewBillboardWidget.LLJILLL = c416760GVu;
            C786410Ut5.q2(spannableStringBuilder, c416760GVu, 0, 1, 33);
            gamePreviewBillboardWidget.N1().setText(spannableStringBuilder);
        }
        C1C7U.LIZIZ("GamePreviewBillboardWidget@eef6.showGameBillboardView$1$2$2");
    }

    public AfS142S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
