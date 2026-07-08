package X;

import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Dwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355510Dwj {
    public final C19EG LIZ;
    public final InterfaceC1455860nzM LIZIZ;
    public final NLEModel LIZJ;
    public final NLEEditor LIZLLL;
    public final INLEPlayer LJ;
    public final InterfaceC354920Dvm LJFF;
    public final C0E48 LJI;

    public final NLEModel LJ() {
        C0E48 c0e48 = this.LJI;
        return c0e48 != null ? C350870DpF.LJI(c0e48) : this.LIZJ;
    }

    public static final void LIZIZ(NLEModel nLEModel) {
        EditorProModel editorProModel;
        List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(nLEModel);
        if (!(listLJJLIIIJLJLI instanceof Collection) || !listLJJLIIIJLJLI.isEmpty()) {
            Iterator<NLETrack> it2 = listLJJLIIIJLJLI.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr sortedSlots = it2.next().getSortedSlots();
                if (!(sortedSlots instanceof Collection) || !sortedSlots.isEmpty()) {
                    Iterator<NLETrackSlot> it3 = sortedSlots.iterator();
                    while (it3.hasNext()) {
                        if (C351220Dpo.LLIIII(it3.next())) {
                            return;
                        }
                    }
                }
            }
        }
        EditModelProvider.Companion.getClass();
        VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
        if (editModel != null && (editorProModel = editModel.getEditorProModel()) != null) {
            editorProModel.setEditorProPipFilterEnterWay(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r4 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r4.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        r3 = r4.next();
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r2.getLayer() != (r7.size() - 1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r2.getSlots().isEmpty() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        r5 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLEModel r14, com.bytedance.ies.nle.editor_jni.NLETrackSlot r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355510Dwj.LIZJ(com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public final Integer LIZLLL(String str, String str2) {
        InterfaceC358220E2q value;
        LiveData<InterfaceC1453220nv6> liveDataZj2;
        InterfaceC1453220nv6 value2;
        LiveData<InterfaceC358220E2q> liveDataXq1;
        FilterBean filterBean = new FilterBean();
        filterBean.setResId(str);
        filterBean.setId(str2);
        InterfaceC1455860nzM interfaceC1455860nzM = this.LIZIZ;
        if (interfaceC1455860nzM != null && (liveDataXq1 = interfaceC1455860nzM.xq1()) != null) {
            value = liveDataXq1.getValue();
        } else {
            value = null;
        }
        InterfaceC1455860nzM interfaceC1455860nzM2 = this.LIZIZ;
        if (interfaceC1455860nzM2 == null || (liveDataZj2 = interfaceC1455860nzM2.zj2()) == null || (value2 = liveDataZj2.getValue()) == null || value == null) {
            return null;
        }
        return Integer.valueOf(value.LIZ(filterBean, value2));
    }

    public final NLETrackSlot LIZ(C355530Dwl c355530Dwl, String str, Float f, ResourceItem resourceItem, NLETrackSlot nLETrackSlot, NLEModel nLEModel) {
        boolean z;
        boolean z2;
        NLETrackSlot nLETrackSlotLJZI;
        int iLJJIIJZLJL;
        NLEResourceNode resource;
        int i;
        NLETrackSlot nLETrackSlotLL;
        NLEModel nLEModelLJ = nLEModel;
        Float fValueOf = f;
        if (nLETrackSlot != null) {
            z = true;
        } else {
            z = false;
        }
        if (fValueOf == null) {
            if (LIZLLL(resourceItem.getResourceId(), resourceItem.getEffectId()) != null) {
                fValueOf = Float.valueOf(r0.intValue() / 100.0f);
            } else {
                fValueOf = null;
            }
        }
        if (nLEModelLJ == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = "";
        if (z && nLETrackSlot != null) {
            String name = resourceItem.getName();
            String path = resourceItem.getPath();
            String effectId = resourceItem.getEffectId();
            String resourceId = resourceItem.getResourceId();
            String icon = resourceItem.getIcon();
            if (icon != null) {
                str2 = icon;
            }
            C350540Doi c350540Doi = new C350540Doi(str, name, path, effectId, resourceId, str2, nLETrackSlot.getStartTime(), nLETrackSlot.getDuration(), fValueOf, resourceItem.extra);
            if (nLETrackSlot.hasExtra("ep_slot_add_order")) {
                i = CastIntegerProtector.parseInt(nLETrackSlot.getExtra("ep_slot_add_order"));
            } else {
                i = 0;
            }
            InterfaceC354920Dvm interfaceC354920Dvm = this.LJFF;
            if (interfaceC354920Dvm != null && (nLETrackSlotLL = interfaceC354920Dvm.LL(nLETrackSlot, c350540Doi, EnumC356070Dxd.COMMIT, nLEModelLJ, z2)) != null) {
                nLETrackSlotLL.getMainSegment().getResource().setExtra("biz_res_id", C0FGD.LIZ(resourceId, "filtercomposer"));
                nLETrackSlotLL.setExtra("ep_slot_add_order", String.valueOf(i));
                return nLETrackSlotLL;
            }
            return null;
        }
        String name2 = resourceItem.getName();
        String path2 = resourceItem.getPath();
        String effectId2 = resourceItem.getEffectId();
        String resourceId2 = resourceItem.getResourceId();
        String icon2 = resourceItem.getIcon();
        if (icon2 == null) {
            icon2 = "";
        }
        long j = c355530Dwl.LIZJ;
        C350540Doi c350540Doi2 = new C350540Doi(str, name2, path2, effectId2, resourceId2, icon2, j, c355530Dwl.LIZLLL - j, fValueOf, resourceItem.extra);
        InterfaceC354920Dvm interfaceC354920Dvm2 = this.LJFF;
        if (interfaceC354920Dvm2 != null && (nLETrackSlotLJZI = interfaceC354920Dvm2.LJZI(true, c350540Doi2, c355530Dwl.LIZIZ, EnumC356070Dxd.COMMIT, nLEModelLJ)) != null) {
            NLESegment mainSegment = nLETrackSlotLJZI.getMainSegment();
            if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                resource.setExtra("biz_res_id", C0FGD.LIZ(resourceId2, "filtercomposer"));
            }
            if (nLEModelLJ == null && (nLEModelLJ = LJ()) == null) {
                iLJJIIJZLJL = 0;
            } else {
                iLJJIIJZLJL = C351220Dpo.LJJIIJZLJL(nLEModelLJ);
            }
            nLETrackSlotLJZI.setExtra("ep_slot_add_order", String.valueOf(iLJJIIJZLJL));
            nLETrackSlotLJZI.setExtra("is_ep_global_color_filter", String.valueOf(z2));
            return nLETrackSlotLJZI;
        }
        return null;
    }

    public C355510Dwj(C19EG c19eg, InterfaceC1455860nzM interfaceC1455860nzM, NLEModel nLEModel, NLEEditor nLEEditor, INLEPlayer iNLEPlayer, InterfaceC354920Dvm interfaceC354920Dvm, C0E48 c0e48) {
        this.LIZ = c19eg;
        this.LIZIZ = interfaceC1455860nzM;
        this.LIZJ = nLEModel;
        this.LIZLLL = nLEEditor;
        this.LJ = iNLEPlayer;
        this.LJFF = interfaceC354920Dvm;
        this.LJI = c0e48;
    }
}
