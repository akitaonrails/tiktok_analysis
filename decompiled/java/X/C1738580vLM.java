package X;

import Y.AObserverS228S0100000_26;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738580vLM extends C193N<InterfaceC855190Xgj, C1738520vLG, C10J1> implements InterfaceC855190Xgj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final Function0<C1738520vLG> LLJ;
    public final C10J1 LLJI;
    public final InterfaceC1738600vLO LLJIJIL;
    public final C10J3 LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public final Map<String, String> LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1738580vLM.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1738580vLM.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIII = 8;
    }

    @Override // X.InterfaceC855190Xgj
    public void F91() {
        this.LLJILLL = true;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(T4()), null, null, new C1738500vLE(this, null), 3);
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        this.LLJILLL = false;
        List<UploadableMobileEffect2> list = O4().creativeModel.mobileEffectsModel2.exportedEffects;
        List<UploadableDraftEffect> listLIZ = C1637680sic.LIZ(list);
        List<UploadableMobileEffect> listLIZIZ = C1637680sic.LIZIZ(list);
        T4().LLILLJJLI.observe(this, new AObserverS228S0100000_26(new AwS570S0100000_26(this, 1128), 5));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(T4()), null, null, new C1738510vLF(this, listLIZ, listLIZIZ, null), 3);
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C1738520vLG, C10J1> F4() {
        return new AnonymousClass1931<C1738570vLL, C1738520vLG, C10J1>() { // from class: X.0vLJ
            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                C1738480vLC c1738480vLC = new C1738480vLC(context);
                c1738480vLC.setId(R.id.gw2);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1738480vLC);
                c1738480vLC.setLayoutParams(layoutParams);
                return new C1738570vLL(c1738480vLC);
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                C1738570vLL c1738570vLL = (C1738570vLL) abstractC1738640vLS;
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.0vLK
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((C1738520vLG) obj2).LIZ);
                    }
                }), c1738570vLL, Lifecycle.State.STARTED, new AwS605S0100000_26(c1738570vLL, 421));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.0vLH
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C1738520vLG) obj2).LIZIZ);
                    }
                }), c1738570vLL, Lifecycle.State.STARTED, new AwS605S0100000_26(c1738570vLL, 422));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.0vLI
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C1738520vLG) obj2).LIZJ;
                    }
                }), c1738570vLL, Lifecycle.State.STARTED, new AwS605S0100000_26(c1738570vLL, 423));
            }
        };
    }

    public final VideoPublishEditModel O4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJI[0]);
    }

    public final AbstractC214814194y P4() {
        return (AbstractC214814194y) this.LLIZLLLIL.getValue(this, LLJJI[1]);
    }

    public final EffectDraftSubmissionListViewModel T4() {
        return (EffectDraftSubmissionListViewModel) this.LLJILJILJ.getValue();
    }

    @Override // X.InterfaceC855190Xgj
    public void bi1() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(T4()), null, null, new C1738490vLD(this, null), 3);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJIL;
    }

    public C10J1 K4() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C1738520vLG> o2() {
        return this.LLJ;
    }

    public C1738580vLM(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJ = AFwS215S0000000_26.get$arr$(262);
        this.LLJI = new C10J1(AFwS268S0000000_26.get$arr$(470), null);
        this.LLJIJIL = EnumC214771193h.SUBMIT_EFFECT;
        this.LLJILJIL = AnonymousClass1938.LIZ;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1129));
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("creation_id", O4().getCreationId());
        String enterFrom = O4().getEnterFrom();
        pairArr[1] = new Pair("enter_from", enterFrom == null ? "" : enterFrom);
        String str = O4().mShootWay;
        pairArr[2] = new Pair("shoot_way", str != null ? str : "");
        this.LLJJ = C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC855190Xgj
    public void Tf0(Uri uri) {
        EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModelT4 = T4();
        effectDraftSubmissionListViewModelT4.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectDraftSubmissionListViewModelT4), null, null, new C08ZR(uri, effectDraftSubmissionListViewModelT4, null), 3);
    }

    public final Object Z4(List<UploadableDraftEffect> list, InterfaceC1364105Vn<? super List<UploadableDraftEffect>> interfaceC1364105Vn) {
        String stickerID = O4().getStickerID();
        if (stickerID == null) {
            stickerID = "";
        }
        Set setLLIIJI = C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(stickerID, new String[]{","}, 0, 6));
        ArrayList arrayList = new ArrayList();
        for (UploadableDraftEffect uploadableDraftEffect : list) {
            if (setLLIIJI.contains(uploadableDraftEffect.effectId)) {
                arrayList.add(uploadableDraftEffect);
            }
        }
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModelT4 = T4();
        effectDraftSubmissionListViewModelT4.getClass();
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2143708aZ(arrayList, effectDraftSubmissionListViewModelT4, null));
    }

    public final Object d5(List<UploadableMobileEffect> list, InterfaceC1364105Vn<? super List<UploadableMobileEffect>> interfaceC1364105Vn) {
        String stickerID = O4().getStickerID();
        if (stickerID == null) {
            stickerID = "";
        }
        Set setLLIIJI = C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(stickerID, new String[]{","}, 0, 6));
        ArrayList arrayList = new ArrayList();
        for (UploadableMobileEffect uploadableMobileEffect : list) {
            if (setLLIIJI.contains(uploadableMobileEffect.effectId)) {
                arrayList.add(uploadableMobileEffect);
            }
        }
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModelT4 = T4();
        effectDraftSubmissionListViewModelT4.getClass();
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2159708d9(arrayList, effectDraftSubmissionListViewModelT4, null));
    }

    public final void k5(List<UploadableMobileEffect2> list, UploadableDraftEffect uploadableDraftEffect, boolean z) {
        UploadableMobileEffect2 next;
        Iterator<UploadableMobileEffect2> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(uploadableDraftEffect.effectId, next.effectId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        UploadableMobileEffect2 uploadableMobileEffect2 = next;
        if (uploadableMobileEffect2 != null) {
            uploadableMobileEffect2.effectName = uploadableDraftEffect.effectName;
            uploadableMobileEffect2.iconFilePath = uploadableDraftEffect.iconFilePath;
            DraftInfo draftInfo = uploadableMobileEffect2.draftInfo;
            if (draftInfo != null) {
                draftInfo.needSubmission = z;
            }
        }
    }

    public final void n5(List<UploadableMobileEffect2> list, UploadableMobileEffect uploadableMobileEffect, boolean z) {
        UploadableMobileEffect2 next;
        Iterator<UploadableMobileEffect2> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(uploadableMobileEffect.effectId, next.effectId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        UploadableMobileEffect2 uploadableMobileEffect2 = next;
        if (uploadableMobileEffect2 != null) {
            uploadableMobileEffect2.effectName = uploadableMobileEffect.effectName;
            uploadableMobileEffect2.iconFilePath = uploadableMobileEffect.iconFilePath;
            uploadableMobileEffect2.enableMETSubmission = z;
        }
    }
}
