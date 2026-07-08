package X;

import Y.ACListenerS122S0200000_19;
import Y.ACListenerS85S0300000_19;
import Y.AfS188S0100000_19;
import Y.AkS477S0100000_15;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.PaidContentLiveShoppingMessage;
import com.bytedance.android.livesdk.model.message.PopSeries;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISeriesPricingService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iH8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236240iH8 extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> {
    public final boolean LLILLL;
    public Room LLILZLL;
    public C1236200iH4 LLIZ;
    public IFrameSlot.SlotViewModel LLJ;
    public InterfaceC21213717zz LLJI;
    public CollectionDetailModel LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(604));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(605));
    public final C11NJ LLIZLLLIL = new C11NJ();

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "live_paid_series";
    }

    public final C1236200iH4 LJJ() {
        C1236200iH4 c1236200iH4 = this.LLIZ;
        if (c1236200iH4 == null) {
            C1236190iH3 c1236190iH3 = new C1236190iH3(this);
            Room room = this.LLILZLL;
            c1236200iH4 = new C1236200iH4(room != null ? Long.valueOf(room.getId()) : null, c1236190iH3);
            this.LLIZ = c1236200iH4;
        }
        return c1236200iH4;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return Collections.singletonList(Integer.valueOf(C001A.PAID_CONTENT_LIVE_SHOPPING_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        this.LLIZLLLIL.dispose();
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return LJJ();
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE;
    }

    public C1236240iH8(boolean z) {
        this.LLILLL = z;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof PaidContentLiveShoppingMessage) {
            PaidContentLiveShoppingMessage paidContentLiveShoppingMessage = (PaidContentLiveShoppingMessage) iMessage;
            int i = paidContentLiveShoppingMessage.actionType;
            if (i != 1) {
                if (i == 2) {
                    C1440005kM.LIZ(new C7828033y(false));
                    LJJI(this.LLJIJIL, false);
                    return;
                }
                return;
            }
            C1440005kM.LIZ(new C7828033y(true));
            PopSeries popSeries = paidContentLiveShoppingMessage.popSeries;
            if (popSeries == null) {
                return;
            }
            long j = popSeries.collectionId;
            Room room = this.LLILZLL;
            if (room == null) {
                return;
            }
            final long id = room.getId();
            this.LLIZLLLIL.LIZ(((PaidSeriesLiveApiService) this.LLILZ.getValue()).LIZLLL().popSeries(id, j).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C09JN() { // from class: X.0iH2
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String uid;
                    Context context;
                    String str;
                    int iIntValue;
                    int iIntValue2;
                    int iIntValue3;
                    String uid2;
                    int i2;
                    int i3;
                    C197039127h c197039127h;
                    PriceInfo priceInfo;
                    List<String> urlList;
                    String uid3;
                    String string;
                    String string2;
                    User user;
                    MutableLiveData<Pair<Boolean, String>> mutableLiveData;
                    C1C7U.LIZ("PaidSeriesPopCardWidget@bc96.getPopSeries$1$1");
                    final CollectionDetailModel collectionDetailModel = ((PaidCollectionDetailResponse) obj).collectionDetail;
                    if (collectionDetailModel != null) {
                        C1236240iH8 c1236240iH8 = this.LL;
                        long j2 = id;
                        IFrameSlot.SlotViewModel slotViewModel = c1236240iH8.LLJ;
                        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null) {
                            mutableLiveData.setValue(new Pair<>(Boolean.TRUE, "live_paid_series"));
                        }
                        if (c1236240iH8.LLJILJIL && !c1236240iH8.LLILLL) {
                            C1236090iGt c1236090iGt = C1236090iGt.LIZ;
                            CollectionDetailModel collectionDetailModel2 = c1236240iH8.LLJIJIL;
                            if (collectionDetailModel2 != null && (user = collectionDetailModel2.collectionCreator) != null) {
                                uid3 = user.getUid();
                            } else {
                                uid3 = null;
                            }
                            CollectionDetailModel collectionDetailModel3 = c1236240iH8.LLJIJIL;
                            if (collectionDetailModel3 != null) {
                                string = Long.valueOf(collectionDetailModel3.collectionId).toString();
                            } else {
                                string = null;
                            }
                            Room room2 = c1236240iH8.LLILZLL;
                            if (room2 == null || (string2 = Long.valueOf(room2.getId()).toString()) == null) {
                                string2 = "";
                            }
                            c1236090iGt.getClass();
                            C1236090iGt.LIZJ(0, uid3, string, string2);
                        }
                        final C1236200iH4 c1236200iH4LJJ = c1236240iH8.LJJ();
                        boolean z = c1236240iH8.LLILLL;
                        View view = c1236200iH4LJJ.LLILLL;
                        if (view != null && (context = view.getContext()) != null) {
                            SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.uro);
                            TextView textView = (TextView) view.findViewById(R.id.usm);
                            TextView textView2 = (TextView) view.findViewById(R.id.urq);
                            final TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.us7);
                            final TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.ptu);
                            View viewFindViewById = view.findViewById(R.id.sij);
                            final TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.ptv);
                            View viewFindViewById2 = view.findViewById(R.id.sig);
                            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.x_icon);
                            c1236200iH4LJJ.LLILZ = (C197039127h) view.findViewById(R.id.d8d);
                            UrlModel urlModel = collectionDetailModel.collectionCover;
                            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                                str = "";
                            }
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                            c1331670kl3LJIIIZ.LJJ(smartImageView);
                            C786410Ut5.h3(c1331670kl3LJIIIZ);
                            textView.setText(collectionDetailModel.collectionName);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue);
                            int length = spannableStringBuilder.length();
                            Resources resources = context.getResources();
                            int i4 = collectionDetailModel.collectionVideoNum;
                            spannableStringBuilder.append((CharSequence) resources.getQuantityString(2131755700, i4, Integer.valueOf(i4)));
                            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ng, context);
                            if (numLIZJ2 != null) {
                                iIntValue2 = numLIZJ2.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(iIntValue2);
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) " | ");
                            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, context);
                            if (numLIZJ3 != null) {
                                iIntValue3 = numLIZJ3.intValue();
                            } else {
                                iIntValue3 = 0;
                            }
                            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(iIntValue3);
                            int length3 = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) C788990UxF.LIZ(collectionDetailModel.collectionTotalDuration, context.getResources()));
                            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
                            textView2.setText(spannableStringBuilder);
                            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                            User user2 = collectionDetailModel.collectionCreator;
                            if (user2 != null) {
                                uid2 = user2.getUid();
                            } else {
                                uid2 = null;
                            }
                            final boolean zEquals = curUserId.equals(uid2);
                            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                            if (c19egLIZIZ != null && (priceInfo = collectionDetailModel.priceInfo) != null) {
                                ((ISeriesPricingService) c1236200iH4LJJ.LLILZIL.getValue()).LIZJ(context, Collections.singletonList(new C1617190sBZ(collectionDetailModel.collectionId, priceInfo, collectionDetailModel.discountedPriceInfo, collectionDetailModel.singleVideoPriceInfo))).observe(c19egLIZIZ, new Observer() { // from class: X.0iH1
                                    @Override // androidx.lifecycle.Observer
                                    public final void onChanged(Object obj2) {
                                        String str2;
                                        C1576640r8A c1576640r8A = (C1576640r8A) ((Map) obj2).get(Long.valueOf(collectionDetailModel.collectionId));
                                        if (c1576640r8A != null) {
                                            TuxTextView tuxTextView4 = tuxTextView;
                                            CollectionDetailModel collectionDetailModel4 = collectionDetailModel;
                                            boolean z2 = zEquals;
                                            TuxTextView tuxTextView5 = tuxTextView2;
                                            C1236200iH4 c1236200iH4 = c1236200iH4LJJ;
                                            TuxTextView tuxTextView6 = tuxTextView3;
                                            if (C123100dR.LIZ(c1576640r8A.LIZLLL)) {
                                                str2 = c1576640r8A.LIZLLL;
                                            } else {
                                                str2 = c1576640r8A.LIZIZ;
                                            }
                                            tuxTextView4.setText(str2);
                                            if (!c1576640r8A.LJIIIIZZ && C123100dR.LIZ(c1576640r8A.LIZLLL) && !collectionDetailModel4.hasPurchasedCollection && !z2) {
                                                tuxTextView5.setText(c1576640r8A.LIZIZ);
                                                tuxTextView5.setPaintFlags(tuxTextView5.getPaintFlags() | 16);
                                                C197039127h c197039127h2 = c1236200iH4.LLILZ;
                                                if (c197039127h2 != null) {
                                                    int[] iArr = new int[2];
                                                    int[] iArr2 = new int[2];
                                                    tuxTextView5.measure(0, 0);
                                                    tuxTextView5.getLocationOnScreen(iArr);
                                                    c197039127h2.getLocationOnScreen(iArr2);
                                                    int measuredWidth = tuxTextView5.getMeasuredWidth() + iArr[0];
                                                    int i5 = iArr2[0];
                                                    if (measuredWidth >= i5 && measuredWidth != 0 && i5 != 0) {
                                                        C786410Ut5.LJLLLLLL(0, tuxTextView6);
                                                        tuxTextView6.setText(c1576640r8A.LIZIZ);
                                                        return;
                                                    }
                                                }
                                                C786410Ut5.LJLLLLLL(0, tuxTextView5);
                                            }
                                        }
                                    }
                                });
                            }
                            C786410Ut5.a9(tuxIconView, new ACListenerS122S0200000_19(c1236200iH4LJJ, collectionDetailModel, 4));
                            if (z) {
                                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                                if (collectionDetailModel.hasPurchasedCollection) {
                                    i2 = 0;
                                } else {
                                    i2 = 8;
                                }
                                C786410Ut5.LJLLLLLL(i2, viewFindViewById);
                                if (collectionDetailModel.category == SeriesCategory.MINI_DRAMA && (c197039127h = c1236200iH4LJJ.LLILZ) != null) {
                                    c197039127h.setText(context.getText(2131847437));
                                }
                                C197039127h c197039127h2 = c1236200iH4LJJ.LLILZ;
                                if (c197039127h2 != null) {
                                    if (!collectionDetailModel.hasPurchasedCollection) {
                                        i3 = 0;
                                    } else {
                                        i3 = 8;
                                    }
                                    C786410Ut5.LJLLLLLL(i3, c197039127h2);
                                }
                            } else {
                                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                            }
                            C786410Ut5.I7(new ACListenerS85S0300000_19(c1236200iH4LJJ, collectionDetailModel, context, 1), view);
                        }
                        c1236240iH8.LLJIJIL = collectionDetailModel;
                        c1236240iH8.LLJILJIL = true;
                        if (c1236240iH8.LLILLL) {
                            C1236090iGt c1236090iGt2 = C1236090iGt.LIZ;
                            User user3 = collectionDetailModel.collectionCreator;
                            if (user3 != null) {
                                uid = user3.getUid();
                            } else {
                                uid = null;
                            }
                            String strValueOf = String.valueOf(j2);
                            String strValueOf2 = String.valueOf(collectionDetailModel.collectionId);
                            String currentUserID = ((IUserService) c1236240iH8.LLILZIL.getValue()).getCurrentUserID();
                            c1236090iGt2.getClass();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("author_id", uid);
                            c2344009Gk.LJIIIIZZ("room_id", strValueOf);
                            c2344009Gk.LJIIIIZZ("collection_id", strValueOf2);
                            c2344009Gk.LJIIIIZZ("user_id", currentUserID);
                            C20684815ws.LJIILLIIL("view_pinned_card_live", c2344009Gk.LIZ);
                        }
                    }
                    C1C7U.LIZIZ("PaidSeriesPopCardWidget@bc96.getPopSeries$1$1");
                }
            }).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0ZwI
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return AbstractC19484711Kz.LJJIJL(10L, TimeUnit.SECONDS).LJIL(new AkS477S0100000_15((PaidCollectionDetailResponse) obj, 8));
                }
            }).LJJIIZ(new AfS188S0100000_19(this, 50), new C09JN() { // from class: X.00Oe
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PaidSeriesPopCardWidget@bc96.getPopSeries$1$4");
                    C1C7U.LIZIZ("PaidSeriesPopCardWidget@bc96.getPopSeries$1$4");
                }
            }));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(com.ss.android.ugc.aweme.model.CollectionDetailModel r7, boolean r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.model.CollectionDetailModel r0 = r6.LLJIJIL
            r4 = 0
            if (r0 == 0) goto L85
            long r0 = r0.collectionId
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        Lb:
            if (r7 == 0) goto L83
            long r0 = r7.collectionId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L13:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L7e
            com.bytedance.android.live.slot.IFrameSlot$SlotViewModel r0 = r6.LLJ
            r5 = 0
            if (r0 == 0) goto L7e
            androidx.lifecycle.MutableLiveData<android.util.Pair<java.lang.Boolean, java.lang.String>> r0 = r0.LL
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r0.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L7e
            java.lang.Object r1 = r0.first
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7e
            com.bytedance.android.live.slot.IFrameSlot$SlotViewModel r0 = r6.LLJ
            if (r0 == 0) goto L48
            androidx.lifecycle.MutableLiveData<android.util.Pair<java.lang.Boolean, java.lang.String>> r3 = r0.LL
            if (r3 == 0) goto L48
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r0 = "live_paid_series"
            r2.<init>(r1, r0)
            r3.postValue(r2)
        L48:
            r6.LLJILJIL = r5
            boolean r0 = r6.LLILLL
            if (r0 != 0) goto L7e
            X.0iGt r3 = X.C1236090iGt.LIZ
            if (r7 == 0) goto L7f
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.collectionCreator
            if (r0 == 0) goto L7f
            java.lang.String r4 = r0.getUid()
        L5a:
            long r0 = r7.collectionId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r2 = r0.toString()
        L64:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LLILZLL
            if (r0 == 0) goto L76
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L78
        L76:
            java.lang.String r0 = ""
        L78:
            r3.getClass()
            X.C1236090iGt.LIZJ(r8, r4, r2, r0)
        L7e:
            return
        L7f:
            if (r7 != 0) goto L5a
            r2 = r4
            goto L64
        L83:
            r0 = r4
            goto L13
        L85:
            r2 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1236240iH8.LJJI(com.ss.android.ugc.aweme.model.CollectionDetailModel, boolean):void");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    /* JADX INFO: renamed from: LJJIFFI, reason: merged with bridge method [inline-methods] */
    public final void LLIZ(IFrameSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        this.LLJ = slotViewModel;
        this.LLJI = interfaceC21213717zz;
        slotViewModel.LL.setValue(new Pair<>(Boolean.FALSE, "live_paid_series"));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    @Override // X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareToShow(java.util.Map<java.lang.String, java.lang.Object> r3, X.InterfaceC756140TlM r4) {
        /*
            r2 = this;
            java.lang.String r0 = "param_room"
            java.lang.Object r1 = r3.get(r0)
            boolean r0 = r1 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
            if (r0 == 0) goto L1f
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
        Lc:
            r2.LLILZLL = r1
            if (r1 == 0) goto L1d
            com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo r0 = r1.paidContentInfo
            if (r0 == 0) goto L1d
            boolean r1 = r0.paidContentPermission
            r0 = 1
            if (r1 != r0) goto L1d
        L19:
            r4.LIZ(r0)
            return
        L1d:
            r0 = 0
            goto L19
        L1f:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1236240iH8.prepareToShow(java.util.Map, X.0TlM):void");
    }
}
