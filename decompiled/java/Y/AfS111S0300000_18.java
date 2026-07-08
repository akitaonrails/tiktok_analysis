package Y;

import X.AbstractC316870CbV;
import X.C09AJ;
import X.C09JN;
import X.C0X52;
import X.C1171470gaf;
import X.C1171530gal;
import X.C1180170goh;
import X.C1180620gpQ;
import X.C1181120gqE;
import X.C1494600ozq;
import X.C19EG;
import X.C1C7U;
import X.C20600815jK;
import X.C259800zU;
import X.C445550HdZ;
import X.InterfaceC1181150gqH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import java.util.List;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes19.dex */
public class AfS111S0300000_18 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public static final void accept$0(AfS111S0300000_18 afS111S0300000_18, Object obj) {
        C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.directShowFavoritesSheet$3");
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        List<CollectionDetail> list = collectionListResponse.items;
        int size = 0;
        if (list != null && !list.isEmpty()) {
            C1171470gaf c1171470gaf = new C1171470gaf();
            c1171470gaf.LJIILLIIL = "click_fav_button";
            C1171530gal c1171530gal = (C1171530gal) afS111S0300000_18.l0;
            c1171470gaf.LJIIZILJ = c1171530gal.LL;
            c1171470gaf.LIZLLL = c1171530gal.LLILLJJLI;
            c1171470gaf.LJIILJJIL();
            C1171530gal c1171530gal2 = (C1171530gal) afS111S0300000_18.l0;
            C19EG c19eg = (C19EG) afS111S0300000_18.l1;
            List<CollectionDetail> list2 = collectionListResponse.items;
            if (list2 != null) {
                size = list2.size();
            }
            c1171530gal2.LJFF(c19eg, size, null);
        } else {
            ((C1171530gal) afS111S0300000_18.l0).LIZLLL((View) afS111S0300000_18.l2, (C19EG) afS111S0300000_18.l1);
        }
        C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.directShowFavoritesSheet$3");
    }

    public static final void accept$1(AfS111S0300000_18 afS111S0300000_18, Object obj) {
        UrlModel icon;
        Integer numValueOf;
        int mixLabel;
        MixStatisStruct statis;
        C1C7U.LIZ("ViewAllPlaylistFragment@d44b.updatePlaylist$1$1");
        MixDetailResponse mixDetailResponse = (MixDetailResponse) obj;
        C20600815jK<InterfaceC1891350zJl> state = ((ViewOnAttachStateChangeListenerC20604515jv) afS111S0300000_18.l0).getState();
        int iIntValue = ((Integer) afS111S0300000_18.l1).intValue();
        String str = ((C445550HdZ) afS111S0300000_18.l2).LL;
        MixStruct mixStruct = mixDetailResponse.mixDetail;
        Long lastAddVideoTimestamp = null;
        if (mixStruct != null) {
            icon = mixStruct.getIcon();
        } else {
            icon = null;
        }
        MixStruct mixStruct2 = mixDetailResponse.mixDetail;
        if (mixStruct2 != null && (statis = mixStruct2.getStatis()) != null) {
            numValueOf = Integer.valueOf(statis.getTotal());
        } else {
            numValueOf = null;
        }
        MixStruct mixStruct3 = mixDetailResponse.mixDetail;
        if (mixStruct3 != null) {
            lastAddVideoTimestamp = mixStruct3.getLastAddVideoTimestamp();
        }
        C445550HdZ c445550HdZ = (C445550HdZ) afS111S0300000_18.l2;
        String str2 = c445550HdZ.LLILZ;
        String str3 = c445550HdZ.LLILZLL;
        String str4 = c445550HdZ.LLIZ;
        String str5 = c445550HdZ.LLIZLLLIL;
        MixStruct mixStruct4 = mixDetailResponse.mixDetail;
        if (mixStruct4 != null) {
            mixLabel = mixStruct4.getMixLabel();
        } else {
            mixLabel = c445550HdZ.LLJ;
        }
        state.LJIILJJIL(iIntValue, new C445550HdZ(str, icon, numValueOf, str2, lastAddVideoTimestamp, str3, str4, str5, mixLabel, 512));
        C1C7U.LIZIZ("ViewAllPlaylistFragment@d44b.updatePlaylist$1$1");
    }

    public static final void accept$2(AfS111S0300000_18 afS111S0300000_18, Object obj) {
        C1C7U.LIZ("SlashFragment@ca1a.update$6");
        Throwable th = (Throwable) obj;
        C1180170goh.LIZLLL().LIZIZ("SlashFragment", new AwS546S0100000_2(th, 801));
        C1181120gqE c1181120gqE = (C1181120gqE) afS111S0300000_18.l0;
        if (c1181120gqE.LIZIZ) {
            ((SlashFragment) afS111S0300000_18.l1).YU(th, true, true);
        } else if (c1181120gqE.LIZ) {
            ((SlashFragment) afS111S0300000_18.l1).CU();
        }
        InterfaceC1181150gqH interfaceC1181150gqH = (InterfaceC1181150gqH) afS111S0300000_18.l2;
        if (interfaceC1181150gqH != null) {
            interfaceC1181150gqH.onError(th);
        }
        if (((C1181120gqE) afS111S0300000_18.l0).LIZ) {
            ((SlashFragment) afS111S0300000_18.l1).LLLIIIL = false;
        }
        C1C7U.LIZIZ("SlashFragment@ca1a.update$6");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse] */
    public static final void accept$3(AfS111S0300000_18 afS111S0300000_18, Object obj) {
        C1C7U.LIZ("MixVideosManageViewModel@b10d.doLoadMore$result$1");
        ?? r5 = (MixVideosResponse) obj;
        MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) afS111S0300000_18.l0;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS111S0300000_18.l2;
        mixVideosManageViewModel.vmDispatcher.getState();
        List<? extends Aweme> list = r5.mixVideos;
        mixVideosManageViewModel.LLILZLL = r5.hasMore;
        mixVideosManageViewModel.LLILZ = r5.mixLabel;
        mixVideosManageViewModel.withState(new AwS115S0400000_18(mixVideosManageViewModel, (MixVideosManageViewModel) interfaceC1364105Vn, (InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>) r5, (MixVideosResponse) list, (List<? extends Aweme>) 12));
        ((C259800zU) afS111S0300000_18.l1).element = r5;
        C1C7U.LIZIZ("MixVideosManageViewModel@b10d.doLoadMore$result$1");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse] */
    public static final void accept$4(AfS111S0300000_18 afS111S0300000_18, Object obj) {
        C1C7U.LIZ("MixVideosManageViewModel@b10d.doRefresh$result$1");
        ?? r6 = (MixVideosResponse) obj;
        MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) afS111S0300000_18.l0;
        mixVideosManageViewModel.withState(new AwS227S0300000_18((MixVideosResponse) r6, (MixVideosResponse) mixVideosManageViewModel, (MixVideosManageViewModel) afS111S0300000_18.l2, (InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>) 46));
        ((C259800zU) afS111S0300000_18.l1).element = r6;
        C1C7U.LIZIZ("MixVideosManageViewModel@b10d.doRefresh$result$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0gqL] */
    public static final void accept$5(AfS111S0300000_18 afS111S0300000_18, Object obj) {
        C1C7U.LIZ("SlashDataProcessor@f64e.realRequest$1$3");
        Throwable th = (Throwable) obj;
        C1180620gpQ c1180620gpQ = (C1180620gpQ) ((C259800zU) afS111S0300000_18.l0).element;
        if (c1180620gpQ != null) {
            C259800zU c259800zU = (C259800zU) afS111S0300000_18.l2;
            C09AJ c09aj = (C09AJ) afS111S0300000_18.l1;
            ?? r3 = c1180620gpQ.LL;
            c259800zU.element = r3;
            c09aj.onNext(C1180620gpQ.LJIJJLI(c1180620gpQ, r3, true, false, 28));
        }
        ((C09AJ) afS111S0300000_18.l1).onError(th);
        C1C7U.LIZIZ("SlashDataProcessor@f64e.realRequest$1$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.ss.android.ugc.aweme.slash.data.SlashPage] */
    public static final void accept$6(AfS111S0300000_18 afS111S0300000_18, Object obj) {
        C1C7U.LIZ("PoiDetailSlashApiRequest@17b.requestSlash$1$1");
        C0X52 c0x52 = (C0X52) obj;
        ?? r3 = (SlashPage) c0x52.LIZIZ;
        ((C259800zU) afS111S0300000_18.l0).element = r3.getPreloadFlag();
        C259800zU c259800zU = (C259800zU) afS111S0300000_18.l1;
        C1494600ozq<?> requestInfo = r3.getRequestInfo();
        if (requestInfo == null) {
            SlashPage slashPage = (SlashPage) c259800zU.element;
            if (slashPage != null) {
                requestInfo = slashPage.getRequestInfo();
            } else {
                requestInfo = null;
            }
        }
        r3.setRequestInfo(requestInfo);
        c259800zU.element = r3;
        ((C09AJ) afS111S0300000_18.l2).onNext(new SlashApiResponse(r3, c0x52.LIZ.LIZLLL));
        C1C7U.LIZIZ("PoiDetailSlashApiRequest@17b.requestSlash$1$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS111S0300000_18(X.C19482611Ke r2, X.C259800zU r3, X.C259800zU r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 5 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS111S0300000_18.<init>(X.11Ke, X.00zU, X.00zU, int):void");
    }

    public AfS111S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
