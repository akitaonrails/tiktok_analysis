package Y;

import X.AbstractC044800Ec;
import X.AbstractC1604130rqV;
import X.AbstractC594970NVf;
import X.C007H;
import X.C044900Ed;
import X.C099R;
import X.C0NNS;
import X.C0NV6;
import X.C0NV7;
import X.C0NVY;
import X.C0NW0;
import X.C0NW2;
import X.C0NW8;
import X.C0NX1;
import X.C0NYK;
import X.C0NZC;
import X.C0NZD;
import X.C0NZF;
import X.C0O1N;
import X.C0O26;
import X.C0O27;
import X.C0O42;
import X.C0O4C;
import X.C0O6M;
import X.C0O6P;
import X.C0O78;
import X.C0O79;
import X.C0O7A;
import X.C0O7B;
import X.C0OCO;
import X.C0OCS;
import X.C0OCZ;
import X.C0OLG;
import X.C0YX2;
import X.C11RK;
import X.C13BV;
import X.C13ES;
import X.C13LP;
import X.C1462005nu;
import X.C15438062q;
import X.C1678760tms;
import X.C1691800u7u;
import X.C1772660wEK;
import X.C1954807lC;
import X.C19719512Dh;
import X.C19990113Jj;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2252321DDq;
import X.C2286608xc;
import X.C592020NJw;
import X.C595030NVl;
import X.C595040NVm;
import X.C595170NVz;
import X.C595220NWe;
import X.C595260NWi;
import X.C596820Nay;
import X.C596940NbA;
import X.C597010NbH;
import X.C599820Nfo;
import X.C612180Nzk;
import X.C612190Nzl;
import X.C612220Nzo;
import X.C614810O9n;
import X.C615590OCn;
import X.C615630OCr;
import X.C615690OCx;
import X.C627780Ojo;
import X.C632880Os2;
import X.C632950Os9;
import X.C869590Y9l;
import X.C876230YYz;
import X.C897520ZIw;
import X.EnumC597760NcU;
import X.EnumC612200Nzm;
import X.EnumC612210Nzn;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346701Wf;
import X.InterfaceC596930Nb9;
import android.os.Message;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent;
import com.ss.android.ugc.aweme.aime.AIMEDetailViewModel;
import com.ss.android.ugc.aweme.aime.model.AIMEDetailListModel;
import com.ss.android.ugc.aweme.aime.model.AIMEDetailModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailAwemeListModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailViewModel;
import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailModel;
import com.ss.android.ugc.aweme.creativedetail.viewmodel.CreativeToolDetailViewModel;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.scrolltobottomindicator.ScrollToBottomIndicator;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadUserListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.StrangerConversationAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.StrangerViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinUnreadIndicatorAssem;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.vm.ReportViewModel;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;
import com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailResp;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailResp;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.tts.oecverify.BdTuring;
import defpackage.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AgS290S0100000_9 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, obj, interfaceC1364105Vn);
            case 14:
                return emit$14(this, obj, interfaceC1364105Vn);
            case 15:
                return emit$15(this, obj, interfaceC1364105Vn);
            case 16:
                return emit$16(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return emit$17(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return emit$18(this, obj, interfaceC1364105Vn);
            case 19:
                return emit$19(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return emit$20(this, obj, interfaceC1364105Vn);
            case 21:
                return emit$21(this, obj, interfaceC1364105Vn);
            case 22:
                return emit$22(this, obj, interfaceC1364105Vn);
            case 23:
                return emit$23(this, obj, interfaceC1364105Vn);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return emit$24(this, obj, interfaceC1364105Vn);
            case 25:
                return emit$25(this, obj, interfaceC1364105Vn);
            case 26:
                return emit$26(this, obj, interfaceC1364105Vn);
            case 27:
                return emit$27(this, obj, interfaceC1364105Vn);
            case 28:
                return emit$28(this, obj, interfaceC1364105Vn);
            case 29:
                return emit$29(this, obj, interfaceC1364105Vn);
            case 30:
                return emit$30(this, obj, interfaceC1364105Vn);
            case 31:
                return emit$31(this, obj, interfaceC1364105Vn);
            case 32:
                return emit$32(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return emit$33(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return emit$34(this, obj, interfaceC1364105Vn);
            case 35:
                return emit$35(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS290S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(defpackage.o2<kotlin.Pair<java.lang.Long, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse>> r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0OHX
            if (r0 == 0) goto L50
            r5 = r8
            X.0OHX r5 = (X.C0OHX) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L38
            if (r0 != r2) goto L56
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel r0 = (com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel) r0
            r5.LLILLL = r1
            java.lang.Object r4 = r0.QQ2(r7, r5)
            if (r4 != r3) goto L3b
            return r3
        L38:
            X.C155000ia.LIZIZ(r4)
        L3b:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel r0 = (com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel) r0
            X.01GW r0 = r0.LLJ
            java.lang.Object r0 = r0.getValue()
            X.0955 r0 = (X.AnonymousClass0955) r0
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LJIJI(r4, r5)
            if (r0 != r3) goto L25
            return r3
        L50:
            X.0OHX r5 = new X.0OHX
            r5.<init>(r6, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS290S0100000_9.LIZ$0(o2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$1(int r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS290S0100000_9.LIZ$1(int, X.05Vn):java.lang.Object");
    }

    public static final Object emit$0(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            AIMEDetailListModel aIMEDetailListModel = ((C615630OCr) ((C0O79) c0o7a).LJ).LIZ;
            if (aIMEDetailListModel != null) {
                C615590OCn c615590OCn = (C615590OCn) agS290S0100000_9.l0;
                Message message = new Message();
                message.obj = aIMEDetailListModel;
                c615590OCn.mHandler.sendMessage(message);
            }
        } else if (c0o7a instanceof C0O78) {
            Message message2 = new Message();
            message2.obj = ((C0O78) c0o7a).LJFF;
            Boolean.valueOf(((C615590OCn) agS290S0100000_9.l0).mHandler.sendMessage(message2));
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        BulletinUnreadIndicatorAssem bulletinUnreadIndicatorAssem = (BulletinUnreadIndicatorAssem) agS290S0100000_9.l0;
        bulletinUnreadIndicatorAssem.LLJJJIL = zBooleanValue;
        if (!bulletinUnreadIndicatorAssem.LLJJIJIL) {
            return Unit.LIZ;
        }
        bulletinUnreadIndicatorAssem.Vo(zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object emit$10(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Long lLJIILIIL;
        ReadUserListViewModel readUserListViewModel = (ReadUserListViewModel) agS290S0100000_9.l0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            List<Long> list = readUserListViewModel.LLILLJJLI;
            String uid = ((BaseContact) obj2).getUid();
            if (uid != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(uid);
            } else {
                lLJIILIIL = null;
            }
            if (C13LP.LJJJJ(lLJIILIIL, list)) {
                arrayList.add(obj2);
            }
        }
        ReadUserListViewModel readUserListViewModel2 = (ReadUserListViewModel) agS290S0100000_9.l0;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C0O27((C1462005nu) it2.next(), readUserListViewModel2.LL));
        }
        C897520ZIw c897520ZIwVQ2 = ((ReadUserListViewModel) agS290S0100000_9.l0).vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LJIIIIZZ(C0O26.LIZIZ(arrayList2, AFwS240S0000000_9.get$arr$(120)));
        }
        ((ReadUserListViewModel) agS290S0100000_9.l0).setState(new AwS582S0100000_3((List) arrayList2, (List<C0O27>) 37));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$11(Y.AgS290S0100000_9 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0OBU
            if (r0 == 0) goto L40
            r4 = r7
            X.0OBU r4 = (X.C0OBU) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L46
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0OBW r0 = X.C0OBW.SHOWN
            if (r6 != r0) goto L3e
            r0 = 1
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3e:
            r0 = 0
            goto L31
        L40:
            X.0OBU r4 = new X.0OBU
            r4.<init>(r5, r7)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS290S0100000_9.emit$11(Y.AgS290S0100000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$12(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C11RK<Unit> c11rk = ((StrangerViewModel) ((StrangerConversationAssem) agS290S0100000_9.l0).LLILLJJLI.getValue()).LLILZLL;
        Unit unit = Unit.LIZ;
        c11rk.onNext(unit);
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$13(Y.AgS290S0100000_9 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS290S0100000_9.emit$13(Y.AgS290S0100000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$14(Y.AgS290S0100000_9 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C605620NpA
            if (r0 == 0) goto L3e
            r4 = r7
            X.0NpA r4 = (X.C605620NpA) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L44
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L3e:
            X.0NpA r4 = new X.0NpA
            r4.<init>(r5, r7)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS290S0100000_9.emit$14(Y.AgS290S0100000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$15(Y.AgS290S0100000_9 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C605660NpE
            if (r0 == 0) goto L39
            r4 = r7
            X.0NpE r4 = (X.C605660NpE) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L3f
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L39:
            X.0NpE r4 = new X.0NpE
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS290S0100000_9.emit$15(Y.AgS290S0100000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$16(Y.AgS290S0100000_9 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C605630NpB
            if (r0 == 0) goto L3e
            r4 = r7
            X.0NpB r4 = (X.C605630NpB) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L44
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L3e:
            X.0NpB r4 = new X.0NpB
            r4.<init>(r5, r7)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS290S0100000_9.emit$16(Y.AgS290S0100000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object emit$17(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS290S0100000_9.LIZ$0((o2) obj, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$18(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse;
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        String str;
        C612220Nzo c612220Nzo = (C612220Nzo) obj;
        EnumC612210Nzn enumC612210Nzn = c612220Nzo.LIZJ;
        if (enumC612210Nzn == EnumC612210Nzn.OPTIMISTIC || ((!c612220Nzo.LIZIZ && enumC612210Nzn == EnumC612210Nzn.MUTATION) || enumC612210Nzn == EnumC612210Nzn.ROLLBACK)) {
            C614810O9n c614810O9n = (C614810O9n) c612220Nzo.LIZ;
            PoiRevisitViewModel poiRevisitViewModel = (PoiRevisitViewModel) agS290S0100000_9.l0;
            PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse2 = poiRevisitViewModel.LLILLL;
            if (poiRevisitCardListResponse2 != null) {
                List<PoiRevisitApi.PoiRevisitCardModel> list2 = poiRevisitCardListResponse2.poiCardList;
                int i = 0;
                int i2 = -1;
                if (list2 != null) {
                    Iterator<PoiRevisitApi.PoiRevisitCardModel> it2 = list2.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            PoiRevisitApi.PoiRevisitCardModel next = it2.next();
                            if (Intrinsics.LJFF(next.poiId, c614810O9n.LIZ) && !Intrinsics.LJFF(next.isCollected, Boolean.valueOf(c614810O9n.LIZIZ))) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i3);
                    if (numValueOf != null && numValueOf.intValue() >= 0) {
                        ListProtector.set(C19719512Dh.LIZIZ(list2), numValueOf.intValue(), PoiRevisitApi.PoiRevisitCardModel.LIZ((PoiRevisitApi.PoiRevisitCardModel) ListProtector.get(list2, numValueOf.intValue()), Boolean.valueOf(c614810O9n.LIZIZ), false, null, 134086655));
                        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponse3 = poiRevisitViewModel.LLILLL;
                        if (poiRevisitCardListResponse3 != null) {
                            poiRevisitCardListResponse = new PoiRevisitApi.PoiRevisitCardListResponse(list2, poiRevisitCardListResponse3.distanceIndex);
                        } else {
                            poiRevisitCardListResponse = null;
                        }
                        poiRevisitViewModel.LLILLL = poiRevisitCardListResponse;
                        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = ((PoiRevisitViewModel) agS290S0100000_9.l0).wQ2(true, true, true);
                        if (poiRevisitCardListResponseWQ2 != null && (list = poiRevisitCardListResponseWQ2.poiCardList) != null) {
                            Iterator<PoiRevisitApi.PoiRevisitCardModel> it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                String str2 = it3.next().poiId;
                                if (c614810O9n != null) {
                                    str = c614810O9n.LIZ;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str2, str)) {
                                    i2 = i;
                                    break;
                                }
                                i++;
                            }
                            Integer numLJ = C2286608xc.LJ(i2);
                            if (numLJ != null) {
                                PoiRevisitViewModel poiRevisitViewModel2 = (PoiRevisitViewModel) agS290S0100000_9.l0;
                                numLJ.intValue();
                                poiRevisitViewModel2.setState(new AwS375S0200000_9(poiRevisitCardListResponseWQ2, numLJ, 95));
                            }
                        }
                    }
                }
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object emit$19(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object value;
        C632950Os9 c632950Os9;
        AbstractC044800Ec abstractC044800Ec = (AbstractC044800Ec) obj;
        C2252321DDq c2252321DDq = ((ProfileRecViewModel) agS290S0100000_9.l0).LLILLL;
        do {
            value = c2252321DDq.getValue();
            c632950Os9 = (C632950Os9) value;
            if (c632950Os9 == null) {
                break;
            }
            if (!(abstractC044800Ec instanceof C007H)) {
                if (!(abstractC044800Ec instanceof C044900Ed)) {
                    throw new C1954807lC();
                }
            } else {
                abstractC044800Ec.getClass();
                throw null;
            }
        } while (!c2252321DDq.compareAndSet(value, new C632950Os9(C632880Os2.LIZ(c632950Os9.LIZ, null, ((C044900Ed) abstractC044800Ec).LIZIZ, 479), c632950Os9.LIZIZ)));
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0OLG c0olg = (C0OLG) obj;
        BulletinUnreadIndicatorAssem bulletinUnreadIndicatorAssem = (BulletinUnreadIndicatorAssem) agS290S0100000_9.l0;
        bulletinUnreadIndicatorAssem.LLJJJ = c0olg;
        if (!bulletinUnreadIndicatorAssem.LLJJIJIL) {
            return Unit.LIZ;
        }
        ((BulletinUnreadIndicatorAssem) agS290S0100000_9.l0).Zo(c0olg);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    public static final Object emit$20(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String takoSessionId;
        String takoVideoSessionId;
        boolean z;
        String strLIZ;
        C596820Nay c596820Nay = (C596820Nay) obj;
        C2189821An6 c2189821An6Xn = ((AiVideoViewModel) agS290S0100000_9.l0).LL.Xn();
        DetailNavArgModel navArgModel = c2189821An6Xn.getNavArgModel();
        String eventType = c2189821An6Xn.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        String strI7 = ((AiVideoViewModel) agS290S0100000_9.l0).LL.i7();
        String processId = c2189821An6Xn.getProcessId();
        if (processId == null) {
            processId = "";
        }
        if (navArgModel == null || (takoSessionId = navArgModel.getTakoSessionId()) == null) {
            takoSessionId = "";
        }
        if (navArgModel == null || (takoVideoSessionId = navArgModel.getTakoVideoSessionId()) == null) {
            takoVideoSessionId = "";
        }
        AgentCommandRequest agentCommandRequest = c596820Nay.LIZ;
        String str = agentCommandRequest.awemeId;
        String str2 = agentCommandRequest.id;
        String str3 = agentCommandRequest.command;
        String str4 = c596820Nay.LIZJ;
        InterfaceC596930Nb9 interfaceC596930Nb9 = c596820Nay.LIZIZ;
        if (interfaceC596930Nb9 != null && interfaceC596930Nb9.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC596930Nb9 interfaceC596930Nb92 = c596820Nay.LIZIZ;
        if (interfaceC596930Nb92 == null || (strLIZ = interfaceC596930Nb92.LIZ()) == null) {
            strLIZ = "";
        }
        C597010NbH c597010NbH = new C597010NbH(eventType, strI7, processId, takoSessionId, takoVideoSessionId, str, str2, str3, str4, z, strLIZ, (int) C19990113Jj.LJIIIZ(c596820Nay.LIZLLL), c596820Nay.LJ);
        ?? r2 = c596820Nay.LJFF;
        C596940NbA c596940NbA = c597010NbH.LIZJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C597010NbH.LIZLLL;
        c596940NbA.LLILLL = r2;
        c597010NbH.LIZ();
        return Unit.LIZ;
    }

    public static final Object emit$21(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            BookDetailResp bookDetailResp = ((C0O4C) ((C0O79) c0o7a).LJ).LIZ;
            if (bookDetailResp != null) {
                BookDetailVM bookDetailVM = (BookDetailVM) agS290S0100000_9.l0;
                BookDetail bookDetail = bookDetailResp.detail;
                if (bookDetail != null) {
                    bookDetail.id = bookDetailVM.vQ2();
                }
                bookDetailVM.setState(new AwS588S0100000_9(bookDetailResp, 431));
                bookDetailVM.LLILLJJLI = bookDetailResp.isCollected;
            }
            ((BookDetailVM) agS290S0100000_9.l0).LLILLL = false;
        } else if (c0o7a instanceof C0O78) {
            ((BookDetailVM) agS290S0100000_9.l0).setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 432));
            ((BookDetailVM) agS290S0100000_9.l0).LLILLL = false;
        } else {
            ((BookDetailVM) agS290S0100000_9.l0).LLILLL = false;
        }
        return Unit.LIZ;
    }

    public static final Object emit$22(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((Boolean) obj).booleanValue()) {
            ((ScrollToBottomIndicator) agS290S0100000_9.l0).LL.setClickable(true);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = ((ScrollToBottomIndicator) agS290S0100000_9.l0).LLJILJIL.animate();
            if (viewPropertyAnimatorAnimate != null) {
                ScrollToBottomIndicator scrollToBottomIndicator = (ScrollToBottomIndicator) agS290S0100000_9.l0;
                viewPropertyAnimatorAnimate.cancel();
                viewPropertyAnimatorAnimate.withStartAction(new ARunnableS109S0100000_9(scrollToBottomIndicator, 139));
                viewPropertyAnimatorAnimate.withEndAction(new ARunnableS109S0100000_9(scrollToBottomIndicator, 140));
                viewPropertyAnimatorAnimate.setStartDelay(300L);
                viewPropertyAnimatorAnimate.setInterpolator(new PathInterpolator(0.17f, 0.06f, 0.25f, 1.0f));
                viewPropertyAnimatorAnimate.alpha(1.0f);
                viewPropertyAnimatorAnimate.setDuration(280L);
                viewPropertyAnimatorAnimate.start();
            }
        } else {
            ((ScrollToBottomIndicator) agS290S0100000_9.l0).LL.setClickable(false);
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = ((ScrollToBottomIndicator) agS290S0100000_9.l0).LLJILJIL.animate();
            if (viewPropertyAnimatorAnimate2 != null) {
                ScrollToBottomIndicator scrollToBottomIndicator2 = (ScrollToBottomIndicator) agS290S0100000_9.l0;
                viewPropertyAnimatorAnimate2.cancel();
                viewPropertyAnimatorAnimate2.setStartDelay(0L);
                viewPropertyAnimatorAnimate2.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
                viewPropertyAnimatorAnimate2.alpha(0.0f);
                viewPropertyAnimatorAnimate2.setDuration(300L);
                viewPropertyAnimatorAnimate2.withEndAction(new ARunnableS109S0100000_9(scrollToBottomIndicator2, 141));
                viewPropertyAnimatorAnimate2.start();
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$23(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS290S0100000_9.LIZ$1(((Number) obj).intValue(), interfaceC1364105Vn);
    }

    public static final Object emit$24(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z = obj instanceof C0NW2;
        AbstractC594970NVf abstractC594970NVf = (AbstractC594970NVf) agS290S0100000_9.l0;
        if (abstractC594970NVf.LLJJI != z) {
            abstractC594970NVf.LLJJI = z;
            C1691800u7u.LIZ(abstractC594970NVf);
        }
        return Unit.LIZ;
    }

    public static final Object emit$25(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0NNS c0nns = (C0NNS) obj;
        if (c0nns instanceof C0NW2) {
            ((C13ES) agS290S0100000_9.l0).add(c0nns);
        } else if (c0nns instanceof C595040NVm) {
            ((C13ES) agS290S0100000_9.l0).remove(((C595040NVm) c0nns).LIZ);
        } else if (c0nns instanceof C595030NVl) {
            ((C13ES) agS290S0100000_9.l0).remove(((C595030NVl) c0nns).LIZ);
        } else if (c0nns instanceof C0NW8) {
            ((C13ES) agS290S0100000_9.l0).add(c0nns);
        } else if (c0nns instanceof C0NV7) {
            ((C13ES) agS290S0100000_9.l0).remove(((C0NV7) c0nns).LIZ);
        } else if (c0nns instanceof C0NV6) {
            ((C13ES) agS290S0100000_9.l0).remove(((C0NV6) c0nns).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object emit$26(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objInvoke = ((Function2) agS290S0100000_9.l0).invoke(obj, interfaceC1364105Vn);
        if (objInvoke != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objInvoke;
    }

    public static final Object emit$27(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            MusicDetail musicDetail = ((C0O1N) ((C0O79) c0o7a).LJ).LIZ;
            if (musicDetail != null) {
                ((MusicDetailViewModel) agS290S0100000_9.l0).setState(new AwS588S0100000_9(musicDetail, 507));
            }
        } else if (c0o7a instanceof C0O78) {
            ((MusicDetailViewModel) agS290S0100000_9.l0).setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 508));
        }
        return Unit.LIZ;
    }

    public static final Object emit$28(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            CreativeToolDetailModel creativeToolDetailModel = ((C627780Ojo) ((C0O79) c0o7a).LJ).LIZ;
            if (creativeToolDetailModel != null) {
                ((CreativeToolDetailViewModel) agS290S0100000_9.l0).setState(new AwS588S0100000_9(creativeToolDetailModel, 589));
            }
        } else if (c0o7a instanceof C0O78) {
            ((CreativeToolDetailViewModel) agS290S0100000_9.l0).setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 590));
        }
        return Unit.LIZ;
    }

    public static final Object emit$29(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        List list = (List) obj;
        if (!((C0NYK) agS290S0100000_9.l0).LJIIJJI) {
            C0NYK c0nyk = (C0NYK) agS290S0100000_9.l0;
            c0nyk.LJIIJJI(c0nyk.LJIILJJIL(), "not active, ignore activity status update", null);
            return Unit.LIZ;
        }
        C0NYK c0nyk2 = (C0NYK) agS290S0100000_9.l0;
        Object objLJIILL = c0nyk2.LJIILL(new AwS410S0200000_9(c0nyk2, (C0NYK) list, (List<String>) 94), interfaceC1364105Vn);
        if (objLJIILL == C099R.LJFF()) {
            return objLJIILL;
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0NNS c0nns = (C0NNS) obj;
        if (c0nns instanceof C595170NVz) {
            ((C13ES) agS290S0100000_9.l0).add(c0nns);
        } else if (c0nns instanceof C0NW0) {
            ((C13ES) agS290S0100000_9.l0).remove(((C0NW0) c0nns).LIZ);
        } else if (c0nns instanceof C1678760tms) {
            ((C13ES) agS290S0100000_9.l0).add(c0nns);
        } else if (c0nns instanceof C0NVY) {
            ((C13ES) agS290S0100000_9.l0).remove(((C0NVY) c0nns).LIZ);
        } else if (c0nns instanceof C0NW2) {
            ((C13ES) agS290S0100000_9.l0).add(c0nns);
        } else if (c0nns instanceof C595040NVm) {
            ((C13ES) agS290S0100000_9.l0).remove(((C595040NVm) c0nns).LIZ);
        } else if (c0nns instanceof C595030NVl) {
            ((C13ES) agS290S0100000_9.l0).remove(((C595030NVl) c0nns).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object emit$30(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (obj instanceof C0O79) {
            ReportViewModel reportViewModel = (ReportViewModel) agS290S0100000_9.l0;
            EnumC597760NcU enumC597760NcU = EnumC597760NcU.SUBMIT_SUCCESS;
            reportViewModel.getClass();
            reportViewModel.setState(new AwS588S0100000_9(enumC597760NcU, 598));
        } else if (obj instanceof C0O7B) {
            ReportViewModel reportViewModel2 = (ReportViewModel) agS290S0100000_9.l0;
            EnumC597760NcU enumC597760NcU2 = EnumC597760NcU.SUBMIT_FAIL;
            reportViewModel2.getClass();
            reportViewModel2.setState(new AwS588S0100000_9(enumC597760NcU2, 598));
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$31(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ArrayList<Aweme> arrayList;
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            AIPortraitDetailAwemeListModel aIPortraitDetailAwemeListModel = ((C0OCS) ((C0O79) c0o7a).LJ).LIZ;
            if (aIPortraitDetailAwemeListModel != null && (arrayList = aIPortraitDetailAwemeListModel.awemeList) != null && !arrayList.isEmpty()) {
                if (aIPortraitDetailAwemeListModel != null) {
                    C0OCO c0oco = (C0OCO) agS290S0100000_9.l0;
                    Message message = new Message();
                    message.obj = aIPortraitDetailAwemeListModel;
                    c0oco.mHandler.sendMessage(message);
                }
            } else {
                ((C0OCO) agS290S0100000_9.l0).LJIIJJI();
            }
        } else if (c0o7a instanceof C0O78) {
            ((C0OCO) agS290S0100000_9.l0).LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object emit$32(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String content;
        C869590Y9l lastShowMessage;
        C0YX2 c0yx2 = (C0YX2) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("conversation change ");
        Long lLJFF = null;
        if (c0yx2 != null && (lastShowMessage = c0yx2.LIZ.getLastShowMessage()) != null) {
            content = lastShowMessage.getContent();
        } else {
            content = null;
        }
        sbLIZ.append(content);
        sbLIZ.append(' ');
        if (c0yx2 != null) {
            lLJFF = C2286608xc.LJFF(c0yx2.LIZ.getLastMessageIndex());
        }
        sbLIZ.append(lLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        ((PigeonConversationComponent) agS290S0100000_9.l0).LLILLL.setValue(c0yx2);
        return Unit.LIZ;
    }

    public static final Object emit$33(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        String str = ((C1772660wEK) agS290S0100000_9.l0).LLILLL;
        String string = obj.toString();
        c599820Nfo.getClass();
        C599820Nfo.LIZ(str, string);
        return Unit.LIZ;
    }

    public static final Object emit$34(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        List list;
        C595220NWe c595220NWe;
        C592020NJw c592020NJw = (C592020NJw) obj;
        C595260NWi c595260NWi = c592020NJw.LIZ;
        boolean z = c592020NJw.LIZIZ;
        boolean z2 = c592020NJw.LIZJ;
        if (z) {
            str = "debug_force_fetch";
        } else {
            str = "fetch_request";
        }
        C0NX1 c0nx1 = (C0NX1) agS290S0100000_9.l0;
        if (c595260NWi == null || (list = c595260NWi.LIZ) == null) {
            list = C13BV.INSTANCE;
        }
        List<C595220NWe> list2 = null;
        if (c595260NWi != null) {
            list2 = c595260NWi.LIZIZ;
        }
        c0nx1.LJIIIZ(str, list, list2);
        if (c595260NWi != null) {
            C0NX1 c0nx12 = (C0NX1) agS290S0100000_9.l0;
            if (z2) {
                c0nx12.getClass();
                List<C595220NWe> list3 = c595260NWi.LIZIZ;
                if (list3 != null && (c595220NWe = (C595220NWe) C13LP.LJJLIIIJL(list3)) != null && c595220NWe.LIZ == 0 && c595220NWe.LIZIZ == 0) {
                    ((C0NX1) agS290S0100000_9.l0).LJII.LIZ.set(System.currentTimeMillis());
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$35(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            MovieDetailResp movieDetailResp = ((C0O42) ((C0O79) c0o7a).LJ).LIZ;
            if (movieDetailResp != null) {
                MovieDetailVM movieDetailVM = (MovieDetailVM) agS290S0100000_9.l0;
                if (movieDetailResp.detail != null) {
                    movieDetailVM.setState(new AwS588S0100000_9(movieDetailResp, 662));
                    movieDetailVM.LLILLJJLI = movieDetailResp.isCollected;
                } else {
                    movieDetailVM.setState(AFwS240S0000000_9.get$arr$(942));
                }
            }
            ((MovieDetailVM) agS290S0100000_9.l0).LLILLL = false;
        } else if (c0o7a instanceof C0O78) {
            ((MovieDetailVM) agS290S0100000_9.l0).setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 663));
            ((MovieDetailVM) agS290S0100000_9.l0).LLILLL = false;
        } else {
            ((MovieDetailVM) agS290S0100000_9.l0).LLILLL = false;
        }
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            C0O79 c0o79 = (C0O79) c0o7a;
            AIMEDetailModel aIMEDetailModel = ((C615690OCx) c0o79.LJ).LIZ;
            if (aIMEDetailModel == null || aIMEDetailModel.getAimeInfo() == null) {
                ((AIMEDetailViewModel) agS290S0100000_9.l0).setState(AFwS240S0000000_9.get$arr$(27));
            }
            AIMEDetailModel aIMEDetailModel2 = ((C615690OCx) c0o79.LJ).LIZ;
            if (aIMEDetailModel2 != null) {
                ((AIMEDetailViewModel) agS290S0100000_9.l0).setState(new AwS588S0100000_9(aIMEDetailModel2, 32));
            }
        } else if (c0o7a instanceof C0O78) {
            ((AIMEDetailViewModel) agS290S0100000_9.l0).setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 33));
        }
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String content;
        C869590Y9l lastShowMessage;
        C0YX2 c0yx2 = (C0YX2) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("conversation change ");
        Long lLJFF = null;
        if (c0yx2 != null && (lastShowMessage = c0yx2.LIZ.getLastShowMessage()) != null) {
            content = lastShowMessage.getContent();
        } else {
            content = null;
        }
        sbLIZ.append(content);
        sbLIZ.append(' ');
        if (c0yx2 != null) {
            lLJFF = C2286608xc.LJFF(c0yx2.LIZ.getLastMessageIndex());
        }
        sbLIZ.append(lLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0yx2 == null) {
            ((PigeonMessageListComponent) agS290S0100000_9.l0).LLJILJILJ.setValue(new C0NZD(C0NZC.CONVERSATION_NOT_FOUND));
            return Unit.LIZ;
        }
        if (!C876230YYz.LIZ(c0yx2.LIZ)) {
            ((PigeonMessageListComponent) agS290S0100000_9.l0).LLJILJILJ.setValue(new C0NZD(C0NZC.ILLEGAL_STATUS));
        } else {
            ((PigeonMessageListComponent) agS290S0100000_9.l0).LLJILJILJ.setValue(C0NZF.LIZ);
            if (Intrinsics.LJFF(((PigeonMessageListComponent) agS290S0100000_9.l0).LLJ, true) && !c0yx2.LIZ.hasMore()) {
                ((PigeonMessageListComponent) agS290S0100000_9.l0).LJJLIIIJJIZ(1, true);
            }
            ((PigeonMessageListComponent) agS290S0100000_9.l0).LLJ = Boolean.valueOf(c0yx2.LIZ.hasMore());
        }
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            AIPortraitDetailHeaderModel aIPortraitDetailHeaderModel = ((C0OCZ) ((C0O79) c0o7a).LJ).LIZ;
            if (aIPortraitDetailHeaderModel != null) {
                ((AIPortraitDetailViewModel) agS290S0100000_9.l0).setState(new AwS588S0100000_9(aIPortraitDetailHeaderModel, 62));
            }
        } else if (c0o7a instanceof C0O78) {
            ((AIPortraitDetailViewModel) agS290S0100000_9.l0).setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 63));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$7(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O6P next;
        C612190Nzl c612190Nzl = (C612190Nzl) obj;
        if (((Boolean) c612190Nzl.LIZIZ).booleanValue()) {
            ((PlaylistCollectionVM) agS290S0100000_9.l0).manualListRefresh();
            ((PlaylistCollectionVM) agS290S0100000_9.l0).setState(AFwS240S0000000_9.get$arr$(84));
        } else {
            List<C0O6P> list = ((C0O6M) ((PlaylistCollectionVM) agS290S0100000_9.l0).getState()).LL.LLILZ;
            if (list != null) {
                Iterator<C0O6P> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LL.id, c612190Nzl.LIZ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0O6P c0o6p = next;
                if (c0o6p != null) {
                    ((PlaylistCollectionVM) agS290S0100000_9.l0).listRemoveItem(c0o6p);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.AgS290S0100000_9 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C0O6K
            if (r0 == 0) goto L3e
            r5 = r8
            X.0O6K r5 = (X.C0O6K) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            X.0Nzl r0 = (X.C612190Nzl) r0
            X.0Nzm r1 = r0.LIZJ
            X.0Nzm r0 = X.EnumC612200Nzm.MUTATION
            if (r1 != r0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L3e:
            X.0O6K r5 = new X.0O6K
            r5.<init>(r6, r8)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS290S0100000_9.emit$8(Y.AgS290S0100000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$9(AgS290S0100000_9 agS290S0100000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String aid;
        long collectCount;
        Aweme aweme;
        AwemeStatistics statistics;
        Aweme aweme2;
        C612190Nzl c612190Nzl = (C612190Nzl) obj;
        String str = c612190Nzl.LIZ;
        VideoItemParams item = ((VideoFavoriteVM) agS290S0100000_9.l0).getItem();
        if (item != null && (aweme2 = item.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return Unit.LIZ;
        }
        int i = C612180Nzk.LIZ[c612190Nzl.LIZJ.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            if (c612190Nzl.LIZJ == EnumC612200Nzm.OPTIMISTIC) {
                if (((Boolean) c612190Nzl.LIZIZ).booleanValue()) {
                    VideoFavoriteVM videoFavoriteVM = (VideoFavoriteVM) agS290S0100000_9.l0;
                    videoFavoriteVM.EQ2(videoFavoriteVM.LL + 1);
                } else {
                    ((VideoFavoriteVM) agS290S0100000_9.l0).EQ2(r4.LL - 1);
                }
            }
            if (c612190Nzl.LIZJ == EnumC612200Nzm.ROLLBACK) {
                VideoFavoriteVM videoFavoriteVM2 = (VideoFavoriteVM) agS290S0100000_9.l0;
                VideoItemParams item2 = videoFavoriteVM2.getItem();
                if (item2 != null && (aweme = item2.getAweme()) != null && (statistics = aweme.getStatistics()) != null) {
                    collectCount = statistics.getCollectCount();
                } else {
                    collectCount = 0;
                }
                videoFavoriteVM2.EQ2(collectCount);
            }
            AbstractC1604130rqV abstractC1604130rqVXQ2 = ((VideoFavoriteVM) agS290S0100000_9.l0).xQ2();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoFavoriteVM onPrepared awemeCollectionNotifier collect: ");
            sbLIZ.append(c612190Nzl);
            abstractC1604130rqVXQ2.LJ(C2188811AlT.LIZIZ(sbLIZ));
            VideoFavoriteVM videoFavoriteVM3 = (VideoFavoriteVM) agS290S0100000_9.l0;
            videoFavoriteVM3.setState(new AwS375S0200000_9(videoFavoriteVM3, (VideoFavoriteVM) c612190Nzl, (C612190Nzl<Boolean>) 36));
        }
        return Unit.LIZ;
    }
}
