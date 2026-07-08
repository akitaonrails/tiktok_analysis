package X;

import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IETTaskService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS47S0000100_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ExC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381280ExC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C381300ExE LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<C381340ExI> LLILLL;
    public final /* synthetic */ Function0<Long> LLILZ;
    public final /* synthetic */ C0FQS LLILZIL;
    public final /* synthetic */ C381340ExI LLILZLL;
    public final /* synthetic */ NLETrackSlot LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381280ExC(C381300ExE c381300ExE, int i, List list, AwS47S0000100_5 awS47S0000100_5, C0FQS c0fqs, C381340ExI c381340ExI, NLETrackSlot nLETrackSlot, int i2) {
        super(0);
        this.LL = c381300ExE;
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = awS47S0000100_5;
        this.LLILZIL = c0fqs;
        this.LLILZLL = c381340ExI;
        this.LLIZ = nLETrackSlot;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Object c098200Yq;
        INLEPlayer iNLEPlayer;
        C381300ExE c381300ExE = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeSerial: index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", total=");
        sbLIZ.append(this.LLILLL.size());
        sbLIZ.append(", seekToSlot cost=");
        sbLIZ.append(this.LLILZ.invoke().longValue());
        sbLIZ.append(" currTime = ");
        C381410ExP c381410ExP = this.LLILZIL.LJIJ;
        sbLIZ.append((c381410ExP == null || (iNLEPlayer = c381410ExP.LIZJ) == null) ? null : Long.valueOf(iNLEPlayer.getCurrentPosition()));
        C381530Exb.LIZIZ(c381300ExE, C2188811AlT.LIZIZ(sbLIZ));
        final NLEVideoEffect nLEVideoEffect = this.LLILZLL.LIZIZ;
        final String extra = this.LLIZ.getExtra("ep_magic_resource_id");
        NLESegmentEffect segment = nLEVideoEffect.getSegment();
        if (segment != null && C123100dR.LIZ(segment.getJsonParam())) {
            C0FQS c0fqs = this.LLILZIL;
            try {
                JSONObject jSONObject = new JSONObject(segment.getJsonParam());
                if (jSONObject.has("editing_effect_algorithm_cache_url")) {
                    jSONObject.put("editing_effect_algorithm_cache_url", "");
                    segment.setJsonParam(C786410Ut5.J3(jSONObject));
                }
                c098200Yq = Boolean.valueOf(((ArrayList) c0fqs.LJIIZILJ).add(segment.getEffectName()));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        this.LLIZ.addVideoEffect(nLEVideoEffect);
        nLEVideoEffect.setEnable(true);
        C381410ExP c381410ExP2 = this.LLILZIL.LJIJ;
        NLEEditor nLEEditor = c381410ExP2 != null ? c381410ExP2.LIZIZ : null;
        C1524705y1.LIZJ(new AwS549S0100000_5(nLEEditor, 1563));
        String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.MAGIC_PROCESSOR, "", true).getPath();
        String extra2 = this.LLIZ.getExtra("ep_magic_effect_id");
        NLETrackSlot nLETrackSlot = this.LLIZ;
        C381410ExP c381410ExP3 = this.LLILZIL.LJIJ;
        final C381480ExW c381480ExW = new C381480ExW(nLETrackSlot, path, extra, extra2, nLEEditor, c381410ExP3 != null ? c381410ExP3.LIZJ : null, true, false, false, 384);
        C381300ExE c381300ExE2 = this.LL;
        IETTaskService iETTaskService = (IETTaskService) PluggableExtentionKt.pluggableSpi$default(IETTaskService.class, false, false, false, 14, null);
        c381300ExE2.LJIIIIZZ = iETTaskService != null ? iETTaskService.LIZ() : null;
        final C381300ExE c381300ExE3 = this.LL;
        InterfaceC381510ExZ<C381480ExW, C381330ExH> interfaceC381510ExZ = c381300ExE3.LJIIIIZZ;
        if (interfaceC381510ExZ != null) {
            final int i = this.LLILLJJLI;
            final List<C381340ExI> list = this.LLILLL;
            final Function0<Long> function0 = this.LLILZ;
            final C0FQS c0fqs2 = this.LLILZIL;
            final NLETrackSlot nLETrackSlot2 = this.LLIZ;
            final int i2 = this.LLIZLLLIL;
            final C381340ExI c381340ExI = this.LLILZLL;
            interfaceC381510ExZ.LIZIZ(c381480ExW, new InterfaceC381500ExY<C381330ExH>() { // from class: X.0ExF
                public String LIZ = "";

                @Override // X.InterfaceC381500ExY
                public final void onCancel() {
                    for (C381340ExI c381340ExI2 : C13LP.LL(list, i)) {
                        c381340ExI2.LIZ.addVideoEffect(c381340ExI2.LIZIZ);
                    }
                    C381300ExE c381300ExE4 = c381300ExE3;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("executeSerial: onCancel. index=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", total=");
                    sbLIZ2.append(list.size());
                    C381530Exb.LIZIZ(c381300ExE4, C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.InterfaceC381500ExY
                public final String LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZ(String str) {
                    this.LIZ = str;
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZJ(C381350ExJ c381350ExJ) {
                    int i3;
                    C381300ExE c381300ExE4 = c381300ExE3;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("executeSerial: onFailure error=");
                    sbLIZ2.append(c381350ExJ);
                    sbLIZ2.append(". index=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", total=");
                    sbLIZ2.append(list.size());
                    sbLIZ2.append(", cost=");
                    sbLIZ2.append(function0.invoke().longValue());
                    C381530Exb.LIZIZ(c381300ExE4, C2188811AlT.LIZIZ(sbLIZ2));
                    List<C0FQP> list2 = c0fqs2.LJJI;
                    String str = extra;
                    long jLongValue = function0.invoke().longValue();
                    int i4 = c381350ExJ.LIZ;
                    String str2 = c381350ExJ.LIZIZ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ((ArrayList) list2).add(new C0FQP(1, i4, jLongValue, str, str2, c381350ExJ.LIZJ));
                    if (c381300ExE3.LJII) {
                        i3 = 0;
                    } else {
                        i3 = 2;
                    }
                    if (i2 < i3) {
                        if (!C13LP.LJJJJ(c381350ExJ.LIZJ.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), C1697810uHb.LJIIJJI("no full body", "no face")) && !c0fqs2.LJJII) {
                            int i5 = i2 + 1;
                            C381300ExE c381300ExE5 = c381300ExE3;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("TemplateCombineEffectTask: Retrying task for ");
                            sbLIZ3.append(extra);
                            sbLIZ3.append(", attempt ");
                            sbLIZ3.append(i5);
                            sbLIZ3.append(". Error: ");
                            sbLIZ3.append(c381350ExJ);
                            C381530Exb.LIZIZ(c381300ExE5, C2188811AlT.LIZIZ(sbLIZ3));
                            c381300ExE3.LJJIJ(i, list, c0fqs2, nLETrackSlot2, c381340ExI, i5);
                            return;
                        }
                    }
                    for (C381340ExI c381340ExI2 : C13LP.LL(list, i)) {
                        c381340ExI2.LIZ.addVideoEffect(c381340ExI2.LIZIZ);
                    }
                    List listLJJJJIZL = C13LP.LJJJJIZL(c0fqs2.LJIL, i);
                    c0fqs2.LJIL = new ArrayList(listLJJJJIZL);
                    c381300ExE3.LJJIIZ(c381350ExJ);
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZLLL(C381330ExH c381330ExH) {
                    NLESegmentEffect segment2;
                    NLEResourceNode resource;
                    String resourceFile;
                    C381300ExE c381300ExE4 = c381300ExE3;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("executeSerial: onSuccess. index=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", total=");
                    sbLIZ2.append(list.size());
                    sbLIZ2.append(", cost=");
                    sbLIZ2.append(function0.invoke().longValue());
                    sbLIZ2.append(", cachePath=");
                    sbLIZ2.append(c381330ExH.LIZ);
                    sbLIZ2.append(", extraMap=");
                    sbLIZ2.append(c381330ExH.LIZIZ);
                    C381530Exb.LIZIZ(c381300ExE4, C2188811AlT.LIZIZ(sbLIZ2));
                    ((ArrayList) c0fqs2.LJJI).add(new C0FQP(24, function0.invoke().longValue(), extra, c381330ExH.LIZIZ));
                    List<String> list2 = c0fqs2.LJIJI.LIZ;
                    String str = c381330ExH.LIZ;
                    if (str != null) {
                        ((ArrayList) list2).add(str);
                    }
                    C354260Dui c354260Dui = C354260Dui.LIZ;
                    NLETrackSlot nLETrackSlot3 = c381480ExW.LIZ;
                    c354260Dui.getClass();
                    NLEVideoEffect nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot3);
                    if (nLEVideoEffectLJFF != null && (segment2 = nLEVideoEffectLJFF.getSegment()) != null && (resource = segment2.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                        ((ArrayList) list2).add(resourceFile);
                    }
                    Map<String, String> map = c381330ExH.LIZIZ;
                    if (map != null && !map.isEmpty()) {
                        Map<NLETrackSlot, Map<String, String>> map2 = c381300ExE3.LJIIIZ;
                        NLETrackSlot nLETrackSlot4 = nLETrackSlot2;
                        Map<String, String> mapLJ = c381330ExH.LIZIZ;
                        if (mapLJ == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        map2.put(nLETrackSlot4, mapLJ);
                    }
                    nLETrackSlot2.removeVideoEffect(nLEVideoEffect);
                    c381300ExE3.LJJIJIIJI(c0fqs2, i + 1, list, c381330ExH);
                }

                @Override // X.InterfaceC381500ExY
                public final void onProgress(float f) {
                    if (c381300ExE3.LJJIIJZLJL()) {
                        C381300ExE c381300ExE4 = c381300ExE3;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("executeSerial: onProgress. index=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", total=");
                        sbLIZ2.append(list.size());
                        C381530Exb.LIZIZ(c381300ExE4, C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    c381300ExE3.LJJIIZI((f + i) / list.size());
                }
            });
        }
        return Unit.LIZ;
    }
}
