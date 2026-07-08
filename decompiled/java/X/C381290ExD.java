package X;

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
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS47S0000100_5;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ExD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381290ExD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C381340ExI LL;
    public final /* synthetic */ C0FQS LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C381370ExL LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC20236714Gf<Unit> LLILZLL;
    public final /* synthetic */ Function0<Long> LLIZ;
    public final /* synthetic */ C118300cf LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381290ExD(C381340ExI c381340ExI, C0FQS c0fqs, boolean z, C381370ExL c381370ExL, String str, InterfaceC20236714Gf interfaceC20236714Gf, AwS47S0000100_5 awS47S0000100_5, C118300cf c118300cf, int i) {
        super(0);
        this.LL = c381340ExI;
        this.LLILLJJLI = c0fqs;
        this.LLILLL = z;
        this.LLILZ = c381370ExL;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC20236714Gf;
        this.LLIZ = awS47S0000100_5;
        this.LLIZLLLIL = c118300cf;
        this.LLJ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        InterfaceC381510ExZ<C381480ExW, C381330ExH> interfaceC381510ExZLIZ;
        Object c098200Yq;
        C381340ExI c381340ExI = this.LL;
        NLEVideoEffect nLEVideoEffect = c381340ExI.LIZIZ;
        final String extra = c381340ExI.LIZ.getExtra("ep_magic_resource_id");
        NLESegmentEffect segment = nLEVideoEffect.getSegment();
        if (segment != null && C123100dR.LIZ(segment.getJsonParam())) {
            C0FQS c0fqs = this.LLILLJJLI;
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
        C381410ExP c381410ExP = this.LLILLJJLI.LJIJ;
        NLEEditor nLEEditor = c381410ExP != null ? c381410ExP.LIZIZ : null;
        String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.MAGIC_PROCESSOR, "", true).getPath();
        String extra2 = this.LL.LIZ.getExtra("ep_magic_effect_id");
        NLETrackSlot nLETrackSlot = this.LL.LIZ;
        C381410ExP c381410ExP2 = this.LLILLJJLI.LJIJ;
        final C381480ExW c381480ExW = new C381480ExW(nLETrackSlot, path, extra, extra2, nLEEditor, c381410ExP2 != null ? c381410ExP2.LIZJ : null, true, this.LLILLL, false, 256);
        IETTaskService iETTaskService = (IETTaskService) PluggableExtentionKt.pluggableSpi$default(IETTaskService.class, false, false, false, 14, null);
        if (iETTaskService != null && (interfaceC381510ExZLIZ = iETTaskService.LIZ()) != null) {
            C381370ExL c381370ExL = this.LLILZ;
            String str = this.LLILZIL;
            synchronized (c381370ExL.LJII) {
                try {
                    c381370ExL.LJII.put(str, interfaceC381510ExZLIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            final InterfaceC20236714Gf<Unit> interfaceC20236714Gf = this.LLILZLL;
            final C0FQS c0fqs2 = this.LLILLJJLI;
            final Function0<Long> function0 = this.LLIZ;
            final C381340ExI c381340ExI2 = this.LL;
            final C381370ExL c381370ExL2 = this.LLILZ;
            final String str2 = this.LLILZIL;
            final C118300cf c118300cf = this.LLIZLLLIL;
            final int i = this.LLJ;
            interfaceC381510ExZLIZ.LIZIZ(c381480ExW, new InterfaceC381500ExY<C381330ExH>() { // from class: X.0ExG
                public String LIZ = "";

                @Override // X.InterfaceC381500ExY
                public final void onCancel() {
                    if (!interfaceC20236714Gf.isActive()) {
                        C381370ExL c381370ExL3 = c381370ExL2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("TemplateCombineEffectTask: onCancel called for ");
                        sbLIZ.append(extra);
                        sbLIZ.append(" but continuation is not active.");
                        C381530Exb.LIZIZ(c381370ExL3, C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    C381370ExL c381370ExL4 = c381370ExL2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("TemplateCombineEffectTask: Task cancelled for ");
                    sbLIZ2.append(extra);
                    sbLIZ2.append('.');
                    C381530Exb.LIZIZ(c381370ExL4, C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC20236714Gf<Unit> interfaceC20236714Gf2 = interfaceC20236714Gf;
                    C098200Yq c098200Yq2 = new C098200Yq(new Exception("Combine effect task cancelled"));
                    C189200o6.m2constructorimpl(c098200Yq2);
                    interfaceC20236714Gf2.resumeWith(c098200Yq2);
                    C381370ExL c381370ExL5 = c381370ExL2;
                    Map<String, InterfaceC381510ExZ<C381480ExW, C381330ExH>> map = c381370ExL5.LJII;
                    String str3 = str2;
                    synchronized (map) {
                        try {
                            c381370ExL5.LJII.remove(str3);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            throw th3;
                        }
                    }
                }

                @Override // X.InterfaceC381500ExY
                public final String LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZ(String str3) {
                    this.LIZ = str3;
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZJ(C381350ExJ c381350ExJ) {
                    if (interfaceC20236714Gf.isActive()) {
                        List<C0FQP> list = c0fqs2.LJJI;
                        String str3 = extra;
                        long jLongValue = function0.invoke().longValue();
                        int i2 = c381350ExJ.LIZ;
                        String str4 = c381350ExJ.LIZIZ;
                        if (str4 == null) {
                            str4 = "";
                        }
                        ((ArrayList) list).add(new C0FQP(1, i2, jLongValue, str3, str4, c381350ExJ.LIZJ));
                        if (c118300cf.element < i) {
                            if (!C13LP.LJJJJ(c381350ExJ.LIZJ.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), C1697810uHb.LJIIJJI("no full body", "no face"))) {
                                C0FQS c0fqs3 = c0fqs2;
                                if (!c0fqs3.LJJII) {
                                    c0fqs3.LJJIII++;
                                    c118300cf.element++;
                                    C381370ExL c381370ExL3 = c381370ExL2;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("TemplateCombineEffectTask: Retrying task for ");
                                    sbLIZ.append(extra);
                                    sbLIZ.append(", attempt ");
                                    sbLIZ.append(c118300cf.element + 1);
                                    sbLIZ.append('/');
                                    sbLIZ.append(i + 1);
                                    sbLIZ.append(". Error: ");
                                    sbLIZ.append(c381350ExJ);
                                    C381530Exb.LIZIZ(c381370ExL3, C2188811AlT.LIZIZ(sbLIZ));
                                    C381370ExL.LJJIJIIJIL(c381370ExL2, c0fqs2, c381340ExI2, str2, interfaceC20236714Gf, c118300cf, i, true);
                                    return;
                                }
                            }
                        }
                        C381340ExI c381340ExI3 = c381340ExI2;
                        c381340ExI3.LIZJ = 1;
                        C383980F3s.LIZIZ(new AwS249S0300000_5(c0fqs2, (C0FQS) interfaceC20236714Gf, (InterfaceC20236714Gf<? super Unit>) c381340ExI3, (C381340ExI) 33));
                        C381370ExL c381370ExL4 = c381370ExL2;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("TemplateCombineEffectTask: Task failed for ");
                        sbLIZ2.append(extra);
                        sbLIZ2.append(" after ");
                        sbLIZ2.append(i + 1);
                        sbLIZ2.append(" attempts. Error: ");
                        sbLIZ2.append(c381350ExJ);
                        C381530Exb.LIZIZ(c381370ExL4, C2188811AlT.LIZIZ(sbLIZ2));
                        InterfaceC20236714Gf<Unit> interfaceC20236714Gf2 = interfaceC20236714Gf;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Combine effect task failed after ");
                        sbLIZ3.append(i + 1);
                        sbLIZ3.append(" attempts: ");
                        sbLIZ3.append(c381350ExJ);
                        C098200Yq c098200Yq2 = new C098200Yq(new Exception(C2188811AlT.LIZIZ(sbLIZ3)));
                        C189200o6.m2constructorimpl(c098200Yq2);
                        interfaceC20236714Gf2.resumeWith(c098200Yq2);
                        C381370ExL c381370ExL5 = c381370ExL2;
                        Map<String, InterfaceC381510ExZ<C381480ExW, C381330ExH>> map = c381370ExL5.LJII;
                        String str5 = str2;
                        synchronized (map) {
                            try {
                                c381370ExL5.LJII.remove(str5);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                throw th3;
                            }
                        }
                        return;
                    }
                    C381370ExL c381370ExL6 = c381370ExL2;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("TemplateCombineEffectTask: onFailure called for ");
                    sbLIZ4.append(extra);
                    sbLIZ4.append(" but continuation is not active.");
                    C381530Exb.LIZIZ(c381370ExL6, C2188811AlT.LIZIZ(sbLIZ4));
                }

                @Override // X.InterfaceC381500ExY
                public final void LIZLLL(C381330ExH c381330ExH) {
                    NLESegmentEffect segment2;
                    NLEResourceNode resource;
                    String resourceFile;
                    if (interfaceC20236714Gf.isActive()) {
                        ((ArrayList) c0fqs2.LJJI).add(new C0FQP(24, function0.invoke().longValue(), extra, c381330ExH.LIZIZ));
                        List<String> list = c0fqs2.LJIJI.LIZ;
                        String str3 = c381330ExH.LIZ;
                        if (str3 != null) {
                            ((ArrayList) list).add(str3);
                        }
                        C354260Dui c354260Dui = C354260Dui.LIZ;
                        NLETrackSlot nLETrackSlot2 = c381480ExW.LIZ;
                        c354260Dui.getClass();
                        NLEVideoEffect nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot2);
                        if (nLEVideoEffectLJFF != null && (segment2 = nLEVideoEffectLJFF.getSegment()) != null && (resource = segment2.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                            ((ArrayList) list).add(resourceFile);
                        }
                        C381340ExI c381340ExI3 = c381340ExI2;
                        c381340ExI3.LIZJ = 0;
                        C383980F3s.LIZIZ(new AwS249S0300000_5(c0fqs2, (C0FQS) interfaceC20236714Gf, (InterfaceC20236714Gf<? super Unit>) c381340ExI3, (C381340ExI) 34));
                        interfaceC20236714Gf.LJJIFFI(null, Unit.LIZ);
                        C381370ExL c381370ExL3 = c381370ExL2;
                        Map<String, InterfaceC381510ExZ<C381480ExW, C381330ExH>> map = c381370ExL3.LJII;
                        String str4 = str2;
                        synchronized (map) {
                            try {
                                c381370ExL3.LJII.remove(str4);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                throw th3;
                            }
                        }
                        return;
                    }
                    C381370ExL c381370ExL4 = c381370ExL2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TemplateCombineEffectTask: onSuccess called for ");
                    sbLIZ.append(extra);
                    sbLIZ.append(" but continuation is not active.");
                    C381530Exb.LIZIZ(c381370ExL4, C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.InterfaceC381500ExY
                public final void onProgress(float f) {
                    if (!c381370ExL2.LJJIIJZLJL() && interfaceC20236714Gf.isActive()) {
                        c381370ExL2.LJJIIZI(f);
                    }
                }
            });
        }
        return Unit.LIZ;
    }
}
