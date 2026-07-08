package X;

import Y.AfS104S0300000_8;
import Y.AfS177S0100000_8;
import Y.AkS472S0100000_8;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.AlbumAiContentRepositoryImpl;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import lnn.q;

/* JADX INFO: renamed from: X.0Mqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581220Mqu implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<List<C535020Kya>> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
            case 5:
                subscribe$5(this, c09aj);
                break;
            case 6:
                subscribe$6(this, c09aj);
                break;
            case 7:
                subscribe$7(this, c09aj);
                break;
            case 8:
                subscribe$8(this, c09aj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                subscribe$9(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C581220Mqu c581220Mqu, C09AJ c09aj) {
        List<C535020Kya> listLIZJ;
        Object key;
        Object next;
        C1C7U.LIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1");
        if (!((C534820KyG) c581220Mqu.l0).LJ.isEmpty()) {
            ((AlbumAiContentRepositoryImpl) c581220Mqu.l1).getClass();
            C534910KyP c534910KyPLIZ = C534860KyK.LIZ();
            List<String> list = ((C534820KyG) c581220Mqu.l0).LJ;
            synchronized (c534910KyPLIZ) {
                listLIZJ = c534910KyPLIZ.LIZ().LIZ(list);
            }
        } else if (((C534820KyG) c581220Mqu.l0).LIZ > 0) {
            ((AlbumAiContentRepositoryImpl) c581220Mqu.l1).getClass();
            listLIZJ = C534860KyK.LIZ().LIZLLL(((C534820KyG) c581220Mqu.l0).LIZ);
        } else {
            ((AlbumAiContentRepositoryImpl) c581220Mqu.l1).getClass();
            listLIZJ = C534860KyK.LIZ().LIZJ();
        }
        AlbumAiContentRepositoryImpl albumAiContentRepositoryImpl = (AlbumAiContentRepositoryImpl) c581220Mqu.l1;
        ArrayList arrayList = new ArrayList();
        for (C535020Kya c535020Kya : listLIZJ) {
            if (albumAiContentRepositoryImpl.LIZIZ.contains(Integer.valueOf(c535020Kya.LIZJ))) {
                arrayList.add(c535020Kya);
            }
        }
        C534820KyG c534820KyG = (C534820KyG) c581220Mqu.l0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if ((((C535020Kya) obj).LIZLLL & c534820KyG.LIZLLL) > 0) {
                arrayList2.add(obj);
            }
        }
        C534820KyG c534820KyG2 = (C534820KyG) c581220Mqu.l0;
        final ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            C535020Kya c535020Kya2 = (C535020Kya) obj2;
            Integer num = c534820KyG2.LJFF;
            if (num == null || c535020Kya2.LIZJ == num.intValue()) {
                arrayList3.add(obj2);
            }
        }
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchAiMediaModel ");
        sbLIZ.append((C534820KyG) c581220Mqu.l0);
        sbLIZ.append(", from db(");
        sbLIZ.append(arrayList3.size());
        sbLIZ.append(')');
        C201955140j.LJIILL(c552700Lm0, "AlbumAiContentRepository", C2188811AlT.LIZIZ(sbLIZ));
        if (((C534820KyG) c581220Mqu.l0).LIZIZ) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                C535020Kya c535020Kya3 = (C535020Kya) obj3;
                if (c535020Kya3.LIZJ != 2 || c535020Kya3.LJIILJJIL >= ((Number) C0BDZ.LIZ.getValue()).longValue()) {
                    arrayList4.add(obj3);
                }
            }
            C552700Lm0 c552700Lm02 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchAiMediaModel resolved: ");
            sbLIZ2.append(arrayList4.size());
            C201955140j.LJIILL(c552700Lm02, "AlbumAiContentRepository", C2188811AlT.LIZIZ(sbLIZ2));
            c09aj.onNext(arrayList4);
        }
        if (!((C534820KyG) c581220Mqu.l0).LIZJ) {
            c09aj.onComplete();
            C1C7U.LIZIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1");
            return;
        }
        C201955140j.LIZLLL(C552700Lm0.LIZIZ, "AlbumAiContentRepository", "---------- request from remote begin");
        AlbumAiContentRepositoryImpl albumAiContentRepositoryImpl2 = (AlbumAiContentRepositoryImpl) c581220Mqu.l1;
        albumAiContentRepositoryImpl2.getClass();
        Set setEntrySet = ((Map) C534860KyK.LIZLLL.getValue()).entrySet();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : setEntrySet) {
            if (albumAiContentRepositoryImpl2.LIZIZ.contains(((Map.Entry) obj4).getKey())) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((C534850KyJ) ((Map.Entry) it2.next()).getValue()).LIZIZ);
        }
        C534820KyG c534820KyG3 = (C534820KyG) c581220Mqu.l0;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj5 : arrayList6) {
            if ((((InterfaceC534890KyN) obj5).LIZ() & c534820KyG3.LIZLLL) > 0) {
                arrayList7.add(obj5);
            }
        }
        C534820KyG c534820KyG4 = (C534820KyG) c581220Mqu.l0;
        AlbumAiContentRepositoryImpl albumAiContentRepositoryImpl3 = (AlbumAiContentRepositoryImpl) c581220Mqu.l1;
        ArrayList arrayList8 = new ArrayList();
        for (Object obj6 : arrayList7) {
            if (c534820KyG4.LJFF != null) {
                albumAiContentRepositoryImpl3.getClass();
                Iterator it3 = ((Map) C534860KyK.LIZLLL.getValue()).entrySet().iterator();
                while (true) {
                    key = null;
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(((C534850KyJ) ((Map.Entry) next).getValue()).LIZIZ, obj6)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    key = entry.getKey();
                }
                if (Intrinsics.LJFF(key, c534820KyG4.LJFF)) {
                }
            }
            arrayList8.add(obj6);
        }
        C19482111Jz c19482111JzLJJJJIZL = C11NZ.LJJJJIZL(arrayList8);
        final AlbumAiContentRepositoryImpl albumAiContentRepositoryImpl4 = (AlbumAiContentRepositoryImpl) c581220Mqu.l1;
        C11NZ<R> c11nzLJJJ = c19482111JzLJJJJIZL.LJJJ(new InterfaceC1487280oo2() { // from class: X.0KyL
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj7) {
                return ((InterfaceC534890KyN) obj7).LIZIZ(new C534900KyO(arrayList3)).LJJIJIIJI(new C09JN() { // from class: X.0KwX
                    @Override // X.C09JN
                    public final void accept(Object obj8) {
                        C1C7U.LIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1$remoteAiContentList$1$1");
                        C552700Lm0 c552700Lm03 = C552700Lm0.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("ignore fetch ");
                        sbLIZ3.append(obj8);
                        C201955140j.LJIJJ(c552700Lm03, "AlbumAiContentRepository", C2188811AlT.LIZIZ(sbLIZ3));
                        C1C7U.LIZIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1$remoteAiContentList$1$1");
                    }
                }).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.00Dg
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj8) {
                        return C13BV.INSTANCE;
                    }
                }).LJJJI(new InterfaceC1487280oo2() { // from class: X.00Xx
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj8) {
                        return obj8;
                    }
                }).LJJJIL(new AkS472S0100000_8(albumAiContentRepositoryImpl4, 3));
            }
        }, false);
        ArrayList arrayList9 = new ArrayList();
        C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        final C11JF c11jf = (C11JF) c11nzLJJJ.LJJZ(new AfS104S0300000_8(arrayList9, new C238400w2(), c19482611Ke, 1), new AfS177S0100000_8(c19482611Ke, 11), new C581080Mqg(arrayList9, c19482611Ke, 0));
        c09aj.setCancellable(new C11KX() { // from class: X.0KyM
            @Override // X.C11KX
            public final void cancel() {
                C201955140j.LJIILL(C552700Lm0.LIZIZ, "AlbumAiContentRepository", "dispose");
                c11jf.dispose();
            }
        });
        C1C7U.LIZIZ("AlbumAiContentRepositoryImpl@e3c.fetchAiMediaModel$1");
    }

    public static final void subscribe$1(C581220Mqu c581220Mqu, C09AJ c09aj) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) c581220Mqu.l0;
        final List list = (List) c581220Mqu.l1;
        c529740Kq4.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.setPageLoadData$1L");
        if (!C302030Bsf.LIZ()) {
            List<TikTokMediaModel> list2 = c529740Kq4.LLJLIL;
            for (TikTokMediaModel tikTokMediaModel : c529740Kq4.LLJ) {
                Iterator<TikTokMediaModel> it2 = list2.iterator();
                while (true) {
                    Object obj = null;
                    if (it2.hasNext()) {
                        TikTokMediaModel next = it2.next();
                        if (Intrinsics.LJFF(next, tikTokMediaModel)) {
                            if (next != null) {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next2 = it3.next();
                                    if (Intrinsics.LJFF(next2, next)) {
                                        obj = next2;
                                        break;
                                    }
                                }
                                TikTokMediaModel tikTokMediaModel2 = (TikTokMediaModel) obj;
                                if (tikTokMediaModel2 != null) {
                                    tikTokMediaModel2.selectIndex = tikTokMediaModel.selectIndex;
                                }
                            }
                        }
                    }
                }
            }
        }
        final List<TikTokMediaModel> list3 = c529740Kq4.LLJLIL;
        c09aj.onNext(C21342318fd.LIZ(new AbstractC21342018fa(list3, list) { // from class: X.0KqX
            public final List<TikTokMediaModel> LIZ;
            public final List<TikTokMediaModel> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = list3;
                this.LIZIZ = list;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                return Intrinsics.LJFF(((MediaModel) ListProtector.get(this.LIZ, i)).id, ((MediaModel) ListProtector.get(this.LIZIZ, i2)).id);
            }

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i, int i2) {
                return new Object() { // from class: X.0KqZ
                };
            }
        }, false));
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.setPageLoadData$1L");
    }

    public static final void subscribe$2(C581220Mqu c581220Mqu, C09AJ c09aj) {
        p1 p1Var = (p1) c581220Mqu.l0;
        C579650MoN c579650MoN = (C579650MoN) c581220Mqu.l1;
        p1Var.getClass();
        C1C7U.LIZ("GoNextFactoryFactory@2bad.postConcatFinishActions$1L");
        if (c579650MoN.LIZLLL > 0) {
            ((InterfaceC1625000sOA) p1Var.LJIIIIZZ.LJII(q.class, null)).Mg2();
        }
        c09aj.onNext(new Object());
        c09aj.onComplete();
        C1C7U.LIZIZ("GoNextFactoryFactory@2bad.postConcatFinishActions$1L");
    }

    public static final void subscribe$3(C581220Mqu c581220Mqu, C09AJ c09aj) {
        C1C7U.LIZ("AiAliveContentDataSource@2c87.fetchAiContentList$1");
        List<C535020Kya> list = ((C534900KyO) c581220Mqu.l0).LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C535020Kya> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList);
        List<AwemeDraft> listQueryDraftList = C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, false, EnumC562220M3g.ALL, null, AFwS239S0000000_8.get$arr$(261), 58));
        ArrayList arrayList2 = new ArrayList();
        for (AwemeDraft awemeDraft : listQueryDraftList) {
            if (!C13LP.LJJJJ(awemeDraft.LIZ.aiLivePhotoModel.getTaskId(), hashSetLLIFFJFJJ)) {
                arrayList2.add(awemeDraft);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<AwemeDraft> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(((AwemeDraft) obj).LIZ.aiLivePhotoModel.getTaskId())) {
                arrayList3.add(obj);
            }
        }
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sb = new StringBuilder("fetchAiContentList drafts:");
        C535040Kyc c535040Kyc = (C535040Kyc) c581220Mqu.l1;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        for (AwemeDraft awemeDraft2 : arrayList3) {
            c535040Kyc.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Draft{id=");
            sbLIZ.append(awemeDraft2.id);
            sbLIZ.append(",aiLiveTask=");
            sbLIZ.append(awemeDraft2.LIZ.aiLivePhotoModel.getTaskId());
            sbLIZ.append('}');
            arrayList4.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append(arrayList4);
        C201955140j.LIZLLL(c552700Lm0, "AiAliveCDS", sb.toString());
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C581270Mqz(CoroutineExceptionHandler.LJJLIL, (C19482611Ke) c09aj, 3), null, new C534960KyU(arrayList3, c09aj, (C535040Kyc) c581220Mqu.l1, null), 2);
        C1C7U.LIZIZ("AiAliveContentDataSource@2c87.fetchAiContentList$1");
    }

    public static final void subscribe$4(C581220Mqu c581220Mqu, C09AJ c09aj) {
        C1C7U.LIZ("AiOfflineEffectContentDataSource@24a7.fetchAiContentList$1");
        List<C535020Kya> list = ((C534900KyO) c581220Mqu.l0).LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C535020Kya> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList);
        List<AwemeDraft> listQueryDraftList = C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, false, EnumC562220M3g.ALL, null, AFwS239S0000000_8.get$arr$(269), 58));
        ArrayList arrayList2 = new ArrayList();
        for (AwemeDraft awemeDraft : listQueryDraftList) {
            if (!hashSetLLIFFJFJJ.contains(awemeDraft.LIZ())) {
                arrayList2.add(awemeDraft);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<AwemeDraft> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(((AwemeDraft) obj).LIZ())) {
                arrayList3.add(obj);
            }
        }
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sb = new StringBuilder("fetchAiContentList drafts:");
        C0LPK c0lpk = (C0LPK) c581220Mqu.l1;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        for (AwemeDraft awemeDraft2 : arrayList3) {
            c0lpk.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Draft{id=");
            sbLIZ.append(awemeDraft2.id);
            sbLIZ.append(",offlineEffect=");
            sbLIZ.append(awemeDraft2.LIZ());
            sbLIZ.append('}');
            arrayList4.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append(arrayList4);
        C201955140j.LIZLLL(c552700Lm0, "AiEffectCDS", sb.toString());
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C581270Mqz(CoroutineExceptionHandler.LJJLIL, (C19482611Ke) c09aj, 5), null, new C534990KyX(arrayList3, hashSetLLIFFJFJJ, (C0LPK) c581220Mqu.l1, c09aj, null), 2);
        C1C7U.LIZIZ("AiOfflineEffectContentDataSource@24a7.fetchAiContentList$1");
    }

    public static final void subscribe$5(C581220Mqu c581220Mqu, C09AJ c09aj) {
        C1C7U.LIZ("AiSelfContentDataSource@b1a8.fetchAiContentList$1");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C581270Mqz(CoroutineExceptionHandler.LJJLIL, (C19482611Ke) c09aj, 8), null, new C535200Kys((C535210Kyt) c581220Mqu.l0, c09aj, (C534900KyO) c581220Mqu.l1, null), 2);
        C1C7U.LIZIZ("AiSelfContentDataSource@b1a8.fetchAiContentList$1");
    }

    public static final void subscribe$6(C581220Mqu c581220Mqu, C09AJ c09aj) {
        C1C7U.LIZ("VideoProcessor@449d.postConcatFinishActions$1");
        if (((C579650MoN) c581220Mqu.l0).LIZLLL > 0) {
            C578890Mn9 c578890Mn9 = (C578890Mn9) c581220Mqu.l1;
            ((InterfaceC1625000sOA) c578890Mn9.LLIZ.getValue(c578890Mn9, C578890Mn9.LLJI[4])).Mg2();
        }
        c09aj.onNext(new Object());
        c09aj.onComplete();
        C1C7U.LIZIZ("VideoProcessor@449d.postConcatFinishActions$1");
    }

    public static final void subscribe$7(C581220Mqu c581220Mqu, C09AJ c09aj) {
        C1C7U.LIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), new C581270Mqz(CoroutineExceptionHandler.LJJLIL, (C19482611Ke) c09aj, 9), null, new C535120Kyk((C535100Kyi) c581220Mqu.l0, c09aj, (C534900KyO) c581220Mqu.l1, null), 2);
        C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1");
    }

    public static final void subscribe$8(C581220Mqu c581220Mqu, C09AJ c09aj) {
        C1C7U.LIZ("NaviAvatarRequest@9a41.getFetchEffectsObservable$1");
        ((C19426510zP) c581220Mqu.l0).LIZJ.LJFF((List) c581220Mqu.l1, true, null, new C581070Mqf((C19482611Ke) c09aj, 3));
        C1C7U.LIZIZ("NaviAvatarRequest@9a41.getFetchEffectsObservable$1");
    }

    public static final void subscribe$9(C581220Mqu c581220Mqu, C09AJ c09aj) {
        C1C7U.LIZ("LighteningGoNextAction@4c30.postConcatFinishActions$1");
        if (((C579650MoN) c581220Mqu.l0).LIZLLL > 0) {
            ((InterfaceC1625000sOA) ((C579550MoD) c581220Mqu.l1).LIZLLL.getDiContainer().LJIIL(null, q.class)).Mg2();
        }
        c09aj.onNext(new Object());
        c09aj.onComplete();
        C1C7U.LIZIZ("LighteningGoNextAction@4c30.postConcatFinishActions$1");
    }

    public C581220Mqu(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
