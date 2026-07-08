package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.magic.CombineEffectPointModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ERt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364750ERt extends C0EWG {
    public final C554970Lpf LJI;
    public final Map<String, Effect> LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;

    @Override // X.C0EWG, X.InterfaceC365900EWe
    public final int LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0EWG, X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LJI;
    }

    @Override // X.C0EWG, X.InterfaceC365900EWe
    public final int getPriority() {
        return this.LJIIIZ;
    }

    public C364750ERt(C554970Lpf c554970Lpf) {
        super(c554970Lpf);
        this.LJI = c554970Lpf;
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = 16;
        this.LJIIIZ = 1400;
    }

    @Override // X.AbstractC365860EWa, X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        String resDir;
        if (((Boolean) C284620BDo.LIZ.getValue()).booleanValue()) {
            List<CombineEffectPointModel> list = this.LJI.LJ.LIZ.magicCombineEffectModel.magicCombineEffectModelList;
            boolean z = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (CombineEffectPointModel combineEffectPointModel : list) {
                    if (C123100dR.LIZ(combineEffectPointModel.getResourceId()) || (resDir = combineEffectPointModel.getResDir()) == null || resDir.length() == 0 || !C2286708xd.LIZJ(combineEffectPointModel.getResDir())) {
                        z = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        return super.LIZJ(interfaceC1364105Vn);
    }

    @Override // X.C0EWG, X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return Boolean.valueOf(this.LJI.LJ.LIZ.magicCombineEffectModel.magicCombineEffectModelList.isEmpty());
    }

    @Override // X.C0EWG, X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        List<CombineEffectPointModel> list = awemeDraft.LIZ.magicCombineEffectModel.magicCombineEffectModelList;
        ArrayList arrayList = new ArrayList();
        Iterator<CombineEffectPointModel> it2 = list.iterator();
        while (it2.hasNext()) {
            String resDir = it2.next().getResDir();
            if (resDir != null && resDir.length() > 0) {
                arrayList.add(resDir);
            }
        }
        if (arrayList.isEmpty()) {
            return C2097608Jq.LJ();
        }
        return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, arrayList));
    }

    @Override // X.AbstractC365860EWa, X.AbstractC365870EWb
    public final Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        final String panel;
        C19FO c19fo;
        String resDir;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        List<CombineEffectPointModel> list = this.LJI.LJ.LIZ.magicCombineEffectModel.magicCombineEffectModelList;
        ArrayList arrayList = new ArrayList();
        for (CombineEffectPointModel combineEffectPointModel : list) {
            CombineEffectPointModel combineEffectPointModel2 = combineEffectPointModel;
            String key = combineEffectPointModel2.getKey();
            if (key == null || key.length() == 0 || Intrinsics.LJFF(combineEffectPointModel2.getKey(), CardStruct.IStatusCode.DEFAULT) || (resDir = combineEffectPointModel2.getResDir()) == null || resDir.length() == 0 || !C2286708xd.LIZJ(combineEffectPointModel2.getResDir())) {
                arrayList.add(combineEffectPointModel);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((CombineEffectPointModel) it2.next()).getResourceId());
            }
            List listLLIIII = C13LP.LLIIII(C13LP.LJJJJLI(arrayList2));
            Context context = this.LJI.LIZ.get();
            if ((context instanceof C19EG) && (c19fo = (C19FO) context) != null) {
                this.LIZIZ.kg(c19fo);
            }
            CombineEffectPointModel combineEffectPointModel3 = (CombineEffectPointModel) C13LP.LJJJLL(arrayList);
            if (combineEffectPointModel3 == null || (panel = combineEffectPointModel3.getPanel()) == null) {
                panel = "editor_pro_gameplay";
            }
            HashMap map = new HashMap();
            map.put("panel", panel);
            this.LIZIZ.LJJIJIIJI(listLLIIII, true, map, new IFetchEffectListListener() { // from class: X.0ERs
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult exceptionResult) {
                    this.LIZ.LJIIJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DraftMagicEffectAdapterRestoreHandler ; fileType : ");
                    sbLIZ.append(this.LIZ.LJIIIIZZ);
                    sbLIZ.append(" ; restore failed ... ");
                    C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = c2252611DEt;
                    ArrayList arrayListLJ = C1697810uHb.LJ(this.LIZ.LJI(2131832433, false, new DraftFileRestoreException(exceptionResult.getErrorCode() - 30000, exceptionResult.getException(), "EffectPlatform")));
                    C189200o6.m2constructorimpl(arrayListLJ);
                    interfaceC20236714Gf.resumeWith(arrayListLJ);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> list2) {
                    List<Effect> list3 = list2;
                    Map<String, Effect> map2 = this.LIZ.LJII;
                    String str = panel;
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list3, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (Effect effect : list3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(effect.getResourceId());
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), effect);
                    }
                    map2.putAll(linkedHashMap);
                    if (c2252611DEt.isActive()) {
                        C364750ERt c364750ERt = this.LIZ;
                        Iterator<Effect> it3 = list3.iterator();
                        while (true) {
                            CombineEffectPointModel combineEffectPointModel4 = null;
                            if (it3.hasNext()) {
                                Effect next = it3.next();
                                Iterator<CombineEffectPointModel> it4 = c364750ERt.LJI.LJ.LIZ.magicCombineEffectModel.magicCombineEffectModelList.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    CombineEffectPointModel next2 = it4.next();
                                    if (Intrinsics.LJFF(next2.getResourceId(), next.getResourceId())) {
                                        combineEffectPointModel4 = next2;
                                        break;
                                    }
                                }
                                CombineEffectPointModel combineEffectPointModel5 = combineEffectPointModel4;
                                if (combineEffectPointModel5 != null) {
                                    combineEffectPointModel5.setKey(next.getEffectId());
                                    combineEffectPointModel5.setName(next.getName());
                                    combineEffectPointModel5.setResDir(next.getUnzipPath());
                                }
                            } else {
                                InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = c2252611DEt;
                                ArrayList arrayListLJ = C1697810uHb.LJ(this.LIZ.LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
                                C189200o6.m2constructorimpl(arrayListLJ);
                                interfaceC20236714Gf.resumeWith(arrayListLJ);
                                return;
                            }
                        }
                    }
                }
            });
        } else {
            ArrayList arrayListLJ = C1697810uHb.LJ(LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
            C189200o6.m2constructorimpl(arrayListLJ);
            c2252611DEt.resumeWith(arrayListLJ);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
