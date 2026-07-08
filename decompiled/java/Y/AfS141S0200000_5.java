package Y;

import X.C09JN;
import X.C0C64;
import X.C0CHQ;
import X.C0CNO;
import X.C0E5N;
import X.C0EV8;
import X.C0EVA;
import X.C0EVI;
import X.C0LAB;
import X.C0M7M;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C1416310mxZ;
import X.C1697810uHb;
import X.C189200o6;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217061Bpw;
import X.C305200Bxm;
import X.C366710EZh;
import X.C391210FVn;
import X.InterfaceC20236714Gf;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.subtitle.QueryAudioResponse;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.sticker.data.Word;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class AfS141S0200000_5 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
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
        }
    }

    public static final void accept$0(AfS141S0200000_5 afS141S0200000_5, Object obj) throws JSONException {
        String str;
        C0EVI c0evi;
        int iNextIndex;
        C0EVI c0evi2;
        VideoPublishEditModel videoPublishEditModel;
        C1C7U.LIZ("NewRecognizeCaptionPresenter@6e2f.startRecognizeInternal$3");
        QueryAudioResponse queryAudioResponse = (QueryAudioResponse) obj;
        C0CNO.LIZLLL(0L, new AwS549S0100000_5((C2217061Bpw) afS141S0200000_5.l0, 116));
        if (!C305200Bxm.LIZIZ(((C2217061Bpw) afS141S0200000_5.l0).LIZ) && ((videoPublishEditModel = ((C2217061Bpw) afS141S0200000_5.l0).LIZ) == null || !C1416310mxZ.LJIILJJIL(videoPublishEditModel))) {
            Iterator<Utterance> it2 = queryAudioResponse.mList.iterator();
            while (it2.hasNext()) {
                it2.next().setWords(C13BV.INSTANCE);
            }
        }
        C2217061Bpw c2217061Bpw = (C2217061Bpw) afS141S0200000_5.l0;
        List<Utterance> list = queryAudioResponse.mList;
        String str2 = queryAudioResponse.lidLanguage;
        Boolean bool = (Boolean) afS141S0200000_5.l1;
        boolean z = c2217061Bpw.LJIJJ;
        String str3 = queryAudioResponse.asrService;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "simulate_recognize_caption_fail", true) == 2) {
            C0CHQ.LIZ().isDebugConfigOpen();
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "simulate_recognize_caption_fail", true) == 1) {
            C0CHQ.LIZ().isDebugConfigOpen();
        }
        boolean zLJFF = Intrinsics.LJFF(c2217061Bpw.LJJI, "auto_language");
        if (list.isEmpty()) {
            if (!z && (c0evi2 = c2217061Bpw.LJIIJ) != null) {
                c0evi2.cH();
            }
            str = "empty";
        } else {
            if (!z && (c0evi = c2217061Bpw.LJIIJ) != null) {
                c0evi.bO(list, str2, bool, str3);
            }
            c2217061Bpw.LJJI = str2;
            str = "succeed";
        }
        VideoPublishEditModel videoPublishEditModel2 = c2217061Bpw.LIZ;
        long j = c2217061Bpw.LJIJI;
        boolean z2 = c2217061Bpw.LJFF;
        String str4 = c2217061Bpw.LJJI;
        Boolean boolValueOf = Boolean.valueOf(zLJFF);
        int i = 1;
        u4.LJJJLZIJ(videoPublishEditModel2, j, str, z2 ? 1 : 0, str4, boolValueOf, z, str3);
        ArrayList<Utterance> arrayList = new ArrayList();
        for (Utterance utterance : list) {
            ArrayList<Utterance> arrayList2 = new ArrayList();
            int size = utterance.getWords().size();
            if (i <= size) {
                int i2 = 1;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i2 == utterance.getWords().size() || (!C0EV8.LIZ(((Word) ListProtector.get(utterance.getWords(), i3)).getTag(), C13LQ.LJIIJ(C0EVA.values())) && C0EV8.LIZ(((Word) ListProtector.get(utterance.getWords(), i2)).getTag(), C13LQ.LJIIJ(C0EVA.values())))) {
                        long startTime = ((Word) ListProtector.get(utterance.getWords(), i4)).getStartTime();
                        long endTime = ((Word) ListProtector.get(utterance.getWords(), i3)).getEndTime();
                        Utterance utteranceM322clone = utterance.m322clone();
                        utteranceM322clone.setStartTime(startTime);
                        utteranceM322clone.setEndTime(endTime);
                        utteranceM322clone.setWords(C13LP.LJLLILLLL(utteranceM322clone.getWords(), C13LZ.LJIILJJIL(i4, i2)));
                        arrayList2.add(utteranceM322clone);
                        i4 = i2;
                    }
                    if (i2 < utterance.getWords().size() && (!a0.LJJJIL(((Word) ListProtector.get(utterance.getWords(), i2)).getText()))) {
                        i3 = i2;
                    }
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(utterance);
            }
            for (Utterance utterance2 : arrayList2) {
                List<Word> words = utterance2.getWords();
                ListIterator<Word> listIterator = words.listIterator(words.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (C0EV8.LIZ(listIterator.previous().getTag(), C13LQ.LJJLL(C0EVA.values()))) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                List listLJLLILLLL = C13LP.LJLLILLLL(utterance2.getWords(), new IntRange(0, iNextIndex));
                if (!listLJLLILLLL.isEmpty()) {
                    Word word = new Word(0L, 0L, "", "", false, false);
                    word.setStartTime(((Word) C13LP.LJJJJZI(listLJLLILLLL)).getStartTime());
                    word.setEndTime(((Word) C13LP.LJJLIIIJJI(listLJLLILLLL)).getEndTime());
                    word.setText(C13LP.LJJLIIIJ(listLJLLILLLL, "", null, null, 0, null, AFwS234S0000000_5.get$arr$(67), 30));
                    word.setTag(((Word) C13LP.LJJJJZI(listLJLLILLLL)).getTag());
                    utterance2.setWords(C13LP.LJLIL(C13LP.LJLLILLLL(utterance2.getWords(), C13LZ.LJIILJJIL(iNextIndex + 1, utterance2.getWords().size())), Collections.singletonList(word)));
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next());
            }
            i = 1;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(C0EVA.SILENT, C0EVA.FILLER);
        int i5 = 0;
        int i6 = 0;
        for (Utterance utterance3 : arrayList) {
            if (C0EV8.LIZ(utterance3.getTag(), listLJIIJJI)) {
                i6++;
            }
            Iterator<Word> it4 = utterance3.getWords().iterator();
            while (it4.hasNext()) {
                if (C0EV8.LIZ(it4.next().getTag(), listLJIIJJI)) {
                    i5++;
                }
            }
        }
        if (i5 == 0 && i6 == 0) {
            u4.LJJLIIIJILLIZJL(c2217061Bpw.LIZ, c2217061Bpw.LJIJI, "empty", null, c2217061Bpw.LJFF ? 1 : 0, c2217061Bpw.LJJI, 56);
        } else {
            u4.LJJLIIIJ(c2217061Bpw.LIZ, c2217061Bpw.LJIJI, "success", Integer.valueOf(i5), Integer.valueOf(i6), null, c2217061Bpw.LJFF ? 1 : 0, c2217061Bpw.LJJI);
        }
        if (c2217061Bpw.LJFF && Intrinsics.LJFF(str, "succeed")) {
            VideoPublishEditModel videoPublishEditModel3 = c2217061Bpw.LIZ;
            long j2 = c2217061Bpw.LJIJI;
            if (C0E5N.LIZ()) {
                C0LAB c0labLJFF = u4.LJFF(videoPublishEditModel3, false, false, 6);
                c0labLJFF.LIZ(videoPublishEditModel3.getVideoLength(), "video_duration");
                c0labLJFF.LIZIZ(SystemClock.elapsedRealtime() - j2, "duration");
                c0labLJFF.LJ("api_type", "ep_caption");
                C20684815ws.LJIILLIIL("tool_performance_ep_apply_total", c0labLJFF.LIZ);
            }
        }
        c2217061Bpw.LJIILJJIL.LJIILLIIL = 0;
        c2217061Bpw.LJIILLIIL(0);
        if (!((C2217061Bpw) afS141S0200000_5.l0).LJIJJ) {
            C0CNO.LIZLLL(0L, new AwS549S0100000_5((C2217061Bpw) afS141S0200000_5.l0, 117));
        } else {
            ((C2217061Bpw) afS141S0200000_5.l0).LJIJJ = false;
            C2217061Bpw c2217061Bpw2 = (C2217061Bpw) afS141S0200000_5.l0;
            c2217061Bpw2.LJIJJLI = new C391210FVn(queryAudioResponse.lidLanguage, c2217061Bpw2.LIZLLL, queryAudioResponse.asrService, queryAudioResponse.mList, (Boolean) afS141S0200000_5.l1);
            Function0<Unit> function0 = ((C2217061Bpw) afS141S0200000_5.l0).LJJIIZ;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("NewRecognizeCaptionPresenter@6e2f.startRecognizeInternal$3");
    }

    public static final void accept$1(AfS141S0200000_5 afS141S0200000_5, Object obj) {
        C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestTopicsForTextEditPageWithEmptyText$2");
        if (obj != null) {
            ((Function2) afS141S0200000_5.l0).invoke(obj, "");
        } else {
            ((Function0) afS141S0200000_5.l1).invoke();
        }
        C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestTopicsForTextEditPageWithEmptyText$2");
    }

    public static final void accept$2(AfS141S0200000_5 afS141S0200000_5, Object obj) {
        C1C7U.LIZ("DraftFilterRestoreHandler@d656.restoreWithNet$2$subscribe$2");
        if (((InterfaceC20236714Gf) afS141S0200000_5.l0).isActive()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            ((C366710EZh) afS141S0200000_5.l1).getClass();
            sbLIZ.append("DraftFilterRestoreHandler");
            sbLIZ.append(" ; restore success ... ");
            C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS141S0200000_5.l0;
            ArrayList arrayListLJ = C1697810uHb.LJ(((C366710EZh) afS141S0200000_5.l1).LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
            C189200o6.m2constructorimpl(arrayListLJ);
            interfaceC20236714Gf.resumeWith(arrayListLJ);
        }
        C1C7U.LIZIZ("DraftFilterRestoreHandler@d656.restoreWithNet$2$subscribe$2");
    }

    public static final void accept$3(AfS141S0200000_5 afS141S0200000_5, Object obj) {
        C1C7U.LIZ("DraftFilterRestoreHandler@d656.restoreWithNet$2$subscribe$3");
        Throwable th = (Throwable) obj;
        if (((InterfaceC20236714Gf) afS141S0200000_5.l0).isActive()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            ((C366710EZh) afS141S0200000_5.l1).getClass();
            sbLIZ.append("DraftFilterRestoreHandler");
            sbLIZ.append(" ; restore failed ... ; e : ");
            sbLIZ.append(Log.getStackTraceString(th));
            C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C366710EZh c366710EZh = (C366710EZh) afS141S0200000_5.l1;
            AVDraftExtras aVDraftExtras = c366710EZh.LIZ.LJ.LJJJJIZL;
            aVDraftExtras.selectedFilterId = null;
            aVDraftExtras.selectedFilterResId = null;
            aVDraftExtras.selectedFilterLabel = null;
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS141S0200000_5.l0;
            ArrayList arrayListLJ = C1697810uHb.LJ(c366710EZh.LJI(2131832433, false, new DraftFileRestoreException(-3001, th, "Filter")));
            C189200o6.m2constructorimpl(arrayListLJ);
            interfaceC20236714Gf.resumeWith(arrayListLJ);
        }
        C1C7U.LIZIZ("DraftFilterRestoreHandler@d656.restoreWithNet$2$subscribe$3");
    }

    public AfS141S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public AfS141S0200000_5(AddYoursStickerTopicRepo addYoursStickerTopicRepo, AwS619S0100000_5 awS619S0100000_5, AwS549S0100000_5 awS549S0100000_5, int i) {
        this.$t = i;
        this.l0 = awS619S0100000_5;
        this.l1 = awS549S0100000_5;
    }
}
