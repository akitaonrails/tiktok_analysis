package X;

import android.text.Editable;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.extra.PlaybookEditorBizExtraDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc.PGCPlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.tag.PlaybookEditorAddTagDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookContentExtra;
import webcast.data.multi_guest_play.PlaybookCoverInfo;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: renamed from: X.01zZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515101zZ implements C092O {
    public final int $t;
    public Object l0;

    @Override // X.C092O
    public final void accept(Object obj) throws Throwable {
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
        }
    }

    public C515101zZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C515101zZ c515101zZ, Object obj) {
        ((PlaybookEditorBizExtraDialog) c515101zZ.l0).close(1);
    }

    public static final void accept$1(C515101zZ c515101zZ, Object obj) throws Throwable {
        Editable editableLLLFZ;
        Editable editableLLLFZ2;
        Playbook playbook;
        PlaybookContent playbookContent;
        Playbook playbook2;
        PlaybookContent playbookContent2;
        LiveEditText liveEditText = ((PlaybookEditorBizExtraDialog) c515101zZ.l0).LLLF;
        if (liveEditText != null) {
            editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVTkoxr5cdyPaOO/+VIHnpjnMeQLcaVLxSg6d0dOiAuZAuEs", null));
        } else {
            editableLLLFZ = null;
        }
        String strValueOf = String.valueOf(editableLLLFZ);
        LiveEditText liveEditText2 = ((PlaybookEditorBizExtraDialog) c515101zZ.l0).LLLFF;
        if (liveEditText2 != null) {
            editableLLLFZ2 = C2204961BRm.LLLFZ(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GRAvPEceM8Zqav/OjVTkoxr5cdyPaOO/+VIHnpjnMeQLcaVLxSg6d0dOiAuZAuEs", null));
        } else {
            editableLLLFZ2 = null;
        }
        String strValueOf2 = String.valueOf(editableLLLFZ2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!a0.LJJJIL(strValueOf)) {
            linkedHashMap.put("starling_key", strValueOf);
        }
        if (!a0.LJJJIL(strValueOf2)) {
            linkedHashMap.put("icon_url", strValueOf2);
        }
        PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel = ((PlaybookEditorBizExtraDialog) c515101zZ.l0).LLJZIJLIL;
        if (pGCPlaybookEditorViewModel != null) {
            if (linkedHashMap.isEmpty()) {
                C20379114of value = pGCPlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
                if (value != null && (playbook2 = value.LIZ) != null && (playbookContent2 = playbook2.content) != null) {
                    playbookContent2.contentExtra = null;
                }
            } else {
                PlaybookCoverInfo playbookCoverInfo = new PlaybookCoverInfo();
                String str = (String) linkedHashMap.get("starling_key");
                if (str != null) {
                    playbookCoverInfo.starlingKey = str;
                }
                String str2 = (String) linkedHashMap.get("icon_url");
                if (str2 != null) {
                    playbookCoverInfo.iconUrl = str2;
                }
                if (C500260Jjc.LJJIIZ((CharSequence) linkedHashMap.get("starling_key")) || C500260Jjc.LJJIIZ((CharSequence) linkedHashMap.get("starling_key"))) {
                    playbookCoverInfo.iconPosition = 1;
                }
                C20379114of value2 = pGCPlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
                if (value2 != null && (playbook = value2.LIZ) != null && (playbookContent = playbook.content) != null) {
                    PlaybookContentExtra playbookContentExtra = new PlaybookContentExtra();
                    playbookContentExtra.coverInfo = playbookCoverInfo;
                    playbookContent.contentExtra = playbookContentExtra;
                }
            }
            pGCPlaybookEditorViewModel.LLILLL.LJIIJ.setValue(linkedHashMap);
        }
        ((PlaybookEditorBizExtraDialog) c515101zZ.l0).close(1);
    }

    public static final void accept$2(C515101zZ c515101zZ, Object obj) {
        if (((PlaybookEditorAddTagDialog) c515101zZ.l0).getContext() != null) {
            PlaybookEditorAddTagDialog playbookEditorAddTagDialog = (PlaybookEditorAddTagDialog) c515101zZ.l0;
            playbookEditorAddTagDialog.LLJZIJLIL.IQ2();
            playbookEditorAddTagDialog.close(1);
        }
    }

    public static final void accept$3(C515101zZ c515101zZ, Object obj) {
        Integer value;
        Playbook playbook;
        PlaybookContent playbookContent;
        if (((PlaybookEditorAddTagDialog) c515101zZ.l0).LLJZIJLIL.LLILLL.LJIIJJI.getValue() == null || ((value = ((PlaybookEditorAddTagDialog) c515101zZ.l0).LLJZIJLIL.LLILLL.LJIIJJI.getValue()) != null && value.intValue() == 0)) {
            C766270U4b.LJIIJJI("Please select first level tag type first.");
            return;
        }
        if (((PlaybookEditorAddTagDialog) c515101zZ.l0).LLJZIJLIL.LLILLL.LJIIL.getValue() != null && !(!r0.isEmpty())) {
            C766270U4b.LJIIJJI("Please select second level tag type first.");
            return;
        }
        PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel = ((PlaybookEditorAddTagDialog) c515101zZ.l0).LLJZIJLIL;
        Integer value2 = pGCPlaybookEditorViewModel.LLILLL.LJIIJJI.getValue();
        if (value2 != null) {
            int iIntValue = value2.intValue();
            Map<Integer, List<Integer>> value3 = pGCPlaybookEditorViewModel.LLILLL.LJIIIZ.getValue();
            if (value3 == null) {
                value3 = new LinkedHashMap<>();
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            List<Integer> arrayList = value3.get(Integer.valueOf(iIntValue));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            List<Integer> value4 = pGCPlaybookEditorViewModel.LLILLL.LJIIL.getValue();
            if (value4 != null) {
                arrayList.addAll(value4);
            }
            value3.put(numValueOf, arrayList);
            pGCPlaybookEditorViewModel.LLILLL.LJIIIZ.postValue(value3);
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = value3.keySet().iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Number) it2.next()).intValue();
                PlaybookTagAggregation playbookTagAggregation = new PlaybookTagAggregation();
                playbookTagAggregation.playbookFirstLevelTagType = iIntValue2;
                playbookTagAggregation.tags = new ArrayList();
                List<Integer> list = value3.get(Integer.valueOf(iIntValue2));
                if (list != null) {
                    Iterator<Integer> it3 = list.iterator();
                    while (it3.hasNext()) {
                        int iIntValue3 = it3.next().intValue();
                        List<PlaybookTagInfo> list2 = playbookTagAggregation.tags;
                        PlaybookTagInfo playbookTagInfo = new PlaybookTagInfo();
                        playbookTagInfo.tagType = iIntValue3;
                        list2.add(playbookTagInfo);
                    }
                }
                arrayList2.add(playbookTagAggregation);
            }
            C20379114of value5 = pGCPlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
            if (value5 != null && (playbook = value5.LIZ) != null && (playbookContent = playbook.content) != null) {
                playbookContent.tagAggregations = arrayList2;
            }
        }
        pGCPlaybookEditorViewModel.LLILLL.LJIIJJI.postValue(0);
        pGCPlaybookEditorViewModel.LLILLL.LJIIL.postValue(null);
        ((PlaybookEditorAddTagDialog) c515101zZ.l0).close(1);
    }

    public static final void accept$4(C515101zZ c515101zZ, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c515101zZ.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }
}
