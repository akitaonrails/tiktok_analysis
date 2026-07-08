package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor;

import X.C01NB;
import X.C09JN;
import X.C0UO0;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C19487311Lz;
import X.C1AZW;
import X.C20357914lF;
import X.C20359314lT;
import X.C20359414lU;
import X.C20360614lg;
import X.C20361214lm;
import X.C20377814oS;
import X.C20378714ob;
import X.C20379114of;
import X.C20379214og;
import X.C20424614w0;
import X.C20424714w1;
import X.C20424814w2;
import X.C20425114w5;
import X.C20425514w9;
import X.C20426114wF;
import X.C20426214wG;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C403501hZ;
import X.C405101hp;
import X.C480460Ism;
import X.C516201zk;
import X.C5183020f;
import X.C758560TpG;
import X.EnumC994540bzI;
import X.InterfaceC170900l9;
import Y.AfS200S0100000_31;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multilive.model.MaterialsGetImagesParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailParams;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookDecorationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookUGCDecorationTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS150S0201000_31;
import kotlin.jvm.internal.AwS35S0200100_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.PlayImage;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BasePlaybookEditorViewModel extends ViewModel {
    public static final Set<String> LLILZLL = C13LQ.LJLIIL(new String[]{"layout", "effects", "shared_background", "notice_board", "header"});
    public final DataChannel LL;
    public final BasePlaybookService<?> LLILLJJLI;
    public final C20378714ob LLILLL = new C20378714ob();
    public final C20377814oS LLILZ;
    public Playbook LLILZIL;

    public abstract int yQ2();

    public final void HA2() {
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", "clearSelection", null, null);
        this.LLILLL.LJI.setValue(null);
        this.LLILLL.LJFF.setValue(null);
        this.LLILLL.LJII.setValue(EnumC994540bzI.NORMAL);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        PlayRule playRule;
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", "onCleared", null, null);
        super.onCleared();
        C20378714ob c20378714ob = this.LLILLL;
        LinkedHashMap<String, List<C20361214lm>> value = c20378714ob.LJ.getValue();
        if (value != null) {
            Iterator<Map.Entry<String, List<C20361214lm>>> it2 = value.entrySet().iterator();
            while (it2.hasNext()) {
                List<C20361214lm> value2 = it2.next().getValue();
                if (value2 != null) {
                    for (C20361214lm c20361214lm : value2) {
                        if (c20361214lm != null && (playRule = c20361214lm.LIZLLL) != null) {
                            playRule.destroy();
                        }
                    }
                }
            }
        }
        c20378714ob.LJ.postValue(null);
        c20378714ob.LIZIZ.postValue(null);
        c20378714ob.LJI.postValue(null);
        c20378714ob.LJFF.postValue(null);
        c20378714ob.LJII.postValue(EnumC994540bzI.NORMAL);
        c20378714ob.LIZJ.postValue(null);
        MutableLiveData<Boolean> mutableLiveData = c20378714ob.LIZ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        c20378714ob.LIZLLL.postValue(bool);
        HA2();
        C20377814oS c20377814oS = this.LLILZ;
        c20377814oS.getClass();
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", "destroy", null, null);
        c20377814oS.LIZLLL().LJ();
        c20377814oS.LIZJ.LIZJ();
        c20377814oS.LIZJ.LIZIZ();
        C20379114of c20379114of = c20377814oS.LJ;
        if (c20379114of != null) {
            PlaybookUtilKt.LJII(c20379114of);
        }
        c20377814oS.LJ = null;
    }

    public static boolean BQ2(C20361214lm c20361214lm) {
        return C13LP.LJJJJ(zQ2(c20361214lm), LLILZLL);
    }

    public static List xQ2(C20359414lU c20359414lU) {
        List<C20361214lm> list;
        if (c20359414lU != null && (list = c20359414lU.LIZJ) != null) {
            ArrayList arrayList = new ArrayList();
            for (C20361214lm c20361214lm : list) {
                if (BQ2(c20361214lm)) {
                    arrayList.add(c20361214lm);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static String zQ2(C20361214lm c20361214lm) {
        PlayRule playRule;
        C20357914lF config;
        if (c20361214lm != null && (playRule = c20361214lm.LIZLLL) != null && (config = playRule.getConfig()) != null) {
            return config.LIZ;
        }
        return null;
    }

    public final boolean AQ2(C20359414lU c20359414lU) {
        Long lValueOf;
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        if ((!xQ2(c20359414lU).isEmpty()) && MultiGuestPlaybookDecorationSetting.INSTANCE.enable() && PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            if (C758560TpG.LIZ || MultiGuestPlaybookUGCDecorationTestSetting.INSTANCE.enable()) {
                C20377814oS c20377814oS = this.LLILZ;
                if (c20359414lU != null && (lValueOf = Long.valueOf(c20359414lU.LIZ)) != null) {
                    C20379114of c20379114of = c20377814oS.LJ;
                    if (c20379114of != null && (c20360614lg = c20379114of.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null) {
                        Iterator<C20359414lU> it2 = list.iterator();
                        int i = 0;
                        while (it2.hasNext()) {
                            if (it2.next().LIZ == lValueOf.longValue()) {
                                if (i == 0) {
                                    return true;
                                }
                                return false;
                            }
                            i++;
                        }
                        return false;
                    }
                    return false;
                }
                c20377814oS.getClass();
                return false;
            }
            return false;
        }
        return false;
    }

    public final void CQ2(C20359414lU c20359414lU) {
        C20426114wF c20426114wFLJ;
        List<C20425114w5> list;
        C20425114w5 c20425114w5LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modifyStep step=");
        sbLIZ.append(c20359414lU);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        C20377814oS c20377814oS = this.LLILZ;
        c20377814oS.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("modifyStep task=");
        sbLIZ2.append(c20359414lU);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C20379114of c20379114of = c20377814oS.LJ;
        if (c20379114of != null && c20379114of.LIZIZ != null && (c20426114wFLJ = c20377814oS.LIZJ.LJ()) != null && (list = c20426114wFLJ.LIZLLL) != null && (c20425114w5LIZIZ = C20379214og.LIZIZ(Long.valueOf(c20359414lU.LIZ), list)) != null) {
            C20424714w1 c20424714w1 = c20425114w5LIZIZ.LIZLLL;
            if (c20424714w1 != null) {
                c20424714w1.LIZJ = c20359414lU.LIZIZ;
                c20424714w1.LIZLLL = c20359414lU.LIZLLL;
                c20424714w1.LJ = c20359414lU.LJ;
                c20424714w1.LJFF = c20359414lU.LJFF;
            }
            C20426114wF c20426114wFLJII = c20377814oS.LIZJ.LJII(c20425114w5LIZIZ);
            C20379114of c20379114of2 = c20377814oS.LJ;
            if (c20379114of2 != null) {
                PlaybookUtilKt.LJIIJJI(c20379114of2, c20377814oS.LIZLLL, c20426114wFLJII);
            }
            c20377814oS.LIZIZ();
        }
    }

    public final void DQ2(C20359414lU c20359414lU) {
        C20426114wF c20426114wFLJII;
        List<C20425114w5> list;
        String str;
        List<C20425114w5> list2;
        C20425114w5 c20425114w5LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modifyStepPreset step=");
        sbLIZ.append(c20359414lU);
        C20426114wF c20426114wF = null;
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        C20377814oS c20377814oS = this.LLILZ;
        c20377814oS.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("modifyStepPreset step=");
        sbLIZ2.append(c20359414lU);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C20379114of c20379114of = c20377814oS.LJ;
        if (c20379114of != null && c20379114of.LIZIZ != null) {
            C20426114wF c20426114wFLJ = c20377814oS.LIZJ.LJ();
            if (c20426114wFLJ != null && (list2 = c20426114wFLJ.LIZLLL) != null && (c20425114w5LIZIZ = C20379214og.LIZIZ(Long.valueOf(c20359414lU.LIZ), list2)) != null) {
                C20424714w1 c20424714w1 = c20425114w5LIZIZ.LIZLLL;
                if (c20424714w1 != null) {
                    c20424714w1.LJFF = c20359414lU.LJFF;
                }
                c20426114wFLJII = c20377814oS.LIZJ.LJII(c20425114w5LIZIZ);
            } else {
                c20426114wFLJII = null;
            }
            if (!c20359414lU.LIZJ.isEmpty()) {
                List<C20361214lm> list3 = c20359414lU.LIZJ;
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list3, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C20361214lm c20361214lm : list3) {
                    linkedHashMap.put(Long.valueOf(c20361214lm.LIZIZ), c20361214lm);
                }
                C20426114wF c20426114wFLJ2 = c20377814oS.LIZJ.LJ();
                if (c20426114wFLJ2 != null && (list = c20426114wFLJ2.LIZLLL) != null) {
                    ArrayList<C20425114w5> arrayList = new ArrayList();
                    for (C20425114w5 c20425114w5 : list) {
                        C20425114w5 c20425114w52 = c20425114w5;
                        if (Intrinsics.LJFF(c20425114w52.LIZIZ, "Task") && linkedHashMap.containsKey(Long.valueOf(c20425114w52.LIZ))) {
                            arrayList.add(c20425114w5);
                        }
                    }
                    for (C20425114w5 c20425114w53 : arrayList) {
                        C20424814w2 c20424814w2 = c20425114w53.LIZJ;
                        if (c20424814w2 != null) {
                            C20361214lm c20361214lm2 = (C20361214lm) linkedHashMap.get(Long.valueOf(c20425114w53.LIZ));
                            if (c20361214lm2 != null) {
                                str = c20361214lm2.LJII;
                            } else {
                                str = null;
                            }
                            c20424814w2.LJIIIIZZ = str;
                        }
                        c20426114wFLJII = c20377814oS.LIZJ.LJII(c20425114w53);
                    }
                }
            }
            c20426114wF = c20426114wFLJII;
        }
        C20379114of c20379114of2 = c20377814oS.LJ;
        if (c20379114of2 != null) {
            PlaybookUtilKt.LJIIJJI(c20379114of2, c20377814oS.LIZLLL, c20426114wF);
        }
        c20377814oS.LIZIZ();
    }

    public void EQ2(Playbook playbook) {
        long j;
        this.LLILZIL = playbook;
        if (playbook != null) {
            C20377814oS c20377814oS = this.LLILZ;
            PlaybookFetchDetailParams playbookFetchDetailParams = new PlaybookFetchDetailParams();
            playbookFetchDetailParams.playbookId = playbook.playbookId;
            PlaybookContent playbookContent = playbook.content;
            if (playbookContent != null) {
                j = playbookContent.playbookContentId;
            } else {
                j = 0;
            }
            playbookFetchDetailParams.playbookContentId = j;
            playbookFetchDetailParams.notTranslateStarling = true;
            playbookFetchDetailParams.scene = 1;
            c20377814oS.getClass();
            C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", "fetchDetail start", null, null);
            C480460Ism.LIZ().getClass();
            c20377814oS.LIZLLL().LIZ(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).fetchDetail(playbookFetchDetailParams), "Editor_PlaybookEditorModel", "fetchDetail")).LJJ(C405101hp.LIZLLL).LJJIIZ(new AfS200S0100000_31(c20377814oS, 38), new C09JN() { // from class: X.00LF
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PlaybookEditorModel@872e.fetchDetail$2");
                    C1C7U.LIZIZ("PlaybookEditorModel@872e.fetchDetail$2");
                }
            }));
        } else {
            C20377814oS c20377814oS2 = this.LLILZ;
            int iYQ2 = yQ2();
            C5183020f c5183020f = new C5183020f(this, 47);
            c20377814oS2.getClass();
            C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", "createLocalPlaybook", null, null);
            C403501hZ.LIZ(new AwS150S0201000_31(c20377814oS2, c5183020f, iYQ2, 2));
        }
        MutableLiveData<LinkedHashMap<String, List<C20361214lm>>> mutableLiveData = this.LLILLL.LJ;
        C20377814oS c20377814oS3 = this.LLILZ;
        c20377814oS3.LIZLLL.LJIIJ.clear();
        mutableLiveData.postValue(c20377814oS3.LIZLLL.LJIIIZ("Playbook_Editor"));
    }

    public final void FQ2(C20359414lU c20359414lU) {
        C20360614lg c20360614lg;
        C20425114w5 c20425114w5LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeStep stepId=");
        sbLIZ.append(c20359414lU.LIZ);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        C20377814oS c20377814oS = this.LLILZ;
        long j = c20359414lU.LIZ;
        c20377814oS.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("removeStep stepId=");
        sbLIZ2.append(j);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", C2188811AlT.LIZIZ(sbLIZ2), null, null);
        C20379114of c20379114of = c20377814oS.LJ;
        if (c20379114of != null && c20379114of.LIZIZ != null) {
            C20426114wF c20426114wFLJIIL = c20377814oS.LIZJ.LJIIL(j);
            C20379114of c20379114of2 = c20377814oS.LJ;
            if (c20379114of2 != null) {
                PlaybookUtilKt.LJIIJJI(c20379114of2, c20377814oS.LIZLLL, c20426114wFLJIIL);
            }
            C20379114of c20379114of3 = c20377814oS.LJ;
            if (c20379114of3 != null && (c20360614lg = c20379114of3.LIZIZ) != null && c20360614lg.LIZIZ.isEmpty() && (c20425114w5LJIIIIZZ = C20425514w9.LJIIIIZZ(c20377814oS.LIZJ, "")) != null) {
                C20426114wF c20426114wFLIZ = c20377814oS.LIZJ.LIZ(c20360614lg.LIZ, c20425114w5LJIIIIZZ);
                C20379114of c20379114of4 = c20377814oS.LJ;
                if (c20379114of4 != null) {
                    PlaybookUtilKt.LJIIJJI(c20379114of4, c20377814oS.LIZLLL, c20426114wFLIZ);
                }
            }
            c20377814oS.LIZIZ();
        }
    }

    public final void GQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCoverLocalPath filePath=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LLILLL.LIZJ.postValue(str);
        C20379114of value = this.LLILLL.LIZIZ.getValue();
        if (value != null) {
            PlaybookContent playbookContent = value.LIZ.content;
            if (playbookContent != null) {
                playbookContent.coverUri = "";
                playbookContent.coverUrl = str;
            }
            this.LLILLL.LIZIZ.postValue(value);
        }
    }

    public final C20379114of vQ2(C20359414lU c20359414lU, List<C20361214lm> list) {
        C20426114wF c20426114wFLJII;
        List<C20425114w5> list2;
        C20425114w5 c20425114w5LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("appendTasks step=");
        sbLIZ.append(c20359414lU);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        C20377814oS c20377814oS = this.LLILZ;
        c20377814oS.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("appendTasks, step=");
        sbLIZ2.append(c20359414lU.LIZ);
        sbLIZ2.append(" states=");
        sbLIZ2.append(list);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", C2188811AlT.LIZIZ(sbLIZ2), null, null);
        loop0: while (true) {
            c20426114wFLJII = null;
            for (C20361214lm c20361214lm : list) {
                PlayRule playRule = c20361214lm.LIZLLL;
                if (playRule != null) {
                    C20425114w5 c20425114w5LJIIIZ = c20377814oS.LIZJ.LJIIIZ(playRule.getConfig().LIZIZ, playRule.getConfig().LIZJ, c20361214lm.LIZ, "", c20361214lm.LJI, C20359314lT.LIZLLL(c20361214lm));
                    if (c20425114w5LJIIIZ != null) {
                        C20425514w9 c20425514w9 = c20377814oS.LIZJ;
                        long j = c20359414lU.LIZ;
                        c20425514w9.getClass();
                        C20426214wG c20426214wG = (C20426214wG) c20425514w9.LJIILIIL(true, null, "appendSingleStateBranch", new AwS35S0200100_31(j, C20424614w0.LIZ(c20425114w5LJIIIZ), c20425514w9, 1));
                        if (c20426214wG != null) {
                            c20426114wFLJII = new C20426114wF(c20426214wG);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
            c20359414lU.LJ = null;
            C20426114wF c20426114wFLJ = c20377814oS.LIZJ.LJ();
            if (c20426114wFLJ != null && (list2 = c20426114wFLJ.LIZLLL) != null && (c20425114w5LIZIZ = C20379214og.LIZIZ(Long.valueOf(c20359414lU.LIZ), list2)) != null) {
                C20424714w1 c20424714w1 = c20425114w5LIZIZ.LIZLLL;
                if (c20424714w1 != null) {
                    c20424714w1.LJ = c20359414lU.LJ;
                }
                c20426114wFLJII = c20377814oS.LIZJ.LJII(c20425114w5LIZIZ);
            }
        }
        if (c20426114wFLJII != null) {
            C20379114of c20379114of = c20377814oS.LJ;
            if (c20379114of != null) {
                PlaybookUtilKt.LJIIJJI(c20379114of, c20377814oS.LIZLLL, c20426114wFLJII);
            }
            c20377814oS.LIZIZ();
        }
        return c20377814oS.LJ;
    }

    public final void wQ2(MaterialsGetImagesParams materialsGetImagesParams, InterfaceC170900l9<List<PlayImage>> interfaceC170900l9) {
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", "getCoverImages", null, null);
        this.LLILZ.getClass();
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", "getCoverImages start", null, null);
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).getImages(materialsGetImagesParams), "Editor_PlaybookEditorModel", "getImages").LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.00SU
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlaybookEditorModel@872e.getCoverImages$1");
                C930480aJy.LIZ.getClass();
                if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
                    C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", "getImages success", null, null);
                }
                C1C7U.LIZIZ("PlaybookEditorModel@872e.getCoverImages$1");
            }
        })).LJFF(new C0UO0()), this.LLILZ.LIZLLL(), new C516201zk(interfaceC170900l9, 44), new C516201zk(interfaceC170900l9, 45), 24);
    }

    public BasePlaybookEditorViewModel(DataChannel dataChannel, BasePlaybookService<?> basePlaybookService, WeakReference<Context> weakReference) {
        this.LL = dataChannel;
        this.LLILLJJLI = basePlaybookService;
        this.LLILZ = new C20377814oS(dataChannel, weakReference);
    }

    public final void HQ2(String str, String str2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCoverUri uri=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorViewModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LLILLL.LIZJ.postValue(null);
        this.LLILLL.LIZLLL.postValue(Boolean.valueOf(z));
        C20379114of value = this.LLILLL.LIZIZ.getValue();
        if (value != null) {
            PlaybookContent playbookContent = value.LIZ.content;
            if (playbookContent != null) {
                playbookContent.coverUri = str;
                playbookContent.coverUrl = str2;
            }
            this.LLILLL.LIZIZ.postValue(value);
        }
    }
}
