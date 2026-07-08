package Y;

import X.AbstractC1432780nO8;
import X.C01TT;
import X.C0CHQ;
import X.C1419310n2P;
import X.C1443030nef;
import X.C1499900p8O;
import X.C15O7;
import X.C1655450tBH;
import X.C1688680u2s;
import X.C1837707Hr;
import X.C1837907Ht;
import X.C194463116f;
import X.C1C7U;
import X.C346630DiP;
import X.C580450Mpf;
import X.C786410Ut5;
import X.C810670Vr7;
import X.InterfaceC1432820nOC;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Unit;
import v7.o;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS39S1300000_22 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS39S1300000_22 aCallableS39S1300000_22) {
        AVChallenge aVChallengeLIZJ;
        String[] stringArrayExtra;
        AVChallenge aVChallenge;
        String[] stringArrayExtra2;
        Intent intent = (Intent) aCallableS39S1300000_22.l1;
        String str = aCallableS39S1300000_22.s0;
        Context context = (Context) aCallableS39S1300000_22.l2;
        o oVar = (o) aCallableS39S1300000_22.l3;
        C1C7U.LIZ("AVToolsHelper@51fc.fetchChallengeDetail$1L");
        try {
            ArrayList arrayList = new ArrayList();
            if (C1837707Hr.LIZ() && (stringArrayExtra2 = intent.getStringArrayExtra("csi_challenge_ids")) != null && stringArrayExtra2.length > 0) {
                for (String str2 : stringArrayExtra2) {
                    arrayList.add(C194463116f.LIZJ(str2, false));
                }
            }
            if (C1837907Ht.LIZ() && (stringArrayExtra = intent.getStringArrayExtra("csi_challenge_names")) != null && stringArrayExtra.length > 0) {
                ArrayList<C15O7> arrayList2 = new ArrayList();
                for (String str3 : stringArrayExtra) {
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(C15O7.LIZJ(new ACallableS23S1000000_8(str3, 3)));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C15O7.LJJ(arrayList2).LJIJJLI();
                    for (C15O7 c15o7 : arrayList2) {
                        if (!c15o7.LJIILL() && !c15o7.LJIILIIL() && (aVChallenge = (AVChallenge) c15o7.LJIIL()) != null) {
                            arrayList.add(aVChallenge);
                        }
                    }
                }
            }
            if (str == null) {
                if (C1837707Hr.LIZ() && !arrayList.isEmpty()) {
                    aVChallengeLIZJ = (AVChallenge) arrayList.get(0);
                    ((ArrayList) C1443030nef.LJII().LIZ).clear();
                } else {
                    aVChallengeLIZJ = null;
                }
            } else {
                aVChallengeLIZJ = C194463116f.LIZJ(str, false);
                C1443030nef.LJII().LIZ(aVChallengeLIZJ);
            }
            if (C1837707Hr.LIZ() && !arrayList.isEmpty()) {
                C1443030nef.LJII().LJFF(arrayList);
                HashSet hashSet = new HashSet();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    hashSet.add(RecordScene.challenge2str((AVChallenge) it2.next()));
                }
                SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
                editorEdit.putStringSet("csi_challenge_ids", hashSet);
                C1499900p8O.LIZ(editorEdit);
            }
            String strChallenge2str = RecordScene.challenge2str(aVChallengeLIZJ);
            SharedPreferences.Editor editorEdit2 = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
            editorEdit2.putString("challenge", strChallenge2str);
            C1499900p8O.LIZ(editorEdit2);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "challenge", aVChallengeLIZJ);
            if (aVChallengeLIZJ != null && aVChallengeLIZJ.getStickerId() != null) {
                if (!C1688680u2s.LJIJ(intent)) {
                    boolean z = false;
                    C01TT.LIZLLL(new C1655450tBH(R.string.txr, context, bundle, oVar, aVChallengeLIZJ.getStickerId(), z, z));
                } else {
                    C01TT.LIZLLL(new C580450Mpf(context, bundle, oVar, aVChallengeLIZJ.getStickerId()));
                }
            } else {
                oVar.LJ(bundle);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            oVar.LIZLLL(e);
        }
        C1C7U.LIZIZ("AVToolsHelper@51fc.fetchChallengeDetail$1L");
        return null;
    }

    public static final Object call$1(ACallableS39S1300000_22 aCallableS39S1300000_22) {
        final AbstractC1432780nO8 abstractC1432780nO8 = (AbstractC1432780nO8) aCallableS39S1300000_22.l1;
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS39S1300000_22.l2;
        final String str = aCallableS39S1300000_22.s0;
        final o oVar = (o) aCallableS39S1300000_22.l3;
        C1C7U.LIZ("OriginFramesUploader@4db1.createExtractFrameTask$1L");
        abstractC1432780nO8.LJFF(new InterfaceC1432820nOC() { // from class: X.0nOH
            @Override // X.InterfaceC1432820nOC
            public final void onFinish(boolean z) {
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                AbstractC1432780nO8 abstractC1432780nO82 = abstractC1432780nO8;
                String str2 = str;
                o oVar2 = oVar;
                if (z) {
                    if ((videoPublishEditModel2 instanceof VideoPublishEditModel) && abstractC1432780nO82.LIZLLL()) {
                        videoPublishEditModel2.setExtractFramesModel(abstractC1432780nO82.LIZ);
                    }
                    C1441390nc1.LIZ(str2, "extractor_success");
                    oVar2.LIZJ(null);
                    return;
                }
                C1441390nc1.LIZ(str2, "extractor_error");
                oVar2.LIZIZ(new IllegalStateException("frame extractor fail"));
            }
        });
        C1C7U.LIZIZ("OriginFramesUploader@4db1.createExtractFrameTask$1L");
        return null;
    }

    public static final Object call$2(ACallableS39S1300000_22 aCallableS39S1300000_22) {
        NLETrack next;
        C1C7U.LIZ("AutoCutNLEModelDelegate@8393.request$2$1");
        C1419310n2P c1419310n2P = (C1419310n2P) aCallableS39S1300000_22.l1;
        String str = aCallableS39S1300000_22.s0;
        NLEModelRequestParams nLEModelRequestParams = (NLEModelRequestParams) aCallableS39S1300000_22.l2;
        c1419310n2P.getClass();
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        NLEError nLEErrorRestore = nLEEditorLIZ.restore(str);
        nLEEditorLIZ.commit();
        nLEEditorLIZ.done();
        NLEModel model = nLEEditorLIZ.getModel();
        C1419310n2P.LIZ("restoreNLEModel", model, str, nLEModelRequestParams, "", nLEErrorRestore);
        Iterator<NLETrack> it2 = model.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getTrackType() == NLETrackType.AUDIO) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null) {
            model.removeTrack(nLETrack);
        }
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        unorderedMapStrStr.putAll(((NLEModelRequestParams) aCallableS39S1300000_22.l2).LIZ());
        NLEModelRequestCallback nLEModelRequestCallback = (NLEModelRequestCallback) aCallableS39S1300000_22.l3;
        if (nLEModelRequestCallback != null) {
            nLEModelRequestCallback.onSuccess(model, unorderedMapStrStr);
        }
        C1419310n2P c1419310n2P2 = (C1419310n2P) aCallableS39S1300000_22.l1;
        String str2 = aCallableS39S1300000_22.s0;
        NLEModelRequestParams nLEModelRequestParams2 = (NLEModelRequestParams) aCallableS39S1300000_22.l2;
        c1419310n2P2.getClass();
        C1419310n2P.LIZ("callInBackground", model, str2, nLEModelRequestParams2, "", null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutNLEModelDelegate@8393.request$2$1");
        return unit;
    }

    public ACallableS39S1300000_22(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
