package X;

import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import android.text.TextWatcher;
import com.bytedance.als.h0;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11Zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19522411Zm extends AbstractC2255721DQs<InterfaceC2378409Tq> implements InterfaceC2378409Tq, InterfaceC379610EuV {
    public static final C19522611Zo LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public C19522511Zn LLILLL;
    public C0P0T LLJJ;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 699));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461660o8i.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C124T.class, null);
    public final List<ReadTextEffectBean> LLJ = new ArrayList();
    public final h0<Boolean> LLJI = new h0<>(Boolean.FALSE);
    public final C560530Lyd<List<String>> LLJIJIL = new C560530Lyd<>();
    public final C560530Lyd<List<String>> LLJILJIL = new C560530Lyd<>();
    public final C01GW LLJILJILJ = C1449630npJ.LIZIZ(this, C0FWT.class);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C21378018lO.class, null);
    public final Function1<EffectCategoryModel, Boolean> LLJJI = AFwS231S0000000_3.get$arr$(104);

    /* JADX WARN: Type inference failed for: r0v9, types: [X.11Zo] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19522411Zm.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19522411Zm.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0), new C2217381BqS(C19522411Zm.class, "textInputLayout", "getTextInputLayout()Lcom/ss/android/ugc/aweme/editSticker/text/view/TextStickerInputLayout;", 0), new C2217381BqS(C19522411Zm.class, "taskScheduler", "getTaskScheduler()Lcom/ss/android/ugc/aweme/creative/taskscheduler/scheduler/TaskScheduler;", 0)};
        LLJJIII = new Object() { // from class: X.11Zo
        };
    }

    public InterfaceC2378409Tq Z1() {
        return this;
    }

    private final TextWatcher E3() {
        return new C19773412Ya(this, 12);
    }

    private final InterfaceC1461660o8i G2() {
        return (InterfaceC1461660o8i) this.LLIZ.getValue(this, LLJJIJI[1]);
    }

    private final C21378018lO c3() {
        return (C21378018lO) this.LLJILLL.getValue(this, LLJJIJI[3]);
    }

    private final InterfaceC1455860nzM w2() {
        return (InterfaceC1455860nzM) this.LLILZLL.getValue(this, LLJJIJI[0]);
    }

    public final void B3() {
        this.LLJIJIL.LIZ(this, new AObjectS247S0100000_29(this, 86));
        this.LLJILJIL.LIZ(this, new AObjectS247S0100000_29(this, 87));
        C385670FAf<Boolean> c385670FAfS8 = G2().s8();
        if (c385670FAfS8 != null) {
            c385670FAfS8.LIZ(this, new AObjectS247S0100000_29(this, 88));
        }
    }

    public final InterfaceC1635390sev H2() {
        return (InterfaceC1635390sev) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC2378409Tq
    public boolean JX() {
        return this.LLJI.LIZJ().booleanValue();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILZIL.getValue();
    }

    public final void Q3() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C09UI(this, null), 3);
    }

    public final void W1() {
        C0P0T c0p0t = this.LLJJ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public final C0FWT W2() {
        return (C0FWT) this.LLJILJILJ.getValue();
    }

    public final C124T i3() {
        return (C124T) this.LLIZLLLIL.getValue(this, LLJJIJI[2]);
    }

    private final boolean O3() {
        return C0CHQ.LIZ().getAccountService().LIZ() || ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2();
    }

    @Override // X.InterfaceC2378409Tq
    public boolean LN1() {
        C0FWT c0fwtW2 = W2();
        if (c0fwtW2 != null) {
            return c0fwtW2.Lo2();
        }
        return false;
    }

    public final void X1() {
        C0FWT c0fwtW2 = W2();
        if (c0fwtW2 != null) {
            c0fwtW2.px0();
        }
        if (c3() == null) {
            Q3();
            return;
        }
        C21378018lO c21378018lOC3 = c3();
        if (c21378018lOC3 != null) {
            c21378018lOC3.UM2(new C537410L5v("UnlockFetchVoiceEffectTask", new AwS573S0100000_29(this, 698)));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "text_reader_allowing_choose_sound_effects", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "text_reader_allowing_choose_sound_effects", true) == 3) && !O3()) {
            G2().X3(E3());
            w2().ww2().observe(this, new AObserverS231S0100000_29(this, 109));
        }
    }

    public final C19A3 T2() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final List<ReadTextEffectBean> m3(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator<ReadTextEffectBean> it2 = this.LLJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ReadTextEffectBean next = it2.next();
                    if (Intrinsics.LJFF(next.mSpeaker.speakreID, str)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final void H3(List<? extends ReadTextEffectBean> list) {
        Keva keva = SpeakerCenter.LIZ;
        List listLJJLL = C13LQ.LJJLL(SpeakerCenter.LIZ.getStringArray(C2084808Es.LIZ(C0CHQ.LIZ().getAccountService().getCurrentUserID()), new String[0]));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ReadTextEffectBean readTextEffectBean : list) {
            if (!listLJJLL.contains(readTextEffectBean.mSpeaker.speakreID)) {
                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
                if (readTextEffectSpeakerExtra.lockEasterEgg == 1) {
                    String str = readTextEffectSpeakerExtra.lockKeywordsEasterEgg;
                    if ((true ^ a0.LJJJIL(str)) && str != null) {
                        Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6).iterator();
                        while (it2.hasNext()) {
                            linkedHashMap.put(((String) it2.next()).toLowerCase(Locale.getDefault()), readTextEffectBean.mSpeaker.speakreID);
                        }
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this.LLJI.LJII(Boolean.TRUE);
            this.LLILLL = new C19522511Zn(linkedHashMap, new ArrayList(listLJJLL));
        }
    }

    @Override // X.InterfaceC2378409Tq
    public void NC0(List<? extends ReadTextEffectBean> list) {
        if (Intrinsics.LJFF(this.LLJI.LIZJ(), Boolean.FALSE) || (!this.LLJ.isEmpty())) {
            return;
        }
        this.LLJ.addAll(list);
        H3(list);
    }

    public final String o2(List<String> list) {
        if (list.size() == 1) {
            return C1664590tQ1.LJII(this).getResources().getString(2131858348, ((ReadTextEffectBean) C13LP.LJJJJZI(m3(list))).mSpeaker.speakerName);
        }
        return C1664590tQ1.LJII(this).getResources().getString(2131858349);
    }

    public final String q3(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (c != '\n' && c != ' ') {
                sb.append(String.valueOf(c).toLowerCase(Locale.ROOT));
            }
        }
        return sb.toString();
    }

    public final void v3(List<String> list) {
        List<ReadTextEffectBean> listM3 = m3(list);
        C0FWT c0fwtW2 = W2();
        if (c0fwtW2 != null) {
            c0fwtW2.LR0(listM3);
        }
    }

    public C19522411Zm(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }
}
